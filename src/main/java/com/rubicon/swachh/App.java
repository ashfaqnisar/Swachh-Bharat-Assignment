package com.rubicon.swachh;

import com.rubicon.swachh.models.ReportData;
import com.rubicon.swachh.other.Saver;
import com.rubicon.swachh.ui.Coupon;
import com.rubicon.swachh.ui.Register;
import com.rubicon.swachh.ui.Waste;


public class App {

    public static void main(String[] args) throws Exception {

        Register register = new Register();

        Waste waste = new Waste();

        Coupon coupon = new Coupon();

        ReportData reportData = new ReportData(register.getUserData(), waste.getWastageData(), coupon.getCouponData());

        System.out.println(reportData.toString());

        Saver saver = new Saver();
        saver.storeTheReport(reportData);

    }
}
