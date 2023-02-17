package com.shpp.p2p.cs.vmazur.assignment3;

import com.shpp.cs.a.console.TextProgram;

/**
 * Class start program with numbers
 */
public class Assignment3Part2 extends TextProgram {
    Integer n = readInt("Enter N");

    public void run() {
        while (!(n == 1)) {
            checkN();
            System.out.println(n);
        }
    }

    /**
     * Method calculate n in dependency of task
     */
    private void checkN() {
        if (n % 2 == 0) {
            n = n / 2;
        } else {
            n = n * 3 + 1;
        }
    }
}
