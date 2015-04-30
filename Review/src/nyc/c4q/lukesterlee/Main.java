package nyc.c4q.lukesterlee;


import java.util.ArrayList;
import java.util.HashMap;
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
//        Cat c1 = new Cat("Mimi");
//        Cat c2 = new Cat("Bobo");
//
//        Course c1;
//        c1.name
//
//        System.out.println(c1.height);
//
//        c1.setHeight(6);
//        c1.height = 27;
//        c2.height = 0; // What?????



        ArrayList<Animal> list = new ArrayList<Animal>();

        Cat a1 = new Cat();
        Dog a2 = new Dog();
        Cat c1 = new Cat();

        list.add(a1);
        list.add(a2);
        list.add(c1);


        Cat c2 = (Cat) list.get(0);




        Animal a1 = new Animal();
        Cat c1 = new Cat();
        a1.makeSound();
        c1.makeSound();

        Animal a2 = new Cat();
        a2.makeSound();

        MediaItem m1 = new Cd();
        MediaItem m2 = new Dvd();
        MediaItem m3 = new Dvd();






    }
}
