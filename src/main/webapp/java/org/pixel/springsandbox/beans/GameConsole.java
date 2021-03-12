package org.pixel.springsandbox.beans;

public class GameConsole {
    private AbstractGame game;

    public GameConsole() {}

    public GameConsole(AbstractGame game) {
        this.game = game;
    }

    public void playGame(){
        game.apply();
    }

    public AbstractGame getGame() {
        return game;
    }

    public void setGame(AbstractGame game) {
        this.game = game;
    }
}
