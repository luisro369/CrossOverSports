package com.luisro00005513.crossoversports.Fragments.FragmentExplore;

import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.luisro00005513.crossoversports.R;


public class FragmentoExplore extends Fragment {

    /**
     * El numero de paginas para enseniar.
     */
    private static final int NUM_PAGES = 3;
    //viewPager widget
    private ViewPager mPager;
    //pager adapter, provee las paginas al view pager widget
    private PagerAdapter mPagerAdapter;


    public FragmentoExplore() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragmento_explore, container, false);
        // Instantiate a ViewPager and a PagerAdapter.
        //======================todos sobre el tab====================
        //========================================
        TabLayout tabLayout = (TabLayout) view.findViewById(R.id.tabLayoutExplore);
        tabLayout.addTab(tabLayout.newTab().setText(R.string.explore_tournament));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.explore_team));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.explore_player));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        //codigo para viewpager
        mPager = (ViewPager) view.findViewById(R.id.viewPagerExplore);
        mPagerAdapter = new ScreenSlidePagerAdapter4(getChildFragmentManager());
        mPager.setAdapter(mPagerAdapter);

        mPager.setOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                mPager.setCurrentItem(tab.getPosition());
            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }
            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });
        return view;
    }//on create



    //clase del pager adapter
    private class ScreenSlidePagerAdapter4 extends FragmentStatePagerAdapter {
        public ScreenSlidePagerAdapter4(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    FragmentExploreTournaments tab1 = new FragmentExploreTournaments();
                    return tab1;
                case 1:
                    FragmentExploreTeams tab2 = new FragmentExploreTeams();
                    return tab2;
                case 2:
                    FragmentExplorePlayers tab3 = new FragmentExplorePlayers();
                    return tab3;
                default:
                    return null;
            }//switch
        }


        @Override
        public int getCount() {
            return NUM_PAGES;
        }
    }








    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
