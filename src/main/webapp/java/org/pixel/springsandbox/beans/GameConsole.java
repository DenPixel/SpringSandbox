package org.pixel.springsandbox.beans;

public class GameConsole {
    private AbstractGame game;
    private String name;
    private int RAM;

    public GameConsole() {
    }

    public GameConsole(AbstractGame game) {
        this.game = game;
    }

    public void playGame() {
        game.apply();
    }

    public AbstractGame getGame() {
        return game;
    }

    public void setGame(AbstractGame game) {
        this.game = game;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }
}
