package com.example.student2.game;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.annotation.RequiresPermission;

public class Actor implements Drawable, Moveable {
    boolean right = true;
    boolean left = false;
    static float x, y;
    static float vx, vy;
    Paint paint = new Paint();
    Bitmap pic;

//    Actor(float x, float y, float vx, float vy){
//        this.x = x;
//        this.y = y;
//        this.vx = vx;
//        this.vy = vy;
//    }

    static {
        vx = 10;
    }

    Actor(){
        this.x = 0;
        this.y = 0;
    }

    @Override
    public void onDraw(Canvas canvas) {
        paint.setColor(Color.DKGRAY);

        if (x == 0 || y == 0){
            x = 25;
            y = canvas.getHeight() - 25;
        }

        if (x + 25 >= canvas.getWidth() && right){
            vx = -10;
            right = false;
            left = true;
        }
        if (x - 25 <= 0 && left){
            vx = 10;
            left = false;
            right = true;
        }

        pic = BitmapFactory.decodeResource(Resources.getSystem(), R.drawable.trump_run);
        Rect rect = new Rect((int) x - 50, (int) y - 50, (int) x + 50, (int) y + 50);
        Rect rect1 = new Rect(100 , 0, 100, 100);
        canvas.drawBitmap(pic, rect1, rect, paint);
        //canvas.drawCircle(x, y, 25, paint);
    }

    @Override
    public void onMove() {
        this.x += vx;
    }
}