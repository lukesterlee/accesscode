package nyc.c4q.lukesterlee;

/**
 * Created by Luke on 3/10/2015.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Calculator {
    /**
     * Performs calculations on Roman numerals and prints the result.
     *
     * If either of the numbers are not Roman numerals, or if the operation is
     * unrecognized, prints an error message.  Otherwise, performs the
     * operation and prints the result in Roman numerals.  If the result is
     * less than 1 or larger than 3999, prints a message indicating this
     * instead.
     *
     * @param leftNumber
     *   The left operand, in Roman numerals.
     * @param operation
     *   The operator, which may be,
     *   - "+" for addition,
     *   - "-" for subtraction,
     *   - "*" for multiplication,
     *   - "/" for (integer) division,
     *   - "%" for remainder,
     *   - "#" to average the two numbers.
     * @param rightNumber
     *   The right operand.
     */
    public static void calculate(String leftNumber, String operation, String rightNumber) {
        // TODO: Group 3: Write this function!
        String result;
        int left;
        int right;
        int answer = 0;
        char symbol = operation.charAt(0);

        if (!operation.equals("+") && !operation.equals("-") && !operation.equals("*") && !operation.equals("/") && !operation.equals("%") && !operation.equals("#")) {
            System.out.println("invalid operation: " + operation);
            return;
        }

        left = RomanNumerals.parse(leftNumber);
        right = RomanNumerals.parse(rightNumber);

        if (left == -1) {
            System.out.println("Invalid number: " + leftNumber);
            return;
        }
        if (right == -1) {
            System.out.println("Invalid number: " + rightNumber);
            return;
        }

        switch (symbol) {
            case '+' :
                answer = left + right;
                break;
            case '-' :
                answer = left - right;
                break;
            case '*' :
                answer = left * right;
                break;
            case '/' :
                answer = left / right;
                break;
            case '%' :
                answer = left % right;
                break;
            case '#' :
                answer = (left + right) / 2;
                break;
        }

        if (answer > 3999 || answer < 1) {
            System.out.println("The result is out of the range!");
            return;
        }

        result = RomanNumerals.format(answer);

        System.out.println(result);
    }

    /**
     * Parses a decimal number.
     * @param number
     *   A decimal number, e.g. "459".
     * @return
     *   The value of the number, or -1 if it cannot be parsed.
     * @note
     *   This function is for testing only.  It should not be used in the final program.
     * @note
     *   You do not need to understand how this function works.
     */
    public static int parseDecimalNumber(String number) {
        try {
            return Integer.valueOf(number);
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    /**
     * @note
     *   You do not need to understand how this function works.
     */
    public static void main(String[] args) throws IOException {
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // Loop forever.
        while (true) {
            // Show the prompt.
            System.out.print("> ");
            // Read a line of input.
            final String line = reader.readLine();
            if (line.length() == 0) {
                System.out.println("done");
                break;
            }
            // Scan the line into three parts: two numbers with an operator between them.
            final Scanner scanner = new Scanner(line);
            final String leftNumber, operation, rightNumber;
            try {
                leftNumber = scanner.next();
                operation = scanner.next();
                rightNumber = scanner.next();
            }
            catch (NoSuchElementException e) {
                System.err.println("syntax error");
                System.out.println();
                continue;
            }

            // Perform the calculation and show the result.
            calculate(leftNumber, operation, rightNumber);

            System.out.println();
        }
    }
}