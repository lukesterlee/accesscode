package nyc.c4q.lukesterlee;

import java.util.HashSet;

public class SocialNetwork {

    public static void main(String[] args) {
        HashSet<String> yours = new HashSet();
        yours.add("Yelena");
        yours.add("Jamal");
        yours.add("Eve");
        HashSet<String> mine = new HashSet();
        mine.add("Sebastian");
        mine.add("Mala");
        mine.add("Eve");

        // You should be able to run all of these in a row:
        System.out.println( allFriends(yours, mine) );
        System.out.println( mutualFriends(yours, mine) );
        System.out.println( justYourFriends(yours, mine) );
        System.out.println( justMyFriends(yours, mine) );
        System.out.println( exclusiveFriends(yours, mine) );
        System.out.println( yourFriendsAreMine(yours, mine) );
        System.out.println( youHaveFriends(yours) );
        System.out.println( matchmaker(yours, mine) );
    }

    public static HashSet<String> allFriends(HashSet<String> yours, HashSet<String> mine) {

        HashSet<String> allFriends = new HashSet<String>(mine);
        allFriends.addAll(yours);
        return allFriends;
         //Yelena, Jamal, Eve, Sebastian, Mala
    }

    public static HashSet<String> mutualFriends(HashSet<String> yours, HashSet<String> mine) {

        HashSet<String> mutualFriends = new HashSet<String>();
        for (String friend : mine) {
            if (yours.contains(friend))
                mutualFriends.add(friend);
        }
        return mutualFriends;
        // Eve
    }

    public static HashSet<String> justYourFriends(HashSet<String> yours, HashSet<String> mine) {

        HashSet<String> justYourFriends = new HashSet<String>(yours);
        for (String friend : mine) {
            if (justYourFriends.contains(friend))
                justYourFriends.remove(friend);
        }
        return justYourFriends;
        // Yelena, Jamal
    }

    public static HashSet<String> justMyFriends(HashSet<String> yours, HashSet<String> mine) {

        HashSet<String> justMyFriends = new HashSet<String>(mine);
        for (String friend : yours) {
            if (justMyFriends.contains(friend))
                justMyFriends.remove(friend);
        }
        return justMyFriends;
        // Sebastian, Mala
    }

    public static HashSet<String> exclusiveFriends(HashSet<String> yours, HashSet<String> mine) {

        HashSet<String> exclusiveFriends = new HashSet<String>(mine);
        exclusiveFriends.addAll(yours);
        exclusiveFriends.removeAll(mutualFriends(yours, mine));

        return exclusiveFriends;
        // Yelena, Jamal, Sebastian, Mala
    }

    public static boolean yourFriendsAreMine(HashSet<String> yours, HashSet<String> mine) {

        for (String friend : yours) {
            if (!mine.contains(friend))
                return false;
        }
        return true;
        // true if all your friends are also my friends

    }

    public static boolean youHaveFriends(HashSet<String> yours) {

        return !yours.isEmpty();
        // true if you have any friends
    }

    public static HashSet<HashSet<String>> matchmaker(HashSet<String> yours, HashSet<String> mine) {

        // should return these sets:
        HashSet<HashSet<String>> matchMaker = new HashSet<HashSet<String>>();

        for (String friend : mine) {
            for (String match : yours) {
                HashSet<String> couple = new HashSet<String>();
                if (!match.equals(friend)) {
                    couple.add(friend);
                    couple.add(match);
                    matchMaker.add(couple);
                }

            }
        }

        return matchMaker;


        // Sebastian, Jamal
        // Jamal, Mala
        // Jamal, Eve

        // Sebastian, Yelena
        // Yelena, Mala
        // Yelena, Eve

        // Sebastian, Eve
        // Mala, Eve
    }
}
