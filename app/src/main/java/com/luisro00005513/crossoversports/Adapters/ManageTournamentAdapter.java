package com.luisro00005513.crossoversports.Adapters;

import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.luisro00005513.crossoversports.Activities.MainActivity;
import com.luisro00005513.crossoversports.Entities.Tournament;
import com.luisro00005513.crossoversports.Entities.TournamentFavoritoXUsuario;
import com.luisro00005513.crossoversports.Fragments.FragmentHome.FragmentoLogin;
import com.luisro00005513.crossoversports.R;

import java.util.List;

public class ManageTournamentAdapter extends RecyclerView.Adapter<ManageTournamentAdapter.ViewHolderManageTour> {

    List<Tournament> tournamentManagerList;
    public static boolean flag;

    public ManageTournamentAdapter(List<Tournament> tournamentManagerList) {
        this.tournamentManagerList = tournamentManagerList;
    }

    @Override
    public ViewHolderManageTour onCreateViewHolder(ViewGroup parent, int viewType) {
        View rootView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_manage_tournament, null, false);
        RecyclerView.LayoutParams lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        rootView.setLayoutParams(lp);
        return new ViewHolderManageTour(rootView);
    }

    @Override
    public void onBindViewHolder(final ViewHolderManageTour holder, final int position) {
        final Long idTournament;
        holder.manageTounamentImage.setImageResource(tournamentManagerList.get(position).getTournamentAvatar());
        holder.manageTournamentName.setText(tournamentManagerList.get(position).getTournamentName());
        holder.manageTournamentCountry.setText(tournamentManagerList.get(position).getTournamentCountry());
        idTournament=tournamentManagerList.get(position).getTournamentId();
        String user = FragmentoLogin.user;
        if(MainActivity.db.tournamentFavoritoXUsuarioDAO().tounamentfav(user)!=null){
            flag = false;
            holder.manageTounamentFav.setImageResource(R.drawable.ic_favorite_true);
        }else{
            flag=true;
        }
        holder.manageTounamentFav.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                if(flag) {

                    flag=false;
                    Long tournamentId = tournamentManagerList.get(position).getTournamentId();
                    String tournamentName = tournamentManagerList.get(position).getTournamentName();
                    String userName = FragmentoLogin.user;
                    MainActivity.db.tournamentFavoritoXUsuarioDAO().inserTournamentFav(new TournamentFavoritoXUsuario(tournamentName,tournamentId));
                    Snackbar.make(view, tournamentName + " Añadido a favoritos", Snackbar.LENGTH_LONG).show();
                    holder.manageTounamentFav.setImageResource(R.drawable.ic_favorite_true);

                }
                else{flag=true;

                    Long teanId = tournamentManagerList.get(position).getTournamentId();
                    String playerName = tournamentManagerList.get(position).getTournamentName();
                    String userName = FragmentoLogin.user;
                    MainActivity.db.tournamentFavoritoXUsuarioDAO().deleteFavoriteTournament(idTournament);
                    Snackbar.make(view, playerName + " eliminado de favoritos", Snackbar.LENGTH_LONG).show();
                    holder.manageTounamentFav.setImageResource(R.drawable.ic_star_border_black_24dp);

                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return tournamentManagerList.size();
    }

    public class ViewHolderManageTour extends RecyclerView.ViewHolder {
        ImageView manageTounamentImage;
        TextView manageTournamentCountry;
        TextView manageTournamentName;
        ImageView manageTounamentFav;


        public ViewHolderManageTour(View itemView) {
            super(itemView);

            manageTounamentImage=itemView.findViewById(R.id.manage_tournament_image);
            manageTournamentCountry =itemView.findViewById(R.id.manage_tournament_category);
            manageTournamentName=itemView.findViewById(R.id.manage_tournament_name);
            manageTounamentFav=itemView.findViewById(R.id.manage_tournament_favorite);

        }
    }
}
