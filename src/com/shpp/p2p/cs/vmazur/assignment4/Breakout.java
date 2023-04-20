package com.shpp.p2p.cs.vmazur.assignment4;

import acm.graphics.GLabel;
import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.util.RandomGenerator;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;
import java.awt.event.MouseEvent;

//kode wrote not beatefull
//Do not check all conors of the ball, only first
//There are no comets
//There are no file write.txt
//
public class Breakout extends WindowProgram {
    /**
     * Speed of the ball
     */
    private double vx;
    private double vy = 3;
    //The time of the pause
    public static final double PAUSE_TIME = 1000.0 / 48;

    /**
     * Width and height of application window in pixels
     */
    public static final int APPLICATION_WIDTH = 400;
    public static final int APPLICATION_HEIGHT = 600;

    /**
     * Dimensions of game board (usually the same)
     */
    private static final int WIDTH = APPLICATION_WIDTH;
    private static final int HEIGHT = APPLICATION_HEIGHT;

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
    private static final int NBRICKS_PER_ROW = 2;

    /**
     * Number of rows of bricks
     */
    private static final int NBRICK_ROWS = 10;

    /**
     * Separation between bricks
     */
    private static final int BRICK_SEP = 4;

    /**
     * Width of a brick
     */
    private static final int BRICK_WIDTH =
            (WIDTH -
                    (NBRICKS_PER_ROW - 1) * BRICK_SEP) / NBRICKS_PER_ROW;

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
    private static
    //final
            int NTURNS = 3;
    GRect brik; //Crate objects Brik, paddle, ball, label
    GRect paddle;
    GOval ball;
    GLabel label;

    int coutOfBriks = NBRICKS_PER_ROW * NBRICK_ROWS;

    public void run() {
        /* You fill this in, along with any subsidiary methods */

//        setSize(WIDTH, HEIGHT);
        createBriks(NBRICKS_PER_ROW, NBRICK_ROWS);
        createPaddle();
        addMouseListeners();
        ball = createBall();
        add(ball);
        waitForClick();
        moveBall(ball);
        if (coutOfBriks == 0) {
            createWinLable();
        }
    }

    private void createWinLable() {
        GLabel label = new GLabel("You win Bro!!!");
        label.setColor(Color.GREEN);
        label.setFont(new Font("Verdana", Font.PLAIN, 40));
        label.setLocation(
                getWidth() / 2 - label.getWidth() / 2,
                getHeight() / 2
        );
        add(label);
    }

    private void createLable() {

        String str = String.valueOf(NTURNS);
        label = new GLabel("You have got lifes" + str);
        label.setColor(Color.BLUE);
        label.setLocation(20, 20);
        add(label);
        pause(777);
        remove(label);
    }

    private void createBriks(int x, int y) {

        for (int i = 0; i < NBRICK_ROWS; i++) {
            createBrikRow(x, y);
            y = y + BRICK_HEIGHT + BRICK_SEP;
        }
    }

    private void createBrikRow(int x, int y) {
        for (int i = 0; i < NBRICKS_PER_ROW; i++) {
            createBrik(x, y);
            x = x + BRICK_WIDTH + BRICK_SEP;
        }
    }
    //Create var coutOfBriksFrom0 to create right color.
    int coutOfBriksFrom0= 0;

    /**
     * Simple creating Brik.
     * @param x We use these parameters from pervier methods to correcting location of Brick.
     * @param y
     */
    private void createBrik(int x, int y) {

        brik = new GRect(
                x - (NBRICKS_PER_ROW),
                y + BRICK_Y_OFFSET,
                BRICK_WIDTH,
                BRICK_HEIGHT
        );
        coutOfBriksFrom0 = coutOfBriksFrom0 + 1;
        brik.setFilled(true);
        // This step we control color of bricks.
        if (coutOfBriksFrom0 <= NBRICKS_PER_ROW * 2) {
            brik.setColor(Color.RED);
        } else if (coutOfBriksFrom0 <= NBRICKS_PER_ROW * 4) {
            brik.setColor(Color.ORANGE);
        } else if (coutOfBriksFrom0 <= NBRICKS_PER_ROW * 6) {
            brik.setColor(Color.YELLOW);
        } else if (coutOfBriksFrom0 <= NBRICKS_PER_ROW * 8) {
            brik.setColor(Color.GREEN);
        } else {
            brik.setColor(Color.CYAN);
        }
        add(brik);
    }

