package com.example.user.androidcomponent;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class P034CoordinatorLayout extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p034_coordinatorlayout);

        findViewById(R.id.floatingActionButtonP034).setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.floatingActionButtonP034){
            Snackbar.make(view,getResources().getString(R.string.hello_world),Snackbar.LENGTH_SHORT).show();
        }
    }
}
