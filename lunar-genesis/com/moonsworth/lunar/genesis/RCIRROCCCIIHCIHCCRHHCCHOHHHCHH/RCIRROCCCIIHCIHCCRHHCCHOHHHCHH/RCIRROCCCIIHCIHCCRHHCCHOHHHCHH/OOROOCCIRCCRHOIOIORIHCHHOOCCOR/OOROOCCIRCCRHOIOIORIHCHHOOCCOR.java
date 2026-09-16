package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;

import java.math.RoundingMode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLongArray;
import org.checkerframework.checker.nullness.qual.Nullable;

enum OOROOCCIRCCRHOIOIORIHCHHOOCCOR implements HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   MURMUR128_MITZ_32 {
      @Override
      public <T> boolean put(
         T var1, IIHRRHORCRCROCHHOHORCHCROCIHRO<? super T> var2, int var3, OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4
      ) {
         long var5 = var4.bitSize();
         long var7 = OHHRIOHROOIHOROCIRHCHORIHRRRRI.ROHCRHOCHHHRCROCRRORIHOCIHICCH().IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, var2).asLong();
         int var9 = (int)var7;
         int var10 = (int)(var7 >>> 32);
         boolean var11 = false;

         for (int var12 = 1; var12 <= var3; var12++) {
            int var13 = var9 + var12 * var10;
            if (var13 < 0) {
               var13 = ~var13;
            }

            var11 |= var4.set(var13 % var5);
         }

