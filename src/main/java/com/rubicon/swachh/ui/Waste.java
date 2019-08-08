package com.rubicon.swachh.ui;

import com.rubicon.swachh.models.WasteData;

public class Waste {
    private WasteData wasteData;
    private boolean loop =true;

    public Waste() throws Exception {
        wasteData = new WasteData();

        WasteType wasteType = new WasteType();
        WasteBrand brandType = new WasteBrand(wasteType.getTheTypeOfWaste());
        WasteWeight wasteWeight = new WasteWeight(wasteType.getTheTypeOfWaste(), brandType.getTypeOfBrand());

        wasteData.setWasteType(wasteType.getWasteTypeData());
        wasteData.setWasteBrandData(brandType.getWasteBrandData());

        wasteData.setWeight(wasteWeight.getWeight());

    }

    public String getTypeofWaste(){
        return wasteData.getWasteTypeData().getTypeOfWaste();
    }
    public String getTypeofWasteBrand(){
        return wasteData.getWasteBrandData().getTypeOfWasteBrand();
    }

    public WasteData getWastageData() {
        return wasteData;
    }
}
