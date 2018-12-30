package com.octarez.wereguard.screens.main;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.octarez.wereguard.assets.FontCache;
import com.octarez.wereguard.rendering.CenteredText;
import com.octarez.wereguard.screens.BasicScreen;

import java.util.Arrays;
import java.util.List;

public class MainMenuScreen extends BasicScreen {

    private List<CenteredText> menuOptions;

    @Override
    protected void initialize() {
        final CenteredText play = new CenteredText(FontCache.getNorseBold(assetManager), VIRTUAL_WIDTH / 2, VIRTUAL_HEIGHT * 3/4, "1. Play");
        final CenteredText exit = new CenteredText(FontCache.getNorseBold(assetManager), VIRTUAL_WIDTH / 2, VIRTUAL_HEIGHT * 2/4, "2. Exit");
        menuOptions = Arrays.asList(play, exit);
    }

    @Override
    public void render(float deltaInSeconds, final SpriteBatch spriteBatch) {
        menuOptions.forEach(menuOption -> menuOption.draw(spriteBatch));
    }

    @Override
    protected void update(float deltaInSeconds) {
        if(Gdx.input.isKeyPressed(Input.Keys.NUM_1)) {
            screenManager.goToGreatHall();
        }
        else if(Gdx.input.isKeyPressed(Input.Keys.NUM_2)) {
            screenManager.close();
        }
    }

    @Override
    public void dispose() {

    }
}
