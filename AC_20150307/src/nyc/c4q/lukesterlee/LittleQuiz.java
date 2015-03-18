package nyc.c4q.lukesterlee;

/**
 * Access Code 2.1
 * Created by Willee on 3/7/15.
 * This exercise is to practice if and else statement. Ask users 3 questions and count the number of questions they get right and display it.
 */

import java.util.Scanner;

public class LittleQuiz {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String start;
        int answer;
        int numOfAnswer = 0;

        System.out.println("Are you ready for a quiz? (Y/N)");
        start = input.next();
        System.out.println("Okay, here it comes!\n");

        System.out.println("Q1) What is the capital of Alaska?\n" +
                "1) Melbourne\n" +
                "2) Anchorage\n" +
                "3) Juneau");
        answer = input.nextInt();
        if (answer == 2) {
            numOfAnswer++;
            System.out.println("That's right!");
        }
        else {
            System.out.println("Sorry, the capital of Alaska is Anchorage.");
        }

        System.out.println("Q2) Can you store the value \"cat\" in a variable of type int?\n" +
                "1) yes\n" +
                "2) no");
        answer = input.nextInt();
        if (answer == 2) {
            numOfAnswer++;
            System.out.println("That's right!");
        }
        else {
            System.out.println("Sorry, \"cat\" is a string. ints can only store numbers.");
        }

        System.out.println("Q3) What is the result of 9+6/3?\n" +
                "1) 5\n" +
                "2) 11\n" +
                "3) 15/3");
        answer = input.nextInt();
        if (answer == 1) {
            numOfAnswer++;
            System.out.println("That's correct!");
        }
        else {
            System.out.println("Sorry, the answer is 5.");
        }

        System.out.println("Overall, you got " + numOfAnswer + " out of 3 correct.\n" +
                "Thanks for playing!");

    }
}
