package com.c4q.davisroman;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;

public class Main {

    public static void whereTheHeckAmI(){
        System.out.println("Working Directory = " + System.getProperty("user.dir"));
    }
    public static void main(String[] args) throws Exception {
        whereTheHeckAmI();

        // We need to start off by creating the object responsible for doing the heavy lifting for us.
        // So long as you've imported the json-simple library correctly then this line should be happy.
        JSONParser parser = new JSONParser();

        // Alright, so the jsonparser object is ready to go and it now wants you to point
        // it to some json data for it to chew on.
        // The weather_json_obj variable will contain the data of the entire json blob so
        // long as it parses properly and the file is found of course.
        JSONObject weather_json_obj = (JSONObject)parser.parse(new FileReader("json-files/weather.json"));

        // So at this point, we'll use weather_json_obj to help us parse our JSON blob which is
        // essentially a big hashmap where the keys return values that could consist of

        // Case 1 - String denoted by ""
        // Case 2 - Object ( think of this as hashmap) denoted by {}
        // Case 3 - Array denoted by []

        // When parsing json data, you'll need to be ready to handle all three cases.


        // But fear not! I've done you a solid and spelled out all three in good detail.

        // *Hurray!* right?


        // Case 1 - Grabbing a key whose value is a String
        // Complexity -> Eh, not so bad
        // So start with the main json blob, weather_json_obj and grab the 'name' key
        // It'll return an object of type Object`

        // Object? Huh?

        // Java uses the Object datatype when it doesn't know what it's suppose to be.
        // It's the most generic datatype that an object can be.
        // So here is where you come to the rescue.
        // We know that the value of the `name` key is String ( just look at the JSON file! ) so now we'll
        // just use what java folks like to call a `cast` to help java figure out what datatype it should be.

        // (String)weather_json_obj.get("name")   ->  takes the return value of weather_json_obj.get("name") and
        //                                            converts it into a string.

        String cityName = (String)weather_json_obj.get("name");
        System.out.println("Name: " + cityName);

        // Now that we know the magic, let's grab the values of some other keys!
        Long dt = (Long)weather_json_obj.get("dt");
        System.out.println("dt: " + dt);


        Long id = (Long)weather_json_obj.get("id");
        System.out.println("id: " + id);

        Long cod = (Long)weather_json_obj.get("cod");
        System.out.println("cod: " + id);

        //Case 2 - Grabbing a key whose value is an Object (think "hashmap")
        //Complexity - not too bad but a little tricker

        //Remember, hashmaps can point to hashmaps right?

        // So take the big JSON blob and use the wind key to return the Object
        // make sure to use a cast because we have to cast it as a JSONObject
        // and store it into a variable of type JSONObject

        JSONObject windJSONObj = (JSONObject)weather_json_obj.get("wind");

        // So basically windJSONObj now contains a hashmap that contains
        // two keys, 'speed' and 'deg' right?

        // But the quirk this time is that the value of the speed key is a double
        // Don't believe me? Just look at the JSON file.
        // Which is fine, just use a cast to convert windJSONObj.get("speed")
        // into a double and store it into a variable, windspeed of type double.
        Double windspeed = (Double)windJSONObj.get("speed");
        System.out.println("wind speed: " + windspeed);

        // Let's grab the other key while we're at it.

        Double wind_deg = (Double)windJSONObj.get("deg");
        System.out.println("wind deg: " + wind_deg);



        //Case 3

        // Grabbing a key that contains a Array

        // So let's consider the "weather" key. It looks something like this:
        /*
        ...more json above...
        "weather": [
        {
            "id": 800,
                "main": "Clear",
                "description": "Sky is Clear",
                "icon": "01d"
        }
        ],
        ...more json below...

        As you can see the weather key contains an array denoted by the open brackets.
        This is fine, we just need to ensure that the returned value is stored in a JSONArray
        like so:
        */
        JSONArray weatherJSONArray = (JSONArray)weather_json_obj.get("weather");

        // But hey, it's an array just like any array that we've used in the past!

        // Let's grab the element located at the 0th position.

        // According to our sample JSON file, we see that the value of the 0th element is an Object

        // Well well well, didn't we just already learn how to work with Objects already? ( Just visit case#2 )

        JSONObject weatherJSONObj = (JSONObject)weatherJSONArray.get(0);

        /* Sweet! Now the variable weatherJSONObj contains a JSON Object:
        {
            "id": 800,
            "main": "Clear",
            "description": "Sky is Clear",
            "icon": "01d"
        }

        But don't be fooled! As I've mentioned before, it's just a hashmap at this point.

        So I'm interested in the value of description. We can see that the value
        of the description key is "Sky is Clear" which is a String right?

        So let's grab it.

        */

        String descriptionOfWeather = (String)weatherJSONObj.get("description");

        System.out.println("Description of weather: " + descriptionOfWeather);

        // What about the id? I'm not sure what it's for but anyhow, let's grab it.

        Long myid = (Long)weatherJSONObj.get("id");

        System.out.println("weatherJSONobj's id value: " + myid);

        // So that about covers it.

        // Hope you're a little more comfortable with JSON now.

        // Happy coding!

    }
}
