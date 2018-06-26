package com.example.android.alexander;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {


    public SimpleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new GeoInfo();
        } else if (position == 1) {
            return new HistInfo();
        } else if (position == 2) {
            return new PublicPlaces();
        } else if (position == 3) {
            return new Entertainment();
        } else
            return new Events();
    }

    @Override
    public int getCount() {
        return 5;
    }


}
