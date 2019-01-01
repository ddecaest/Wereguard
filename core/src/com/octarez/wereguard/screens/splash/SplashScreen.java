package com.octarez.wereguard.screens.splash;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.octarez.wereguard.WereguardCore;
import com.octarez.wereguard.assets.FontCache;
import com.octarez.wereguard.rendering.CenteredText;
import com.octarez.wereguard.screens.BasicScreen;

public class SplashScreen extends BasicScreen {

    private static long SPLASH_MINIMUM_MILLIS = 2000L;

    private AssetLoadingTask assetLoadingTask;
    private CenteredText loadingText;
    private long millisPassed;

    @Override
    protected void initialize() {
        assetLoadingTask = new AssetLoadingTask(assetManager);
        millisPassed = 0;
    }

    @Override
    public void render(float deltaInSeconds, SpriteBatch spriteBatch) {
        assetLoadingTask.loadAsset();

        if (assetManager.hasLoaded(FontCache.NORSE_BOLD)) {
            if (loadingText == null) {
                loadingText = new CenteredText(FontCache.getNorseBold(assetManager), VIRTUAL_WIDTH / 2, VIRTUAL_HEIGHT / 2, "Loading...");
            }
            spriteBatch.begin();
            loadingText.draw(spriteBatch);
            spriteBatch.end();
        }

        update(deltaInSeconds);
    }

    @Override
    protected void update(float deltaInSeconds) {
        millisPassed += deltaInSeconds * 1000f;

        if (assetLoadingTask.loadingDone && millisPassed > SPLASH_MINIMUM_MILLIS) {
            WereguardCore.SCREEN_MANAGER.goToMainMenu();
        }
    }
}
