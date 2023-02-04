package com.shpp.p2p.cs.vmazur.assignment2;

import com.shpp.cs.a.console.TextProgram;

import java.io.*;

/**
 * This class calculate square roots.
 */
public class Assignment2Part1 extends TextProgram {
    public void run() {
        double a = readDouble("Enter a");
        double b = readDouble("Enter b");
        double c = readDouble("Enter c");
        calculateInput(a, b, c);
    }

    /**
     * This method take input numbers from previous method and calculate it.
     *
     * @param a
     * @param b
     * @param c
     */
    private void calculateInput(double a, double b, double c) {
        double d = (b * b) - (4 * a * c);
        if (d > 0) {
            double x1 = (-b + Math.sqrt(d))
                    / (2 * a);

            double x2 = (-b - Math.sqrt(d))
                    / (2 * a);
            System.out.println("The roots are " + x1 + " and " + x2);
        } else if (d == 0) {
            double x1 = -b
                    / (2 * a);
            System.out.println("The root is " + x1);
        } else {
            System.out.println("Roots are not real.");
        }
    }
}