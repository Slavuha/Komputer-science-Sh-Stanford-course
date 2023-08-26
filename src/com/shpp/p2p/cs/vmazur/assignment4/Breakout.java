package com.shpp.p2p.cs.vmazur.assignment4;

import acm.graphics.*;
import acm.util.RandomGenerator;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;
import java.awt.event.MouseEvent;

/**
 * The program creates game Breakout.
 */
public class Breakout extends WindowProgram {
    // * The time of the pause
    final double PAUSE_TIME = 1000.0 / 48;

    /**
     * Speed of the ball
     */
    private double vx;
    private double vy = 3;

    /**
     * /** Width and height of application window in pixels
     */
    public static final int APPLICATION_WIDTH = 400;
    public static final int APPLICATION_HEIGHT = 600;

     /**
     * Dimensions of the paddle
     */
    private static final int PADDLE_WIDTH = 60;
    private static final int PADDLE_HEIGHT = 10;

    /**
     * Offset of the paddle up from the bottom
     */
    private static final int PADDLE_Y_OFFSET = 30;

    /**
     * Number of bricks per row
     */
    private static final int NBRICKS_PER_ROW = 10;

    /**
     * Number of rows of bricks
     */
    private static final int NBRICK_ROWS = 10;

    /**
     * Separation between bricks
     */
    private static final int BRICK_SEP = 5;

    /**
     * Width of a brick
     */

    private static final int WIDTH_OF_BRICK = APPLICATION_WIDTH / (NBRICKS_PER_ROW) - BRICK_SEP;;

    /**
     * Height of a brick
     */
    private static final int BRICK_HEIGHT = 8;

    /**
     * Radius of the ball in pixels
     */
    private static final int BALL_RADIUS = 10;

    /**
     * Offset of the top brick row from the top
     */
    private static final int BRICK_Y_OFFSET = 70;

    /**
     * Number of turns
     */

    private static int NTURNS = 3;
    /**
     * Crate objects Brick, paddle, ball, label
     */
    GRect brick;
    GRect paddle;
    GOval ball;
    GLabel label;
    //Create var count of bricks from 0 to create right color.
    int countOfBricksFrom0 = 0;

    int countOfBricks = NBRICKS_PER_ROW * NBRICK_ROWS; //Global variable for count of bricks.
    Color colorOfPaddle = Color.GREEN;
    Color[]colorsOfBrics = {Color.RED, Color.YELLOW, Color.ORANGE, Color.GREEN, Color.CYAN};
    public void run() {

        /* You fill this in, along with any subsidiary methods */
        createPaddle();
        createAllBricksForGame(NBRICKS_PER_ROW, NBRICK_ROWS);
        addMouseListeners();
        ball = createBall();
        add(ball);
        waitForClick();
        moveBall(ball);
        if (countOfBricks == 0) {
            createWinLabel();
        }
    }


    /**
     * Method move paddle, when user move mouse.
     * @param mouseEvent - It is simple move of mouse.
     */
    public void mouseMoved(MouseEvent mouseEvent) {

        double paddleX, paddleY;

        if ( (mouseEvent.getX()-PADDLE_WIDTH/2.0) < 0 ) {
            paddleX = 0;
        } else if ((getWidth() - mouseEvent.getX()) < PADDLE_WIDTH/2.0 ) {
            paddleX = getWidth() - PADDLE_WIDTH;
        } else {
            paddleX = mouseEvent.getX()-PADDLE_WIDTH/2.00;
        }
        paddleY = getHeight() - PADDLE_Y_OFFSET - PADDLE_HEIGHT;
        paddle.setLocation(paddleX,paddleY);
        add(paddle);
       }


    /**
     * Method creates a Paddle
     */
    private void createPaddle() {
        paddle = new GRect(
                getWidth() / 2 - PADDLE_WIDTH / 2,
                getHeight() - PADDLE_Y_OFFSET,
                PADDLE_WIDTH,
                PADDLE_HEIGHT);
        paddle.setFilled(true);
        paddle.setColor(colorOfPaddle);
        add(paddle);
    }

    /**
     * Method creates a ball.
     */
    private GOval createBall() {
        GOval gOval = new GOval(
                getWidth() / 2 - BALL_RADIUS / 2,
                getHeight() / 2 - BALL_RADIUS / 2,
                BALL_RADIUS,
                BALL_RADIUS);
        gOval.setFilled(true);
        gOval.setColor(Color.RED);
        return gOval;
    }

    /**
     * Method creates a Paddle
     * @param ball simple ball
     */
    private void moveBall(GOval ball) {

        RandomGenerator rgen = RandomGenerator.getInstance();//Here program used random generator for changing direction of ball.
        vx = rgen.nextDouble(1.0, 3.0);
        if (rgen.nextBoolean(0.5))
            vx = -vx;

        while (NTURNS > 0) {//Program works while user have a lives.
            ball.move(vx, vy);
            pause(PAUSE_TIME);
            getCollidingObject(0, 0);
            getCollidingObject(BALL_RADIUS, BALL_RADIUS);
            changeBalY();
            changeBalX();
            checkIfPlayerDropBallDown();
            if (countOfBricks < 1) {
                break;
            }
        }
    }

