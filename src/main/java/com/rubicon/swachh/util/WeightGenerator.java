package com.rubicon.swachh.util;

import java.util.Random;

public class WeightGenerator {
    private Random random = new Random();

    public void generateRandom(int min, int max) {
        int number = random.nextInt((max - min) + 1) + min;
        System.out.print(number);

    }
}
