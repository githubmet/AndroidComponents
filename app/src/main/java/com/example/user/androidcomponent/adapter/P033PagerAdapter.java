package com.example.user.androidcomponent.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class P033PagerAdapter extends PagerAdapter {
    Context context;
    String[] countries;

    public P033PagerAdapter(Context context, String[] countries) {
        this.context = context;
        this.countries = countries;
    }

    @Override
    public int getCount() {
        return countries.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view==o;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        RelativeLayout relativeLayout=new RelativeLayout(context);
        TextView textView=new TextView(context);
        textView.setText(countries[position]);

        relativeLayout.addView(textView);
        container.addView(relativeLayout);


        return  relativeLayout ;  //super.instantiateItem(container, position);
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {

        container.removeView((RelativeLayout)object);
        //super.destroyItem(container, position, object);
    }
}
