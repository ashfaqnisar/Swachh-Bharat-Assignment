package com.rubicon.swachh.util;

public class XMLHandlerMain  {
    public static void main(String[] args) throws Exception {
        XMLHandlerTest test = new XMLHandlerTest();
        test.createNewUser("Ashfaq", "5");
        test.createNewUser("Arif", "10");
        test.createNewUser("Vamshi", "11");

        test.fetchTheUserAge("Ashfaq");
    }
}
