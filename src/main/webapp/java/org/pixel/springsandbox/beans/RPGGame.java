package org.pixel.springsandbox.beans;

public class RPGGame extends AbstractGame{

    public RPGGame() {
    }

    public RPGGame(String name) {
        super(name);
    }

    @Override
    public void apply() {
        System.out.println("Strike with a sword");
    }
}
