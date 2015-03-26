package nyc.c4q.lukesterlee;

import java.util.HashMap;

/**
 * Access Code 2.1
 * Created by Luke Lee on 3/25/15.
 */
public class UniqueChar {

    /* uniqueCharacters accepts as input a string S.
     * Given the string S return a string S2 which contains all the distinct characters in S.
     * The input string will only contain lowercase characters.
     * The ordering of characters in the output string does not matter.
     * For example : abbcaabcaa --> abc
                     apple --> aple or aepl
                     microsoft --> microsft
     */
    public static String uniqueCharacters(String s) {

        /* This is my initial code.
        String s2 = "";
        for (int i = 0; i < s.length(); i++) {
            boolean isSaved = false;
            for (int j = 0; j < s2.length(); j++) {
                if (s.charAt(i)==s2.charAt(j)) {
                    isSaved = true;
                    break;
                }
            }
            if (!isSaved)
                s2 += s.charAt(i);
        }
        return s2;
        */

        // I improved my code by using HashMap.
        HashMap<Character, Integer> unique = new HashMap<Character, Integer>();
        String s2 = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!unique.containsKey(c)) {
                unique.put(c, i);
                s2 += c;
            }
        }
        return s2;

    }

    public static void main(String[] args) {

        System.out.println(uniqueCharacters("aabbccccddseaabb"));

    }
}
