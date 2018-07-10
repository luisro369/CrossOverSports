package com.luisro00005513.crossoversports.Fragments.FragmentExplore.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.luisro00005513.crossoversports.R;
import com.luisro00005513.crossoversports.retrofit.extras.TeamR;

import java.util.List;

/**
 * Created by luisro on 7/8/18.
 */

public class TeamsAdapterViewHolder extends RecyclerView.ViewHolder{
    ImageView teamAvatar;
    TextView teamName;
    TextView teamCountry;
    Context context;
    List<TeamR> teamsList;

    public TeamsAdapterViewHolder(View itemView, List<TeamR> teamsList, Context context) {
        super(itemView);
        this.teamsList =  teamsList;
        this.context = context;

        teamAvatar = (ImageView)itemView.findViewById(R.id.team_avatar);
        teamName = (TextView)itemView.findViewById(R.id.team_name);
        teamCountry = (TextView)itemView.findViewById(R.id.team_country);



    }//constructor



}
