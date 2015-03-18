package nyc.c4q.lukesterlee;

/**
 * Created by Luke Lee on 3/17/15.
 */
public class Fibonacci {

    public static void print(String text) {
        System.out.print(text);
    }

    public static int fibonacci(int size) {

        if (size == 1)
            return 0;
        else if (size == 2)
            return 1;
        else
            return fibonacci(size-2) + fibonacci(size-1);
    }

    public static void main(String[] args) {

        print("" + fibonacci(20));

    }
}
