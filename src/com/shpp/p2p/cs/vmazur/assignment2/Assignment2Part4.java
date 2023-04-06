package com.shpp.p2p.cs.vmazur.assignment2;

import acm.graphics.GLabel;
import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

/**
 * Program that create flag of Orangutatiya
 */

public class Assignment2Part4 extends WindowProgram {
    private static final int RECT_WIGHT = 100;
    private static final int RECT_HIGHT = 400;

    public void run() {
        createTheFlagOfOrangutaniya();
        createTittle();
    }

    /**
     * This method create tittle in right down conner.
     * Text located always in this position.
     */
    private void createTittle() {
        GLabel label = new GLabel("FLAG OF GOLODNII ORANGUTANGI ");
        label.setColor(Color.GREEN);
        double width = label.getWidth();
        label.setLocation(getWidth() - width, getHeight()
                - label.getDescent());
        add(label);
    }

    /**
     * This method create the flag through create three rect in a for cycle
     * Also I add flag to blue color
     */
    private void createTheFlagOfOrangutaniya() {
        Color color = Color.green;
     //   boolean blue = true;
        int x = getWidth() / 2 - RECT_WIGHT - RECT_WIGHT / 2;
        int y = getHeight() / 2 - RECT_HIGHT / 2;
        for (int i = 0; i < 3; i++) {

            switch (i){
                case 0 -> color = Color.green;
                case 1 -> color = Color.RED;
                case 2 -> color = Color.PINK;

            }
            creteRect(x, y,
            //        blue
                    color
            );

          //  blue = !blue;
            x = x + RECT_WIGHT;
        }
    }


    /**
     * Create rect
     *
     * @param x
     * @param y //* @param blue exclude two blue together
     */
    private void creteRect(int x, int y,
                           //boolean blue
                           Color color
    )
    {
        GRect rect = new GRect(
                x,
                y,
                RECT_WIGHT, RECT_HIGHT);
        rect.setFilled(true);
        rect.setFillColor(color
        //        blue ? Color.GREEN : Color.BLUE
        );
        add(rect);
    }
}

