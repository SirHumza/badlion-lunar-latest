package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
public abstract class CIOHHCORHRCCRICCCORIHCRHCCCRRR {
   private static final char[] IOHIHHIOIHHIOIOHHIIRICOIOHRHHO = "0123456789abcdef".toCharArray();

   CIOHHCORHRCCRICCCORIHCRHCCCRRR() {
   }

   public abstract int bits();

   public abstract int asInt();

   public abstract long asLong();

   public abstract long padToLong();

   public abstract byte[] asBytes();

   @CanIgnoreReturnValue
   public int writeBytesTo(byte[] var1, int var2, int var3) {
      var3 = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.min(
         var3, this.bits() / 8
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkPositionIndexes(
         var2, var2 + var3, var1.length
      );
      this.writeBytesToImpl(var1, var2, var3);
      return var3;
   }

   abstract void writeBytesToImpl(byte[] var1, int var2, int var3);

   byte[] getBytesInternal() {
      return this.asBytes();
   }

   abstract boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CIOHHCORHRCCRICCCORIHCRHCCCRRR var1);

   public static CIOHHCORHRCCRICCCORIHCRHCCCRRR IORHOHORRHRRRHRRHIROIOHHIORORH(int var0) {
      return new CIOHHCORHRCCRICCCORIHCRHCCCRRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0);
   }

   public static CIOHHCORHRCCRICCCORIHCRHCCCRRR CCRHRROIOIIRROHCOOCCCRRIOIHHHO(long var0) {
      return new CIOHHCORHRCCRICCCORIHCRHCCCRRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var0);
   }

   public static CIOHHCORHRCCRICCCORIHCRHCCCRRR RORCHCIIICOHIRROOORHOCCCCIOCCI(byte[] var0) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
         var0.length >= 1, "A HashCode must contain at least 1 byte."
      );
      return IOHHOIIOCRHCHHCRORICCOHOHROOIH((byte[])var0.clone());
   }

   static CIOHHCORHRCCRICCCORIHCRHCCCRRR IOHHOIIOCRHCHHCRORICCOHOHROOIH(byte[] var0) {
      return new CIOHHCORHRCCRICCCORIHCRHCCCRRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0);
   }

   public static CIOHHCORHRCCRICCCORIHCRHCCCRRR HCOIHCRHHRHCIRORRRICORRHIRCOCH(String var0) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
         var0.length() >= 2, "input string (%s) must have at least 2 characters", var0
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
         var0.length() % 2 == 0, "input string (%s) must have an even number of characters", var0
      );
      byte[] var1 = new byte[var0.length() / 2];

      for (byte var2 = 0; var2 < var0.length(); var2 += 2) {
         int var3 = decode(var0.charAt(var2)) << 4;
         int var4 = decode(var0.charAt(var2 + 1));
         var1[var2 / 2] = (byte)(var3 + var4);
      }

      return IOHHOIIOCRHCHHCRORICCOHOHROOIH(var1);
   }

   private static int decode(char var0) {
      if (var0 >= '0' && var0 <= '9') {
         return var0 - 48;
      } else if (var0 >= 'a' && var0 <= 'f') {
         return var0 - 97 + 10;
      } else {
         throw new IllegalArgumentException("Illegal hexadecimal character: " + var0);
      }
   }

   @Override
   public final boolean equals(@Nullable Object var1) {
      if (!(var1 instanceof CIOHHCORHRCCRICCCORIHCRHCCCRRR)) {
         return false;
      }

      CIOHHCORHRCCRICCCORIHCRHCCCRRR var2 = (CIOHHCORHRCCRICCCORIHCRHCCCRRR)var1;
      return this.bits() == var2.bits() && this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2);
   }

   @Override
   public final int hashCode() {
      if (this.bits() >= 32) {
         return this.asInt();
      }

      byte[] var1 = this.getBytesInternal();
      int var2 = var1[0] & 255;

      for (int var3 = 1; var3 < var1.length; var3++) {
         var2 |= (var1[var3] & 255) << var3 * 8;
      }

      return var2;
   }

   @Override
   public final String toString() {
      byte[] var1 = this.getBytesInternal();
      StringBuilder var2 = new StringBuilder(2 * var1.length);

      for (byte var6 : var1) {
         var2.append(IOHIHHIOIHHIOIOHHIIRICOIOHRHHO[var6 >> 4 & 15]).append(IOHIHHIOIHHIOIOHHIIRICOIOHRHHO[var6 & 15]);
      }

      return var2.toString();
   }

   private static final class HHCCIRHCCCIIRHCROHIORHIRHHIORH extends CIOHHCORHRCCRICCCORIHCRHCCCRRR implements Serializable {
      final long COOIOORIORIRHRCIOOOCHOCIOHCICC;
      private static final long HCIRRCHRIRHOIHCOOIRRCIIIRROOCC = 0L;

      HHCCIRHCCCIIRHCROHIORHIRHHIORH(long var1) {
         this.COOIOORIORIRHRCIOOOCHOCIOHCICC = var1;
      }

      @Override
      public int bits() {
         return 64;
      }

      @Override
      public byte[] asBytes() {
         return new byte[]{
            (byte)this.COOIOORIORIRHRCIOOOCHOCIOHCICC,
            (byte)(this.COOIOORIORIRHRCIOOOCHOCIOHCICC >> 8),
            (byte)(this.COOIOORIORIRHRCIOOOCHOCIOHCICC >> 16),
            (byte)(this.COOIOORIORIRHRCIOOOCHOCIOHCICC >> 24),
            (byte)(this.COOIOORIORIRHRCIOOOCHOCIOHCICC >> 32),
            (byte)(this.COOIOORIORIRHRCIOOOCHOCIOHCICC >> 40),
            (byte)(this.COOIOORIORIRHRCIOOOCHOCIOHCICC >> 48),
            (byte)(this.COOIOORIORIRHRCIOOOCHOCIOHCICC >> 56)
         };
      }

      @Override
      public int asInt() {
         return (int)this.COOIOORIORIRHRCIOOOCHOCIOHCICC;
      }

      @Override
      public long asLong() {
         return this.COOIOORIORIRHRCIOOOCHOCIOHCICC;
      }

      @Override
      public long padToLong() {
         return this.COOIOORIORIRHRCIOOOCHOCIOHCICC;
      }

      @Override
      void writeBytesToImpl(byte[] var1, int var2, int var3) {
         for (int var4 = 0; var4 < var3; var4++) {
            var1[var2 + var4] = (byte)(this.COOIOORIORIRHRCIOOOCHOCIOHCICC >> var4 * 8);
         }
      }

      @Override
      boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CIOHHCORHRCCRICCCORIHCRHCCCRRR var1) {
         return this.COOIOORIORIRHRCIOOOCHOCIOHCICC == var1.asLong();
      }
   }

   private static final class IRCIIHHICIHRCOCRROCOICRIHHCCHH extends CIOHHCORHRCCRICCCORIHCRHCCCRRR implements Serializable {
      final int OHORCIHHIRCORHCRCIIIICRIORCHIR;
      private static final long HHIIRCCIHIIICRHRICHRCHROOHCHHC = 0L;

      IRCIIHHICIHRCOCRROCOICRIHHCCHH(int var1) {
         this.OHORCIHHIRCORHCRCIIIICRIORCHIR = var1;
      }

      @Override
      public int bits() {
         return 32;
      }

      @Override
      public byte[] asBytes() {
         return new byte[]{
            (byte)this.OHORCIHHIRCORHCRCIIIICRIORCHIR,
            (byte)(this.OHORCIHHIRCORHCRCIIIICRIORCHIR >> 8),
            (byte)(this.OHORCIHHIRCORHCRCIIIICRIORCHIR >> 16),
            (byte)(this.OHORCIHHIRCORHCRCIIIICRIORCHIR >> 24)
         };
      }

      @Override
      public int asInt() {
         return this.OHORCIHHIRCORHCRCIIIICRIORCHIR;
      }

      @Override
      public long asLong() {
         throw new IllegalStateException("this HashCode only has 32 bits; cannot create a long");
      }

      @Override
      public long padToLong() {
         return com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI.RIROICHCRROROHCCROOCCCCOCHCCRI.toLong(
            this.OHORCIHHIRCORHCRCIIIICRIORCHIR
         );
      }

      @Override
      void writeBytesToImpl(byte[] var1, int var2, int var3) {
         for (int var4 = 0; var4 < var3; var4++) {
            var1[var2 + var4] = (byte)(this.OHORCIHHIRCORHCRCIIIICRIORCHIR >> var4 * 8);
         }
      }

      @Override
      boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CIOHHCORHRCCRICCCORIHCRHCCCRRR var1) {
         return this.OHORCIHHIRCORHCRCIIIICRIORCHIR == var1.asInt();
      }
   }

   private static final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends CIOHHCORHRCCRICCCORIHCRHCCCRRR implements Serializable {
      final byte[] CCOOHHOHCIHROHHIIRRRHCICROORRR;
      private static final long CHRHCCHIORIIRRHCCHRIOHOOIRHRCH = 0L;

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(byte[] var1) {
         this.CCOOHHOHCIHROHHIIRRRHCICROORRR = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var1
         );
      }

      @Override
      public int bits() {
         return this.CCOOHHOHCIHROHHIIRRRHCICROORRR.length * 8;
      }

      @Override
      public byte[] asBytes() {
         return (byte[])this.CCOOHHOHCIHROHHIIRRRHCICROORRR.clone();
      }

      @Override
      public int asInt() {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkState(
            this.CCOOHHOHCIHROHHIIRRRHCICROORRR.length >= 4,
            "HashCode#asInt() requires >= 4 bytes (it only has %s bytes).",
            this.CCOOHHOHCIHROHHIIRRRHCICROORRR.length
         );
         return this.CCOOHHOHCIHROHHIIRRRHCICROORRR[0] & 0xFF
            | (this.CCOOHHOHCIHROHHIIRRRHCICROORRR[1] & 0xFF) << 8
            | (this.CCOOHHOHCIHROHHIIRRRHCICROORRR[2] & 0xFF) << 16
            | (this.CCOOHHOHCIHROHHIIRRRHCICROORRR[3] & 0xFF) << 24;
      }

      @Override
      public long asLong() {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkState(
            this.CCOOHHOHCIHROHHIIRRRHCICROORRR.length >= 8,
            "HashCode#asLong() requires >= 8 bytes (it only has %s bytes).",
            this.CCOOHHOHCIHROHHIIRRRHCICROORRR.length
         );
         return this.padToLong();
      }

      @Override
      public long padToLong() {
         long var1 = this.CCOOHHOHCIHROHHIIRRRHCICROORRR[0] & 0xFF;

         for (int var3 = 1; var3 < Math.min(this.CCOOHHOHCIHROHHIIRRRHCICROORRR.length, 8); var3++) {
            var1 |= (this.CCOOHHOHCIHROHHIIRRRHCICROORRR[var3] & 255L) << var3 * 8;
         }

         return var1;
      }

      @Override
      void writeBytesToImpl(byte[] var1, int var2, int var3) {
         System.arraycopy(this.CCOOHHOHCIHROHHIIRRRHCICROORRR, 0, var1, var2, var3);
      }

      @Override
      byte[] getBytesInternal() {
         return this.CCOOHHOHCIHROHHIIRRRHCICROORRR;
      }

      @Override
      boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CIOHHCORHRCCRICCCORIHCRHCCCRRR var1) {
         if (this.CCOOHHOHCIHROHHIIRRRHCICROORRR.length != var1.getBytesInternal().length) {
            return false;
         }

         boolean var2 = true;

         for (int var3 = 0; var3 < this.CCOOHHOHCIHROHHIIRRRHCICROORRR.length; var3++) {
            var2 &= this.CCOOHHOHCIHROHHIIRRRHCICROORRR[var3] == var1.getBytesInternal()[var3];
         }

         return var2;
      }
   }
}
