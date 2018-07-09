package com.luisro00005513.crossoversports.Fragments.FragmentExplore.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.luisro00005513.crossoversports.R;
import com.luisro00005513.crossoversports.retrofit.extras.Tournament;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by luisro on 7/8/18.
 */

public class TournamentsAdapter extends RecyclerView.Adapter<TournamentsAdapterViewHolder>{
    List<Tournament> tournamentsList;
    private Context context;

    public TournamentsAdapter(Context context, List<Tournament> tournamentsList){
        this.tournamentsList = tournamentsList;
        this.context = context;

    }

    @NonNull
    @Override
    public TournamentsAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View tournaments_view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_explore_tournament, parent, false);
        return new TournamentsAdapterViewHolder(tournaments_view,tournamentsList,context);
    }

    @Override
    public void onBindViewHolder(TournamentsAdapterViewHolder holder, int position) {
        holder.tournamentName.setText(tournamentsList.get(position).getTournamentName());
        holder.tournamentCountry.setText(tournamentsList.get(position).getTournamentCountry());
        //holder.image.setImageURI();
        Picasso.with(context).load(tournamentsList.get(position).getTournamentAvatar()).into(holder.tournamentAvatar);

    }

    @Override
    public int getItemCount() {
        return tournamentsList.size();
    }
}
