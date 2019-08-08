package com.rubicon.swachh.other;

import com.rubicon.swachh.models.ReportData;
import com.rubicon.swachh.models.UserData;
import com.rubicon.swachh.util.XMLHandler;
import com.thoughtworks.xstream.XStream;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

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

    private Document docUser = XMLHandler.createDocument("User");

    public Saver() {
        xStream.allowTypesByWildcard(new String[]{"com.rubicon.swachh.**"});//to remove the
        xStream.alias("user", UserData.class);
        xStream.alias("report", ReportData.class);
    }

    public void storeTheUser(UserData userData) throws Exception {

        String userFilePath = "src/main/data/users/";
        String userFileName = userData.getName().toLowerCase().trim().replaceAll("\\s+", "_") + ".xml";

        String usersXMLFilePath = userFilePath + userFileName;

        Element eleUser = docUser.getDocumentElement();
        Element eleUserName = XMLHandler.createChild(eleUser, "Name");
        Element eleUserEmail = XMLHandler.createChild(eleUser, "Email");
        Element eleUserNumber = XMLHandler.createChild(eleUser, "Number");
        Element eleUserAddress = XMLHandler.createChild(eleUser, "Address");


        eleUserName.setTextContent(userData.getName());
        eleUserEmail.setTextContent(userData.getEmail());
        eleUserNumber.setTextContent(String.valueOf(userData.getNumber()));
        eleUserAddress.setTextContent(userData.getAddress());


        XMLHandler.write2File(eleUser, usersXMLFilePath);

    }


    public void storeTheReport(ReportData reportData) {
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
        File reportXMLFile = new File(path + reportFileName);

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
