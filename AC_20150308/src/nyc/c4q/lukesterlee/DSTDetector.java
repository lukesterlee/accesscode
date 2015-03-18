package nyc.c4q.lukesterlee;

/**
 * Access Code 2.1
 * Created by Luke Lee on 3/8/15.
 */

import java.util.Scanner;

public class DSTDetector {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /*
        String monthday;
        Integer month;
        Integer day;
        int today;

        System.out.println("enter month day day in number: ");
        month = input.nextInt();
        day = input.nextInt();

        if (day < 10) {
            monthday = month.toString() + "0" + day.toString();
        }
        else {
            monthday = month.toString() + day.toString();
        }

        today = Integer.parseInt(monthday);

        if ( today >= 308 && today <= 1101)
            System.out.println("Daylight Saving Time is in effect today!");
        else
            System.out.println("Daylight Saving Time is not in effect today!");

        */
        int month;
        int day;
        System.out.println("enter month and day : ");
        month = input.nextInt();
        day = input.nextInt();

        if ( (month > 3 && month <= 10) || (month ==3 && day > 7) )
            System.out.println("Daylight Saving Time is in effect today!");
        else
            System.out.println("Daylight Saving Time is not in effect today!");




    }
}
