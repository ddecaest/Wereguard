package com.octarez.wereguard.screens.greathall;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.octarez.wereguard.WereguardCore;
import com.octarez.wereguard.assets.FontCache;
import com.octarez.wereguard.rendering.CenteredText;
import com.octarez.wereguard.screens.BasicScreen;

public class GreatHallScreen extends BasicScreen  {

    static final float OUTSIDE_BOX_WIDTH = VIRTUAL_WIDTH * 0.8f;
    static final float OUTSIDE_BOX_HEIGHT = VIRTUAL_HEIGHT * 0.7f;
    static final float OUTSIDE_BOX_BL_X = (VIRTUAL_WIDTH - OUTSIDE_BOX_WIDTH)/2;
    static final float OUTSIDE_BOX_BL_Y = (VIRTUAL_HEIGHT  - OUTSIDE_BOX_HEIGHT)/2;

    private CenteredText title;

    @Override
    protected void initialize() {
        WereguardCore.WEREGUARD_STATE.generateNewTeam();
        title = new CenteredText(FontCache.getNorseBold(assetManager), VIRTUAL_WIDTH / 2, (int) (VIRTUAL_HEIGHT * 0.8 + 50), "GREAT HALL");
    }

    @Override
    protected void render(float deltaInSeconds, SpriteBatch spriteBatch) {
        spriteBatch.begin();
        title.draw(spriteBatch);

        shapeRenderer.setAutoShapeType(true);
        shapeRenderer.setColor(Color.BLACK);
        shapeRenderer.begin();
        shapeRenderer.rect(OUTSIDE_BOX_BL_X, OUTSIDE_BOX_BL_Y, OUTSIDE_BOX_WIDTH, OUTSIDE_BOX_HEIGHT); // Draw outside box
        TeamBoxes.renderTeamBoxes(shapeRenderer);
        shapeRenderer.end();

        spriteBatch.end();
    }

    @Override
    protected void update(float deltaInSeconds) {

    }

    @Override
    public void dispose() {

    }
}
