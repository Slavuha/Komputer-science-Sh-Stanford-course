package com.shpp.p2p.cs.msosula.assignment2;

import acm.io.IOConsole;
import com.shpp.cs.a.console.TextProgram;

import javax.swing.*;
import java.awt.*;

public class Assignment2Part1 extends TextProgram {
    public void run() {
        /*
        We create new frame and console window to display work of program not in ide
        JFrame creates new frame with name we set up
        We create new instance of console where we display all info
         */
        JFrame frame = new JFrame("Assignment2Part1");
        IOConsole console = new IOConsole();
        frame.getContentPane().add(BorderLayout.CENTER, console);
        frame.setSize(500, 300);
        frame.show();
        console.println("This program calculates quadratic equation: ");

        // Here we read numbers from user: double, int
        double a = console.readDouble("Please enter a: ");
        double b = console.readDouble("Please enter b: ");
        double c = console.readDouble("Please enter c: ");

        // We call method to get discriminant and assign result to var discriminant
        double discriminant = getDiscriminant(a, b, c);
        // We call method to get roots and save values in array
        double[] rootsArray = getRoots(a, b, discriminant);

        // Logic to display number of roots depend on count of array elements,
        // elements added to array in getRoots() method
        if (rootsArray.length == 0) {
            console.println("There are no real roots");
        } else if (rootsArray.length == 1) {
            console.println("There is one root: " + rootsArray[0]);
        } else {
            console.println("There are two roots: " + rootsArray[0] + " and " + rootsArray[1]);
        }
    }

    // Method accepts 3 numbers from user and get discriminant
    private double getDiscriminant(double a, double b, double c) {
        return (Math.pow(b, 2) - 4 * a * c);
    }

    /*
    Method for calculate roots depends on value of discriminant
    we add roots to array, and then return it
     */
    private double[] getRoots(double a, double b, double discriminant) {
        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            double[] rootsArray = {root1, root2};
            return rootsArray;
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            double[] rootsArray = {root};
            return rootsArray;
        } else {
            double[] rootsArray = {};
            return rootsArray;
        }
    }
}
