package com.luisro00005513.crossoversports.Fragments.FragmentExplore.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.luisro00005513.crossoversports.R;
import com.luisro00005513.crossoversports.retrofit.extras.TournamentR;

import java.util.List;

/**
 * Created by luisro on 7/8/18.
 */

public class TournamentsAdapterViewHolder extends RecyclerView.ViewHolder {
    ImageView tournamentAvatar;
    TextView tournamentName;
    TextView tournamentCountry;
    Context context;
    List<TournamentR> tournamentsList;

    public TournamentsAdapterViewHolder(View itemView, List<TournamentR> tournamentsList, Context context) {
        super(itemView);
        this.tournamentsList =  tournamentsList;
        this.context = context;

        tournamentAvatar = (ImageView)itemView.findViewById(R.id.tournament_avatar);
        tournamentName = (TextView)itemView.findViewById(R.id.tournament_name);
        tournamentCountry = (TextView)itemView.findViewById(R.id.tournament_country);



    }//constructor

}
