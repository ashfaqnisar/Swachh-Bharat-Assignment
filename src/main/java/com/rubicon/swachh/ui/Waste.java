package com.rubicon.swachh.ui;

import com.rubicon.swachh.models.WasteData;
import com.rubicon.swachh.other.Validator;

import java.util.ArrayList;
import java.util.Scanner;

public class Waste {
    private WasteData wasteData;
    private ArrayList<WasteData> arrayWaste = new ArrayList<>();
    private Validator validator = new Validator();

    public Waste() throws Exception {
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; loop; i++) {
            wasteData = new WasteData();

            WasteType wasteType = new WasteType();
            WasteBrand brandType = new WasteBrand(wasteType.getTheTypeOfWaste());
            WasteWeight wasteWeight = new WasteWeight(wasteType.getTheTypeOfWaste(), brandType.getTypeOfBrand());

            wasteData.setWasteType(wasteType.getWasteTypeData());
            wasteData.setWasteBrandData(brandType.getWasteBrandData());
            wasteData.setWeight(wasteWeight.getWeight());

            arrayWaste.add(wasteData);

            System.out.print("\nDo you want to add more waste\n");
            System.out.print("Press Y or N");
            String input = String.valueOf(scanner.next().charAt(0));
            loop = validator.validateChoice(input);
        }
    }

    public ArrayList<WasteData> getArrayWasteData(){
        return arrayWaste;
    }

    public String getTypeofWaste(){
        return wasteData.getWasteTypeData().getTypeOfWaste();
    }
    public String getTypeofWasteBrand(){
        return wasteData.getWasteBrandData().getTypeOfWasteBrand();
    }

    public WasteData getWasteData() {
        return wasteData;
    }
}
