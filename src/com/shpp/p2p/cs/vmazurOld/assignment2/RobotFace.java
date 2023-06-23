package com.shpp.p2p.cs.vmazurOld.assignment2;

import acm.graphics.G3DRect;
import acm.graphics.GOval;
import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

public class RobotFace extends WindowProgram {

    private final double HEAD_WIDTH = 200;
    private final double HEAD_HEIGHT = 250;
    private final double EYE_RADIUS = 35;
    private final double MOUTH_WIDTH = 100;
    private final double MOUTH_HEIGHT = 70;

    public void run(){
        createHead(getWidth()/2 - HEAD_WIDTH/2, getHeight()/2 - HEAD_HEIGHT/2, HEAD_WIDTH, HEAD_HEIGHT);
        createEye(getWidth()/2 - HEAD_WIDTH/4 - EYE_RADIUS/2,
                getHeight()/2- HEAD_HEIGHT/4 - EYE_RADIUS/2
                , EYE_RADIUS, EYE_RADIUS);
        createEye(getWidth()/2 + HEAD_WIDTH/4 - EYE_RADIUS/2,
                getHeight()/2- HEAD_HEIGHT/4 - EYE_RADIUS/2
                , EYE_RADIUS, EYE_RADIUS);

        createMouth(
                getWidth()/2 - MOUTH_WIDTH/2,
                getHeight()/2 ,
                MOUTH_WIDTH,
                MOUTH_HEIGHT

        );

    }

    private void createMouth(double x, double y, double mouth_width, double mouth_height) {
        GRect rect = new GRect(x, y, mouth_width, mouth_height);
        rect.setFilled(true);
        rect.setColor(Color.BLUE);
        add(rect);
    }


    private void createEye(double x, double y, double eye_radius, double eye_radius1) {
        GOval oval = new GOval(x, y, eye_radius, eye_radius);
        oval.setFilled(true);
        oval.setFillColor(Color.GREEN);
        add(oval);
    }

    private void createHead(double x, double y, double width, double height) {
        G3DRect rect = new G3DRect(x, y, width, height);
        rect.setFilled(true);
        rect.setFillColor(Color.RED);
        add(rect);
    }
}
