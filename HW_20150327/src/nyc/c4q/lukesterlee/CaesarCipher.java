package nyc.c4q.lukesterlee;

/**
 * Access Code 2.1
 * Created by Luke Lee on 3/25/2015.
 * Class for Encoding and Decoding CaesarCiphers
 */

import java.util.Scanner;

public class CaesarCipher {

    public static String decode(String enc, int offset) {
        return encode(enc, 26-offset);
    }

    // If they are from the same text, if I change one's offset to 1 to 25, it will match at some point.
    public static boolean codeBreaker(String cipher1, String cipher2) {
        for (int i = 1; i < 26; i++) {
            if (cipher1.equals(encode(cipher2,i)))
                return true;
        }
        return false;
    }

    // If they are from the same text, the difference of offset will be the same.
    // Issue 1 : how do I keep track of offsetDifference?
    // Issue 2 : difference of difference - looping problem
    public static boolean codeBreaker2(String cipher1, String cipher2) {
        int offsetDifference = 0;
        // this also prevents index errors for next for loop.
        if (cipher1.length() != cipher2.length())
            return false;

        for (int i = 0; i < cipher1.length(); i++) {
            int a = cipher1.charAt(i);
            int b = cipher2.charAt(i);
            //System.out.println(a + " " + b + " difference is : " + (a-b));
            if (a > b)
                b += 26;

            if (Character.isLetter(cipher1.charAt(i))) {

                // honestly I don't think this line is necessary but for understanding purpose, I will keep it.
                if (!Character.isLetter(cipher2.charAt(i)))
                    return false;
                // this will record the difference of offset to compare.
                else if (i == 0)
                    offsetDifference = a-b;
                else if (offsetDifference != a-b)
                    return false;
            }
        }
        return true;
    }

    public static String encode(String enc, int offset) {
        offset = offset % 26 + 26;
        StringBuilder encoded = new StringBuilder();
        for (char i : enc.toCharArray()) {
            if (Character.isLetter(i)) {
                if (Character.isUpperCase(i)) {
                    encoded.append((char) ('A' + (i - 'A' + offset) % 26 ));
                } else {
                    encoded.append((char) ('a' + (i - 'a' + offset) % 26 ));
                }
            } else {
                encoded.append(i);
            }
        }
        return encoded.toString();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a string to encode");
//
//        String input = sc.nextLine();
//        String encoded = CaesarCipher.encode(input, 25);
//        System.out.println(encoded);
//
//        String decoded = CaesarCipher.decode(encoded, 25);
//        System.out.println(decoded);

        System.out.println("Enter the first string to compare");
        String input1 = sc.nextLine();
        String cipher1 = encode(input1, 4);
        System.out.println(cipher1);

        System.out.println("\nEnter the second string to compare");
        String input2 = sc.nextLine();
        String cipher2 = encode(input2, 22);
        System.out.println(cipher2);

        System.out.println("\nThe result provided by codeBreaker is : " + codeBreaker(cipher1,cipher2));
        System.out.println("The result provided by codeBreaker2 is : " + codeBreaker2(cipher1,cipher2));

    }
}