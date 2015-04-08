package nyc.c4q.ac21.weatherclock;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import java.net.URL;
import java.text.DecimalFormat;
import java.util.Calendar;

/**
 * Created by Luke Lee on 4/7/15.
 */
public class Weather {

    static URL url = HTTP.stringToURL("http://api.openweathermap.org/data/2.5/weather?q=New%20York,NY");
    static String doc = HTTP.get(url);
    static JSONObject obj = (JSONObject) JSONValue.parse(doc);

    public static Calendar getSunset() {

        JSONObject sys = (JSONObject) obj.get("sys");
        if (sys == null)
            return null;
        Long sunsetTimestamp = (Long) sys.get("sunset");
        if (sunsetTimestamp == null)
            return null;
        return DateTime.fromTimestamp(sunsetTimestamp);

    }

    public static String getTemperature() {
        DecimalFormat df = new DecimalFormat("#.0");

        JSONObject main = (JSONObject) obj.get("main");
        Double temp = (Double) main.get("temp");
        temp -= 273;
        temp = temp*(9/5) + 32;
        return df.format(temp);
    }

    public static float getPressure() {
        return 1.0F;
    }

    public static Integer getHumidity() {
        JSONObject main = (JSONObject) obj.get("main");
        long humidity = (Long) main.get("humidity");
        Integer hum = (int) (long) humidity;
        return hum;
    }


}
