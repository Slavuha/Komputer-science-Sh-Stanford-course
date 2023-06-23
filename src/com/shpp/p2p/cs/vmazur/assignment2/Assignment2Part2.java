package com.shpp.p2p.cs.vmazur.assignment2;
import acm.graphics.GOval;
import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

/**
 * Program create optical illusion.
 */

public class Assignment2Part2 extends WindowProgram {

    public static final int APPLICATION_WIDTH = 300;
    public static final int APPLICATION_HEIGHT = 300;
    public static final double CIRCLE_DIAMETER = (APPLICATION_HEIGHT < APPLICATION_WIDTH) ?
            (APPLICATION_HEIGHT / 3) : (APPLICATION_WIDTH / 3);
    public void run(){

    drawCircles();
    drawSquare();
}

    /**
     * This method is creating 4 circles through 2 cycles.
     */
    private void drawCircles() {
    
        for (int x = 0; x<2; x++){
            for (int y = 0; y <2; y++){
                drawCircle(x, y);
            }
        }
        
    }
    // This method create circle, according to cycles.
    private void drawCircle(int x, int y) {
        double xCoordinate = x>0 ? x * getWidth() - CIRCLE_DIAMETER : x * getWidth();
        double yCoordinate = y>0 ? y * getHeight() - CIRCLE_DIAMETER : y * getHeight();

        GOval oval = new GOval(
                xCoordinate,
                yCoordinate,
                CIRCLE_DIAMETER,
                CIRCLE_DIAMETER);

        oval.setFilled(true);
        oval.setColor(Color.black);
        add(oval);

    }

    /**
     * This method is drawing withe square in middle of program. 
     */
    private void drawSquare() {
        GRect gRect = new GRect(
                CIRCLE_DIAMETER/2,
                CIRCLE_DIAMETER/2,
                getWidth() - CIRCLE_DIAMETER,
                getHeight() - CIRCLE_DIAMETER);

        gRect.setFilled(true);
        gRect.setColor(Color.WHITE);
        add(gRect);

    }
}
