package com.shpp.p2p.cs.vmazurOld.assignment2;

import acm.graphics.GOval;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

/**
 * Program with create caterpillar
 */
public class Assignment2Part6 extends WindowProgram {
    public static final int LENGTH_OF_CATERPILLAR = 6;
    public static final int RADIUS_OF_CATERPILLAR = 170;

    public void run() {
        createCaterpillar(LENGTH_OF_CATERPILLAR);
    }

    /**
     * This method crete caterpillar and I use variables
     * x and y to coordinate direction of caterpillar
     * Also, I use boolean flag to mark when caterpillar does she turn on y  axes
     *
     * @param length
     */
    private void createCaterpillar(int length) {
        double x = 0;
        int y = 0;
        boolean up = true;
        for (int i = 0; i < length; i++) {
            createGOval((int) x, y);
            x = x + RADIUS_OF_CATERPILLAR / (1.5);
            if (up) {
                y = y - RADIUS_OF_CATERPILLAR / 2;
                up = false;
            } else {
                y = y + RADIUS_OF_CATERPILLAR / 2;
                up = true;
            }
        }
    }

    /**
     * This method create oval and located it in the middle of y axes.
     *
     * @param x
     * @param y
     */

    private void createGOval(int x, int y) {
        GOval oval = new GOval(x,
                y + getHeight() / 2 - RADIUS_OF_CATERPILLAR / 2,
                RADIUS_OF_CATERPILLAR, RADIUS_OF_CATERPILLAR);
        oval.setFilled(true);
        oval.setColor(Color.red);
        oval.setFillColor(Color.green);
        add(oval);
    }
}
