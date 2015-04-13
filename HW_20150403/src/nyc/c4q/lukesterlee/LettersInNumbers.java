package nyc.c4q.lukesterlee;

import java.util.HashMap;

/**
 * Created by Luke Lee on 3/31/15.
 */
public class LettersInNumbers {


    // accepts an integer value as an input then count the number of letters in English and return it.
    // it works from 0 ~ 9999.
    public static int letterCount(int number) {

        int result = 0;
        int numberOfDigits;

        HashMap<Integer, String> numbers = new HashMap<Integer, String>();
        numbers.put(0, "");
        numbers.put(1, "One");
        numbers.put(2, "Two");
        numbers.put(3, "Three");
        numbers.put(4, "Four");
        numbers.put(5, "Five");
        numbers.put(6, "Six");
        numbers.put(7, "Seven");
        numbers.put(8, "Eight");
        numbers.put(9, "Nine");
        numbers.put(10, "Ten");
        numbers.put(11, "Eleven");
        numbers.put(12, "Twelve");
        numbers.put(13, "Thirteen");
        numbers.put(14, "Fourteen");
        numbers.put(15, "Fifteen");
        numbers.put(16, "Sixteen");
        numbers.put(17, "Seventeen");
        numbers.put(18, "Eighteen");
        numbers.put(19, "Nineteen");
        numbers.put(20, "Twenty");
        numbers.put(30, "Thirty");
        numbers.put(40, "Forty");
        numbers.put(50, "Fifty");
        numbers.put(60, "Sixty");
        numbers.put(70, "Seventy");
        numbers.put(80, "Eighty");
        numbers.put(90, "Ninety");
        numbers.put(100, "Hundred");
        numbers.put(1000, "Thousand");

        String numberInString = Integer.toString(number);

        numberOfDigits = numberInString.length();

        switch (numberOfDigits) {
            case 4 :
                result += numbers.get(Integer.valueOf(Character.toString(numberInString.charAt(0)))).length();
                result += numbers.get(1000).length();
                numberInString = numberInString.substring(1);
            case 3 :
                result += numbers.get(Integer.valueOf(Character.toString(numberInString.charAt(0)))).length();
                result += numbers.get(100).length() + 3; // add 3 because of "and".
                numberInString = numberInString.substring(1);
            case 2 :
                int digit = Integer.valueOf(Character.toString(numberInString.charAt(0)));
                // when the number is 20~99.
                if (digit >= 2) {
                    result += numbers.get(digit*10).length();
                    numberInString = numberInString.substring(1);
                }
                // when the number is 10~19.
                else if (digit != 0) {
                    result += numbers.get(Integer.valueOf(numberInString)).length();
                    break; // breaks so it doesn't go through case 1 because we don't have to read the last digit.
                }
                // when the number is 01~09
                else {
                    numberInString = numberInString.substring(1);
                }
            case 1 :
                result += numbers.get(Integer.valueOf(numberInString)).length();
        }
        return result;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++)
            System.out.println(i + " = " + letterCount(i));
    }
}
