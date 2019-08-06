package com.rubicon.swachh.models;


public class Report {
    private User user;
    private WastageType wastageType;
    private CouponData couponData;

    public Report() {
    }

    public Report(User user) {
        this.user = user;
    }

    public Report(WastageType wastageType) {
        this.wastageType = wastageType;
    }

    public Report(User user, WastageType wastageType) {
        this.user = user;
        this.wastageType = wastageType;
    }

    public Report(User user, WastageType wastageType, CouponData couponData) {
        this.user = user;
        this.wastageType = wastageType;
        this.couponData = couponData;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public WastageType getWastageType() {
        return wastageType;
    }

    public void setWastageType(WastageType wastageType) {
        this.wastageType = wastageType;
    }

    public CouponData getCouponData() {
        return couponData;
    }

    public void setCouponData(CouponData couponData) {
        this.couponData = couponData;
    }


    private String getUserData() {
        return user.toString();
    }

    public String getReport() {
        return getUserData() + getWasteData() + getCouponUserData();
    }

    private String getWasteData() {
        return wastageType.toString();
    }

    private String getCouponUserData(){
        return couponData.toString();
    }




}
