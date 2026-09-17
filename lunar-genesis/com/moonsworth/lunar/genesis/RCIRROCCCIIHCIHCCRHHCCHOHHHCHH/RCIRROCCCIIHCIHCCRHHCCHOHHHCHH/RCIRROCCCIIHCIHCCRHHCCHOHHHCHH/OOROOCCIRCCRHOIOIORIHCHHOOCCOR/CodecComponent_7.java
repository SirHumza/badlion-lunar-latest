package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

@CanIgnoreReturnValue
abstract class CRRRICCRROCOHHOHIICIHORCOORRRH implements IIRHCHHOICHRICOOCRORCCIOOIHOIR {
   @Override
   public final IIRHCHHOICHRICOOCRORCCIOOIHOIR RCIRHRRIOOCIOCCHHIOHCHHIROICRH(boolean var1) {
      return this.HRCHROOHRIHCRCRHRIIROCIRHOIRHH((byte)(var1 ? 1 : 0));
   }

   @Override
   public final IIRHCHHOICHRICOOCRORCCIOOIHOIR IHRHHHORORIROOCORCIORRCOCHHHRI(double var1) {
      return this.CIROHHHIOIHIROHCHICORCCCRROHCC(Double.doubleToRawLongBits(var1));
   }

   @Override
   public final IIRHCHHOICHRICOOCRORCCIOOIHOIR CHRHCRCCIICRORCOHCORHRROIHRCHO(float var1) {
      return this.IRCIRRIICRHCRHOCCRCRRCRORIHHHO(Float.floatToRawIntBits(var1));
   }

   @Override
   public IIRHCHHOICHRICOOCRORCCIOOIHOIR RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(CharSequence var1) {
      int var2 = 0;

      for (int var3 = var1.length(); var2 < var3; var2++) {
         this.HICRRICCHCCROOHHCHOCOCCHOIHHOC(var1.charAt(var2));
      }

      return this;
   }

   @Override
   public IIRHCHHOICHRICOOCRORCCIOOIHOIR RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CharSequence var1, Charset var2) {
      return this.HCHRIROHHHCORIOCROOCHRCIOROOCI(var1.toString().getBytes(var2));
   }

   @Override
   public IIRHCHHOICHRICOOCRORCCIOOIHOIR HCHRIROHHHCORIOCROOCHRCIOROOCI(byte[] var1) {
      return this.IHCRORHRORIICHRHRCHRRIRRHHOCOO(var1, 0, var1.length);
   }

   @Override
   public IIRHCHHOICHRICOOCRORCCIOOIHOIR IHCRORHRORIICHRHRCHRRIRRHHOCOO(byte[] var1, int var2, int var3) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkPositionIndexes(
         var2, var2 + var3, var1.length
      );

      for (int var4 = 0; var4 < var3; var4++) {
         this.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var1[var2 + var4]);
      }

      return this;
   }

   @Override
   public IIRHCHHOICHRICOOCRORCCIOOIHOIR CIOHHCORHRCCRICCCORIHCRHCCCRRR(ByteBuffer var1) {
      if (var1.hasArray()) {
         this.IHCRORHRORIICHRHRCHRRIRRHHOCOO(var1.array(), var1.arrayOffset() + var1.position(), var1.remaining());
         ((Buffer)var1).position(var1.limit());
      } else {
         for (int var2 = var1.remaining(); var2 > 0; var2--) {
            this.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var1.get());
         }
      }

      return this;
   }

   @Override
   public IIRHCHHOICHRICOOCRORCCIOOIHOIR CRRRICCRROCOHHOHIICIHORCOORRRH(short var1) {
      this.HRCHROOHRIHCRCRHRIIROCIRHOIRHH((byte)var1);
      this.HRCHROOHRIHCRCRHRIIROCIRHOIRHH((byte)(var1 >>> 8));
      return this;
   }

   @Override
   public IIRHCHHOICHRICOOCRORCCIOOIHOIR IRCIRRIICRHCRHOCCRCRRCRORIHHHO(int var1) {
      this.HRCHROOHRIHCRCRHRIIROCIRHOIRHH((byte)var1);
      this.HRCHROOHRIHCRCRHRIIROCIRHOIRHH((byte)(var1 >>> 8));
      this.HRCHROOHRIHCRCRHRIIROCIRHOIRHH((byte)(var1 >>> 16));
      this.HRCHROOHRIHCRCRHRIIROCIRHOIRHH((byte)(var1 >>> 24));
      return this;
   }

   @Override
   public IIRHCHHOICHRICOOCRORCCIOOIHOIR CIROHHHIOIHIROHCHICORCCCRROHCC(long var1) {
      for (byte var3 = 0; var3 < 64; var3 += 8) {
         this.HRCHROOHRIHCRCRHRIIROCIRHOIRHH((byte)(var1 >>> var3));
      }

      return this;
   }

   @Override
   public IIRHCHHOICHRICOOCRORCCIOOIHOIR HICRRICCHCCROOHHCHOCOCCHOIHHOC(char var1) {
      this.HRCHROOHRIHCRCRHRIIROCIRHOIRHH((byte)var1);
      this.HRCHROOHRIHCRCRHRIIROCIRHOIRHH((byte)(var1 >>> '\b'));
      return this;
   }

   @Override
   public <T> IIRHCHHOICHRICOOCRORCCIOOIHOIR RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(T var1, IIHRRHORCRCROCHHOHORCHCROCIHRO<? super T> var2) {
      var2.funnel(var1, this);
      return this;
   }
}
