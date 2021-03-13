package org.pixel.springsandbox.beans;

public class RPGGame extends AbstractGame{

    public RPGGame() {
    }

    public RPGGame(String name) {
        super(name);
    }

    @Override
    public void apply() {
        System.out.println("This is magic");
    }

    private void init() {
        System.out.println("create world");
    }

    private void destroy() {
        System.out.println("destroy world");
    }
}
