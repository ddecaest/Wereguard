package com.octarez.wereguard.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.octarez.wereguard.rendering.SpriteBatchUtil;

public abstract class BasicScreen implements Screen {

    public static final int VIRTUAL_WIDTH = 1600;
    public static final int VIRTUAL_HEIGHT = 900;

    protected Viewport viewport;
    protected Camera camera;

    @Override
    public void show() {
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
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        SpriteBatchUtil.spriteBatch.setProjectionMatrix(camera.combined);
        SpriteBatchUtil.spriteBatch.begin();
        render(delta, SpriteBatchUtil.spriteBatch);
        SpriteBatchUtil.spriteBatch.end();
    }

    public abstract void render(float deltaInSeconds, SpriteBatch spriteBatch);

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
}
