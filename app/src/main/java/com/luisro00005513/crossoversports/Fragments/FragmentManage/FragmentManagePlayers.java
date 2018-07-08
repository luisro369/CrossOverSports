package com.luisro00005513.crossoversports.Fragments.FragmentManage;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.luisro00005513.crossoversports.Activities.MainActivity;
import com.luisro00005513.crossoversports.Adapters.JugadoresAdapter;
import com.luisro00005513.crossoversports.Entities.Player;
import com.luisro00005513.crossoversports.Entities.PlayerXTeam;
import com.luisro00005513.crossoversports.Entities.Team;
import com.luisro00005513.crossoversports.Fragments.FragmentHome.FragmentoLogin;
import com.luisro00005513.crossoversports.R;

import java.util.ArrayList;
import java.util.List;

public class FragmentManagePlayers extends Fragment {
    RecyclerView recyclerPlayer;
    ArrayList<Team> teamList;
    ArrayList<PlayerXTeam> pxtList;

    public FragmentManagePlayers() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View viewPlayer= inflater.inflate(R.layout.fragment_manage_players, container, false);
        //  List<Player> playersList = MainActivity.db.playerDAO().getAll();

        //BUSQUEDA POR CREADOR
        String byCreator = FragmentoLogin.user;
       List<Player> playersList = MainActivity.db.playerDAO().playerByCreator(byCreator);

        //BUSQUEDA POR FAVORITO
      //  String byUser = FragmentoLogin.user;
        //List<Player> playersList = MainActivity.db.favoritoXUsuarioDAO().favoriteByUser(byUser);

        recyclerPlayer= (RecyclerView) viewPlayer.findViewById(R.id.recycler_players);
        recyclerPlayer.setLayoutManager(new LinearLayoutManager(getContext()));

        // FillPlayerList();
        // Log.d("fragmentplayer");
//        Log.d("porfavor",MainActivity.players.get(0).getPlayerName());
        JugadoresAdapter adapter = new JugadoresAdapter(playersList,teamList,pxtList);
        recyclerPlayer.setAdapter(adapter);

        return viewPlayer;
    }

    public interface OnFragmentInteractionListener {
        void onFragmentInteraction(Uri uri);
    }
}
