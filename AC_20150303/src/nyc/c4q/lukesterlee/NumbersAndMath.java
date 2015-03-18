package nyc.c4q.lukesterlee;

/**
 * Created by Luke Lee on 3/3/15.
 */
public class NumbersAndMath
{
    public static void main( String[] args )
    {
        // print out the message to the console : I will not count my chickens:
        System.out.println( "I will now count my chickens:" );

        // print out the number of Hens to the console.
        System.out.println( "Hens " + ( 25 + 30 / 6.0 ) );

        // print out the number of Roosters to the console.
        System.out.println( "Roosters " + ( 100 - 25.0 * 3 % 4.0 ) );

        // print out the message to the console : Now I will count the eggs:
        System.out.println( "Now I will count the eggs:" );

        // print out the result of the calculation.
        System.out.println( 3 + 2 + 1 - 5 + 4 % 2 - 1 / 4 + 6 );

        // print out the message to the console :  Is it true that 3 + 2 < 5 - 7?
        System.out.println( "Is it true that 3 + 2 < 5 - 7?" );

        // print out if the statement of 3+2 <5-7 is true or not. (true/false)
        System.out.println( 3 + 2 < 5 - 7 );

        // print out the sum of 3 and 2.
        System.out.println( "What is 3 + 2? " + ( 3 + 2 ) );

        // print out the result of 5-7
        System.out.println( "What is 5 - 7? " + ( 5 - 7 ) );

        // print out the message to the console :  Oh, that's why it's false.
        System.out.println( "Oh, that's why it's false." );

        // print out the message to the console :  How about some more.
        System.out.println( "How about some more." );

        // print out if 5 is greater than -2. (true/false)
        System.out.println( "Is it greater? " + ( 5 > -2 ) );

        // print out if 5 is equal or greater than -2. (true/false)
        System.out.println( "Is it greater or equal? " + ( 5 >= -2 ) );

        // print out if 5 is equal or less than -2. (true/false)
        System.out.println( "Is it less or equal? " + ( 5 <= -2 ) );
    }
}
