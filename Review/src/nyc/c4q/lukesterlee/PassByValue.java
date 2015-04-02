package nyc.c4q.lukesterlee;

/**
 * Created by Luke Lee on 4/1/2015.
 */
public class PassByValue {

    public static void increment(int n) {
        n++;
        System.out.println("n inside the method is " + n);
    }

    public static void swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
    }

    public static void main(String[] args) {

    }
}
