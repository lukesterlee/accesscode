package nyc.c4q.ac21.weatherclock;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import java.net.URL;
import java.util.Calendar;
import java.util.Scanner;
import java.util.concurrent.CancellationException;

public class Main {

    /**
     * SAMPLE CODE: Returns sunset time for the current day.
     */
    public static Calendar getSunset() {
        URL url = HTTP.stringToURL("http://api.openweathermap.org/data/2.5/weather?q=New%20York,NY");
        String doc = HTTP.get(url);
        JSONObject obj = (JSONObject) JSONValue.parse(doc);

        JSONObject sys = (JSONObject) obj.get("sys");
        if (sys == null)
            return null;
        Long sunsetTimestamp = (Long) sys.get("sunset");
        if (sunsetTimestamp == null)
            return null;
        return DateTime.fromTimestamp(sunsetTimestamp);
    }

    public static Calendar getSunrise() {
        URL url = HTTP.stringToURL("http://api.openweathermap.org/data/2.5/weather?q=New%20York,NY");
        String doc = HTTP.get(url);
        JSONObject obj = (JSONObject) JSONValue.parse(doc);

        JSONObject sys = (JSONObject) obj.get("sys");
        if (sys == null)
            return null;
        Long sunsetTimestamp = (Long) sys.get("sunrise");
        if (sunsetTimestamp == null)
            return null;
        return DateTime.fromTimestamp(sunsetTimestamp);
    }

    public static String greeting(Calendar date) {
        String greeting;

        int hour = date.get(Calendar.HOUR_OF_DAY);

        if (hour >= 6 && hour < 12) {
            greeting = "Good morning";
        } else if (hour >= 12 && hour <= 18) {
            greeting = "Good afternoon";
        } else if (hour >= 19 && hour <= 21) {
            greeting = "Good evening";
        } else
            greeting = "Hello";

        return greeting;
    }

    /**
     * SAMPLE CODE: Displays a very primitive clock.
     */
    public static void main(String[] args) {

        String name;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name : ");

        name = input.nextLine();

        // Find out the size of the terminal currently.
        final int numCols = TerminalSize.getNumColumns();
        final int numRows = TerminalSize.getNumLines();

        // Create the terminal.
        final AnsiTerminal terminal = new AnsiTerminal();

        // When the program shuts down, reset the terminal to its original state.
        // This code makes sure the terminal is reset even if you kill your
        // program by pressing Control-C.
        Runtime.getRuntime().addShutdownHook(new Thread() {
            public void run() {
                terminal.showCursor();
                terminal.reset();
                terminal.scroll(1);
                terminal.moveTo(numRows, 0);
            }
        });

        // Clear the screen to black.
        terminal.setBackgroundColor(AnsiTerminal.Color.BLACK);
        terminal.clear();
        // Don't show the cursor.
        terminal.hideCursor();

        // Get sunset time for the current day.
        Calendar sunset = getSunset();

        // Get sunset time for the current day.
        Calendar sunrise = getSunrise();


        int xPosition = 1 + numCols / 2 - 5;
        while (true) {
            // Get the current date and time.
            Calendar cal = Calendar.getInstance();

            // Get the current year.
            int year = cal.get(Calendar.YEAR);
            int month = cal.get(Calendar.MONTH);
            int day = cal.get(Calendar.DAY_OF_MONTH);

            // Write the time, including seconds, in white.
            String time = DateTime.formatTime(cal, true);
            if (cal.get(Calendar.HOUR_OF_DAY) >= 12)
                time += " PM";
            else
                time += " AM";
            terminal.setTextColor(AnsiTerminal.Color.WHITE);
            terminal.moveTo(3, xPosition);
            terminal.write(time);

            // Write the date in gray.
            String date = DateTime.formatDate(cal);
            terminal.setTextColor(AnsiTerminal.Color.WHITE, false);
            terminal.moveTo(5, xPosition);
            terminal.write(date);

            // Write the day of the week in green on a blue background.
            String dayOfWeek = DateTime.getDayOfWeekNames().get(cal.get(Calendar.DAY_OF_WEEK));
            String dayOfMonth = DateTime.getMonthNames().get(month);
            terminal.setTextColor(AnsiTerminal.Color.GREEN);
            terminal.setBackgroundColor(AnsiTerminal.Color.BLUE);
            terminal.moveTo(7, xPosition);
            terminal.write("  " + dayOfWeek + ", " + dayOfMonth + " " + day + " " + year);

            // Set the background color back to black.
            terminal.setBackgroundColor(AnsiTerminal.Color.BLACK);

            // Write sunrise time in dark yellow.
            String sunriseTime = DateTime.formatTime(sunrise, false);
            terminal.setTextColor(AnsiTerminal.Color.YELLOW, false);
            terminal.moveTo(9, xPosition - 2);
            terminal.write("sunrise at " + sunriseTime + " AM");


            // Write sunset time in dark yellow.
            String sunsetTime = DateTime.formatTime(sunset, false);
            terminal.setTextColor(AnsiTerminal.Color.YELLOW, false);
            terminal.moveTo(11, xPosition - 2);
            terminal.write("sunset at " + sunsetTime + " PM");

            // Write calendar.

            // Write DST.
            boolean isDST = DST.isDST(cal);
            terminal.setTextColor(AnsiTerminal.Color.WHITE, false);
            terminal.moveTo(13, xPosition);
            if (isDST) {
                terminal.write("DST is in effect.");
            } else {
                terminal.write("DST is not in effect.");
            }

            // Write greeting.
            terminal.setTextColor(AnsiTerminal.Color.WHITE, false);
            terminal.moveTo(15, xPosition);
            terminal.write(greeting(cal) + ", " + name);

            // Write temp
            String temp = Weather.getTemperature();
            terminal.setTextColor(AnsiTerminal.Color.WHITE, false);
            terminal.moveTo(17, xPosition);
            terminal.write("Temp : " + temp);

            // Write humidity.
            Integer humidity = Weather.getHumidity();
            terminal.setTextColor(AnsiTerminal.Color.WHITE, false);
            terminal.moveTo(18, xPosition);
            terminal.write("Humidity : " + humidity + "%");

            // Pause for one second, and do it again.
            DateTime.pause(1.0);
        }
    }
}
