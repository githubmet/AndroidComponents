package com.example.user.androidcomponent;

import android.os.Bundle;
import android.preference.PreferenceActivity;

import com.example.user.androidcomponent.adapter.P004PreferenceFragment;

public class P004PreferenceActivity extends PreferenceActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getFragmentManager().beginTransaction().replace(android.R.id.content,
                new P004PreferenceFragment()).commit();
    }
}
