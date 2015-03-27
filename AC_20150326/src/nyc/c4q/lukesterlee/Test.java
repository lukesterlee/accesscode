package nyc.c4q.lukesterlee;

import java.util.ArrayList;

/**
 * Created by Luke Lee on 3/26/15.
 */
public class Test {
    public static void main(String[] args) {
        File f = new File("/Users/Willee/Desktop/accesscode/AC_20150326/src/subway-data.txt");

        ArrayList<ArrayList<String>> dataTable = f.getLines();

        for (int i = 0; i < dataTable.size(); i++) {
            //System.out.println(dataTable.get(i).get(2));
        }

    }
}
