package org.pixel.springsandbox;

import org.pixel.springsandbox.beans.Category;
import org.pixel.springsandbox.beans.GameConsole;
import org.pixel.springsandbox.config.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringSandboxApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );

        GameConsole gameConsole = ctx.getBean(GameConsole.class);

        gameConsole.playGame(Category.ACTION);

        ctx.close();
    }
}
