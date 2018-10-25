package com.example.user.androidcomponent;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.RelativeLayout;

public class P003MenuItem extends AppCompatActivity {
    RelativeLayout relativeLayout;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        relativeLayout=new RelativeLayout(this);
        setContentView(relativeLayout);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater= new MenuInflater(this);
        menuInflater.inflate(R.menu.p003menuitem,menu);
        return true;  //super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(!item.isChecked()){
        switch (item.getItemId()){
            case R.id.itemP003:
                relativeLayout.setBackgroundColor(Color.parseColor("#006699"));
                return true;
            case R.id.item2P003:
                relativeLayout.setBackgroundColor(Color.parseColor("#009900"));
                return true;
            case R.id.item3P003:
                relativeLayout.setBackgroundColor(Color.parseColor("#b0c4de"));
                return true;
                default:
                    return super.onOptionsItemSelected(item);
        }
        }
        else{
            return super.onOptionsItemSelected(item);
        }
    }
}
