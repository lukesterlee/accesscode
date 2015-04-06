package nyc.c4q.lukesterlee;

import java.io.FileNotFoundException;
import java.util.HashSet;

/**
 * Created by Luke Lee on 4/4/15.
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException {


        String filename = "/Users/Willee/Desktop/accesscode/AC_20150404/mobydick-chapter1-loomings.txt";

        HashSet<String> bannedWords = new HashSet<String>();
        bannedWords.add("the");

        Concordance lists = new Concordance(filename, bannedWords);

        lists.print();


        //System.out.println(lists.findLineNumbers(""));


    }
}
