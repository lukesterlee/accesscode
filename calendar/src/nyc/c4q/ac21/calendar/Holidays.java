package nyc.c4q.ac21.calendar;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Scanner;

public class Holidays {

    /**
     * Loads holidays from a file.
     *
     * @param holidayType
     *   The type of holiday.  Use "National holiday" for U.S. federal holidays.
     * @return
     *   A map from date to holiday name for holidays.
     */
    public static HashMap<Calendar, String> getHolidays(String holidayType) {
        ArrayList<String> lines = FileTools.readLinesFromFile("holidays.csv");
        // Each line is of the form "date,name,type", where "date" is a date
        // in YYYY-MM-DD format, "name" is the holiday name, and "type" is
        // the holiday type.  Include only those lines where "type" matches
        // the 'holidayType' parameter.



        HashMap<Calendar, String> holidays = new HashMap<Calendar, String>();

        for (String line : lines) {
            String[] holiday = line.split(",");
            if (holiday[2].equals(holidayType)) {
                holidays.put(DateTools.parseDate(holiday[0]),holiday[1]);
            }
        }
        return holidays;
    }

}
