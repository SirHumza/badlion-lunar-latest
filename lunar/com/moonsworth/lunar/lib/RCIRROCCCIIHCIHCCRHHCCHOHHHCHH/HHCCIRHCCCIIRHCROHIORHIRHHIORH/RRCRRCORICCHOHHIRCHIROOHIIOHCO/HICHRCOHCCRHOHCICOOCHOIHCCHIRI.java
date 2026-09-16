package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;

import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CIOHHCORHRCCRICCCORIHCRHCCCRRR;
import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO;
import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR;
import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CIOHHCORHRCCRICCCORIHCRHCCCRRR.IRRCCOICORICIHCHRHIHIHROIRHOCR;
import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OHHRIOHROOIHOROCIRHCHORIHRRRRI;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class HICHRCOHCCRHOHCICOOCHOIHCCHIRI implements Serializable {
   private static final long COHOIROIIOHCICOICCHHOHOIIIROCO = 1L;
   private static final String IRRHORIIIRHRCRCOORHOROCRHHRHCO = "javax.xml.";
   private static final String IOOHOHIHORRIOOIHHIRCHOCCOICIRO = "com.moonsworth.lunar.lib.jackson.databind.ext.CoreXMLSerializers";
   private static final String RORCHRHCCOIHROOCHRCCHHRHCRROHH = "com.moonsworth.lunar.lib.jackson.databind.ext.CoreXMLDeserializers";
   private static final String ORRROIOCHRORRHROOHIOCCRRRIRRRI = "com.moonsworth.lunar.lib.jackson.databind.ext.DOMSerializer";
   private static final String CHCOOCHRRHRCIRICCRCOHOOICICHII = "com.moonsworth.lunar.lib.jackson.databind.ext.DOMDeserializer$DocumentDeserializer";
   private static final String CIRCRRRCHIICCOHOHROIRIHIOHHHHC = "com.moonsworth.lunar.lib.jackson.databind.ext.DOMDeserializer$NodeDeserializer";
   private static final Class<?> CIHRHHIIOIIRRIIIRHOCCROROHIHCH;
   private static final Class<?> IRORCOOROHIHCRRRORHOCIHCRCOIHI;
   private static final RRCRRCORICCHOHHIRCHIROOHIIOHCO IHRHROHIIOIOIIHCROCRROIHOOCORC;
   public static final HICHRCOHCCRHOHCICOOCHOIHCCHIRI ROOOOCHHHHOOHOHRRHIOOCCIORHHRO;
   private final Map<String, String> OIHHOIHHCIHCCIIOOOIRHHCHOOHOIC = new HashMap<>();
   private final Map<String, Object> ICHORCCCHRHRCOCCCHIOOOCRHROHIO;
   private static final String RHIICOICIICICHCOCRHRCIOCOIHRRI = "java.sql.Timestamp";
   private static final String IOCCCORCHCOHRCIIHOIRIHIRRHOHCI = "java.sql.Date";
   private static final String HOCRORIRRHCCIHIHHIROCHROOHCHCH = "java.sql.Time";
   private static final String IIOCCOCRRRHRHRICOORRHCRHICCORC = "java.sql.Blob";
   private static final String IHCRCHOCRHHOOOOOCHHOIIORCROCOR = "javax.sql.rowset.serial.SerialBlob";

   protected HICHRCOHCCRHOHCICOOCHOIHCCHIRI() {
      this.OIHHOIHHCIHCCIIOOOIRHHCHOOHOIC.put("java.sql.Date", "com.moonsworth.lunar.lib.jackson.databind.deser.std.DateDeserializers$SqlDateDeserializer");
      this.OIHHOIHHCIHCCIIOOOIRHHCHOOHOIC
         .put("java.sql.Timestamp", "com.moonsworth.lunar.lib.jackson.databind.deser.std.DateDeserializers$TimestampDeserializer");
      this.ICHORCCCHRHRCOCCCHIOOOCRHROHIO = new HashMap<>();
      this.ICHORCCCHRHRCOCCCHIOOOCRHROHIO
         .put(
            "java.sql.Timestamp",
            com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CIOHHCORHRCCRICCCORIHCRHCCCRRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.CIRHCICOHCRIORIIOIHRRIIORORHCR
         );
      this.ICHORCCCHRHRCOCCCHIOOOCRHROHIO.put("java.sql.Date", "com.moonsworth.lunar.lib.jackson.databind.ser.std.SqlDateSerializer");
      this.ICHORCCCHRHRCOCCCHIOOOCRHROHIO.put("java.sql.Time", "com.moonsworth.lunar.lib.jackson.databind.ser.std.SqlTimeSerializer");
      this.ICHORCCCHRHRCOCCCHIOOOCRHROHIO.put("java.sql.Blob", "com.moonsworth.lunar.lib.jackson.databind.ext.SqlBlobSerializer");
      this.ICHORCCCHRHRCOCCCHIOOOCRHROHIO.put("javax.sql.rowset.serial.SerialBlob", "com.moonsworth.lunar.lib.jackson.databind.ext.SqlBlobSerializer");
   }

   public RHOCHHIRRCHHHOHOIRROIROHHHIHIO<?> findSerializer(
      ROOCOCCCIRHHHIRIOIHHHHRHIICHHR var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI var2,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var3
   ) {
      Class var4 = var2.RRICIOOORRIORHHICIRCIOCHRHRCHH();
      if (this.CIOHHCORHRCCRICCCORIHCRHCCCRRR(var4, CIHRHHIIOIIRRIIIRHOCCROROHIHCH)) {
         return (RHOCHHIRRCHHHOHOIRROIROHHHIHIO<?>)this.IRCIIHHICIHRCOCRROCOICRIHHCCHH("com.moonsworth.lunar.lib.jackson.databind.ext.DOMSerializer", var2);
      }

      if (IHRHROHIIOIOIIHCROCRROIHOOCORC != null) {
         RHOCHHIRRCHHHOHOIRROIROHHHIHIO var5 = IHRHROHIIOIOIIHCROCRROIHOOCORC.HCIOIIHCHIHRHOHRICRIOCIRHRICOR(var4);
         if (var5 != null) {
            return var5;
         }
      }

      String var9 = var4.getName();
      Object var6 = this.ICHORCCCHRHRCOCCCHIOOOCRHROHIO.get(var9);
      if (var6 != null) {
         return var6 instanceof RHOCHHIRRCHHHOHOIRROIROHHHIHIO
            ? (RHOCHHIRRCHHHOHOIRROIROHHHIHIO)var6
            : (RHOCHHIRRCHHHOHOIRROIROHHHIHIO)this.IRCIIHHICIHRCOCRROCOICRIHHCCHH((String)var6, var2);
      }

      if (!var9.startsWith("javax.xml.") && !this.CORCOCICIRIOHROHROIIOOHICCHCRR(var4, "javax.xml.")) {
         return null;
      }

      String var7 = "com.moonsworth.lunar.lib.jackson.databind.ext.CoreXMLSerializers";
      Object var8 = this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var7, var2);
      return var8 == null ? null : ((IRRCCOICORICIHCHRHIHIHROIRHOCR)var8).findSerializer(var1, var2, var3);
   }

   public CIOHHCORHRCCRICCCORIHCRHCCCRRR<?> HHCCIRHCCCIIRHCROHIORHIRHHIORH(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var2,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var3
   ) {
      Class var4 = var1.RRICIOOORRIORHHICIRCIOCHRHRCHH();
      if (IHRHROHIIOIOIIHCROCRROIHOOCORC != null) {
         CIOHHCORHRCCRICCCORIHCRHCCCRRR var5 = IHRHROHIIOIOIIHCROCRROIHOOCORC.RCHOIICIHOCIRCIOORIOHRCRHOCRCR(var4);
         if (var5 != null) {
            return var5;
         }
      }

      if (this.CIOHHCORHRCCRICCCORIHCRHCCCRRR(var4, CIHRHHIIOIIRRIIIRHOCCROROHIHCH)) {
         return (CIOHHCORHRCCRICCCORIHCRHCCCRRR<?>)this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            "com.moonsworth.lunar.lib.jackson.databind.ext.DOMDeserializer$NodeDeserializer", var1
         );
      }

      if (this.CIOHHCORHRCCRICCCORIHCRHCCCRRR(var4, IRORCOOROHIHCRRRORHOCIHCRCOIHI)) {
         return (CIOHHCORHRCCRICCCORIHCRHCCCRRR<?>)this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            "com.moonsworth.lunar.lib.jackson.databind.ext.DOMDeserializer$DocumentDeserializer", var1
         );
      }

      String var9 = var4.getName();
      String var6 = this.OIHHOIHHCIHCCIIOOOIRHHCHOOHOIC.get(var9);
      if (var6 != null) {
         return (CIOHHCORHRCCRICCCORIHCRHCCCRRR<?>)this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var6, var1);
      }

      if (!var9.startsWith("javax.xml.") && !this.CORCOCICIRIOHROHROIIOOHICCHCRR(var4, "javax.xml.")) {
         return null;
      }

      String var7 = "com.moonsworth.lunar.lib.jackson.databind.ext.CoreXMLDeserializers";
      Object var8 = this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var7, var1);
      return var8 == null ? null : ((OHHRIOHROOIHOROCIRHCHORIHRRRRI)var8).findBeanDeserializer(var1, var2, var3);
   }

   public boolean IOROHHOIORHORCOHRHCCHCRHOCHCCI(Class<?> var1) {
      if (this.CIOHHCORHRCCRICCCORIHCRHCCCRRR(var1, CIHRHHIIOIIRRIIIRHOCCROROHIHCH)) {
         return true;
      }

      if (this.CIOHHCORHRCCRICCCORIHCRHCCCRRR(var1, IRORCOOROHIHCRRRORHOCIHCRCOIHI)) {
         return true;
      }

      String var2 = var1.getName();
      return !var2.startsWith("javax.xml.") && !this.CORCOCICIRIOHROHROIIOOHICCHCRR(var1, "javax.xml.")
         ? this.OIHHOIHHCIHCCIIOOOIRHHCHOOHOIC.containsKey(var2)
         : true;
   }

   private boolean CIOHHCORHRCCRICCCORIHCRHCCCRRR(Class<?> var1, Class<?> var2) {
      return var2 != null && var2.isAssignableFrom(var1);
   }

   private Object IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      String var1, com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI var2
   ) {
      try {
         return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Class.forName(var1), var2);
      } catch (Throwable var4) {
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.OCOHORHCROHICRRIHCIHHRRCIHICRI.IOIICIRIICICIIOORHCIIIIRRIHRHI(
            var4
         );
         throw new IllegalStateException(
            "Failed to find class `"
               + var1
               + "` for handling values of type "
               + com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RRORCOIRRIICOOICOIOCORHORCHCOC(
                  var2
               )
               + ", problem: ("
               + var4.getClass().getName()
               + ") "
               + var4.getMessage()
         );
      }
   }

   private Object RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      Class<?> var1, com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI var2
   ) {
      try {
         return com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
            var1, false
         );
      } catch (Throwable var4) {
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.OCOHORHCROHICRRIHCIHHRRCIHICRI.IOIICIRIICICIIOORHCIIIIRRIHRHI(
            var4
         );
         throw new IllegalStateException(
            "Failed to create instance of `"
               + var1.getName()
               + "` for handling values of type "
               + com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RRORCOIRRIICOOICOIOCORHORCHCOC(
                  var2
               )
               + ", problem: ("
               + var4.getClass().getName()
               + ") "
               + var4.getMessage()
         );
      }
   }

   private boolean CORCOCICIRIOHROHROIIOOHICCHCRR(Class<?> var1, String var2) {
      for (Class var3 = var1.getSuperclass(); var3 != null; var3 = var3.getSuperclass()) {
         if (var3 == Object.class) {
            return false;
         }

         if (var3.getName().startsWith(var2)) {
            return true;
         }
      }

      return false;
   }

   static {
      Class<Document> var0 = null;
      Class<Node> var1 = null;

      try {
         var1 = Node.class;
         var0 = Document.class;
      } catch (Throwable var4) {
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.OCOHORHCROHICRRIHCIHHRRCIHICRI.IOIICIRIICICIIOORHCIIIIRRIHRHI(
            var4
         );
      }

      CIHRHHIIOIIRRIIIRHOCCROROHIHCH = var1;
      IRORCOOROHIHCRRRORHOCIHCRCOIHI = var0;
      RRCRRCORICCHOHHIRCHIROOHIIOHCO var5 = null;

      try {
         var5 = RRCRRCORICCHOHHIRCHIROOHIIOHCO.ICOOCRCOICOHIOCORICCCCHCOCCOHO();
      } catch (Throwable var3) {
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.OCOHORHCROHICRRIHCIHHRRCIHICRI.IOIICIRIICICIIOORHCIIIIRRIHRHI(
            var3
         );
      }

      IHRHROHIIOIOIIHCROCRROIHOOCORC = var5;
      ROOOOCHHHHOOHOHRRHIOOCCIORHHRO = new HICHRCOHCCRHOHCICOOCHOIHCCHIRI();
   }
}
