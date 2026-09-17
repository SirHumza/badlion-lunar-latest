package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class RHOCHHIRRCHHHOHOIRROIROHHHIHIO implements Serializable {
   private static final long CHCIRCIRHORORCRHHOHIHCIOOIHHRO = 1L;
   protected final IIRHCHHOICHRICOOCRORCCIOOIHOIR OHOORRIIHIRCIOHHHCCRCCRHIIOOII;

   public RHOCHHIRRCHHHOHOIRROIROHHHIHIO(IIRHCHHOICHRICOOCRORCCIOOIHOIR var1) {
      this.OHOORRIIHIRCIOHHHCCRCCRHIIOOII = var1;
   }

   public RHOCHHIRRCHHHOHOIRROIROHHHIHIO HRCHROOHRIHCRCRHRIIROCIRHOIRHH(IIRHCHHOICHRICOOCRORCCIOOIHOIR var1) {
      return var1 == this.OHOORRIIHIRCIOHHHCCRCCRHIIOOII ? this : new RHOCHHIRRCHHHOHOIRROIROHHHIHIO(var1);
   }

   public com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI CCCHCRRRIRRHICOOIOCHCHRCRICHOC(
      String var1
   ) {
      RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = new RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.trim());
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI var3 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var2
      );
      if (var2.hasMoreTokens()) {
         throw this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, "Unexpected tokens after complete type");
      } else {
         return var3;
      }
   }

   protected com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1
   ) {
      if (!var1.hasMoreTokens()) {
         throw this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, "Unexpected end-of-string");
      }

      Class var2 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.nextToken(), var1);
      if (var1.hasMoreTokens()) {
         String var3 = var1.nextToken();
         if ("<".equals(var3)) {
            List var4 = this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1);
            IHHCHHHCRIHOOCOIOOCRIIICIOROIR var5 = IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var4);
            return this.OHOORRIIHIRCIOHHHCCRCCRHIIOOII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH((HHCCIRHCCCIIRHCROHIORHIRHHIORH)null, var2, var5);
         }

         var1.CCROCCHOCHCIRCIHROHHICIHIICROH(var3);
      }

      return this.OHOORRIIHIRCIOHHHCCRCCRHIIOOII
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH((HHCCIRHCCCIIRHCROHIORHIRHHIORH)null, var2, IHHCHHHCRIHOOCOIOOCRIIICIOROIR.OIRRROOOHCOOCIOIRICHIHCHRCHHIR());
   }

   protected List<com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI> IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1
   ) {
      ArrayList var2 = new ArrayList();

      while (var1.hasMoreTokens()) {
         var2.add(this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1));
         if (!var1.hasMoreTokens()) {
            break;
         }

         String var3 = var1.nextToken();
         if (">".equals(var3)) {
            return var2;
         }

         if (!",".equals(var3)) {
            throw this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, "Unexpected token '" + var3 + "', expected ',' or '>')");
         }
      }

      throw this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, "Unexpected end-of-string");
   }

   protected Class<?> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2) {
      try {
         return this.OHOORRIIHIRCIOHHHCCRCCRHIIOOII.findClass(var1);
      } catch (Exception var4) {
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RHOCHHIRRCHHHOHOIRROIROHHHIHIO(
            var4
         );
         throw this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, "Cannot locate class '" + var1 + "', problem: " + var4.getMessage());
      }
   }

   protected IllegalArgumentException RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1, String var2) {
      return new IllegalArgumentException(
         String.format("Failed to parse type '%s' (remaining: '%s'): %s", var1.IIRHIOOOCIHHHOICRCOIIRRCRHRRRC(), var1.OCCCIICOCCHCCCIHROHCHCIHRIOROH(), var2)
      );
   }

   static final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends StringTokenizer {
      protected final String OIRCRICRRIOCCHOCOHHIORHHOIRORR;
      protected int _index;
      protected String CIRIROOOOIHCHORHRORIOOHHROCRHI;

      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1) {
         super(var1, "<,>", true);
         this.OIRCRICRRIOCCHOCOHHIORHHOIRORR = var1;
      }

      @Override
      public boolean hasMoreTokens() {
         return this.CIRIROOOOIHCHORHRORIOOHHROCRHI != null || super.hasMoreTokens();
      }

      @Override
      public String nextToken() {
         String var1;
         if (this.CIRIROOOOIHCHORHRORIOOHHROCRHI != null) {
            var1 = this.CIRIROOOOIHCHORHRORIOOHHROCRHI;
            this.CIRIROOOOIHCHORHRORIOOHHROCRHI = null;
         } else {
            var1 = super.nextToken();
            this._index = this._index + var1.length();
            var1 = var1.trim();
         }

         return var1;
      }

      public void CCROCCHOCHCIRCIHROHHICIHIICROH(String var1) {
         this.CIRIROOOOIHCHORHRORIOOHHROCRHI = var1;
      }

      public String IIRHIOOOCIHHHOICRCOIIRRCRHRRRC() {
         return this.OIRCRICRRIOCCHOCOHHIORHHOIRORR;
      }

      public String OCCCIICOCCHCCCIHROHCHCIHRIOROH() {
         return this.OIRCRICRRIOCCHOCOHHIORHHOIRORR.substring(this._index);
      }
   }
}
