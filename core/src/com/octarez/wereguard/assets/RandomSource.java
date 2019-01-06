package com.octarez.wereguard.assets;

import java.util.Random;

public abstract class RandomSource {

    private static Random random = new Random();

    /**
     * @return a random number between min and max (inclusive)
     */
    public static int nextInt(int min, int max) {
        return min + random.nextInt(max - min + 1);
    }
}
