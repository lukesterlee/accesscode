package nyc.c4q.lukesterlee;

/**
 * Created by Luke Lee on 3/31/15.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DistributionCalculator {

    public static ArrayList<Double> calculate(File textFile) throws FileNotFoundException {

        int totalNumberOfCharacters = 0;
        int[] count = new int[26];
        Scanner input = new Scanner(textFile);
        ArrayList<Double> percentages = new ArrayList<Double>();

        while (input.hasNext()) {
            String word = input.next();
            for (int i = 0; i < word.length(); i++) {

                if (Character.isLetter(word.charAt(i))) {
                    char letter = Character.toLowerCase(word.charAt(i));
                    totalNumberOfCharacters++;
                    count[(int) letter - 97]++;
                }
            }

        }

        for (int i = 0; i < count.length; i++) {
            double percentage = (count[0] / totalNumberOfCharacters)*100;
            percentages.add(percentage);
        }



        return percentages;

    }

    public static void main(String[] args) {

    }
}
