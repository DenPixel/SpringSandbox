package org.pixel.springsandbox.beans;

import java.util.List;

public class GameConsole {
    private List<AbstractGame> games;
    private String name;
    private int RAM;

    public GameConsole() {
    }

    public static GameConsole getInstance() {
        return new GameConsole();
    }

    public void playGames() {
        games.forEach(AbstractGame::apply);
    }

    public List<AbstractGame> getGames() {
        return games;
    }

    public void setGames(List<AbstractGame> games) {
        this.games = games;
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
