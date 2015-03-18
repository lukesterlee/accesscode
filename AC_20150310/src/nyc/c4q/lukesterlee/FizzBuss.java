package nyc.c4q.lukesterlee;

/**
 * Created by Luke Lee on 3/10/15.
 */
public class FizzBuss {

    public static void main(String[] args) {

        for (int i=1; i<=100; i++) {


            /*
             * This is the first solution I came up with

            if (i % 15 == 0)
                System.out.println("FizzBuzz");
            else if (i % 3 == 0)
                System.out.println("Fizz");
            else if (i % 5 == 0)
                System.out.println("Buzz");
            else
                System.out.println(i);

            */

            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
                continue;
            }
            if (i % 3 == 0) {
                System.out.println("Fizz");
                continue;
            }
            if (i % 5 == 0) {
                System.out.println("Buzz");
                continue;
            }
            System.out.println(i);

            /*
             * Greg's solution from javascript.

            for (int i = 1; i <= 100; i++) {
                String value= '';

                if (i % 3 == 0) {
                    value += 'Fizz';
                }

                if (i % 5 == 0) {
                    value += 'Buzz';
                }

                // If `string` is empty, `i` is not divisible
                // by 3 or 5, so use the number instead.
                if (value == '') {
                    value += i;
                }

                System.out.println(value);
            }
            */

        }
    }
}
