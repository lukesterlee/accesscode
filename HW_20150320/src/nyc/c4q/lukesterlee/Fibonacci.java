package nyc.c4q.lukesterlee;

/**
 * Access Code 2.1
 * Created by Luke Lee on 3/17/15.
 * The Fibonacci Sequence is the series of numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
 * Write a program which accepts as input an integer N and returns the N-th Fibonacci number.
 * To test whether your program returned the correct number, go to Wolfram Alpha,
 * and enter fibonacci(N) where N is your input integer
 */
public class Fibonacci {

    public static int fibonacci(int nthNum) {

        // If N-th number is 1, return 0.
        if (nthNum == 1)
            return 0;
        // If N-th number is 2, return 1.
        else if (nthNum == 2)
            return 1;
        // Otherwise, return the value of N-th-1 number and N-th-2 number.
        else
            return fibonacci(nthNum-2) + fibonacci(nthNum-1);
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(20));
    }
}
