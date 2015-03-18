/**
 * Access Code 2.1
 * Luke Lee
 * AskingQuestions.java
 * This exercise
 */

import java.util.Scanner;

public class AskingQuestions {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int age, feet, inches;
        double weight;

        System.out.println( "How old are you?" );
        age = keyboard.nextInt();

        System.out.print( "How tall are you in FEET?" );
        feet = keyboard.nextInt();

        System.out.println( "How tall are you in INCHES?" );
        inches = keyboard.nextInt();

        System.out.println( "How much do you weigh?" );
        weight = keyboard.nextDouble();

        System.out.println( "So you're " + age + " old, " + feet + "'" + inches + "\" tall and " + weight + " heavy.");

    }

}
