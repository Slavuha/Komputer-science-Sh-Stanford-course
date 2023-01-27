import acm.graphics.GCompound;
import acm.graphics.GObject;
import acm.graphics.GOval;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

public class Assignment2Part3 extends WindowProgram {

        /* TODO: Replace these file comments with a description of what your program
         * does.
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


    public void run() {
               drawPawprint(30, 20);
               drawPawprint(180, 70);

             }

            /**
             * Draws a pawprint. The parameters should specify the upper-left corner of the
             * bounding box containing that pawprint.
             *  @param x The x coordinate of the upper-left corner of the bounding box for the pawprint.
             * @param y The y coordinate of the upper-left corner of the bounding box for the pawprint.
             * @return
             */
            private void drawPawprint(double x, double y) {
                GOval firstToe = new GOval(FIRST_TOE_OFFSET_X, FIRST_TOE_OFFSET_Y, TOE_WIDTH, TOE_HEIGHT);
                GOval secondToe = new GOval(SECOND_TOE_OFFSET_X, SECOND_TOE_OFFSET_Y, TOE_WIDTH, TOE_HEIGHT);
                GOval thirdToe = new GOval(THIRD_TOE_OFFSET_X, THIRD_TOE_OFFSET_Y, TOE_WIDTH, TOE_HEIGHT);
                GOval heel = new GOval(HEEL_OFFSET_X, HEEL_OFFSET_Y, HEEL_WIDTH, HEEL_HEIGHT);
                firstToe.setFilled(true);
                firstToe.setColor(Color.BLACK);
                secondToe.setFilled(true);
                secondToe.setColor(Color.BLACK);
                thirdToe.setFilled(true);
                thirdToe.setColor(Color.BLACK);

                heel.setFilled(true);
                heel.setColor(Color.BLACK);

                add(firstToe);
                add(secondToe);
                add(thirdToe);
                add(heel);

                GCompound paw = new GCompound();
                paw.add(firstToe);
                paw.add(secondToe);
                paw.add(thirdToe);
                paw.add(heel);
                paw.setLocation(x, y);

                add(paw);


            }

public static void  print (String text, int count){
                for (int i = 0; i < count; i ++){
                    System.out.println(text);
                }
}
        }

