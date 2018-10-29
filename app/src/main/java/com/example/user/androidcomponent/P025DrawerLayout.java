package com.example.user.androidcomponent;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;


public class P025DrawerLayout extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p025_drawerlayout);

        Toolbar toolbarP025= findViewById(R.id.toolbarP025);
        setSupportActionBar(toolbarP025);

        DrawerLayout drawerLayoutP025= findViewById(R.id.drawerLayoutP025);

        final ActionBarDrawerToggle actionBarDrawerToggle=new ActionBarDrawerToggle(
          this,drawerLayoutP025,toolbarP025,R.string.open,R.string.close
        );
         drawerLayoutP025.setDrawerListener(actionBarDrawerToggle);
         drawerLayoutP025.post(new Runnable() {
             @Override
             public void run() {
                 actionBarDrawerToggle.syncState();
             }
         });
    }
}
