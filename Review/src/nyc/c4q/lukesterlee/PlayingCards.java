package nyc.c4q.lukesterlee;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Luke Lee on 4/29/15.
 */
public class PlayingCards extends Game<Card> {

    ArrayList<Card> deck;

    public PlayingCards() {

        String[] number = new String[] {};
        String[] suit = new String[] {"2", "3"};
        deck = new ArrayList<Card>();
        for (int i = 0; i < number.length; i++) {

            for (int j = 0; j < suit.length; j++) {
                deck.add(new Card(number[i], suit[j]));
            }

        }
    }

    @Override
    ArrayList<Card> getpieces() {
        Collections.shuffle(deck);
        return deck;
    }
}
