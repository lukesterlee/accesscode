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
        Scanner input = new Scanner(text);
        String word;
        String capitalizedString = "";
        while (input.hasNext()) {
            word = input.next();
            word = word.substring(0, 1) + word.substring(1);
            capitalizedString += word + " ";
        }

        return capitalizedString;
    }

    public static void main(String[] args) {

        printTitle("Hello, this is Luke Lee", '*');

        print(capitalize("Hello, this is Luke Lee."))

    }

}
