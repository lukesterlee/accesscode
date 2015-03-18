package nyc.c4q.lukesterlee;

/**
 * Created by Luke Lee on 3/8/15.
 */

import java.util.Scanner;
import java.util.Random;

public class Guess {
    public static void main(String[] args) {

        Random random = new Random();
        int secretNum = random.nextInt(10) + 1;
        int answer;
        Scanner input = new Scanner(System.in);

        System.out.println("Guess my secret number! (1~10) : ");
        answer = input.nextInt();

        while (secretNum != answer) {

            System.out.println("Wrong! Try again! : ");
            answer = input.nextInt();

        }

        System.out.println("You got it right! Bye bye!");
    }
}
