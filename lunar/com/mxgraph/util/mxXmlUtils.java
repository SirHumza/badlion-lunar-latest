package com.mxgraph.util;

import java.io.StringReader;
import java.io.StringWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;

public class mxXmlUtils {
   private static final Logger log = Logger.getLogger(mxXmlUtils.class.getName());
   private static DocumentBuilderFactory documentBuilderFactory = null;

   public static DocumentBuilder getDocumentBuilder() {
      if (documentBuilderFactory == null) {
         documentBuilderFactory = DocumentBuilderFactory.newInstance();
         documentBuilderFactory.setExpandEntityReferences(false);
         documentBuilderFactory.setXIncludeAware(false);
         documentBuilderFactory.setValidating(false);

         try {
            documentBuilderFactory.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", false);
            documentBuilderFactory.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            documentBuilderFactory.setFeature("http://xml.org/sax/features/external-general-entities", false);
         } catch (ParserConfigurationException var2) {
            log.log(Level.SEVERE, "Failed to set feature", var2);
         }
      }

      try {
         return documentBuilderFactory.newDocumentBuilder();
      } catch (Exception var1) {
         log.log(Level.SEVERE, "Failed to construct a document builder", var1);
         return null;
      }
   }

   public static Document parseXml(String var0) {
      try {
         return getDocumentBuilder().parse(new InputSource(new StringReader(var0)));
      } catch (Exception var2) {
         log.log(Level.SEVERE, "Failed to parse XML", var2);
         return null;
      }
   }

   public static String getXml(Node var0) {
      try {
         Transformer var1 = TransformerFactory.newInstance().newTransformer();
         var1.setOutputProperty("omit-xml-declaration", "yes");
         var1.setOutputProperty("encoding", "UTF-8");
         StreamResult var2 = new StreamResult(new StringWriter());
         var1.transform(new DOMSource(var0), var2);
         return var2.getWriter().toString();
      } catch (Exception var3) {
         log.log(Level.SEVERE, "Failed to convert XML object to string", var3);
         return "";
      }
   }
}
