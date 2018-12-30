package com.octarez.wereguard.rendering;

import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.GlyphLayout;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class CenteredText {

    private final BitmapFont bitmapFont;
    private final String text;
    private final float y;
    private final float x;

    public CenteredText(BitmapFont bitmapFont, int centerX, int centerY, String text) {
        final GlyphLayout layout = new GlyphLayout();
        layout.setText(bitmapFont, text);

        this.x = centerX - layout.width / 2;
        this.y = centerY - layout.height / 2;
        this.bitmapFont = bitmapFont;
        this.text = text;
    }

    public void draw(SpriteBatch spriteBatch) {
        bitmapFont.draw(spriteBatch, text, x, y);
    }
}
