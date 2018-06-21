package com.luisro00005513.crossoversports.Fragments.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import com.luisro00005513.crossoversports.Fragments.FavoritePlayersFragment;
import com.luisro00005513.crossoversports.Fragments.FavoriteTeamFragment;
import com.luisro00005513.crossoversports.Fragments.FavoriteTournamentFragment;

/**
 * Created by luisro on 6/20/18.
 */

public class FragmentPagerAdapter extends android.support.v4.app.FragmentPagerAdapter {

    int numTabs;


    public FragmentPagerAdapter(FragmentManager fm, int numeroDeTabs) {
        super(fm);
        this.numTabs = numeroDeTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                FavoriteTeamFragment tab1 = new FavoriteTeamFragment();
                return tab1;
            case 1:
                FavoritePlayersFragment tab2 = new FavoritePlayersFragment();
                return tab2;
            case 2:
                FavoriteTournamentFragment tab3 = new FavoriteTournamentFragment();
                return tab3;
            default:
                return null;
        }//switch
    }


    @Override
    public int getCount() {
        return numTabs;
    }
}