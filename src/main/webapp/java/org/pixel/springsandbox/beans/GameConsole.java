package org.pixel.springsandbox.beans;

public class GameConsole {
    private Game game;

    public GameConsole() {
    }

    public GameConsole(Game game) {
        this.game = game;
    }

    public void playGame(){

    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
}
