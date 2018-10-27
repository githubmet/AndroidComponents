package com.example.user.androidcomponent;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class P025onConfigurationChanged extends Activity {
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        RelativeLayout relativeLayout =new RelativeLayout(this);
        setContentView(relativeLayout);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        if(newConfig.orientation==Configuration.ORIENTATION_PORTRAIT){
            Toast.makeText(P025onConfigurationChanged.this,getResources().getString(R.string.lanscape),Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(P025onConfigurationChanged.this,getResources().getString(R.string.portrait),Toast.LENGTH_SHORT).show();
        }
    }
}
