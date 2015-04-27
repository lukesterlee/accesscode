package nyc.c4q.lukesterlee;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static int find_max_int(List<Integer> list) {
        int top = 0;
        for (int number : list) {
            if (number > top) {
                top = number;
            }
        }
        return top;
    }

    public static int find_max_comp(List<Comparable> list) {

    }

    public static void main(String[] args) {
	// write your code here

        ArrayList<String> list = new ArrayList<String>();

    }
}
