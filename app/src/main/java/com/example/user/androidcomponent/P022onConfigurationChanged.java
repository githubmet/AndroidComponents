package com.example.user.androidcomponent;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class P022onConfigurationChanged extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView textView=new TextView(this);
        textView.setText(getResources().getString(R.string.text));
        setContentView(textView);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if(newConfig.orientation==Configuration.ORIENTATION_PORTRAIT){
            Toast.makeText(this, getResources().getString(R.string.portrait),Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, getResources().getString(R.string.lanscape),Toast.LENGTH_SHORT).show();
        }



    }
}
