package nyc.c4q.lukesterlee;

/**
 * Created by Luke Lee on 3/21/15.
 */
public class Person {

    public Person() {

    }

    public static void method1(String text) {
        method2(text);
    }

    public static void method2(String text) {
        method3(text);
    }

    public static void method3(String text) {

    }

    public static int method4() {

        return 29;
    }

    public static String method5(int age) {
        String result = "";

        result  = "My age is " + age;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(method5(29));

        int age = method4();

        method3(method5(29));
    }
}
