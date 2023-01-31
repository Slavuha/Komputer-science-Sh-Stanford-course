package com.shpp.p2p.cs.vmazur.assignment2;

import com.shpp.cs.a.console.TextProgram;
import java.io.*;
/**
 * This class calculate square roots.
 */
public class Assignment2Part1 extends TextProgram {
    public void run() {
        takeInput();
    }
    /**
     * This method take input numbers and give them to method calculate input.
     */
    private void takeInput() {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        double a = 0;
        double b = 0;
        double c = 0;
        try {
            System.out.println("Enter number a");
            a = Double.parseDouble(bufferedReader.readLine());
            System.out.println("Enter number b");
            b = Double.parseDouble(bufferedReader.readLine());
            System.out.println("Enter number c");
            c = Double.parseDouble(bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
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
        double x = (b * b) - (4 * a * c);
        if (x > 0.0) {
            double d1 = (-b + Math.sqrt(x))
                    / (2.0 * a);

            double d2 = (-b - Math.sqrt(x))
                    / (2.0 * a);
            System.out.println("The roots are " + d1 + " and " + d2);
        } else if (x == 0.0) {
            double d1 = -b
                    / (2.0 * a);
            System.out.println("The root is " + d1);
        } else {
            System.out.println("Roots are not real.");
        }
    }
}