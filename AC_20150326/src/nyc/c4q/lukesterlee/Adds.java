package nyc.c4q.lukesterlee;

import java.util.ArrayList;
import java.util.Scanner;

public class Adds {

    public static void main(String[] args) {
	// write your code here

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        int num = 0;
        int sum = 0;

        System.out.println("Give me some numbers to add:");
        while (num != -2) {
            num = input.nextInt();
            if (num != -2)
                numbers.add(num);
        }

        for (int n : numbers) {
            sum += n;
        }


        System.out.println("Thanks! Your sum is " + sum);

    }
}
