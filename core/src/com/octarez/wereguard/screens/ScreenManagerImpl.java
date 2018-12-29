package com.octarez.wereguard.screens;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;
import com.octarez.wereguard.assets.AudioManager;
import com.octarez.wereguard.assets.FontManager;
import com.octarez.wereguard.assets.ImageManager;
import com.octarez.wereguard.rendering.SpriteBatchUtil;
import com.octarez.wereguard.screens.main.MainMenuScreen;
import com.octarez.wereguard.screens.splash.SplashScreen;

public class ScreenManagerImpl extends Game implements ScreenManager {

	private final Screen mainMenuScreen = new MainMenuScreen(this);
	private final Screen splashScreen = new SplashScreen(this);

	@Override
	public void create () {
		SpriteBatchUtil.setup();

		setScreen(splashScreen);
	}

	@Override
	public void dispose () {
		AudioManager.dispose();
		ImageManager.dispose();
		FontManager.dispose();
	}

	@Override
	public void goToMainMenu() {
		setScreen(mainMenuScreen);
	}
 }
