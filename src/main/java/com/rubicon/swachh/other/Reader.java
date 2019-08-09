package com.rubicon.swachh.other;

import com.rubicon.swachh.util.XMLHandler;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class Reader {
    private Document docWeightCoupon;
    private Element eleWasteWeight;

    public Reader() throws Exception {
        String wasteWeightFile = "src/main/data/WasteWeight.xml";
        docWeightCoupon = XMLHandler.createFromFileOrUrl(wasteWeightFile);
        eleWasteWeight = docWeightCoupon.getDocumentElement();
    }

    public int getWeightFromFile(String typeOfWaste, String typeOfWasteBrand){
        Element eleWasteType = XMLHandler.getChildElement(eleWasteWeight,typeOfWaste);
        Element eleWasteBrand = XMLHandler.getChildElement(eleWasteType,typeOfWasteBrand);

        Element eleWeight = XMLHandler.getChildElement(eleWasteBrand,"Weight");

        return Integer.parseInt(eleWeight.getTextContent());
    }

    public int getPointsFromFile(String typeOfWaste, String typeOfWasteBrand){
        Element eleWasteType = XMLHandler.getChildElement(eleWasteWeight,typeOfWaste);
        Element eleWasteBrand = XMLHandler.getChildElement(eleWasteType,typeOfWasteBrand);

//        Element eleCouponPoints = XMLHandler.getChildElement(eleWasteBrand,"Points");

        return 40;
    }



}
