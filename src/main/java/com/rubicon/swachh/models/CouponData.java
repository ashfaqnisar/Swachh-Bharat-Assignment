package com.rubicon.swachh.models;

public class CouponData {
    private String couponCode;
    private int couponPoints;
    public CouponData() {
    }

    public CouponData(String couponCode) {
        this.couponCode = couponCode;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }


    public void setCouponPoints(int couponPoints) {
        this.couponPoints = couponPoints;
    }

    public int getCouponPoints(){
        return couponPoints;
    }


    @Override
    public String toString() {
        return "\nCoupon Code:   " + getCouponCode()+"\n"+
                "\nCoupon Points: "+ couponPoints+" points";
    }
}
