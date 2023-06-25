package com.shpp.p2p.cs.vmazur.assignment2;

import acm.graphics.GLabel;
import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

//Program create flag
public class Assignment2Part4 extends WindowProgram {
    private static final int RECT_WIGHT = 100;
    private static final int RECT_HIGHT = 400;

    public void run() {
        createFlag();
        createTittle();
    }
// This method create full flag throw cycle & switch.
    private void createFlag() {
        Color color = Color.PINK;
        int x = getWidth() / 2 - RECT_WIGHT - RECT_WIGHT / 2;
        for (int i = 0; i < 3; i++) {
            switch (i) {
                case 0 -> color = Color.BLACK;
                case 1 -> color = Color.RED;
                case 2 -> color = Color.GREEN;
            }
            createRect(x, color);
            x = x + RECT_WIGHT;
        }
    }

    // This method create simple rect.
    // It got need color & position at x coordinate.
    private void createRect(int x, Color color) {
        int y = getHeight() / 2 - RECT_HIGHT / 2;
        GRect rect = new GRect(x,
                y,
                RECT_WIGHT, RECT_HIGHT);

        rect.setFilled(true);
        rect.setColor(color);
        add(rect);

    }

    /**
     * This method create tittle in right down conner.
     * Text located always in this position.
     */
    private void createTittle() {
        GLabel label = new GLabel("FLAG OF VYSOKEY ");
        label.setColor(Color.PINK);
        double width = label.getWidth();
        label.setLocation(getWidth() - width, getHeight()
                - label.getDescent());
        add(label);
    }
}
