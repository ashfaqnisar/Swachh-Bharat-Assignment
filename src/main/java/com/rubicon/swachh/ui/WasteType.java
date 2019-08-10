package com.rubicon.swachh.ui;

import com.rubicon.swachh.models.WasteTypeData;
import com.rubicon.swachh.other.Validator;

import java.util.Scanner;

class WasteType {
    private WasteTypeData wasteTypeData = new WasteTypeData();
    private Validator validator = new Validator();

    WasteType() {
        System.out.println("\nPlease select the type of wastage, which you will be depositing in " +
                "the Kiosk");
        System.out.println("\t1. Glass");
        System.out.println("\t2. Plastic");
        System.out.println("\t3. Metal");
        System.out.print("Enter Option: ");


        Scanner scanner = new Scanner(System.in);
        int switch_case = validator.validateTypeInput(scanner.next().trim());
        switch (switch_case) {
            case 1:
                System.out.println("Glass has been selected.\n");
                wasteTypeData.setGlass(true);
                break;
            case 2:
                System.out.println("Plastic has been selected.\n");
                wasteTypeData.setPlastic(true);
                break;
            case 3:
                System.out.println("Metal has been selected.\n");
                wasteTypeData.setMetal(true);
                break;
            default:
                System.out.println("Please select the correct option.\n");
                break;
        }
    }


    String getTheTypeOfWaste() {
        if (wasteTypeData.isGlass()) {
            return "Glass";
        } else if (wasteTypeData.isMetal()) {
            return "Metal";
        } else if (wasteTypeData.isPlastic()) {
            return "Plastic";
        }
        return "Unknown";
    }

    WasteTypeData getWasteTypeData() {
        return wasteTypeData;
    }
}
