package org.pixel.springsandbox;

import org.pixel.springsandbox.beans.GameConsole;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringSandboxApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        GameConsole gameConsole = context.getBean("gameConsole", GameConsole.class);
        gameConsole.playGame();

        context.close();
    }
}
