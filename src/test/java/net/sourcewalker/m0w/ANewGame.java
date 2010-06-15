package net.sourcewalker.m0w;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ANewGame {

    private Game game;

    @Before
    public void setUp() {
        game = new Game();
    }

    @Test
    public void hasZeroPlayers() {
        assertEquals(0, game.getPlayerCount());
    }

    @Test
    public void hasAnEmptyDrawStack() {
        assertEquals(0, game.getDrawStack().getCount());
    }

    @Test
    public void has32CardsInPlayingStack() {
        assertEquals(32, game.getPlayingStack().getCount());
    }

    @Test
    public void isInEndedState() {
        assertEquals(GameState.Ended, game.getState());
    }
}
