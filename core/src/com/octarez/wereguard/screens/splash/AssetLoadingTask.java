package com.octarez.wereguard.screens.splash;

import com.octarez.wereguard.assets.FontManager;

public class AssetLoadingTask implements Runnable {

    private final SplashScreen splashScreen;

    public AssetLoadingTask(SplashScreen splashScreen) {
        this.splashScreen = splashScreen;
    }

    @Override
    public void run() {
        FontManager.createNorse();

        splashScreen.loadingDone();
    }
}