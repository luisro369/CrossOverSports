package com.luisro00005513.crossoversports.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.luisro00005513.crossoversports.Entities.Player;
import com.luisro00005513.crossoversports.R;

import java.util.ArrayList;

public class PlayerExploreAdapter extends RecyclerView.Adapter<PlayerExploreAdapter .ViewHolderExplorePlayer>{
    ArrayList<Player> explorePlayerList;

    public PlayerExploreAdapter(ArrayList<Player> explorePlayerList) {
        this.explorePlayerList = explorePlayerList;
    }

    @Override
    public ViewHolderExplorePlayer onCreateViewHolder(ViewGroup parent, int viewType) {
        View rootView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_explore_player, null, false);
        RecyclerView.LayoutParams lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        rootView.setLayoutParams(lp);

        return new ViewHolderExplorePlayer(rootView);
    }

    @Override
    public void onBindViewHolder(ViewHolderExplorePlayer holder, int position) {
        holder.playerName.setText(explorePlayerList.get(position).getPlayerName());

    }

    @Override
    public int getItemCount() {
        return explorePlayerList.size();
    }

    public class ViewHolderExplorePlayer extends RecyclerView.ViewHolder {

        TextView playerName;

        public ViewHolderExplorePlayer(View itemView) {
            super(itemView);
            playerName=itemView.findViewById(R.id.explore_player_name);
        }
    }
}
