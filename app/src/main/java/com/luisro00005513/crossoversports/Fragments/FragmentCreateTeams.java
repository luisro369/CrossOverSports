package com.luisro00005513.crossoversports.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.luisro00005513.crossoversports.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentCreateTeams extends Fragment {


    public FragmentCreateTeams() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_create_teams, container, false);
    }

}
