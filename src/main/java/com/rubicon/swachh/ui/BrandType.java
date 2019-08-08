package com.rubicon.swachh.ui;

import com.rubicon.swachh.models.BrandTypeData;

import java.util.Scanner;

class BrandType {

    private Scanner scanner = new Scanner(System.in);
    private BrandTypeData brandTypeData = new BrandTypeData();

    BrandTypeData generateBrandTypeForm(String wastageType) {
        if (!wastageType.equals("Default")) {
            System.out.println("Please, provide the brand of the " + wastageType + " if known, " +
                    "else select" +
                    " the other option");

            System.out.println("\t1. Spirte");
            System.out.println("\t2. Coke");
            System.out.println("\t3. Diet Coke");
            System.out.println("\t4. Thumbs Up");
            System.out.println("\t5. Other");

            System.out.println("Enter the respective number for the brand: ");
            int switch_case = scanner.nextInt();

            switch (switch_case) {
                case 1:
                    System.out.println("Sprite Brand has been selected.\n");
                    brandTypeData.setSpriteBrand(true);
                    break;
                case 2:
                    System.out.println("Coke Brand has been selected.\n");
                    brandTypeData.setCokeBrand(true);
                    break;
                case 3:
                    System.out.println("Diet Coke Brand has been selected.\n");
                    brandTypeData.setDietCokeBrand(true);
                    break;
                case 4:
                    System.out.println("ThumbsUp Brand has been selected.\n");
                    brandTypeData.setThumbsUpBrand(true);
                    break;
                case 5:
                    System.out.println("Other Brand has been selected.\n");
                    brandTypeData.setOtherBrand(true);
                    break;
                default:
                    System.out.println("Please, select the correct option.\n");
                    break;
            }
        }
        return brandTypeData;
    }
}
