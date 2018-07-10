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

public class ManageTournamentAdapter extends RecyclerView.Adapter<ManageTournamentAdapter.ViewHolderManageTour> {

    ArrayList<Tournament> tournamentManagerList;

    public ManageTournamentAdapter(ArrayList<Tournament> tournamentManagerList) {
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
    public void onBindViewHolder(ViewHolderManageTour holder, int position) {

    }

    @Override
    public int getItemCount() {
        return tournamentManagerList.size();
    }

    public class ViewHolderManageTour extends RecyclerView.ViewHolder {
        ImageView manageTounamentImage;
        TextView manageTournamentCategory;
        TextView manageTournamentName;


        public ViewHolderManageTour(View itemView) {
            super(itemView);

            manageTounamentImage=itemView.findViewById(R.id.manage_tournament_image);
            manageTournamentCategory=itemView.findViewById(R.id.manage_tournament_category);
            manageTournamentName=itemView.findViewById(R.id.manage_tournament_name);

        }
    }
}
