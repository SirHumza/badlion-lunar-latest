package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

public final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private static final int HROIIOIOCCORHOHORCOCCHRHHRRRIO = 64;
   private static final int ROHCCIOOORIHIIHCRIHHRHOIOOHOOO = 65536;
   private static final int ICOORICOIOIOIRCHRHROICHIOOCRRH = 16;
   protected static final int IRRHHCHRHHCORRCCHOIOHIHRICIHCR = 6000;
   protected final com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH IRHCORIICCHRCIHHRHRCOIIRCHHOHH;
   protected final AtomicReference<com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> ORRRRHRCRRCRIIIIIRRCOORIROHIRR;
   protected final int RICIOIRIHCOHOOHRCRCCHOCCHIHHHI;
   protected final boolean OIIIIHHRCCCICOIIRHCHRORRHIICCC;
   protected final boolean CIOIHCHRCCHIOOOHCCRCCCHCHOCHOC;
   protected int[] CCHCOHCHCRIIORRICCRROCCCIRROIO;
   protected int CCOIOIROCHOHOHOHRHOHRIHOHHCHHH;
   protected int HCRHIHRIORCRROOIOHHIOORIIRHIII;
   protected int CCICOIOCRHHIIROORHRRIIRHIROCRR;
   protected int OIICCOROOOHCORRCIOOICRRICIRCCO;
   protected int HIIOIIIIOCROIHIIRIIOROCIHRIHRI;
   protected String[] RCOHCHRHIOOICCHRCORHCICCRCRIRR;
   protected int CHRHRRCOCIRIIIIHCROCCRIHRHRIHO;
   protected int IRIOHRIIICCCROHORCHHCRCCICHIRO;
   protected boolean HRHRCRIIHOIIIIIIRHOOHOOHHRHRIR;
   private static final int HHCHCOIRIHCHCOICOIRRICHOOORRCO = 33;
   private static final int HIOCOHOOOHRHHOHOIIOHCCHOCHCROC = 65599;
   private static final int IHIHOCIHHCCOOCOOHOCCHIRCOOHIHO = 31;

   private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(int var1, int var2) {
      this.IRHCORIICCHRCIHHRHRCOIIRCHHOHH = null;
      this.HIIOIIIIOCROIHIIRIIOROCIHRIHRI = 0;
      this.HRHRCRIIHOIIIIIIRHOOHOOHHRHRIR = true;
      this.RICIOIRIHCOHOOHRCRCCHOCCHIHHHI = var2;
      this.OIIIIHHRCCCICOIIRHCHRORRHIICCC = false;
      this.CIOIHCHRCCHIOOOHCCRCCCHCHOCHOC = true;
      if (var1 < 16) {
         var1 = 16;
      } else if ((var1 & var1 - 1) != 0) {
         byte var3 = 16;

         while (var3 < var1) {
            var3 += var3;
         }

         var1 = var3;
      }

      this.ORRRRHRCRRCRIIIIIRRCOORIROHIRR = new AtomicReference<>(
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRCHCROCHRROHROOCCHIHIOCHOICOC(
            var1
         )
      );
   }

   private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1,
      int var2,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3,
      boolean var4,
      boolean var5
   ) {
      this.IRHCORIICCHRCIHHRHRCOIIRCHHOHH = var1;
      this.RICIOIRIHCOHOOHRCRCCHOCCHIHHHI = var2;
      this.OIIIIHHRCCCICOIIRHCHRORRHIICCC = var4;
      this.CIOIHCHRCCHIOOOHCCRCCCHCHOCHOC = var5;
      this.ORRRRHRCRRCRIIIIIRRCOORIROHIRR = null;
      this.HIIOIIIIOCROIHIIRIIOROCIHRIHRI = var3.HOCCOHRCOOIOICRRCCORCOHCIICICC;
      this.CCOIOIROCHOHOHOHRHOHRIHOHHCHHH = var3.ROIICOIRICCIHOOCRHHIHHRIRIHCCR;
      this.HCRHIHRIORCRROOIOHHIOORIIRHIII = this.CCOIOIROCHOHOHOHRHOHRIHOHHCHHH << 2;
      this.CCICOIOCRHHIIROORHRRIIRHIROCRR = this.HCRHIHRIORCRROOIOHHIOORIIRHIII + (this.HCRHIHRIORCRROOIOHHIOORIIRHIII >> 1);
      this.OIICCOROOOHCORRCIOOICRRICIRCCO = var3.COOIRCHCRIRCIROCCRRIRRRCIRIRCH;
      this.CCHCOHCHCRIIORRICCRROCCCIRROIO = var3.HHCOIICRRIOHCIRHHORHHIRCOIICHI;
      this.RCOHCHRHIOOICCHRCORHCICCRCRIRR = var3.HHRICCCICOCIHCHHCIIRORCHRRHICO;
      this.CHRHRRCOCIRIIIIHCROCCRIHRHRIHO = var3.ICRHRROOICORORRROHIRCIRRCCOIOO;
      this.IRIOHRIIICCCROHORCHHCRCCICHIRO = var3.ICHRRIRRCICOHHIRRRCOICIIIIHHCI;
      this.HRHRCRIIHOIIIIIIRHOOHOOHHRHRIR = true;
   }

   private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1
   ) {
      this.IRHCORIICCHRCIHHRHRCOIIRCHHOHH = null;
      this.RICIOIRIHCOHOOHRCRCCHOCCHIHHHI = 0;
      this.OIIIIHHRCCCICOIIRHCHRORRHIICCC = false;
      this.CIOIHCHRCCHIOOOHCCRCCCHCHOCHOC = true;
      this.ORRRRHRCRRCRIIIIIRRCOORIROHIRR = null;
      this.HIIOIIIIOCROIHIIRIIOROCIHRIHRI = -1;
      this.CCHCOHCHCRIIORRICCRROCCCIRROIO = var1.HHCOIICRRIOHCIRHHORHHIRCOIICHI;
      this.RCOHCHRHIOOICCHRCORHCICCRCRIRR = var1.HHRICCCICOCIHCHHCIIRORCHRRHICO;
      this.CCOIOIROCHOHOHOHRHOHRIHOHHCHHH = var1.ROIICOIRICCIHOOCRHHIHHRIRIHCCR;
      int var2 = this.CCHCOHCHCRIIORRICCRROCCCIRROIO.length;
      this.HCRHIHRIORCRROOIOHHIOORIIRHIII = var2;
      this.CCICOIOCRHHIIROORHRRIIRHIROCRR = var2;
      this.OIICCOROOOHCORRCIOOICRRICIRCCO = 1;
      this.CHRHRRCOCIRIIIIHCROCCRIHRHRIHO = var2;
      this.IRIOHRIIICCCROHORCHHCRCCICHIRO = var2;
      this.HRHRCRIIHOIIIIIIRHOOHOOHHRHRIR = true;
   }

   public static com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH CHHICCOCHHROOCIHIHRIHORICRCRIC() {
      long var0 = System.currentTimeMillis();
      int var2 = (int)var0 + (int)(var0 >>> 32) | 1;
      return HOOCOICCCRRCIRIIRCCIIRRIICHRHI(var2);
   }

   protected static com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH HOOCOICCCRRCIRIIRCCIIRRIICHRHI(
      int var0
   ) {
      return new com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         64, var0
      );
   }

   public com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH IRCROOOORIRIHOORHRHCIHICIIRROO(
      int var1
   ) {
      return new com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         this,
         this.RICIOIRIHCOHOOHRCRCCHOCCHIHHHI,
         this.ORRRRHRCRRCRIIIIIRRCOORIROHIRR.get(),
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.INTERN_FIELD_NAMES
            .enabledIn(var1),
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.FAIL_ON_SYMBOL_HASH_OVERFLOW
            .enabledIn(var1)
      );
   }

   public com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH CHIHCHORCIRIROHIRIICIHCRCCHHRH(
      int var1
   ) {
      return com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CANONICALIZE_FIELD_NAMES
            .enabledIn(var1)
         ? new com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            this,
            this.RICIOIRIHCOHOOHRCRCCHOCCHIHHHI,
            this.ORRRRHRCRRCRIIIIIRRCOORIROHIRR.get(),
            com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.INTERN_FIELD_NAMES
               .enabledIn(var1),
            com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.FAIL_ON_SYMBOL_HASH_OVERFLOW
               .enabledIn(var1)
         )
         : new com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            this.ORRRRHRCRRCRIIIIIRRCOORIROHIRR.get()
         );
   }

   public void release() {
      if (this.IRHCORIICCHRCIHHRHRCOIIRCHHOHH != null && this.OCOCCOOHORCIICRICRCCHRORRHIHIC()) {
         this.IRHCORIICCHRCIHHRHRCOIIRCHHOHH
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               new com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  this
               )
            );
         this.HRHRCRIIHOIIIIIIRHOOHOOHHRHRIR = true;
      }
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1
   ) {
      int var2 = var1.HOCCOHRCOOIOICRRCCORCOHCIICICC;
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3 = this.ORRRRHRCRRCRIIIIIRRCOORIROHIRR
         .get();
      if (var2 != var3.HOCCOHRCOOIOICRRCCORCOHCIICICC) {
         if (var2 > 6000) {
            var1 = com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRCHCROCHRROHROOCCHIHIOCHOICOC(
               64
            );
         }

         this.ORRRRHRCRRCRIIIIIRRCOORIROHIRR.compareAndSet(var3, var1);
      }
   }

   public int size() {
      return this.ORRRRHRCRRCRIIIIIRRCOORIROHIRR != null
         ? this.ORRRRHRCRRCRIIIIIRRCOORIROHIRR.get().HOCCOHRCOOIOICRRCCORCOHCIICICC
         : this.HIIOIIIIOCROIHIIRIIOROCIHRIHRI;
   }

   public int CORRIRCORCRIIHOOOHIORRCROIIRRC() {
      return this.CCOIOIROCHOHOHOHRHOHRIHOHHCHHH;
   }

   public boolean OCOCCOOHORCIICRICRCCHRORRHIHIC() {
      return !this.HRHRCRIIHOIIIIIIRHOOHOOHHRHRIR;
   }

   public int RIRHICHORRHRCOIOIHIOCCOIHCRCRI() {
      return this.RICIOIRIHCOHOOHRCRCCHOCCHIHHHI;
   }

   public boolean IHICRORICCCRICCOCRIOHOHOCCCOIH() {
      return this.IRHCORIICCHRCIHHRHRCOIIRCHHOHH != null;
   }

   public int IRRORCHHROIRRHIOCORHCIRCCORCHO() {
      int var1 = 0;
      byte var2 = 3;

      for (int var3 = this.HCRHIHRIORCRROOIOHHIOORIIRHIII; var2 < var3; var2 += 4) {
         if (this.CCHCOHCHCRIIORRICCRROCCCIRROIO[var2] != 0) {
            var1++;
         }
      }

      return var1;
   }

   public int IHRRHICRRHCHCHHHCHIRHOOIOCOHIR() {
      int var1 = 0;
      int var2 = this.HCRHIHRIORCRROOIOHHIOORIIRHIII + 3;

      for (int var3 = this.CCICOIOCRHHIIROORHRRIIRHIROCRR; var2 < var3; var2 += 4) {
         if (this.CCHCOHCHCRIIORRICCRROCCCIRROIO[var2] != 0) {
            var1++;
         }
      }

      return var1;
   }

   public int OIICRIOOOIHRCIIIRCRICOOOOCRCOR() {
      int var1 = 0;
      int var2 = this.CCICOIOCRHHIIROORHRRIIRHIROCRR + 3;

      for (int var3 = var2 + this.CCOIOIROCHOHOHOHRHOHRIHOHHCHHH; var2 < var3; var2 += 4) {
         if (this.CCHCOHCHCRIIORRICCRROCCCIRROIO[var2] != 0) {
            var1++;
         }
      }

      return var1;
   }

   public int HCIOHIORCOCIHHROCHOOORROOOOIOC() {
      return this.CHRHRRCOCIRIIIIHCROCCRIHRHRIHO - this.IIHCRCCRHIOCRCHOHCIOOHRHORHCIC() >> 2;
   }

   public int RIOIRIOCIROCOORIRCIOCRROORRCII() {
      int var1 = 0;
      byte var2 = 3;

      for (int var3 = this.CCOIOIROCHOHOHOHRHOHRIHOHHCHHH << 3; var2 < var3; var2 += 4) {
         if (this.CCHCOHCHCRIIORRICCRROCCCIRROIO[var2] != 0) {
            var1++;
         }
      }

      return var1;
   }

   @Override
   public String toString() {
      int var1 = this.IRRORCHHROIRRHIOCORHCIRCCORCHO();
      int var2 = this.IHRRHICRRHCHCHHHCHIRHOOIOCOHIR();
      int var3 = this.OIICRIOOOIHRCIIIRCRICOOOOCRCOR();
      int var4 = this.HCIOHIORCOCIHHROCHOOORROOOOIOC();
      int var5 = this.RIOIRIOCIROCOORIRCIOCRROORRCII();
      return String.format(
         "[%s: size=%d, hashSize=%d, %d/%d/%d/%d pri/sec/ter/spill (=%s), total:%d]",
         this.getClass().getName(),
         this.HIIOIIIIOCROIHIIRIIOROCIHRIHRI,
         this.CCOIOIROCHOHOHOHRHOHRIHOHHCHHH,
         var1,
         var2,
         var3,
         var4,
         var1 + var2 + var3 + var4,
         var5
      );
   }

   public String IOORHRRIIHRCORHOOHOOOHCOOROCHO(int var1) {
      int var2 = this.RCRCCIHHHCCIRIIOCORORIIRCRIHCI(this.CIOICIOOROIHHHCOIHOIIRHCCIORCI(var1));
      int[] var3 = this.CCHCOHCHCRIIORRICCRROCCCIRROIO;
      int var4 = var3[var2 + 3];
      if (var4 == 1) {
         if (var3[var2] == var1) {
            return this.RCOHCHRHIOOICCHRCORHCICCRCRIRR[var2 >> 2];
         }
      } else if (var4 == 0) {
         return null;
      }

      int var5 = this.HCRHIHRIORCRROOIOHHIOORIIRHIII + (var2 >> 3 << 2);
      var4 = var3[var5 + 3];
      if (var4 == 1) {
         if (var3[var5] == var1) {
            return this.RCOHCHRHIOOICCHRCORHCICCRCRIRR[var5 >> 2];
         }
      } else if (var4 == 0) {
         return null;
      }

      return this.CROHHORHOOORICOCHCOOHIROIOCIRO(var2, var1);
   }

   public String IOIHHIORCICCHIIHOIOIOHHRICRHIO(int var1, int var2) {
      int var3 = this.RCRCCIHHHCCIRIIOCORORIIRCRIHCI(this.HOIRIRROOCICRHIRIHCIRCOHCIHHHO(var1, var2));
      int[] var4 = this.CCHCOHCHCRIIORRICCRROCCCIRROIO;
      int var5 = var4[var3 + 3];
      if (var5 == 2) {
         if (var1 == var4[var3] && var2 == var4[var3 + 1]) {
            return this.RCOHCHRHIOOICCHRCORHCICCRCRIRR[var3 >> 2];
         }
      } else if (var5 == 0) {
         return null;
      }

      int var6 = this.HCRHIHRIORCRROOIOHHIOORIIRHIII + (var3 >> 3 << 2);
      var5 = var4[var6 + 3];
      if (var5 == 2) {
         if (var1 == var4[var6] && var2 == var4[var6 + 1]) {
            return this.RCOHCHRHIOOICCHRCORHCICCRCRIRR[var6 >> 2];
         }
      } else if (var5 == 0) {
         return null;
      }

      return this.HRCOCHHHCCIORCORCHIOOOCCCCHICH(var3, var1, var2);
   }

   public String HRRHRCCOOIOIIIRORIOOORORHOORIH(int var1, int var2, int var3) {
      int var4 = this.RCRCCIHHHCCIRIIOCORORIIRCRIHCI(this.IIHHICHCCCOHCHROIRIHICCHHOROCR(var1, var2, var3));
      int[] var5 = this.CCHCOHCHCRIIORRICCRROCCCIRROIO;
      int var6 = var5[var4 + 3];
      if (var6 == 3) {
         if (var1 == var5[var4] && var5[var4 + 1] == var2 && var5[var4 + 2] == var3) {
            return this.RCOHCHRHIOOICCHRCORHCICCRCRIRR[var4 >> 2];
         }
      } else if (var6 == 0) {
         return null;
      }

      int var7 = this.HCRHIHRIORCRROOIOHHIOORIIRHIII + (var4 >> 3 << 2);
      var6 = var5[var7 + 3];
      if (var6 == 3) {
         if (var1 == var5[var7] && var5[var7 + 1] == var2 && var5[var7 + 2] == var3) {
            return this.RCOHCHRHIOOICCHRCORHCICCRCRIRR[var7 >> 2];
         }
      } else if (var6 == 0) {
         return null;
      }

      return this.IIHRHCCOOHOOOOCHRRCOROOIOHCOOO(var4, var1, var2, var3);
   }

   public String CRRRICCRROCOHHOHIICIHORCOORRRH(int[] var1, int var2) {
      if (var2 < 4) {
         switch (var2) {
            case 1:
               return this.IOORHRRIIHRCORHOOHOOOHCOOROCHO(var1[0]);
            case 2:
               return this.IOIHHIORCICCHIIHOIOIOHHRICRHIO(var1[0], var1[1]);
            case 3:
               return this.HRRHRCCOOIOIIIRORIOOORORHOORIH(var1[0], var1[1], var1[2]);
            default:
               return "";
         }
      } else {
         int var3 = this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var1, var2);
         int var4 = this.RCRCCIHHHCCIRIIOCORORIIRCRIHCI(var3);
         int[] var5 = this.CCHCOHCHCRIIORRICCRROCCCIRROIO;
         int var6 = var5[var4 + 3];
         if (var3 == var5[var4] && var6 == var2 && this.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var1, var2, var5[var4 + 1])) {
            return this.RCOHCHRHIOOICCHRCORHCICCRCRIRR[var4 >> 2];
         }

         if (var6 == 0) {
            return null;
         }

         int var7 = this.HCRHIHRIORCRROOIOHHIOORIIRHIII + (var4 >> 3 << 2);
         int var8 = var5[var7 + 3];
         return var3 == var5[var7] && var8 == var2 && this.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var1, var2, var5[var7 + 1])
            ? this.RCOHCHRHIOOICCHRCORHCICCRCRIRR[var7 >> 2]
            : this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4, var3, var1, var2);
      }
   }

   private final int RCRCCIHHHCCIRIIOCORORIIRCRIHCI(int var1) {
      int var2 = var1 & this.CCOIOIROCHOHOHOHRHOHRIHOHHCHHH - 1;
      return var2 << 2;
   }

   private String CROHHORHOOORICOCHCOOHIROIOCIRO(int var1, int var2) {
      int var3 = this.CCICOIOCRHHIIROORHRRIIRHIROCRR + (var1 >> this.OIICCOROOOHCORRCIOOICRRICIRCCO + 2 << this.OIICCOROOOHCORRCIOOICRRICIRCCO);
      int[] var4 = this.CCHCOHCHCRIIORRICCRROCCCIRROIO;
      int var5 = 1 << this.OIICCOROOOHCORRCIOOICRRICIRCCO;

      for (int var6 = var3 + var5; var3 < var6; var3 += 4) {
         int var7 = var4[var3 + 3];
         if (var2 == var4[var3] && 1 == var7) {
            return this.RCOHCHRHIOOICCHRCORHCICCRCRIRR[var3 >> 2];
         }

         if (var7 == 0) {
            return null;
         }
      }

      for (int var8 = this.IIHCRCCRHIOCRCHOHCIOOHRHORHCIC(); var8 < this.CHRHRRCOCIRIIIIHCROCCRIHRHRIHO; var8 += 4) {
         if (var2 == var4[var8] && 1 == var4[var8 + 3]) {
            return this.RCOHCHRHIOOICCHRCORHCICCRCRIRR[var8 >> 2];
         }
      }

      return null;
   }

   private String HRCOCHHHCCIORCORCHIOOOCCCCHICH(int var1, int var2, int var3) {
      int var4 = this.CCICOIOCRHHIIROORHRRIIRHIROCRR + (var1 >> this.OIICCOROOOHCORRCIOOICRRICIRCCO + 2 << this.OIICCOROOOHCORRCIOOICRRICIRCCO);
      int[] var5 = this.CCHCOHCHCRIIORRICCRROCCCIRROIO;
      int var6 = 1 << this.OIICCOROOOHCORRCIOOICRRICIRCCO;

      for (int var7 = var4 + var6; var4 < var7; var4 += 4) {
         int var8 = var5[var4 + 3];
         if (var2 == var5[var4] && var3 == var5[var4 + 1] && 2 == var8) {
            return this.RCOHCHRHIOOICCHRCORHCICCRCRIRR[var4 >> 2];
         }

         if (var8 == 0) {
            return null;
         }
      }

      for (int var9 = this.IIHCRCCRHIOCRCHOHCIOOHRHORHCIC(); var9 < this.CHRHRRCOCIRIIIIHCROCCRIHRHRIHO; var9 += 4) {
         if (var2 == var5[var9] && var3 == var5[var9 + 1] && 2 == var5[var9 + 3]) {
            return this.RCOHCHRHIOOICCHRCORHCICCRCRIRR[var9 >> 2];
         }
      }

      return null;
   }

   private String IIHRHCCOOHOOOOCHRRCOROOIOHCOOO(int var1, int var2, int var3, int var4) {
      int var5 = this.CCICOIOCRHHIIROORHRRIIRHIROCRR + (var1 >> this.OIICCOROOOHCORRCIOOICRRICIRCCO + 2 << this.OIICCOROOOHCORRCIOOICRRICIRCCO);
      int[] var6 = this.CCHCOHCHCRIIORRICCRROCCCIRROIO;
      int var7 = 1 << this.OIICCOROOOHCORRCIOOICRRICIRCCO;

      for (int var8 = var5 + var7; var5 < var8; var5 += 4) {
         int var9 = var6[var5 + 3];
         if (var2 == var6[var5] && var3 == var6[var5 + 1] && var4 == var6[var5 + 2] && 3 == var9) {
            return this.RCOHCHRHIOOICCHRCORHCICCRCRIRR[var5 >> 2];
         }

         if (var9 == 0) {
            return null;
         }
      }

      for (int var10 = this.IIHCRCCRHIOCRCHOHCIOOHRHORHCIC(); var10 < this.CHRHRRCOCIRIIIIHCROCCRIHRHRIHO; var10 += 4) {
         if (var2 == var6[var10] && var3 == var6[var10 + 1] && var4 == var6[var10 + 2] && 3 == var6[var10 + 3]) {
            return this.RCOHCHRHIOOICCHRCORHCICCRCRIRR[var10 >> 2];
         }
      }

      return null;
   }

   private String RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(int var1, int var2, int[] var3, int var4) {
      int var5 = this.CCICOIOCRHHIIROORHRRIIRHIROCRR + (var1 >> this.OIICCOROOOHCORRCIOOICRRICIRCCO + 2 << this.OIICCOROOOHCORRCIOOICRRICIRCCO);
      int[] var6 = this.CCHCOHCHCRIIORRICCRROCCCIRROIO;
      int var7 = 1 << this.OIICCOROOOHCORRCIOOICRRICIRCCO;

      for (int var8 = var5 + var7; var5 < var8; var5 += 4) {
         int var9 = var6[var5 + 3];
         if (var2 == var6[var5] && var4 == var9 && this.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var3, var4, var6[var5 + 1])) {
            return this.RCOHCHRHIOOICCHRCORHCICCRCRIRR[var5 >> 2];
         }

         if (var9 == 0) {
            return null;
         }
      }

      for (int var10 = this.IIHCRCCRHIOCRCHOHCIOOHRHORHCIC(); var10 < this.CHRHRRCOCIRIIIIHCROCCRIHRHRIHO; var10 += 4) {
         if (var2 == var6[var10] && var4 == var6[var10 + 3] && this.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var3, var4, var6[var10 + 1])) {
            return this.RCOHCHRHIOOICCHRCORHCICCRCRIRR[var10 >> 2];
         }
      }

      return null;
   }

   private boolean OOROOCCIRCCRHOIOIORIHCHHOOCCOR(int[] var1, int var2, int var3) {
      int[] var4 = this.CCHCOHCHCRIIORRICCRROCCCIRROIO;
      int var5 = 0;
      switch (var2) {
         case 8:
            if (var1[var5++] != var4[var3++]) {
               return false;
            }
         case 7:
            if (var1[var5++] != var4[var3++]) {
               return false;
            }
         case 6:
            if (var1[var5++] != var4[var3++]) {
               return false;
            }
         case 5:
            if (var1[var5++] != var4[var3++]) {
               return false;
            }
         case 4:
            if (var1[var5++] != var4[var3++]) {
               return false;
            } else if (var1[var5++] != var4[var3++]) {
               return false;
            } else if (var1[var5++] != var4[var3++]) {
               return false;
            } else {
               if (var1[var5++] != var4[var3++]) {
                  return false;
               }

               return true;
            }
         default:
            return this.CORCOCICIRIOHROHROIIOOHICCHCRR(var1, var2, var3);
      }
   }

   private boolean CORCOCICIRIOHROHROIIOOHICCHCRR(int[] var1, int var2, int var3) {
      int var4 = 0;

      while (var1[var4++] == this.CCHCOHCHCRIIORRICCRROCCCIRROIO[var3++]) {
         if (var4 >= var2) {
            return true;
         }
      }

      return false;
   }

   public String IIHRHCCOOHOOOOCHRRCOROOIOHCOOO(String var1, int var2) {
      this.OOHCOCOHHIICCOHOCIOHHOHCCHHOHR();
      if (this.OIIIIHHRCCCICOIIRHCHRORRHIICCC) {
         var1 = com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHRHCOCIHRCOICHRHCIHRIOOHHRRIR
            .CRHRCIRIOHCRRHIIOIOCRHCRRRIORR(var1);
      }

      int var3 = this.RIRRRCRIRIHCHIICHROROIOIOIOIRR(this.CIOICIOOROIHHHCOIHOIIRHCCIORCI(var2));
      this.CCHCOHCHCRIIORRICCRROCCCIRROIO[var3] = var2;
      this.CCHCOHCHCRIIORRICCRROCCCIRROIO[var3 + 3] = 1;
      this.RCOHCHRHIOOICCHRCORHCICCRCRIRR[var3 >> 2] = var1;
      this.HIIOIIIIOCROIHIIRIIOROCIHRIHRI++;
      return var1;
   }

   public String IHHCHHHCRIHOOCOIOOCRIIICIOROIR(String var1, int var2, int var3) {
      this.OOHCOCOHHIICCOHOCIOHHOHCCHHOHR();
      if (this.OIIIIHHRCCCICOIIRHCHRORRHIICCC) {
         var1 = com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHRHCOCIHRCOICHRHCIHRIOOHHRRIR
            .CRHRCIRIOHCRRHIIOIOCRHCRRRIORR(var1);
      }

      int var4 = this.HOIRIRROOCICRHIRIHCIRCOHCIHHHO(var2, var3);
      int var5 = this.RIRRRCRIRIHCHIICHROROIOIOIOIRR(var4);
      this.CCHCOHCHCRIIORRICCRROCCCIRROIO[var5] = var2;
      this.CCHCOHCHCRIIORRICCRROCCCIRROIO[var5 + 1] = var3;
      this.CCHCOHCHCRIIORRICCRROCCCIRROIO[var5 + 3] = 2;
      this.RCOHCHRHIOOICCHRCORHCICCRCRIRR[var5 >> 2] = var1;
      this.HIIOIIIIOCROIHIIRIIOROCIHRIHRI++;
      return var1;
   }

   public String RRCRRCORICCHOHHIRCHIROOHIIOHCO(String var1, int var2, int var3, int var4) {
      this.OOHCOCOHHIICCOHOCIOHHOHCCHHOHR();
      if (this.OIIIIHHRCCCICOIIRHCHRORRHIICCC) {
         var1 = com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHRHCOCIHRCOICHRHCIHRIOOHHRRIR
            .CRHRCIRIOHCRRHIIOIOCRHCRRRIORR(var1);
      }

      int var5 = this.RIRRRCRIRIHCHIICHROROIOIOIOIRR(this.IIHHICHCCCOHCHROIRIHICCHHOROCR(var2, var3, var4));
      this.CCHCOHCHCRIIORRICCRROCCCIRROIO[var5] = var2;
      this.CCHCOHCHCRIIORRICCRROCCCIRROIO[var5 + 1] = var3;
      this.CCHCOHCHCRIIORRICCRROCCCIRROIO[var5 + 2] = var4;
      this.CCHCOHCHCRIIORRICCRROCCCIRROIO[var5 + 3] = 3;
      this.RCOHCHRHIOOICCHRCORHCICCRCRIRR[var5 >> 2] = var1;
      this.HIIOIIIIOCROIHIIRIIOROCIHRIHRI++;
      return var1;
   }

   public String RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, int[] var2, int var3) {
      this.OOHCOCOHHIICCOHOCIOHHOHCCHHOHR();
      if (this.OIIIIHHRCCCICOIIRHCHRORRHIICCC) {
         var1 = com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHRHCOCIHRCOICHRHCIHRIOOHHRRIR
            .CRHRCIRIOHCRRHIIOIOCRHCRRRIORR(var1);
      }

      int var4;
      switch (var3) {
         case 1:
            var4 = this.RIRRRCRIRIHCHIICHROROIOIOIOIRR(this.CIOICIOOROIHHHCOIHOIIRHCCIORCI(var2[0]));
            this.CCHCOHCHCRIIORRICCRROCCCIRROIO[var4] = var2[0];
            this.CCHCOHCHCRIIORRICCRROCCCIRROIO[var4 + 3] = 1;
            break;
         case 2:
            var4 = this.RIRRRCRIRIHCHIICHROROIOIOIOIRR(this.HOIRIRROOCICRHIRIHCIRCOHCIHHHO(var2[0], var2[1]));
            this.CCHCOHCHCRIIORRICCRROCCCIRROIO[var4] = var2[0];
            this.CCHCOHCHCRIIORRICCRROCCCIRROIO[var4 + 1] = var2[1];
            this.CCHCOHCHCRIIORRICCRROCCCIRROIO[var4 + 3] = 2;
            break;
         case 3:
            var4 = this.RIRRRCRIRIHCHIICHROROIOIOIOIRR(this.IIHHICHCCCOHCHROIRIHICCHHOROCR(var2[0], var2[1], var2[2]));
            this.CCHCOHCHCRIIORRICCRROCCCIRROIO[var4] = var2[0];
            this.CCHCOHCHCRIIORRICCRROCCCIRROIO[var4 + 1] = var2[1];
            this.CCHCOHCHCRIIORRICCRROCCCIRROIO[var4 + 2] = var2[2];
            this.CCHCOHCHCRIIORRICCRROCCCIRROIO[var4 + 3] = 3;
            break;
         default:
            int var5 = this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var2, var3);
            var4 = this.RIRRRCRIRIHCHIICHROROIOIOIOIRR(var5);
            this.CCHCOHCHCRIIORRICCRROCCCIRROIO[var4] = var5;
            int var6 = this.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var2, var3);
            this.CCHCOHCHCRIIORRICCRROCCCIRROIO[var4 + 1] = var6;
            this.CCHCOHCHCRIIORRICCRROCCCIRROIO[var4 + 3] = var3;
      }

      this.RCOHCHRHIOOICCHRCORHCICCRCRIRR[var4 >> 2] = var1;
      this.HIIOIIIIOCROIHIIRIIOROCIHRIHRI++;
      return var1;
   }

   private void OOHCOCOHHIICCOHOCIOHHOHCCHHOHR() {
      if (this.HRHRCRIIHOIIIIIIRHOOHOOHHRHRIR) {
         if (this.IRHCORIICCHRCIHHRHRCOIIRCHHOHH == null) {
            if (this.HIIOIIIIOCROIHIIRIIOROCIHRIHRI == 0) {
               throw new IllegalStateException("Internal error: Cannot add names to Root symbol table");
            }

            throw new IllegalStateException("Internal error: Cannot add names to Placeholder symbol table");
         }

         this.CCHCOHCHCRIIORRICCRROCCCIRROIO = Arrays.copyOf(this.CCHCOHCHCRIIORRICCRROCCCIRROIO, this.CCHCOHCHCRIIORRICCRROCCCIRROIO.length);
         this.RCOHCHRHIOOICCHRCORHCICCRCRIRR = Arrays.copyOf(this.RCOHCHRHIOOICCHRCORHCICCRCRIRR, this.RCOHCHRHIOOICCHRCORHCICCRCRIRR.length);
         this.HRHRCRIIHOIIIIIIRHOOHOOHHRHRIR = false;
      }
   }

   private int RIRRRCRIRIHCHIICHROROIOIOIOIRR(int var1) {
      int var2 = this.RCRCCIHHHCCIRIIOCORORIIRCRIHCI(var1);
      int[] var3 = this.CCHCOHCHCRIIORRICCRROCCCIRROIO;
      if (var3[var2 + 3] == 0) {
         return var2;
      }

      if (this.OIRICIIHORIOCOOCOCHCORRRCHHHRC()) {
         return this.OCHOCHRIOCCHRCHOCROICCRRCIHIOC(var1);
      }

      int var4 = this.HCRHIHRIORCRROOIOHHIOORIIRHIII + (var2 >> 3 << 2);
      if (var3[var4 + 3] == 0) {
         return var4;
      }

      var4 = this.CCICOIOCRHHIIROORHRRIIRHIROCRR + (var2 >> this.OIICCOROOOHCORRCIOOICRRICIRCCO + 2 << this.OIICCOROOOHCORRCIOOICRRICIRCCO);
      int var5 = 1 << this.OIICCOROOOHCORRCIOOICRRICIRCCO;

      for (int var6 = var4 + var5; var4 < var6; var4 += 4) {
         if (var3[var4 + 3] == 0) {
            return var4;
         }
      }

      var2 = this.CHRHRRCOCIRIIIIHCROCCRIHRHRIHO;
      this.CHRHRRCOCIRIIIIHCROCCRIHRHRIHO += 4;
      int var9 = this.CCOIOIROCHOHOHOHRHOHRIHOHHCHHH << 3;
      if (this.CHRHRRCOCIRIIIIHCROCCRIHRHRIHO >= var9) {
         if (this.CIOIHCHRCCHIOOOHCCRCCCHCHOCHOC) {
            this.HHCCRORHIIOCHIHRORICOCCRCICRRH();
         }

         return this.OCHOCHRIOCCHRCHOCROICCRRCIHIOC(var1);
      } else {
         return var2;
      }
   }

   private int OCHOCHRIOCCHRCHOCROICCRRCIHIOC(int var1) {
      this.rehash();
      int var2 = this.RCRCCIHHHCCIRIIOCORORIIRCRIHCI(var1);
      int[] var3 = this.CCHCOHCHCRIIORRICCRROCCCIRROIO;
      if (var3[var2 + 3] == 0) {
         return var2;
      }

      int var4 = this.HCRHIHRIORCRROOIOHHIOORIIRHIII + (var2 >> 3 << 2);
      if (var3[var4 + 3] == 0) {
         return var4;
      }

      var4 = this.CCICOIOCRHHIIROORHRRIIRHIROCRR + (var2 >> this.OIICCOROOOHCORRCIOOICRRICIRCCO + 2 << this.OIICCOROOOHCORRCIOOICRRICIRCCO);
      int var5 = 1 << this.OIICCOROOOHCORRCIOOICRRICIRCCO;

      for (int var6 = var4 + var5; var4 < var6; var4 += 4) {
         if (var3[var4 + 3] == 0) {
            return var4;
         }
      }

      var2 = this.CHRHRRCOCIRIIIIHCROCCRIHRHRIHO;
      this.CHRHRRCOCIRIIIIHCROCCRIHRHRIHO += 4;
      return var2;
   }

   private boolean OIRICIIHORIOCOOCOCHCORRRCHHHRC() {
      if (this.HIIOIIIIOCROIHIIRIIOROCIHRIHRI > this.CCOIOIROCHOHOHOHRHOHRIHOHHCHHH >> 1) {
         int var1 = this.CHRHRRCOCIRIIIIHCROCCRIHRHRIHO - this.IIHCRCCRHIOCRCHOHCIOOHRHORHCIC() >> 2;
         if (var1 > 1 + this.HIIOIIIIOCROIHIIRIIOROCIHRIHRI >> 7 || this.HIIOIIIIOCROIHIIRIIOROCIHRIHRI > this.CCOIOIROCHOHOHOHRHOHRIHOHHCHHH * 0.8) {
            return true;
         }
      }

      return false;
   }

   private int RRCRRCORICCHOHHIRCHIROOHIIOHCO(int[] var1, int var2) {
      int var3 = this.IRIOHRIIICCCROHORCHHCRCCICHIRO;
      if (var3 + var2 > this.CCHCOHCHCRIIORRICCRROCCCIRROIO.length) {
         int var4 = var3 + var2 - this.CCHCOHCHCRIIORRICCRROCCCIRROIO.length;
         int var5 = Math.min(4096, this.CCOIOIROCHOHOHOHRHOHRIHOHHCHHH);
         int var6 = this.CCHCOHCHCRIIORRICCRROCCCIRROIO.length + Math.max(var4, var5);
         this.CCHCOHCHCRIIORRICCRROCCCIRROIO = Arrays.copyOf(this.CCHCOHCHCRIIORRICCRROCCCIRROIO, var6);
      }

      System.arraycopy(var1, 0, this.CCHCOHCHCRIIORRICCRROCCCIRROIO, var3, var2);
      this.IRIOHRIIICCCROHORCHHCRCCICHIRO += var2;
      return var3;
   }

   public int CIOICIOOROIHHHCOIHOIIRHCCIORCI(int var1) {
      int var2 = var1 ^ this.RICIOIRIHCOHOOHRCRCCHOCCHIHHHI;
      var2 += var2 >>> 16;
      var2 ^= var2 << 3;
      return var2 + (var2 >>> 12);
   }

   public int HOIRIRROOCICRHIRIHCIRCOHCIHHHO(int var1, int var2) {
      int var3 = var1;
      var3 += var3 >>> 15;
      var3 ^= var3 >>> 9;
      var3 += var2 * 33;
      var3 ^= this.RICIOIRIHCOHOOHRCRCCHOCCHIHHHI;
      var3 += var3 >>> 16;
      var3 ^= var3 >>> 4;
      return var3 + (var3 << 3);
   }

   public int IIHHICHCCCOHCHROIRIHICCHHOROCR(int var1, int var2, int var3) {
      int var4 = var1 ^ this.RICIOIRIHCOHOOHRCRCCHOCCHIHHHI;
      var4 += var4 >>> 9;
      var4 *= 31;
      var4 += var2;
      var4 *= 33;
      var4 += var4 >>> 15;
      var4 ^= var3;
      var4 += var4 >>> 4;
      var4 += var4 >>> 15;
      return var4 ^ var4 << 9;
   }

   public int RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(int[] var1, int var2) {
      if (var2 < 4) {
         throw new IllegalArgumentException("qlen is too short, needs to be at least 4");
      }

      int var3 = var1[0] ^ this.RICIOIRIHCOHOOHRCRCCHOCCHIHHHI;
      var3 += var3 >>> 9;
      var3 += var1[1];
      var3 += var3 >>> 15;
      var3 *= 33;
      var3 ^= var1[2];
      var3 += var3 >>> 4;

      for (int var4 = 3; var4 < var2; var4++) {
         int var5 = var1[var4];
         var5 ^= var5 >> 21;
         var3 += var5;
      }

      var3 *= 65599;
      var3 += var3 >>> 19;
      return var3 ^ var3 << 5;
   }

   private void rehash() {
      this.HRHRCRIIHOIIIIIIRHOOHOOHHRHRIR = false;
      int[] var1 = this.CCHCOHCHCRIIORRICCRROCCCIRROIO;
      String[] var2 = this.RCOHCHRHIOOICCHRCORHCICCRCRIRR;
      int var3 = this.CCOIOIROCHOHOHOHRHOHRIHOHHCHHH;
      int var4 = this.HIIOIIIIOCROIHIIRIIOROCIHRIHRI;
      int var5 = var3 + var3;
      int var6 = this.CHRHRRCOCIRIIIIHCROCCRIHRHRIHO;
      if (var5 > 65536) {
         this.CHHCOORRHCIOHROHIHRHOCOHOHCRIH(true);
      } else {
         this.CCHCOHCHCRIIORRICCRROCCCIRROIO = new int[var1.length + (var3 << 3)];
         this.CCOIOIROCHOHOHOHRHOHRIHOHHCHHH = var5;
         this.HCRHIHRIORCRROOIOHHIOORIIRHIII = var5 << 2;
         this.CCICOIOCRHHIIROORHRRIIRHIROCRR = this.HCRHIHRIORCRROOIOHHIOORIIRHIII + (this.HCRHIHRIORCRROOIOHHIOORIIRHIII >> 1);
         this.OIICCOROOOHCORRCIOOICRRICIRCCO = CHIOIOHHCRCIHHHRROORORHIHRORIH(var5);
         this.RCOHCHRHIOOICCHRCORHCICCRCRIRR = new String[var2.length << 1];
         this.CHHCOORRHCIOHROHIHRHOCOHOHCRIH(false);
         int var7 = 0;
         int[] var8 = new int[16];
         byte var9 = 0;

         for (int var10 = var6; var9 < var10; var9 += 4) {
            int var11 = var1[var9 + 3];
            if (var11 != 0) {
               var7++;
               String var12 = var2[var9 >> 2];
               switch (var11) {
                  case 1:
                     var8[0] = var1[var9];
                     this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var12, var8, 1);
                     break;
                  case 2:
                     var8[0] = var1[var9];
                     var8[1] = var1[var9 + 1];
                     this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var12, var8, 2);
                     break;
                  case 3:
                     var8[0] = var1[var9];
                     var8[1] = var1[var9 + 1];
                     var8[2] = var1[var9 + 2];
                     this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var12, var8, 3);
                     break;
                  default:
                     if (var11 > var8.length) {
                        var8 = new int[var11];
                     }

                     int var13 = var1[var9 + 1];
                     System.arraycopy(var1, var13, var8, 0, var11);
                     this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var12, var8, var11);
               }
            }
         }

         if (var7 != var4) {
            throw new IllegalStateException("Internal error: Failed rehash(), old count=" + var4 + ", copyCount=" + var7);
         }
      }
   }

   private void CHHCOORRHCIOHROHIHRHOCOHOHCRIH(boolean var1) {
      this.HIIOIIIIOCROIHIIRIIOROCIHRIHRI = 0;
      this.CHRHRRCOCIRIIIIHCROCCRIHRHRIHO = this.IIHCRCCRHIOCRCHOHCIOOHRHORHCIC();
      this.IRIOHRIIICCCROHORCHHCRCCICHIRO = this.CCOIOIROCHOHOHOHRHOHRIHOHHCHHH << 3;
      if (var1) {
         Arrays.fill(this.CCHCOHCHCRIIORRICCRROCCCIRROIO, 0);
         Arrays.fill(this.RCOHCHRHIOOICCHRCORHCICCRCRIRR, null);
      }
   }

   private final int IIHCRCCRHIOCRCHOHCIOOHRHORHCIC() {
      int var1 = this.CCOIOIROCHOHOHOHRHOHRIHOHHCHHH;
      return (var1 << 3) - var1;
   }

   protected void HHCCRORHIIOCHIHRORICOCCRCICRRH() {
      if (this.CCOIOIROCHOHOHOHRHOHRIHOHHCHHH > 1024) {
         throw new com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            "Spill-over slots in symbol table with "
               + this.HIIOIIIIOCROIHIIRIIOROCIHRIHRI
               + " entries, hash area of "
               + this.CCOIOIROCHOHOHOHRHOHRIHOHHCHHH
               + " slots is now full (all "
               + (this.CCOIOIROCHOHOHOHRHOHRIHOHHCHHH >> 3)
               + " slots -- suspect a DoS attack based on hash collisions. You can disable the check via `JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW`"
         );
      }
   }

   static int CHIOIOHHCRCIHHHRROORORHIHRORIH(int var0) {
      int var1 = var0 >> 2;
      if (var1 < 64) {
         return 4;
      } else if (var1 <= 256) {
         return 5;
      } else {
         return var1 <= 1024 ? 6 : 7;
      }
   }

   private static final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      public final int ROIICOIRICCIHOOCRHHIHHRIRIHCCR;
      public final int HOCCOHRCOOIOICRRCCORCOHCIICICC;
      public final int COOIRCHCRIRCIROCCRRIRRRCIRIRCH;
      public final int[] HHCOIICRRIOHCIRHHORHHIRCOIICHI;
      public final String[] HHRICCCICOCIHCHHCIIRORCHRRHICO;
      public final int ICRHRROOICORORRROHIRCIRRCCOIOO;
      public final int ICHRRIRRCICOHHIRRRCOICIIIIHHCI;

      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(int var1, int var2, int var3, int[] var4, String[] var5, int var6, int var7) {
         this.ROIICOIRICCIHOOCRHHIHHRIRIHCCR = var1;
         this.HOCCOHRCOOIOICRRCCORCOHCIICICC = var2;
         this.COOIRCHCRIRCIROCCRRIRRRCIRIRCH = var3;
         this.HHCOIICRRIOHCIRHHORHHIRCOIICHI = var4;
         this.HHRICCCICOCIHCHHCIIRORCHRRHICO = var5;
         this.ICRHRROOICORORRROHIRCIRRCCOIOO = var6;
         this.ICHRRIRRCICOHHIRRRCOICIIIIHHCI = var7;
      }

      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1
      ) {
         this.ROIICOIRICCIHOOCRHHIHHRIRIHCCR = var1.CCOIOIROCHOHOHOHRHOHRIHOHHCHHH;
         this.HOCCOHRCOOIOICRRCCORCOHCIICICC = var1.HIIOIIIIOCROIHIIRIIOROCIHRIHRI;
         this.COOIRCHCRIRCIROCCRRIRRRCIRIRCH = var1.OIICCOROOOHCORRCIOOICRRICIRCCO;
         this.HHCOIICRRIOHCIRHHORHHIRCOIICHI = var1.CCHCOHCHCRIIORRICCRROCCCIRROIO;
         this.HHRICCCICOCIHCHHCIIRORCHRRHICO = var1.RCOHCHRHIOOICCHRCORHCICCRCRIRR;
         this.ICRHRROOICORORRROHIRCIRRCCOIOO = var1.CHRHRRCOCIRIIIIHCROCCRIHRHRIHO;
         this.ICHRRIRRCICOHHIRRRCOICIIIIHHCI = var1.IRIOHRIIICCCROHORCHHCRCCICHIRO;
      }

      public static com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH CRCHCROCHRROHROOCCHIHIOCHOICOC(
         int var0
      ) {
         int var1 = var0 << 3;
         int var2 = com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CHIOIOHHCRCIHHHRROORORHIHRORIH(
            var0
         );
         return new com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var0, 0, var2, new int[var1], new String[var0 << 1], var1 - var0, var1
         );
      }
   }
}
