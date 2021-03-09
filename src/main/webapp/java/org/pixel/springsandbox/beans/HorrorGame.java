package org.pixel.springsandbox.beans;

public class HorrorGame extends AbstractGame{

    public HorrorGame(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("booooo");
    }
}
