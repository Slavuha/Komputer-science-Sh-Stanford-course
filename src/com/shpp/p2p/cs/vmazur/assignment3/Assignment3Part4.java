package com.shpp.p2p.cs.vmazur.assignment3;

import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

/**
 * Class create pyramid of Kleopatra
 */
public class Assignment3Part4 extends WindowProgram {

    private static final int BRICK_HEIGHT = 40;
    private static final int BRICK_WIDTH = 60;
    private static int BRICKS_IN_BASE = 10;

    public void run() {
        createPyramid();
    }

    /**
     * Method create pyramid in 2 cycles.
     * First create row and second create columns.
     */
    private void createPyramid() {
        int x = 0;
        int y = 0;
        for (int j = BRICKS_IN_BASE; j > 0; j--) {
            for (int i = 0; i < BRICKS_IN_BASE; i++) {
                createBrick(x, y);
                x = x + BRICK_WIDTH;
            }
            x = 0;
            y = y - BRICK_HEIGHT;
            BRICKS_IN_BASE = BRICKS_IN_BASE - 1;
        }
    }

    /**
     * Method create brick for pyramid.
     * @param x set coordinate to next brick.
     * @param y set coordinate to next row.
     */
    private void createBrick(int x, int y) {
        GRect brick = new GRect(
                x + getWidth() / 2 - (BRICK_WIDTH * BRICKS_IN_BASE) / 2,
                getHeight() - BRICK_HEIGHT + y,

                BRICK_WIDTH,
                BRICK_HEIGHT
        );
        brick.setFilled(true);
        brick.setColor(Color.red);
        brick.setFillColor(Color.green);
        add(brick);
    }
}
