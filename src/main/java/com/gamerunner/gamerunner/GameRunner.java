package com.gamerunner.gamerunner;

import com.gamerunner.gamerunner.game.Game;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    Game game;

    public GameRunner(Game game) {
        this.game = game;
    }

    public void run() {
        System.out.println("Running game" + game.toString());

        game.up();
        game.down();
        game.left();
        game.right();
    }
}
