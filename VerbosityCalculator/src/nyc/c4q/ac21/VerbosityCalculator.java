package nyc.c4q.ac21;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Calculate the verbosity of a text
 */
public class VerbosityCalculator {

    public static void print(String text) {
        System.out.println(text);
    }

    public static void printAverage(File file) {
        DecimalFormat df = new DecimalFormat("#.00");
        int wordCount = 0;
        int sentenceCount = 0;
        String word;
        try {
            Scanner reader = new Scanner(file);

            while (reader.hasNext()) {

                word = reader.next();
                wordCount++;

                if ('.' == word.charAt(word.length()-1))
                    sentenceCount++;

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        print("This book has total " + wordCount + " words.");
        print("This book has total " + sentenceCount + " sentences.");
        print("Total average is " + df.format((double)wordCount/sentenceCount)  + "\n");

    }

    public static void main(String[] args){

        // An abstract representation of a File
        File dickens = new File("/Users/Willee/Desktop/accesscode/VerbosityCalculator/resources/pg98.txt");
        File mobydick = new File("/Users/Willee/Desktop/accesscode/VerbosityCalculator/resources/pg2701.txt");

        printAverage(dickens);
        printAverage(mobydick);



    }
}
