package com.example.user.androidcomponent.adapter;

import android.os.Bundle;
import android.preference.PreferenceFragment;

import com.example.user.androidcomponent.R;

public class P004PreferenceFragment extends PreferenceFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.p004preference);
    }
}
