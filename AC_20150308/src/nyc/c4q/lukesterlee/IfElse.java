package nyc.c4q.lukesterlee;

/**
 * Created by Willee on 3/8/15.
 */

import java.util.Scanner;

public class IfElse {

    public static void main(String[] argv) {

        Scanner input = new Scanner(System.in);

        int score = input.nextInt();
        if (score == 100)
            System.out.println("Perfect score!");
        else if (score >= 90)
            System.out.println("Great!");
        else if (score >= 75)
            System.out.println("Not bad!");
        else if (score >= 60)
            System.out.println("You passed.");
        else
            System.out.println("You failed. :(");


        String smiley = input.next();
        String emoticon = "";

        if (smiley.equals(":)"))
            emoticon = "happy";
        else if (smiley.equals(":("))
            emoticon = "sad";
        else if (smiley.equals("T.T"))
            emoticon = "crying";
    }
}
