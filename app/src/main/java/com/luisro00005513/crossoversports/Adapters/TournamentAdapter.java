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

import java.util.ArrayList;
import java.util.List;

public class TournamentAdapter extends RecyclerView.Adapter<TournamentAdapter.ViewHolderTournament> implements View.OnClickListener {

    private final List<Tournament> ListTournament;
    private View.OnClickListener  listener;
    public static boolean flag;
    public TournamentAdapter(List<Tournament> listTournament) {
        ListTournament = listTournament;
    }

    @Override
    public ViewHolderTournament onCreateViewHolder(ViewGroup parent, int viewType) {
        View rootView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_tournament, null, false);
        RecyclerView.LayoutParams lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        rootView.setLayoutParams(lp);

        rootView.setOnClickListener(this);

        return new ViewHolderTournament(rootView);
    }

    @Override
    public void onBindViewHolder(final ViewHolderTournament holder, final int position) {
        final Long idTournament;
        holder.tournamentImage.setImageResource(ListTournament.get(position).getTournamentAvatar());
        holder.tournamentName.setText(ListTournament.get(position).getTournamentName());
        holder.tournamentCountry.setText(ListTournament.get(position).getTournamentCountry());
        idTournament= ListTournament.get(position).getTournamentId();
        final String user = FragmentoLogin.user;
        if(MainActivity.db.teamFavoritoXUsuarioDAO().finByIdTeam(idTournament)!=null){
            flag = true;
            holder.tounamentFav.setImageResource(R.drawable.ic_favorite_true);
        }else{
            flag=false;
        }
        holder.tounamentFav.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                if(MainActivity.db.tournamentFavoritoXUsuarioDAO().tounamentfav(user)!=null){
                    flag = false;
                    holder.tounamentFav.setImageResource(R.drawable.ic_favorite_true);
                }else{
                    flag=true;
                }
                if(flag) {

                    flag=false;
                    Long tournamentId = ListTournament.get(position).getTournamentId();
                    String tournamentName = ListTournament.get(position).getTournamentName();
                    String userName = FragmentoLogin.user;
                    MainActivity.db.tournamentFavoritoXUsuarioDAO().inserTournamentFav(new TournamentFavoritoXUsuario(tournamentName,tournamentId));
                    Snackbar.make(view, tournamentName + " Añadido a favoritos", Snackbar.LENGTH_LONG).show();
                    holder.tounamentFav.setImageResource(R.drawable.ic_favorite_true);

                }
                else{flag=true;

                    Long teanId = ListTournament.get(position).getTournamentId();
                    String playerName = ListTournament.get(position).getTournamentName();
                    String userName = FragmentoLogin.user;
                    MainActivity.db.tournamentFavoritoXUsuarioDAO().deleteFavoriteTournament(idTournament);
                    Snackbar.make(view, playerName + " eliminado de favoritos", Snackbar.LENGTH_LONG).show();
                    holder.tounamentFav.setImageResource(R.drawable.ic_star_border_black_24dp);

                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return ListTournament.size();
    }

    public void setOnClickListener(View.OnClickListener listener){
        this.listener=listener;
    }

    @Override
    public void onClick(View view) {
        if (listener!=null){
            listener.onClick(view);
        }

    }

    public class ViewHolderTournament extends RecyclerView.ViewHolder {

        ImageView tournamentImage;
        TextView tournamentName;
        TextView tournamentCountry;
        ImageView tounamentFav;

        public ViewHolderTournament(View itemView) {
            super(itemView);
            tournamentImage=itemView.findViewById(R.id.tournament_image);
            tournamentName=itemView.findViewById(R.id.tournament_name);
            tournamentCountry=itemView.findViewById(R.id.tournament_country);
            tounamentFav=itemView.findViewById(R.id.tournament_favorite);

        }
    }
}
