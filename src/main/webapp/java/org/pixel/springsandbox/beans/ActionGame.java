package org.pixel.springsandbox.beans;

public class ActionGame extends AbstractGame {

    public ActionGame() {
    }

    public ActionGame(String name) {
        super(name);
    }

    @Override
    public void apply() {
        System.out.println("tratatata");
    }
}
