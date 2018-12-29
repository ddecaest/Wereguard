package com.octarez.wereguard;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Graphics;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.octarez.wereguard.screens.main.MainMenuScreen;
import com.octarez.wereguard.screens.splash.SplashScreen;

public class Application extends Game {

	private final Screen mainMenuScreen = new MainMenuScreen(this);
	private final Screen splashScreen = new SplashScreen(this);

	public float virtualWidth;
	public float virtualHeight;

	public OrthographicCamera camera;
	public SpriteBatch spriteBatch;

	@Override
	public void create () {
		final Graphics graphics = Gdx.graphics;
		virtualWidth = 1920f;
		virtualHeight = virtualWidth * (((float) graphics.getHeight())/((float) graphics.getWidth()));
		camera = new OrthographicCamera(virtualWidth, virtualHeight);
		camera.position.set(camera.viewportWidth / 2f, camera.viewportHeight / 2f, 0);
		camera.update();

		spriteBatch = new SpriteBatch();
		spriteBatch.setProjectionMatrix(camera.combined);

		setScreen(splashScreen);
	}

	@Override
	public void dispose () {

	}

	public void goToMainMenu() {
		setScreen(mainMenuScreen);
	}
 }
