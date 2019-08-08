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
    private DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH_mm_ss_dd_mm_yyyy_");
    private XStream xStream = new XStream();

    public Saver(){
        xStream.allowTypesByWildcard(new String[] {"com.rubicon.swachh.**" });//to remove the
        xStream.alias("user",UserData.class);
        xStream.alias("report",ReportData.class);
    }


    public void storeTheUser(UserData user) {//TODO: create the same function with  other to make the code efficient
        String userXMLString = xStream.toXML(user);

        File path = new File("src/main/data/users");
        if (!path.exists()) {
            path.mkdirs();
        }
        String userFileName = user.getName().toLowerCase().trim().replaceAll("\\s+","_")+".xml";

        File userXMLFile = new File(path + "/" + userFileName);
        FileOutputStream fileOutputStream = null;

        try {
            fileOutputStream = new FileOutputStream(userXMLFile,false);
            fileOutputStream.write("<?xml version=\"1.0\"?>\n".getBytes(StandardCharsets.UTF_8));

            byte[] bytes = userXMLString.getBytes(StandardCharsets.UTF_8);
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

    public void storeTheReport( ReportData reportData) {
        String reportXMLString = xStream.toXML(reportData);

        FileOutputStream fileOutputStream = null;

        File path = new File("src/main/data/reports/");
        if (!path.exists()) {
            path.mkdirs();
        }

        String time = localDateTime.format(dateTimeFormatter);
        String reportFileName = "/report_" +
                        reportData.getUserData().getName().toLowerCase()
                        .trim().replaceAll("\\s+", "_") +
                        "_" + time + ".xml";
        File reportXMLFile = new File(path+reportFileName);

        try {
            fileOutputStream = new FileOutputStream(reportXMLFile, false);

            fileOutputStream.write("<?xml version=\"1.0\"?>\n".getBytes(StandardCharsets.UTF_8));

            byte[] bytes = reportXMLString.getBytes(StandardCharsets.UTF_8);
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
