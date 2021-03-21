package org.pixel.springsandbox.beans;

public enum Category {
    HORROR(HorrorGame.class),
    RPG(RPGGame.class),
    ACTION(ActionGame.class);

    private final Class classCategory;

    Category(Class classCategory) {
        this.classCategory = classCategory;
    }

    public Class getClassCategory() {
        return classCategory;
    }
}
