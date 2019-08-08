package com.rubicon.swachh;

import com.rubicon.swachh.models.ReportData;
import com.rubicon.swachh.other.Saver;


public class App { //TODO:  Optimize the code to easily understand it.

    public static void main(String[] args) throws Exception {

        Register register = new Register();

        Waste waste = new Waste();

        Coupon coupon = new Coupon();

        ReportData reportData = new ReportData(register.getUserData(),waste.getWasteData(),coupon.getCouponCode());

        Saver saver = new Saver();


        System.out.println(reportData.getReport());

        saver.storeTheReport(reportData);

    }
}
