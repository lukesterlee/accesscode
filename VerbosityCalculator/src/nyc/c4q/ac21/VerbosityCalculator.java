package nyc.c4q.ac21;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Calculate the verbosity of a text
 */
public class VerbosityCalculator {

    public static void print(String text) {
        System.out.println(text);
    }
    public static void main(String[] args){

        // to count the number of words.
        int wordCount = 0;
        int sentenceCount = 0;
        // An abstract representation of a File
        File file = new File("/Users/Willee/Desktop/accesscode/VerbosityCalculator/resources/pg98.txt");
        File file2 = new File("/Users/Willee/Desktop/accesscode/VerbosityCalculator/resources/pg2701.txt");

        try{
            Scanner sc = new Scanner(file);

            String word;
            while (sc.hasNext()) {

                word = sc.next();
                wordCount++;

                for(int i=0; i<word.length(); i++) {
                    if ('.' == word.charAt(i))
                        sentenceCount++;
                }

            }


        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }

        print(wordCount + "");
        print(sentenceCount + "");



    }
}
