package com.rubicon.swachh.ui;

import com.rubicon.swachh.models.WasteData;

import java.util.Scanner;

public class Waste {
    private WasteData wasteData;

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

            System.out.print("\nDo you want to add more waste\n");
            System.out.print("Press Y or N");
            String input = String.valueOf(scanner.next().charAt(0));
            while (!(input.equals("Y") || input.equals("N") || input.equals("y") || input.equals("n"))){
                System.out.println("Enter the valid input!");
                input = String.valueOf(scanner.next().charAt(0));
            }
            if (input.equals("N")||input.equals("n")){
                loop =false;
            }
        }
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
