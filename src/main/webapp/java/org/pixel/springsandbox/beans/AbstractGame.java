package org.pixel.springsandbox.beans;

public abstract class AbstractGame {
    private String name;

    public AbstractGame() {
    }

    public AbstractGame(String name) {
        this.name = name;
    }

    public abstract void apply();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
