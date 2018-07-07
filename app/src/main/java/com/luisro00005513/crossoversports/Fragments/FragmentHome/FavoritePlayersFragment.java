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
        return viewGroup;
    }


    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

}
