package nyc.c4q.ac21.weatherclock;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import java.net.URL;
import java.text.DecimalFormat;
import java.util.Calendar;

/**
 * Created by Luke Lee on 4/7/15.
 */
public class Weather {

    public static String weatherPicture(String condition) {
        if (condition.equalsIgnoreCase("light rain")) {

        }
        return "";
    }

    public static String getWeather(URL url) {
        String doc = HTTP.get(url);
        JSONObject obj = (JSONObject) JSONValue.parse(doc);
        JSONArray weatherArray = (JSONArray) obj.get("weather");
        JSONObject weather = (JSONObject) weatherArray.get(0);
        String description = (String) weather.get("description");
        return description;
    }


    public static String getTemperature(URL url, boolean isCelcius) {

        String doc = HTTP.get(url);
        JSONObject obj = (JSONObject) JSONValue.parse(doc);
        JSONObject main = (JSONObject) obj.get("main");
        DecimalFormat df = new DecimalFormat("#.0");
        Double temp = (Double) main.get("temp");
        temp -= 273;

        if (isCelcius)
            return df.format(temp) + "°C";
        else {
            temp = temp*(9/5) + 32;
            return df.format(temp) + "°F";
        }


    }

    public static String getPressure(URL url) {

        String doc = HTTP.get(url);
        JSONObject obj = (JSONObject) JSONValue.parse(doc);
        JSONObject main = (JSONObject) obj.get("main");
        DecimalFormat df = new DecimalFormat("#.0");

        Double pressure = (Double) main.get("pressure");
        pressure = pressure*0.0296133971008484;
        return df.format(pressure);
    }

    public static Integer getHumidity(URL url) {

        String doc = HTTP.get(url);
        JSONObject obj = (JSONObject) JSONValue.parse(doc);
        JSONObject main = (JSONObject) obj.get("main");
        DecimalFormat df = new DecimalFormat("#.0");

        long humidity = (Long) main.get("humidity");
        Integer hum = (int) (long) humidity;
        return hum;
    }


}
