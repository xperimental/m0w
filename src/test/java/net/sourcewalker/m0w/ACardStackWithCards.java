package net.sourcewalker.m0w;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class ACardStackWithCards {

    private CardStack stack;
    private Card topCard;

    @Before
    public void setUp() {
        stack = new CardStack();
        topCard = new Card(new CardValue(7), CardColor.Clubs);
        stack.addToBottom(topCard);
        // add some more cards
        for (int i = 0; i < 5; i++) {
            stack.addToBottom(new Card(new CardValue(9), CardColor.Diamonds));
            stack.addToBottom(new Card(CardValue.Jack, CardColor.Hearts));
            stack.addToBottom(new Card(CardValue.Ace, CardColor.Spades));
        }
    }

    @Test
    public void hasATopCard() {
        assertEquals(topCard, stack.getTopCard());
    }

    @Test
    public void hasTheRightCount() {
        assertEquals(16, stack.getCount());
    }

    @Test
    public void canBeEmptied() {
        List<Card> cards = stack.empty();
        assertEquals(16, cards.size());
    }

    @Test
    public void canBeShuffled() {
        stack.shuffle();
        assertNotSame(topCard, stack.getTopCard());
        assertEquals(16, stack.getCount());
    }

}
