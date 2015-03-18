package nyc.c4q.lukesterlee;

/**
 * Access Code 2.1
 * Created by Luke Lee on 3/8/15.
 */

import java.util.Scanner;

public class DayCatcher {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int month;
        int day;
        String specialDay;

        System.out.println("Which month?(1~12)");
        month = input.nextInt();

        System.out.println("Which day? (1~31)");
        day = input.nextInt();

        if (month == 1 && day == 1) {
            specialDay = "New Year's Day";
        }
        else if (month == 12 && day == 25) {
            specialDay = "Christmas Day";
        }
        else if (month == 7 && day == 4) {
            specialDay = "the Fourth of July";
        }
        else if (month == 5 && day == 5) {
            specialDay = "Cinco de Mayo";
        }
        else if (month == 12 && day == 31) {
            specialDay = "New Year's Eve";
        }
        else {
            specialDay = "is not a holiday";
        }

        System.out.println("Today is " + specialDay + "!");

    }
}
