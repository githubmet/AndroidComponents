package com.example.user.androidcomponent;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

public class P026DrawableLayerList extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ImageView imageView=new ImageView(this);
        imageView.setImageResource(R.drawable.p026_drawable_layer_list);

        setContentView(imageView);
    }
}
