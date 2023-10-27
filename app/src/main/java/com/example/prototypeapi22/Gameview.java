package com.example.prototypeapi22;

import android.content.Context;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import androidx.annotation.NonNull;

public class Gameview extends SurfaceView implements SurfaceHolder.Callback{
    public Gameview(Context context) {
        super(context);
        SurfaceHolder surfaceHolder = getHolder();
        surfaceHolder.addCallback(this);
    }

    @Override
    public void surfaceCreated(@NonNull SurfaceHolder surfaceHolder) {
        Paint paint = new Paint();
        paint.setColor(Color.RED);

        Canvas canvas = surfaceHolder.lockCanvas();
        canvas.drawColor(Color.LTGRAY);
        canvas.drawCircle(500, 500, 50, paint);
        surfaceHolder.unlockCanvasAndPost(canvas);

    }

    @Override
    public void surfaceChanged(@NonNull SurfaceHolder surfaceHolder, int i, int i1, int i2) {

    }

    @Override
    public void surfaceDestroyed(@NonNull SurfaceHolder surfaceHolder) {

    }
}
