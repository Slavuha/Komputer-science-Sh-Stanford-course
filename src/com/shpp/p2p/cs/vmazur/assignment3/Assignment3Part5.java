package com.shpp.p2p.cs.vmazur.assignment3;

import com.shpp.cs.a.console.TextProgram;

import java.util.Random;

//The program with game lucky and sweaty.
public class Assignment3Part5 extends TextProgram {
    int countOfGameRounds = 0; //Variable to count rounds of games.
    int countMoneyOfLucky = 0; //Variable to count total money of Lucky.
    int countOfMoneyRound = 1; //Variable to control money in round.
    public void run() {

        while (countMoneyOfLucky <= 20) {//Cycle while to start game while money of Luck less than 20.
            roundGame();
            countOfGameRounds++;
        }
        System.out.println("It took " + countOfGameRounds + " games to earn $20 ");
    }
    //Method processes coin and enters changing in variables.
    private void roundGame() {
        Random coin = new Random(); //Class to create random situation with coin - eagle and tails.
        boolean eagle = coin.nextBoolean();
        boolean tails = !coin.nextBoolean();
        if (eagle) {
            countOfMoneyRound = countOfMoneyRound * 2; //When eagle program increase money per round *2.
        }
        if (tails) {
            countMoneyOfLucky = countMoneyOfLucky + countOfMoneyRound; //When tail Lucky gets all money per round.
            System.out.println("This game, you earned " + countOfMoneyRound);
            System.out.println("Your total is " + countMoneyOfLucky);
            countOfMoneyRound = 1;//Here program change variable for next round.
        }
    }
}
