package com.shpp.p2p.cs.vmazur.assignment2;

import com.shpp.cs.a.console.TextProgram;
import com.shpp.cs.a.graphics.WindowProgram;

import javax.swing.plaf.basic.BasicButtonUI;
import java.io.*;

public class FizzBazz extends TextProgram {
//    public final int aaa = 0;
//    public void run() {
//
////        InputStream inputStream = System.in;
////        Reader reader = new InputStreamReader(inputStream);
////        BufferedReader bufferedReader = new BufferedReader(reader);
//
//        int number = readInt("Enter number");
//        if (number%3==0){
//
//            System.out.println("Fizz");
//
//        }
//        if (number%5==0){
//            System.out.println("Bazz");
//        }
//
//        if (number%5==0 && number%3==0) {
//            System.out.print("Buzz");
//
//        }
//      //  System.out.println("Your number " + number);
//    }
//}
public void run() {
    int numRounds = readInt("How many rounds? ");

    /* Play a number of rounds given by the number the user entered. */
    for (int i = 0; i < numRounds; i++) {
        /* First check for divisibility by 15. If we don't do this test
         * first, then we might print the wrong message out.
         */
        if (i % 15 == 0) {
            println("Buzz");
        }
        /* Now, check for all the remaining conditions. */
        else if (i % 3 == 0) {
            println("Fizz");
        } else if (i % 5 == 0) {
            println("Bazz");
        } else {
            println(i);
        }
    }
}
}