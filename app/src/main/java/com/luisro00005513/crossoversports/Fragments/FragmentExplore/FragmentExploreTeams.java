package com.luisro00005513.crossoversports.Fragments.FragmentExplore;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.luisro00005513.crossoversports.Adapters.TeamExploreAdapter;
import com.luisro00005513.crossoversports.Entities.Team;
import com.luisro00005513.crossoversports.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentExploreTeams extends Fragment {

    RecyclerView recyclerExploreTeam;
    ArrayList<Team> teamExploreList;

    public FragmentExploreTeams() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View viewExploreTeam = inflater.inflate(R.layout.fragment_explore_teams, container, false);
        teamExploreList = new ArrayList<>();
        recyclerExploreTeam = (RecyclerView) viewExploreTeam.findViewById(R.id.recycler_explore_team);
        recyclerExploreTeam.setLayoutManager(new LinearLayoutManager(getContext()));


        TeamExploreAdapter adapter = new TeamExploreAdapter(teamExploreList);
        recyclerExploreTeam.setAdapter(adapter);

        return viewExploreTeam;
    }

}
