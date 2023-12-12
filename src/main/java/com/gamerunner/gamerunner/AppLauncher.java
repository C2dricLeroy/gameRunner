package com.gamerunner.gamerunner;

import com.gamerunner.gamerunner.game.Game;
import com.gamerunner.gamerunner.game.MarioGame;
import com.gamerunner.gamerunner.game.PacmanGame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.io.ObjectInputFilter;

@Configuration
@ComponentScan
public class AppLauncher {

    public static void main(String[] args) {

        try(var context = new AnnotationConfigApplicationContext(AppLauncher.class)) {
            context.getBean(Game.class).up();
            context.getBean(GameRunner.class).run();
        }
    }
}
