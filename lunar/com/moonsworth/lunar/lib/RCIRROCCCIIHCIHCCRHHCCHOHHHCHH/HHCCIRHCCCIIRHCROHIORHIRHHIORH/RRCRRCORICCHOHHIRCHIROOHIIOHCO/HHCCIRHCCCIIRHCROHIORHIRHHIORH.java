package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;

import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IIRHCHHOICHRICOOCRORCCIOOIHOIR;
import java.io.StringReader;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;

public abstract class HHCCIRHCCCIIRHCROHIORHIRHHIORH<T> extends IIRHCHHOICHRICOOCRORCCIOOIHOIR<T> {
   private static final long IROOIIHHICCHCHICCCHOHCCCHCOIOC = 1L;
   private static final DocumentBuilderFactory RIRIIIRRHCICHICCHHIIROICICIOHC;

   protected HHCCIRHCCCIIRHCROHIORHIRHHIORH(Class<T> var1) {
      super(var1);
   }

   @Override
   public abstract T IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      String var1, com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2
   );

   protected final Document RHHHRIIROORRIHCHRHCOCOCIHRCCIC(String var1) {
      try {
         return this.RHCCRRCCOROOCHHCIHIICHOCICCIRR().parse(new InputSource(new StringReader(var1)));
      } catch (Exception var3) {
         throw new IllegalArgumentException("Failed to parse JSON String as XML: " + var3.getMessage(), var3);
      }
   }

   protected DocumentBuilder RHCCRRCCOROOCHHCIHIICHOCICCIRR() {
      return RIRIIIRRHCICHICCHHIIROICICIOHC.newDocumentBuilder();
   }

   static {
      DocumentBuilderFactory var0 = DocumentBuilderFactory.newInstance();
      var0.setNamespaceAware(true);
      var0.setExpandEntityReferences(false);

      try {
         var0.setFeature("http://javax.xml.XMLConstants/feature/secure-processing", true);
      } catch (ParserConfigurationException var4) {
      }

      try {
         var0.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
      } catch (Exception var3) {
      }

      try {
         var0.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", false);
      } catch (Exception var2) {
      }

      RIRIIIRRHCICHICCHHIIROICICIOHC = var0;
   }

   public static class IRCIIHHICIHRCOCRROCOICRIHHCCHH
      extends com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH<Node> {
      private static final long RCRCCRHCCHRORHCRHRIOHRRHHIIORC = 1L;

      public IRCIIHHICIHRCOCRROCOICRIHHCCHH() {
         super(Node.class);
      }

      public Node OOROOCCIRCCRHOIOIORIHCHHOOCCOR(
         String var1, com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2
      ) {
         return this.RHHHRIIROORRIHCHRHCOCOCIHRCCIC(var1);
      }
   }

   public static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
      extends com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH<Document> {
      private static final long ROCRRCCRIHHRIOIRHRHCOOOOOCROHC = 1L;

      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
         super(Document.class);
      }

      public Document HRCHROOHRIHCRCRHRIIROCIRHOIRHH(
         String var1, com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2
      ) {
         return this.RHHHRIIROORRIHCHRHCOCOCIHRCCIC(var1);
      }
   }
}
