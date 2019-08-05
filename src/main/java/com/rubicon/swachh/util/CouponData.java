package com.rubicon.swachh.util;

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
}
