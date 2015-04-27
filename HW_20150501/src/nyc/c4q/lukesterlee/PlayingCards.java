package nyc.c4q.lukesterlee;

import java.util.ArrayList;

/**
 * Created by Luke Lee on 4/27/2015.
 */
public class PlayingCards extends Game<Card> {

    ArrayList<Card> cardDeck;

    public PlayingCards() {

        cardDeck = new ArrayList<Card>();
        for (int i = 1; i <= 52; i++) {
            cardDeck.add(new Card());
        }

    }
    @Override
    ArrayList<Card> getpieces() {
        return cardDeck;
    }
}
