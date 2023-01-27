import acm.graphics.GOval;
import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;
import java.awt.*;
public class Assignment2Part2 extends WindowProgram {
    /**
     * This program must create 5 objects
     * 4 circle in all conner
     * 1 square in the middle
 //    * @param args
     */
    public static final int APPLICATION_WIDTH = 300;
    public static final int APPLICATION_HEIGHT = 300;
    public static final int CIRCLE_WIDTH = 100;
    public static final int CIRCLE_HEIGHT = 100;
    public static final int RECT_WIDTH = 200;
    public static final int RECT_HEIGHT = 180;
    public void run() {
        GOval circle1 = new GOval(0, 0, CIRCLE_WIDTH, CIRCLE_HEIGHT);
        circle1.setFilled(true);
        circle1.setColor(Color.PINK);

        GOval circle2 = new GOval(getWidth()-CIRCLE_WIDTH, 0, CIRCLE_WIDTH, CIRCLE_HEIGHT);
        circle2.setFilled(true);
        circle2.setColor(Color.PINK);

        GOval circle3 = new GOval(getWidth()-CIRCLE_WIDTH, getHeight()-CIRCLE_HEIGHT, CIRCLE_WIDTH, CIRCLE_HEIGHT);
        circle3.setFilled(true);
        circle3.setColor(Color.PINK);

        GOval circle4 = new GOval(0, getHeight()-CIRCLE_HEIGHT, CIRCLE_WIDTH, CIRCLE_HEIGHT);
        circle4.setFilled(true);
        circle4.setColor(Color.PINK);

        /**
         * Create rect
         */
        GRect rect = new GRect(0+CIRCLE_HEIGHT/2, 0+CIRCLE_WIDTH/2, RECT_WIDTH,RECT_HEIGHT);
        rect.setFilled(true);
        rect.setColor(Color.GREEN);

        add(circle1);
        add(circle2);
        add(circle3);
        add(circle4);
        add(rect);
    }
}



