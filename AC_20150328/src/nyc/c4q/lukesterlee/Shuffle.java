package nyc.c4q.lukesterlee;

import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;


/**
 * Created by Luke Lee on 3/28/15.
 */
public class Shuffle {

    public static void main(String[] args) {

        ArrayList<String> accessCode = new ArrayList<String>();

        accessCode.add("Sufei");
        accessCode.add("Abass");
        accessCode.add("Vanice");
        accessCode.add("Rosemary");
        accessCode.add("Anthony F");
        accessCode.add("Anthony M");
        accessCode.add("Ramona");
        accessCode.add("Jae");
        accessCode.add("Allison");
        accessCode.add("Dison");
        accessCode.add("Reinard");
        accessCode.add("Ray");
        accessCode.add("Kadeem");
        accessCode.add("John");
        accessCode.add("Sarah");
        accessCode.add("Tasha");
        accessCode.add("Joshelyn");
        accessCode.add("Charlyn");
        accessCode.add("Na");
        accessCode.add("Hoshiko");
        accessCode.add("Elvis");
        accessCode.add("Alvin");
        accessCode.add("George");
        accessCode.add("Madelyn");
        accessCode.add("Jorge");
        accessCode.add("Jose");
        accessCode.add("Yulia");
        accessCode.add("Hans");
        accessCode.add("Janneisy");
        accessCode.add("Marbella");

        System.out.println(accessCode.size());


        long seed = System.nanoTime();
        Collections.shuffle(accessCode, new Random(seed));


        for (String name : accessCode) {
            System.out.println(name);
        }



    }
}
