package com.shpp.p2p.cs.msosula.assignment2;

import acm.graphics.GLabel;
import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

public class Assignment2Part4 extends WindowProgram {
    // Width of flag stripes
    private static final int FLAG_WIDTH = 100;
    // Height of flag stripes
    private static final int FLAG_HEIGHT = 100;
    // Here we set up new yellow color constant for use it for build flag
    private static final int STRIPE_COUNT = 3;
    private static final Color SELECTIVE_YELLOW = new Color(253, 186, 13);
    // Here we set up new green color constant for use it for build flag
    private static final Color SELECTIVE_GREEN = new Color(1, 107, 66);
    // Here we set up new red color constant for use it for build flag
    private static final Color SELECTIVE_RED = new Color(195, 33, 41);
    // Here we set up constant for hold label value
    private static final String COUNTRY_FLAG_NAME = "Flag of Lithuania";

    // Constants for set up height and width
    public static final int APPLICATION_WIDTH = 200;
    public static final int APPLICATION_HEIGHT = 200;

    /*
    In run() method we call to method drawFlag() for draw a flag
    and addLabel() to add label in bottom right corner
     */
    public void run() {
        drawFlag();
        addLabel();
    }

    /*
    Method implements method for display label and position it depend on width and height of window
     */
    private void addLabel() {
        GLabel label = new GLabel(COUNTRY_FLAG_NAME);
        label.setFont("Calibri-17");
        label.setColor(Color.BLACK);
        double labelXCord = (getWidth() - label.getWidth());
        double labelYCord = (getHeight() - label.getDescent());
        add(label, labelXCord, labelYCord);
    }

    /*
    Method implements draw flag and position it depend on window size
     */
    private void drawFlag() {
        // We set up position of flag in the middle of window
        int startCordX = (getWidth() - FLAG_WIDTH) / 2;
        int startCordY = (getHeight() - FLAG_HEIGHT) / 2;

        // Here we calculate stripe height to use it in build flag
        double stripeHeight = FLAG_HEIGHT / STRIPE_COUNT;
        // We save all colors if array to get them from loop
        Color[] stripeColors = {SELECTIVE_YELLOW, SELECTIVE_GREEN, SELECTIVE_RED};

        // Loop to create flag depend
        for (int i = 0; i < STRIPE_COUNT; i++) {
            GRect stripe = new GRect(startCordX, startCordY + (i * stripeHeight), FLAG_WIDTH, stripeHeight);
            stripe.setFilled(true);
            stripe.setFillColor(stripeColors[i]);
            stripe.setColor(stripeColors[i]);
            add(stripe);
        }
    }
}
