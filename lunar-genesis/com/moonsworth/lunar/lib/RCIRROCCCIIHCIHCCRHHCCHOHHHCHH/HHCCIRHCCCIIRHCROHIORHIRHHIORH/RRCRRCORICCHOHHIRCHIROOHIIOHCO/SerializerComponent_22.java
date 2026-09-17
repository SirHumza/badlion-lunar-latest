package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;

import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR;
import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CIOHHCORHRCCRICCCORIHCRHCCCRRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HCHRIROHHHCORIOCROOCHRCIOROOCI;
import java.io.StringWriter;
import java.lang.reflect.Type;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Node;

public class CRRRICCRROCOHHOHIICIHORCOORRRH extends HCHRIROHHHCORIOCROOCHRCIOROOCI<Node> {
   protected final TransformerFactory CORRCRCOHOORRCHOOHCIOCIHCCRIIO;

   public CRRRICCRROCOHHOHIICIHORCOORRRH() {
      super(Node.class);

      try {
         this.CORRCRCOHOORRCHOOHCIOCIHCCRIIO = TransformerFactory.newInstance();
         this.CORRCRCOHOORRCHOOHCIOCIHCCRIIO.setFeature("http://javax.xml.XMLConstants/feature/secure-processing", true);
         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.CORRCRCOHOORRCHOOHCIOCIHCCRIIO, "http://javax.xml.XMLConstants/property/accessExternalDTD", "");
         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.CORRCRCOHOORRCHOOHCIOCIHCCRIIO, "http://javax.xml.XMLConstants/property/accessExternalStylesheet", "");
      } catch (Exception var2) {
         throw new IllegalStateException("Could not instantiate `TransformerFactory`: " + var2.getMessage(), var2);
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      Node var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO var2,
      RCIROOOOICRHCCRRCIORHHIRCOIIIC var3
   ) {
      try {
         Transformer var4 = this.CORRCRCOHOORRCHOOHCIOCIHCCRIIO.newTransformer();
         var4.setOutputProperty("omit-xml-declaration", "yes");
         var4.setOutputProperty("indent", "no");
         StreamResult var5 = new StreamResult(new StringWriter());
         var4.transform(new DOMSource(var1), var5);
         var2.writeString(var5.getWriter().toString());
      } catch (TransformerConfigurationException var6) {
         throw new IllegalStateException("Could not create XML Transformer for writing DOM `Node` value: " + var6.getMessage(), var6);
      } catch (TransformerException var7) {
         var3.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var7, "DOM `Node` value serialization failed: %s", var7.getMessage());
      }
   }

   @Deprecated
   @Override
   public IIRHCHHOICHRICOOCRORCCIOOIHOIR getSchema(RCIROOOOICRHCCRRCIORHHIRCOIIIC var1, Type var2) {
      return this.createSchemaNode("string", true);
   }

   @Override
   public void acceptJsonFormatVisitor(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI var2
   ) {
      if (var1 != null) {
         var1.OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(var2);
      }
   }

   private static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(TransformerFactory var0, String var1, Object var2) {
      try {
         var0.setAttribute(var1, var2);
      } catch (Exception var4) {
         System.err.println("[DOMSerializer] Failed to set TransformerFactory attribute: " + var1);
      }
   }
}
