package com.rubicon.swachh.util;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import java.util.List;

public class XMLHandlerTest {
    private Document docUsers = XMLHandler.createDocument("Users");
    private Element eleUsers = docUsers.getDocumentElement();

    public void createNewUser(String userName, String userAge) throws Exception {
        Element eleUser = XMLHandler.createChild(eleUsers, "User");
        Element eleUserName = XMLHandler.createChild(eleUser, "Name");
        Element eleUserAge = XMLHandler.createChild(eleUser, "Age");

        eleUserName.setTextContent(userName);
        eleUserAge.setTextContent(userAge);

        XMLHandler.write2File(eleUsers, "Test.xml");
    }
    public void fetchTheUserAge(String userName) throws Exception {
        Document docUsers = XMLHandler.createFromFileOrUrl("Test.xml");
        Element eleUsers = docUsers.getDocumentElement();

        List listUsers = XMLHandler.getChildrenList(eleUsers);

        for (Object objectUser : listUsers) {
            Element eleUser = (Element) objectUser;
            Element eleUserName = XMLHandler.getChildElement(eleUser, "Name");
            if (eleUserName.getTextContent().equals(userName)){
                System.out.print(userName+"'s, age is "+XMLHandler.getChildElement(eleUser,"Age").getTextContent());
            }
        }
    }
}