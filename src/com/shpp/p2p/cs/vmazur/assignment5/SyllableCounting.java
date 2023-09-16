package com.shpp.p2p.cs.vmazur.assignment5;
import com.shpp.cs.a.console.TextProgram;
//The program calculates count of syllables in word.
public class SyllableCounting extends TextProgram {
    public void run() {
        /* Repeatedly prompt the user for a word and print out the estimated
         * number of syllables in that word.
         */
        while (true) {
            String word = readLine("Enter a single word: ");
            println("  Syllable count: " + syllablesInWord(word));
        }
    }

    /**
     * Given a word, estimates the number of syllables in that word according to the
     * heuristic specified in the handout.
     *
     * @param word A string containing a single word.
     * @return An estimate of the number of syllables in that word.
     */
    private int syllablesInWord(String word) {
        int countSyllables = 0;
        char [] chars = {'a', 'e', 'i', 'o', 'u', 'y', 'A', 'E', 'I', 'O', 'U', 'Y'  };
        boolean itWasVowel = false;

        //This cycle passes through each char in the word
        for (int j = 0; j<word.length(); j++){
            char ch = word.charAt(j);
            System.out.println("New Round");
            System.out.println("ItWasVolwel " + itWasVowel);
            System.out.println("Character " + ch);

            // This cycle passes through our vowels chars.
            for (int p = 0;p<chars.length; p++) {

                if (ch == chars[p] && itWasVowel ==false ){
                    countSyllables += 1;
                    System.out.println("Char is syllables");
                    itWasVowel = true;
                    break;
                }
            if (ch == chars[p]&&itWasVowel==true){
                itWasVowel = false;
                break;
            }
            else {
                itWasVowel = false;
            }
        }}

                if (countSyllables == 0){
            countSyllables +=1;
        }
        return countSyllables;
    }
}
