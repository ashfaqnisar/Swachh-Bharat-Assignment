package com.rubicon.swachh;

import com.rubicon.swachh.models.Report;
import com.thoughtworks.xstream.XStream;

public class App
{
    public static void main(String[] args)
    {
        Register register = new Register();
        Wastage wastage = new Wastage();
        Coupon coupon = new Coupon();

        Report report = new Report();

        XStream xstream = new XStream();

        report.setUser(register.generateRegistrationForm());
        report.setWastageType(wastage.generateWastageForm());
        report.setCouponData(coupon.generateCouponCode());

        String XML = xstream.toXML(report);

        System.out.println(report.getReport());
        System.out.println(XML);


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
