package com.rubicon.swachh.models;

public class Waste {
    private WasteType wasteType;
    private BrandType brandType;

    public Waste(){

    }

    public Waste(WasteType wasteType, BrandType brandType) {
        this.wasteType = wasteType;
        this.brandType = brandType;
    }

    public WasteType getWasteType() {
        return wasteType;
    }

    public WasteType setWasteType(WasteType wasteType) {
        this.wasteType = wasteType;
        return wasteType;
    }

    public BrandType getBrandType() {
        return brandType;
    }

    public void setBrandType(BrandType brandType) {
        this.brandType = brandType;
    }

    @Override
    public String toString() {
        return "Waste{" +
                "wasteType=" + wasteType +
                ", brandType=" + brandType +
                '}';
    }
}
