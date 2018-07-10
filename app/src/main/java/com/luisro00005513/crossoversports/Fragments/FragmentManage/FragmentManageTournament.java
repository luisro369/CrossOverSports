package com.luisro00005513.crossoversports.Fragments.FragmentManage;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.luisro00005513.crossoversports.Activities.MainActivity;
import com.luisro00005513.crossoversports.Adapters.ManageTeamAdapter;
import com.luisro00005513.crossoversports.Adapters.ManageTournamentAdapter;
import com.luisro00005513.crossoversports.Entities.Tournament;
import com.luisro00005513.crossoversports.Fragments.FragmentHome.FragmentoLogin;
import com.luisro00005513.crossoversports.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentManageTournament extends Fragment {

    RecyclerView recyclerManageTournament;


    public FragmentManageTournament() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        ViewGroup viewGroup = (ViewGroup) inflater.inflate(R.layout.fragment_manage_tournament, container, false);
        String byUser = FragmentoLogin.user;
        List<Tournament> manageTournamentList = MainActivity.db.tournamentrDAO().tournamentByCreator(byUser);
        recyclerManageTournament=(RecyclerView) viewGroup.findViewById(R.id.manage_tournament_recycler);
        recyclerManageTournament.setLayoutManager(new LinearLayoutManager(getContext()));


        ManageTournamentAdapter adapter = new ManageTournamentAdapter(manageTournamentList);
        recyclerManageTournament.setAdapter(adapter);

        return viewGroup;
    }

}
