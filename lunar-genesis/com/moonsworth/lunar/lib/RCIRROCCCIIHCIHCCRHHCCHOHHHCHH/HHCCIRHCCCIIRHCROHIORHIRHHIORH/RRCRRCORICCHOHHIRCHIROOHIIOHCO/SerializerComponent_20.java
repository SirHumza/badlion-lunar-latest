package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;

import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CIOHHCORHRCCRICCCORIHCRHCCCRRR;
import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR;
import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OHHRIOHROOIHOROCIRHCHORIHRRRRI;
import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IIRHCHHOICHRICOOCRORCCIOOIHOIR;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   static final DatatypeFactory CCOHRRCRCICICRCRICRHHCCHRIIIII;
   protected static final int OHCCRIOCROIHOOCOICRROOHCOCHCIC = 1;
   protected static final int CRHIHIIIIRIHROICIRHORIIOCIIRIH = 2;
   protected static final int CRRCOHIHHCCOROCCRIOCOORRRHIIIO = 3;

   @Override
   public CIOHHCORHRCCRICCCORIHCRHCCCRRR<?> findBeanDeserializer(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var2,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var3
   ) {
      Class var4 = var1.RRICIOOORRIORHHICIRCIOCHRHRCHH();
      if (var4 == QName.class) {
         return new com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var4, 3
         );
      } else if (var4 == XMLGregorianCalendar.class) {
         return new com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var4, 2
         );
      } else {
         return var4 == Duration.class
            ? new com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               var4, 1
            )
            : null;
      }
   }

   @Override
   public boolean HHCCIRHCCCIIRHCROHIORHIRHHIORH(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1, Class<?> var2
   ) {
      return var2 == QName.class || var2 == XMLGregorianCalendar.class || var2 == Duration.class;
   }

   static {
      try {
         CCOHRRCRCICICRCRICRHHCCHRIIIII = DatatypeFactory.newInstance();
      } catch (DatatypeConfigurationException var1) {
         throw new RuntimeException(var1);
      }
   }

   public static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends IIRHCHHOICHRICOOCRORCCIOOIHOIR<Object> {
      private static final long IHOORIIHOHCROHHRHHRHOCHRROOROI = 1L;
      protected final int IOOIIICORRCCIRICHIHHRRCCCCHORO;

      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Class<?> var1, int var2) {
         super(var1);
         this.IOOIIICORRCCIRICHIHHRRCCCCHORO = var2;
      }

      @Override
      public Object deserialize(
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2
      ) {
         return this.IOOIIICORRCCIRICHIHHRRCCCCHORO == 2
               && var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI.VALUE_NUMBER_INT
               )
            ? this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, this._parseDate(var1, var2))
            : super.deserialize(var1, var2);
      }

      @Override
      protected Object IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         String var1, com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2
      ) {
         switch (this.IOOIIICORRCCIRICHIHHRRCCCCHORO) {
            case 1:
               return com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCOHRRCRCICICRCRICRHHCCHRIIIII
                  .newDuration(var1);
            case 2:
               Date var3;
               try {
                  var3 = this._parseDate(var1, var2);
               } catch (IHHCHHHCRIHOOCOIOOCRIIICIOROIR var5) {
                  return com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCOHRRCRCICICRCRICRHHCCHRIIIII
                     .newXMLGregorianCalendar(var1);
               }

               return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var3);
            case 3:
               return QName.valueOf(var1);
            default:
               throw new IllegalStateException();
         }
      }

      protected XMLGregorianCalendar RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1, Date var2
      ) {
         if (var2 == null) {
            return null;
         }

         GregorianCalendar var3 = new GregorianCalendar();
         var3.setTime(var2);
         TimeZone var4 = var1.getTimeZone();
         if (var4 != null) {
            var3.setTimeZone(var4);
         }

         return com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCOHRRCRCICICRCRICRHHCCHRIIIII
            .newXMLGregorianCalendar(var3);
      }
   }
}
