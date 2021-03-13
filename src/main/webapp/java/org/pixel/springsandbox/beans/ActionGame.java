package org.pixel.springsandbox.beans;

public class ActionGame extends AbstractGame {

    private ActionGame() {
    }

    public static ActionGame getInstance() {
        return new ActionGame();
    }

    @Override
    public void apply() {
        System.out.println("tratatata");
    }
}
