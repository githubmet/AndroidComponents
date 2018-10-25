package com.example.user.androidcomponent;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class P010BitmapDrawable extends Activity implements View.OnClickListener{
    Bitmap bitmap;
    ImageView imageViewGhostP010;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p010_bitmap_drawable);

        findViewById(R.id.buttonP010).setOnClickListener(this);
        ImageView imageViewP010 = findViewById(R.id.imageViewP010);
        bitmap = ((BitmapDrawable) imageViewP010.getDrawable()).getBitmap();
        imageViewGhostP010=  findViewById(R.id.imageViewGhostP010);

    }
    @Override
    public void onClick(View view) {

        int widthBitmap=bitmap.getWidth();
        int heightBitmap=bitmap.getHeight();
        Bitmap.Config configBitmap=bitmap.getConfig();

        int newRed;
        int newGreen;
        int newBlue;
        int newAlpha;
        Bitmap skeleton=Bitmap.createBitmap(widthBitmap,heightBitmap,configBitmap);
        for(int gexX=0 ; gexX < heightBitmap; gexX++){
            for (int gexY=0; gexY<widthBitmap; gexY++){
             int pixel= bitmap.getPixel(gexX,gexY);
                newRed=255- Color.red(pixel);
                newGreen=255- Color.green(pixel);
                newBlue=255- Color.blue(pixel);
                newAlpha=Color.alpha(pixel);

                skeleton.setPixel(gexX,gexY,Color.argb(newAlpha,newRed,newGreen,newBlue));
            }
        }

        imageViewGhostP010.setImageBitmap(skeleton);

    }
}
