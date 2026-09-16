package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI;

import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH;
import java.util.Arrays;
import java.util.Comparator;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
public final class IRRCCOICORICIHCHRHIHIHROIRHOCR {
   public static final byte ORIHCCHROHOOCIOOOOICRHICHHIIOO = 64;

   private IRRCCOICORICIHCHRHIHIHROIRHOCR() {
   }

   public static byte checkedCast(long var0) {
      byte var2 = (byte)var0;
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(var2 == var0, "Out of range: %s", var0);
      return var2;
   }

   public static byte saturatedCast(long var0) {
      if (var0 > 127L) {
         return 127;
      } else {
         return var0 < -128L ? -128 : (byte)var0;
      }
   }

   public static int compare(byte var0, byte var1) {
      return var0 - var1;
   }

   public static byte min(byte... var0) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(var0.length > 0);
      byte var1 = var0[0];

      for (int var2 = 1; var2 < var0.length; var2++) {
         if (var0[var2] < var1) {
            var1 = var0[var2];
         }
      }

      return var1;
   }

   public static byte max(byte... var0) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(var0.length > 0);
      byte var1 = var0[0];

      for (int var2 = 1; var2 < var0.length; var2++) {
         if (var0[var2] > var1) {
            var1 = var0[var2];
         }
      }

      return var1;
   }

   public static String join(String var0, byte... var1) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var0);
      if (var1.length == 0) {
         return "";
      }

      StringBuilder var2 = new StringBuilder(var1.length * 5);
      var2.append(var1[0]);

      for (int var3 = 1; var3 < var1.length; var3++) {
         var2.append(var0).append(var1[var3]);
      }

      return var2.toString();
   }

   public static Comparator<byte[]> lexicographicalComparator() {
      return IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.INSTANCE;
   }

   public static void sortDescending(byte[] var0) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var0);
      sortDescending(var0, 0, var0.length);
   }

   public static void sortDescending(byte[] var0, int var1, int var2) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var0);
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkPositionIndexes(var1, var2, var0.length);
      Arrays.sort(var0, var1, var2);
      IRCIIHHICIHRCOCRROCOICRIHHCCHH.reverse(var0, var1, var2);
   }

   private enum RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements Comparator<byte[]> {
      INSTANCE;

      public int compare(byte[] var1, byte[] var2) {
         int var3 = Math.min(var1.length, var2.length);

         for (int var4 = 0; var4 < var3; var4++) {
            int var5 = IRRCCOICORICIHCHRHIHIHROIRHOCR.compare(var1[var4], var2[var4]);
            if (var5 != 0) {
               return var5;
            }
         }

         return var1.length - var2.length;
      }

      @Override
      public String toString() {
         return "SignedBytes.lexicographicalComparator()";
      }
   }
}
