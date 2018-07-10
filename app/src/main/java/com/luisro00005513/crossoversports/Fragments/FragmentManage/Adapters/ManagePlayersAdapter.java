package com.luisro00005513.crossoversports.Fragments.FragmentManage.Adapters;

import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
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

public class ManagePlayersAdapter extends RecyclerView.Adapter<ManagePlayersAdapter.ViewHolderJugadores> {

    List<Player> ListaJugadores;
    ArrayList<Team> teamList;
    ArrayList<PlayerXTeam> pxtList;
    Integer team;
    public  static boolean flag;

    public ManagePlayersAdapter(List<Player> listaJugadores, ArrayList<Team> listaEquipos, ArrayList<PlayerXTeam> pxteamlist) {
        ListaJugadores = listaJugadores;
        teamList=listaEquipos;
        pxtList=pxteamlist;
    }

    @NonNull
    @Override
    public ViewHolderJugadores onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_manage_player, null, false);


        return new ViewHolderJugadores(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolderJugadores holder, final int position) {
       final Long idPlayer;
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
           flag = false;
           holder.playerFavorite.setImageResource(R.drawable.ic_favorite_true);
       }

       holder.playerFavorite.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               if(flag) {
                   flag=false;
                   Long playerId = ListaJugadores.get(position).getPlayerId();
                   String playerName = ListaJugadores.get(position).getPlayerName();
                   String userName = FragmentoLogin.user;
                   MainActivity.db.favoritoXUsuarioDAO().inserFav(new FavoritoXUsuario(userName, playerId));
                   Snackbar.make(view, playerName + " Añadido a favoritos", Snackbar.LENGTH_LONG).show();
                   holder.playerFavorite.setImageResource(R.drawable.ic_favorite_true);

              }
               else{flag=true;

                   Long playerId = ListaJugadores.get(position).getPlayerId();
                   String playerName = ListaJugadores.get(position).getPlayerName();
                   String userName = FragmentoLogin.user;
                   MainActivity.db.favoritoXUsuarioDAO().deleteFavorite(playerId);
                   Snackbar.make(view, playerName + " eliminado de favoritos", Snackbar.LENGTH_LONG).show();
                   holder.playerFavorite.setImageResource(R.drawable.ic_star_border_black_24dp);

               }
           }
       });
        holder.playerDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Long playerId = ListaJugadores.get(position).getPlayerId();
                String name = holder.playerName.getText().toString();
                Snackbar.make(view,name+" Eliminado correctamente",Snackbar.LENGTH_LONG).show();
                MainActivity.db.playerDAO().deletePLayer(playerId);
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
        ImageView playerDelete;


        public ViewHolderJugadores(View itemView) {
            super(itemView);
            playerAvatar=itemView.findViewById(R.id.player_image);
            playerName=itemView.findViewById(R.id.player_name);
            playerAlias=itemView.findViewById(R.id.player_knownas);
            playerCountry=itemView.findViewById(R.id.player_country);
            playerTeam=itemView.findViewById(R.id.player_team);
            playerFavorite=itemView.findViewById(R.id.player_favorite);
            playerDelete=itemView.findViewById(R.id.player_delete);

        }
    }
}
