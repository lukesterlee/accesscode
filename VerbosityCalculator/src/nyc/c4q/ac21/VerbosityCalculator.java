package nyc.c4q.ac21;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Access Code 2.1
 * Created by Luke Lee on 03/20/15
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

                // if the word contains "." or "!" or "?", then count it as a sentence.
                if (word.contains(".") || word.contains("!") || word.contains("?"))
                    sentenceCount++;
                // don't count periods with Mr. and Mrs.
                if (word.equalsIgnoreCase("mr.") || word.equalsIgnoreCase("mrs."))
                    sentenceCount--;
            }

            Scanner reader2 = new Scanner(file);
            while(reader2.hasNextLine()) {
                word = reader2.nextLine();
                for (int i=0; i<word.length()-3; i++) {
                    // if "?" is followed by quotation mark and white space and lower case letter, then don't count it as a sentence.
                    if (word.charAt(i) == '?' && word.charAt(i+1) == '"' && word.charAt(i+2) == ' ' && word.charAt(i+3) == Character.toLowerCase(word.charAt(i + 3)))
                        sentenceCount--;
                    // if "!" is followed by quotation mark and white space and lower case letter, then don't count it as a sentence.
                    if (word.charAt(i) == '!' && word.charAt(i+1) == '"' && word.charAt(i+2) == ' ' && word.charAt(i+3) == Character.toLowerCase(word.charAt(i+3)))
                        sentenceCount--;
                }
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
        File dickens = new File("C:\\Users\\Luke\\Desktop\\accesscode\\VerbosityCalculator\\resources\\pg98.txt");
        File mobydick = new File("C:\\Users\\Luke\\Desktop\\accesscode\\VerbosityCalculator\\resources\\pg2701.txt");

        print("A Tale of Two Cities, by Charles Dickens");
        /*
         * OUTPUT of printAverage(dickens);
         * This book has total 138879 words.
         * This book has total 7681 sentences.
         * Total average is 18.08
         */
        printAverage(dickens);

        print("Moby Dick; or The Whale by Herman Melville");
        /*
         * OUTPUT of printAverage(mobydick);
         * This book has total 215135 words.
         * This book has total 10256 sentences.
         * Total average is 20.98
         */
        printAverage(mobydick);

    }
}
