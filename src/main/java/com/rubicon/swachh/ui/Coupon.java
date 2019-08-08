package com.rubicon.swachh.ui;

import com.rubicon.swachh.models.CouponData;

import java.security.SecureRandom;
import java.util.Random;

public class Coupon {
    private CouponData couponData = new CouponData();

    public Coupon() {
        char[] chars = "abcdefghijklmnopqrstuvwxyz1234567890".toCharArray();
        StringBuilder sb = new StringBuilder();
        Random random = new SecureRandom();
        for (int i = 0; i < 7; i++) {
            char c = chars[random.nextInt(chars.length)];
            sb.append(c);
        }
        couponData.setCouponCode(sb.toString());
    }

    public CouponData getCouponData() {
        return couponData;
    }

}
