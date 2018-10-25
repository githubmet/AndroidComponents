package com.example.user.androidcomponent;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.TextView;

public class P005GetPrefrenceInfo extends Activity {
    TextView textViewNameP005;
    TextView textViewSurnameP005;
    TextView textViewActivityP005;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p005getpreferenceinfo);
        textViewNameP005= findViewById(R.id.textViewNameP005);
        textViewSurnameP005= findViewById(R.id.textViewSurnameP005);
        textViewActivityP005= findViewById(R.id.textViewActivityP005);
    }

    public void onClickSurnameMtdP005(View view) {
        SharedPreferences sharedPreferences= PreferenceManager.getDefaultSharedPreferences(this);
        String surname= sharedPreferences.getString("editTextPreferenceSurnameP004","default");
        textViewSurnameP005.setText(surname);
    }

    public void onClickNameMtdP005(View view) {
        SharedPreferences sharedPreferences= PreferenceManager.getDefaultSharedPreferences(this);
        String name= sharedPreferences.getString("editTextPreferenceNameP004","default");
        textViewNameP005.setText(name);
    }

    public void onClickActivityMtdP005(View view) {
        SharedPreferences sharedPreferences= PreferenceManager.getDefaultSharedPreferences(this);
        String activityName= sharedPreferences.getString("listPreferenceActivityP004","default");
        textViewActivityP005.setText(activityName);
    }
}
