package com.rubicon.swachh.ui;

import com.rubicon.swachh.models.WasteBrandData;

import java.util.Scanner;

class WasteBrand {

    private Scanner scanner = new Scanner(System.in);
    private WasteBrandData wasteBrandData = new WasteBrandData();

    WasteBrandData generateBrandTypeForm(String wastageType) {
        if (!wastageType.equals("Default")) {
            System.out.println("Please, provide the brand of the " + wastageType + " if known, " +
                    "else select" +
                    " the other option");

            System.out.println("\t1. Spirte");
            System.out.println("\t2. Coke");
            System.out.println("\t3. Diet Coke");
            System.out.println("\t4. Thumbs Up");
            System.out.println("\t5. Other");

            int switch_case = scanner.nextInt();

            switch (switch_case) {
                case 1:
                    System.out.println("Sprite Brand has been selected.\n");
                    wasteBrandData.setSpriteBrand(true);
                    break;
                case 2:
                    System.out.println("Coke Brand has been selected.\n");
                    wasteBrandData.setCokeBrand(true);
                    break;
                case 3:
                    System.out.println("Diet Coke Brand has been selected.\n");
                    wasteBrandData.setDietCokeBrand(true);
                    break;
                case 4:
                    System.out.println("ThumbsUp Brand has been selected.\n");
                    wasteBrandData.setThumbsUpBrand(true);
                    break;
                case 5:
                    System.out.println("Other Brand has been selected.\n");
                    wasteBrandData.setOtherBrand(true);
                    break;
                default:
                    System.out.println("Please, select the correct option.\n");
                    break;
            }
        }
        return wasteBrandData;
    }
}
