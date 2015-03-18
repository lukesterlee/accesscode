package com.company;

/**
 * Created by Willee on 3/1/15.
 */
public class Numbers {

    public static void main(String[] args) {

        System.out.println(42);
        System.out.println("42");

        System.out.println(42.0);
        System.out.println(42.0000);
        System.out.println("42.0000");
        System.out.println(41.999999999999999);    // fifteen 9's
        System.out.println("41.999999999999999");

        System.out.println(17 + 25);
        System.out.println("17" + "25");
        System.out.println("17" + 25);
        System.out.println(17 + "25");

        System.out.println("temperature: " + ((-4*9)/5 + 32) +" F");
        System.out.println("temperature: " + ((-4*9.0)/5 + 32) +"\u00b0F");

        System.out.println(null);
    }
}
