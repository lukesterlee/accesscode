package nyc.c4q.lukesterlee;

/**
 * Created by Luke Lee on 3/17/15.
 */
public class PrettyLittle {

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

    public static void main(String[] args) {

        printTitle("Hello, this is Luke Lee", '*');

    }

}
