package nyc.c4q.ac21;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Luke Lee on 3/29/15.
 */
public class Length {

    public static HashMap<String, Integer> getLengths(ArrayList<String> strings) {
        HashMap<String, Integer> stringLength = new HashMap<String, Integer>();
        for (String word : strings) {
            stringLength.put(word, word.length());
        }
        return stringLength;
    }

    public static void main(String[] args) {

        ArrayList<String> fruit = new ArrayList<String>();
        fruit.add("apple");
        fruit.add("pineapple");

        System.out.println(getLengths(fruit));

    }
}
