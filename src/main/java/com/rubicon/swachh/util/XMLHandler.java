package com.rubicon.swachh.util;

import com.sun.org.apache.xml.internal.serialize.OutputFormat;
import com.sun.org.apache.xml.internal.serialize.XMLSerializer;
import org.w3c.dom.Element;

import java.io.FileWriter;
import java.io.Writer;

public class XMLHandler {

    private static boolean isVoid(String str) {
        return (str == null) || (str.trim().length() == 0);
    }

    private static boolean isVoid(Object obj) {
        if (obj == null)
            return true;
        if ((obj instanceof String)) {
            return ((String) obj).trim().length() == 0;
        }
        return false;
    }

    public static Element createChild(Element parentElement, String childName) {
        Element child = null;
        if ((parentElement != null) && (!isVoid(childName))) {
            child = parentElement.getOwnerDocument().createElement(childName);
            parentElement.appendChild(child);

        }
        return child;
    }



    public static void write2File(Element element, String fileName) throws Exception {
        if (!isVoid(fileName)) {
            FileWriter sw = new FileWriter(fileName);
            writeXml(element, sw, true);

        }
    }
    private static boolean writeXml(Element element, Writer writer, boolean closeWriter) {

        try {

            if ((element != null) && (writer != null)) {
                OutputFormat formatter = new OutputFormat();
                formatter.setEncoding("UTF-8");
                formatter.setIndenting(true);
                XMLSerializer serializer = new XMLSerializer(writer, formatter);
                serializer.serialize(element);
                writer.flush();

            }

            if ((writer != null) && (closeWriter)) {
                writer.close();

            }
            return true;

        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
        return false;

    }
}
