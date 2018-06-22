package com.luisro00005513.crossoversports.Activities;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.Toast;

import com.luisro00005513.crossoversports.Fragments.FavoritePlayersFragment;
import com.luisro00005513.crossoversports.Fragments.FavoriteTeamFragment;
import com.luisro00005513.crossoversports.Fragments.FavoriteTournamentFragment;
import com.luisro00005513.crossoversports.Fragments.FragmentCreate;
import com.luisro00005513.crossoversports.Fragments.FragmentoHome;
import com.luisro00005513.crossoversports.Fragments.FragmentoExplore;
import com.luisro00005513.crossoversports.Fragments.FragmentoManage;
import com.luisro00005513.crossoversports.R;

public class MainActivity extends AppCompatActivity implements
        FragmentoHome.OnFragmentInteractionListener,
        FragmentoExplore.OnFragmentInteractionListener,
        FragmentoManage.OnFragmentInteractionListener,
        FragmentCreate.OnFragmentInteractionListener,
        FavoriteTournamentFragment.OnFragmentInteractionListener,
        FavoritePlayersFragment.OnFragmentInteractionListener,
        FavoriteTeamFragment.OnFragmentInteractionListener
        {




    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new  BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            //aca se le dice a cada boton que fragmento abrir
            Fragment fragmentHome = new FragmentoHome();
            Fragment fragmentTeams = new FragmentoExplore();
            Fragment fragmentTournaments = new FragmentoManage();
            FragmentTransaction fr = getSupportFragmentManager().beginTransaction();
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    fr.replace(R.id.fragmento_padre, fragmentHome);
                    fr.addToBackStack(null);
                    fr.commit();
                    //return true;
                    break;
                case R.id.navigation_explore:
                    fr.replace(R.id.fragmento_padre, fragmentTeams);
                    fr.addToBackStack(null);
                    fr.commit();
                    Toast.makeText(MainActivity.this, "entre!!!", Toast.LENGTH_SHORT).show();
                    //return true;
                    break;
                case R.id.navigation_manage:
                    fr.replace(R.id.fragmento_padre, fragmentTournaments);
                    fr.addToBackStack(null);
                    fr.commit();
                    //return true;
                    break;
                case R.id.navigation_create:
                    fr.replace(R.id.fragmento_padre, fragmentTournaments);
                    fr.addToBackStack(null);
                    fr.commit();
                    //return true;
                    break;

            }
            return true;
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
