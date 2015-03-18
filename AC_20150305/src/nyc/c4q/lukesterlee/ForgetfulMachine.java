/**
 * Created by Willee on 3/5/15.
 */

import java.util.Scanner;

public class ForgetfulMachine {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Give me a word!");
        input.nextLine();

        System.out.println("Give me a second word!");
        input.nextLine();

        System.out.println("Great, now your favorite number?");
        input.nextLine();

        System.out.println("And your second-favorite number...");
        input.nextLine();

        System.out.println("Whew! Wasn't that fun?");


    }
}
