package com.example.tourguide;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerAdapter  extends FragmentPagerAdapter {
    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return "Sight";
        } else if(position == 1) {
            return "Cafe";
        } else if (position == 2) {
            return "Museum";
        } else{
            return "Fun";
        }
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new SightseeingFragment();
        } else if (position == 1) {
            return new RestaurantsFragment();
        }else if (position == 2){
            return new MuseumsFragment();
        }else {
            return new EntertainmentFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}



