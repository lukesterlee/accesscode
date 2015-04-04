package nyc.c4q.lukesterlee;


import java.util.Scanner;
public class Main {



    public static int sum(int a, int b) {
        return a+b;
    }

    public static int max(int a, int b) {
        if (a >= b)
            return a;
        else
            return b;
    }

    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n%10;
            n = n/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Cat c1 = new Cat("Mimi");
        Cat c2 = new Cat("Bobo");

        Course c1;
        c1.name

        System.out.println(c1.height);

        c1.setHeight(6);
        c1.height = 27;
        c2.height = 0; // What?????

    }
}
