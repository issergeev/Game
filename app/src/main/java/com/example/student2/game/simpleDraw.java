package com.example.student2.game;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;

public class simpleDraw extends View {

    ArrayList arrayList = new ArrayList();
    Actor actor;
    Bitmap pic;

    public simpleDraw(Context context, AttributeSet attrs) {
        super(context, attrs);

        actor = new Actor();
    }

    protected void onDraw(Canvas canvas){
        actor.onDraw(canvas);
        actor.onMove();
        invalidate();
    }
}