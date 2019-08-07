package com.rubicon.swachh.models;


public class ReportData {
    private UserData userData;
    private WasteData wasteData;
    private CouponData couponData;

    public ReportData() {
    }

    public ReportData(UserData userData) {
        this.userData = userData;
    }

    public ReportData(UserData userData, WasteData wasteData, CouponData couponData) {
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

    public WasteData getWasteData() {
        return wasteData;
    }

    public void setWasteData(WasteData wasteData) {
        this.wasteData = wasteData;
    }

    public CouponData getCouponData() {
        return couponData;
    }

    public void setCouponData(CouponData couponData) {
        this.couponData = couponData;
    }

    public String getReport() {
        return userData.toString() + wasteData.toString() + couponData.toString();
    }

}
