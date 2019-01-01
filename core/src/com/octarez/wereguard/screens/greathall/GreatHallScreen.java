package com.octarez.wereguard.screens.greathall;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.octarez.wereguard.assets.FontCache;
import com.octarez.wereguard.rendering.CenteredText;
import com.octarez.wereguard.screens.BasicScreen;

public class GreatHallScreen extends BasicScreen  {

    private CenteredText title;

    @Override
    protected void initialize() {
        title = new CenteredText(FontCache.getNorseBold(assetManager), VIRTUAL_WIDTH / 2, (int) (VIRTUAL_HEIGHT * 0.8 + 50), "GREAT HALL");
    }

    @Override
    protected void render(float deltaInSeconds, SpriteBatch spriteBatch) {
        shapeRenderer.setAutoShapeType(true);
        shapeRenderer.setColor(Color.BLACK);
        shapeRenderer.begin();
        shapeRenderer.rect(VIRTUAL_WIDTH * 0.1f, VIRTUAL_HEIGHT * 0.1f,  VIRTUAL_WIDTH * 0.8f, VIRTUAL_HEIGHT * 0.7f);
        shapeRenderer.end();

        spriteBatch.begin();
        title.draw(spriteBatch);
        spriteBatch.end();
    }

    @Override
    protected void update(float deltaInSeconds) {

    }

    @Override
    public void dispose() {

    }
}
