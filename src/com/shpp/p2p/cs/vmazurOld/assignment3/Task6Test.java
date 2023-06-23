package com.shpp.p2p.cs.vmazurOld.assignment3;

import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

public class Task6Test extends WindowProgram {
    private static final double PAUSE_TIME = 1000.0 / 50;
    long start = System.currentTimeMillis();
    long stop = start + 5000;
    public void run() {





        while (System.currentTimeMillis() < stop ){
            doAnimathion();
            System.out.println("Start " + start);
            System.out.println("Stop " + stop);

        }

    }

    private void doAnimathion() {
      GRect rect =  createRect();
      while (System.currentTimeMillis() < stop ) {
          rect.move(4.5, 2.5);
          pause(PAUSE_TIME);
      }
    }

    private GRect createRect() {
        GRect rect = new GRect(0, 0, 30, 30);
        rect.setFilled(true);
        rect.setColor(Color.GREEN);
        add(rect);




return rect;

    }
}

//    Duration duration = Duration.ofSeconds(5);
//    GRect rect = new GRect(0, 0, 40, 40);
//    rect.

