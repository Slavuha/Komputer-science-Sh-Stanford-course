package com.shpp.p2p.cs.vmazur.assignment2;

import acm.graphics.GCompound;
import acm.graphics.GObject;
import acm.graphics.GOval;
import com.shpp.cs.a.graphics.WindowProgram;
import java.awt.*;
public class Assignment2Part3 extends WindowProgram {
        /* This program is creating paw prints.
         */
            /* Constants controlling the relative positions of the
             * three toes to the upper-left corner of the pawprint.
             *
             * (Yes, I know that actual pawprints have four toes.
             * Just pretend it's a cartoon animal. ^_^)
             */
            private static final double FIRST_TOE_OFFSET_X = 0;
            private static final double FIRST_TOE_OFFSET_Y = 20;
            private static final double SECOND_TOE_OFFSET_X = 30;
            private static final double SECOND_TOE_OFFSET_Y = 0;
            private static final double THIRD_TOE_OFFSET_X = 60;
            private static final double THIRD_TOE_OFFSET_Y = 20;
            /* The position of the heel relative to the upper-left
             * corner of the pawprint.
             */
            private static final double HEEL_OFFSET_X = 20;
            private static final double HEEL_OFFSET_Y = 40;
            /* Each toe is an oval with this width and height. */
            private static final double TOE_WIDTH = 20;
            private static final double TOE_HEIGHT = 30;
            /* The heel is an oval with this width and height. */
            private static final double HEEL_WIDTH = 40;
            private static final double HEEL_HEIGHT = 60;
            /* The default width and height of the window. These constants will tell Java to
             * create a window whose size is *approximately* given by these dimensions. You should
             * not directly use these constants in your program; instead, use getWidth() and
             * getHeight(), which return the *exact* width and height of the window.
             */
            public static final int APPLICATION_WIDTH = 270;
            public static final int APPLICATION_HEIGHT = 220;
    /**
     * In method run I involve method drawPaw print with coordinate x, y
     */
    public void run() {
               drawPawprint(30, 20);
               drawPawprint(180, 70);
             }
            /**
             * Draws a paw print. The parameters should specify the upper-left corner of the
             * bounding box containing that paw print.
             *  @param x The x coordinate of the upper-left corner of the bounding box for the paw print.
             * @param y The y coordinate of the upper-left corner of the bounding box for the paw print.
             * @return
             */
            private void drawPawprint(double x, double y) {
            createCompoundPawprint(x, y);
            }
    /**
     * This method use GCompound class to compound all elements of paw and set location.
     * First I create all elements.
     * @param x
     * @param y
     */
    private void createCompoundPawprint(double x, double y) {
        GCompound paw = new GCompound();
        paw.add(createToe(FIRST_TOE_OFFSET_X, FIRST_TOE_OFFSET_Y, TOE_WIDTH, TOE_HEIGHT));
        paw.add(createToe(SECOND_TOE_OFFSET_X, SECOND_TOE_OFFSET_Y, TOE_WIDTH, TOE_HEIGHT));
        paw.add(createToe(THIRD_TOE_OFFSET_X, THIRD_TOE_OFFSET_Y, TOE_WIDTH, TOE_HEIGHT));
        paw.add(createHeel(HEEL_OFFSET_X, HEEL_OFFSET_Y, HEEL_WIDTH, HEEL_HEIGHT));
        paw.setLocation(x, y);
        add(paw);
    }
    /**
     * This method create heel
     * @param heelOffsetX
     * @param heelOffsetY
     * @param heelWidth
     * @param heelHeight
     * @return
     */
    private GObject createHeel(double heelOffsetX, double heelOffsetY, double heelWidth, double heelHeight) {
        GOval heel = new GOval(heelOffsetX, heelOffsetY, heelWidth, heelHeight);
        heel.setFilled(true);
        heel.setColor(Color.BLACK);
        return heel;
    }
    /**
     * This method crete toe.
     * @param x
     * @param y
     * @param hight
     * @param wight
     * @return
     */
    private GObject createToe(double x, double y, double hight, double wight) {

                GOval oval = new GOval(x, y, hight, wight);
                oval.setFilled(true);
                oval.setColor(Color.BLACK);
                return oval;
    }
}