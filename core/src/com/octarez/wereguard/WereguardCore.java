package com.octarez.wereguard;

import com.badlogic.gdx.Game;
import com.octarez.wereguard.assets.CustomizedAssetManager;
import com.octarez.wereguard.rendering.RenderUtil;
import com.octarez.wereguard.screens.ScreenManager;

public class WereguardCore extends Game {

    public static CustomizedAssetManager ASSET_MANAGER;
    public static WereguardState WEREGUARD_STATE;
    public static ScreenManager SCREEN_MANAGER;
    public static RenderUtil RENDER_UTIL;

    @Override
    public void create () {
        WEREGUARD_STATE = new WereguardState();

        SCREEN_MANAGER = new ScreenManager(this);
        ASSET_MANAGER = new CustomizedAssetManager();
        RENDER_UTIL = new RenderUtil();

        SCREEN_MANAGER.goToSplashScreen();
    }

    @Override
    public void dispose () {
        ASSET_MANAGER.dispose();
        RENDER_UTIL.dispose();
    }
}
