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
import com.luisro00005513.crossoversports.Entities.Player;
import com.luisro00005513.crossoversports.Fragments.FragmentHome.FragmentoLogin;
import com.luisro00005513.crossoversports.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentCreatePlayers extends Fragment {

    Button addPlayer;
    EditText playerName;
    EditText playerAlias;
    EditText playerBirth;
    EditText playerExtra;
    EditText playerCountry;
    public FragmentCreatePlayers() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_create_players, container, false);

        addPlayer =(Button) view.findViewById(R.id.btnCreate);
        playerAlias =(EditText) view.findViewById(R.id.player_alias);
        playerBirth =(EditText) view.findViewById(R.id.player_birth);
        playerCountry =(EditText)view.findViewById(R.id.player_country);
        playerExtra =(EditText) view.findViewById(R.id.player_extra);
        playerName =(EditText) view.findViewById(R.id.player_name);

        addPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = playerName.getText().toString();
                String alias = playerAlias.getText().toString();
                String birth = playerBirth.getText().toString();
                String extra = playerExtra.getText().toString();
                String country = playerCountry.getText().toString();
                String createdBy= FragmentoLogin.user;
                MainActivity.db.playerDAO().insertPlayer(new Player(R.drawable.navas,name,alias,
                        birth,extra,country,createdBy));
                Snackbar.make(view, "Jugador "+name+" creado exitosamente" , Snackbar.LENGTH_SHORT)
                        .show();
            }
        });
        return view;
    }




}
