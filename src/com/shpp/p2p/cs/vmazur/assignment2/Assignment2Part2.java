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
     * //    * @param args
     */
    public static final int APPLICATION_WIDTH = 70;
    public static final int APPLICATION_HEIGHT = 100;
    public static final double CIRCLE_DIAMETER = (APPLICATION_HEIGHT < APPLICATION_WIDTH) ?
            (APPLICATION_HEIGHT / 3) : (APPLICATION_WIDTH / 3);

    public void run() {
        createPitcher();
    }

    /**
     * This method involve all composition.
     */
    private void createPitcher() {
        creteCircles();
        creteRect();

    }

    /**
     * This method create rect, fill it, give color.
     */
    private void creteRect() {
        GRect rect = new GRect(
                CIRCLE_DIAMETER / 2,
                CIRCLE_DIAMETER / 2,
                getWidth() - CIRCLE_DIAMETER,
                getHeight() - CIRCLE_DIAMETER);
        rect.setFilled(true);
        rect.setColor(Color.WHITE);
        add(rect);

    }

    /**
     * This method involve and add circles.
     */
    private void creteCircles() {
        add(creteCircle(0, 0, CIRCLE_DIAMETER, CIRCLE_DIAMETER));
        add(creteCircle(getWidth() - CIRCLE_DIAMETER, 0, CIRCLE_DIAMETER, CIRCLE_DIAMETER));
        add(creteCircle(getWidth() - CIRCLE_DIAMETER, getHeight() - CIRCLE_DIAMETER, CIRCLE_DIAMETER, CIRCLE_DIAMETER));
        add(creteCircle(0, getHeight() - CIRCLE_DIAMETER, CIRCLE_DIAMETER, CIRCLE_DIAMETER));
    }

    /**
     * This method create circle, fill it, give color.
     *
     * @param x
     * @param y
     * @param circleWidth
     * @param circleHeight
     * @return
     */
    private GObject creteCircle(double x, double y, double circleWidth, double circleHeight) {
        GOval circle = new GOval(x, y, circleWidth, circleHeight);
        circle.setFilled(true);
        circle.setColor(Color.BLACK);
        return circle;
    }
}




