package com.luisro00005513.crossoversports.Fragments.FragmentHome;


import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.luisro00005513.crossoversports.Adapters.TeamAdapter;
import com.luisro00005513.crossoversports.Entities.Team;
import com.luisro00005513.crossoversports.R;

import java.util.ArrayList;

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

        teamListRec = new ArrayList<>();
        recyclerTeam = (RecyclerView) viewGroup.findViewById(R.id.team_recycler);
        recyclerTeam.setLayoutManager(new LinearLayoutManager(getContext()));

        FillTeamList();

        TeamAdapter adapter = new TeamAdapter(teamListRec);
        recyclerTeam.setAdapter(adapter);

        return viewGroup;
    }

    private void FillTeamList() {
        teamListRec.add(new Team(1, "Real Madrid C.F.", "Spain", R.drawable.real_madrid,
                "La Liga", "Madrid"));
        teamListRec.add(new Team(2,"F.C. Barcelona", "Spain", R.drawable.barcelona,"" +
                "La Liga", "Barcelona"));
    }


    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

}
