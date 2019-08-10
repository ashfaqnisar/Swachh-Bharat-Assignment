package com.rubicon.swachh.other;

import com.rubicon.swachh.models.ReportData;
import com.rubicon.swachh.models.UserData;
import com.rubicon.swachh.models.WasteData;
import com.rubicon.swachh.util.XMLHandler;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Saver {
    private LocalDateTime localDateTime = LocalDateTime.now();
    private DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH_mm_ss_dd_MM_yyyy");

    private Document docReport = XMLHandler.createDocument("Report");

    public Saver() {
    }

    public void storeTheUser(UserData userData) throws Exception {
        String userFilePath = "src/main/data/users/";
        /*String userFileName = userData.getName().toLowerCase().trim().replaceAll("\\s+", "_") +
                ".xml";*/
        String userFile = userFilePath + "Users.xml";


        Document docUsers = XMLHandler.createFromFileOrUrl(userFile);
        Element eleUsers=docUsers.getDocumentElement();

        Element eleUser = XMLHandler.createChild(eleUsers,"User");
        Element eleUserName = XMLHandler.createChild(eleUser, "Name");
        Element eleUserEmail = XMLHandler.createChild(eleUser, "Email");
        Element eleUserNumber = XMLHandler.createChild(eleUser, "Number");
        Element eleUserAddress = XMLHandler.createChild(eleUser, "Address");


        eleUserName.setTextContent(userData.getName());
        eleUserEmail.setTextContent(userData.getEmail());
        eleUserNumber.setTextContent(String.valueOf(userData.getNumber()));
        eleUserAddress.setTextContent(userData.getAddress());


        XMLHandler.write2File(docUsers, userFile);
    }


    public void storeTheReport(ReportData reportData) throws Exception {
        String time = localDateTime.format(dateTimeFormatter);
        String reportFilePath = "src/main/data/reports/";
        String reportFileName = "report_" + reportData.getUserData().getName().toLowerCase().trim().replaceAll(
                "\\s+", "_") + "_" + time + ".xml";

        String reportFile = reportFilePath + reportFileName;

        Element eleReport = docReport.getDocumentElement();

        Element eleUser = XMLHandler.createChild(eleReport, "User");
        Element eleUserName = XMLHandler.createChild(eleUser, "Name");
        Element eleUserEmail = XMLHandler.createChild(eleUser, "Email");
        Element eleUserNumber = XMLHandler.createChild(eleUser, "Number");
        Element eleUserAddress = XMLHandler.createChild(eleUser, "Address");

        eleUserName.setTextContent(reportData.getUserData().getName());
        eleUserEmail.setTextContent(reportData.getUserData().getEmail());
        eleUserNumber.setTextContent(String.valueOf(reportData.getUserData().getNumber()));
        eleUserAddress.setTextContent(reportData.getUserData().getAddress());

        Element eleWasteData = XMLHandler.createChild(eleReport,"WasteData");


        for (WasteData data:reportData.getArrayWasteData()){
            Element eleWaste = XMLHandler.createChild(eleWasteData, "Waste");
            Element eleWasteType = XMLHandler.createChild(eleWaste, "Type");
            Element eleWasteBrand = XMLHandler.createChild(eleWaste, "Brand");
            Element eleWasteWeight = XMLHandler.createChild(eleWaste, "Weight");
            Element elePoints = XMLHandler.createChild(eleWaste,"Points");

            eleWasteType.setTextContent(data.getWasteTypeData().getTypeOfWaste());

            eleWasteBrand.setTextContent(data.getWasteBrandData().getTypeOfWasteBrand());
            eleWasteWeight.setTextContent(String.valueOf(data.getWeight()));
            elePoints.setTextContent(String.valueOf(data.getPoints()));
        }
        Element eleTotalWeight = XMLHandler.createChild(eleWasteData,"TotalWeight");
        eleTotalWeight.setTextContent(String.valueOf(reportData.getTotalWeight()));

//        eleWasteType.setTextContent(reportData.getWasteTypeData().getTypeOfWaste());
//        eleWasteBrand.setTextContent(reportData.getWasteData().getWasteBrandData().getTypeOfWasteBrand());
//        eleWasteWeight.setTextContent(String.valueOf(reportData.getWasteData().getWeight()));

        Element eleCoupon = XMLHandler.createChild(eleReport, "Coupon");
        Element eleCouponCode = XMLHandler.createChild(eleCoupon, "CouponCode");
        Element eleCouponPoints = XMLHandler.createChild(eleCoupon, "TotalCouponPoints");

        eleCouponCode.setTextContent(reportData.getCouponData().getCouponCode());
        eleCouponPoints.setTextContent(String.valueOf(reportData.getTotalCouponPoints()));

        storeTheCoupon(reportData);
        XMLHandler.write2File(eleReport, reportFile);

    }
    private void storeTheCoupon(ReportData reportData) throws Exception {
        String couponFilePath = "src/main/data/";
        /*String userFileName = userData.getName().toLowerCase().trim().replaceAll("\\s+", "_") +
                ".xml";*/
        String couponFile = couponFilePath + "Coupon.xml";
        Document docCoupons = XMLHandler.createFromFileOrUrl(couponFile);
        Element eleCoupon = docCoupons.getDocumentElement();

        Element eleCouponData = XMLHandler.createChild(eleCoupon,"CouponData");
        Element eleCouponCode = XMLHandler.createChild(eleCouponData,"Code");
        Element eleCouponPoints = XMLHandler.createChild(eleCouponData,"Points");
        Element eleCouponEmail = XMLHandler.createChild(eleCouponData,"Email");
        Element eleCouponUsed = XMLHandler.createChild(eleCouponData,"CouponUsed");

        eleCouponCode.setTextContent(reportData.getCouponData().getCouponCode());
        eleCouponPoints.setTextContent(String.valueOf(reportData.getTotalCouponPoints()));
        eleCouponEmail.setTextContent(reportData.getUserData().getEmail());
        eleCouponUsed.setTextContent(String.valueOf(false));

        XMLHandler.write2File(docCoupons,couponFile);

    }
}
