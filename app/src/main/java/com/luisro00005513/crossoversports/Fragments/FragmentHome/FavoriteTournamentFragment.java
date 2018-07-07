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
import com.luisro00005513.crossoversports.Adapters.TournamentAdapter;
import com.luisro00005513.crossoversports.Entities.Tournament;
import com.luisro00005513.crossoversports.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class FavoriteTournamentFragment extends Fragment {

    RecyclerView recyclerTournament;
    ArrayList tournamentList;


    public FavoriteTournamentFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup viewGroup = (ViewGroup) inflater.inflate(R.layout.fragment_favorite_tournament, container, false);

        tournamentList = new ArrayList<>();
        recyclerTournament = (RecyclerView) viewGroup.findViewById(R.id.tournament_recycler);
        recyclerTournament.setLayoutManager(new LinearLayoutManager(getContext()));

        FillTournamentList();

        TournamentAdapter adapter = new TournamentAdapter(tournamentList);
        recyclerTournament.setAdapter(adapter);

        return viewGroup;

    }

    private void FillTournamentList() {
        tournamentList.add(new Tournament(1, "La Liga", "Spain", R.drawable.la_liga));
        tournamentList.add(new Tournament(2, "Premier League", "England", R.drawable.premier));
        tournamentList.add(new Tournament(3, "Bundesliga", "Germany", R.drawable.bundesliga));

    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

}
