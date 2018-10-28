package com.example.user.androidcomponent.adapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


import com.example.user.androidcomponent.fragment.P038FragmentOfFrom;
import com.example.user.androidcomponent.fragment.P038FragmentOfHello;
import com.example.user.androidcomponent.fragment.P038FragmentOfPa;

public class P038FragmentPagerAdapter extends FragmentPagerAdapter {


    public P038FragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch (i){
            case 0:
                return new P038FragmentOfHello();
            case 1:
                return new P038FragmentOfFrom();
            case 2:
                return new P038FragmentOfPa();
                default:
                    return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "One";
            case 1:
                return "Two";
            case 2:
                return "Three";
                default:
                    return super.getPageTitle(position);
        }


    }
}
