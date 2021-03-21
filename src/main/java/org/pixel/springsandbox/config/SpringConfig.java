package org.pixel.springsandbox.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("org.pixel.springsandbox")
@PropertySource("classpath:gameConsole.properties")
public class SpringConfig {


//    config without ComponentScan
//
//    @Bean
//    public ActionGame actionGame() {
//        return new ActionGame();
//    }
//
//    @Bean
//    public HorrorGame horrorGame() {
//        return new HorrorGame();
//    }
//
//    @Bean
//    public RPGGame rpgGame() {
//        return new RPGGame();
//    }
//
//    @Bean
//    public GameConsole gameConsole() {
//        return new GameConsole(games());
//    }
//
//    public List<Game> games() {
//        return List.of(
//                horrorGame(),
//                rpgGame(),
//                actionGame()
//        );
//    }
}
