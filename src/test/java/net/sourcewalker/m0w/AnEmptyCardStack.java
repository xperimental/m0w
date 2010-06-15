package net.sourcewalker.m0w;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class AnEmptyCardStack {

    private CardStack stack;

    @Before
    public void setUp() {
        stack = new CardStack();
    }

    @Test
    public void hasNoCards() {
        assertEquals(0, stack.getCount());
    }

    @Test(expected = IllegalStateException.class)
    public void canNotBeShuffled() {
        stack.shuffle();
    }

    @Test
    public void hasTheAbilityToStoreCards() {
        stack.addToBottom(new Card(CardValue.Jack, CardColor.Clubs));
        stack.addToBottom(new Card(CardValue.Queen, CardColor.Spades));
        stack.addToBottom(new Card(new CardValue(8), CardColor.Diamonds));
        assertEquals(3, stack.getCount());
    }

    @Test(expected = IllegalStateException.class)
    public void hasNoTopCard() {
        stack.getTopCard();
    }

}
