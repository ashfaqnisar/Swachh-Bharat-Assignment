package com.rubicon.swachh.models;



public class WasteData {
    private WasteTypeData wasteTypeData;
    private WasteBrandData wasteBrandData;
    private int Weight;
    private int Points;

    public WasteData() {
    }

    public WasteData(WasteTypeData wasteTypeData, WasteBrandData wasteBrandData) {
        this.wasteTypeData = wasteTypeData;
        this.wasteBrandData = wasteBrandData;
    }

    public WasteTypeData getWasteTypeData() {
        return wasteTypeData;
    }

    public void setWasteTypeData(WasteTypeData wasteTypeData) {
        this.wasteTypeData = wasteTypeData;
    }

    public WasteBrandData getWasteBrandData() {
        return wasteBrandData;
    }

    public void setWasteBrandData(WasteBrandData wasteBrandData) {
        this.wasteBrandData = wasteBrandData;
    }

    public int getPoints() {
        return Points;
    }

    public void setPoints(int Weight) {
        Points = (Weight/2)+7;
    }

    public int getWeight() {
        return Weight;
    }

    public void setWeight(int weight) {
        Weight = weight;
    }


    @Override
    public String toString() {
        return wasteTypeData.toString() + wasteBrandData.toString() +
                "\nWeight of the Waste: " + getWeight() + "gm\n";
    }
}
