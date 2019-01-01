package com.octarez.wereguard.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.octarez.wereguard.WereguardCore;
import com.octarez.wereguard.assets.CustomizedAssetManager;

public abstract class BasicScreen implements Screen {

    private static final float BACKGROUND_GREEN = 0.85f;
    private static final float BACKGROUND_BLUE = 0.91f;
    private static final float BACKGROUND_RED = 0.85f;

    protected static final int VIRTUAL_WIDTH = 1600;
    protected static final int VIRTUAL_HEIGHT = 900;

    protected CustomizedAssetManager assetManager;
    protected ShapeRenderer shapeRenderer;
    protected ScreenManager screenManager;
    protected SpriteBatch spriteBatch;
    protected Viewport viewport;
    protected Camera camera;

    @Override
    public void show() {
        shapeRenderer = WereguardCore.RENDER_UTIL.shapeRenderer;
        spriteBatch = WereguardCore.RENDER_UTIL.spriteBatch;
        screenManager = WereguardCore.SCREEN_MANAGER;
        assetManager = WereguardCore.ASSET_MANAGER;

        camera = new OrthographicCamera();
        viewport = new FitViewport(VIRTUAL_WIDTH,VIRTUAL_HEIGHT, camera);
        viewport.apply();
        camera.position.set(camera.viewportWidth/2,camera.viewportHeight/2,0);

        initialize();
    }

    protected abstract void initialize();

    @Override
    public void render(float delta) {
        camera.update();
        Gdx.gl.glClearColor(BACKGROUND_RED, BACKGROUND_GREEN, BACKGROUND_BLUE, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        spriteBatch.setProjectionMatrix(camera.combined);

        render(delta, spriteBatch);
        update(delta);
    }

    protected abstract void render(float deltaInSeconds, SpriteBatch spriteBatch);

    protected abstract void update(float deltaInSeconds);

    @Override
    public void resize(int width, int height) {
        viewport.update(width,height);
        camera.position.set(camera.viewportWidth/2,camera.viewportHeight/2,0);
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
