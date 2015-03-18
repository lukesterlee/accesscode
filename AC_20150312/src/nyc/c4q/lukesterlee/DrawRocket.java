package nyc.c4q.lukesterlee;

/**
 * Access Code 2.1
 * Created by Luke Lee on 3/12/15.
 * This exercise is to draw the different size rockets depends on the size that the user inputs.
 */
public class DrawRocket {

    public static void print(String message) {
        System.out.print(message);
    }


    // This method takes the symbol and the number of repetition,
    // Then
    public static void repeat(String symbol, int number) {
        for (int i=1; i<=number; i++) {
            print(symbol);
        }
    }

    // This method draws the line.
    public static void drawLine(int size) {
        print("+");
        repeat("*=*=", size);
        print("+\n");
    }

    // This method draws the tail.
    public static void drawTail(int size) {
        int space = 2*size - 1;
        for (int i=1; i<=(2*size-1); i++) {
            repeat(" ", space);
            repeat("/", i-1);
            print("/**\\");
            repeat("\\", i-1);
            print("\n");
            space--;
        }
    }

    public static void drawUpper(int size) {
        int dot = size - 1;
        for (int i=1; i<=size; i++) {
            print("|");
            repeat(".", dot);
            repeat("/\\", i);
            repeat("..", dot);
            repeat("/\\", i);
            repeat(".", dot);
            print("|");
            print("\n");
            dot--;
        }
    }

    public static void drawDown(int size) {
        int dot = 0;
        int diamond = size;
        for (int i=1; i<= size; i++) {
            print("|");
            repeat(".", dot);
            repeat("\\/", diamond);
            repeat("..", dot);
            repeat("\\/", diamond);
            repeat(".", dot);
            print("|");
            print("\n");
            dot++;
            diamond--;
        }
    }

    public static void drawRocket(int size) {
        drawTail(size);
        drawLine(size);
        drawUpper(size);
        drawDown(size);
        drawLine(size);
        drawDown(size);
        drawUpper(size);
        drawLine(size);
        drawTail(size);
    }

    public static void main(String[] args) {
        drawRocket(1);
        print("\n");
        drawRocket(2);
        print("\n");
        drawRocket(3);
        print("\n");
        drawRocket(8);
    }
}
