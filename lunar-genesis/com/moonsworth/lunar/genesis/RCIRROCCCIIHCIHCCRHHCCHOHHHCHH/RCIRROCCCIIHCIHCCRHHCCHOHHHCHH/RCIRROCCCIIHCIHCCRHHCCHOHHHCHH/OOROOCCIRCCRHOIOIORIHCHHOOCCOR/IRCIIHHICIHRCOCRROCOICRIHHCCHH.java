package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;

import com.google.errorprone.annotations.Immutable;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

@Immutable
abstract class IRCIIHHICIHRCOCRROCOICRIHHCCHH extends HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   final IHHCHHHCRIHOOCOIOOCRIIICIOROIR[] RCCCICCHRRIIIHCIIIRHRIRIIOOOOI;
   private static final long OORORHCCOIIOHIHORHCRRCCRHHRHIH = 0L;

   IRCIIHHICIHRCOCRROCOICRIHHCCHH(IHHCHHHCRIHOOCOIOOCRIIICIOROIR... var1) {
      for (IHHCHHHCRIHOOCOIOOCRIIICIOROIR var5 : var1) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var5
         );
      }

      this.RCCCICCHRRIIIHCIIIRHRIRIIOOOOI = var1;
   }

   abstract CIOHHCORHRCCRICCCORIHCRHCCCRRR RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IIRHCHHOICHRICOOCRORCCIOOIHOIR[] var1);

   @Override
   public IIRHCHHOICHRICOOCRORCCIOOIHOIR OHRIHRCROOCROOIIOHROROHCCHHOCR() {
      IIRHCHHOICHRICOOCRORCCIOOIHOIR[] var1 = new IIRHCHHOICHRICOOCRORCCIOOIHOIR[this.RCCCICCHRRIIIHCIIIRHRIRIIOOOOI.length];

      for (int var2 = 0; var2 < var1.length; var2++) {
         var1[var2] = this.RCCCICCHRRIIIHCIIIRHRIRIIOOOOI[var2].OHRIHRCROOCROOIIOHROROHCCHHOCR();
      }

      return this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1);
   }

   @Override
   public IIRHCHHOICHRICOOCRORCCIOOIHOIR CCIRHRHCCCCIOCRORRRCIOHIHCCCOR(int var1) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
         var1 >= 0
      );
      IIRHCHHOICHRICOOCRORCCIOOIHOIR[] var2 = new IIRHCHHOICHRICOOCRORCCIOOIHOIR[this.RCCCICCHRRIIIHCIIIRHRIRIIOOOOI.length];

      for (int var3 = 0; var3 < var2.length; var3++) {
         var2[var3] = this.RCCCICCHRRIIIHCIIIRHRIRIIOOOOI[var3].CCIRHRHCCCCIOCRORRRCIOHIHCCCOR(var1);
      }

      return this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var2);
   }

   private IIRHCHHOICHRICOOCRORCCIOOIHOIR IRCIIHHICIHRCOCRROCOICRIHHCCHH(final IIRHCHHOICHRICOOCRORCCIOOIHOIR[] var1) {
      return new IIRHCHHOICHRICOOCRORCCIOOIHOIR() {
         @Override
         public IIRHCHHOICHRICOOCRORCCIOOIHOIR HRCHROOHRIHCRCRHRIIROCIRHOIRHH(byte var1x) {
            for (IIRHCHHOICHRICOOCRORCCIOOIHOIR var5 : var1) {
               var5.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var1x);
            }

            return this;
         }

         @Override
         public IIRHCHHOICHRICOOCRORCCIOOIHOIR HCHRIROHHHCORIOCROOCHRCIOROOCI(byte[] var1x) {
            for (IIRHCHHOICHRICOOCRORCCIOOIHOIR var5 : var1) {
               var5.HCHRIROHHHCORIOCROOCHRCIOROOCI(var1x);
            }

            return this;
         }

         @Override
         public IIRHCHHOICHRICOOCRORCCIOOIHOIR IHCRORHRORIICHRHRCHRRIRRHHOCOO(byte[] var1x, int var2, int var3) {
            for (IIRHCHHOICHRICOOCRORCCIOOIHOIR var7 : var1) {
               var7.IHCRORHRORIICHRHRCHRRIRRHHOCOO(var1x, var2, var3);
            }

            return this;
         }

         @Override
         public IIRHCHHOICHRICOOCRORCCIOOIHOIR CIOHHCORHRCCRICCCORIHCRHCCCRRR(ByteBuffer var1x) {
            int var2 = var1x.position();

            for (IIRHCHHOICHRICOOCRORCCIOOIHOIR var6 : var1) {
               ((Buffer)var1x).position(var2);
               var6.CIOHHCORHRCCRICCCORIHCRHCCCRRR(var1x);
            }

            return this;
         }

         @Override
         public IIRHCHHOICHRICOOCRORCCIOOIHOIR CRRRICCRROCOHHOHIICIHORCOORRRH(short var1x) {
            for (IIRHCHHOICHRICOOCRORCCIOOIHOIR var5 : var1) {
               var5.CRRRICCRROCOHHOHIICIHORCOORRRH(var1x);
            }

            return this;
         }

         @Override
         public IIRHCHHOICHRICOOCRORCCIOOIHOIR IRCIRRIICRHCRHOCCRCRRCRORIHHHO(int var1x) {
            for (IIRHCHHOICHRICOOCRORCCIOOIHOIR var5 : var1) {
               var5.IRCIRRIICRHCRHOCCRCRRCRORIHHHO(var1x);
            }

            return this;
         }

         @Override
         public IIRHCHHOICHRICOOCRORCCIOOIHOIR CIROHHHIOIHIROHCHICORCCCRROHCC(long var1x) {
            for (IIRHCHHOICHRICOOCRORCCIOOIHOIR var6 : var1) {
               var6.CIROHHHIOIHIROHCHICORCCCRROHCC(var1x);
            }

            return this;
         }

         @Override
         public IIRHCHHOICHRICOOCRORCCIOOIHOIR CHRHCRCCIICRORCOHCORHRROIHRCHO(float var1x) {
            for (IIRHCHHOICHRICOOCRORCCIOOIHOIR var5 : var1) {
               var5.CHRHCRCCIICRORCOHCORHRROIHRCHO(var1x);
            }

            return this;
         }

         @Override
         public IIRHCHHOICHRICOOCRORCCIOOIHOIR IHRHHHORORIROOCORCIORRCOCHHHRI(double var1x) {
            for (IIRHCHHOICHRICOOCRORCCIOOIHOIR var6 : var1) {
               var6.IHRHHHORORIROOCORCIORRCOCHHHRI(var1x);
            }

            return this;
         }

         @Override
         public IIRHCHHOICHRICOOCRORCCIOOIHOIR RCIRHRRIOOCIOCCHHIOHCHHIROICRH(boolean var1x) {
            for (IIRHCHHOICHRICOOCRORCCIOOIHOIR var5 : var1) {
               var5.RCIRHRRIOOCIOCCHHIOHCHHIROICRH(var1x);
            }

            return this;
         }

         @Override
         public IIRHCHHOICHRICOOCRORCCIOOIHOIR HICRRICCHCCROOHHCHOCOCCHOIHHOC(char var1x) {
            for (IIRHCHHOICHRICOOCRORCCIOOIHOIR var5 : var1) {
               var5.HICRRICCHCCROOHHCHOCOCCHOIHHOC(var1x);
            }

            return this;
         }

         @Override
         public IIRHCHHOICHRICOOCRORCCIOOIHOIR RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(CharSequence var1x) {
            for (IIRHCHHOICHRICOOCRORCCIOOIHOIR var5 : var1) {
               var5.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var1x);
            }

            return this;
         }

         @Override
         public IIRHCHHOICHRICOOCRORCCIOOIHOIR RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CharSequence var1x, Charset var2) {
            for (IIRHCHHOICHRICOOCRORCCIOOIHOIR var6 : var1) {
               var6.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1x, var2);
            }

            return this;
         }

         @Override
         public <T> IIRHCHHOICHRICOOCRORCCIOOIHOIR RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(T var1x, IIHRRHORCRCROCHHOHORCHCROCIHRO<? super T> var2) {
            for (IIRHCHHOICHRICOOCRORCCIOOIHOIR var6 : var1) {
               var6.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1x, var2);
            }

            return this;
         }

         @Override
         public CIOHHCORHRCCRICCCORIHCRHCCCRRR CIRIIOORHHIHICORIOIIRIIHHCOCCI() {
            return IRCIIHHICIHRCOCRROCOICRIHHCCHH.this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1);
         }
      };
   }
}
