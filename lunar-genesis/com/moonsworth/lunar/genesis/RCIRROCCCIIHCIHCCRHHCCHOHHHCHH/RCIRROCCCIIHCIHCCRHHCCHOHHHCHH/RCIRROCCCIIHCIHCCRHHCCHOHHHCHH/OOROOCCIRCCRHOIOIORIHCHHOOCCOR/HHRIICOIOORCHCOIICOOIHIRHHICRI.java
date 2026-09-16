package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;

import com.google.errorprone.annotations.Immutable;
import java.nio.ByteBuffer;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;

@Immutable
final class HHRIICOIOORCHCOIICOOIHIRHHICRI extends HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   private final Mac IRICHRICROCOOIIHIRHROHRROICOHI;
   private final Key CRHIHRROHRHOOOIOIRHOHRCOIHRCCI;
   private final String ICOCHICOIOROHRRIOHHCHOHRORIRHO;
   private final int ORRRICOORRHORRRCRHROCHOHROOHIO;
   private final boolean OCCRHORRIIOOORICIHORIHIOIICHIC;

   HHRIICOIOORCHCOIICOOIHIRHHICRI(String var1, Key var2, String var3) {
      this.IRICHRICROCOOIIHIRHROHRROICOHI = getMac(var1, var2);
      this.CRHIHRROHRHOOOIOIRHOHRCOIHRCCI = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var2
      );
      this.ICOCHICOIOROHRRIOHHCHOHRORIRHO = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var3
      );
      this.ORRRICOORRHORRRCRHROCHOHROOHIO = this.IRICHRICROCOOIIHIRHROHRROICOHI.getMacLength() * 8;
      this.OCCRHORRIIOOORICIHORIHIOIICHIC = supportsClone(this.IRICHRICROCOOIIHIRHROHRROICOHI);
   }

   @Override
   public int bits() {
      return this.ORRRICOORRHORRRCRHROCHOHROOHIO;
   }

   private static boolean supportsClone(Mac var0) {
      try {
         var0.clone();
         return true;
      } catch (CloneNotSupportedException var2) {
         return false;
      }
   }

   private static Mac getMac(String var0, Key var1) {
      try {
         Mac var2 = Mac.getInstance(var0);
         var2.init(var1);
         return var2;
      } catch (NoSuchAlgorithmException var3) {
         throw new IllegalStateException(var3);
      } catch (InvalidKeyException var4) {
         throw new IllegalArgumentException(var4);
      }
   }

   @Override
   public IIRHCHHOICHRICOOCRORCCIOOIHOIR OHRIHRCROOCROOIIOHROROHCCHHOCR() {
      if (this.OCCRHORRIIOOORICIHORIHIOIICHIC) {
         try {
            return new HHRIICOIOORCHCOIICOOIHIRHHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH((Mac)this.IRICHRICROCOOIIHIRHROHRROICOHI.clone());
         } catch (CloneNotSupportedException var2) {
         }
      }

      return new HHRIICOIOORCHCOIICOOIHIRHHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         getMac(this.IRICHRICROCOOIIHIRHROHRROICOHI.getAlgorithm(), this.CRHIHRROHRHOOOIOIRHOHRCOIHRCCI)
      );
   }

   @Override
   public String toString() {
      return this.ICOCHICOIOROHRRIOHHCHOHRORIRHO;
   }

   private static final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
      extends com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      private final Mac ROCRHRHCHIOOIHORHCIORRORRIRROR;
      private boolean done;

      private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Mac var1) {
         this.ROCRHRHCHIOOIHORHCIORRORRIRROR = var1;
      }

      @Override
      protected void update(byte var1) {
         this.checkNotDone();
         this.ROCRHRHCHIOOIHORHCIORRORRIRROR.update(var1);
      }

      @Override
      protected void update(byte[] var1) {
         this.checkNotDone();
         this.ROCRHRHCHIOOIHORHCIORRORRIRROR.update(var1);
      }

      @Override
      protected void update(byte[] var1, int var2, int var3) {
         this.checkNotDone();
         this.ROCRHRHCHIOOIHORHCIORRORRIRROR.update(var1, var2, var3);
      }

      @Override
      protected void update(ByteBuffer var1) {
         this.checkNotDone();
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var1
         );
         this.ROCRHRHCHIOOIHORHCIORRORRIRROR.update(var1);
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
         return CIOHHCORHRCCRICCCORIHCRHCCCRRR.IOHHOIIOCRHCHHCRORICCOHOHROOIH(this.ROCRHRHCHIOOIHORHCIORRORRIRROR.doFinal());
      }
   }
}
