package com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import lombok.Generated;

public final class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   private static final String ORHRCRCOOHIHOCCRHRHIIHHOHOIIHO = "lunar";
   private static final int CRCORHCRHHICCIIROOORHRHCRRIIOI = 10;
   private static final int OOCCIOOOOHCCIOHHIOIOCOHOCHOHHC = 99;

   public static com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH RRCRRCORICCHOHHIRCHIROOHIIOHCO(
      IIRHCHHOICHRICOOCRORCCIOOIHOIR var0
   ) {
      if (var0 != null && !var0.bridge$isEmpty()) {
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION
               < 22
            ? var0.bridge$getTagCompound()
            : RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var0);
         return var1 != null && var1.bridge$contains("lunar", 10) ? var1.bridge$getCompoundTag("lunar") : null;
      } else {
         return null;
      }
   }

   public static String RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var0, String var1, String var2
   ) {
      String var3 = var0.bridge$getString(var1);
      return var3.isEmpty() ? var0.bridge$getString(var2) : var3;
   }

   public static boolean IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var0, String var1, String var2
   ) {
      return var0.bridge$getBoolean(var1) || var0.bridge$getBoolean(var2);
   }

   public static boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var0, String var1
   ) {
      return var0.bridge$contains(var1, 99);
   }

   private static com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
      IIRHCHHOICHRICOOCRORCCIOOIHOIR var0
   ) {
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1 = var0.bridge$getDataComponent(
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRCHCROCHRROHROOCCHIHIOCHOICOC
      );
      return var1 != null ? var1.bridge$getData() : null;
   }

   @Generated
   private IRCIIHHICIHRCOCRROCOICRIHHCCHH() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
