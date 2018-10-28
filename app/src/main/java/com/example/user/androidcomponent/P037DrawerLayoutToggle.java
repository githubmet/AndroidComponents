package com.example.user.androidcomponent;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;


public class P037DrawerLayoutToggle extends AppCompatActivity {/*implements NavigationView.OnNavigationItemSelectedListener  {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p037_drawerlayout_toggle);
        DrawerLayout drawerLayoutP037 = findViewById(R.id.drawerLayoutP037);
        Toolbar toolbarP037 = findViewById(R.id.toolbarP037);

        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(
                this, drawerLayoutP037,
                toolbarP037,
                R.string.open,
                R.string.close
        );
        drawerLayoutP037.addDrawerListener(actionBarDrawerToggle);
        drawerLayoutP037.post(actionBarDrawerToggle.syncState());
        NavigationView navigationViewP037= findViewById(R.id.navigationViewP037);
        navigationViewP037.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.itemOneP037:
                Toast.makeText(this, getResources().getString(R.string.one), Toast.LENGTH_SHORT).show();
                return true;
            case R.id.itemTwoP037:
                Toast.makeText(this, getResources().getString(R.string.two), Toast.LENGTH_SHORT).show();
                return true;
            case R.id.itemThreeP037:
                Toast.makeText(this, getResources().getString(R.string.three), Toast.LENGTH_SHORT).show();
                return true;
                default:
                    return true;
        }
    }*/
}
