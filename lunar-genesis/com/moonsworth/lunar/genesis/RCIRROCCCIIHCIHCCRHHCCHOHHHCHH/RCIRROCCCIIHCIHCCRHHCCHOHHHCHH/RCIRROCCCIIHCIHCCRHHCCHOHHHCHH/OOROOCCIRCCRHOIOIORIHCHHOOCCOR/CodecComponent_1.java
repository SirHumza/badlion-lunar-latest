package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;

import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

@Immutable
final class ORHIOICIOCRRHOOCOHRORIHICHRCRR extends HHCCIRHCCCIIRHCROHIORHIRHHIORH implements Serializable {
   private final MessageDigest IICIOOOOOOROHHROHIOIOIRIHHRHHO;
   private final int HRCIHCCHCOOHIIRICOHHOHOOHIOOOI;
   private final boolean OOCHRRIICRIRIRCIOIIIIHHICIROIH;
   private final String COHCRCORHCHCHCOHRRCCROOICHCCOC;

   ORHIOICIOCRRHOOCOHRORIHICHRCRR(String var1, String var2) {
      this.IICIOOOOOOROHHROHIOIOIRIHHRHHO = getMessageDigest(var1);
      this.HRCIHCCHCOOHIIRICOHHOHOOHIOOOI = this.IICIOOOOOOROHHROHIOIOIRIHHRHHO.getDigestLength();
      this.COHCRCORHCHCHCOHRRCCROOICHCCOC = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var2
      );
      this.OOCHRRIICRIRIRCIOIIIIHHICIROIH = supportsClone(this.IICIOOOOOOROHHROHIOIOIRIHHRHHO);
   }

   ORHIOICIOCRRHOOCOHRORIHICHRCRR(String var1, int var2, String var3) {
      this.COHCRCORHCHCHCOHRRCCROOICHCCOC = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var3
      );
      this.IICIOOOOOOROHHROHIOIOIRIHHRHHO = getMessageDigest(var1);
      int var4 = this.IICIOOOOOOROHHROHIOIOIRIHHRHHO.getDigestLength();
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
         var2 >= 4 && var2 <= var4, "bytes (%s) must be >= 4 and < %s", var2, var4
      );
      this.HRCIHCCHCOOHIIRICOHHOHOOHIOOOI = var2;
      this.OOCHRRIICRIRIRCIOIIIIHHICIROIH = supportsClone(this.IICIOOOOOOROHHROHIOIOIRIHHRHHO);
   }

   private static boolean supportsClone(MessageDigest var0) {
      try {
         var0.clone();
         return true;
      } catch (CloneNotSupportedException var2) {
         return false;
      }
   }

   @Override
   public int bits() {
      return this.HRCIHCCHCOOHIIRICOHHOHOOHIOOOI * 8;
   }

   @Override
   public String toString() {
      return this.COHCRCORHCHCHCOHRRCCROOICHCCOC;
   }

   private static MessageDigest getMessageDigest(String var0) {
      try {
         return MessageDigest.getInstance(var0);
      } catch (NoSuchAlgorithmException var2) {
         throw new AssertionError(var2);
      }
   }

   @Override
   public IIRHCHHOICHRICOOCRORCCIOOIHOIR OHRIHRCROOCROOIIOHROROHCCHHOCR() {
      if (this.OOCHRRIICRIRIRCIOIIIIHHICIROIH) {
         try {
            return new ORHIOICIOCRRHOOCOHRORIHICHRCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               (MessageDigest)this.IICIOOOOOOROHHROHIOIOIRIHHRHHO.clone(), this.HRCIHCCHCOOHIIRICOHHOHOOHIOOOI
            );
         } catch (CloneNotSupportedException var2) {
         }
      }

      return new ORHIOICIOCRRHOOCOHRORIHICHRCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         getMessageDigest(this.IICIOOOOOOROHHROHIOIOIRIHHRHHO.getAlgorithm()), this.HRCIHCCHCOOHIIRICOHHOHOOHIOOOI
      );
   }

   Object writeReplace() {
      return new ORHIOICIOCRRHOOCOHRORIHICHRCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         this.IICIOOOOOOROHHROHIOIOIRIHHRHHO.getAlgorithm(), this.HRCIHCCHCOOHIIRICOHHOHOOHIOOOI, this.COHCRCORHCHCHCOHRRCCROOICHCCOC
      );
   }

   private static final class IRCIIHHICIHRCOCRROCOICRIHHCCHH implements Serializable {
      private final String RHIHHIICIRCIROOHOICICOHOOHOICC;
      private final int HRICIHRHRRCIRRRICOOHOOIHIRICRC;
      private final String HOOORROHRIIHROOCHHHHRHRROORCOR;
      private static final long OHOHHRHORHRRHHROIOHOHHIROHRICI = 0L;

      private IRCIIHHICIHRCOCRROCOICRIHHCCHH(String var1, int var2, String var3) {
         this.RHIHHIICIRCIROOHOICICOHOOHOICC = var1;
         this.HRICIHRHRRCIRRRICOOHOOIHIRICRC = var2;
         this.HOOORROHRIIHROOCHHHHRHRROORCOR = var3;
      }

      private Object readResolve() {
         return new ORHIOICIOCRRHOOCOHRORIHICHRCRR(
            this.RHIHHIICIRCIROOHOICICOHOOHOICC, this.HRICIHRHRRCIRRRICOOHOOIHIRICRC, this.HOOORROHRIIHROOCHHHHRHRROORCOR
         );
      }
   }

   private static final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
      extends com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      private final MessageDigest RCCROCROOCCOOICOOHOOHROHCCOCIR;
      private final int COOCOOCRCIOHCICHHCCIIHOCOORHIC;
      private boolean done;

      private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(MessageDigest var1, int var2) {
         this.RCCROCROOCCOOICOOHOOHROHCCOCIR = var1;
         this.COOCOOCRCIOHCICHHCCIIHOCOORHIC = var2;
      }

      @Override
      protected void update(byte var1) {
         this.checkNotDone();
         this.RCCROCROOCCOOICOOHOOHROHCCOCIR.update(var1);
      }

      @Override
      protected void update(byte[] var1, int var2, int var3) {
         this.checkNotDone();
         this.RCCROCROOCCOOICOOHOOHROHCCOCIR.update(var1, var2, var3);
      }

      @Override
      protected void update(ByteBuffer var1) {
         this.checkNotDone();
         this.RCCROCROOCCOOICOOHOOHROHCCOCIR.update(var1);
      }

      private void checkNotDone() {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkState(
            !this.done, "Cannot re-use a Hasher after calling hash() on it"
         );
      }

      @Override
      public CIOHHCORHRCCRICCCORIHCRHCCCRRR CIRIIOORHHIHICORIOIIRIIHHCOCCI() {
         this.checkNotDone();
         this.done = true;
         return this.COOCOOCRCIOHCICHHCCIIHOCOORHIC == this.RCCROCROOCCOOICOOHOOHROHCCOCIR.getDigestLength()
            ? CIOHHCORHRCCRICCCORIHCRHCCCRRR.IOHHOIIOCRHCHHCRORICCOHOHROOIH(this.RCCROCROOCCOOICOOHOOHROHCCOCIR.digest())
            : CIOHHCORHRCCRICCCORIHCRHCCCRRR.IOHHOIIOCRHCHHCRORICCOHOHROOIH(
               Arrays.copyOf(this.RCCROCROOCCOOICOOHOOHROHCCOCIR.digest(), this.COOCOOCRCIOHCICHHCCIIHOCOORHIC)
            );
      }
   }
}
