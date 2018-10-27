package com.example.user.androidcomponent;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ViewAnimator;

public class P030ViewAnimator extends Activity implements View.OnClickListener {
    ViewAnimator viewAnimatorP030;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p030_viewanimator);

        viewAnimatorP030= findViewById(R.id.viewAnimatorP030);

        Animation animationLeft=AnimationUtils.loadAnimation
                (this,android.R.anim.slide_in_left);
        Animation animationRight= AnimationUtils.loadAnimation
                (this,android.R.anim.slide_out_right);

        viewAnimatorP030.setInAnimation(animationLeft);
        viewAnimatorP030.setOutAnimation(animationRight);

        viewAnimatorP030.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        viewAnimatorP030.showNext();
    }
}
