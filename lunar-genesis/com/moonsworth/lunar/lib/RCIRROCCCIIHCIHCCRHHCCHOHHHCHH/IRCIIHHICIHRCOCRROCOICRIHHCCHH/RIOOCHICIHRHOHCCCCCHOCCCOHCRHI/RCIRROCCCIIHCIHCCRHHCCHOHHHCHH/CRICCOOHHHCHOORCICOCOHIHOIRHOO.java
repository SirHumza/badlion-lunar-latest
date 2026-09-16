package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import java.math.BigInteger;
import java.util.NavigableMap;
import java.util.TreeMap;
import java.util.Map.Entry;

class CRICCOOHHHCHOORCICOCOHIHOIRHOO {
   public static final BigInteger OHOROCOHIOOCCOHHCRRHROICCRROOI = BigInteger.valueOf(5L);
   static final BigInteger HCCHRRHCHOIHOHOOHIROROOCIOHCIR = BigInteger.valueOf(10000000000000000L);
   static final BigInteger OCRHIIHCHIHHCICCOOHOHHHRROHICC = BigInteger.valueOf(152587890625L);
   private static final BigInteger[] HORHHCHCRRCCHIHRRROIOICRHHIHHH = new BigInteger[]{
      BigInteger.ONE,
      BigInteger.TEN,
      BigInteger.valueOf(100L),
      BigInteger.valueOf(1000L),
      BigInteger.valueOf(10000L),
      BigInteger.valueOf(100000L),
      BigInteger.valueOf(1000000L),
      BigInteger.valueOf(10000000L),
      BigInteger.valueOf(100000000L),
      BigInteger.valueOf(1000000000L),
      BigInteger.valueOf(10000000000L),
      BigInteger.valueOf(100000000000L),
      BigInteger.valueOf(1000000000000L),
      BigInteger.valueOf(10000000000000L),
      BigInteger.valueOf(100000000000000L),
      BigInteger.valueOf(1000000000000000L)
   };

   private CRICCOOHHHCHOORCICOCOHIHOIRHOO() {
   }

   static BigInteger computePowerOfTen(NavigableMap<Integer, BigInteger> var0, int var1) {
      if (var1 < HORHHCHCRRCCHIHRRROIOICRHHIHHH.length) {
         return HORHHCHCRRCCHIHRRROIOICRHHIHHH[var1];
      } else if (var0 != null) {
         Entry var2 = var0.floorEntry(var1);
         Integer var3 = (Integer)var2.getKey();
         return var3 == var1
            ? (BigInteger)var2.getValue()
            : HICHRCOHCCRHOHCICOOCHOIHCCHIRI.multiply((BigInteger)var2.getValue(), computePowerOfTen(var0, var1 - var3));
      } else {
         return OHOROCOHIOOCCOHHCRRHROICCRROOI.pow(var1).shiftLeft(var1);
      }
   }

   static BigInteger computeTenRaisedByNFloor16Recursive(NavigableMap<Integer, BigInteger> var0, int var1) {
      var1 &= -16;
      Entry var2 = var0.floorEntry(var1);
      int var3 = (Integer)var2.getKey();
      BigInteger var4 = (BigInteger)var2.getValue();
      if (var3 == var1) {
         return var4;
      }

      int var5 = var1 - var3;
      BigInteger var6 = (BigInteger)var0.get(var5);
      if (var6 == null) {
         var6 = computeTenRaisedByNFloor16Recursive(var0, var5);
         var0.put(var5, var6);
      }

      return HICHRCOHCCRHOHCICOOCHOIHCCHIRI.multiply(var4, var6);
   }

   static NavigableMap<Integer, BigInteger> createPowersOfTenFloor16Map() {
      TreeMap var0 = new TreeMap();
      var0.put(0, BigInteger.ONE);
      var0.put(16, HCCHRRHCHOIHOHOOHIROROOCIOHCIR);
      return var0;
   }

   public static long estimateNumBits(long var0) {
      return (var0 * 3402L >>> 10) + 1L;
   }

   static NavigableMap<Integer, BigInteger> fillPowersOf10Floor16(int var0, int var1) {
      TreeMap var2 = new TreeMap();
      var2.put(0, BigInteger.valueOf(5L));
      var2.put(16, OCRHIIHCHIHHCICCOOHOHHHRROHICC);
      fillPowersOfNFloor16Recursive(var2, var0, var1);

      for (Entry var4 : var2.entrySet()) {
         var4.setValue(((BigInteger)var4.getValue()).shiftLeft((Integer)var4.getKey()));
      }

      return var2;
   }

   static void fillPowersOfNFloor16Recursive(NavigableMap<Integer, BigInteger> var0, int var1, int var2) {
      int var3 = var2 - var1;
      if (var3 > 18) {
         int var4 = splitFloor16(var1, var2);
         int var5 = var2 - var4;
         if (!var0.containsKey(var5)) {
            fillPowersOfNFloor16Recursive(var0, var1, var4);
            fillPowersOfNFloor16Recursive(var0, var4, var2);
            var0.put(var5, computeTenRaisedByNFloor16Recursive(var0, var5));
         }
      }
   }

   static CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RICRIRRCOHRCOCRRHHCRHRROOIOHHR(long var0, long var2) {
      long var4 = var0 & 4294967295L;
      long var6 = var0 >>> 32;
      long var8 = var2 & 4294967295L;
      long var10 = var2 >>> 32;
      long var12 = var6 * var10;
      long var14 = var4 * var10;
      long var16 = var6 * var8;
      long var18 = var4 * var8;
      long var20 = var16 + (var18 >>> 32) + (var14 & 4294967295L);
      return new CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var12 + (var20 >>> 32) + (var14 >>> 32), var20 << 32 | var18 & 4294967295L);
   }

   static int splitFloor16(int var0, int var1) {
      int var2 = var0 + var1 >>> 1;
      return var1 - (var1 - var2 + 15 >> 4 << 4);
   }

   static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      final long RCCRROCHRCORIRIHICCIOHOIOCRRCI;
      final long CROIHHCHOICOCIOOIRRCHHHHRCIOHR;

      private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(long var1, long var3) {
         this.RCCRROCHRCORIRIHICCIOHOIOCRRCI = var1;
         this.CROIHHCHOICOCIOOIRRCHHHHRCIOHR = var3;
      }
   }
}
