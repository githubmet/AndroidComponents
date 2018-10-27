package com.example.user.androidcomponent;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.widget.RelativeLayout;

import com.example.user.androidcomponent.adapter.P033PagerAdapter;
import com.example.user.androidcomponent.fragment.P032CardViewFragment;

public class P033ViewPager extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        RelativeLayout relativeLayout=new RelativeLayout(this);
        ViewPager viewPager=new ViewPager(this);
        String[] countries=getResources().getStringArray(R.array.countries_p031);

        P033PagerAdapter p033PagerAdapter=new P033PagerAdapter(this,countries);
        viewPager.setAdapter(p033PagerAdapter);


        relativeLayout.addView(viewPager);
        setContentView(relativeLayout);
    }
}
