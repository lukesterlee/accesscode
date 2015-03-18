package nyc.c4q.lukesterlee;

/**
 * Created by Luke Lee on 3/10/15.
 */

import java.util.Scanner;

public class CountingMachineRevisited {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int countFrom;
        int countTo;
        int countBy;

        System.out.println("Count from: ");
        countFrom = input.nextInt();

        System.out.println("Count to  : ");
        countTo = input.nextInt();

        System.out.println("Count by  : ");
        countBy = input.nextInt();

        for (int i=countFrom; i<=countTo; i+=countBy) {
            System.out.print(i + " ");
        }

    }
}
