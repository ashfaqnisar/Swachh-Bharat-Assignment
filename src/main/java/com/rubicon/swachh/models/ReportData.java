package com.rubicon.swachh.models;

import java.util.ArrayList;

public class ReportData {
    private UserData userData;
    private ArrayList<WasteData> wasteData;
    private CouponData couponData;
    private int totalWeight;
    private int totalCouponPoints;

    public ReportData(UserData userData, ArrayList<WasteData> wasteData, CouponData couponData) {
        this.userData = userData;
        this.wasteData = wasteData;
        this.couponData = couponData;
        setTotalWeightAndCouponPoints();
    }

    public UserData getUserData() {
        return userData;
    }

    public void setUserData(UserData userData) {
        this.userData = userData;
    }

    public ArrayList<WasteData> getArrayWasteData() {
        return wasteData;
    }

    public void setWasteData(ArrayList<WasteData> wasteData) {
        this.wasteData = wasteData;
    }

    public CouponData getCouponData() {
        return couponData;
    }

    public void setCouponData(CouponData couponData) {
        this.couponData = couponData;
    }

    private void setTotalWeightAndCouponPoints() {
        for (WasteData data:wasteData){
            totalWeight+=(data.getWeight());
            totalCouponPoints+=(data.getPoints());
        }
    }


    public int getTotalCouponPoints() {
        return totalCouponPoints ;
    }

    public int getTotalWeight() {
        return totalWeight;
    }

}
