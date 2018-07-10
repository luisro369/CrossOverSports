package com.luisro00005513.crossoversports.Fragments.FragmentExplore.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.luisro00005513.crossoversports.R;
import com.luisro00005513.crossoversports.retrofit.extras.PlayerR;

import java.util.List;

/**
 * Created by luisro on 7/8/18.
 */

public class PlayersAdapterViewHolder extends RecyclerView.ViewHolder{
    ImageView playerAvatar;
    TextView playerName;
    TextView playerExtra;
    Context context;
    List<PlayerR> playersList;

    public PlayersAdapterViewHolder(View itemView, List<PlayerR> playersList, Context context) {
        super(itemView);
        this.playersList =  playersList;
        this.context = context;

        playerAvatar = (ImageView)itemView.findViewById(R.id.player_avatar);
        playerName = (TextView)itemView.findViewById(R.id.player_name);
        playerExtra = (TextView)itemView.findViewById(R.id.player_extra);



    }//constructor




}
