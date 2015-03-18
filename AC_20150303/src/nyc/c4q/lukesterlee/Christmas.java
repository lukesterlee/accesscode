package nyc.c4q.lukesterlee;

/**
 * Created by Luke Lee on 3/3/15.
 */
public class Christmas {

    public static void main(String[] args) {

        /* This way is based on what we have learned so far.
        String on = "On the ";
        String day = " day of Christmas my true love sent to me\n";
        String one = "a Partridge in a Pear Tree.\n";
        String two = "Two Turtle Doves\n";
        String three = "Three French Hens\n";
        String four = "Four Calling Birds\n";
        String five = "Five Gold Rings\n";
        String six = "Six Geese a-Laying\n";
        String seven = "Seven Swans a-Swimming\n";
        String eight = "Eight Maids a-Milking\n";
        String nine = "Nine Ladies Dancing\n";
        String ten = "Ten Lords a-Leaping\n";
        String eleven = "Eleven Pipers Piping\n";
        String twelve = "Twelve Drummers Drumming\n";

        System.out.println(on+ "First" +day+one);
        System.out.println(on+ "Second" +day+two+"and "+one);
        System.out.println(on+ "Third" +day+three+two+"and"+one);
        System.out.println(on+ "Fourth" +day+four+three+two+"and"+one);
        System.out.println(on+ "Fifth" +day+five+four+three+two+"and"+one);
        System.out.println(on+ "Sixth" +day+six+five+four+three+two+"and"+one);
        System.out.println(on+ "Seventh" +day+seven+six+five+four+three+two+"and"+one);
        System.out.println(on+ "Eighth" +day+eight+seven+six+five+four+three+two+"and"+one);
        System.out.println(on+ "Ninth" +day+nine+eight+seven+six+five+four+three+two+"and"+one);
        System.out.println(on+ "Tenth" +day+ten+nine+eight+seven+six+five+four+three+two+"and"+one);
        System.out.println(on+ "Eleventh" +day+eleven+ten+nine+eight+seven+six+five+four+three+two+"and"+one);
        System.out.println(on+ "Twelfth" +day+twelve+eleven+ten+nine+eight+seven+six+five+four+three+two+"and"+one);
        */

        // This way is using for-loop and if-else statement.
        String on = "On the ";
        String day = " day of Christmas my true love sent to me\n";

        String[] num = new String[12];
        num[0] = "First";
        num[1] = "Second";
        num[2] = "Third";
        num[3] = "Fourth";
        num[4] = "Fifth";
        num[5] = "Sixth";
        num[6] = "Seventh";
        num[7] = "Eighth";
        num[8] = "Ninth";
        num[9] = "Tenth";
        num[10] = "Eleventh";
        num[11] = "Twelfth";

        String[] verse = new String[12];
        verse[0] = "a Partridge in a Pear Tree.\n";
        verse[1] = "Two Turtle Doves\n";
        verse[2] = "Three French Hens\n";
        verse[3] = "Four Calling Birds\n";
        verse[4] = "Five Gold Rings\n";
        verse[5] = "Six Geese a-Laying\n";
        verse[6] = "Seven Swans a-Swimming\n";
        verse[7] = "Eight Maids a-Milking\n";
        verse[8] = "Nine Ladies Dancing\n";
        verse[9] = "Ten Lords a-Leaping\n";
        verse[10] = "Eleven Pipers Piping\n";
        verse[11] = "Twelve Drummers Drumming\n";


        for(int i=0;i<12;i++) {
            System.out.print(on+num[i]+day);
            for(int j=i;j>=0;j--) {

                // If this is not the first and if this is the last verse, then concatenate "and " before the verse.
                if (i!=0 && j==0) {
                    System.out.print("and " + verse[j]);
                }
                // Otherwise, just print out the verse.
                else {
                    System.out.print(verse[j]);
                }
            }
            System.out.println();
        }

    }
}