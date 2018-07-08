package com.luisro00005513.crossoversports.Fragments.FragmentExplore.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.luisro00005513.crossoversports.R;
import com.luisro00005513.crossoversports.retrofit.extras.Player;
import com.luisro00005513.crossoversports.retrofit.extras.Team;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by luisro on 7/8/18.
 */

public class TeamsAdapter extends RecyclerView.Adapter<TeamsAdapterViewHolder> {
    List<Team> teamsList;
    private Context context;

    public TeamsAdapter(Context context, List<Team> teamsList){
        this.teamsList = teamsList;
        this.context = context;

    }

    @NonNull
    @Override
    public TeamsAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View teams_view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_explore_team, parent, false);
        return new TeamsAdapterViewHolder(teams_view,teamsList,context);
    }

    @Override
    public void onBindViewHolder(TeamsAdapterViewHolder holder, int position) {
        holder.teamName.setText(teamsList.get(position).getTeamName());
        holder.teamCountry.setText(teamsList.get(position).getTeamCountry());
        //holder.image.setImageURI();
        Picasso.with(context).load(teamsList.get(position).getTeamAvatar()).into(holder.teamAvatar);

    }

    @Override
    public int getItemCount() {
        return teamsList.size();
    }


}
