package com.shpp.p2p.cs.vmazur.assignment2;

import acm.graphics.GObject;
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
        creteIllysoruContouse();
    }

    /**
     * This method involve all composition.
     */
    private void creteIllysoruContouse() {
        creteCircles();
        creteRect();
    }
    /**
     * This method create rect, fill it, give color.
     */
    private void creteRect() {
        GRect rect = new GRect(0+CIRCLE_HEIGHT/2, 0+CIRCLE_WIDTH/2, RECT_WIDTH,RECT_HEIGHT);
        rect.setFilled(true);
        rect.setColor(Color.WHITE);
        add(rect);

    }
    /**
     * This method involve and add circles.
     */
    private void creteCircles() {
        add(creteCircle(0,0, CIRCLE_WIDTH, CIRCLE_HEIGHT));
        add(creteCircle(getWidth()-CIRCLE_WIDTH,0, CIRCLE_WIDTH, CIRCLE_HEIGHT));
        add(creteCircle(getWidth()-CIRCLE_WIDTH, getHeight()-CIRCLE_HEIGHT, CIRCLE_WIDTH, CIRCLE_HEIGHT));
        add(creteCircle(0, getHeight()-CIRCLE_HEIGHT, CIRCLE_WIDTH, CIRCLE_HEIGHT));
    }

    /**
     * This method create circle, fill it, give color.
     * @param x
     * @param y
     * @param circleWidth
     * @param circleHeight
     * @return
     */
    private GObject creteCircle(int x, int y, int circleWidth, int circleHeight) {
        GOval circle = new GOval(x, y, circleWidth, circleHeight);
        circle.setFilled(true);
        circle.setColor(Color.BLACK);
        return circle;
    }
}




