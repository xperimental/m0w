package net.sourcewalker.m0w;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class ANewGameController {

    private GameController controller;

    @Before
    public void setUp() {
        controller = new GameController();
    }

    @Test
    public void hasAGame() {
        assertNotNull(controller.getGame());
    }

    @Test(expected = IllegalStateException.class)
    public void canNotBeStarted() {
        controller.startGame();
    }

    @Test
    public void canHoldPlayers() {
        controller.addPlayer(new Player());
        controller.addPlayer(new Player());
        assertEquals(2, controller.getGame().getPlayerCount());
    }

}
