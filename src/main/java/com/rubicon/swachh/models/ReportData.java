package com.rubicon.swachh.models;

import java.util.ArrayList;

public class ReportData {
    private UserData userData;
    private ArrayList<WasteData> wasteData;
    private CouponData couponData;

    public ReportData(UserData userData, ArrayList<WasteData> wasteData, CouponData couponData) {
        this.userData = userData;
        this.wasteData = wasteData;
        this.couponData = couponData;
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


    public void printTheReport(){
        System.out.print(userData.toString());
        for (WasteData data:wasteData){
            System.out.println( data.getWasteTypeData().toString()+data.getWasteBrandData().toString());
        }
        System.out.print(couponData.toString());
    }
}
