package com.shpp.p2p.cs.vmazur.assignment3;
import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.util.RandomGenerator;
import com.shpp.cs.a.graphics.WindowProgram;

/**
 * Class create animation on the 5 seconds.
 */
public class Assignment3Part6 extends WindowProgram {
    private static final int NUMBERS_OF_OVALS = 50;
    public int OVAL_SIZE = 90;
    public int NUMBER_OF_MOVES = 5;
    GObject[] arr = new GObject[NUMBERS_OF_OVALS];
    RandomGenerator rgen = RandomGenerator.getInstance();
    private static final double PAUSE_TIME = 1000.0 / 50;
    long start = System.currentTimeMillis();
    long stop = start + 5000;

    /**
     * Settings set so program work only 5 seconds.
     */
    public void run() {
        System.out.println("Start" + start);
        addRandomOvals();
        while (System.currentTimeMillis() < stop) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < NUMBER_OF_MOVES; j++) {
                    arr[i].move(-10, 15);
                    pause(PAUSE_TIME);
                }
            }
        }
        System.out.println("Stop " + stop);
    }

    /**
     * Method add random ovals to the canvas.
     */
    private void addRandomOvals() {
        for (int i = 0; i < NUMBERS_OF_OVALS; i++) {
            GOval oval = createOval();
            add(oval);
            arr[i] = oval;
        }
}

    /**
     * Method create oval with random location.
     * @return simple Oval
     */
    private GOval createOval() {
        GOval oval = new GOval(
                rgen.nextDouble(0, getWidth() - OVAL_SIZE),
                rgen.nextDouble(0, getHeight() - OVAL_SIZE),
                OVAL_SIZE, OVAL_SIZE);
        oval.setFilled(true);
        oval.setColor(rgen.nextColor());
        return oval;
    }
}
