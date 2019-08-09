package com.rubicon.swachh.other;

import java.util.Random;

public class WeightGenerator {
    private Random random = new Random();


    public int generateRandom(int min, int max) {
        return random.nextInt((max - min) + 1) + min/2;
    }



}
