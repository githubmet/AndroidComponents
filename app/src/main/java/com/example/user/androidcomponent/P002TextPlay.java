package com.example.user.androidcomponent;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class P002TextPlay extends Activity implements View.OnClickListener {
    TextView textViewP002;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p002_textplay);

        findViewById(R.id.buttonUpP002).setOnClickListener(this);
        findViewById(R.id.buttonDownP002).setOnClickListener(this);
        findViewById(R.id.buttonLeftP002).setOnClickListener(this);
        findViewById(R.id.buttonRightP002).setOnClickListener(this);

        textViewP002=(TextView) findViewById(R.id.textViewP002);
    }

    @Override
    public void onClick(View view) {
        RelativeLayout.LayoutParams layoutParams=new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        switch (view.getId()){

            case R.id.buttonUpP002:
                layoutParams.addRule(RelativeLayout.ALIGN_PARENT_TOP);
                textViewP002.setText(R.string.up);
                break;
            case R.id.buttonDownP002:
                layoutParams.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
                textViewP002.setText(R.string.down);
                break;
            case R.id.buttonLeftP002:
                layoutParams.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
                textViewP002.setText(R.string.left);
                break;
            case R.id.buttonRightP002:
                layoutParams.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
                textViewP002.setText(R.string.right);
                break;

        }
        textViewP002.setLayoutParams(layoutParams);
    }
}
