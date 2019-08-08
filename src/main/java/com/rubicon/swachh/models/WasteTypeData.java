package com.rubicon.swachh.models;

public class WasteTypeData {
    private boolean glass = false;
    private boolean metal = false;
    private boolean plastic = false;

    public WasteTypeData() {
    }

    WasteTypeData(boolean glass, boolean metal, boolean plastic) {
        this.glass = glass;
        this.metal = metal;
        this.plastic = plastic;
    }

    public boolean isGlass() {
        return glass;
    }

    public void setGlass(boolean glass) {
        this.glass = glass;
    }

    public boolean isMetal() {
        return metal;
    }

    public void setMetal(boolean metal) {
        this.metal = metal;
    }

    public boolean isPlastic() {
        return plastic;
    }

    public void setPlastic(boolean plastic) {
        this.plastic = plastic;
    }

    public String getWastageType(){
        if (isGlass()){
            return "Glass";
        }
        else if (isMetal()){
            return "Metal";
        }
        else if (isPlastic()){
            return "Plastic";
        }
        return "Default";
    }

    @Override
    public String toString() {
        return "\nType of the Waste:   " + getWastageType();
    }
}
