package nyc.c4q.lukesterlee;

/**
 * Created by Luke Lee on 4/5/15.
 */
public class Test {

    public static void test(int a, int b) {
        int temp;
        temp = a;
        a = b;
        b = temp;
        a = 100;
        b = 200;

    }

    public static void main(String[] args) {

        int x = 10;
        int y = 20;
        test(x,y);
        System.out.println(x + " " + y);

        Person2 p1 = new Person2();
        System.out.println(p1.city);



    }
}
