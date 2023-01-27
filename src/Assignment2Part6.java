import acm.graphics.GOval;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

/**
 * Program with create caterpillar
 */
public class Assignment2Part6 extends WindowProgram {
public static final int LENGTH_OF_CATERPILLAR = 6;
public static final int RADIUS_OF_CATERPILAR = 170;
    public void run(){
    createCaterpilar(LENGTH_OF_CATERPILLAR);
    }

    private void createCaterpilar(int length) {
        double x = 0;
        int y = 0;
        boolean up = true;
        for (int i = 0; i<length; i++) {
            createGOval((int) x, y);
            x = x + RADIUS_OF_CATERPILAR / (1.5);
            if (up) {
                y = y - RADIUS_OF_CATERPILAR / 2;
                up = false;
            } else {
                y = y + RADIUS_OF_CATERPILAR/2;
                up = true;
            }
        }
    }

    private void createGOval(int x, int y) {
        GOval oval = new GOval(x,
                y+getHeight()/2-RADIUS_OF_CATERPILAR/2,
                RADIUS_OF_CATERPILAR, RADIUS_OF_CATERPILAR);
        oval.setFilled(true);
        oval.setColor(Color.red);
        oval.setFillColor(Color.green);
        add(oval);
    }
}
