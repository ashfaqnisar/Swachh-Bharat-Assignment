package com.rubicon.swachh;

import com.rubicon.swachh.util.WastageType;

import java.util.Scanner;

public class Wastage {
    private Scanner scanner = new Scanner(System.in);
    private WastageType wastageType = new WastageType();

    WastageType generateWastageForm() {
        System.out.println("Type of Wastage: ");
        System.out.println("Please, select the type of wastage. You would like to deposit in the " +
                "Kiosk");
        System.out.println("1. Glass");
        System.out.println("2. Plastic");
        System.out.println("3. Metal");

        int switch_case = scanner.nextInt();
        switch (switch_case) {
            case 1:
                wastageType.setGlass(true);
                break;
            case 2:
                wastageType.setPlastic(true);
                break;
            case 3:
                wastageType.setMetal(true);
                break;
            default:
                System.out.println("Please select the correct option");
                break;
        }
        return wastageType;
    }
}
