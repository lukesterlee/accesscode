package nyc.c4q.ac21.calendar;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;

public class CalendarPrinter
{

    /**
     * Prints a calendar for a month.
     *
     * Prints the calendar in the traditional format with one week per line.
     * Each week starts on Sunday and shows the days of month for days in
     * that week.  The current date is marked with an asterisk.
     *
     * For example, for 2015-04-03, prints this:
     *
     *     April 2015
     *                  1   2   3*  4
     *      5   6   7   8   9  10  11
     *     12  13  14  15  16  17  18
     *     19  20  21  22  23  24  25
     *     26  27  28  29  30
     *
     * @param date
     *   The date containing the month to print.
     */
    public static void printMonthCalendar(Calendar date) {
        // FIXME: Write this.
        // Use these methods to help you:
        //   DateTools.getMonthNames()
        //   DateTools.getNextDay() to loop through days in the month.

        HashMap<Integer, String> monthNames = DateTools.getMonthNames();

        System.out.println("\n" + monthNames.get(date.get(Calendar.MONTH)) + " " + date.get(Calendar.YEAR));

        Calendar day = (Calendar) date.clone();
        day.set(date.get(Calendar.YEAR), date.get(Calendar.MONTH), 1);

        ArrayList<ArrayList<Integer>> calendar = new ArrayList<ArrayList<Integer>>();


        int week;
        // for padding.
        for (int j = 1; j < day.get(Calendar.DAY_OF_WEEK); j++) {
            System.out.print("    ");
        }

        week = day.get(Calendar.DAY_OF_WEEK);
        for (int i = day.get(Calendar.DAY_OF_MONTH); i <= date.getActualMaximum(Calendar.DAY_OF_MONTH); i++) {

            if (i < 10)
                System.out.print(" ");

            System.out.print(i);

            if (i == date.get(Calendar.DAY_OF_MONTH))
                System.out.print("* ");
            else
                System.out.print("  ");

            if (week%7 == 0)
                System.out.println();

            //day = DateTools.getNextDay(day);
            week++;
        }
    }

}
