package com.luisro00005513.crossoversports.Fragments.FragmentCreate;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.luisro00005513.crossoversports.Activities.MainActivity;
import com.luisro00005513.crossoversports.Entities.Tournament;
import com.luisro00005513.crossoversports.Fragments.FragmentHome.FragmentoLogin;
import com.luisro00005513.crossoversports.R;


public class FragmentCreateTournaments extends Fragment {

    Button addTournament;
    EditText tournamentName;
    EditText tournamentCountry;
    EditText tournamentImage;
    public FragmentCreateTournaments() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_create_tournaments, container, false);
        addTournament=view.findViewById(R.id.create_tournament);
        tournamentName=view.findViewById(R.id.create_tournament_name);
        tournamentCountry=view.findViewById(R.id.create_tournament_country);
        tournamentImage=view.findViewById(R.id.create_tournament_ImageLink);

        addTournament.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = tournamentName.getText().toString();
                String country = tournamentCountry.getText().toString();
                String image = tournamentImage.getText().toString();
                String createdBy= FragmentoLogin.user;
                MainActivity.db.tournamentrDAO().insertTournament(new Tournament(name,country,R.drawable.trophy
                        ,createdBy));
                Snackbar.make(view, "Equipo "+name+" creado exitosamente por"+createdBy , Snackbar.LENGTH_SHORT)
                        .show();
            }
        });
        return view;
    }



    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
