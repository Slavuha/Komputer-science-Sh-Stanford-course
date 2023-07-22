package com.shpp.p2p.cs.vmazur.assignment3;
import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;
import java.awt.*;

//The program is creating pyramid now.
public class Assignment3Part4 extends WindowProgram {
    int BRICK_HEIGHT = 40; //Height of brick
    int BRICKS_IN_BASE = 6; //Count of bricks in base.
    int BRICK_WIDTH = 100; // Width of brick.

    public void run() {
        int y = 0; //Local variable to control y coordinate for create next row.
        while (BRICKS_IN_BASE > 0) {//Cycle for create next row. When count of bricks is 0 program was stop.
            createRowOfBricks(y);
            y = y + BRICK_HEIGHT; //Control next row on y coordinate.
            BRICKS_IN_BASE--;//Counter for decrease bricks.
            }
    }
    //The row of bricks was created.
    private void createRowOfBricks(int y) {
        int x = 0;//Local variable for control new bricks at x coordinate.
        for (int i = 0; i < BRICKS_IN_BASE; i++) {
            createBrick(x, y);
            x = x + BRICK_WIDTH;//Increase x for next brick.
        }
    }
    //Create simple brick.
    //Transmit parameters x and y to control bricks.
    //Pyramid was set at mid of canvas.

    private void createBrick(int x, int y) {
        GRect gRect = new GRect(
                x + getWidth() / 2 - (BRICKS_IN_BASE * BRICK_WIDTH) / 2,
                (getHeight() - BRICK_HEIGHT) - y,
                BRICK_WIDTH,
                BRICK_HEIGHT
        );
        gRect.setFilled(true);
        gRect.setColor(Color.RED);
        gRect.setFillColor(Color.GREEN);
        add(gRect);
    }
}
