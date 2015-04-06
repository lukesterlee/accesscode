package nyc.c4q.lukesterlee;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.Scanner;

public class Concordance {

    private HashSet<String> excludedWords;
    private TreeMap<String, HashSet<Integer>> listing;


    public Concordance(String filename, HashSet<String> bannedWords) throws FileNotFoundException {

        excludedWords = bannedWords;
        listing = new TreeMap<String, HashSet<Integer>>();


        File file = new File(filename);
        Scanner input = new Scanner(file);

        String sentence;
        int lineNumber = 1;


        while (input.hasNextLine()) {
            sentence = input.nextLine();

            String[] words = sentence.split(" ");

            for (String word : words) {

                if(!Character.isLetter(word.charAt(0)))
                    word = word.substring(1)

                if(!Character.isLetter(word.charAt(word.length()-1)))
                    word = word.substring(0, word.length()-2);

                if (!bannedWords.contains(word) && word.length() >= 3) {

                    if (listing.get(word) ==  null) {
                        HashSet<Integer> lineNumbers = new HashSet<Integer>();
                        lineNumbers.add(lineNumber);
                        listing.put(word, lineNumbers);
                    } else {
                        HashSet<Integer> lineNumbers = listing.get(word);
                        lineNumbers.add(lineNumber);
                        listing.put(word, lineNumbers);
                    }

                }
            }

            lineNumber++;
        }


    }

    public HashSet<Integer> findLineNumbers(String word) {
        return listing.get(word);
    }
    public HashSet<Integer> getCommonLines(String word1, String word2) {

        HashSet<Integer> commonLines = new HashSet<Integer>();
        HashSet<Integer> word1LineNumbers = listing.get(word1);
        HashSet<Integer> word2LineNumbers = listing.get(word2);

        for (int lineNumber : word1LineNumbers) {
            if (word2LineNumbers.contains(lineNumber)) {
                commonLines.add(lineNumber);
            }
        }
        return commonLines;

    }


    public void print() {

        System.out.println(listing);

    }

}