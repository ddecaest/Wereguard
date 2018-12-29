package com.octarez.wereguard.rendering;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class SpriteBatchUtil {

    public static SpriteBatch spriteBatch;

    public static void setup() {
        spriteBatch = new SpriteBatch();

       // final Graphics graphics = Gdx.graphics;
       // virtualWidth = 1920f;
       // virtualHeight = virtualWidth * (((float) graphics.getHeight())/((float) graphics.getWidth()));
       // camera = new OrthographicCamera(virtualWidth, virtualHeight);
       // camera.position.set(camera.viewportWidth / 2f, camera.viewportHeight / 2f, 0);
       // camera.update();
    }
}
