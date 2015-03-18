package nyc.c4q.lukesterlee;

/**
 * Access Code 2.1
 * Created by Luke Lee on 3/7/15.
 * This exercise is to imitate reverse polish notation calculator.
 * Reverse Polish notation is a mathematical notation where the operator comes after the two operands.
 */

import java.util.Scanner;

public class RPNCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int firstNum;
        int secondNum;
        int result = 0;
        char operator;

        System.out.println("Please enter your first number");
        firstNum = input.nextInt();

        System.out.println("Please enter your second number");
        secondNum = input.nextInt();

        System.out.println("Please enter an operator");
        operator = (input.next()).charAt(0);

        switch (operator) {
            case '+' :
                result = firstNum + secondNum;
                break;
            case '-' :
                result = firstNum - secondNum;
                break;
            case '*' :
                result = firstNum * secondNum;
                break;
            case '/' :
                result = firstNum / secondNum;
                break;
            case '%' :
                result = firstNum % secondNum;
                break;
            default: System.out.println("Wrong operator!");
        }

        System.out.println("Result : " + result);

    }
}