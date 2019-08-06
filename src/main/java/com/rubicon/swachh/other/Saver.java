package com.rubicon.swachh.other;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Saver {

    public void saveTheData(String xml){
        FileOutputStream fileOutputStream = null;

        try {
            fileOutputStream = new FileOutputStream("hello.xml");
            fileOutputStream.write("<?xml version=\"1.0\"?>".getBytes(StandardCharsets.UTF_8));

            byte[] bytes = xml.getBytes(StandardCharsets.UTF_8);
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
