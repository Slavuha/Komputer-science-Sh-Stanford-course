package com.shpp.p2p.cs.vmazur.assignment2;

import acm.graphics.GOval;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

//Program creates caterpillar
public class Assignment2Part6 extends WindowProgram {
    public static final int LENGTH_OF_CATERPILLAR = 6;
    public static final int RADIUS_OF_CATERPILLAR = 170;

    public void run(){
        double x = 0;
        int y = 0;
        boolean up = true;
        //Created this variable to control our caterpillar.
        for (int i = 0; i < LENGTH_OF_CATERPILLAR; i++) {
            createGOval((int) x, y);
            x = x + RADIUS_OF_CATERPILLAR / (1.5);
            if (up) {   //Use boolean as flag to move our oval at y coordinate.
                y = y - RADIUS_OF_CATERPILLAR / 2;
                up = false;
            } else {
                y = y + RADIUS_OF_CATERPILLAR / 2;
                up = true;
            }
        }
    }
//Create simple oval in middle of y coordinate.
    private void createGOval(int x, int y) {
        GOval oval = new GOval(
                x,
                y + getHeight()/2 - RADIUS_OF_CATERPILLAR/2,
                RADIUS_OF_CATERPILLAR, RADIUS_OF_CATERPILLAR);
        oval.setFilled(true);
        oval.setColor(Color.RED);
        oval.setFillColor(Color.GREEN);
        add(oval);

    }
}
