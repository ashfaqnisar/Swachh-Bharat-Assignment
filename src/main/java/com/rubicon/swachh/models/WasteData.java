package com.rubicon.swachh.models;

public class WasteData {
    private WasteTypeData wasteTypeData;
    private BrandTypeData brandTypeData;
    private int Weight;

    public WasteData() {
    }

    public WasteData(WasteTypeData wasteTypeData, BrandTypeData brandTypeData) {
        this.wasteTypeData = wasteTypeData;
        this.brandTypeData = brandTypeData;
    }

    public WasteTypeData getWasteTypeData() {
        return wasteTypeData;
    }

    public void setWasteType(WasteTypeData wasteTypeData) {
        this.wasteTypeData = wasteTypeData;
    }

    public BrandTypeData getBrandTypeData() {
        return brandTypeData;
    }

    public void setBrandTypeData(BrandTypeData brandTypeData) {
        this.brandTypeData = brandTypeData;
    }

    public int getWeight() {
        return Weight;
    }

    public void setWeight(int weight) {
        Weight = weight;
    }

    @Override
    public String toString() {
        return wasteTypeData.toString() + brandTypeData.toString() +
                "\nWeight of the Waste: " + getWeight() + "gm\n";
    }
}
