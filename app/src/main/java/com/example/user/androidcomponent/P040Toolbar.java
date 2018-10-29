package com.example.user.androidcomponent;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class P040Toolbar extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p040_toolbar);

        Toolbar toolbarP040= findViewById(R.id.toolbarP040);
        setSupportActionBar(toolbarP040);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
