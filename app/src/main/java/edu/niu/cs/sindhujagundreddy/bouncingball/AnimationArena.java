package edu.niu.cs.sindhujagundreddy.bouncingball;

/**
 * Created by sindhujagundreddy on 4/21/16.
 */
import android.graphics.Canvas;

public class AnimationArena
{
    private Ball myBall;

    public AnimationArena()
    {
        myBall = new Ball();
    }//end of constructor

    public void update( int width, int height )
    {
        myBall.move(0, 0, width, height);
    }//end of update

    public void draw( Canvas canvas )
    {
        canvas.drawRGB(156,174, 216);
        myBall.draw(canvas);
    }//end of draw
}//end of AnimationArena class


