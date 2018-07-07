package com.luisro00005513.crossoversports.Fragments.FragmentHome;


import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.luisro00005513.crossoversports.Entities.Match;
import com.luisro00005513.crossoversports.Entities.Player;
import com.luisro00005513.crossoversports.Entities.Team;
import com.luisro00005513.crossoversports.Entities.Tournament;
import com.luisro00005513.crossoversports.R;
import com.luisro00005513.crossoversports.retrofit.RetrofitServices;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class FavoritePlayersFragment extends Fragment {

    TextView borrame;

    public FavoritePlayersFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup viewGroup = (ViewGroup) inflater.inflate(R.layout.fragment_favorite_players, container, false);
        borrame = (TextView)viewGroup.findViewById(R.id.borrame);
        /*//==========llamada de matches=================
        RetrofitServices match = new RetrofitServices();
        ArrayList<Match> listMatches = match.getMatches();
        if(listMatches.size() > 1 ) {
            Toast.makeText(getParentFragment().getContext(),"matchId: "+listMatches.get(0).getMatchId(),Toast.LENGTH_LONG).show();
            Toast.makeText(getParentFragment().getContext(),"Team 1 Goals: "+listMatches.get(0).getTeam1Goals(),Toast.LENGTH_LONG).show();
            Toast.makeText(getParentFragment().getContext(),"Team 2 Goals: "+listMatches.get(0).getTeam2Goals(),Toast.LENGTH_LONG).show();

        }
        else{
            Toast.makeText(getParentFragment().getContext(),"arreglo nulo",Toast.LENGTH_LONG).show();
        }

        //==========llamada de player=================
        RetrofitServices player = new RetrofitServices();
        ArrayList<Player> listPlayers = player.getPlayers();
        if(listPlayers.size() > 1 ) {
            Toast.makeText(getParentFragment().getContext(),"player 1 name: "+listPlayers.get(0).getPlayerName(),Toast.LENGTH_LONG).show();
            Toast.makeText(getParentFragment().getContext(),"player 2 name: "+listPlayers.get(1).getPlayerName(),Toast.LENGTH_LONG).show();

        }
        else{
            Toast.makeText(getParentFragment().getContext(),"arreglo nulo",Toast.LENGTH_LONG).show();
        }
        //==========llamada de torneos=================
        RetrofitServices torneo = new RetrofitServices();
        ArrayList<Tournament> listTorneo = torneo.getTournaments();
        if(listTorneo.size() > 1 ) {
            Toast.makeText(getParentFragment().getContext(),"tournament 1 country: "+listTorneo.get(0).getTournamentCountry(),Toast.LENGTH_LONG).show();
            Toast.makeText(getParentFragment().getContext(),"tournament 2 country: "+listTorneo.get(1).getTournamentCountry(),Toast.LENGTH_LONG).show();
            borrame.setText(listTorneo.get(0).getTournamentCountry());

        }
        else{
            Toast.makeText(getParentFragment().getContext(),"arreglo nulo",Toast.LENGTH_LONG).show();
        }

        //==========llamada de equipos=================
        RetrofitServices teams = new RetrofitServices();
        ArrayList<Team> listTeams = teams.getTeams();
        if(listTeams.size() > 1 ) {
            Toast.makeText(getParentFragment().getContext(),"equipo 1: "+listTeams.get(0).getTeamName(),Toast.LENGTH_LONG).show();
            Toast.makeText(getParentFragment().getContext(),"equipo 2: "+listTeams.get(1).getTeamName(),Toast.LENGTH_LONG).show();
            borrame.setText(listTeams.get(0).getTeamName());

        }
        else{
            Toast.makeText(getParentFragment().getContext(),"arreglo nulo",Toast.LENGTH_LONG).show();
        }
        */
        //==========llamada de equipos=================
        RetrofitServices teams = new RetrofitServices();
        ArrayList<Team> listTeams = teams.getTeams();
        if(listTeams.size() > 1 ) {
            Toast.makeText(getParentFragment().getContext(),"equipo 1: "+listTeams.get(0).getTeamName(),Toast.LENGTH_LONG).show();
            Toast.makeText(getParentFragment().getContext(),"equipo 2: "+listTeams.get(1).getTeamName(),Toast.LENGTH_LONG).show();
            borrame.setText(listTeams.get(0).getTeamName());

        }
        else{
            Toast.makeText(getParentFragment().getContext(),"arreglo nulo",Toast.LENGTH_LONG).show();
        }






        return viewGroup;
    }//on create view


    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

}
