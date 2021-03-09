package org.pixel.springsandbox.beans;

public class RPGGame extends AbstractGame{
    
    public RPGGame(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("Strike with a sword");
    }
}
