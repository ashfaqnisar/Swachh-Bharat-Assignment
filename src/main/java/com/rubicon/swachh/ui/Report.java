package com.rubicon.swachh.ui;

import com.rubicon.swachh.models.CouponData;
import com.rubicon.swachh.models.ReportData;
import com.rubicon.swachh.models.UserData;
import com.rubicon.swachh.models.WasteData;
import com.rubicon.swachh.other.OutputGenerator;
import com.rubicon.swachh.other.Saver;

import java.util.ArrayList;

public class Report {
    private ReportData reportData;
    private OutputGenerator outputGenerator = new OutputGenerator();

    public ReportData getReportData() {
        return reportData;
    }

    public void setReportData(ReportData reportData) {
        this.reportData = reportData;
    }

    public Report(UserData userData, ArrayList<WasteData> arrayWasteData, CouponData couponData) {
        reportData = new ReportData(userData,arrayWasteData,couponData);
    }

    public void printReport(){
        outputGenerator.createHeader("Swachh Bharat Kiosk");
        outputGenerator.printTheReport(reportData);
        outputGenerator.createFooter();
    }

    public void saveReport() throws Exception {
        Saver saver = new Saver();
        saver.storeTheReport(reportData);
    }
}