    /**
     * Method creates win label.
     */
    private void createWinLabel() {
        GLabel label = new GLabel("You win Bro!!!");
        label.setColor(Color.GREEN);
        label.setFont(new Font("Verdana", Font.PLAIN, 40));
        label.setLocation(
                getWidth() / 2 - label.getWidth() / 2,
                getHeight() / 2);
        add(label);
    }

    /**
     * Method check colliding object.
     */
    private void getCollidingObject(int x, int y) {
        GObject object = getElementAt(ball.getX() + x, ball.getY() + y);
        if (object !=null){
        if (object == paddle) {//If object is paddle  - ball change direction.
            vy = -vy;
        } else {//If object not paddle so brick program removes it.
            try {
                remove(object);
                countOfBricks = countOfBricks - 1;
                System.out.println(countOfBricks);
                vy = -vy;
            } catch (Exception e) {
                System.out.println("Hello Vlad. We have got Exception");
            }}
        }
    }


    /**
     *Method checks ball Y coordinate. If ball colliding with wall ball change direction.
     */
    private void changeBalY() {
        if (ball.getY() < 0) {
            vy = -vy;
        }
    }

    /**
     * Method checks ball X coordinate. If ball colliding with wall ball change direction.
     */
    private void changeBalX() {
        if (ball.getX() < 0
                || (ball.getX() > getWidth() - BALL_RADIUS)) {
            vx = -vx;
        }
    }

    /**
     * Method check Y coordinate of the ball
     * When the ball fall down we are losing 1 life
     * After lost life method set location of the ball in the middle
     */
    private void checkIfPlayerDropBallDown() {
        if (ball.getY() > (getHeight() - BALL_RADIUS)) {
            NTURNS = NTURNS - 1;
            ball.setLocation(
                    getWidth() / 2 - BALL_RADIUS / 2,
                    getHeight() / 2 - BALL_RADIUS / 2);
            waitForClick();
            createLabelWithCountsOfTurns();
            if (NTURNS == 0) {
                remove(ball);
                createFinishLable();
            }
        }
    }

    /**
     * The method creating label with count of lives. After little pause this label removing.
     */
    private void createLabelWithCountsOfTurns() {
        String str = String.valueOf(NTURNS);
        label = new GLabel("You have got lifes" + str);
        label.setColor(Color.BLUE);
        label.setLocation(20, 20);
        add(label);
        pause(777);
        remove(label);
    }

    /**
     * Method creates finale label when you are lost.
     */
    private void createFinishLable() {
        GLabel label = new GLabel("GAME OVER!!! YOU LOSE!!!");
        label.setColor(Color.ORANGE);
        label.setLocation(getWidth() / 2 - label.getWidth() / 2,
                getHeight() / 2);
        label.setFont(new Font("Verdana", Font.PLAIN, 18));
        add(label);
    }

    /**
     * The method creating all brick for game according to requirements of settings.
     *
     * @param x taking quantity of bricks per row from constanta.
     * @param y taking quantity of rows in game from constanta.
     */
    private void createAllBricksForGame(int x, int y) {
        for (int i = 0; i < NBRICK_ROWS; i++) {
            createBrickRow(x, y);
            y +=   (BRICK_HEIGHT + BRICK_SEP);
        }
    }

    /**
     * The method creating row of bricks.
     */
    private void createBrickRow(int x, int y) {
        for (int i = 0; i < NBRICKS_PER_ROW; i++) {
            createBrick(x - (NBRICKS_PER_ROW),
                    y+ BRICK_Y_OFFSET);
            x = x + WIDTH_OF_BRICK + BRICK_SEP;
        }
    }

    /**
     * Simple creating Brick.
     * @param x We use these parameters from pervier methods to correcting location of Brick.
     * @param y We use these parameters from pervier methods to correcting location of Brick.
     */
    private void createBrick(int x, int y) {
        brick = new GRect(
                x,y, WIDTH_OF_BRICK, BRICK_HEIGHT);
        countOfBricksFrom0 = countOfBricksFrom0 + 1;
        brick.setFilled(true);
        // This step we control color of bricks.
        if (countOfBricksFrom0 <= NBRICKS_PER_ROW * 2) {
            brick.setColor(colorsOfBrics[0]);
        } else if (countOfBricksFrom0 <= NBRICKS_PER_ROW * 4) {
            brick.setColor(colorsOfBrics[1]);
        } else if (countOfBricksFrom0 <= NBRICKS_PER_ROW * 6) {
            brick.setColor(colorsOfBrics[2]);
        } else if (countOfBricksFrom0 <= NBRICKS_PER_ROW * 8) {
            brick.setColor(colorsOfBrics[3]);
        } else {
            brick.setColor(colorsOfBrics[4]);
        }
        add(brick);
    }
}
