package net.sourcewalker.m0w;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class AGameControllerWithTwoPlayers {

    private GameController controller;

    @Before
    public void setUp() {
        controller = new GameController();
        controller.addPlayer(new Player());
        controller.addPlayer(new Player());
    }

    @Test
    public void canBeStarted() {
        controller.startGame();
        assertEquals(GameState.Running, controller.getGame().getState());
    }

}
