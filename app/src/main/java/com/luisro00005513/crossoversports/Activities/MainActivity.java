package com.luisro00005513.crossoversports.Activities;

import android.support.v4.app.FragmentTransaction;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import com.luisro00005513.crossoversports.Fragments.FragmentoMenu;
import com.luisro00005513.crossoversports.Fragments.FragmentoTeams;
import com.luisro00005513.crossoversports.Fragments.FragmentoTournaments;
import com.luisro00005513.crossoversports.R;

public class MainActivity extends AppCompatActivity implements
        FragmentoMenu.OnFragmentInteractionListener,
        FragmentoTeams.OnFragmentInteractionListener,
        FragmentoTournaments.OnFragmentInteractionListener
        {


    //android.support.v4.app.FragmentTransaction fr = getSupportFragmentManager().beginTransaction();


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            //aca se le dice a cada boton que fragmento abrir
            FragmentTransaction fr = getSupportFragmentManager().beginTransaction();
            switch (item.getItemId()) {
                case R.id.navigation_menu:
                    fr.replace(R.id.fragmento_padre, new FragmentoMenu());
                    fr.commit();
                    return true;
                case R.id.navigation_teams:
                    fr.replace(R.id.fragmento_padre, new FragmentoTeams());
                    fr.commit();
                    return true;
                case R.id.navigation_tournaments:
                    fr.replace(R.id.fragmento_padre, new FragmentoTournaments());
                    fr.commit();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);





    }

            @Override
            public void onFragmentInteraction(Uri uri) {

            }
        }
