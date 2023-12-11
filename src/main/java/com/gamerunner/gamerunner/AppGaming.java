package com.gamerunner.gamerunner;

import com.gamerunner.gamerunner.game.MarioGame;

public class AppGaming {

    public static void main(String[] args) {
        var game = new MarioGame();
        var gameRunner = new GameRunner(game);

        gameRunner.run();

    }
}
