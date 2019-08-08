package com.rubicon.swachh.ui;

import com.rubicon.swachh.models.CouponData;
import com.rubicon.swachh.other.Reader;

import java.security.SecureRandom;
import java.util.Random;

public class Coupon {
    private CouponData couponData = new CouponData();
    private Reader reader = new Reader();

    public Coupon(String typeOfWaste, String typeOfWasteBrand) throws Exception {
        String code = generateCouponCode();
        couponData.setCouponCode(code);

        int points = reader.getPointsFromFile(typeOfWaste.trim().replaceAll(" ",""),
                typeOfWasteBrand.trim().replaceAll(" ",""));
        couponData.setCouponPoints(points);
    }

    private String generateCouponCode() {
        char[] chars = "abcdefghijklmnopqrstuvwxyz1234567890".toCharArray();
        StringBuilder code = new StringBuilder();
        Random random = new SecureRandom();
        for (int i = 0; i < 7; i++) {
            char c = chars[random.nextInt(chars.length)];
            code.append(c);
        }
        return code.toString();
    }

    public CouponData getCouponData() {
        return couponData;
    }

}
