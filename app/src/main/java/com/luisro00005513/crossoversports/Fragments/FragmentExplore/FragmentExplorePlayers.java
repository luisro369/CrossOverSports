package com.luisro00005513.crossoversports.Fragments.FragmentExplore;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.luisro00005513.crossoversports.Adapters.PlayerExploreAdapter;
import com.luisro00005513.crossoversports.Entities.Player;
import com.luisro00005513.crossoversports.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentExplorePlayers extends Fragment {

    RecyclerView explorePlayerRecycler;
    ArrayList<Player> explorePlayerList;


    public FragmentExplorePlayers() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View viewExplorePlayer = inflater.inflate(R.layout.fragment_explore_players, container, false);
        explorePlayerList = new ArrayList<>();
        explorePlayerRecycler = (RecyclerView) viewExplorePlayer.findViewById(R.id.recycler_explore_player);
        explorePlayerRecycler.setLayoutManager(new LinearLayoutManager(getContext()));

        FillExplorePlayerList();

        PlayerExploreAdapter adapter = new PlayerExploreAdapter(explorePlayerList);
        explorePlayerRecycler.setAdapter(adapter);

        return viewExplorePlayer;
    }

    private void FillExplorePlayerList() {
        explorePlayerList.add(new Player(1,R.drawable.ronaldo, "Cristiano Ronaldo Dos Santos Aveiro","Cristiano Ronaldo","07/02/1985",
                "Ganador de 5 balones de oro", "Portugal"));
        explorePlayerList.add(new Player(2,R.drawable.navas, "Keylor Antonio Navas Gamboa","Keylor Navas","15/10/1986",
                "Considerado uno de los mejores porteros del mundo", "Costa Rica"));
        explorePlayerList.add(new Player(3,R.drawable.messi, "Lionel Andres Messi Cuccittini","Messi","24/06/1987",
                "Ganador de 5 balones de oro", "Argentina"));
    }

}
