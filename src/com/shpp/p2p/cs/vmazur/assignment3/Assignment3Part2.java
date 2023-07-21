package com.shpp.p2p.cs.vmazur.assignment3;
import com.shpp.cs.a.console.TextProgram;

//This program about numbers grading
public class Assignment3Part2 extends TextProgram {
    //Main method
    public void run() {
        int n = readInt("Enter Number ");//User enter number
        if (n > 1) {//Program analyze number which user enter. Progran will work only if number moore than 1.
            while (!(n == 1)) { //While number not 1 program is executing.
                if (n % 2 == 0) { //Program analyze even numbers.
                    System.out.println(n + " is even so I take half:");
                    n = n / 2;
                    System.out.println("I have got " + n);
                } else {
                    System.out.println(n + " is odd so I make 3n +1: ");//If number not even it is odd.
                    n = (n * 3) + 1;
                    System.out.println("I have got " + n);
                }
            }
        } else { // In case when user enter number 0 or 1 program execute this part with information for user.
            System.out.println("Invalid number. You must begin from 2 minimum");
        }
    }
}
