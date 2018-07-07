package com.luisro00005513.crossoversports.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.luisro00005513.crossoversports.Entities.Tournament;
import com.luisro00005513.crossoversports.R;

import java.util.ArrayList;

public class TournamentAdapter extends RecyclerView.Adapter<TournamentAdapter.ViewHolderTournament> {

    ArrayList<Tournament> ListTournament;

    public TournamentAdapter(ArrayList<Tournament> listTournament) {
        ListTournament = listTournament;
    }

    @Override
    public ViewHolderTournament onCreateViewHolder(ViewGroup parent, int viewType) {
        View rootView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_tournament, null, false);
        RecyclerView.LayoutParams lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        rootView.setLayoutParams(lp);

        return new ViewHolderTournament(rootView);
    }

    @Override
    public void onBindViewHolder(ViewHolderTournament holder, int position) {
        holder.tournamentImage.setImageResource(ListTournament.get(position).getTournamentAvatar());
        holder.tournamentName.setText(ListTournament.get(position).getTournamentName());
        holder.tournamentCountry.setText(ListTournament.get(position).getTournamentCountry());

    }

    @Override
    public int getItemCount() {
        return ListTournament.size();
    }

    public class ViewHolderTournament extends RecyclerView.ViewHolder {

        ImageView tournamentImage;
        TextView tournamentName;
        TextView tournamentCountry;

        public ViewHolderTournament(View itemView) {
            super(itemView);
            tournamentImage=itemView.findViewById(R.id.tournament_image);
            tournamentName=itemView.findViewById(R.id.tournament_name);
            tournamentCountry=itemView.findViewById(R.id.tournament_country);
        }
    }
}
