package com.shpp.p2p.cs.vmazurOld.assignment3;

import com.shpp.cs.a.console.TextProgram;

/**
 * Class raises a number in squarer.
 */
public class Assignment3Part3 extends TextProgram {
    public void run() {
        System.out.println(raiseToPower(0.5, -2));

    }

    /**
     * Method raise number in dependency of positive or negative exponent.
     * @param base number with will rise
     * @param exponent number of times
     * @return result
     */
    private double raiseToPower(double base, int exponent) {
        double result = 1;

        if (exponent > 0) {
            for (int i = 1; i <= exponent; i++) {
                result = result * base;

            }
        }

        if (exponent < 0) {
            exponent = exponent * -1;

            for (int i = 1; i <= exponent; i++) {
                result = result * base;
            }
           // in case 0
            result = 1 / result;
        }
        return result;
    }
}


