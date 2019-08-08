package com.rubicon.swachh.ui;

import com.rubicon.swachh.other.Reader;

class WasteWeight {
    private int weight;

    WasteWeight(String typeOfWaste, String typeOfBrand) throws Exception {
//        WeightGenerator weightGenerator = new WeightGenerator();
        Reader reader = new Reader();
        weight = reader.getWeightFromFile(typeOfWaste.trim().replaceAll(" ",""),
                typeOfBrand.trim().replaceAll(" ",""));

//        weight = weightGenerator.generateRandom(20, 30);
        System.out.print("\nThe weight of the wastage placed is: " + weight + "gm\n");
    }

    int getWeight() {
        return weight;
    }
}
