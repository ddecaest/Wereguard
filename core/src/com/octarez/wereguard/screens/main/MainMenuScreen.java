package com.octarez.wereguard.screens.main;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.octarez.wereguard.assets.ImageManager;
import com.octarez.wereguard.screens.BasicScreen;
import com.octarez.wereguard.screens.ScreenManager;
import com.octarez.wereguard.assets.FontManager;

public class MainMenuScreen extends BasicScreen {

    private final ScreenManager screenManager;

    public MainMenuScreen(ScreenManager screenManager) {
        this.screenManager = screenManager;
    }

    @Override
    protected void initialize() {
        ImageManager.aspectRatios.setPosition(0,0);
        ImageManager.aspectRatios.setSize(VIRTUAL_WIDTH,VIRTUAL_HEIGHT);
    }

    @Override
    public void render(float deltaInSeconds, SpriteBatch spriteBatch) {
        FontManager.NORSE_BOLD.draw(spriteBatch,
                "FPS:" + Gdx.graphics.getFramesPerSecond(),
                VIRTUAL_WIDTH / 2f,
                VIRTUAL_HEIGHT / 2f
        );

//        ImageManager.aspectRatios.draw(spriteBatch);
    }

    @Override
    public void dispose() {

    }
}
