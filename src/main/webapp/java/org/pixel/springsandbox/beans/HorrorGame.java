package org.pixel.springsandbox.beans;

public class HorrorGame extends AbstractGame{

    public HorrorGame() {
    }

    public HorrorGame(String name) {
        super(name);
    }

    @Override
    public void apply() {
        System.out.println("booooo");
    }
}
