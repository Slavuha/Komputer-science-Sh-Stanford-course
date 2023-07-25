package com.shpp.p2p.cs.vmazur.assignment3;
import acm.graphics.GOval;
import com.shpp.cs.a.graphics.WindowProgram;
import java.awt.*;
//The program animation.
public class Assignment3Part6 extends WindowProgram {
    private static final double PAUSE_TIME = 1000.0 / 50; //Time pause for animation.
    GOval oval; //Announced variable oval to use it in diferent methods.

    public void run() {
        long timeStart = System.currentTimeMillis(); //Variable with time of start program.
        createBall();
        while ((System.currentTimeMillis() - timeStart) <= 5000) { //Program work not mor 5 sekond.
            moveBall();
            System.out.println("Time " + (System.currentTimeMillis() - timeStart)); ///Time count display.
        }
    }
    //Method with moves ball.
    private void moveBall() {
        oval.move(2, 1);
        pause(PAUSE_TIME);//There used pause to made animation.
    }
    //Simple create ball, wich will moving.
    private void createBall() {
        oval = new GOval(0, 0, 100, 100);
        oval.setFilled(true);
        oval.setColor(Color.GREEN);
        add(oval);
    }
}

