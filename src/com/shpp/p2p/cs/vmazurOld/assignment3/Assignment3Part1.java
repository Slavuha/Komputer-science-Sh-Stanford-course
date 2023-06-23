package com.shpp.p2p.cs.vmazurOld.assignment3;

import com.shpp.cs.a.console.TextProgram;

/**
 * The program calculates your trainee and your cardio and blood health.
 */
public class Assignment3Part1 extends TextProgram {

    private static final int NUMBERS_OF_DAYS_TRAINEE_IN_WEEK = 7;

    /**
     * In the run, enter how many minutes you train in days. After analyzing your answers and giving you result.
     */
    public void run() {
        int[] arr;
        arr = addAnswerInarr();
        analyzeFobCardio(arr);
        analyzeFobBlood(arr);
    }

    //The method analyzes numbers in arr and gives the result of your trains.
    private void analyzeFobBlood(int[] arr) {
        int cout40 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 40) {
                cout40++;
            }
        }
        if (cout40 >= 3) {
            System.out.println("Blood pressure: " +
                    "Great job! You've done enough exercise to keep a low blood pressure.");
        }

        if (cout40 < 3) {
            System.out.println("Blood pressure: " +
                    " You needed to train hard for at least " + (3 - cout40) +
                    " more day(s) a week!");

        }
    }

    // The method analyzes numbers in arr and gives the result of your trains.
    private void analyzeFobCardio(int[] arr) {
        int cout30 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 30) {
                cout30++;
            }
        }
        if (cout30 >= 5) {
            System.out.println("Cardiovascular health:" +
                    "  Great job! You've done enough exercise for cardiovascular health.");
        }

        if (cout30 < 5) {
            System.out.println("Cardiovascular health:" +
                    "  You needed to train hard for at least " + (5 - cout30) +
                    " more day(s) a week!");
        }
    }

    //The method adds numbers in arr.
    private int[] addAnswerInarr() {

        int[] arr = new int[NUMBERS_OF_DAYS_TRAINEE_IN_WEEK + 1];
        for (int i = 1; i < NUMBERS_OF_DAYS_TRAINEE_IN_WEEK + 1; i++) {
            int day = readInt("How many minutes did you do on day " + i + " ?");
            arr[i] = day;
        }
        return arr;
    }
}
