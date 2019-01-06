package com.octarez.wereguard.model;

import com.octarez.wereguard.assets.RandomSource;

public abstract class NameGenerator {

    private static String[] FIRST_NAMES = new String[]{"Calder", "Eirik", "Gunnar", "Halvar"};

    public static String getRandomFirstName() {
        return FIRST_NAMES[RandomSource.nextInt(0, FIRST_NAMES.length-1)];
    }
}
