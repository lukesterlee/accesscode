package nyc.c4q.lukesterlee;

/**
 * Created by Luke Lee on 3/17/15.
 */

import java.util.Scanner;

public class Hangman {

    public static void print(String text) {
        System.out.println(text);
    }

    public static void main(String[] args) {

        SecretWord secret = new SecretWord();
        Scanner input = new Scanner(System.in);
        char guess;

        print("Let's play Hangman!");


        for(int i=0; i<=5; i++) {

            print("Word  : " + secret.toString());
            print(Drawing.get(i));
            print("Misses: " + i);
            System.out.print("Guess : ");

            while(true) {
                guess = input.next().charAt(0);
                if(guess == Character.toLowerCase(guess))
                    print("Please only use uppercase letters");
                else
                    break;

            }

            if (secret.isLetter(guess)) {
                secret.set(guess);
            } else {
                print(guess + " is not in the Secret Word!");
            }


            if(secret.isGuessed()) {
                print("\nCongrats!");
                System.exit(0);
            }

        }

        print("Sorry, you got wrong");
        print("The word is : " + secret.reveal());


    }
}
