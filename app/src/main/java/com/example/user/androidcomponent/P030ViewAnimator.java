package com.example.user.androidcomponent;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ViewAnimator;

public class P030ViewAnimator extends Activity implements View.OnClickListener {
    ViewAnimator viewAnimatorP030;
    ViewAnimator viewAnimator2P030;
    int sayac=0;
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

        viewAnimator2P030= findViewById(R.id.viewAnimator2P030);
        viewAnimator2P030.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.viewAnimatorP030:
                viewAnimatorP030.showNext();
                break;
            case R.id.viewAnimator2P030:
                if(sayac%3==0){
                    viewAnimator2P030.setDisplayedChild(0);
                }
                else if(sayac%3==1){
                    viewAnimator2P030.setDisplayedChild(1);
                }
                else{
                    viewAnimator2P030.setDisplayedChild(2);
                }
                sayac++;

                break;
        }

    }
}
