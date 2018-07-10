package com.luisro00005513.crossoversports.Fragments.FragmentHome;


import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.luisro00005513.crossoversports.Activities.MainActivity;
import com.luisro00005513.crossoversports.Adapters.TeamAdapter;
import com.luisro00005513.crossoversports.Adapters.TournamentAdapter;
import com.luisro00005513.crossoversports.Entities.Tournament;
import com.luisro00005513.crossoversports.Entities.TournamentFavoritoXUsuario;
import com.luisro00005513.crossoversports.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class FavoriteTournamentFragment extends Fragment {

    RecyclerView recyclerTournament;

    List<Tournament> teamList;
    public FavoriteTournamentFragment() {
        List<Tournament> teamList;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_favorite_tournament, container, false);

        String byUser = FragmentoLogin.user;
        List<Tournament> teamList2 = MainActivity.db.tournamentrDAO().getAll();

        List<Tournament> teamList = MainActivity.db.tournamentFavoritoXUsuarioDAO().tounamentfav(byUser);
        recyclerTournament = (RecyclerView) view.findViewById(R.id.tournament_recycler);
        recyclerTournament.setLayoutManager(new LinearLayoutManager(getContext()));


        TournamentAdapter adapter = new TournamentAdapter(teamList2);
        recyclerTournament.setAdapter(adapter);



        return view;

    }


    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

}
