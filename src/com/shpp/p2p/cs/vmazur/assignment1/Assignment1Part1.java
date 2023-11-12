package com.shpp.p2p.cs.vmazur.assignment1;

import com.shpp.karel.KarelTheRobot;
//Program collect newspaper
public class Assignment1Part1 extends KarelTheRobot {
    public void run() throws Exception {
        moveToBeeper();
        pickBeeper();
        moveToStart();
    }

    /**
     * method with move to the beeper
     * Karel located in left up conner in the house, oriented to the earth and want go to the newspaper
     * Result: Karel came to the newspaper
     *
     * @throws Exception
     */
    private void moveToBeeper() throws Exception {
        turnRight();
        move();
        turnLeft();
        moveUntilBeeperPresent();
    }


    /**
     * Karel moves to beeper.
     * @throws Exception
     */
    private void moveUntilBeeperPresent() throws Exception {
        while (!beepersPresent()){
            move();
        }
    }

    /**
     * method with move to the start
     * Karel wants to come to the house with his favorite newspaper
     * Result: Karel came to the home to the previous state in his favorite room
     *
     * @throws Exception
     */
    private void moveToStart() throws Exception {
        turnLeft();
        turnLeft();
        moveUntilFrontIsClear();
        turnRight();
        move();
        turnRight();

    }

    /**
     * Karel will go to the wall
     * Result Karel came to the wall
     *
     * @throws Exception
     */
    private void moveUntilFrontIsClear() throws Exception {
        while (frontIsClear())
            move();
    }

    /**
     * Karel turn right on 90 degree
     *
     * @throws Exception
     */
    private void turnRight() throws Exception {
        for (int i = 0; i < 3; i++) {
            turnLeft();
        }
    }
}