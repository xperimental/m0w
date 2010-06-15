package net.sourcewalker.m0w;

public class Card {

    private CardValue value;
    private CardColor color;

    public CardValue getValue() {
        return value;
    }

    public CardColor getColor() {
        return color;
    }

    public Card(CardValue value, CardColor color) {
        this.value = value;
        this.color = color;
    }

}
