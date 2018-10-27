package com.example.user.androidcomponent;

import android.app.Activity;
import android.os.Bundle;

import com.example.user.androidcomponent.fragment.P032CardViewFragment;

public class P032CardView extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p032_cardview);


        getFragmentManager().beginTransaction()
                .add(R.id.frameLayoutP032,new P032CardViewFragment())
                .commit();
    }
}
