package nyc.c4q.ac21.ac20150322;

import java.net.URL;
import java.util.Scanner;

/**
 * Created by Luke Lee on 4/6/15.
 */
public class Test {

    public static boolean htmlChecker(String document) {
        String beginning = document.substring(0,15);
        return beginning.equalsIgnoreCase("<!doctype html>");
    }

    public static int countWords(String text, String word) {
        text = text.toLowerCase();
        word = word.toLowerCase();

        int count = 0;


        for (int i = text.indexOf(word); i != -1; i = text.indexOf(word, i+word.length())) {
            count++;
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an URL : ");

        String userUrl = input.nextLine();

        URL url = HTTP.stringToURL(userUrl);

        String document = HTTP.get(url);

        System.out.println(htmlChecker(document));
        //System.out.println(document);
        System.out.println(countWords(document, "Alice"));

    }
}
