package com.example.user.androidcomponent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class P001IntentYakala extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        Intent intent=getIntent();
        String helloWorld= intent.getStringExtra(P001Intent.P001INTENT_KEY);

        TextView textView=new TextView(this);
        textView.setText(helloWorld);
        setContentView(textView);
    }
}
