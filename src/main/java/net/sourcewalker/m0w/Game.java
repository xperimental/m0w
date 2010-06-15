package net.sourcewalker.m0w;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private CardStack drawStack = new CardStack();
    private CardStack playingStack = new CardStack();
    private List<Player> players = new ArrayList<Player>();
    private int activePlayer = 0;
    private GameState state = GameState.Ended;

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
        return players.size();
    }

    public CardStack getDrawStack() {
        return drawStack;
    }

    public CardStack getPlayingStack() {
        return playingStack;
    }

    public GameState getState() {
        return state;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public Player getActivePlayer() {
        return players.get(activePlayer);
    }

    protected void setState(GameState newState) {
        state = newState;
    }

}
