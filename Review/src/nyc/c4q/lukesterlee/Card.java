package nyc.c4q.lukesterlee;

/**
 * Created by Luke Lee on 4/29/15.
 */
public class Card {
    String number;
    String suit;

    public Card(String number, String suit) {
        this.number = number;
        this.suit = suit;
    }

    public String getNumber() {
        return number;
    }

    public String getSuit() {
        return suit;
    }
}
