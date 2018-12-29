package com.octarez.wereguard.screens.splash;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.octarez.wereguard.screens.BasicScreen;
import com.octarez.wereguard.screens.ScreenManager;

public class SplashScreen extends BasicScreen {

    private static long SPLASH_MINIMUM_MILLIS = 2000L;

    private final ScreenManager screenManager;

    private boolean loadingDone;
    private long millisPassed;

    public SplashScreen(ScreenManager screenManager) {
        this.screenManager = screenManager;
    }

    @Override
    protected void initialize() {
        loadingDone = false;
        millisPassed = 0;

        startAsyncLoadingAssets();
    }

    private void startAsyncLoadingAssets() {
        Gdx.app.postRunnable(new AssetLoadingTask(this));
    }

    @Override
    public void render(float deltaInSeconds, SpriteBatch spriteBatch) {
        update(deltaInSeconds);
    }

    private void update(float deltaInSeconds) {
        millisPassed += deltaInSeconds * 1000f;

        if(loadingDone && millisPassed > SPLASH_MINIMUM_MILLIS) {
            screenManager.goToMainMenu();
        }
    }

    public void loadingDone() {
        loadingDone = true;
    }

    @Override
    public void dispose() {

    }
}
