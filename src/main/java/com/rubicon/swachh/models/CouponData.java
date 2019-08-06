package com.rubicon.swachh.models;

public class CouponData {
    private String CouponCode;

    public CouponData(){
    }

    public CouponData(String couponCode) {
        CouponCode = couponCode;
    }

    public String getCouponCode() {
        return CouponCode;
    }

    public void setCouponCode(String couponCode) {
        CouponCode = couponCode;
    }

    @Override
    public String toString() {
        return "\nCoupon Code: " + getCouponCode() + "\n\n";
    }
}
