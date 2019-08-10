package com.rubicon.swachh.ui;

import com.rubicon.swachh.models.WasteBrandData;
import com.rubicon.swachh.other.Validator;

import java.util.Scanner;

class WasteBrand {

    private Scanner scanner = new Scanner(System.in);
    private WasteBrandData wasteBrandData = new WasteBrandData();
    private Validator validator =new Validator();

    WasteBrand(String typeOfWaste){
        if (!typeOfWaste.equals("Default")) {
            System.out.println("Please, provide the brand of the " + typeOfWaste + " if known, " +
                    "else select" +
                    " the other option");

            System.out.println("\t1. Spirte");
            System.out.println("\t2. Coke");
            System.out.println("\t3. Diet Coke");
            System.out.println("\t4. Thumbs Up");
            System.out.println("\t5. Other");

            int switch_case = validator.validateBrandInput(scanner.next().trim());

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
        }else{
            wasteBrandData.setOtherBrand(true);
        }
    }



    WasteBrandData getWasteBrandData() {
        return wasteBrandData;
    }

    public String getTypeOfBrand() {
        return wasteBrandData.getTypeOfWasteBrand();
    }
}
