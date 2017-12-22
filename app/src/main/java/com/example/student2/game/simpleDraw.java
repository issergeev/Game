package com.example.student2.game;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

public class simpleDraw extends View {

    Actor actor;
    Bitmap pic;

    public simpleDraw(Context context, AttributeSet attrs) {
        super(context, attrs);

        pic = BitmapFactory.decodeResource(getResources(), R.drawable.trump_run);
        actor = new Actor(pic);
    }

    protected void onDraw(Canvas canvas){
        actor.onDraw(canvas);
        actor.onMove();
        invalidate();
    }
}