package com.example.user.androidcomponent;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import com.example.user.androidcomponent.adapter.P031RecyclerViewAdapter;

public class P031RecyclerListView extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p031_recyclerlistview);


        RecyclerView recyclerViewP031= findViewById(R.id.recyclerViewP031);

        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL,false);
        recyclerViewP031.setLayoutManager(linearLayoutManager);

        String[] countries=getResources().getStringArray(R.array.countries_p031);
        String[] cities=getResources().getStringArray(R.array.cities_p031);
        P031RecyclerViewAdapter p031RecyclerViewAdapter=new P031RecyclerViewAdapter(
          this,countries,cities
        );
        recyclerViewP031.setAdapter(p031RecyclerViewAdapter);
    }
}
