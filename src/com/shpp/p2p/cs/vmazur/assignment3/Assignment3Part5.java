package com.shpp.p2p.cs.vmazur.assignment3;

import acm.util.RandomGenerator;
import com.shpp.cs.a.console.TextProgram;

/**
 * Clas with game "Lucky and sweaty"
 */
public class Assignment3Part5 extends TextProgram {
    /**
     * In run created rgen - random generator to create effect of coin in dependency: eagle or tail of coin.
     * So in dependency of task we have bet, witch increase or come to total lucky)
     */
    public void run() {
        int cashBalance = 1;
        int totalEarning = 0;

        RandomGenerator rgen = RandomGenerator.getInstance();

        while (totalEarning < 20) {
            int coin = rgen.nextInt();
            if (coin % 2 == 0) {
                System.out.println("Eagle");
                cashBalance = cashBalance + cashBalance;
                System.out.println("CashBalancex2 " + cashBalance);
            } else {
                System.out.println("Tail of coin"
                        +
                        " This game you earned " + cashBalance);
                totalEarning = totalEarning + cashBalance;
                cashBalance = 1;
                System.out.println("You total is " + totalEarning);
            }
        }
    }
}

