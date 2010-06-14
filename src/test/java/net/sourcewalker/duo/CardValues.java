package net.sourcewalker.duo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CardValues {

    @Test
    public void numbers() {
        for (int i = 7; i < 11; i++) {
            CardValue v = new CardValue(i);
            assertEquals(i, v.getValue());
            assertEquals(Integer.toString(i), v.getName());
        }
    }

    @Test
    public void jack() {
        CardValue v = CardValue.Jack;
        assertEquals(10, v.getValue());
        assertEquals("Jack", v.getName());
    }

    @Test
    public void queen() {
        CardValue v = CardValue.Queen;
        assertEquals(10, v.getValue());
        assertEquals("Queen", v.getName());
    }

    @Test
    public void king() {
        CardValue v = CardValue.King;
        assertEquals(10, v.getValue());
        assertEquals("King", v.getName());
    }

    @Test
    public void ace() {
        CardValue v = CardValue.Ace;
        assertEquals(11, v.getValue());
        assertEquals("Ace", v.getName());
    }
}
