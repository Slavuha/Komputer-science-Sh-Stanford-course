package com.shpp.p2p.cs.msosula.assignment2;

import acm.graphics.GOval;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

public class Assignment2Part6 extends WindowProgram {
    // Constant hold number of circles in caterpillar
    private static final int CATERPILLAR_COUNT_OF_SECTIONS = 6;
    // Constant hold color of body
    private static final Color CATERPILLAR_BODY_COLOR = new Color(0, 178, 0);
    // Constant hold border color
    private static final Color CATERPILLAR_BORDER_COLOR = new Color(166, 20, 2);
    // Constant hold diameter of circle
    private static final int SIZE = 100;
    /*
    Constants for set up window size
     */
    public static final int APPLICATION_WIDTH = 600;
    public static final int APPLICATION_HEIGHT = 300;

    // Method run call only one method to draw caterpillar
    public void run() {
        drawCaterPillar();
    }

    /*
    Method draw caterpillar draw all caterpillar and call different method depend on position of
    out section
     */
    private void drawCaterPillar() {
        for (int i = 0; i < CATERPILLAR_COUNT_OF_SECTIONS; i++) {
            if (i % 2 == 0) {
                drawOddCircles(i);
            } else {
                drawEvenCircles(i);
            }
        }
    }

    /*
    Here we draw even circles and position them higher than odd circles
    We use getHeight() - SIZE - SIZE/2 to set up even circles higher than odd
     */
    private void drawEvenCircles(int i) {
        GOval o = new GOval(i * (SIZE - SIZE /3), getHeight() - SIZE - SIZE /2, SIZE, SIZE);
        o.setFilled(true);
        o.setFillColor(CATERPILLAR_BODY_COLOR);
        o.setColor(CATERPILLAR_BORDER_COLOR);
        add(o);
    }

    /*
     Here we draw only odd circles. 1, 3, 5 etc.
     We use SIZE - SIZE/3 to overlap circles by X
     */
    private void drawOddCircles(int i) {
        GOval o = new GOval(i * (SIZE - SIZE /3), getHeight() - SIZE, SIZE, SIZE);
        o.setFilled(true);
        o.setFillColor(CATERPILLAR_BODY_COLOR);
        o.setColor(CATERPILLAR_BORDER_COLOR);
        add(o);
    }
}
