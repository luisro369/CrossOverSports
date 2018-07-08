package com.luisro00005513.crossoversports.Fragments.FragmentExplore;


import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.luisro00005513.crossoversports.Fragments.FragmentExplore.adapter.PlayersAdapter;
import com.luisro00005513.crossoversports.R;
import com.luisro00005513.crossoversports.retrofit.RetrofitServices;
import com.luisro00005513.crossoversports.retrofit.extras.Player;

import java.util.List;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentExplorePlayers extends Fragment {

    SwipeRefreshLayout swipeRefreshLayout;
    RecyclerView recyclerView;
    public static List<Player> listPlayers;


    public FragmentExplorePlayers() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_explore_players, container, false);
        //variables de views
        swipeRefreshLayout = (SwipeRefreshLayout)view.findViewById(R.id.swipe_player_explore);



        InitialView();

        return view;
    }//on createview

    @Override
    public void onResume() {
        super.onResume();
        if(listPlayers != null) {
            CreandoCardViews();
        }
    }

    //============seteando xml========
    protected void InitialView(){
        //==========llamada a objeto retrofit=========
        Thread thread = new Thread(){
            public void run(){
                RetrofitServices player = new RetrofitServices();
                listPlayers = player.getPlayers();
            }//run in backgorund
        };thread.start();

        if(listPlayers == null) {
            swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
                @Override
                public void onRefresh() {
                    //----------------llamada a views y llenarlos con lista(tienen que estar en un if)----
                    //-----aca se setean todas las views a lo que uno quiera
                    if (listPlayers != null) {
                        CreandoCardViews();
                    }
                    //------------------------------------------------
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            swipeRefreshLayout.setRefreshing(false);
                        }
                    }, 400);
                }
            });
        }//si la lista esta null refresca

        else{
        }

    }//initialview


    private void CreandoCardViews(){
        //=========codigo para CardView de players=============
        recyclerView = (RecyclerView)getView().findViewById(R.id.recycler_explore_players);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        PlayersAdapter playersAdapter = new PlayersAdapter(getContext(),listPlayers);//modifique esto
        recyclerView.setAdapter(playersAdapter);
        //=========codigo para CardView de players(fin)========
    }




}
