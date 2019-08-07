package com.rubicon.swachh;

import com.rubicon.swachh.models.ReportData;
import com.rubicon.swachh.models.WasteData;
import com.rubicon.swachh.models.WasteTypeData;
import com.rubicon.swachh.other.Saver;
import com.thoughtworks.xstream.XStream;


public class App {//TODO:  Optimize the code to easily understand it.
    public static void main(String[] args){

        Register register = new Register();

        WasteData wasteData = new WasteData();
        Wastage wastage = new Wastage();
        Brand brand = new Brand();

        Coupon coupon = new Coupon();

        ReportData reportData = new ReportData();

        Saver saver = new Saver();

        XStream xstream = new XStream();
        xstream.allowTypesByWildcard(new String[] {"com.rubicon.swachh.**" });//to remove the
        // warning during the execution.

        reportData.setUserData(register.generateRegistrationForm());
        WasteTypeData wasteTypeData = wasteData.setWasteType(wastage.generateWastageForm());
        wasteData.setBrandTypeData(brand.generateBrandTypeForm(wasteTypeData.getWastageType()));

        reportData.setWasteData(wasteData);
        reportData.setCouponData(coupon.generateCouponCode());

        String reportXML = xstream.toXML(reportData);

        System.out.println(reportData.getReport());

        saver.storeTheReport(reportXML, reportData);

    }
}
