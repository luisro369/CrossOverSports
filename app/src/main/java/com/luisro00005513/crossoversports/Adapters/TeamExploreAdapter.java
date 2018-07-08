package com.luisro00005513.crossoversports.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.luisro00005513.crossoversports.Entities.Team;
import com.luisro00005513.crossoversports.R;

import java.util.ArrayList;

public class TeamExploreAdapter extends RecyclerView.Adapter<TeamExploreAdapter.ViewHolderTeamExploreTeam> {

    ArrayList<Team> listExploreTeam;

    public TeamExploreAdapter(ArrayList<Team> listExploreTeam) {
        this.listExploreTeam = listExploreTeam;
    }

    @Override
    public ViewHolderTeamExploreTeam onCreateViewHolder(ViewGroup parent, int viewType) {
        View rootView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_explore_team, null, false);
        RecyclerView.LayoutParams lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        rootView.setLayoutParams(lp);

        return new ViewHolderTeamExploreTeam(rootView);
    }

    @Override
    public void onBindViewHolder(ViewHolderTeamExploreTeam holder, int position) {
        holder.teamExploreImage.setImageResource(listExploreTeam.get(position).getTeamAvatar());
        holder.teamExploreName.setText(listExploreTeam.get(position).getTeamName());
        holder.teamExploreCountry.setText(listExploreTeam.get(position).getTeamCountry());

    }

    @Override
    public int getItemCount() {
        return listExploreTeam.size();
    }

    public class ViewHolderTeamExploreTeam extends RecyclerView.ViewHolder {

        ImageView teamExploreImage;
        TextView teamExploreName;
        TextView teamExploreCountry;

        public ViewHolderTeamExploreTeam(View itemView) {
            super(itemView);
            teamExploreImage=itemView.findViewById(R.id.explore_team_image);
            teamExploreName=itemView.findViewById(R.id.explore_team_name);
            teamExploreCountry=itemView.findViewById(R.id.explore_team_country);
        }
    }
}
