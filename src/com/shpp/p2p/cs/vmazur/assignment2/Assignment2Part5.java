package com.shpp.p2p.cs.vmazur.assignment2;

import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

//Program draws optical illusion.
public class Assignment2Part5 extends WindowProgram {
    /* The number of rows and columns in the grid, respectively. */
    private static final int NUM_RECT_IN_COL = 6;
    private static final int NUM_RECT_ROWS = 6;
    /* The width and height of each box. */
    private static final double BOX_SIZE = 40;
    /* The horizontal and vertical spacing between the boxes. */
    private static final int BOX_SPACING = 10;

    public void run() {
        int numRows = NUM_RECT_ROWS;
        int numCols = NUM_RECT_IN_COL;
        for (int i = 0; i < NUM_RECT_IN_COL; i++) {
            createRow(numRows, numCols);
            numCols = (int) (numCols + BOX_SPACING + BOX_SIZE);
        }
    }
    // This method create row of boxes.
    //It used constanta in cycle.
    //In parameters method give right coordinate to create nex box.
    private void createRow(int numRows, int numCols) {
        for (int i = 0; i < NUM_RECT_ROWS; i++) {
            createBox(numRows, numCols);
            numRows = (int) (numRows + (BOX_SIZE + BOX_SPACING));
        }
    }

    //This method create box.
    //The start position calculate ib dependency of settings.
    private void createBox(int numRows, int numCols) {
        GRect rect = new GRect(
                getWidth() / 2 - (BOX_SPACING + BOX_SIZE) * NUM_RECT_ROWS / 2 + numRows,
                getHeight() / 2 - (BOX_SPACING + BOX_SIZE) * NUM_RECT_IN_COL / 2 + numCols,
                BOX_SIZE, BOX_SIZE);
        rect.setFilled(true);
        rect.setFillColor(Color.BLACK);
        rect.setColor(Color.BLACK);
        add(rect);
    }
}
