package com.octarez.wereguard.assets;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.assets.loaders.FileHandleResolver;
import com.badlogic.gdx.assets.loaders.resolvers.InternalFileHandleResolver;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGeneratorLoader;
import com.badlogic.gdx.graphics.g2d.freetype.FreetypeFontLoader;
import com.badlogic.gdx.graphics.g2d.freetype.FreetypeFontLoader.FreeTypeFontLoaderParameter;

public class CustomizedAssetManager {

    private final AssetManager assetManager;
    private boolean assetsQueuedForLoading;

    public CustomizedAssetManager() {
        this.assetManager = new AssetManager();

        final FileHandleResolver resolver = new InternalFileHandleResolver();
        final FreetypeFontLoader freetypeFontLoader = new FreetypeFontLoader(resolver);

        assetManager.setLoader(FreeTypeFontGenerator.class, new FreeTypeFontGeneratorLoader(resolver));
        assetManager.setLoader(BitmapFont.class, ".ttf", freetypeFontLoader);
        assetManager.setLoader(BitmapFont.class, ".otf", freetypeFontLoader);

        assetsQueuedForLoading = false;
    }

    public void queueAssetsForLoadingIfNecessary() {

        if(assetsQueuedForLoading) {
            return;
        }
        assetsQueuedForLoading = true;

        final FreeTypeFontLoaderParameter norseBoldParams = new FreeTypeFontLoaderParameter();
        norseBoldParams.fontFileName = FontCache.NORSE_BOLD;
        norseBoldParams.fontParameters.color = Color.BLACK;
        norseBoldParams.fontParameters.size = 32;
        assetManager.load(norseBoldParams.fontFileName, BitmapFont.class, norseBoldParams);

        assetManager.load("image.jpg", Texture.class);
    }

    public void dispose() {
        assetManager.dispose();
    }

    public boolean update() {
        return assetManager.update();
    }

    public boolean hasLoaded(String fileName) {
        return assetManager.isLoaded(fileName);
    }

    public BitmapFont getFont(String fileName) {
        return assetManager.get(fileName);
    }

    public Texture getTexture(String fileName) {
        return assetManager.get(fileName);
    }
}
