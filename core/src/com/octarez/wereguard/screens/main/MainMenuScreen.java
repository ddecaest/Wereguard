package com.octarez.wereguard.screens.main;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.octarez.wereguard.Application;
import com.octarez.wereguard.assets.FontManager;

public class MainMenuScreen extends ScreenAdapter {

    private final Application application;

    public MainMenuScreen(Application application) {
        this.application = application;
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        final SpriteBatch spriteBatch = application.spriteBatch;

        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        spriteBatch.begin();
        FontManager.NORSE_BOLD.draw(spriteBatch, "FPS:" + Gdx.graphics.getFramesPerSecond(), application.virtualWidth/2, application.virtualHeight/2);
        spriteBatch.end();
    }

    @Override
    public void dispose() {

    }
}
