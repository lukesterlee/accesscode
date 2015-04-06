package nyc.c4q.lukesterlee;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Luke Lee on 4/5/15.
 */
public class Linear {

    public static int sumOfAllNumbers(int a, int b) {

        int sum = 0;

        for (int i = a; i <= b; i++) {
            sum += i;
        }

        return sum;
    }
}
