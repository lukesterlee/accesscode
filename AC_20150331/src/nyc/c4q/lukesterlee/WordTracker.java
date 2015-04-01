package nyc.c4q.lukesterlee;

/**
 * Created by Luke Lee on 3/31/15.
 */

import java.util.HashMap;
import java.util.Scanner;

public class WordTracker {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        String word;
        boolean addMode = true;
        HashMap<String, Integer> words = new HashMap<String, Integer>();
        System.out.println("Please give me some words:");

        while (true) {

            word = input.nextLine();
            if (word.equals("stop"))
                break;
            else if (word.equals("rm")) {
                addMode = false;
                continue;
            } else if (word.equals("add")) {
                addMode = true;
                continue;
            } else if (word.equals("clr")) {
                words.clear();
                continue;
            }


            if (addMode) {
                if (words.containsKey(word))
                    words.put(word, words.get(word)+1);
                else
                    words.put(word, 1);
            } else {
                if (words.get(word) == 1)
                    words.remove(word);
                else
                    words.put(word, words.get(word)-1);
            }

        }

        System.out.println("Thanks! You have given me " + words.size() + " word(s)!");
        if (words.isEmpty())
            System.out.println("Words is empty.");
        else {
            System.out.println("Here they are:");
            for (String voca : words.keySet()) {
                System.out.println(voca + ": " + words.get(voca));
            }
        }



    }

}
