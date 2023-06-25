package com.shpp.p2p.cs.vmazurOld.assignment2;

import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;
import java.awt.*;

/**
 * Program draw an optical illusion with black rect in matrix.
 */
public class Assignment2Part5 extends WindowProgram {
    /* The number of rows and columns in the grid, respectively. */
    private static final int NUM_RECT_IN_COL = 7;
    private static final int NUM_RECT_ROWS = 6;
    /* The width and height of each box. */
    private static final double BOX_SIZE = 40;
    /* The horizontal and vertical spacing between the boxes. */
    private static final int BOX_SPACING = 10;

    public void run() {

        drawFullBord(NUM_RECT_ROWS, NUM_RECT_IN_COL);
    }


    /**
     * Program draw full board
     * @param numRows
     * @param numCols I did indent between rows within increase numCols that descends on y axes.
     */
    private void drawFullBord(int numRows, int numCols) {
        for (int i = 0; i < NUM_RECT_IN_COL; i ++){
            drawRow(numRows, numCols);
            numCols = (int) (numCols + (BOX_SIZE+BOX_SPACING));
        }
    }
    /**
     * Program draw a row of rect.
     * @param numRows I increased this parameter each cycle to did indent between rect
     * @param numCols
     */
    private void drawRow(int numRows, int numCols) {
        for (int i = 0; i < NUM_RECT_ROWS; i++) {
            createRect(numRows,numCols);
            numRows = (int) (numRows + (BOX_SIZE + BOX_SPACING));
        }
    }
    /**
     * Create a Rect, setFillet it, setFillColor and set color
     * In x and y coordinate set correct position and our composition located in the middle.
     * @param rowNumber
     * @param colNumber
     */
    private void createRect( int rowNumber, int colNumber) {
        GRect rect = new GRect(
        getWidth()/2-(BOX_SPACING+BOX_SIZE)* NUM_RECT_ROWS /2 + rowNumber,
        getHeight()/2-(BOX_SPACING+BOX_SIZE)* NUM_RECT_IN_COL /2 + colNumber,
                BOX_SIZE, BOX_SIZE);
        rect.setFilled(true);
        rect.setFillColor(Color.BLACK);
        rect.setColor(Color.BLACK);
        add(rect);
    }
}

