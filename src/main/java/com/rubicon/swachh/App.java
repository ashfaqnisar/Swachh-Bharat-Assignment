package com.rubicon.swachh;

import com.rubicon.swachh.models.ReportData;
import com.rubicon.swachh.models.WasteData;
import com.rubicon.swachh.other.Saver;


public class App {//TODO:  Optimize the code to easily understand it.
    public static void main(String[] args){

        Register register = new Register();

        WasteData wasteData = new WasteData();
        Wastage wastage = new Wastage();
        Brand brand = new Brand();

        Coupon coupon = new Coupon();

        ReportData reportData = new ReportData();

        Saver saver = new Saver();

        // warning during the execution.

        reportData.setUserData(register.generateRegistrationForm());
        wasteData.setWasteType(wastage.generateWastageForm());
        wasteData.setBrandTypeData(brand.generateBrandTypeForm(wasteData.getWasteTypeData().getWastageType()));

        reportData.setWasteData(wasteData);
        reportData.setCouponData(coupon.generateCouponCode());


        System.out.println(reportData.getReport());

        saver.storeTheReport(reportData);

    }
}
