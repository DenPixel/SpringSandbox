package org.pixel.springsandbox.beans;

public class RPGGame extends AbstractGame {

    private RPGGame() {
    }

    public static RPGGame getInstance() {
        return new RPGGame();
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
