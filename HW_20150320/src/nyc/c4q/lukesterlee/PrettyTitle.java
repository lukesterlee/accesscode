package nyc.c4q.lukesterlee;

/**
 * Access Code 2.1
 * Created by Luke Lee on 3/17/15.
 * A Pretty Title exercise has a method called printTitle that prints a phrase as a title by,
 *    1. converting it to title capitalization
 *    2. underlining each word, i.e. underlying all characters except spaces
 */

import java.util.Scanner;

public class PrettyTitle {

    public static void print(String text) {
        System.out.print(text);
    }

    public static void printTitle(String text, char symbol) {

        String[] preposition = new String[]{"and", "to", "for", "at" ,"by", "of", "with", "on", "in", "from",
                "as", "but"};
        Scanner input = new Scanner(text);
        boolean isPreposition = false;
        String word;
        String capitalizedString = "";

        while (input.hasNext()) {
            word = input.next();
            // check whether the word is preposition or not.
            for (int i=0; i<preposition.length; i++) {
                if (word.equals(preposition[i])) {
                    isPreposition = true;
                    break;
                }
            }
            // if the word is not in the preposition list, capitalize the first letter.
            if (!isPreposition)
                word = word.substring(0, 1).toUpperCase() + word.substring(1);
            capitalizedString += word + " ";
            isPreposition = false;
        }

        print(capitalizedString + "\n");

        // This loop prints '*' under the words; it skips when they encounter white spaces.
        for (int i=0; i<text.length(); i++) {
            if (text.charAt(i) != ' ')
                print(symbol + "");
            else
                print(" ");
        }
    }

    public static void main(String[] args) {
        printTitle("a tale of two cities", '*');
    }
}
