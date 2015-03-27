package nyc.c4q.lukesterlee;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

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
            if (num == -1)
                numbers.clear();
            else if (num != -2)
                numbers.add(num);
        }

//        for (int n : numbers) {
//            sum += n;
//        }

        Iterator<Integer> iAmIterator = numbers.iterator();
        while (iAmIterator.hasNext()) {
            sum += iAmIterator.next();
        }



        System.out.println("Thanks! Your sum is " + sum);

    }
}
