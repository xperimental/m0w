package net.sourcewalker.m0w;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardStack {

    private List<Card> cards = new ArrayList<Card>();

    public int getCount() {
        return cards.size();
    }

    public void shuffle() {
        if (cards.size() == 0) {
            throw new IllegalStateException();
        }
        Collections.shuffle(cards);
    }

    public void addToBottom(Card card) {
        cards.add(card);
    }

    public Card getTopCard() {
        if (cards.size() == 0) {
            throw new IllegalStateException();
        }
        return cards.get(0);
    }

    public List<Card> empty() {
        List<Card> result = new ArrayList<Card>(cards);
        cards.clear();
        return result;
    }

}
