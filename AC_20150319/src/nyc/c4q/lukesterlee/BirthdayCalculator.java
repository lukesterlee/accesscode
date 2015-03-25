package nyc.c4q.lukesterlee;

/**
 * Access Code 2.1
 * Created by Luke Lee on 3/19/15.
 */

import java.util.Scanner;
import java.util.Calendar;

public class BirthdayCalculator {

    public static void print(String text) {
        System.out.print(text);
    }

    public static boolean isLeapYear(int year) {

        if (year%4 != 0)
            return false;
        else if (year%100 != 0)
            return true;
        else if (year%400 != 0)
            return false;
        else
            return true;
    }

    public static int calculate(int today, int birthday, int year) {
        int daysleft;
        if (birthday >= today) {
            daysleft = birthday - today;
        } else {
            if (isLeapYear(year+1)) {
                birthday += 1;
            }
            daysleft = (365 - today) + birthday;
        }
        return daysleft;
    }

    public static void main(String[] args) {

        int year;
        int birthMonth;
        int birthDay;
        int today;
        int birthdayInDays;

        Scanner input = new Scanner(System.in);
        Calendar rightNow = Calendar.getInstance();

        today = rightNow.get(Calendar.DAY_OF_YEAR);
        year = rightNow.get(Calendar.YEAR);
        print(today + "");
        print("Please enter your birthday:\n");
        print("What is the month (1-12): ");

        birthMonth = input.nextInt();

        print("What is the day (1-31): ");

        birthDay = input.nextInt();

        rightNow.set(year,birthMonth-1,birthDay);
        birthdayInDays = rightNow.get(Calendar.DAY_OF_YEAR);
        print(birthdayInDays + "");

        print("There are " + calculate(today,birthdayInDays,year) + " days left!");


        /*
        int a =
        int
         */


    }
}
