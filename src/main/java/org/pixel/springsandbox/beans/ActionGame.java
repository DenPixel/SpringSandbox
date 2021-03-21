package org.pixel.springsandbox.beans;

import org.springframework.stereotype.Component;

@Component
public class ActionGame implements Game {

    public ActionGame() {
    }

    @Override
    public String[] getGames() {
        return new String[]{"call of duty", "serious sam", "medal of honor"};
    }
}
