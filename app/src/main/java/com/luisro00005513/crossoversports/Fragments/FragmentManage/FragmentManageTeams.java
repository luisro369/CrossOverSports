package com.luisro00005513.crossoversports.Fragments.FragmentManage;


import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.luisro00005513.crossoversports.Activities.MainActivity;
import com.luisro00005513.crossoversports.Adapters.TeamAdapter;
import com.luisro00005513.crossoversports.Entities.Team;
import com.luisro00005513.crossoversports.Fragments.FragmentHome.FragmentoLogin;
import com.luisro00005513.crossoversports.R;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentManageTeams extends Fragment {
    RecyclerView recyclerTeam;


    public FragmentManageTeams() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_favorite_team, container, false);

        //BUSQUEDA POR CREADOR
        String byCreator = FragmentoLogin.user;
        List<Team> teamList = MainActivity.db.teamDAO().teamByCreator(byCreator);

        recyclerTeam = (RecyclerView) view.findViewById(R.id.team_recycler);
        recyclerTeam.setLayoutManager(new LinearLayoutManager(getContext()));

        TeamAdapter adapter = new TeamAdapter(teamList);
        recyclerTeam.setAdapter(adapter);


        return  view;

    }
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
