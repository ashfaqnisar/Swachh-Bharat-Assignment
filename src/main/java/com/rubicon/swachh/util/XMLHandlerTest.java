package com.rubicon.swachh.util;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import java.util.List;

public class XMLHandlerTest {
    public static void main(String[] args) throws Exception {
        /*Document docUsers = XMLHandler.createDocument("Users");
        Element eleUsers = docUsers.getDocumentElement();

        Element eleUser = XMLHandler.createChild(eleUsers,"User");
        Element eleUserName = XMLHandler.createChild(eleUser,"Name");
        Element eleUserAge = XMLHandler.createChild(eleUser,"Age");

        eleUserName.setTextContent("Ashfaq");
        eleUserAge.setTextContent("21");


        XMLHandler.write2File(eleUsers,"Test.xml");*/
        Document docUsers = XMLHandler.createFromFileOrUrl("Test.xml");
        Element eleUsers = docUsers.getDocumentElement();

        List listUsers = XMLHandler.getChildrenList(eleUsers);

        for (Object objectUser :listUsers) {
            Element eleUser = (Element) objectUser;
            Element eleUserName = XMLHandler.getChildElement(eleUser,"Name");
            System.out.print(eleUserName.getTextContent());
        }


    }
}
