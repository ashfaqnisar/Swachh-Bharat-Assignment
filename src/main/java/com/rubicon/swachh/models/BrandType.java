package com.rubicon.swachh.models;

import com.rubicon.swachh.util.Brands;

public class BrandType {
    private String brandName;
    private int brandCost;
    private Brands brands = new Brands();

    public BrandType() {
    }

    public BrandType(String brandName, int brandCost) {
        this.brandName = brandName;
        this.brandCost = brandCost;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
        checkForBrand();
    }

    private void checkForBrand() {

    }

    public int getBrandCost() {
        return brandCost;
    }

    public void setBrandCost(int brandCost) {
        this.brandCost = brandCost;
    }

}
