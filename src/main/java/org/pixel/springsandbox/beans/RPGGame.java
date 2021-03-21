package org.pixel.springsandbox.beans;

import org.springframework.stereotype.Component;

@Component("rpgGame")
public class RPGGame implements Game {

    public RPGGame() {
    }

    @Override
    public String[] getGames() {
        return new String[]{"skyrim", "gothic", "fallout"};
    }
}
