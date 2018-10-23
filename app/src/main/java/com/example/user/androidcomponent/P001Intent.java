package com.example.user.androidcomponent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class P001Intent extends Activity  {

    public static final String P001INTENT_KEY="com.example.user.androidcomponent.P001INTENT_KEY";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.p001_intent);

    }

    public void onClickMtdP001(View view) {

        String helloWorld=getResources().getString(R.string.hello_world);
        Intent intent=new Intent(this,P001IntentYakala.class);
        intent.putExtra(P001INTENT_KEY,helloWorld);
        startActivity(intent);
    }
}
