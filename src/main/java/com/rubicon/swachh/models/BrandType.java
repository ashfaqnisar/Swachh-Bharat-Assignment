package com.rubicon.swachh.models;


import java.util.HashMap;
import java.util.Map;

public class BrandType {
    private boolean SpriteBrand = false;
    private boolean CokeBrand = false;
    private boolean DietCokeBrand = false;
    private boolean ThumbsUpBrand = false;
    private boolean OtherBrand = false;

    private String brandName = "";
    private int brandCost = 0;

    private Map<String,Integer> brands= new HashMap<>();

    public boolean isSpriteBrand() {
        return SpriteBrand;
    }

    public void setSpriteBrand(boolean spriteBrand) {
        SpriteBrand = spriteBrand;
        setBrandName("Sprite");
        setBrandCost(20);
    }

    public boolean isCokeBrand() {
        return CokeBrand;
    }

    public void setCokeBrand(boolean cokeBrand) {
        CokeBrand = cokeBrand;
        setBrandName("Coke");
        setBrandCost(10);
    }

    public boolean isDietCokeBrand() {
        return DietCokeBrand;
    }

    public void setDietCokeBrand(boolean dietCokeBrand) {
        DietCokeBrand = dietCokeBrand;
        setBrandName("Diet Coke");
        setBrandCost(25);
    }

    public boolean isThumbsUpBrand() {
        return ThumbsUpBrand;
    }

    public void setThumbsUpBrand(boolean thumbsUpBrand) {
        ThumbsUpBrand = thumbsUpBrand;
        setBrandName("Thumbs Up");
        setBrandCost(15);
    }

    public boolean isOtherBrand() {
        return OtherBrand;
    }

    public void setOtherBrand(boolean otherBrand) {
        OtherBrand = otherBrand;
        setBrandName("Other");
        setBrandCost(15);
    }

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
    }


    public int getBrandCost() {
        return brandCost;
    }

    public void setBrandCost(int brandCost) {
        this.brandCost = brandCost;
    }

    @Override
    public String toString() {
        return "BrandType{" +
                "SpriteBrand=" + SpriteBrand +
                ", CokeBrand=" + CokeBrand +
                ", DietCokeBrand=" + DietCokeBrand +
                ", ThumbsUpBrand=" + ThumbsUpBrand +
                ", OtherBrand=" + OtherBrand +
                ", brandName='" + brandName + '\'' +
                ", brandCost=" + brandCost +
                '}';
    }

}
