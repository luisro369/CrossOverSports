package com.luisro00005513.crossoversports.Adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
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

public class JugadoresAdapter extends RecyclerView.Adapter<JugadoresAdapter.ViewHolderJugadores> {

    ArrayList<Player> ListaJugadores;
    ArrayList<Team> teamList;
    ArrayList<PlayerXTeam> pxtList;
    Integer team;


    public JugadoresAdapter(List<Player> listaJugadores, ArrayList<Team> listaEquipos, ArrayList<PlayerXTeam> pxteamlist) {
        ListaJugadores = (ArrayList<Player>) listaJugadores;
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
       Integer idPlayer;
       Integer idPlayerList;
        Integer teamList2;
        int listSize;
       holder.playerAvatar.setImageResource(ListaJugadores.get(position).getPlayerAvatar());
       holder.playerName.setText(ListaJugadores.get(position).getPlayerName());
       holder.playerAlias.setText(ListaJugadores.get(position).getPlayerAlias());
       holder.playerCountry.setText(ListaJugadores.get(position).getPlayerCountry());
       idPlayer=ListaJugadores.get(position).getPlayerId();
       listSize=pxtList.size();
       for(int i=0;i<listSize;i++){
           idPlayerList=pxtList.get(i).getPlayerId();
           if(idPlayer==idPlayerList){
               team=pxtList.get(i).getTeamId();
           }
       }
        for(int i=0;i<teamList.size();i++){
            teamList2=teamList.get(i).getTeamId();
            if(team==teamList2){
                holder.playerTeam.setText((teamList.get(i).getTeamName()));
                Log.d("hola",teamList.get(i).getTeamName());
            }
        }
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
