package org.pixel.springsandbox.beans;

public abstract class AbstractGame {
    private String name;

    public AbstractGame(String name) {
        this.name = name;
    }

    public abstract void work();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
