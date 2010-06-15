package net.sourcewalker.m0w;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class CardColors {

    @Test
    public void Clubs() {
        assertNotNull(CardColor.Clubs);
    }

    @Test
    public void Diamonds() {
        assertNotNull(CardColor.Diamonds);
    }

    @Test
    public void Hearts() {
        assertNotNull(CardColor.Hearts);
    }

    @Test
    public void Spades() {
        assertNotNull(CardColor.Spades);
    }

}
