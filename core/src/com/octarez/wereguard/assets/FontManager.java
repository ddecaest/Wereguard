package com.octarez.wereguard.assets;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator.FreeTypeFontParameter;

public class FontManager {

    public static BitmapFont NORSE_BOLD;

    public static void loadFonts() {
        final FreeTypeFontGenerator norseBoldGenerator = createGenerator("Norse-Bold.otf");
        NORSE_BOLD = generate(norseBoldGenerator, 18, Color.GRAY);
    }

    private static BitmapFont generate(FreeTypeFontGenerator generator, int size, Color color) {
        final FreeTypeFontParameter parameter = new FreeTypeFontParameter();
        parameter.size = size;
        parameter.color = color;
        parameter.characters = FreeTypeFontGenerator.DEFAULT_CHARS;
        return generator.generateFont(parameter);
    }

    private static FreeTypeFontGenerator createGenerator(String fileName) {
        final FileHandle fontFile = Gdx.files.internal(fileName);
        return new FreeTypeFontGenerator(fontFile);
    }

    public static void dispose() {
        NORSE_BOLD.dispose();
    }
}
