package nyc.c4q.lukesterlee;

/**
 * Access Code 2.1
 * Created by Luke Lee on 3/17/15.
 * Twenty Questions Game.
 * Write a program which assumes a random integer X in some range, say 1 - 100,000.
 * It prompts you to input a number and responds with the following information:
 *    Input number is higher than X
 *    Input number is lower than X
 *    Input number is equal to X, in which case you win the game
 * Your program gives 20 chances to guess the number and you lose if you fail to guess.
 * You can use Java's Math.random() to generate a random number.
 * Note that it returns a double, but we want an int
 */

import java.util.Scanner;
import java.util.Random;

public class TwentyQuestionsGame {

    public static void print(String text) {
        System.out.print(text);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int answer = new Random().nextInt(100000) + 1;
        int guess;
        int chance = 20;

        print("Guess the number between 1 and 100000. You have 20 chances.\n> ");

        while (chance > 0) {
            guess = input.nextInt();

            if(chance == 1 && guess != answer)
                break;

            chance--;
            if (guess == answer) {
                print("Congratulations! You got it right!");
                System.exit(0);
            } else if (guess > answer)
                print("Too high! Try again. " + chance + " chances left.\n> ");
            else if (guess < answer)
                print("Too low! Try again. " + chance + " chances left.\n> ");
        }
        print("Sorry, you used all 20 chances. The answer was " + answer);
    }
}
