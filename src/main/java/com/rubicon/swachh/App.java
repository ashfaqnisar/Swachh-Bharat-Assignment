package com.rubicon.swachh;


import com.rubicon.swachh.ui.Coupon;
import com.rubicon.swachh.ui.Register;
import com.rubicon.swachh.ui.Report;
import com.rubicon.swachh.ui.Waste;


public class App {

    public static void main(String[] args) throws Exception {


        Register register = new Register();

        Waste waste = new Waste();

        Coupon coupon = new Coupon();

        Report report = new Report(register.getUserData(),waste.getArrayWasteData(),
                coupon.getCouponData());

        report.printReport();
        report.saveReport();




//
//        for (int i=0;i<91;i++){
//            System.out.print("_");
//        }
    }
}
