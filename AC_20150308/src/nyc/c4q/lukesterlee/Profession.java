package nyc.c4q.lukesterlee;

/**
 * Access Code 2.1
 * Created by Luke Lee on 3/8/15.
 */
import java.util.Scanner;

public class Profession {
    public static void main(String[] args) {

        /* This is the first code I wrote.

        Scanner input = new Scanner(System.in);
        String answer;
        String profession;

        boolean sword;
        boolean helmet;
        boolean shovel;

        System.out.println("Do you have a sword?");
        answer = input.next();
        if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y"))
            sword = true;
        else
            sword = false;

        System.out.println("Do you have a helmet?");
        answer = input.next();
        if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y"))
            helmet = true;
        else
            helmet = false;

        System.out.println("Do you have a shovel?");
        answer = input.next();
        if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y"))
            shovel = true;
        else
            shovel = false;
        */


        // I realized that there are many repetitions so I found the better way.

        Scanner input = new Scanner(System.in);

        String[] question = new String[3];
        question[0] = "Do you have a sword?";
        question[1] = "Do you have a helmet?";
        question[2] = "Do you have a shovel?";
        boolean[] isTrue = new boolean[3];
        String answer;
        String profession;


        for (int i=0; i<question.length; i++) {
            System.out.println(question[i]);
            answer = input.next();
            isTrue[i] = answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y");
        }

        if (isTrue[0] == true) {
            if (isTrue[1] ==true)
                profession = "samurai";
            else
                profession = "ninja";
        }
        else if (isTrue[1] == true) {
            if (isTrue[2] == true)
                profession = "construction worker";
            else
                profession = "astronaut";
        }
        else if (isTrue[2] == true)
            profession = "gardener";
        else
            profession = "coder";

        System.out.println("You are a " + profession + "!");

    }
}
