package org.pixel.springsandbox.beans;

import org.springframework.stereotype.Component;

@Component()
public class HorrorGame implements Game {

    public HorrorGame() {
    }

    @Override
    public String[] getGames() {
        return new String[]{"outlast", "don't knock twice", "fear"};
    }
}
