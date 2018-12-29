package com.octarez.wereguard.screens.splash;

import com.octarez.wereguard.assets.AudioManager;
import com.octarez.wereguard.assets.FontManager;
import com.octarez.wereguard.assets.ImageManager;

public class AssetLoadingTask implements Runnable {

    private final SplashScreen splashScreen;

    public AssetLoadingTask(SplashScreen splashScreen) {
        this.splashScreen = splashScreen;
    }

    @Override
    public void run() {
        AudioManager.loadSounds();
        ImageManager.loadImages();
        FontManager.loadFonts();

        splashScreen.loadingDone();
    }
}