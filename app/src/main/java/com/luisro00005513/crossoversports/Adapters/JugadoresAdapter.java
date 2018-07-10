package com.luisro00005513.crossoversports.Adapters;

import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.luisro00005513.crossoversports.Activities.MainActivity;
import com.luisro00005513.crossoversports.Entities.FavoritoXUsuario;
import com.luisro00005513.crossoversports.Entities.Player;
import com.luisro00005513.crossoversports.Entities.PlayerXTeam;
import com.luisro00005513.crossoversports.Entities.Team;
import com.luisro00005513.crossoversports.Fragments.FragmentHome.FragmentoLogin;
import com.luisro00005513.crossoversports.R;

import java.util.ArrayList;
import java.util.List;

public class JugadoresAdapter extends RecyclerView.Adapter<JugadoresAdapter.ViewHolderJugadores> {

    List<Player> ListaJugadores;
    ArrayList<Team> teamList;
    ArrayList<PlayerXTeam> pxtList;
    Integer team;
    public static boolean flag=true;



    public JugadoresAdapter(List<Player> listaJugadores, ArrayList<Team> listaEquipos, ArrayList<PlayerXTeam> pxteamlist) {
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
    public void onBindViewHolder(@NonNull final ViewHolderJugadores holder,final int position) {
       Long idPlayer;
       holder.playerAvatar.setImageResource(ListaJugadores.get(position).getPlayerAvatar());
       holder.playerName.setText(ListaJugadores.get(position).getPlayerName());
       holder.playerAlias.setText(ListaJugadores.get(position).getPlayerAlias());
       holder.playerCountry.setText(ListaJugadores.get(position).getPlayerCountry());
       idPlayer=ListaJugadores.get(position).getPlayerId();
        //PlayerXTeamR team= MainActivity.db.playerXTeamDAO().playerById(idPlayer);
      //  Integer teamId = team.getTeamId();
        //TeamR teamName = MainActivity.db.teamDAO().teamNameById(teamId);
       // String tname = teamName.getTeamName();
       // holder.playerTeam.setText(tname);
        if(MainActivity.db.favoritoXUsuarioDAO().finById(idPlayer)!=null){
            flag = true;
            holder.playerFavorite.setImageResource(R.drawable.ic_favorite_true);
        }else{
            flag=false;
        }
        holder.playerFavorite.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(flag) {
                    Long playerId = ListaJugadores.get(position).getPlayerId();
                    String playerName = ListaJugadores.get(position).getPlayerName();
                    String userName = FragmentoLogin.user;
                    MainActivity.db.favoritoXUsuarioDAO().deleteFavorite(playerId);
                    Snackbar.make(view, playerName + " eliminado de favoritos", Snackbar.LENGTH_LONG).show();
                    holder.playerFavorite.setImageResource(R.drawable.ic_star_border_black_24dp);
                }
                else{flag=true;

                    Long playerId = ListaJugadores.get(position).getPlayerId();
                    String playerName = ListaJugadores.get(position).getPlayerName();
                    String userName = FragmentoLogin.user;
                    MainActivity.db.favoritoXUsuarioDAO().inserFav(new FavoritoXUsuario(userName, playerId));
                    Snackbar.make(view, playerName + " Añadido a favoritos", Snackbar.LENGTH_LONG).show();
                    holder.playerFavorite.setImageResource(R.drawable.ic_star_border_black_24dp);

                }
            }
        });
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
        ImageView playerFavorite;


        public ViewHolderJugadores(View itemView) {
            super(itemView);
            playerAvatar=itemView.findViewById(R.id.player_image);
            playerName=itemView.findViewById(R.id.player_name);
            playerAlias=itemView.findViewById(R.id.player_knownas);
            playerCountry=itemView.findViewById(R.id.player_country);
            playerTeam=itemView.findViewById(R.id.player_team);
            playerFavorite=itemView.findViewById(R.id.favplayer);

        }
    }
}
