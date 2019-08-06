package com.rubicon.swachh.other;

import com.rubicon.swachh.models.Report;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import java.security.acl.LastOwnerException;
import java.sql.Timestamp;
import java.time.Instant;

import java.time.LocalDate;

public class Saver {

    private Timestamp timestamp = new Timestamp(System.currentTimeMillis());
    private LocalDate localDate = LocalDate.now();

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
    public void storeTheReport(String reportXML, Report report){
        FileOutputStream fileOutputStream = null;

        System.out.println(localDate.getYear());//Returns Int
        System.out.println(localDate.getMonth());// Returns String
        System.out.println(localDate.getDayOfMonth());//Returns Int



        try {
            fileOutputStream = new FileOutputStream("src/main/data/reports/"+
                            "Report." + report.getUser().getName()+"."+timestamp.getTime()+".xml");
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
