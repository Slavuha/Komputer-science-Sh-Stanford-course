package com.shpp.p2p.cs.vmazur.assignment3;

import acm.graphics.GLabel;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

/*
 * The class creates animation in 5 seconds.
 */
public class Assignment3Part6 extends WindowProgram {

//Pause_TIME is the set quantity of cadres in second

    private static final double PAUSE_TIME = 1000.0 / 50;

    //In the run set the current time of the system. Create a label and move it until 5 seconds is over.
    public void run() {
        long start = System.currentTimeMillis();
        moveLabel(start, createLabel());
        System.out.println("Total time is " + (System.currentTimeMillis() - start));
    }

    /**
     * The method moves the label on the x coordinate until 5 seconds left.
     *
     * @param start - The start time of the program.
     * @param label - Take the label created in a method to create the label.
     */
    private void moveLabel(long start, GLabel label) {
        while (System.currentTimeMillis() - start <= 5000) {
            label.move(1.8, 0);
            pause(PAUSE_TIME);
            System.out.println(System.currentTimeMillis() - start);
        }
    }

    /**
     * The method created a label, set its color, and text and add a label to the canvas.
     *
     * @return created a label.
     */


    private GLabel createLabel() {
        GLabel label = new GLabel("Golodnie Orangutangi", 0, getHeight() / 2.0);
        label.setFont("Comic Sans-32");
        label.setColor(Color.GREEN);
        add(label);
        return label;
    }
}



