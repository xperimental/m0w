package net.sourcewalker.m0w;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class AStartedGameController {

    private GameController controller;
    private Game game;

    @Before
    public void setUp() {
        controller = new GameController();
        controller.addPlayer(new Player());
        controller.addPlayer(new Player());
        controller.startGame();
        game = controller.getGame();
    }

    @Test
    public void isInRunningState() {
        assertEquals(GameState.Running, game.getState());
    }

    @Test
    public void hasAnActivePlayer() {
        assertNotNull(game.getActivePlayer());
    }

    @Test
    public void hasATopCardOnPlayingStack() {
        assertNotNull(game.getPlayingStack().getTopCard());
    }

    @Test(expected = IllegalStateException.class)
    public void canNotHoldMorePlayers() {
        controller.addPlayer(new Player());
    }

}
