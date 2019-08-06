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

    public String getCouponUserData(){
        return "\nCoupon: \t\t" + couponData.getCouponCode();
    }

    public String getUserData() {
        return "\nUser Information: " + "\n\t" +
                "Name: " + user.getName() + "\n\t\t" +
                user.getAddress() + "\n\t\t" +
                user.getEmail() + "\n\t\t" +
                user.getNumber();
    }

    public String getReport() {
        return getUserData() + getWasteData() + getCouponUserData();
    }

    public String getWasteData() {
        return "\nWastage Data: \n" +
                "\tGlass: " + wastageType.isGlass() + "\n" +
                "\tPlastic: " + wastageType.isPlastic() + "\n" +
                "\tMetal: " + wastageType.isMetal();
    }




}
