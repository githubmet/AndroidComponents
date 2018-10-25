package com.example.user.androidcomponent.transformation;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

public class P012ViewTransformation extends View {
    public P012ViewTransformation(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Rect rect=new Rect(10,10,getWidth()-10,getHeight()-10);
        Paint paint=new Paint();
        paint.setColor(Color.RED);

        canvas.drawRect(rect,paint);
    }
}
