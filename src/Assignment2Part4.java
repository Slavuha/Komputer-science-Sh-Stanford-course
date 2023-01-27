import acm.graphics.GLabel;
import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

/**
 * Program that create flag of Orangutatiya
 */

public class Assignment2Part4 extends WindowProgram {

     private static final int RECT_WIGHT = 200;
     private static final int RECT_HIGHT = 300;

    public void run() {


        GRect leftRect = new GRect(getWidth()/2-(RECT_WIGHT/2+RECT_WIGHT), getHeight()/2-RECT_HIGHT/2, RECT_WIGHT, RECT_HIGHT);
        leftRect.setFilled(true);
        leftRect.setColor(Color.GREEN);
        add(leftRect);

        GRect midlletRect = new GRect(getWidth()/2-RECT_WIGHT/2, getHeight()/2-RECT_HIGHT/2, RECT_WIGHT, RECT_HIGHT);
        midlletRect.setFilled(true);
        midlletRect.setColor(Color.BLUE);
        add(midlletRect);

        GRect righttRect = new GRect(getWidth()/2+ (RECT_WIGHT/2), getHeight()/2-RECT_HIGHT/2, RECT_WIGHT, RECT_HIGHT);
        righttRect.setFilled(true);
        righttRect.setColor(Color.RED);
        add(righttRect);


        GLabel label = new GLabel("FLAG OF GOLODNII ORANGUTANGI ");
        label.setColor(Color.GREEN);
        double width = label.getWidth();
        label.setLocation(getWidth()-width, getHeight() - (label.getAscent() + label.getDescent()));
        add(label);
    }
}
