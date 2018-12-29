package com.octarez.wereguard.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.octarez.wereguard.Application;

public class DesktopLauncher {

    public static void main(String[] arg) {
        new LwjglApplication(createApplicationListener(), createConfiguration());
    }

    private static Application createApplicationListener() {
        return new Application();
    }

    private static LwjglApplicationConfiguration createConfiguration() {
        final LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.title = "Wereguard";
        config.width = 1600;
        config.height = 900;
        return config;
    }
}
