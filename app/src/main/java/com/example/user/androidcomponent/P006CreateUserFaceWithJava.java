package com.example.user.androidcomponent;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class P006CreateUserFaceWithJava extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        RelativeLayout relativeLayout=new RelativeLayout(this);
        TextView textView=new TextView(this);
        textView.setText(R.string.text);
        textView.setId(1234);

        RelativeLayout.LayoutParams layoutParamsOfTextView=new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        layoutParamsOfTextView.addRule(RelativeLayout.CENTER_IN_PARENT);
        textView.setLayoutParams(layoutParamsOfTextView);


        TextView textView2=new TextView(this);
        textView2.setText(R.string.text2);


        RelativeLayout.LayoutParams layoutParamsOfTextView2=new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        layoutParamsOfTextView2.addRule(RelativeLayout.BELOW,textView.getId());
        layoutParamsOfTextView2.addRule(RelativeLayout.CENTER_HORIZONTAL);
        textView2.setLayoutParams(layoutParamsOfTextView2);

        relativeLayout.addView(textView);
        relativeLayout.addView(textView2);
        setContentView(relativeLayout);
    }
}
