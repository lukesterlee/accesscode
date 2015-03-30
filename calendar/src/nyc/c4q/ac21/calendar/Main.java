package nyc.c4q.ac21.calendar;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static int change(int x) {

        x = 20;

        return x;
    }


    public static void main(String[] args) {

        int x = 0;
        x = change(x);
        System.out.println(x);


        Scanner scanner = new Scanner(System.in);
        System.out.print("date? ");
        String dateString = scanner.nextLine();
        Calendar date = DateTools.parseDate(dateString);
        if (date == null)
            return;
        System.out.println();

        System.out.println("date:              " + DateTools.formatDate(date));

        // FIXME: Write the rest of this method!

        // 1. Show the day of the week.
        HashMap<Integer, String> dayOfWeekNames = DateTools.getDayOfWeekNames();
        int week = date.get(Calendar.DAY_OF_WEEK);
        System.out.println("day of week:       " + dayOfWeekNames.get(week));

        // 2. Show whether this is a work day.
        HashMap<Integer, Boolean> workDays = WorkDays.getWorkDays();
        System.out.println("work day:          " + workDays.get(week));

        // 3. Show whether this is a national holiday, and if so, which.
        HashMap<Calendar, String> holidays = Holidays.getHolidays("National holiday");
        System.out.println("national holiday:  " + holidays.get(date));

        // 4. Show whether this date is in DST.
        boolean isDST = DST.isDST(date);
        // ...

        // 5. Show the zodiac sign.
        String zodiacSign = Zodiac.getZodiacSign(date);
        // ...

        // 6. Print out the monthly calendar.
        CalendarPrinter.printMonthCalendar(date);

    }
}
