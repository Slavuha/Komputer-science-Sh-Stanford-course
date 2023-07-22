package com.shpp.p2p.cs.vmazur.assignment3;

import com.shpp.cs.a.console.TextProgram;

//The program which exponentiation of number.
public class Assignment3Part3 extends TextProgram {
    public void run() {
        System.out.println("Final result " + raiseToPower(2, 3)); //Program have displayed on screen result
    }
    private double raiseToPower(double base, int exponent) {
        double baseFirst = base; //Create local var first base.
        if (exponent > 0) { //Program analyze what exponent enter user. If it is more than 0 program execute this part of code.
            for (int i = 1; i < exponent; i++) {//i = 1 for skip first iteration.
                base = base * baseFirst;
            }
        }
        if (exponent < 0) {//When user entered exponent below zero program execute this part of code.
            exponent = exponent * -1;//Here exponent from negative become positive.
            for (int i = 1; i < exponent; i++) {
                base = base * baseFirst;
                base = 1 / base;//With help of division we can get a correct result.
                }
        }

        if (exponent == 0) {//When exponent was 0. Base always 1.
            base = 1;
        }
        return base;
    }
}


