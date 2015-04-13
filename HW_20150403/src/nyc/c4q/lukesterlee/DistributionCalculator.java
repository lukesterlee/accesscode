package nyc.c4q.lukesterlee;

/**
 * Created by Luke Lee on 3/31/15.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DistributionCalculator {

    // calculate method accepts as input a Text file. It reads the contents of the file,
    // and returns an ArrayList which contains the distribution/percentage of characters (a-z) in the text file.
    public static ArrayList<Double> calculate(File textFile) throws FileNotFoundException {

        int totalNumberOfCharacters = 0;
        int[] count = new int[26];
        for (int i = 0; i < count.length; i++) {
            count[i] = 0; // initialize all to 0 in order to increment later.
        }

        Scanner input = new Scanner(textFile);
        ArrayList<Double> percentages = new ArrayList<Double>();

        while (input.hasNext()) {
            // reads every word, automatically skips spaces
            String word = input.next();
            for (int i = 0; i < word.length(); i++) {
                // only count letters.
                if (Character.isLetter(word.charAt(i))) {
                    char letter = Character.toLowerCase(word.charAt(i)); // change all letters to lower cases.
                    totalNumberOfCharacters++; // count the total number of letters/
                    count[(int) letter - 97]++; // count the character you just read. char 'a' is saved in the index 0.
                }
            }

        }

        // calculate the percentage and add to the ArrayList.
        double percentage;
        for (int number : count) {
            if (number == 0)
                percentage = 0;
            else
                percentage = (number*100) / totalNumberOfCharacters;
            percentages.add(percentage);
        }
        return percentages;
    }

    public static void main(String[] args) throws FileNotFoundException {

        String fileName = "/Users/Willee/Desktop/accesscode/HW_20150403/resources/hello.txt";
        File file = new File(fileName);

        ArrayList<Double> percentage = calculate(file);

        // 97 is an integer value of char 'a'. increments until 'z'
        int letter = 97;
        for (Double probability : percentage) {
            System.out.print((char) letter + " = ");
            System.out.println(probability);
            letter++;
        }
    }
}
