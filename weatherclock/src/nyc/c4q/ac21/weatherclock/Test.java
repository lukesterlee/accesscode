package nyc.c4q.ac21.weatherclock;

import java.util.Calendar;

/**
 * Created by Luke Lee on 4/7/15.
 */
public class Test {
    public static void main(String[] args) {

        Calendar today = Calendar.getInstance();

        //today.set(Calendar.HOUR);

        System.out.println(today.get(Calendar.AM));
        System.out.println(today.get(Calendar.AM_PM));

        System.out.println(today.get(Calendar.HOUR));
        System.out.println(today.get(Calendar.HOUR_OF_DAY));
    }
}
