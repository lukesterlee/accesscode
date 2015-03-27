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

    public static boolean codeBreaker2(String cipher1, String cipher2) {
        int difference = 0;
        if (cipher1.length() != cipher2.length())
            return false;

        for (int i = 0; i < cipher1.length()-1; i++) {
            int a = cipher1.charAt(i);
            int b = cipher2.charAt(i);

            if (a > b)
                b += 26;

            if (Character.isLetter(cipher1.charAt(i))) {
                if (!Character.isLetter(cipher2.charAt(i)))
                    return false;
                else if (a > b)
                    b += 26;

                if (i == 0)
                    difference = a-b;
                else if (difference != a-b)
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
        System.out.println("Enter a string to encode");

        String input = sc.nextLine();
        String encoded = CaesarCipher.encode(input, 25);
        System.out.println(encoded);

        String decoded = CaesarCipher.decode(encoded, 25);
        System.out.println(decoded);

        System.out.println("Enter two strings to compare");
        String input1 = sc.nextLine();
        String cipher1 = encode(input1, 4);
        String input2 = sc.nextLine();
        String cipher2 = encode(input2, 22);

        System.out.println(codeBreaker(cipher1,cipher2));
        System.out.println(codeBreaker2(cipher1,cipher2));

    }
}