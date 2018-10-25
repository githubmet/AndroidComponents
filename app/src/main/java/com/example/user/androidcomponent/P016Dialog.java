package com.example.user.androidcomponent;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class P016Dialog extends Activity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Button button=new Button(this);
        button.setText(R.string.text);
        button.setOnClickListener(this);
        setContentView(button);
    }

    @Override
    public void onClick(View view) {
        Dialog dialog= new Dialog(this);
        dialog.setTitle(R.string.information);

        TextView textView=new TextView(this);
        textView.setText(R.string.hello_world);
        dialog.setContentView(textView);

        dialog.show();
    }
}
