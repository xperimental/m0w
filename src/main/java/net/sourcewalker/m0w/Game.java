package net.sourcewalker.m0w;

public class Game {

    private CardStack drawStack = new CardStack();
    private CardStack playingStack = new CardStack();

    public Game() {
        initDeck();
    }

    private void initDeck() {
        for (CardColor color : CardColor.values()) {
            for (int i = 7; i < 11; i++) {
                playingStack.addToBottom(new Card(new CardValue(i), color));
            }
            playingStack.addToBottom(new Card(CardValue.Jack, color));
            playingStack.addToBottom(new Card(CardValue.Queen, color));
            playingStack.addToBottom(new Card(CardValue.King, color));
            playingStack.addToBottom(new Card(CardValue.Ace, color));
        }
    }

    public int getPlayerCount() {
        return 0;
    }

    public CardStack getDrawStack() {
        return drawStack;
    }

    public CardStack getPlayingStack() {
        return playingStack;
    }

    public GameState getState() {
        return GameState.Ended;
    }

}
