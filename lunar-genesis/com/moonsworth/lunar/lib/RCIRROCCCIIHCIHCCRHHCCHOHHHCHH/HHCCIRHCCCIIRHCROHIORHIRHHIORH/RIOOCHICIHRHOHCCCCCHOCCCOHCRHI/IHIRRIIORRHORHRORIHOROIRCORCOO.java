package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

class IHIRRIIORRHORHRORIHOROIRCORCOO {
   protected static final RHOCHHIRRCHHHOHOIRROIROHHHIHIO[] ORIHRHRCRCOCOHRCCCCCIIRIRORRIC = new RHOCHHIRRCHHHOHOIRROIROHHHIHIO[0];
   protected static final Annotation[] OHORICRHHCHICIHCHROHIRRRRHHCCO = new Annotation[0];
   protected final com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH OICORRIIOHOCCIHIOCCCOHOICROOOR;

   protected IHIRRIIORRHORHRORIHOROIRCORCOO(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
   ) {
      this.OICORRIIOHOCCIHIOCCCOHOICROOOR = var1;
   }

   protected final IIRHCHHOICHRICOOCRORCCIOOIHOIR RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Annotation[] var1) {
      IIRHCHHOICHRICOOCRORCCIOOIHOIR var2 = IIRHCHHOICHRICOOCRORCCIOOIHOIR.HRRROIOROCICHHRROOHRHHOIOHRCRC();
      int var3 = 0;

      for (int var4 = var1.length; var3 < var4; var3++) {
         Annotation var5 = var1[var3];
         var2 = var2.CRRRICCRROCOHHOHIICIHORCOORRRH(var5);
         if (this.OICORRIIOHOCCIHIOCCCOHOICROOOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var5)) {
            var2 = this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var2, var5);
         }
      }

      return var2;
   }

   protected final IIRHCHHOICHRICOOCRORCCIOOIHOIR IRCIIHHICIHRCOCRROCOICRIHHCCHH(IIRHCHHOICHRICOOCRORCCIOOIHOIR var1, Annotation[] var2) {
      int var3 = 0;

      for (int var4 = var2.length; var3 < var4; var3++) {
         Annotation var5 = var2[var3];
         var1 = var1.CRRRICCRROCOHHOHIICIHORCOORRRH(var5);
         if (this.OICORRIIOHOCCIHIOCCCOHOICROOOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var5)) {
            var1 = this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, var5);
         }
      }

      return var1;
   }

   protected final IIRHCHHOICHRICOOCRORCCIOOIHOIR IRCIIHHICIHRCOCRROCOICRIHHCCHH(IIRHCHHOICHRICOOCRORCCIOOIHOIR var1, Annotation var2) {
      Annotation[] var3 = com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CCHCOROOHHCIHOHOCHIHRHOHOCROII(
         var2.annotationType()
      );
      int var4 = 0;

      for (int var5 = var3.length; var4 < var5; var4++) {
         Annotation var6 = var3[var4];
         if (!OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var6)) {
            if (this.OICORRIIOHOCCIHIOCCCOHOICROOOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var6)) {
               if (!var1.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var6)) {
                  var1 = var1.CRRRICCRROCOHHOHIICIHORCOORRRH(var6);
                  var1 = this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, var6);
               }
            } else {
               var1 = var1.CRRRICCRROCOHHOHIICIHORCOORRRH(var6);
            }
         }
      }

      return var1;
   }

   protected final IIRHCHHOICHRICOOCRORCCIOOIHOIR HHCCIRHCCCIIRHCROHIORHIRHHIORH(IIRHCHHOICHRICOOCRORCCIOOIHOIR var1, Annotation[] var2) {
      int var3 = 0;

      for (int var4 = var2.length; var3 < var4; var3++) {
         Annotation var5 = var2[var3];
         if (!var1.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var5)) {
            var1 = var1.CRRRICCRROCOHHOHIICIHORCOORRRH(var5);
            if (this.OICORRIIOHOCCIHIOCCCOHOICROOOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var5)) {
               var1 = this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1, var5);
            }
         }
      }

      return var1;
   }

   protected final IIRHCHHOICHRICOOCRORCCIOOIHOIR HHCCIRHCCCIIRHCROHIORHIRHHIORH(IIRHCHHOICHRICOOCRORCCIOOIHOIR var1, Annotation var2) {
      Annotation[] var3 = com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CCHCOROOHHCIHOHOCHIHRHOHOCROII(
         var2.annotationType()
      );
      int var4 = 0;

      for (int var5 = var3.length; var4 < var5; var4++) {
         Annotation var6 = var3[var4];
         if (!OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var6) && !var1.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var6)) {
            var1 = var1.CRRRICCRROCOHHOHIICIHORCOORRRH(var6);
            if (this.OICORRIIOHOCCIHIOCCCOHOICROOOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var6)) {
               var1 = this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, var6);
            }
         }
      }

      return var1;
   }

   protected static final boolean OOROOCCIRCCRHOIOIORIHCHHOOCCOR(Annotation var0) {
      return var0 instanceof Target || var0 instanceof Retention;
   }

   static RHOCHHIRRCHHHOHOIRROIROHHHIHIO OIIROCIHICHIOHCHROOCRHROOHCROC() {
      return new RHOCHHIRRCHHHOHOIRROIROHHHIHIO();
   }

   static RHOCHHIRRCHHHOHOIRROIROHHHIHIO[] OHHCIIOCHOHIOORRCCOIOHHCHIIHOI(int var0) {
      if (var0 == 0) {
         return ORIHRHRCRCOCOHRCCCCCIIRIRORRIC;
      }

      RHOCHHIRRCHHHOHOIRROIROHHHIHIO[] var1 = new RHOCHHIRRCHHHOHOIRROIROHHHIHIO[var0];

      for (int var2 = 0; var2 < var0; var2++) {
         var1[var2] = OIIROCIHICHIOHCHROOCRHROOHCROC();
      }

      return var1;
   }
}
