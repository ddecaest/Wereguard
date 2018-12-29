package com.octarez.wereguard.screens.splash;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.octarez.wereguard.Application;

public class SplashScreen extends ScreenAdapter {

    private static long SPLASH_MINIMUM_MILLIS = 2000L;

    private final Application application;

    private boolean loadingDone;
    private long millisPassed;

    public SplashScreen(Application application) {
        this.application = application;
    }

    @Override
    public void show() {
        loadingDone = false;
        millisPassed = 0;

        startAsyncLoadingAssets();
    }

    private void startAsyncLoadingAssets() {
        Gdx.app.postRunnable(new AssetLoadingTask(this));
    }

    @Override
    public void render(float deltaInSeconds) {
        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        update(deltaInSeconds);
    }

    private void update(float deltaInSeconds) {
        millisPassed += deltaInSeconds * 1000f;

        if(loadingDone && millisPassed > SPLASH_MINIMUM_MILLIS) {
            application.goToMainMenu();
        }
    }

    public void loadingDone() {
        loadingDone = true;
    }

    @Override
    public void dispose() {

    }
}
