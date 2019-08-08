package com.rubicon.swachh.util;

import com.sun.org.apache.xml.internal.serialize.OutputFormat;
import com.sun.org.apache.xml.internal.serialize.XMLSerializer;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.FactoryConfigurationError;
import javax.xml.parsers.ParserConfigurationException;
import java.io.FileWriter;
import java.io.Writer;
import java.util.ArrayList;

public class XMLHandler {

    private static ArrayList<DocumentBuilder> docBuilderList = new ArrayList();


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
    public static Document createDocument(String rootElementName) {//TODO: Need to construct same function but with different parameters
        DocumentBuilder docBuild = null;
        Document doc = null;

        try {
            docBuild = getDocumentBuilder();
            doc = docBuild.newDocument();
            Element root = doc.createElement(rootElementName);
            doc.appendChild(root);
            return doc;

        } catch (ParserConfigurationException | FactoryConfigurationError e) {
            System.out.print(e.getMessage());

        } finally {
            releaseDocumentBuilder(docBuild);

        }
        return doc;

    }

    private static synchronized void releaseDocumentBuilder(DocumentBuilder docBuild) {
        if (docBuild != null) {
            docBuilderList.add(docBuild);

        }
    }

    public static synchronized DocumentBuilder getDocumentBuilder()
            throws ParserConfigurationException, FactoryConfigurationError {
        DocumentBuilder docBuilder = null;
        if (docBuilderList.size() > 0) {
            docBuilder = docBuilderList.remove(0);

        }
        if (docBuilder == null) {
            docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();

        }
        return docBuilder;

    }

}
