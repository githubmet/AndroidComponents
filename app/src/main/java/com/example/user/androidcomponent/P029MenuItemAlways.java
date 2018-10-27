package com.example.user.androidcomponent;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class P029MenuItemAlways extends AppCompatActivity {

    boolean checkControl=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=new MenuInflater(this);
        menuInflater.inflate(R.menu.p029_menu_item,menu);

        if(checkControl == true){
            menu.getItem(0).setTitle("Turn on");
        }
        else{
            menu.getItem(0).setTitle("Turn off");
        }
        return true;//super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        checkControl= !checkControl;
        invalidateOptionsMenu();
        return super.onOptionsItemSelected(item);
    }
}
