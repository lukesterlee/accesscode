package nyc.c4q.lukesterlee;

/*
 * Access Code 2.1
 * Created by Luke Lee on 03/10/15
 * Roman Calculator Practice.
 * This class contains two methods and one main to test them.
 * In order to test all the cases, I got the raw data from the web (input.txt) and parsed them.
 */

import java.io.*;
import java.util.Scanner;

public class RomanNumerals {

    public static final int[] DECIMAL = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    public static final String[] ROMAN = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    /**
     * Formats a number in Roman numerals.
     * @param value
     *   The value to format.
     * @return
     *   The value in Roman numerals.
     */
    public static String format(int value) {
        String result = "";
        for (int i=0; i<DECIMAL.length;i++) {
            while (value >= DECIMAL[i]) {
                result += ROMAN[i];
                value -= DECIMAL[i];
            }
        }
        return result;
    }

    /**
     * Parses a number in Roman numerals.
     * @param number
     *   The number to parse.
     * @return
     *   The value, or -1 if the number isn't in Roman numerals.
     */
    public static int parse(String number) {
        char[] romanChar = number.toCharArray();
        int[] value = new int[romanChar.length];
        int result = 0;
        boolean isFlipped = false;

        for (int i=0; i<romanChar.length; i++) {
            switch(romanChar[i]) {
                case 'M' :
                    value[i] = 1000;
                    break;
                case 'D' :
                    value[i] = 500;
                    break;
                case 'C' :
                    value[i] = 100;
                    break;
                case 'L' :
                    value[i] = 50;
                    break;
                case 'X' :
                    value[i] = 10;
                    break;
                case 'V' :
                    value[i] = 5;
                    break;
                case 'I' :
                    value[i] = 1;
                    break;
                // This default setting will filter all the wrong input characters.
                default:
                    return -1;
            }
        }

        for (int i=0; i<(value.length-1); i++) {
            if (value[i]*10 == value[i+1] || value[i]*5 == value[i+1]) {
                if (i == value.length-2) {
                    isFlipped = true;
                }
                if (i != 0 && value[i+1]-value[i] > value[i-1])
                    return -1;
                result += value[i+1] - value[i];
                i++;
            } else if (value[i] < value[i+1]) {
                return -1;
            } else {
                result += value[i];
                isFlipped = false;
            }
        }

        if (!isFlipped)
            result += value[value.length-1];

        return result;
    }

    public static void main(String[] args) throws FileNotFoundException {

        // I don't know how to make the relative path?
        Scanner inFile = new Scanner(new File("/Users/Willee/Desktop/accesscode/Roman/src/input.txt"));

        int[] allDecimal = new int[3999];
        int testInt;
        int numFailed = 0;
        String[] allRoman = new String[3999];
        String testRoman;

        for (int i=0; i<3999; i++) {
            allDecimal[i] = inFile.nextInt();
            allRoman[i] = inFile.next();
            allRoman[i] = inFile.next();
        }

        System.out.println("Starting the test for the format method : ");
        System.out.println("This test will test all the numbers from 1~3999 and check with the answer.");
        for (int i=0; i<3999; i++) {
            testRoman = format(allDecimal[i]);
            if (!testRoman.equalsIgnoreCase(allRoman[i])) {
                System.out.println("The result value " + format(allDecimal[i]) + " does not match with the answer " + allRoman[i]);
                numFailed++;
            }
        }
        System.out.println("Testing is completed. The number of fail is : " + numFailed);
        if (numFailed == 0)
            System.out.println("Your format method is working perfectly! Congratulations!\n");
        else
            System.out.println("You've got some problems. Work harder!\n");

        // make the count to zero for the next test.
        numFailed = 0;

        System.out.println("Starting the test for the parse method : ");
        System.out.println("This test will test all the numbers from I~MMMCMXCIX and check with the answer.");
        for (int i=0; i<3999; i++) {
            testInt = parse(allRoman[i]);
            if (testInt != allDecimal[i]) {
                System.out.println("The result value " + parse(allRoman[i]) + " does not match with the answer " + allDecimal[i]);
                numFailed++;
            }
        }
        System.out.println("Testing is completed. The number of fail is : " + numFailed);
        if (numFailed == 0)
            System.out.println("Your parse method is working perfectly! Congratulations!\n");
        else
            System.out.println("You've got some problems. Work harder!\n");

    }
}