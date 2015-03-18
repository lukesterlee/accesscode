package nyc.c4q.lukesterlee;

public class DivisorPatternArt {


    public static void print(String text) {
        System.out.print(text);
    }

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
