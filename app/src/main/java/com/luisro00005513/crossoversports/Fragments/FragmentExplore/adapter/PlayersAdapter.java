package com.luisro00005513.crossoversports.Fragments.FragmentExplore.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.luisro00005513.crossoversports.R;
import com.luisro00005513.crossoversports.retrofit.extras.Player;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by luisro on 7/8/18.
 */

public class PlayersAdapter extends RecyclerView.Adapter<PlayersAdapterViewHolder> {

    List<Player> playersList;
    private Context context;

    public PlayersAdapter(Context context, List<Player> playersList){
        this.playersList = playersList;
        this.context = context;

    }

    @NonNull
    @Override
    public PlayersAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View players_view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_explore_players, parent, false);
        return new PlayersAdapterViewHolder(players_view,playersList,context);
    }

    @Override
    public void onBindViewHolder(PlayersAdapterViewHolder holder, int position) {
        holder.playerName.setText(playersList.get(position).getPlayerName());
        holder.playerExtra.setText(playersList.get(position).getPlayerExtra());
        //holder.image.setImageURI();
        Picasso.with(context).load(playersList.get(position).getPlayerAvatar()).into(holder.playerAvatar);

    }

    @Override
    public int getItemCount() {
        return playersList.size();
    }
}
