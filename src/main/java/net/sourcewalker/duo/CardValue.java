package net.sourcewalker.duo;

public class CardValue {

    public static final CardValue Jack = new CardValue(10, "Jack");

    public static final CardValue Queen = new CardValue(10, "Queen");

    public static final CardValue King = new CardValue(10, "King");

    public static final CardValue Ace = new CardValue(11, "Ace");

    private int value;
    private String name;

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public CardValue(int value) {
        this(value, Integer.toString(value));
    }

    protected CardValue(int value, String name) {
        this.value = value;
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
