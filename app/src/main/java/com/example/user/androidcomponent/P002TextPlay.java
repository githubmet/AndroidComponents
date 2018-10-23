package com.example.user.androidcomponent;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class P002TextPlay extends Activity implements View.OnClickListener {
    RelativeLayout relativeLayoutP002;
    TextView textView;
    RelativeLayout.LayoutParams layoutParams;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p002_textplay);

        findViewById(R.id.buttonUpP001).setOnClickListener(this);
        findViewById(R.id.buttonDownP001).setOnClickListener(this);
        findViewById(R.id.buttonLeftP001).setOnClickListener(this);
        findViewById(R.id.buttonRightP001).setOnClickListener(this);

        relativeLayoutP002=(RelativeLayout) findViewById(R.id.relativeLayoutP002);
        textView=new TextView(this);
        String text= getResources().getString(R.string.text);
        textView.setText(text);

        layoutParams=new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );


        relativeLayoutP002.addView(textView);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.buttonUpP001:
                layoutParams.addRule(RelativeLayout.ALIGN_PARENT_TOP);
                break;
            case R.id.buttonDownP001:
                layoutParams.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
                break;
            case R.id.buttonLeftP001:
                layoutParams.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
                break;
            case R.id.buttonRightP001:
                layoutParams.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
                break;

        }
        textView.setLayoutParams(layoutParams);
    }
}
