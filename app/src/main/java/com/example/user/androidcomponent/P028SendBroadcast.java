package com.example.user.androidcomponent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class P028SendBroadcast extends Activity implements View.OnClickListener{
    public static final String BROADCAST_KEY="com.example.user.androidcomponent.BROADCAST_KEY";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Button button=new Button(this);
        button.setText(getResources().getString(R.string.text));
        button.setOnClickListener(this);

        setContentView(button);


    }

    @Override
    public void onClick(View view) {
        Intent intent=new Intent("com.example.user.androidcomponent.DEPREM_YAYINI");
        intent.putExtra(BROADCAST_KEY,getResources().getString(R.string.hello_world));
        sendBroadcast(intent);
    }
}
