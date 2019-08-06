package com.rubicon.swachh.models;

public class CouponData {
    private String couponCode;

    public CouponData(){
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

    @Override
    public String toString() {
        return "\nCoupon Code: " + getCouponCode() + "\n\n";
    }
}
