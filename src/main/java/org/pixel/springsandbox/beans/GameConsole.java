package org.pixel.springsandbox.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GameConsole {
    private List<Game> games;

    @Value("${gameConsole.name}")
    private String name;

    @Value("${gameConsole.RAM}")
    private int RAM;

    public GameConsole() {
    }

    @Autowired
    public GameConsole(List<Game> games) {
        this.games = games;
    }

    public void playGame(Category category) {
        Game gamesCategory = games.stream()
                .filter(g -> g.getClass()  == category.getClassCategory())
                .findFirst()
                .orElseThrow();
        String[] games = gamesCategory.getGames();

        String game = games[(int) (Math.random() * games.length)];

        System.out.println(game);

    }

    public List<Game> getGames() {
        return games;
    }

    public void setGames(List<Game> games) {
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
