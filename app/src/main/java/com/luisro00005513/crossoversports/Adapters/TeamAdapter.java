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
import java.util.List;

public class TeamAdapter extends RecyclerView.Adapter<TeamAdapter.ViewHolderTeam> {
    List<Team> ListTeam;

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
    public void onBindViewHolder(ViewHolderTeam holder, int position) {
        holder.teamAvatar.setImageResource(ListTeam.get(position).getTeamAvatar());
        holder.teamName.setText(ListTeam.get(position).getTeamName());
        holder.teamCity.setText(ListTeam.get(position).getTeamCity());
        holder.teamCountry.setText(ListTeam.get(position).getTeamCountry());

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

        public ViewHolderTeam(View itemView) {
            super(itemView);
            teamAvatar=itemView.findViewById(R.id.team_image);
            teamName=itemView.findViewById(R.id.team_name);
            teamCity=itemView.findViewById(R.id.team_city);
            teamCountry=itemView.findViewById(R.id.team_country);
        }
    }
}
