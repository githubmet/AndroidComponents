package com.example.user.androidcomponent;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import com.example.user.androidcomponent.adapter.P038FragmentPagerAdapter;

public class P038PagerTabStrip extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p038_pagertabstrip);


/*        ViewPager viewPagerP038= findViewById(R.id.viewPagerP038);
        FragmentPagerAdapter fragmentPagerAdapter=new P038FragmentPagerAdapter(
                getSupportFragmentManager()
        );

        viewPagerP038.setAdapter(fragmentPagerAdapter);*/
    }
}
