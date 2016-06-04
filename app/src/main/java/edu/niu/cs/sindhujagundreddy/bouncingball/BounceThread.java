package edu.niu.cs.sindhujagundreddy.bouncingball;

/**
 * Created by sindhujagundreddy on 4/21/16.
 */
import android.graphics.Canvas;
import android.view.SurfaceHolder;

public class BounceThread extends Thread {

    private SurfaceHolder surfaceHolder;
    private AnimationArena animationArena;
    private boolean isRunning;

    public BounceThread(SurfaceHolder sh)
    {
        isRunning = true;
        surfaceHolder = sh;
        animationArena = new AnimationArena();
    }//end of constructor

    public void run()
    {
        try
        {
            while(isRunning)
            {
                Canvas canvas = surfaceHolder.lockCanvas();
                animationArena.update(canvas.getWidth(),canvas.getHeight());
                animationArena.draw(canvas);
                surfaceHolder.unlockCanvasAndPost(canvas);
            }
        }
        catch (NullPointerException e)
        {
            e.printStackTrace();
        }
    }//end of run

    public void endBounce()
    {
        isRunning = false;
    }
}
