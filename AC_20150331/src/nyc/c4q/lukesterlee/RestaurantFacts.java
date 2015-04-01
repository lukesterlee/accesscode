package nyc.c4q.lukesterlee;

/**
 * Access Code 2.1
 *
 * Author  <YOUR NAME>
 * Date    March 2015
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class RestaurantFacts {

    public static void main(String[] args) {
        // Step 1. Use FileParser's static method getLines() to get a nested
        //         ArrayList representing the CSV file.
        //
        //         For now, use "nyc-restaurants-small.csv".
        //
        //         Use a parameter to specify which column you're interested
        //         in. For now, use the int 14, which will give you the
        //         restaurant's grade.

        String fileName = "nyc-restaurants-small.csv";
        ArrayList<ArrayList<String>> fact = new ArrayList<ArrayList<String>>();

        fact = FileParser.getLines(fileName, 14);

        // Step 2. Build a HashMap named "restaurants".
        //         Loop over every line and add the appropriate data to your
        //         HashMap.

        HashMap<String, String> restaurants = new HashMap<String, String>();


        for (int i = 0; i < fact.size(); i++) {
            restaurants.put(fact.get(i).get(1), fact.get(i).get(14));
        }


        // Step 3. Create a Scanner and prompt the user for a restaurant.
        //         If the restaurant has a relevant fact, print it. Otherwise
        //         print "Restaurant not found.".

        Scanner input = new Scanner(System.in);
        System.out.println("Name a restaurant:");
        String name = input.nextLine();
        System.out.println(restaurants.get(name));
    }
}