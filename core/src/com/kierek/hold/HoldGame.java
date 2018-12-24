package com.kierek.hold;

import com.badlogic.gdx.Game;
import com.kierek.screens.MainGameScreen;

public class HoldGame extends Game {

    @Override
    public void create() {
        setScreen(new MainGameScreen());
    }

    @Override
    public void render() {
        super.render();
    }
}
