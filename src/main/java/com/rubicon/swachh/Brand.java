package com.rubicon.swachh;

import com.rubicon.swachh.models.BrandType;
import com.rubicon.swachh.models.WastageType;

import java.util.Scanner;

public class Brand {

    private Scanner scanner = new Scanner(System.in);
    private BrandType brandType = new BrandType();

    BrandType generateBrandTypeForm(WastageType wastageType){
        System.out.println("Brand: ");
        if (!wastageType.getWastageType().equals("Default")){
            System.out.println("Please, provide the brand of the "+ wastageType.getWastageType() + "if known, else select the other option");

            System.out.println("\t1. Spirte");
            System.out.println("\t2. Coke");
            System.out.println("\t3. Thumbs Up");
            System.out.println("\t4. Other");

            System.out.println("Enter the respective number for the brand: ");


        }



        return brandType;
    }
}
