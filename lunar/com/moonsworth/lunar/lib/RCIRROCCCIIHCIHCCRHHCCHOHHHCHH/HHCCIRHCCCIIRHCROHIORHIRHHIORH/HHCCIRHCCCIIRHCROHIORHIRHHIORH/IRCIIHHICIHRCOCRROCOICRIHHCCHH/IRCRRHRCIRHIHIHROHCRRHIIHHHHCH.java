package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;

@com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
public class IRCRRHRCIRHIHIHROHCRRHIIHHHHCH
   extends com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR
   implements Serializable {
   private static final long CHRCOIIRCHRRHIIOIOHOHHIHHRROHC = 1L;
   public static final int HROORICOHOHCHCHRORIOIICIHHROCO = 1;
   public static final int IHHOOIIIRIORCHCOOCHHOORIIRIICH = 2;
   public static final int IHCOHCRIICRCIHIRRORRHCIHOIIOCH = 3;
   public static final int OIIOHHCCCIHIICOHRRIIIRCIORIHII = 4;
   public static final int HRCIROIIHIICCRIOIHIHOCHOOOHHHC = 5;
   public static final int COIOCICHOIRHCHIICIIRCOOROIIRRO = 6;
   public static final int RRHCCHCCHOHCICOCCOHCCOHRCHOCOC = 7;
   public static final int CROCOOORHRCRHHHHHHHIRHOHCHHHHH = 8;
   public static final int IRHOOIRRCHROIRIOOOHHHHRRRCHHOR = 9;
   public static final int IRICCIOHCROHOIOHHOOCOIHOHIRIOO = 10;
   public static final int RCHHIHOCHIORHIROCRRIOIOCRICCOC = 11;
   public static final int RRRRIIIOCICCORCHIOHIORCHCOCOHH = 12;
   public static final int CIROIIIHOCOIICCORHOCCHRRHOICCO = 13;
   public static final int HRROOOIIICIRCCOIRIOCCCRCCHOROR = 14;
   public static final int OIOCHRRHRRHOHRIRRCORCRRRCIOIOR = 15;
   public static final int ORRHCRIORORHIRORHHIHHIHROOIIHI = 16;
   public static final int RRRCHIIOHOOCIIRCHIOHOIHHCOCHCR = 17;
   protected final int CCIIROHRICHRCHIHRHCORRRHCOCOIR;
   protected final Class<?> ROORIHCHRCRRRICROIHRHROHRCHCHR;
   protected final IIRHCHHOICHRICOOCRORCCIOOIHOIR<?> IRHIIOCRCHROROCRRIHCRORIRRIOOH;

   protected IRCRRHRCIRHIHIHROHCRRHIIHHHHCH(int var1, Class<?> var2) {
      this(var1, var2, null);
   }

   protected IRCRRHRCIRHIHIHROHCRRHIIHHHHCH(int var1, Class<?> var2, IIRHCHHOICHRICOOCRORCCIOOIHOIR<?> var3) {
      this.CCIIROHRICHRCHIHRHCORRRHCOCOIR = var1;
      this.ROORIHCHRCRRRICROIHRHROHRCHCHR = var2;
      this.IRHIIOCRCHROROCRRIHCRORIRRIOOH = var3;
   }

   public static IRCRRHRCIRHIHIHROHCRRHIIHHHHCH COCCRCRCRHROIRCCHOHRICCCIOCICI(Class<?> var0) {
      if (var0 != String.class && var0 != Object.class && var0 != CharSequence.class && var0 != Serializable.class) {
         byte var1;
         if (var0 == UUID.class) {
            var1 = 12;
         } else if (var0 == Integer.class) {
            var1 = 5;
         } else if (var0 == Long.class) {
            var1 = 6;
         } else if (var0 == Date.class) {
            var1 = 10;
         } else if (var0 == Calendar.class) {
            var1 = 11;
         } else if (var0 == Boolean.class) {
            var1 = 1;
         } else if (var0 == Byte.class) {
            var1 = 2;
         } else if (var0 == Character.class) {
            var1 = 4;
         } else if (var0 == Short.class) {
            var1 = 3;
         } else if (var0 == Float.class) {
            var1 = 7;
         } else if (var0 == Double.class) {
            var1 = 8;
         } else if (var0 == URI.class) {
            var1 = 13;
         } else if (var0 == URL.class) {
            var1 = 14;
         } else if (var0 == Class.class) {
            var1 = 15;
         } else {
            if (var0 == Locale.class) {
               IIRHCHHOICHRICOOCRORCCIOOIHOIR var3 = IIRHCHHOICHRICOOCRORCCIOOIHOIR.ROIOROHRIHRRHIHRRRIHHHIICCHIOI(Locale.class);
               return new IRCRRHRCIRHIHIHROHCRRHIIHHHHCH(9, var0, var3);
            }

            if (var0 == Currency.class) {
               IIRHCHHOICHRICOOCRORCCIOOIHOIR var2 = IIRHCHHOICHRICOOCRORCCIOOIHOIR.ROIOROHRIHRRHIHRRRIHHHIICCHIOI(Currency.class);
               return new IRCRRHRCIRHIHIHROHCRRHIIHHHHCH(16, var0, var2);
            }

            if (var0 != byte[].class) {
               return null;
            }

            var1 = 17;
         }

         return new IRCRRHRCIRHIHIHROHCRRHIIHHHHCH(var1, var0);
      } else {
         return IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RICHIIOOOHORCHORORHIHIRRHCOOIH(var0);
      }
   }

   @Override
   public Object RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      String var1, com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2
   ) {
      if (var1 == null) {
         return null;
      }

      try {
         Object var3 = this.CRRRICCRROCOHHOHIICIHORCOORRRH(var1, var2);
         if (var3 != null) {
            return var3;
         }
      } catch (Exception var4) {
         return var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            this.ROORIHCHRCRRRICROIHRHROHRCHCHR,
            var1,
            "not a valid representation, problem: (%s) %s",
            var4.getClass().getName(),
            com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IHIRRIIORRHORHRORIHOROIRCORCOO(
               var4
            )
         );
      }

      return com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HIORIIIIOCCCRCHCOROROCCOIOOIIR(
               this.ROORIHCHRCRRRICROIHRHROHRCHCHR
            )
            && var2.IIICIOIHIHICHHIHRICHCIRHHIIRII()
               .HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                  com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.READ_UNKNOWN_ENUM_VALUES_AS_NULL
               )
         ? null
         : var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.ROORIHCHRCRRRICROIHRHROHRCHCHR, var1, "not a valid representation");
   }

   public Class<?> CIIRROOIIIORHCIRHHIICHRIICRRHI() {
      return this.ROORIHCHRCRRRICROIHRHROHRCHCHR;
   }

   protected Object CRRRICCRROCOHHOHIICIHORCOORRRH(
      String var1, com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2
   ) {
      switch (this.CCIIROHRICHRCHIHRHCORRRHCOCOIR) {
         case 1:
            if ("true".equals(var1)) {
               return Boolean.TRUE;
            } else {
               if ("false".equals(var1)) {
                  return Boolean.FALSE;
               }

               return var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.ROORIHCHRCRRRICROIHRHROHRCHCHR, var1, "value not 'true' or 'false'");
            }
         case 2:
            int var11 = this.HCOIOCCRRORCCHHCCHHCCCCCICIIRH(var1);
            if (var11 >= -128 && var11 <= 255) {
               return (byte)var11;
            }

            return var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.ROORIHCHRCRRRICROIHRHROHRCHCHR, var1, "overflow, value cannot be represented as 8-bit value");
         case 3:
            int var3 = this.HCOIOCCRRORCCHHCCHHCCCCCICIIRH(var1);
            if (var3 >= -32768 && var3 <= 32767) {
               return (short)var3;
            }

            return var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.ROORIHCHRCRRRICROIHRHROHRCHCHR, var1, "overflow, value cannot be represented as 16-bit value");
         case 4:
            if (var1.length() == 1) {
               return var1.charAt(0);
            }

            return var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.ROORIHCHRCRRRICROIHRHROHRCHCHR, var1, "can only convert 1-character Strings");
         case 5:
            return this.HCOIOCCRRORCCHHCCHHCCCCCICIIRH(var1);
         case 6:
            return this.RHICIOIORRRRHCHIICRCCIHIOCIRCC(var1);
         case 7:
            return (float)this._parseDouble(var1);
         case 8:
            return this._parseDouble(var1);
         case 9:
            try {
               return this.IRHIIOCRCHROROCRRIHCRORIRRIOOH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, var2);
            } catch (IllegalArgumentException var10) {
               return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var1, var10);
            }
         case 10:
            return var2.CHCCHCHORCHRIHHOHRHCRRRRIHOHCO(var1);
         case 11:
            return var2.CRRRICCRROCOHHOHIICIHORCOORRRH(var2.CHCCHCHORCHRIHHOHRHCRRRRIHOHCO(var1));
         case 12:
            try {
               return UUID.fromString(var1);
            } catch (Exception var9) {
               return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var1, var9);
            }
         case 13:
            try {
               return URI.create(var1);
            } catch (Exception var8) {
               return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var1, var8);
            }
         case 14:
            try {
               return new URL(var1);
            } catch (MalformedURLException var7) {
               return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var1, var7);
            }
         case 15:
            try {
               return var2.findClass(var1);
            } catch (Exception var6) {
               return var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.ROORIHCHRCRRRICROIHRHROHRCHCHR, var1, "unable to parse key as Class");
            }
         case 16:
            try {
               return this.IRHIIOCRCHROROCRRIHCRORIRRIOOH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, var2);
            } catch (IllegalArgumentException var5) {
               return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var1, var5);
            }
         case 17:
            try {
               return var2.IIICIOIHIHICHHIHRICHCIRHHIIRII().RCCIOIICIOCROOHHORRHROIRRIOCOC().decode(var1);
            } catch (IllegalArgumentException var4) {
               return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var1, var4);
            }
         default:
            throw new IllegalStateException("Internal error: unknown key type " + this.ROORIHCHRCRRRICROIHRHROHRCHCHR);
      }
   }

   protected int HCOIOCCRRORCCHHCCHHCCCCCICIIRH(String var1) {
      return com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IIHRRHORCRCROCHHOHORCHCROCIHRO.parseInt(
         var1
      );
   }

   protected long RHICIOIORRRRHCHIICRCCIHIOCIRCC(String var1) {
      return com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IIHRRHORCRCROCHHOHORCHCROCIHRO.OOCIIHHOHROOROHHCCRCIIHOICCIHC(
         var1
      );
   }

   protected double _parseDouble(String var1) {
      return com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IIHRRHORCRCROCHHOHORCHCROCIHRO.CROCOHCOIHHHCHOOHOOIHHHICHOHOI(
         var1
      );
   }

   protected Object RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1, String var2, Exception var3
   ) {
      return var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         this.ROORIHCHRCRRRICROIHRHROHRCHCHR,
         var2,
         "problem: %s",
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IHIRRIIORRHORHRORIHOROIRCORCOO(
            var3
         )
      );
   }

   static final class CRRRICCRROCOHHOHIICIHORCOORRRH extends IRCRRHRCIRHIHIHROHCRRHIIHHHHCH {
      private static final long CCIRCIICROHOCRHORRCRRRHHOIIIOH = 1L;
      final Method HORRCCCHROOICCHOIOHOOOHOIOHIOI;

      public CRRRICCRROCOHHOHIICIHORCOORRRH(Method var1) {
         super(-1, var1.getDeclaringClass());
         this.HORRCCCHROOICCHOIOHOOOHOIOHIOI = var1;
      }

      @Override
      public Object CRRRICCRROCOHHOHIICIHORCOORRRH(
         String var1, com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2
      ) {
         return this.HORRCCCHROOICCHOIOHOOOHOIOHIOI.invoke(null, var1);
      }
   }

   static final class HHCCIRHCCCIIRHCROHIORHIRHHIORH extends IRCRRHRCIRHIHIHROHCRRHIIHHHHCH {
      private static final long HCOHOIRIORHCCIIICCOHIHRHHIIRRR = 1L;
      protected final Constructor<?> ICHIROHHCHICHIIIHRICIOOCIHCIHC;

      public HHCCIRHCCCIIRHCROHIORHIRHHIORH(Constructor<?> var1) {
         super(-1, var1.getDeclaringClass());
         this.ICHIROHHCHICHIIIHRICIOOCIHCIHC = var1;
      }

      @Override
      public Object CRRRICCRROCOHHOHIICIHORCOORRRH(
         String var1, com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2
      ) {
         return this.ICHIROHHCHICHIIIHRICIOOCIHCIHC.newInstance(var1);
      }
   }

   @com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
   static final class IRCIIHHICIHRCOCRROCOICRIHHCCHH extends IRCRRHRCIRHIHIHROHCRRHIIHHHHCH {
      private static final long CCRHORIIRRRORCOCOHCIIIRCOCRIRO = 1L;
      protected final com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.HICHRCOHCCRHOHCICOOCHOIHCCHIRI CHOORRORCCRIIIOOOICRIHCRIICOHI;
      protected final com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HICHRCOHCCRHOHCICOOCHOIHCCHIRI HOCCROOICCICHHHIIICICIROCHOIRO;
      protected volatile com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.HICHRCOHCCRHOHCICOOCHOIHCCHIRI ICHHCHCROHHRRCIOCHOCHHOHOOOIOC;
      protected volatile com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.HICHRCOHCCRHOHCICOOCHOIHCCHIRI COCIIRHORICCRHIIHHIRHROCHOHCHO;
      protected final com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.HICHRCOHCCRHOHCICOOCHOIHCCHIRI IOICCIORICORICHHICOROCCIIHHIRO;
      protected final Enum<?> CHOHOCHOIORHCORROCCRHIHRRCIHCH;

      protected IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.HICHRCOHCCRHOHCICOOCHOIHCCHIRI var1,
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HICHRCOHCCRHOHCICOOCHOIHCCHIRI var2
      ) {
         super(-1, var1.IRRCRHOROHRORORIHOOCRRRHCROHOH());
         this.CHOORRORCCRIIIOOOICRIHCRIICOHI = var1;
         this.HOCCROOICCICHHHIIICICIROCHOIRO = var2;
         this.CHOHOCHOIORHCORROCCRHIHRRCIHCH = var1.RORRICHOOOHOORIHHRICIRHIICIRHC();
         this.IOICCIORICORICHHICOROCCIIHHIRO = null;
      }

      protected IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.HICHRCOHCCRHOHCICOOCHOIHCCHIRI var1,
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HICHRCOHCCRHOHCICOOCHOIHCCHIRI var2,
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.HICHRCOHCCRHOHCICOOCHOIHCCHIRI var3
      ) {
         super(-1, var1.IRRCRHOROHRORORIHOOCRRRHCROHOH());
         this.CHOORRORCCRIIIOOOICRIHCRIICOHI = var1;
         this.HOCCROOICCICHHHIIICICIROCHOIRO = var2;
         this.CHOHOCHOIORHCORROCCRHIHRRCIHCH = var1.RORRICHOOOHOORIHHRICIRHIICIRHC();
         this.IOICCIORICORICHHICOROCCIIHHIRO = var3;
      }

      @Override
      public Object CRRRICCRROCOHHOHIICIHORCOORRRH(
         String var1, com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2
      ) {
         if (this.HOCCROOICCICHHHIIICICIROCHOIRO != null) {
            try {
               return this.HOCCROOICCICHHHIIICICIROCHOIRO.OHRCIORHOCHOORCRHHOHRRRCCOICCO(var1);
            } catch (Exception var5) {
               com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RIROICHCRROROHCCROOCCCCOCHCCRI(
                  var5
               );
            }
         }

         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.HICHRCOHCCRHOHCICOOCHOIHCCHIRI var3 = this.HICRRICCHCCROOHHCHOCOCCHOIHHOC(
            var2
         );
         Enum var4 = var3.OICCIICHOOHHCCRCRCCRHCOCHHROCO(var1);
         if (var4 == null
            && var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CIOHHCORHRCCRICCCORIHCRHCCCRRR.READ_ENUM_KEYS_USING_INDEX
            )) {
            var3 = this.IHIRRIIORRHORHRORIHOROIRCORCOO(var2);
            var4 = var3.OICCIICHOOHHCCRCRCCRHCOCHHROCO(var1);
         }

         if (var4 == null) {
            if (this.CHOHOCHOIORHCORROCCRHIHRRCIHCH != null
               && var2.CRRRICCRROCOHHOHIICIHORCOORRRH(
                  com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE
               )) {
               var4 = this.CHOHOCHOIORHCORROCCRHIHRRCIHCH;
            } else if (!var2.CRRRICCRROCOHHOHIICIHORCOORRRH(
               com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.READ_UNKNOWN_ENUM_VALUES_AS_NULL
            )) {
               return var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  this.ROORIHCHRCRRRICROIHRHROHRCHCHR, var1, "not one of the values accepted for Enum class: %s", var3.CHHCHCCCCCIOORORIIHICHICCOCORO()
               );
            }
         }

         return var4;
      }

      protected com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.HICHRCOHCCRHOHCICOOCHOIHCCHIRI HICRRICCHCCROOHHCHOCOCCHOIHHOC(
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1
      ) {
         if (this.IOICCIORICORICHHICOROCCIIHHIRO != null) {
            return this.IOICCIORICORICHHICOROCCIIHHIRO;
         } else {
            return var1.CRRRICCRROCOHHOHIICIHORCOORRRH(
                  com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.READ_ENUMS_USING_TO_STRING
               )
               ? this.RIROICHCRROROHCCROOCCCCOCHCCRI(var1)
               : this.CHOORRORCCRIIIOOOICRIHCRIICOHI;
         }
      }

      private com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.HICHRCOHCCRHOHCICOOCHOIHCCHIRI RIROICHCRROROHCCROOCCCCOCHCCRI(
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1
      ) {
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.HICHRCOHCCRHOHCICOOCHOIHCCHIRI var2 = this.ICHHCHCROHHRRCIOCHOCHHOHOOOIOC;
         if (var2 == null) {
            synchronized (this) {
               var2 = this.ICHHCHCROHHRRCIOCHOCHHOHOOOIOC;
               if (var2 == null) {
                  var2 = com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(
                     var1.IIICIOIHIHICHHIHRICHCIRHHIIRII(), this.CHOORRORCCRIIIOOOICRIHCRIICOHI.IRRCRHOROHRORORIHOOCRRRHCROHOH()
                  );
                  this.ICHHCHCROHHRRCIOCHOCHHOHOOOIOC = var2;
               }
            }
         }

         return var2;
      }

      private com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.HICHRCOHCCRHOHCICOOCHOIHCCHIRI IHIRRIIORRHORHRORIHOROIRCORCOO(
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1
      ) {
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.HICHRCOHCCRHOHCICOOCHOIHCCHIRI var2 = this.COCIIRHORICCRHIIHHIRHROCHOHCHO;
         if (var2 == null) {
            synchronized (this) {
               var2 = this.COCIIRHORICCRHIIHHIRHROCHOHCHO;
               if (var2 == null) {
                  var2 = com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(
                     var1.IIICIOIHIHICHHIHRICHCIRHHIIRII(), this.CHOORRORCCRIIIOOOICRIHCRIICOHI.IRRCRHOROHRORORIHOOCRRRHCROHOH()
                  );
                  this.COCIIRHORICCRHIIHHIRHROCHOHCHO = var2;
               }
            }
         }

         return var2;
      }
   }

   static final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
      extends com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR
      implements Serializable {
      private static final long RIHOORRIOHCCROHRHORCOHIIIOIHIO = 1L;
      protected final Class<?> ICRRICICIIHCIHOROHROOIRHIOHIOH;
      protected final com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CIOHHCORHRCCRICCCORIHCRHCCCRRR<?> RHCHIHCHCRCHOIOIHIHCHORHOHORRI;

      protected RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         Class<?> var1, com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CIOHHCORHRCCRICCCORIHCRHCCCRRR<?> var2
      ) {
         this.ICRRICICIIHCIHOROHROOIRHIOHIOH = var1;
         this.RHCHIHCHCRCHOIOIHIHCHORHOHORRI = var2;
      }

      @Override
      public final Object RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         String var1, com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2
      ) {
         if (var1 == null) {
            return null;
         }

         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.OIHCOHRCICCCRHRCROOCIOIRRHHHIH var3 = var2.HCROOCOICRIOROOIROIHCOROOCOIOI();
         var3.writeString(var1);

         try {
            com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI var4 = var3.IIOOIHICHRCCRCIIOHIIRIOORCRCRH();
            var4.OHHCRICRRCCHOHIRIRIHOIRHIROOIC();
            Object var5 = this.RHCHIHCHCRCHOIOIHIHCHORHOHORRI.deserialize(var4, var2);
            return var5 != null ? var5 : var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.ICRRICICIIHCIHOROHROOIRHIOHIOH, var1, "not a valid representation");
         } catch (Exception var6) {
            return var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.ICRRICICIIHCIHOROHROOIRHIOHIOH, var1, "not a valid representation: %s", var6.getMessage());
         }
      }

      public Class<?> CIIRROOIIIORHCIRHHIICHRIICRRHI() {
         return this.ICRRICICIIHCIHOROHROOIRHIOHIOH;
      }
   }

   @com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
   static final class RRCRRCORICCHOHHIRCHIROOHIIOHCO extends IRCRRHRCIRHIHIHROHCRRHIIHHHHCH {
      private static final long ORIIHRHHRCIIIHORHHHCCHRCHOIHCH = 1L;
      private static final IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RRCRRCORICCHOHHIRCHIROOHIIOHCO OHIORIRHCRCICHROHRRHICOROIIHOO = new IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RRCRRCORICCHOHHIRCHIROOHIIOHCO(
         String.class
      );
      private static final IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RRCRRCORICCHOHHIRCHIROOHIIOHCO CHOCCRORIRORCCOCORCCROICCCOOIH = new IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RRCRRCORICCHOHHIRCHIROOHIIOHCO(
         Object.class
      );

      private RRCRRCORICCHOHHIRCHIROOHIIOHCO(Class<?> var1) {
         super(-1, var1);
      }

      public static IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RRCRRCORICCHOHHIRCHIROOHIIOHCO RICHIIOOOHORCHORORHIHIRRHCOOIH(Class<?> var0) {
         if (var0 == String.class) {
            return OHIORIRHCRCICHROHRRHICOROIIHOO;
         } else {
            return var0 == Object.class ? CHOCCRORIRORCCOCORCCROICCCOOIH : new IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var0);
         }
      }

      @Override
      public Object RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         String var1, com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2
      ) {
         return var1;
      }
   }
}
