package com.rubicon.swachh.util;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class XMLHandlerTest {
    public static void main(String[] args) throws Exception {
        Document docUsers = XMLHandler.createDocument("Users");
        Element eleUsers = docUsers.getDocumentElement();

        Element eleUser = XMLHandler.createChild(eleUsers,"User");
        Element eleUserName = XMLHandler.createChild(eleUser,"Name");
        Element eleUserAge = XMLHandler.createChild(eleUser,"Age");

        eleUserName.setTextContent("Ashfaq");
        eleUserAge.setTextContent("21");
        
        XMLHandler.write2File(eleUsers,"Test.xml");
    }
}
