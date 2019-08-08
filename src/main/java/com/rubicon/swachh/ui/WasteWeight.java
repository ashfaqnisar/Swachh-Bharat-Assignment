package com.rubicon.swachh.ui;

import com.rubicon.swachh.other.WeightGenerator;

class WasteWeight {
    private int weight;

    WasteWeight() {
        WeightGenerator weightGenerator = new WeightGenerator();
        weight = weightGenerator.generateRandom(20, 30);
        System.out.print("\nThe weight of the wastage placed is: " + weight + "gm\n");
    }

    int getWeight() {
        return weight;
    }
}
