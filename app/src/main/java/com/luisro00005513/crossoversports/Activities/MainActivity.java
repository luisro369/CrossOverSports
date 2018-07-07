package com.luisro00005513.crossoversports.Activities;

import android.arch.persistence.room.Room;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;

import com.luisro00005513.crossoversports.Activities.BottomNavHelper.BottomNavigationViewHelper;
import com.luisro00005513.crossoversports.Entities.Player;
import com.luisro00005513.crossoversports.Entities.XoverDatabase;
import com.luisro00005513.crossoversports.Fragments.FragmentHome.FavoritePlayersFragment;
import com.luisro00005513.crossoversports.Fragments.FragmentHome.FavoriteTeamFragment;
import com.luisro00005513.crossoversports.Fragments.FragmentHome.FavoriteTournamentFragment;
import com.luisro00005513.crossoversports.Fragments.FragmentCreate.FragmentoCreate;
import com.luisro00005513.crossoversports.Fragments.FragmentHome.FragmentoHome;
import com.luisro00005513.crossoversports.Fragments.FragmentExplore.FragmentoExplore;
import com.luisro00005513.crossoversports.Fragments.FagmentManage.FragmentoManage;
import com.luisro00005513.crossoversports.R;

import java.util.List;

public class MainActivity extends AppCompatActivity implements
        FragmentoHome.OnFragmentInteractionListener,
        FragmentoExplore.OnFragmentInteractionListener,
        FragmentoManage.OnFragmentInteractionListener,
        FragmentoCreate.OnFragmentInteractionListener,
        FavoriteTournamentFragment.OnFragmentInteractionListener,
        FavoritePlayersFragment.OnFragmentInteractionListener,
        FavoriteTeamFragment.OnFragmentInteractionListener
        {

    public Fragment fragmentHome = new FragmentoHome();
    public Fragment fragmentExplore = new FragmentoExplore();
    public Fragment fragmentManage = new FragmentoManage();
    public Fragment fragmentCreate = new FragmentoCreate();
    public static  XoverDatabase db;
    public static List<Player> players;
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new  BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            //aca se le dice a cada boton que fragmento abrir


            FragmentTransaction fr = getSupportFragmentManager().beginTransaction();
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    fr.replace(R.id.fragmento_padre, fragmentHome);
                    fr.addToBackStack(null);
                    fr.commit();
                    //return true;*/
                    break;
                case R.id.navigation_explore:
                    fr.replace(R.id.fragmento_padre, fragmentExplore);
                    fr.addToBackStack(null);
                    fr.commit();
                    //return true;*/
                    break;
                case R.id.navigation_manage:
                    fr.replace(R.id.fragmento_padre, fragmentManage);
                    fr.addToBackStack(null);
                    fr.commit();
                    //return true;*/
                    break;
                case R.id.navigation_create:
                    fr.replace(R.id.fragmento_padre, fragmentCreate);
                    fr.addToBackStack(null);
                    fr.commit();
                    //return true;*/
                    break;

            }
            return true;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final XoverDatabase db = Room.databaseBuilder(getApplicationContext(), XoverDatabase.class, "xover")
                .allowMainThreadQueries()
                .build();
        players= db.playerDAO().getAll();

/*
       db.playerDAO().insertAll(new Player(2,R.drawable.navas,"cristiano","cr7"
        ,"10/10/10","info extra cr7","Portugal"));
/*
        List<Player> players= db.playerDAO().getAll();
        Log.d("holaroom",players.get(0).getPlayerName());
        Log.d("holaroom",players.get(1).getPlayerName());
        */
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        BottomNavigationViewHelper.disableShiftMode(navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        if(savedInstanceState == null){
            FragmentTransaction fr = getSupportFragmentManager().beginTransaction();
            fr.replace(R.id.fragmento_padre, fragmentHome);
            fr.addToBackStack(null);
            fr.commit();
        }//le digo que fragment hacer default





    }

            @Override
            public void onFragmentInteraction(Uri uri) {

            }
        }
