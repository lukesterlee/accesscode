package nyc.c4q.lukesterlee;

import java.util.ArrayList;

/**
 * Access Code 2.1
 * Created by Luke Lee on 3/31/15.
 */
public class LinearSearch {

    // search method accepts as input an ArrayList alist and an integer x,
    // and returns the first index it sees of x in alist, return -1 if the integer is not present in the list.
    public static int search(ArrayList<Integer> alist, int x) {
        return alist.indexOf(x);
    }
}
