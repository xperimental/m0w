package net.sourcewalker.m0w;

public class GameController {

    private Game game = new Game();

    public Game getGame() {
        return game;
    }

    public void startGame() {
        throw new IllegalStateException();
    }

    public void addPlayer(Player player) {
        game.getPlayers().add(player);
    }

}
