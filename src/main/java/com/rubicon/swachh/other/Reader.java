package com.rubicon.swachh.other;

import com.rubicon.swachh.util.XMLHandler;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class Reader {
    private Document docWeightCoupon;
    private Element eleCoupon;

    public Reader() throws Exception {
        String couponFile = "src/main/data/Coupon.xml";
        docWeightCoupon = XMLHandler.createFromFileOrUrl(couponFile);
        eleCoupon = docWeightCoupon.getDocumentElement();
    }

    public int getWeightFromFile(String typeOfWaste, String typeOfWasteBrand){
        Element eleWasteType = XMLHandler.getChildElement(eleCoupon,typeOfWaste);
        Element eleWasteBrand = XMLHandler.getChildElement(eleWasteType,typeOfWasteBrand);

        Element eleWeight = XMLHandler.getChildElement(eleWasteBrand,"Weight");

        return Integer.parseInt(eleWeight.getTextContent());
    }

    public int getPointsFromFile(String typeOfWaste, String typeOfWasteBrand){
        Element eleWasteType = XMLHandler.getChildElement(eleCoupon,typeOfWaste);
        Element eleWasteBrand = XMLHandler.getChildElement(eleWasteType,typeOfWasteBrand);

        Element eleCouponPoints = XMLHandler.getChildElement(eleWasteBrand,"Points");

        return Integer.parseInt(eleCouponPoints.getTextContent());
    }



}
