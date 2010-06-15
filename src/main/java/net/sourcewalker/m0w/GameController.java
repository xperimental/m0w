package net.sourcewalker.m0w;

public class GameController {

    private Game game = new Game();

    public Game getGame() {
        return game;
    }

    public void startGame() {
        if (game.getPlayerCount() < 2) {
            throw new IllegalStateException();
        }
        game.setState(GameState.Running);
    }

    public void addPlayer(Player player) {
        if (!game.getState().equals(GameState.Ended)) {
            throw new IllegalStateException();
        }
        game.getPlayers().add(player);
    }

}
