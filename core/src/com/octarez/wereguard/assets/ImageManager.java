package com.octarez.wereguard.assets;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

public class ImageManager {

    public static Sprite aspectRatios;

    public static void loadImages() {
        aspectRatios = new Sprite(new Texture(Gdx.files.internal("image.jpg")));
    }

    public static void dispose() {
        aspectRatios.getTexture().dispose();
    }
}
