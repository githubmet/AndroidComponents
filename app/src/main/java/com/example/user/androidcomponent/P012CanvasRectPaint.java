package com.example.user.androidcomponent;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.example.user.androidcomponent.transformation.P012ViewTransformation;

public class P012CanvasRectPaint extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        View view= new P012ViewTransformation(this);
        setContentView(view);
    }
}
