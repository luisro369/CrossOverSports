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

public class ManageTeamAdapter extends RecyclerView.Adapter<ManageTeamAdapter.ViewHolderManageTeam> {
    ArrayList<Team> manageTeamList;

    public ManageTeamAdapter(ArrayList<Team> manageTeamList){ this.manageTeamList=manageTeamList;} {
    }

    @Override
    public ManageTeamAdapter.ViewHolderManageTeam onCreateViewHolder(ViewGroup parent, int viewType) {
        View rootView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_manage_team, null, false);
        RecyclerView.LayoutParams lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        rootView.setLayoutParams(lp);
        return new ViewHolderManageTeam(rootView);
    }

    @Override
    public void onBindViewHolder(ManageTeamAdapter.ViewHolderManageTeam holder, int position) {
        holder.manageTeamImage.setImageResource(manageTeamList.get(position).getTeamAvatar());
        holder.manageTeamDivision.setText(manageTeamList.get(position).getTeamDivision());
        holder.manageTeamName.setText(manageTeamList.get(position).getTeamName());
        holder.manageTeamCity.setText(manageTeamList.get(position).getTeamCity());
        holder.manageTeamCountry.setText(manageTeamList.get(position).getTeamCountry());
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

        public ViewHolderManageTeam(View itemView) {
            super(itemView);

            manageTeamImage=itemView.findViewById(R.id.manage_team_image);
            manageTeamDivision=itemView.findViewById(R.id.manage_team_category);
            manageTeamName=itemView.findViewById(R.id.manage_team_name);
            manageTeamCity=itemView.findViewById(R.id.manage_team_city);
            manageTeamCountry=itemView.findViewById(R.id.manage_team_country);

        }
    }
}
