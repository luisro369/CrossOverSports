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
import com.luisro00005513.crossoversports.Adapters.ManageTeamAdapter;
import com.luisro00005513.crossoversports.Entities.Team;
import com.luisro00005513.crossoversports.Entities.Tournament;
import com.luisro00005513.crossoversports.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentManageTeams extends Fragment {
    RecyclerView recyclerTeam;

    RecyclerView recyclerManageTeam;
    ArrayList manageTeamList;



    public FragmentManageTeams() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup viewGroup = (ViewGroup) inflater.inflate(R.layout.fragment_manage_teams, container, false);

        manageTeamList = new ArrayList<>();
        recyclerManageTeam = (RecyclerView) viewGroup.findViewById(R.id.manage_team_recycler);
        recyclerManageTeam.setLayoutManager(new LinearLayoutManager(getContext()));


        ManageTeamAdapter adapter = new ManageTeamAdapter(manageTeamList);
        recyclerManageTeam.setAdapter(adapter);

        return viewGroup;
    }


public interface OnFragmentInteractionListener {
    // TODO: Update argument type and name
    void onFragmentInteraction(Uri uri);
}

}
