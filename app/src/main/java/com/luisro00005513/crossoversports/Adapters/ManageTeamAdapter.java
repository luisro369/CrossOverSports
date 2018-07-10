package com.luisro00005513.crossoversports.Adapters;

import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.luisro00005513.crossoversports.Activities.MainActivity;
import com.luisro00005513.crossoversports.Entities.FavoritoXUsuario;
import com.luisro00005513.crossoversports.Entities.Team;
import com.luisro00005513.crossoversports.Entities.TeamFavoritoXUsuario;
import com.luisro00005513.crossoversports.Fragments.FragmentHome.FragmentoLogin;
import com.luisro00005513.crossoversports.R;

import java.util.ArrayList;
import java.util.List;

public class ManageTeamAdapter extends RecyclerView.Adapter<ManageTeamAdapter.ViewHolderManageTeam> {
    List<Team> manageTeamList;
    public  static boolean flag;

    public ManageTeamAdapter(List<Team> manageTeamList){ this.manageTeamList=manageTeamList;} {
    }

    @Override
    public ManageTeamAdapter.ViewHolderManageTeam onCreateViewHolder(ViewGroup parent, int viewType) {
        View rootView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_manage_team, null, false);
        RecyclerView.LayoutParams lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        rootView.setLayoutParams(lp);
        return new ViewHolderManageTeam(rootView);
    }

    @Override
    public void onBindViewHolder(final ManageTeamAdapter.ViewHolderManageTeam holder, final int position) {
        final Long idTeam;
        holder.manageTeamImage.setImageResource(manageTeamList.get(position).getTeamAvatar());
        holder.manageTeamDivision.setText(manageTeamList.get(position).getTeamDivision());
        holder.manageTeamName.setText(manageTeamList.get(position).getTeamName());
        holder.manageTeamCity.setText(manageTeamList.get(position).getTeamCity());
        holder.manageTeamCountry.setText(manageTeamList.get(position).getTeamCountry());
        idTeam=manageTeamList.get(position).getTeamId();

        if(MainActivity.db.teamFavoritoXUsuarioDAO().finByIdTeam(idTeam)!=null){
            flag = true;
            holder.manageTeamFavorite.setImageResource(R.drawable.ic_favorite_true);
        }else{
            flag=false;
        }
        holder.manageTeamFavorite.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                if(MainActivity.db.teamFavoritoXUsuarioDAO().finByIdTeam(idTeam)!=null){
                    flag = false;
                    holder.manageTeamFavorite.setImageResource(R.drawable.ic_favorite_true);
                }else{
                    flag=true;
                }
                if(flag) {

                    flag=false;
                    Long teanId = manageTeamList.get(position).getTeamId();
                    String playerName = manageTeamList.get(position).getTeamName();
                    String userName = FragmentoLogin.user;
                    MainActivity.db.teamFavoritoXUsuarioDAO().inserFavTeam(new TeamFavoritoXUsuario(userName,teanId));
                    Snackbar.make(view, playerName + " Añadido a favoritos", Snackbar.LENGTH_LONG).show();
                    holder.manageTeamFavorite.setImageResource(R.drawable.ic_favorite_true);

                }
                else{flag=true;

                    Long teanId = manageTeamList.get(position).getTeamId();
                    String playerName = manageTeamList.get(position).getTeamName();
                    String userName = FragmentoLogin.user;
                    MainActivity.db.teamFavoritoXUsuarioDAO().deleteFavoriteTeam(teanId);
                    Snackbar.make(view, playerName + " eliminado de favoritos", Snackbar.LENGTH_LONG).show();
                    holder.manageTeamFavorite.setImageResource(R.drawable.ic_star_border_black_24dp);

                }
            }
        });
        holder.manageTeamDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Long teamId = manageTeamList.get(position).getTeamId();
                String name = holder.manageTeamName.getText().toString();
                Snackbar.make(view,name+" Eliminado correctamente",Snackbar.LENGTH_LONG).show();
                MainActivity.db.teamDAO().deleteTeam(teamId);
            }
        });
    }

    @Override
    public int getItemCount() {
        return manageTeamList.size();
    }

    public class ViewHolderManageTeam extends RecyclerView.ViewHolder {

        ImageView manageTeamImage;
        TextView manageTeamDivision;
        TextView manageTeamName;
        TextView manageTeamCountry;
        TextView manageTeamCity;
        ImageView manageTeamFavorite;
        ImageView manageTeamDelete;

        public ViewHolderManageTeam(View itemView) {
            super(itemView);

            manageTeamImage=itemView.findViewById(R.id.manage_team_image);
            manageTeamDivision=itemView.findViewById(R.id.manage_team_category);
            manageTeamName=itemView.findViewById(R.id.manage_team_name);
            manageTeamCity=itemView.findViewById(R.id.manage_team_city);
            manageTeamCountry=itemView.findViewById(R.id.manage_team_country);
            manageTeamFavorite=itemView.findViewById(R.id.manage_team_favorite);
            manageTeamDelete=itemView.findViewById(R.id.manage_team_delete);
        }
    }
}
