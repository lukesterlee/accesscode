package nyc.c4q.lukesterlee;

/**
 * Created by Luke Lee on 3/17/15.
 */

import java.util.Scanner;

public class PrettyTitle {

    public static void print(String text) {
        System.out.print(text);
    }

    public static void printTitle(String text, char symbol) {

        print(text+ "\n");

        for (int i=0; i<text.length(); i++) {
            if (text.charAt(i) != ' ')
                print("*");
            else
                print(" ");
        }

    }

    public static String capitalize(String text) {

        String[] preposition = new String[]{"and", "to", "for", "at" ,"by", "of", "with", "on", "in", "from",
                "as", "but"};
        Scanner input = new Scanner(text);
        boolean isPreposition = false;
        String word;
        String capitalizedString = "";
        while (input.hasNext()) {
            word = input.next();

            for (int i=0; i<preposition.length; i++) {
                if (word.equals(preposition[i])) {
                    isPreposition = true;
                    break;
                }
            }
            if (!isPreposition) {
                word = word.substring(0, 1).toUpperCase() + word.substring(1);
            }
            capitalizedString += word + " ";
            isPreposition = false;
        }

        return capitalizedString;
    }

    public static void main(String[] args) {

        printTitle(capitalize("Hello, this is Luke Lee and William"), '*');



    }

}
