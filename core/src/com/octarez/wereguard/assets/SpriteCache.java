package com.octarez.wereguard.assets;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

import java.util.HashMap;
import java.util.Map;

public abstract class SpriteCache {

    private static final String ASPECT = "image.jpg";

    private static final Map<String, Sprite> SPRITE_CACHE = new HashMap<>();

    public static Sprite getAspect(CustomizedAssetManager customizedAssetManager) {
        return getSprite(customizedAssetManager, ASPECT);
    }

    private static Sprite getSprite(CustomizedAssetManager customizedAssetManager, String fileName) {
        Sprite sprite = SPRITE_CACHE.get(fileName);
        if(sprite == null) {
            final Texture texture = customizedAssetManager.getTexture(fileName);
            sprite = new Sprite(texture);
            SPRITE_CACHE.put(fileName, sprite);
        }
        return sprite;
    }
}
