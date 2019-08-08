package com.rubicon.swachh;

import com.rubicon.swachh.models.WasteData;

class Waste {
    private WasteData wasteData;

    Waste(){
        wasteData = new WasteData();
        WasteType wasteType = new WasteType();
        BrandType brandType = new BrandType();
        wasteData.setWasteType(wasteType.getWasteTypeData());
        wasteData.setBrandTypeData(brandType.generateBrandTypeForm(wasteType.getTheTypeOfWaste()));
    }

    WasteData getWasteData(){
        return wasteData;
    }
}
