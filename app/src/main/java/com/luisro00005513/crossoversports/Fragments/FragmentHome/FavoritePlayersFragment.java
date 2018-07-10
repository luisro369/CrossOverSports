package com.luisro00005513.crossoversports.Fragments.FragmentHome;


import android.content.Context;
import android.arch.persistence.room.Room;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.luisro00005513.crossoversports.Activities.MainActivity;
import com.luisro00005513.crossoversports.Adapters.JugadoresAdapter;
import com.luisro00005513.crossoversports.Entities.*;
import com.luisro00005513.crossoversports.R;
import com.luisro00005513.crossoversports.retrofit.RetrofitServices;
import com.luisro00005513.crossoversports.retrofit.extras.Tournament;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class FavoritePlayersFragment extends Fragment {

    RecyclerView recyclerPlayer;
    ArrayList<Player> playerList;
    ArrayList<Team> teamList;
    ArrayList<PlayerXTeam> pxtList;
    public FavoritePlayersFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View viewPlayer=inflater.inflate(R.layout.fragment_favorite_players,container,false);
      //  List<Player> playersList = MainActivity.db.playerDAO().getAll();

        //BUSQUEDA POR CREADOR
        /*String byCreator = FragmentoLogin.user;
       List<Player> playersList = MainActivity.db.playerDAO().playerByCreator(byCreator);*/

        //BUSQUEDA POR FAVORITO
        String byUser = FragmentoLogin.user;
        List<Player> playersList = MainActivity.db.favoritoXUsuarioDAO().favoriteByUser(byUser);


        teamList= new ArrayList<>();
         pxtList= new ArrayList<>();
        recyclerPlayer= (RecyclerView) viewPlayer.findViewById(R.id.recycler_players);
        recyclerPlayer.setLayoutManager(new LinearLayoutManager(getContext()));

       // FillPlayerList();
       // Log.d("fragmentplayer");
//        Log.d("porfavor",MainActivity.players.get(0).getPlayerName());
        JugadoresAdapter adapter = new JugadoresAdapter(playersList,teamList,pxtList);
        recyclerPlayer.setAdapter(adapter);

        return viewPlayer;
    }

    private void FillPlayerList() {
      /*  playerList.add(new Player(1,R.drawable.ronaldo, "Cristiano Ronaldo Dos Santos Aveiro","Cristiano Ronaldo","07/02/1985",
                "Ganador de 5 balones de oro", "Portugal"));
        playerList.add(new Player(2,R.drawable.navas, "Keylor Antonio Navas Gamboa","Keylor Navas","15/10/1986",
                "Considerado uno de los mejores porteros del mundo", "Costa Rica"));
        playerList.add(new Player(3,R.drawable.messi, "Lionel Andres Messi Cuccittini","Messi","24/06/1987",
                "Ganador de 5 balones de oro", "Argentina"));
        teamList.add(new Team(1,"Real Madrid","Spain",R.drawable.ronaldo,"LaLiga", "Madrid"));

        teamList.add(new Team(2,"Barcelona F.C.","Spain",R.drawable.ronaldo,"LaLiga", "Barcelona"));

        pxtList.add(new PlayerXTeam(1,"Delantero",1,1,"2","2","0","0","0"));
        pxtList.add(new PlayerXTeam(2,"Portero",2,1,"2","2","siempre","0","0"));
        pxtList.add(new PlayerXTeam(3,"Delantero",3,2,"2","2","0","0","0"));
*/

    }


    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }





}
