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

import com.luisro00005513.crossoversports.Fragments.FragmentExplore.adapter.TeamsAdapter;
import com.luisro00005513.crossoversports.R;
import com.luisro00005513.crossoversports.retrofit.RetrofitServices;
import com.luisro00005513.crossoversports.retrofit.extras.TeamR;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentExploreTeams extends Fragment {

    SwipeRefreshLayout swipeRefreshLayout;
    RecyclerView recyclerView;
    public static List<TeamR> listTeamRS;

    public FragmentExploreTeams() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_explore_teams, container, false);
        //variables de views
        swipeRefreshLayout = (SwipeRefreshLayout)view.findViewById(R.id.swipe_team_explore);


        InitialView();


        return view;
    }//oncreate view

    @Override
    public void onResume() {
        super.onResume();
        if(listTeamRS != null) {
            CreandoCardViews();
        }
    }

    //============seteando xml========
    protected void InitialView(){
        //==========llamada a objeto retrofit=========
        Thread thread = new Thread(){
            public void run(){
                RetrofitServices player = new RetrofitServices();
                listTeamRS = player.getTeams();
            }//run in backgorund
        };thread.start();

        if(listTeamRS == null) {
            swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
                @Override
                public void onRefresh() {
                    //----------------llamada a views y llenarlos con lista(tienen que estar en un if)----
                    //-----aca se setean todas las views a lo que uno quiera
                    if (listTeamRS != null) {
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
        recyclerView = (RecyclerView)getView().findViewById(R.id.recycler_team_explore);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        TeamsAdapter teamsAdapter = new TeamsAdapter(getContext(), listTeamRS);//modifique esto
        recyclerView.setAdapter(teamsAdapter);
        //=========codigo para CardView de players(fin)========
    }




}
