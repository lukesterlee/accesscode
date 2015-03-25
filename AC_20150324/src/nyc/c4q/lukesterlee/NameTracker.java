package nyc.c4q.lukesterlee;

/**
 * Created by Luke Lee on 3/24/15.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class NameTracker {

    public static void main(String[] args) {
        /*
        ArrayList<String> names = new ArrayList<String>();
        Scanner input = new Scanner(System.in);

        System.out.println("Please give me some names:");

        String name;
        while(true) {
            name = input.nextLine();
            if (name.equals(""))
                break;
            names.add(name);
        }

        System.out.println("Your " + names.size() + " name(s) are saved!");


        System.out.println("Search for a name : ");
        name = input.nextLine();
        System.out.println(names.contains(name));

        for (int i = 0; i < names.size(); i++) {
            //System.out.println(names.get(i));
        }

        // print in reverse order
        for (int i = names.size()-1; i >= 0; i--) {
            //System.out.println(names.get(i));
        }

        */

        ArrayList<Person> names = new ArrayList<Person>();
        Scanner input = new Scanner(System.in);

        System.out.println("Please give me some names:");

        String name;
        while(true) {
            name = input.nextLine();
            Person p1 = new Person(name);
            if (name.equals(""))
                break;
            names.add(p1);
        }

        System.out.println("Your " + names.size() + " name(s) are saved!");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i).getName());
        }

    }
}