    private void moveBall(GOval ball) {
        RandomGenerator rgen = RandomGenerator.getInstance();
        vx = rgen.nextDouble(1.0, 3.0);
        if (rgen.nextBoolean(0.5))
            vx = -vx;

        while (NTURNS > 0) {
            ball.move(vx, vy);
            pause(PAUSE_TIME);
            getCollidingObject(0, 0);
            getCollidingObject(BALL_RADIUS, 0);
            getCollidingObject(0, BALL_RADIUS);
            getCollidingObject(BALL_RADIUS, BALL_RADIUS);

            checkBalY();
            checkBalX();
            checkIfPlayerDropBallDown();
            if (coutOfBriks < 1) {
                break;
            }

        }
    }

    private void checkBalY() {
        if (ball.getY() < 0) {
            vy = -vy;
        }
    }

    private void checkBalX() {
        if (ball.getX() < 0
                || (ball.getX() > getWidth() - BALL_RADIUS)) {
            vx = -vx;
        }
    }

    /**
     * Method check Y coordinate of the ball
     * When the ball fall down we are losing 1 life
     * After lost life method set locathion of the ball in the middle
     */
    private void checkIfPlayerDropBallDown() {
        if (ball.getY() > (getHeight() - BALL_RADIUS)) {
            NTURNS = NTURNS - 1;
            ball.setLocation(
                    getWidth() / 2 - BALL_RADIUS / 2,
                    getHeight() / 2 - BALL_RADIUS / 2);

            waitForClick();
            createLable();
            if (NTURNS == 0) {
                remove(ball);
                createFinishLable();
            }
        }
    }

    private void createFinishLable() {
        GLabel label = new GLabel("GAME OVER!!! YOU LOSE!!!");
        label.setColor(Color.ORANGE);
        label.setLocation(getWidth() / 2 - label.getWidth() / 2,
                getHeight() / 2);
        label.setFont(new Font("Verdana", Font.PLAIN, 18));
        add(label);
    }

    private void getCollidingObject(int x, int y) {
        GObject object = getElementAt(ball.getX()+x, ball.getY()+y);
        if (object == paddle) {
            vy = -vy;
        } else {
            try {
                remove(object);
                coutOfBriks = coutOfBriks - 1;
                System.out.println(coutOfBriks);
                vy = -vy;
            } catch (Exception e) {

            }
        }
    }


    private GObject chekAllPoints(double x, double y) {
        GObject gObject = getElementAt(x, y);
        return gObject;

//        gObject = getElementAt(x+BALL_RADIUS, y);
//        return gObject;
    }

    private GOval createBall() {
        GOval gOval = new GOval(
                getWidth() / 2 - BALL_RADIUS / 2,
                getHeight() / 2 - BALL_RADIUS / 2,
                BALL_RADIUS,
                BALL_RADIUS
        );
        gOval.setFilled(true);
        gOval.setColor(Color.RED);
        return gOval;
    }

    private GObject selectedObject = null;
    private double lastX = 0;


    public void mousePressed(MouseEvent e) {
        selectedObject = getElementAt(e.getX(), e.getY());
        lastX = e.getX();
    }

    public void mouseDragged(MouseEvent e) {
        if (selectedObject != null) {
            double dx = e.getX() - lastX;
            if (selectedObject.getX() <= 0) {
                dx = 0;
                selectedObject.move(1, 0);
            }
            if (selectedObject.getX() >= getWidth() - selectedObject.getWidth()) {
                dx = 0;
                selectedObject.move(-1, 0);
            }

            selectedObject.move(dx, 0);

            lastX = e.getX();

        }
    }

    private void createPaddle() {
        paddle = new GRect(
                getWidth() / 2 - PADDLE_WIDTH / 2,
                getHeight() - PADDLE_Y_OFFSET - 10,
                PADDLE_WIDTH,
                PADDLE_HEIGHT);

        paddle.setFilled(true);
        paddle.setColor(Color.GREEN);
        add(paddle);


    }
}





