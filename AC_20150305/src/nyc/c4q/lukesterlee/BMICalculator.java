/**
 * Created by Willee on 3/5/15.
 */

import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        double m;
        double kg;
        double in;
        double lb;
        double bmi;
        double bmi2;

        System.out.println("Your height in m: ");
        m = keyboard.nextDouble();

        System.out.println("Your weight in kg: ");
        kg = keyboard.nextDouble();

        bmi = kg/(m*m);

        System.out.println("Your BMI is " + bmi);

        in = m*38.3701;
        lb = kg*2.20462;
        bmi2 = lb/(in*in);

        System.out.println("Your height in inches: " + in);
        System.out.println("Your weight in pounds: " + lb);
        System.out.println("Your BMI is " + bmi2);



    }
}
