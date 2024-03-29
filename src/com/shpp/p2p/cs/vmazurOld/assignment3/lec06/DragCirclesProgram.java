package com.shpp.p2p.cs.vmazurOld.assignment3.lec06;

import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.util.RandomGenerator;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.event.MouseEvent;

public class DragCirclesProgram extends WindowProgram {

    public void run() {
        addRandomObjects();
        addMouseListeners();
    }

    /* The object which has been selected for dragging. */
    private GObject selectedObject;

    /**
     * Selects the object under the mouse cursor when the mouse is pressed.
     * If nothing is found, that's okay - we'll set selectedObject to null.
     */
    public void mousePressed(MouseEvent e) {
        selectedObject = getElementAt(e.getX(), e.getY());
    }


    /**
     * Repositions the dragged object to the mouse's location when the mouse
     * is moved.
     */
    @Override
    public void mouseDragged(MouseEvent e) {
		/* If there is something to drag at all, go move it. */
        if (selectedObject != null) {
            double newX = e.getX() - selectedObject.getWidth() / 2.0;
            double newY = e.getY() - selectedObject.getHeight() / 2.0;
            selectedObject.setLocation(newX, newY);
        }
    }

	/* * * * * Code for adding random objects below this point. * * * * */

    /* The number of objects to add. */
    private static final int NUM_RANDOM_OBJECTS = 100;

    /* The size of each random object. */
    private static final double OBJECT_SIZE = 20;

    /**
     * Adds a bunch of random objects to the screen.
     */
    private void addRandomObjects() {
        for (int i = 0; i < NUM_RANDOM_OBJECTS; i++) {
            addRandomObject();
        }
    }

    /**
     * Adds a single random object to the screen.
     */
    private void addRandomObject() {
        RandomGenerator rgen = RandomGenerator.getInstance();

        GOval object = new GOval(rgen.nextDouble(0, getWidth() - OBJECT_SIZE),
                rgen.nextDouble(0, getHeight() - OBJECT_SIZE),
                OBJECT_SIZE, OBJECT_SIZE);
        object.setFilled(true);
        object.setColor(rgen.nextColor());
        add(object);
    }
}
