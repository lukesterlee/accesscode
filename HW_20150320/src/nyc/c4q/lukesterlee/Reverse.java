package nyc.c4q.lukesterlee;

/**
 * Access Code 2.1
 * Created by Luke Lee on 3/20/2015.
 */

import java.util.Scanner;

public class Reverse {

    public static void print(String text) {
        System.out.println(text);
    }

    public static String reverseWords(String text) {
        Scanner input = new Scanner(text);
        String result = "";
        String word;
        while (input.hasNext()) {
            word = input.next();
            result = " " + word + result;
        }
        return result;
    }

    public static String reversePolishedWords(String text) {
        Scanner input = new Scanner(text);
        String result = "";
        String word;
        int numWords = 0;
        while (input.hasNext()) {
            word = input.next();
            numWords++;
        }

        Scanner input2 = new Scanner(text);
        for (int i=0; i<numWords; i++) {
            word = input2.next();

            // first word : change it to lower cases and add period.
            if (i == 0) {
                word = word.toLowerCase() + ".";
            }
            // last word : capitalize the first letter and take out the period.
            else if (i == numWords-1)
                word = Character.toUpperCase(word.charAt(0)) + word.substring(1,word.length()-1);
            result = " " + word + result;
        }
        return result;
    }

    public static void main(String[] args) {

        print(reverseWords("You miss 100% of the shots you don't take."));
        print(reversePolishedWords("You miss 100% of the shots you don't take."));
    }
}
