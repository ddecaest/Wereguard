package com.octarez.wereguard.assets;

import com.badlogic.gdx.graphics.g2d.BitmapFont;

public abstract class FontCache {

    public static final String NORSE_BOLD = "Norse-Bold.otf";

    public static BitmapFont getNorseBold(CustomizedAssetManager customizedAssetManager) {
        return customizedAssetManager.getFont(NORSE_BOLD);
    }
}
