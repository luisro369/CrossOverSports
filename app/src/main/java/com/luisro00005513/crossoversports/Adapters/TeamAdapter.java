package com.luisro00005513.crossoversports.Adapters;

import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.luisro00005513.crossoversports.Activities.MainActivity;
import com.luisro00005513.crossoversports.Entities.Team;
import com.luisro00005513.crossoversports.Entities.TeamFavoritoXUsuario;
import com.luisro00005513.crossoversports.Fragments.FragmentHome.FragmentoLogin;
import com.luisro00005513.crossoversports.R;

import java.util.ArrayList;
import java.util.List;

public class TeamAdapter extends RecyclerView.Adapter<TeamAdapter.ViewHolderTeam> {
    List<Team> ListTeam;
    public static boolean flag;

    public TeamAdapter(List<Team> ListTeam) {
        this.ListTeam = ListTeam;
    }

    @Override
    public ViewHolderTeam onCreateViewHolder(ViewGroup parent, int viewType) {
        /*View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_team, null, false);*/
        View rootView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_team, null, false);
        RecyclerView.LayoutParams lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        rootView.setLayoutParams(lp);
        return new ViewHolderTeam(rootView);

        /*return new ViewHolderTeam(view);*/
    }

    @Override
    public void onBindViewHolder(final ViewHolderTeam holder, final int position) {
        Long idTeam;
        holder.teamAvatar.setImageResource(ListTeam.get(position).getTeamAvatar());
        holder.teamName.setText(ListTeam.get(position).getTeamName());
        holder.teamCity.setText(ListTeam.get(position).getTeamCity());
        holder.teamCountry.setText(ListTeam.get(position).getTeamCountry());
        idTeam=ListTeam.get(position).getTeamId();

        if(MainActivity.db.teamFavoritoXUsuarioDAO().finByIdTeam(idTeam)!=null){
            flag = false;
            holder.teamFavorite.setImageResource(R.drawable.ic_favorite_true);
        }
        holder.teamFavorite.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(flag) {
                    flag=false;
                    Long teamId = ListTeam.get(position).getTeamId();
                    String teamName = ListTeam.get(position).getTeamName();
                    String userName = FragmentoLogin.user;
                    MainActivity.db.teamFavoritoXUsuarioDAO().inserFavTeam(new TeamFavoritoXUsuario(userName,teamId));
                    Snackbar.make(view, teamName + " Añadido a favoritos", Snackbar.LENGTH_LONG).show();
                    holder.teamFavorite.setImageResource(R.drawable.ic_favorite_true);

                }
                else{flag=true;

                    Long teamId = ListTeam.get(position).getTeamId();
                    String playerName = ListTeam.get(position).getTeamName();
                    String userName = FragmentoLogin.user;
                    MainActivity.db.teamFavoritoXUsuarioDAO().deleteFavoriteTeam(teamId);
                    Snackbar.make(view, playerName + " eliminado de favoritos", Snackbar.LENGTH_LONG).show();
                    holder.teamFavorite.setImageResource(R.drawable.ic_star_border_black_24dp);

                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return ListTeam.size();
    }

    public class ViewHolderTeam extends RecyclerView.ViewHolder {

        ImageView teamAvatar;
        TextView teamName;
        TextView teamCity;
        TextView teamCountry;
        ImageView teamFavorite;

        public ViewHolderTeam(View itemView) {
            super(itemView);
            teamAvatar=itemView.findViewById(R.id.team_image);
            teamName=itemView.findViewById(R.id.team_name);
            teamCity=itemView.findViewById(R.id.team_city);
            teamCountry=itemView.findViewById(R.id.team_country);
            teamFavorite=itemView.findViewById(R.id.team_favorite);
        }
    }
}
