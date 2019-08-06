package com.rubicon.swachh;

import com.rubicon.swachh.models.Report;
import com.rubicon.swachh.models.Waste;
import com.rubicon.swachh.models.WasteType;

import com.rubicon.swachh.other.Saver;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StandardStaxDriver;

import java.io.IOException;


public class App {
    public static void main(String[] args) throws IOException {
//
        Register register = new Register();

        Waste waste = new Waste();
        Wastage wastage = new Wastage();
        Brand brand = new Brand();

        Coupon coupon = new Coupon();

        Report report = new Report();

        Saver saver = new Saver();

        XStream xstream = new XStream();
        xstream.allowTypesByWildcard(new String[] {"com.rubicon.swachh.**" });//to remove the
        // warning during the execution.

        report.setUser(register.generateRegistrationForm());
        WasteType wasteType = waste.setWasteType(wastage.generateWastageForm());
        waste.setBrandType(brand.generateBrandTypeForm(wasteType.getWastageType()));

        report.setWaste(waste);
        report.setCouponData(coupon.generateCouponCode());

        String reportXML = xstream.toXML(report);

        System.out.println(report.getReport());

        saver.storeTheReport(reportXML,report);



//        System.out.println(user2.getName());
//        System.out.println(user2.getEmail());
//        System.out.println(user2.getAddress());
//        System.out.println(user2.getNumber());
//
//        System.out.println(wastageType.isGlass());
//        System.out.println(wastageType.isPlastic());
//        System.out.println(wastageType.isMetal());
    }
}
