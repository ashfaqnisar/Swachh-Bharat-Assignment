package com.rubicon.swachh.other;

import com.rubicon.swachh.models.Report;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Saver {

    private LocalDateTime localDateTime = LocalDateTime.now();
    private DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("hh_mm_ss");


    public void storeTheUser(String user){
        FileOutputStream fileOutputStream = null;

        try {
            fileOutputStream = new FileOutputStream("src/main/data/data.xml");
            fileOutputStream.write("<?xml version=\"1.0\"?>\n".getBytes(StandardCharsets.UTF_8));

            byte[] bytes = user.getBytes(StandardCharsets.UTF_8);
            fileOutputStream.write(bytes);
            System.out.println("File written successful");

        } catch (Exception e){
            System.err.println("Error in XML Write: " + e.getMessage());
        }
        finally {
            if (fileOutputStream != null){
                try{
                    fileOutputStream.close();
                }catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public void storeTheReport(String reportXML, Report report) {
        FileOutputStream fileOutputStream = null;

        String path = "src/main/data/reports/" +
                localDateTime.getYear()+"/"+
                localDateTime.getMonth()+"/"+
                localDateTime.getDayOfMonth()+"/";

        String time = localDateTime.format(dateTimeFormatter);

        try {
            fileOutputStream = new FileOutputStream( path+"Report_"+
                                    report.getUser().getName()+
                                    "_" + time + ".xml",false);

            fileOutputStream.write("<?xml version=\"1.0\"?>\n".getBytes(StandardCharsets.UTF_8));

            byte[] bytes = reportXML.getBytes(StandardCharsets.UTF_8);
            fileOutputStream.write(bytes);
            System.out.println("File written successful");

        } catch (Exception e){
            System.err.println("Error in XML Write: " + e.getMessage());
        }
        finally {
            if (fileOutputStream != null){
                try{
                    fileOutputStream.close();
                }catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
