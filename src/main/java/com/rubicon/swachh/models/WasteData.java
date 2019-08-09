package com.rubicon.swachh.models;

import com.rubicon.swachh.ui.Waste;

import java.util.ArrayList;

public class WasteData {
    private WasteTypeData wasteTypeData;
    private WasteBrandData wasteBrandData;
    private int Weight;

    public WasteData() {
    }

    public WasteData(WasteTypeData wasteTypeData, WasteBrandData wasteBrandData) {
        this.wasteTypeData = wasteTypeData;
        this.wasteBrandData = wasteBrandData;
    }

    public WasteTypeData getWasteTypeData() {
        return wasteTypeData;
    }

    public void setWasteType(WasteTypeData wasteTypeData) {
        this.wasteTypeData = wasteTypeData;
    }

    public WasteBrandData getWasteBrandData() {
        return wasteBrandData;
    }

    public void setWasteBrandData(WasteBrandData wasteBrandData) {
        this.wasteBrandData = wasteBrandData;
    }

    public int getWeight() {
        return Weight;
    }

    public void setWeight(int weight) {
        Weight = weight;
    }
    public void printWasteData(ArrayList<WasteData> wasteData){
        for (WasteData data:wasteData){
            System.out.println(data.getWasteTypeData().toString()+data.getWasteBrandData().toString());
        }
    }

    @Override
    public String toString() {
        return wasteTypeData.toString() + wasteBrandData.toString() +
                "\nWeight of the Waste: " + getWeight() + "gm\n";
    }
}
