package com.rubicon.swachh.models;

public class WasteData {
    private WasteTypeData wasteTypeData;
    private BrandTypeData brandTypeData;

    public WasteData(){

    }

    public WasteData(WasteTypeData wasteTypeData, BrandTypeData brandTypeData) {
        this.wasteTypeData = wasteTypeData;
        this.brandTypeData = brandTypeData;
    }

    public WasteTypeData getWasteTypeData() {
        return wasteTypeData;
    }

    public WasteTypeData setWasteType(WasteTypeData wasteTypeData) {
        this.wasteTypeData = wasteTypeData;
        return wasteTypeData;
    }

    public BrandTypeData getBrandTypeData() {
        return brandTypeData;
    }

    public void setBrandTypeData(BrandTypeData brandTypeData) {
        this.brandTypeData = brandTypeData;
    }

    @Override
    public String toString() {
        return wasteTypeData.toString()+ brandTypeData.toString();
    }
}
