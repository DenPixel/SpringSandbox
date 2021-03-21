package org.pixel.springsandbox.beans;

public class HorrorGame extends AbstractGame {

    private HorrorGame() {
    }

    public static HorrorGame getInstance() {
        return new HorrorGame();
    }

    @Override
    public void apply() {
        System.out.println("booooo");
    }
}
