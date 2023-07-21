package com.shpp.p2p.cs.msosula.assignment2;

import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

public class Assignment2Part5 extends WindowProgram {
    /* The number of rows and columns in the grid, respectively. */
    private static final int NUM_ROWS = 7;
    private static final int NUM_COLS = 7;

    /* The width and height of each box. */
    private static final double BOX_SIZE = 70;

    /* The horizontal and vertical spacing between the boxes. */
    private static final double BOX_SPACING = 10;

    public void run() {
        // Calculates total width and height for position illusion in the middle of window
        double totalImageWidth = NUM_COLS * BOX_SIZE + (NUM_COLS - 1) * BOX_SPACING;
        double totalImageHeight = NUM_ROWS * BOX_SIZE + (NUM_ROWS - 1) * BOX_SPACING;

        // Center position of illusion depend on total widt hand height
        double centerPositionByX = (getWidth() - totalImageWidth) / 2;
        double centerPositionByY = (getHeight() - totalImageHeight) / 2;

        // Loop for draw rectangles
        for (int i = 0; i < NUM_ROWS; i++) {
            for (int j = 0; j < NUM_COLS; j++) {
                double x = centerPositionByX + j * (BOX_SIZE + BOX_SPACING);
                double y = centerPositionByY + i * (BOX_SIZE + BOX_SPACING);
                drawRectangle(x, y);
            }
        }
    }

    // Method for draw 1 rectangle depend on coordinates of rectangle in array [0.0, 0.1...] etc.
    private void drawRectangle(double x, double y) {
        GRect rectangle = new GRect(x, y, BOX_SIZE, BOX_SIZE);
        rectangle.setFilled(true);
        rectangle.setFillColor(Color.BLACK);
        //rectangle.setColor(Color.WHITE);
        add(rectangle);
    }
}
