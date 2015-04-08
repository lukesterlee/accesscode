package nyc.c4q.ac21.calendar;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;

public class DateTools {
    /**
     * Formats a 'Calendar' object as a date.
     * @param cal
     *   The object to format.
     * @return
     *   The date in "YYYY-MM-DD" format.
     */
    public static String formatDate(Calendar cal) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        return format.format(cal.getTime());
    }

    /**
     * Parses a date in "YYYY-MM-DD" format.
     * @param date
     *   The date in "YYYY-MM-DD" format.
     * @return
     *   The date it represents, or null if the date is incorrectly formatted.
     */
    public static Calendar parseDate(String date) {
        if (date.length() == 10 && date.charAt(4) == '-' && date.charAt(7) == '-') {
            try {
                int year = Integer.valueOf(date.substring(0, 4));
                int month = Integer.valueOf(date.substring(5, 7));
                int dayOfMonth = Integer.valueOf(date.substring(8, 10));
                if (year > 0 && year <= 9999
                        && month >= 1 && month <= 12
                        && dayOfMonth >= 1 && dayOfMonth <= 31) {
                    // Allocate directly instead of using Calendar.getInstance() so that we don't
                    // set the time fields and leave them initialized to zero.
                    return new GregorianCalendar(year, month - 1, dayOfMonth);
                }
            } catch (NumberFormatException exception) {
                // Fall through.
            }
        }
        // Didn't work.
        return null;
    }

    /**
     * Returns the following day.
     */
    public static Calendar getNextDay(Calendar cal) {
        // 'Calendar' is mutable, but we don't want to change it.  Instead, create a copy and change that.
        cal = (Calendar) cal.clone();
        cal.add(Calendar.DAY_OF_MONTH, 1);
        return cal;
    }

    /**
     * Builds and returns a map from integers representing days of the week to the names of the days of the week.
     * @return
     *   A map with keys 'Calendar.MONDAY' through 'Calendar.SUNDAY' with corresponding day names as values.
     */
    public static HashMap<Integer, String> getDayOfWeekNames() {
        HashMap<Integer, String> dayOfWeekNames = new HashMap<Integer, String>();

        dayOfWeekNames.put(Calendar.MONDAY, "Monday");
        dayOfWeekNames.put(Calendar.TUESDAY, "Tuesday");
        dayOfWeekNames.put(Calendar.WEDNESDAY, "Wednesday");
        dayOfWeekNames.put(Calendar.THURSDAY, "Thursday");
        dayOfWeekNames.put(Calendar.FRIDAY, "Friday");
        dayOfWeekNames.put(Calendar.SATURDAY, "Saturday");
        dayOfWeekNames.put(Calendar.SUNDAY, "Sunday");

        return dayOfWeekNames;
    }

    public static HashMap<Integer, String> getMonthNames() {
        HashMap<Integer, String> monthNames = new HashMap<Integer, String>();

        monthNames.put(0, "January");
        monthNames.put(1, "February");
        monthNames.put(2, "March");
        monthNames.put(3, "April");
        monthNames.put(4, "May");
        monthNames.put(5, "June");
        monthNames.put(6, "July");
        monthNames.put(7, "August");
        monthNames.put(8, "September");
        monthNames.put(9, "October");
        monthNames.put(10, "November");
        monthNames.put(11, "December");

        return monthNames;
    }


}
