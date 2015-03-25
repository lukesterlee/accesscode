package nyc.c4q.lukesterlee;

/**
 * Created by Luke Lee on 3/24/15.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class BlueBook {

    public static ArrayList create() {

        ArrayList<Car> cars = new ArrayList<Car>();

        Car car1 = new Car("Toyota","Prius",2015,29655.00);
        cars.add(car1);

        Car car2 = new Car("Toyota","Corolla",2015,16950.00);
        cars.add(car2);

        Car car3 = new Car("Toyota", "Yaris", 2015, 14845.00);
        cars.add(car3);

        Car car4 = new Car("Acura", "TLX", 2015, 31445.00);
        cars.add(car4);

        return cars;

    }

    public static void main(String[] args) {
        // 1. Create a Scanner for user input.

        Scanner input = new Scanner(System.in);

        String make;
        String model;
        int year;
        double price = 0;
        boolean isInBluebook = false;


        // 2. Create an ArrayList that holds type Car.

        ArrayList<Car> cars = create();

        // 3. Create a few new Car objects and add them to the ArrayList.

        Car car1 = new Car("Toyota","Prius",2015,29655.00);
        cars.add(car1);

        Car car2 = new Car("Toyota","Corolla",2015,16950.00);
        cars.add(car2);

        Car car3 = new Car("Toyota", "Yaris", 2015, 14845.00);
        cars.add(car3);

        Car car4 = new Car("Acura", "TLX", 2015, 31445.00);
        cars.add(car4);




        // 4. Prompt the user for the car's make, model, and year, and store the inputs in variables.

        System.out.println("What is your car's make?");
        make = input.next();
        System.out.println("what is your " + make + "'s model?");
        model = input.next();
        System.out.println("What is your " + model + "'s year?");
        year = input.nextInt();



        // 5. Iterate over your ArrayList of cars and check for a Car instance that has the same...
        //    ...make
        //    ...model
        //    ...year
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getMake().equalsIgnoreCase(make) )
                if(cars.get(i).getModel().equalsIgnoreCase(model) )
                    if (cars.get(i).getYear()==year) {
                        price = cars.get(i).getPrice();
                        isInBluebook = true;
                    }

        }

        // 6. Print the price of that car.

        if (isInBluebook)
            System.out.println("Your " + year + " " + make + " " + model + " is worth " + price);
        else
            System.out.println("I'm sorry. Your car is not in the blue book.");
    }
}