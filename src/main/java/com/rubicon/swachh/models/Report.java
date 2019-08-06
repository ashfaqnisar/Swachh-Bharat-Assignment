package com.rubicon.swachh.models;


public class Report {
    private User user;
    private Waste waste;
    private CouponData couponData;

    public Report() {
    }

    public Report(User user) {
        this.user = user;
    }

    public Report(User user, Waste waste, CouponData couponData) {
        this.user = user;
        this.waste = waste;
        this.couponData = couponData;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Waste getWaste() {
        return waste;
    }

    public void setWaste(Waste waste) {
        this.waste = waste;
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

    private String getWasteData() {
        return waste.toString();
    }


    private String getCouponUserData() {
        return couponData.toString();
    }

    public String getReport() {
        return getUserData() + getWasteData() + getCouponUserData();
    }

}