         return var11;
      }

      @Override
      public <T> boolean mightContain(
         T var1, IIHRRHORCRCROCHHOHORCHCROCIHRO<? super T> var2, int var3, OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4
      ) {
         long var5 = var4.bitSize();
         long var7 = OHHRIOHROOIHOROCIRHCHORIHRRRRI.ROHCRHOCHHHRCROCRRORIHOCIHICCH().IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, var2).asLong();
         int var9 = (int)var7;
         int var10 = (int)(var7 >>> 32);

         for (int var11 = 1; var11 <= var3; var11++) {
            int var12 = var9 + var11 * var10;
            if (var12 < 0) {
               var12 = ~var12;
            }

            if (!var4.get(var12 % var5)) {
               return false;
            }
         }

         return true;
      }
   },
   MURMUR128_MITZ_64 {
      @Override
      public <T> boolean put(
         T var1, IIHRRHORCRCROCHHOHORCHCROCIHRO<? super T> var2, int var3, OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4
      ) {
         long var5 = var4.bitSize();
         byte[] var7 = OHHRIOHROOIHOROCIRHCHORIHRRRRI.ROHCRHOCHHHRCROCRRORIHOCIHICCH().IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, var2).getBytesInternal();
         long var8 = this.lowerEight(var7);
         long var10 = this.upperEight(var7);
         boolean var12 = false;
         long var13 = var8;

         for (int var15 = 0; var15 < var3; var15++) {
            var12 |= var4.set((var13 & Long.MAX_VALUE) % var5);
            var13 += var10;
         }

         return var12;
      }

      @Override
      public <T> boolean mightContain(
         T var1, IIHRRHORCRCROCHHOHORCHCROCIHRO<? super T> var2, int var3, OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4
      ) {
         long var5 = var4.bitSize();
         byte[] var7 = OHHRIOHROOIHOROCIRHCHORIHRRRRI.ROHCRHOCHHHRCROCRRORIHOCIHICCH().IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, var2).getBytesInternal();
         long var8 = this.lowerEight(var7);
         long var10 = this.upperEight(var7);
         long var12 = var8;

         for (int var14 = 0; var14 < var3; var14++) {
            if (!var4.get((var12 & Long.MAX_VALUE) % var5)) {
               return false;
            }

            var12 += var10;
         }

         return true;
      }

      private long lowerEight(byte[] var1) {
         return com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI.OCOHORHCROHICRRIHCIHHRRCIHICRI.fromBytes(
            var1[7], var1[6], var1[5], var1[4], var1[3], var1[2], var1[1], var1[0]
         );
      }

      private long upperEight(byte[] var1) {
         return com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI.OCOHORHCROHICRRIHCIHHRRCIHICRI.fromBytes(
            var1[15], var1[14], var1[13], var1[12], var1[11], var1[10], var1[9], var1[8]
         );
      }
   };

   OOROOCCIRCCRHOIOIORIHCHHOOCCOR() {
   }

   static final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      private static final int HRHCRRIOIIRORIRHHIHRCIIIRHHOIR = 6;
      final AtomicLongArray COHCORIRIOIRCHRROICHRICIOCOIOO;
      private final RIROICHCRROROHCCROOCCCCOCHCCRI CCRRRCCORCRHOIRHRCRHOICICOROHI;

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(long var1) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
            var1 > 0L, "data length is zero!"
         );
         this.COHCORIRIOIRCHRROICHRICIOCOIOO = new AtomicLongArray(
            com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.checkedCast(
               com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.divide(
                  var1, 64L, RoundingMode.CEILING
               )
            )
         );
         this.CCRRRCCORCRHOIRHRCRHOICICOROHI = IHIRRIIORRHORHRORIHOROIRCORCOO.OCIIIHIOCOOCCROCHCRHHRRRHOCOHI();
      }

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(long[] var1) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
            var1.length > 0, "data length is zero!"
         );
         this.COHCORIRIOIRCHRROICHRICIOCOIOO = new AtomicLongArray(var1);
         this.CCRRRCCORCRHOIRHRCRHOICICOROHI = IHIRRIIORRHORHRORIHOROIRCORCOO.OCIIIHIOCOOCCROCHCRHHRRRHOCOHI();
         long var2 = 0L;

         for (long var7 : var1) {
            var2 += Long.bitCount(var7);
         }

         this.CCRRRCCORCRHOIRHRCRHOICICOROHI.add(var2);
      }

      boolean set(long var1) {
         if (this.get(var1)) {
            return false;
         }

         int var3 = (int)(var1 >>> 6);
         long var4 = 1L << (int)var1;

         long var6;
         long var8;
         do {
            var6 = this.COHCORIRIOIRCHRROICHRICIOCOIOO.get(var3);
            var8 = var6 | var4;
            if (var6 == var8) {
               return false;
            }
         } while (!this.COHCORIRIOIRCHRROICHRICIOCOIOO.compareAndSet(var3, var6, var8));

         this.CCRRRCCORCRHOIRHRCRHOICICOROHI.increment();
         return true;
      }

      boolean get(long var1) {
         return (this.COHCORIRIOIRCHRROICHRICIOCOIOO.get((int)(var1 >>> 6)) & 1L << (int)var1) != 0L;
      }

      public static long[] toPlainArray(AtomicLongArray var0) {
         long[] var1 = new long[var0.length()];

         for (int var2 = 0; var2 < var1.length; var2++) {
            var1[var2] = var0.get(var2);
         }

         return var1;
      }

      long bitSize() {
         return this.COHCORIRIOIRCHRROICHRICIOCOIOO.length() * 64L;
      }

      long bitCount() {
         return this.CCRRRCCORCRHOIRHRCRHOICICOROHI.sum();
      }

      OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH CRIRRRCICHCRHICRCICHHRHIHOOIII() {
         return new OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(toPlainArray(this.COHCORIRIOIRCHRROICHRICIOCOIOO));
      }

      void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
            this.COHCORIRIOIRCHRROICHRICIOCOIOO.length() == var1.COHCORIRIOIRCHRROICHRICIOCOIOO.length(),
            "BitArrays must be of equal length (%s != %s)",
            this.COHCORIRIOIRCHRROICHRICIOCOIOO.length(),
            var1.COHCORIRIOIRCHRROICHRICIOCOIOO.length()
         );

         for (int var2 = 0; var2 < this.COHCORIRIOIRCHRROICHRICIOCOIOO.length(); var2++) {
            long var3 = var1.COHCORIRIOIRCHRROICHRICIOCOIOO.get(var2);
            boolean var9 = true;

            long var5;
            long var7;
            do {
               var5 = this.COHCORIRIOIRCHRROICHRICIOCOIOO.get(var2);
               var7 = var5 | var3;
               if (var5 == var7) {
                  var9 = false;
                  break;
               }
            } while (!this.COHCORIRIOIRCHRROICHRICIOCOIOO.compareAndSet(var2, var5, var7));

            if (var9) {
               int var10 = Long.bitCount(var7) - Long.bitCount(var5);
               this.CCRRRCCORCRHOIRHRCRHOICICOROHI.add(var10);
            }
         }
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         if (var1 instanceof OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH) {
            OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = (OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var1;
            return Arrays.equals(toPlainArray(this.COHCORIRIOIRCHRROICHRICIOCOIOO), toPlainArray(var2.COHCORIRIOIRCHRROICHRICIOCOIOO));
         } else {
            return false;
         }
      }

      @Override
      public int hashCode() {
         return Arrays.hashCode(toPlainArray(this.COHCORIRIOIRCHRROICHRICIOCOIOO));
      }
   }
}
