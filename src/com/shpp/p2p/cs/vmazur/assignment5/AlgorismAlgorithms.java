package com.shpp.p2p.cs.vmazur.assignment5;
import com.shpp.cs.a.console.TextProgram;

public class AlgorismAlgorithms extends TextProgram {
    public void run() {
        /* Sit in a loop, reading numbers and adding them. */
        while (true) {
            String n1 = readLine("Enter first number:  ");
            String n2 = readLine("Enter second number: ");
            println(n1 + " + " + n2 + " = " + addNumericStrings(n1, n2));
            println();


            }
    }
    /**
     * Given two string representations of nonnegative integers, adds the
     * numbers represented by those strings and returns the result.
     *
     * @param n1 The first number.
     * @param n2 The second number.
     * @return A String representation of n1 + n2
     */
    private String addNumericStrings(String n1, String n2) {
        String[] finish = new String[n1.length()];
        String all = String.valueOf(finish);
        int [] result = new int[n1.length()];
        for
        (int i = 0; i<n1.length(); i++) {
            char char1 = n1.charAt(i);
            char char2 = n2.charAt(i);


            int value1 = Character.getNumericValue(char1);
            System.out.println("Value1= " + value1);

            int value2 = Character.getNumericValue(char2);
            System.out.println("Value2= " + value2);

             result[i] = value1 + value2;


        }
        for (int i = 0; i<result.length; i++){
            char ch = (char) (result[i]+'0');
            finish[i] = String.valueOf(ch);
        }

        System.out.println("Finish " + finish.toString());

        return all;
    }
}
