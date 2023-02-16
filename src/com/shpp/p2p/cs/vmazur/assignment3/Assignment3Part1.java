package com.shpp.p2p.cs.vmazur.assignment3;

import com.shpp.cs.a.console.TextProgram;

/**
 * Program with calculate you trainee and your cardio and blood health.
 */
public class Assignment3Part1 extends TextProgram {
    private static final int MINUTES_OF_TRAINEE_FOR_CARDIO = 30;
    private static final int MINUTES_OF_TRAINEE_FOR_BLOOD = 40;
    public int COUNT_OF_SUCСESS_DAYS_FOR_CARDIO = 0;
    public int COUNT_OF_SUCСESS_DAYS_FOR_BLOOD = 0;
    public int NEED_MORE_TRANEE_DAYS_FOR_CARDIO = 0;
    public int NEED_MORE_TRANEE_DAYS_FOR_BLOOD = 0;

    /**
     * In run we take input numbers after analyze every number on subject correspondents with time of trainee cardio and blood health.
     */
    public void run() {
        int day1 = readInt("How many minutes did you do on day 1?");
        checkMinutesForCardio(day1);
        checkMinutesForBlood(day1);
        int day2 = readInt("How many minutes did you do on day 2?");
        checkMinutesForCardio(day2);
        checkMinutesForBlood(day2);
        int day3 = readInt("How many minutes did you do on day 3?");
        checkMinutesForCardio(day3);
        checkMinutesForBlood(day3);
        int day4 = readInt("How many minutes did you do on day 4?");
        checkMinutesForCardio(day4);
        checkMinutesForBlood(day4);
        int day5 = readInt("How many minutes did you do on day 5?");
        checkMinutesForCardio(day5);
        checkMinutesForBlood(day5);
        int day6 = readInt("How many minutes did you do on day 6?");
        checkMinutesForCardio(day6);
        checkMinutesForBlood(day6);
        int day7 = readInt("How many minutes did you do on day 7?");
        checkMinutesForCardio(day7);
        checkMinutesForBlood(day7);
        checkHowMuchDaysYouNeedToTrainCardio();
        checkHowManyDaysYouNeedToTrainBlood();
        displayYouCardiovascularResult();
        displayYouBloodResult();
    }

    /**
     * Method display your blood result.
     * The result is based on you count of success training.
     */
    private void displayYouBloodResult() {
        if (COUNT_OF_SUCСESS_DAYS_FOR_BLOOD == 3) {
            System.out.println("Blood pressure: " +
                    "Great job! You've done enough exercise to keep a low blood pressure.");
        }
        if (COUNT_OF_SUCСESS_DAYS_FOR_BLOOD > 3) {
            System.out.println("Blood pressure: " +
                    "Great job! You've done enough exercise to keep a low blood pressure.");
        }
        if (COUNT_OF_SUCСESS_DAYS_FOR_BLOOD < 3) {
            System.out.println("Blood pressure: " +
                    " You needed to train hard for at least " + NEED_MORE_TRANEE_DAYS_FOR_BLOOD +
                    " more day(s) a week!");
        }
    }

    /**
     * Method calculates how many days you need to training to get a health blood.
     */
    private void checkHowManyDaysYouNeedToTrainBlood() {
        if (COUNT_OF_SUCСESS_DAYS_FOR_BLOOD < 3) {
            NEED_MORE_TRANEE_DAYS_FOR_BLOOD = 3 - COUNT_OF_SUCСESS_DAYS_FOR_BLOOD;
        }
    }

    /**
     * Method calculates how many days you need to training to get a health blood.
     */
    private void checkHowMuchDaysYouNeedToTrainCardio() {
        if (COUNT_OF_SUCСESS_DAYS_FOR_CARDIO < 5) {
            NEED_MORE_TRANEE_DAYS_FOR_CARDIO = 5 - COUNT_OF_SUCСESS_DAYS_FOR_CARDIO;
        }
    }

    /**
     * Method compare need time to train, and you time spent on train.
     *
     * @param day input meaning
     */
    private void checkMinutesForBlood(int day) {
        if
        (day > MINUTES_OF_TRAINEE_FOR_BLOOD) {
            COUNT_OF_SUCСESS_DAYS_FOR_BLOOD = COUNT_OF_SUCСESS_DAYS_FOR_BLOOD + 1;}
        if
        (day == MINUTES_OF_TRAINEE_FOR_BLOOD) {
            COUNT_OF_SUCСESS_DAYS_FOR_BLOOD = COUNT_OF_SUCСESS_DAYS_FOR_BLOOD + 1;}
    }

    /**
     * Method display your cardiovascular result.
     * The result is based on you count of success training.
     */
    private void displayYouCardiovascularResult() {
        if (COUNT_OF_SUCСESS_DAYS_FOR_CARDIO == 5) {
            System.out.println("Cardiovascular health:" +
                    "  Great job! You've done enough exercise for cardiovascular health.");}
        if (COUNT_OF_SUCСESS_DAYS_FOR_CARDIO > 5) {
            System.out.println("Cardiovascular health:" +
                    "  Great job! You've done enough exercise for cardiovascular health.");}
        if (COUNT_OF_SUCСESS_DAYS_FOR_CARDIO < 5) {
            System.out.println("Cardiovascular health:" +
                    "  You needed to train hard for at least " + NEED_MORE_TRANEE_DAYS_FOR_CARDIO +
                    " more day(s) a week!");}
    }
    /**
     * Method compare need time to train, and you time spent on train.
     * @param day input meaning
     */
    private void checkMinutesForCardio(int day) {
        if
        (day > MINUTES_OF_TRAINEE_FOR_CARDIO) {
            COUNT_OF_SUCСESS_DAYS_FOR_CARDIO = COUNT_OF_SUCСESS_DAYS_FOR_CARDIO + 1;}
        if
        (day == MINUTES_OF_TRAINEE_FOR_CARDIO) {
            COUNT_OF_SUCСESS_DAYS_FOR_CARDIO = COUNT_OF_SUCСESS_DAYS_FOR_CARDIO + 1;}
    }
}
