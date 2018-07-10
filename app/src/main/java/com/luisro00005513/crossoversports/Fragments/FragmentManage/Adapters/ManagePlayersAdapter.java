package com.luisro00005513.crossoversports.Fragments.FragmentManage.Adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.luisro00005513.crossoversports.Entities.Player;
import com.luisro00005513.crossoversports.Entities.PlayerXTeam;
import com.luisro00005513.crossoversports.Entities.Team;
import com.luisro00005513.crossoversports.R;

import java.util.ArrayList;
import java.util.List;

public class ManagePlayersAdapter extends RecyclerView.Adapter<ManagePlayersAdapter.ViewHolderJugadores> {

    List<Player> ListaJugadores;
    ArrayList<Team> teamList;
    ArrayList<PlayerXTeam> pxtList;
    Integer team;


    public ManagePlayersAdapter(List<Player> listaJugadores, ArrayList<Team> listaEquipos, ArrayList<PlayerXTeam> pxteamlist) {
        ListaJugadores = listaJugadores;
        teamList=listaEquipos;
        pxtList=pxteamlist;
    }

    @NonNull
    @Override
    public ViewHolderJugadores onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_player, null, false);

        return new ViewHolderJugadores(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderJugadores holder, int position) {
       Long idPlayer;
       Integer idPlayerList;
        Integer teamList2;
        int listSize;
       holder.playerAvatar.setImageResource(ListaJugadores.get(position).getPlayerAvatar());
       holder.playerName.setText(ListaJugadores.get(position).getPlayerName());
       holder.playerAlias.setText(ListaJugadores.get(position).getPlayerAlias());
       holder.playerCountry.setText(ListaJugadores.get(position).getPlayerCountry());
       idPlayer=ListaJugadores.get(position).getPlayerId();
        //PlayerXTeam team= MainActivity.db.playerXTeamDAO().playerById(idPlayer);
      //  Integer teamId = team.getTeamId();
        //Team teamName = MainActivity.db.teamDAO().teamNameById(teamId);
       // String tname = teamName.getTeamName();
       // holder.playerTeam.setText(tname);
    }

    @Override
    public int getItemCount() {
        return ListaJugadores.size();
    }

    public class ViewHolderJugadores extends RecyclerView.ViewHolder {

        ImageView playerAvatar;
        TextView playerName;
        TextView playerAlias;
        TextView playerCountry;
        TextView playerTeam;


        public ViewHolderJugadores(View itemView) {
            super(itemView);
            playerAvatar=itemView.findViewById(R.id.player_image);
            playerName=itemView.findViewById(R.id.player_name);
            playerAlias=itemView.findViewById(R.id.player_knownas);
            playerCountry=itemView.findViewById(R.id.player_country);
            playerTeam=itemView.findViewById(R.id.player_team);
        }
    }
}
