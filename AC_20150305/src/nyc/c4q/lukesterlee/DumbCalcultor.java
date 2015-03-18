/**
 * Access Code 2.1
 * Luke Lee
 * This exercise is to practice how to use Scanner and nextDouble method.
 */

import java.util.Scanner;

public class DumbCalcultor {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double firstNum;
        double secondNum;
        double thirdNum;
        double answer;

        System.out.println("What is your first number?");
        firstNum = input.nextDouble();

        System.out.println("What is your second number?");
        secondNum = input.nextDouble();

        System.out.println("What is your third number?");
        thirdNum = input.nextDouble();

        answer = (firstNum + secondNum + thirdNum) / 2;

        System.out.println("( " + firstNum + " + " + secondNum + " + " + thirdNum + " ) / 2 is... " + answer);


    }
}
