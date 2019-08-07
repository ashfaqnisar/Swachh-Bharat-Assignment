package com.rubicon.swachh.other;

import com.rubicon.swachh.models.ReportData;
import com.rubicon.swachh.models.UserData;
import com.thoughtworks.xstream.XStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Saver {

    private LocalDateTime localDateTime = LocalDateTime.now();
    private DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("hh_mm_ss");
    private XStream xStream = new XStream();


    public void storeTheUser(UserData user) {//TODO: create the same function with  other to make the code efficient
        String userXML = xStream.toXML(user);

        File path = new File("src/main/data/users");
        if (!path.exists()) {
            path.mkdirs();
        }

        File userXMLPath = new File(path + "/" + user.getName() + ".xml");
        FileOutputStream fileOutputStream = null;

        System.out.print(path + "/" + user.getName() + ".xml");
        try {
            fileOutputStream = new FileOutputStream(userXMLPath);
            fileOutputStream.write("<?xml version=\"1.0\"?>\n".getBytes(StandardCharsets.UTF_8));

            byte[] bytes = userXML.getBytes(StandardCharsets.UTF_8);
            fileOutputStream.write(bytes);


        } catch (Exception error) {
            System.err.println("Error in storing the user: " + error.getMessage());
        } finally {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void storeTheReport(String reportXML, ReportData reportData) {
        FileOutputStream fileOutputStream = null;

        File path = new File("src/main/data/reports/" +
                localDateTime.getYear() + "/" +
                localDateTime.getMonth() + "/" +
                localDateTime.getDayOfMonth());
        if (!path.exists()) {
            path.mkdirs();
        }

        String time = localDateTime.format(dateTimeFormatter);

        String reportName = "/Report_" + reportData.getUserData().getName() +
                "_" + time + ".xml";
        try {
            fileOutputStream = new FileOutputStream(path + reportName, false);

            fileOutputStream.write("<?xml version=\"1.0\"?>\n".getBytes(StandardCharsets.UTF_8));

            byte[] bytes = reportXML.getBytes(StandardCharsets.UTF_8);
            fileOutputStream.write(bytes);
            
        } catch (Exception e) {
            System.err.println("Error in storing the report: " + e.getMessage());
        } finally {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
