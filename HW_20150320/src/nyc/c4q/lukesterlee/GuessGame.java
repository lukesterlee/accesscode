package nyc.c4q.lukesterlee;

/**
 * Created by Luke Lee on 3/17/15.
 */

import java.util.Scanner;
import java.util.Random;

public class GuessGame {

    public static void print(String text) {
        System.out.print(text);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int answer = new Random().nextInt(100000) + 1;
        int guess;

        print("Guess the number between 1 and 100000. You have 20 chances.\n> ");

        for (int i=1; i<=20; i++) {

            guess = input.nextInt();

            if (guess > answer)
                print("Too high! Try again. " + (20-i) + " chances left.\n> ");
            else if (guess < answer)
                print("Too low! Try again. " + (20-i) + " chances left.\n> ");
            else if (guess == answer) {
                print("Congratulations! You got it right!");
                System.exit(0);
            }

        }

        print("Sorry, you used all 20 chances. The answer was " + answer);

    }
}
