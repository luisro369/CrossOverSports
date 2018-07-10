package com.luisro00005513.crossoversports.Fragments.FragmentCreate;


import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.luisro00005513.crossoversports.Activities.MainActivity;
import com.luisro00005513.crossoversports.Entities.Team;
import com.luisro00005513.crossoversports.Fragments.FragmentHome.FragmentoLogin;
import com.luisro00005513.crossoversports.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentCreateTeams extends Fragment {

    Button addTeam;
    EditText teamName;
    EditText teamCountry;
    EditText teamAvatar;
    EditText teamDivision;
    EditText teamCity;
    public FragmentCreateTeams() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_create_teams, container, false);
       // inflater.inflate(R.layout.fragment_create_players, container, false);

        addTeam =(Button) view.findViewById(R.id.btnCreateTeam);
        teamName =(EditText) view.findViewById(R.id.team_name);
        teamCountry =(EditText) view.findViewById(R.id.team_country);
        teamAvatar =(EditText)view.findViewById(R.id.team_avatar);
        teamDivision =(EditText) view.findViewById(R.id.team_division);
        teamCity =(EditText) view.findViewById(R.id.team_city);

        addTeam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = teamName.getText().toString();
                String country = teamCountry.getText().toString();
                String division = teamDivision.getText().toString();
                String city = teamCity.getText().toString();
                String createdBy= FragmentoLogin.user;
                MainActivity.db.teamDAO().insertAll(new Team(name,country,R.drawable.ic_team_default,division,city,createdBy));
                Snackbar.make(view, "Equipo "+name+" creado exitosamente" , Snackbar.LENGTH_SHORT)
                        .show();
            }
        });
        return view;
    }

}
