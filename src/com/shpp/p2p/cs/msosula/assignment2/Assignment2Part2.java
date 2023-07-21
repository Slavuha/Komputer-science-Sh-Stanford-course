package com.shpp.p2p.cs.msosula.assignment2;

import acm.graphics.GOval;
import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

public class Assignment2Part2 extends WindowProgram {
    /*
    Constants APPLICATION_WIDTH and APPLICATION_HEIGHT used to hold size of window view with images
     */
    public static final int APPLICATION_WIDTH = 200;
    public static final int APPLICATION_HEIGHT = 200;
    // Constant hold size for circle and rectangle size
    private static final int SIZE = 100;

    // Main method to draw our illusion
    public void run() {
        //setBackground(Color.GRAY);
        drawIllusion(SIZE);
    }

    /*
    This method used to create 4 circles with different cordinates
    Also create 1 rectangle which starts from center of circle
     */
    private void drawIllusion(int size) {
        drawCircle(0, 0, size);
        drawCircle(getWidth() - size, 0, size);
        drawCircle(0, getHeight() - size, size);
        drawCircle(getWidth() - size, getHeight() - size, size);

        drawRectangle(size / 2, size / 2, getWidth() - size, getHeight() - size);
    }

    // Method accepts coordinates depend on size and getWidth, getHeight for build circle
    private void drawRectangle(int cordX, int cordY, int width, int height) {
        GRect rectangle = new GRect(cordX, cordY, width, height);
        rectangle.setFilled(true);
        rectangle.setFillColor(Color.WHITE);
        add(rectangle);
    }

    // Method accepts coordinates depend on size and getWidth, getHeight for build circl
    private void drawCircle(int cordX, int cordY, int size) {
        GOval circle = new GOval(cordX, cordY, size, size);
        circle.setFilled(true);
        circle.setFillColor(Color.BLACK);
        add(circle);
    }

}
