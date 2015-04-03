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

    public static void doSomething(int x, int y) {
        x = 100;
        y = 200;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        doSomething(a, b);
        System.out.println(a + " " + b);

        int sum = 0;
        for (int i = 1; i <= 10; i++)
            sum += i;
        System.out.println("Sum from 1 to 10 is " + sum);
        sum = 0;
        for (int i = 20; i <= 30; i++)
            sum += i;
        System.out.println("Sum from 20 to 30 is " + sum);
        sum = 0;
        for (int i = 35; i <= 45; i++)
            sum += i;
        System.out.println("Sum from 35 to 45 is " + sum);
    }
}
