package com.shpp.p2p.cs.vmazur.assignment3;

import com.shpp.cs.a.console.TextProgram;

//This program calculates cardiovascular health.
public class Assignment3Part1 extends TextProgram {
    private static final int DAYS = 7; //This int set number of days in week.
    int countForCardio = 0; //This int is counting days when player nave done enough morning exercise for cardio health.
    int countForBlood = 0;//This int is counting days when player nave done enough morning exercise for blood health.

    public void run() {
        for (int i = 0; i < DAYS; i++) {
            int num = readInt("How many minutes did you do on day " + (i + 1) + "?");
            analyzeForCardio(num);
            analyzeForBlood(num);
        }
        resultForCardio();
        resultForBlood();
    }

    //This method is analyzing how many days played have done morning exercise for blood health.
    //If count of days was enough user got positive message.
    //If count of days was not enough user got message, how many days he needs trainee better.
    private void resultForBlood() {
        if (countForBlood > 2) {
            System.out.println(" Blood pressure: " +
                    "Great job! You've done enough exercise to keep a low blood pressure.");
        }
        if (countForBlood <= 2) {
            System.out.println(" Blood pressure: " +
                    "You needed to train hard for at least " + (3 - countForBlood) + " more day(s) a week!");
        }
    }

    //This method analyze input number for blood health.
    //If it is more than 39 count increasing +1.
    private void analyzeForBlood(int num) {
        if (num > 39) {
            countForBlood = countForBlood + 1;
        }
    }

    //This method analyze input number for blood health.
    //If it is more than 29 count increasing +1.
    private void analyzeForCardio(int num) {
        if (num > 29) {
            countForCardio = countForCardio + 1;
        }
    }

    //This method is analyzing how many days played have done morning exercise for cardio health.
    //If count of days was enough user got positive message.
    //If count of days was not enough user got message, how many days he needs trainee better.
    private void resultForCardio() {
        if (countForCardio > 4) {
            System.out.println("Cardiovascular health: " +
                    "Great job! You've done enough exercise for cardiovascular health.");}
        if (countForCardio <= 4) {
            System.out.println("Cardiovascular health: " +
                    " You needed to train hard for at least " + (5 - countForCardio) + " more day(s) a week!");}}}
