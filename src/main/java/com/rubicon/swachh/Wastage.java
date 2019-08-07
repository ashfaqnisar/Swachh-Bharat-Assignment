package com.rubicon.swachh;

import com.rubicon.swachh.models.WasteTypeData;

import java.util.Scanner;

public class Wastage {
    private Scanner scanner = new Scanner(System.in);
    private WasteTypeData wasteTypeData = new WasteTypeData();

    WasteTypeData generateWastageForm() {
        System.out.println("Type of the WasteData: ");
        System.out.println("Please select the type of wastage, which you will be depositing in " +
                "the Kiosk");
        System.out.println("\t1. Glass");
        System.out.println("\t2. Plastic");
        System.out.println("\t3. Metal");

        int switch_case = scanner.nextInt();
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
        return wasteTypeData;
    }
}
