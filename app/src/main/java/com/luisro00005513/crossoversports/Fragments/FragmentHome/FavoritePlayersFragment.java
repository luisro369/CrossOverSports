package com.luisro00005513.crossoversports.Fragments.FragmentHome;


import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.luisro00005513.crossoversports.Entities.Match;
import com.luisro00005513.crossoversports.R;
import com.luisro00005513.crossoversports.retrofit.RetrofitServices;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class FavoritePlayersFragment extends Fragment {


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
        Toast.makeText(getContext(),listMatches.get(0).getMatchId(),Toast.LENGTH_SHORT).show();

        return viewGroup;
    }


    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

}
