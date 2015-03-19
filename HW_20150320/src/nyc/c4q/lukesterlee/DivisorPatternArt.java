package nyc.c4q.lukesterlee;

/*
 * Access Code 2.1
 * Created by Luke Lee on 03/17/15
 */

public class DivisorPatternArt {

    public static void print(String text) {
        System.out.print(text);
    }

    // Print "@ " if i divides j or j divides i.
    // Otherwise, print "  ".
    public static void printDPA(int size) {
        String[][] dpa  = new String[size][size];

        for (int i=0; i<size; i++) {
            for (int j=0; j<size; j++) {
                if( i%j == 0 || j%i == 0)
                    print("@ ");
                else
                    print("  ");
            }
            print("\n");
        }
    }

    public static void main(String[] args) {
        printDPA(10);
    }
}
