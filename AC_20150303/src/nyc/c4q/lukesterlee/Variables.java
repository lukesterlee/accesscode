package nyc.c4q.lukesterlee;

/**
 * Created by Willee on 3/3/15.
 */
public class Variables
{
    public static void main( String[] args )
    {
        // declare 5 different integer.
        int cars, drivers, passengers, cars_not_driven, cars_driven;

        // declare 3 different double.
        double space_in_a_car, carpool_capacity, average_passengers_per_car;

        // assign the integer value of 100 to integer cars.
        cars = 100;

        // assign the double value of 4.0 to double space_in_a_car.
        space_in_a_car = 4.0;

        // assign the integer value of 30 to integer drivers.
        drivers = 30;

        // assign the integer value of 90 to integer passengers.
        passengers = 90;

        // calculate the value of cars_not_driven by subtracting drivers from cars.
        cars_not_driven = cars - drivers;

        // assign the value of drivers to cars_driven.
        cars_driven = drivers;

        // calculate the value of carpool_capacity by multiplying cars_driven and space_in_a_car.
        carpool_capacity = cars_driven * space_in_a_car;

        // calculate the value of average_passengers_per_car by dividing passengers by cars_driven.
        average_passengers_per_car = passengers / cars_driven;

        // print out how many cars available to the console.
        System.out.println( "There are " + cars + " cars available." );

        // print out how many drivers are available to the console.
        System.out.println( "There are only " + drivers + " drivers available." );

        // print out how many empty cars are today to the console.
        System.out.println( "There will be " + cars_not_driven + " empty cars today." );

        // print out how many people we can transport today to the console.
        System.out.println( "We can transport " + carpool_capacity + " people today." );

        // print out how many passengers we have to carpool today to the console.
        System.out.println( "We have " + passengers + " to carpool today." );

        // print out how many people we need to put in each car to the console.
        System.out.println( "We need to put about " + average_passengers_per_car + " in each car." );

        char a = 'a';
        char b = 'b';
        boolean more = a < b;
        System.out.println(more);
    }
}
