package com.octarez.wereguard.screens.splash;

import com.octarez.wereguard.assets.CustomizedAssetManager;

public class AssetLoadingTask {

    private final CustomizedAssetManager assetManager;
    public boolean loadingDone;

    public AssetLoadingTask(CustomizedAssetManager assetManager) {
        this.assetManager = assetManager;
        this.loadingDone = false;
    }

    public void loadAsset() {
        assetManager.queueAssetsForLoadingIfNecessary();

        loadingDone = assetManager.update();
    }
}