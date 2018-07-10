package com.luisro00005513.crossoversports.Fragments.FragmentHome;


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
import com.luisro00005513.crossoversports.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class FavoriteTeamFragment extends Fragment {

    RecyclerView recyclerTeam;
    ArrayList teamListRec;


    public FavoriteTeamFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup viewGroup = (ViewGroup) inflater.inflate(R.layout.fragment_favorite_team, container, false);

        List<Team> teamList = MainActivity.db.teamDAO().getAll();
        recyclerTeam = (RecyclerView) viewGroup.findViewById(R.id.team_recycler);
        recyclerTeam.setLayoutManager(new LinearLayoutManager(getContext()));

        TeamAdapter adapter = new TeamAdapter(teamList);
        recyclerTeam.setAdapter(adapter);

        return viewGroup;
    }


    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

}
