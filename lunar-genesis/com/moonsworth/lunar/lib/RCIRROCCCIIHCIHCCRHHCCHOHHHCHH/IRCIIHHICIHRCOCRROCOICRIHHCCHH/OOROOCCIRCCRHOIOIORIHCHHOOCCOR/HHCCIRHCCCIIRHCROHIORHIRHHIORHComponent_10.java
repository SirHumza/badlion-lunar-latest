package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;

import java.util.Arrays;

public final class HRCHROOHRIHCRCRHRIIROCIRHOIRHH extends HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   private final int IHHIIIRCIOOOICIRHCRIIHRCOIOHCR;
   private final int IHRCCICIIORIIRHHCIHORCCOOOCIOI;
   private final int IOIHCRRRHORCHHCORRIIOOOOCRRIRC;
   private final int IIRICRORHHIOCOHOIROCOCORRCOORR;
   private final int HIHCIIOHROHRHOHOIRHCCHIRCOIICR;
   private final int[] HIICICCHOCOCIIHIOIICROHHCCRCRO;

   HRCHROOHRIHCRCRHRIIROCIRHOIRHH(String var1, int var2, int var3, int var4, int var5, int var6, int[] var7, int var8) {
      super(var1, var2);
      this.IHHIIIRCIOOOICIRHCRIIHRCOIOHCR = var3;
      this.IHRCCICIIORIIRHHCIHORCCOOOCIOI = var4;
      this.IOIHCRRRHORCHHCORRIIOOOOCRRIRC = var5;
      this.IIRICRORHHIOCOHOIROCOCORRCOORR = var6;
      this.HIICICCHOCOCIIHIOIICROHHCCRCRO = var7;
      this.HIHCIIOHROHRHOHOIRHCCHIRCOIICR = var8;
   }

   public static HRCHROOHRIHCRCRHRIIROCIRHOIRHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var0, int var1, int[] var2, int var3) {
      if (var3 < 4) {
         throw new IllegalArgumentException();
      }

      int var4 = var2[0];
      int var5 = var2[1];
      int var6 = var2[2];
      int var7 = var2[3];
      int var8 = var3 - 4;
      int[] var9;
      if (var8 > 0) {
         var9 = Arrays.copyOfRange(var2, 4, var3);
      } else {
         var9 = null;
      }

      return new HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var0, var1, var4, var5, var6, var7, var9, var3);
   }

   @Override
   public boolean CHRCCRRRRHRCCIICIHRCCOOIRIICRO(int var1) {
      return false;
   }

   @Override
   public boolean RRCROCCRIOIROHCCRCCIORICOCIOHC(int var1, int var2) {
      return false;
   }

   @Override
   public boolean IIIIRHIHROIRCROHHROIHIIHRCRRHO(int var1, int var2, int var3) {
      return false;
   }

   @Override
   public boolean HRCHROOHRIHCRCRHRIIROCIRHOIRHH(int[] var1, int var2) {
      if (var2 != this.HIHCIIOHROHRHOHOIRHCCHIRCOIICR) {
         return false;
      }

      if (var1[0] != this.IHHIIIRCIOOOICIRHCRIIHRCOIOHCR) {
         return false;
      }

      if (var1[1] != this.IHRCCICIIORIIRHHCIHORCCOOOCIOI) {
         return false;
      }

      if (var1[2] != this.IOIHCRRRHORCHHCORRIIOOOOCRRIRC) {
         return false;
      }

      if (var1[3] != this.IIRICRORHHIOCOHOIROCOCORRCOORR) {
         return false;
      }

      switch (var2) {
         case 8:
            if (var1[7] != this.HIICICCHOCOCIIHIOIICROHHCCRCRO[3]) {
               return false;
            }
         case 7:
            if (var1[6] != this.HIICICCHOCOCIIHIOIICROHHCCRCRO[2]) {
               return false;
            }
         case 6:
            if (var1[5] != this.HIICICCHOCOCIIHIOIICROHHCCRCRO[1]) {
               return false;
            }
         case 5:
            if (var1[4] != this.HIICICCHOCOCIIHIOIICROHHCCRCRO[0]) {
               return false;
            }
         case 4:
            return true;
         default:
            return this.RHCHRCOCCOIIIHCHRHIRCORHRHRICR(var1);
      }
   }

   private final boolean RHCHRCOCCOIIIHCHRHIRCORHRHRICR(int[] var1) {
      int var2 = this.HIHCIIOHROHRHOHOIRHCCHIRCOIICR - 4;

      for (int var3 = 0; var3 < var2; var3++) {
         if (var1[var3 + 4] != this.HIICICCHOCOCIIHIOIICROHHCCRCRO[var3]) {
            return false;
         }
      }

      return true;
   }
}
