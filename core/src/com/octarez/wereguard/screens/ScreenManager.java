package com.octarez.wereguard.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.octarez.wereguard.WereguardCore;
import com.octarez.wereguard.screens.greathall.GreatHallScreen;
import com.octarez.wereguard.screens.main.MainMenuScreen;
import com.octarez.wereguard.screens.splash.SplashScreen;

public class ScreenManager {

	private final Screen greatHallScreen = new GreatHallScreen();
	private final Screen mainMenuScreen = new MainMenuScreen();
	private final Screen splashScreen = new SplashScreen();

	private final WereguardCore wereguardCore;

	public ScreenManager(WereguardCore wereguardCore) {
		this.wereguardCore = wereguardCore;
	}

	public void goToSplashScreen() {
		wereguardCore.setScreen(splashScreen);
	}

	public void goToMainMenu() {
		wereguardCore.setScreen(mainMenuScreen);
	}

	public void goToGreatHall() {
		wereguardCore.setScreen(greatHallScreen);
	}

	public void close() {
		Gdx.app.exit();
	}
}
