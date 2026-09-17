package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI;
import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI;
import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRRCCOICORICIHCHRHIHIHROIRHOCR;
import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;

public abstract class CRRRICCRROCOHHOHIICIHORCOORRRH extends HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   private static final int RRRRCICOHCOCROCCOHRCORCICRHCOO = OCOHORHCROHICRRIHCIHHRRCIHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.ALLOW_TRAILING_COMMA.getMask();
   private static final int CORHOOHORHRHCOOCICCCOROHCCRCRI = OCOHORHCROHICRRIHCIHHRRCIHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.ALLOW_NUMERIC_LEADING_ZEROS
      .getMask();
   private static final int CHICCIIHOCORHHCCOHRCIHHRHRHICI = OCOHORHCROHICRRIHCIHHRRCIHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.ALLOW_MISSING_VALUES.getMask();
   private static final int HHCIHHRCOOHORHOORRORHCRHRCRICI = OCOHORHCROHICRRIHCIHHRRCIHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.ALLOW_SINGLE_QUOTES.getMask();
   private static final int CRIOOHROOOCCCCHOCRORIRRCOROCCH = OCOHORHCROHICRRIHCIHHRRCIHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.ALLOW_UNQUOTED_FIELD_NAMES.getMask();
   private static final int CICOHHOICIRCCIRROHHIIRRCCIHIHH = OCOHORHCROHICRRIHCIHHRRCIHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.ALLOW_COMMENTS.getMask();
   private static final int RHIIHIIRRIRORCHCHOHROHHIRHCOHI = OCOHORHCROHICRRIHCIHHRRCIHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.ALLOW_YAML_COMMENTS.getMask();
   private static final int[] RRHCCIRRIOHRCIOICRIRRIROHCOCCO = com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRRCIHROIOORHCHHHIHCOCRCHROICC();
   protected static final int[] ORHCCIOHRRIRCRCHCCCHIHOCHRCOHR = com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.COCHRRIRHRIIORIOOICHCHRHIOCICH();
   protected int COROCHCROHHRICOHRIORRICHHCICOH;

   protected CRRRICCRROCOHHOHIICIHORCOORRRH(
      HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1,
      int var2,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3
   ) {
      super(var1, var2, var3);
   }

   public final boolean HIOOOIRIRHCCCRRRRRCHRCHIIHOCOH() {
      return this.OOCCRCRROCIOCHHIHHCORIOHORRCCH >= this.HHOHOICCHOHCRCHIOOHHIRRCRCIIOC && !this.HORRORICHRHIOHICOHORIHRHRCIIIO;
   }

   public void ORIHIHOHHCOIOHHHIOHOIHRHOCHRCH() {
      this.HORRORICHRHIOHICOHORIHRHRCIIIO = true;
   }

   @Override
   protected char HHHHIHCHIRRCIRCRHRIIHRIROCRCCO() {
      IRRCCOICORICIHCHRHIHIHROIRHOCR.CRRRICCCHCIICICCCIOOIIOOOCCOCH();
      return ' ';
   }

   @Override
   public OHHRIOHROOIHOROCIRHCHORIHRRRRI OHHCRICRRCCHOHIRIRIHOIRHIROOIC() {
      if (this.OOCCRCRROCIOCHHIHHCORIOHORRCCH >= this.HHOHOICCHOHCRCHIOOHHIRRCRCIIOC) {
         if (this.CRCOIIOHHROHHIHIHHOOIROIICICOI) {
            return null;
         } else if (this.HORRORICHRHIOHICOHORIHRHRCIIIO) {
            return this.IIOIRORORIIIRHCHHIOCIICOCIHICH == OHHRIOHROOIHOROCIRHCHORIHRRRRI.NOT_AVAILABLE
               ? this.HHIHIIRROOCRIHHHICIHROHICCCCHR()
               : this.OIRHORHHOHOOCHCCHIHHCCROROCIII();
         } else {
            return OHHRIOHROOIHOROCIRHCHORIHRRRRI.NOT_AVAILABLE;
         }
      } else {
         if (this.IIOIRORORIIIRHCHHIOCIICOCIHICH == OHHRIOHROOIHOROCIRHCHORIHRRRRI.NOT_AVAILABLE) {
            return this.HIICHORHOICHIHCICHHCRORCIOOROI();
         }

         this.ICHRRIRCOHIIIRHHCRCHHCHIIOOICR = 0;
         this.HOOOHRIRORCIIIHIOHCRICHIICCHOR = this.IOCHIOORCHCICCOORORORRIICRHHCI + this.OOCCRCRROCIOCHHIHHCORIOHORRCCH;
         this.HIOHHORIRCCIIIORHHOORCHCRROICO = null;
         int var1 = this.RICCCIIIROCROHORCIOCIRRROCICOR();
         switch (this.HOCHIIROCROROIROCIHHROICRIOROR) {
            case 0:
               return this.HICRCCCICOCCRORIICHRCOIIHHIIRC(var1);
            case 1:
               return this.OICHCCCIOCICCICCIROHOOCRCRHHCR(var1);
            case 2:
               return this.RCCHICORROHRIRRIHOIHCOOORRIICH(var1);
            case 3:
               return this.ICHIOROOHIICRORCCROHOROHCCORRI(var1);
            case 4:
               return this.RHRRRICCOOCRORCOIROOROCCOHRRHO(var1);
            case 5:
               return this.OICHCCCIOCICCICCIROHOOCRCRHHCR(var1);
            case 6:
               return this.CCRCCROHHIHRIIRHOROIOIRCRHHOHI(var1);
            default:
               IRRCCOICORICIHCHRHIHIHROIRHOCR.CRRRICCCHCIICICCCIOOIIOOOCCOCH();
               return null;
         }
      }
   }

   protected abstract byte RORICCORCIRHICROIORCRHRHIROHHI();

   protected abstract int RICCCIIIROCROHORCIOCIRRROCICOR();

   protected abstract byte HOHHHOCOOCRHOIRHCHHCOHRRHIOOCI(int var1);

   protected final OHHRIOHROOIHOROCIRHCHORIHRRRRI HIICHORHOICHIHCICHHCRORCIOOROI() {
      switch (this.RCRCCOCRRCOHIIRHHRHIICOOCIROHH) {
         case 1:
            return this.IRHROHHCIOHHIOOIORRHIHCHHHCRCC(this.CIRHIRCHIRIIRHHOIOORCIOHOHRIOI);
         case 2:
         case 3:
         case 6:
         case 11:
         case 20:
         case 21:
         case 27:
         case 28:
         case 29:
         case 33:
         case 34:
         case 35:
         case 36:
         case 37:
         case 38:
         case 39:
         case 46:
         case 47:
         case 48:
         case 49:
         default:
            IRRCCOICORICIHCHRHIHIHROIRHOCR.CRRRICCCHCIICICCCIOOIIOOOCCOCH();
            return null;
         case 4:
            return this.RCCHICORROHRIRRIHOIHCOOORRIICH(this.RICCCIIIROCROHORCIOCIRRROCICOR());
         case 5:
            return this.ICHIOROOHIICRORCCROHOROHCCORRI(this.RICCCIIIROCROHORCIOCIRRROCICOR());
         case 7:
            return this.RRORCOIRRIICOOICOIOCORHORCHCOC(
               this.CIROIRHRHHHROIOORICHIIRHRIOIHR, this.CIRHIRCHIRIIRHHOIOORCIOHOHRIOI, this.ICOHIROHIRIIHRICOHRIROCROOCHHH
            );
         case 8:
            return this.RCRICROIRCICCOOCRRRRRHICCHOCIR();
         case 9:
            return this.RRHOOOORORHHOOIHRCCHIIHHIIIIOH(
               this.CIROIRHRHHHROIOORICHIIRHRIOIHR, this.CIRHIRCHIRIIRHHOIOORCIOHOHRIOI, this.ICOHIROHIRIIHRICOHRIROCROOCHHH
            );
         case 10:
            return this.RHRIIOOOCRHIIOORCOCRCHRCCRRCIH(
               this.CIROIRHRHHHROIOORICHIIRHRIOIHR, this.CIRHIRCHIRIIRHHOIOORCIOHOHRIOI, this.ICOHIROHIRIIHRICOHRIROCROOCHHH
            );
         case 12:
            return this.OICHCCCIOCICCICCIROHOOCRCRHHCR(this.RICCCIIIROCROHORCIOCIRRROCICOR());
         case 13:
            return this.CCRCCROHHIHRIIRHOROIOIRCRHHOHI(this.RICCCIIIROCROHORCIOCIRRROCICOR());
         case 14:
            return this.RHRRRICCOOCRORCOIROOROCCOHRRHO(this.RICCCIIIROCROHORCIOCIRRROCICOR());
         case 15:
            return this.HIOIOHROHRCRIIRHIICRRHCHHHHIHH(this.RICCCIIIROCROHORCIOCIRRROCICOR());
         case 16:
            return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("null", this.CIRHIRCHIRIIRHHOIOORCIOHOHRIOI, OHHRIOHROOIHOROCIRHCHORIHRRRRI.VALUE_NULL);
         case 17:
            return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("true", this.CIRHIRCHIRIIRHHOIOORCIOHOHRIOI, OHHRIOHROOIHOROCIRHCHORIHRRRRI.VALUE_TRUE);
         case 18:
            return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("false", this.CIRHIRCHIRIIRHHOIOORCIOHOHRIOI, OHHRIOHROOIHOROCIRHCHORIHRRRRI.VALUE_FALSE);
         case 19:
            return this.CCIHIROCOROHOHCHIOCOCRHCCIORCC(this.RRHRCOCIIOCOHRHIORIIORROCCOCHI, this.CIRHIRCHIRIIRHHOIOORCIOHOHRIOI);
         case 22:
            return this.HOHOHHOCOHIRRRICIRIRROIICORCCO(this.RICCCIIIROCROHORCIOCIRRROCICOR());
         case 23:
            return this.IRIRIIRRCHORIHORHOHRHOICOIIICO(this.RICCCIIIROCROHORCIOCIRRROCICOR());
         case 24:
            return this.RIOIRHRIIICOCHRHOCOOCHOCICCRHO();
         case 25:
            return this.IRHOIROIROHHROCOHIOHOHIOCOIIIO();
         case 26:
            return this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
               this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.CRHIICIOOIOHCHIOCORCROCROOHIHH(), this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.IIHIROCRHOIRCHRHHCHICHHOCIOOCC()
            );
         case 30:
            return this.ICOORRHOOCCROHIHIHIROROCIOHCCO();
         case 31:
            return this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(true, this.RICCCIIIROCROHORCIOCIRRROCICOR());
         case 32:
            return this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(false, this.RICCCIIIROCROHORCIOCIRRROCICOR());
         case 40:
            return this.OOHIIHOHRCHOHIRHHOORHHIIIOCHOH();
         case 41:
            int var1 = this.OHCIOCCCOHCCHHOCCHOIHRHOHCICOR(this.IHCCROIROIOICIIHOOOHRCRICOIIRO, this.RCORHICRICHRIOHRCIIHICORCCOOII);
            if (var1 < 0) {
               return OHHRIOHROOIHOROCIRHCHORIHRRRRI.NOT_AVAILABLE;
            } else {
               this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.IOHIHIIHCCCCCIHRORIOIOORCIOHII((char)var1);
               if (this.RRHIORHCCOHCCHOCHICHOORHHRHIRI == 45) {
                  return this.OROCHHIIOICRCIIRIHCOROHHOIIHCI();
               }

               return this.OOHIIHOHRCHOHIRHHOORHHIIIOCHOH();
            }
         case 42:
            this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR
               .IOHIHIIHCCCCCIHRORIOIOORCIOHII(
                  (char)this.HCCCIIHICHIROIHHIIHCIIICCORCCR(this.CIRHIRCHIRIIRHHOIOORCIOHOHRIOI, this.RORICCORCIRHICROIORCRHRHIROHHI())
               );
            if (this.RRHIORHCCOHCCHOCHICHOORHHRHIRI == 45) {
               return this.OROCHHIIOICRCIIRIHCOROHHOIIHCI();
            }

            return this.OOHIIHOHRCHOHIRHHOORHHIIIOCHOH();
         case 43:
            if (!this.HIHHOCRHHRORRHHRORRRIIHHORIHOC(
               this.CIRHIRCHIRIIRHHOIOORCIOHOHRIOI, this.ICOHIROHIRIIHRICOHRIROCROOCHHH, this.RORICCORCIRHICROIORCRHRHIROHHI()
            )) {
               return OHHRIOHROOIHOROCIRHCHORIHRRRRI.NOT_AVAILABLE;
            } else {
               if (this.RRHIORHCCOHCCHOCHICHOORHHRHIRI == 45) {
                  return this.OROCHHIIOICRCIIRIHCOROHHOIIHCI();
               }

               return this.OOHIIHOHRCHOHIRHHOORHHIIIOCHOH();
            }
         case 44:
            if (!this.OOCHRIIIRIHRRCRIORHCROIIHCRRIC(
               this.CIRHIRCHIRIIRHHOIOORCIOHOHRIOI, this.ICOHIROHIRIIHRICOHRIROCROOCHHH, this.RORICCORCIRHICROIORCRHRHIROHHI()
            )) {
               return OHHRIOHROOIHOROCIRHCHORIHRRRRI.NOT_AVAILABLE;
            } else {
               if (this.RRHIORHCCOHCCHOCHICHOORHHRHIRI == 45) {
                  return this.OROCHHIIOICRCIIRIHCOROHHOIIHCI();
               }

               return this.OOHIIHOHRCHOHIRHHOORHHIIIOCHOH();
            }
         case 45:
            return this.OROCHHIIOICRCIIRIHCOROHHOIIHCI();
         case 50:
            return this.HICIOCORHHORRIORHCHOHIOOHOIIHH();
         case 51:
            return this.ICHOCCCIHHOCRRIIICRHROIOHHROHO(this.CIRHIRCHIRIIRHHOIOORCIOHOHRIOI);
         case 52:
            return this.HICRRICCHCCROOHHCHOCOCCHOIHHOC(this.CIRHIRCHIRIIRHHOIOORCIOHOHRIOI, true);
         case 53:
            return this.HICRRICCHCCROOHHCHOCOCCHOIHHOC(this.CIRHIRCHIRIIRHHOIOORCIOHOHRIOI, false);
         case 54:
            return this.RRROICIORROHIOIHORHRICHCOOORCC(this.CIRHIRCHIRIIRHHOIOORCIOHOHRIOI);
         case 55:
            return this.RHCORIHRIORRHIRRRRCICOOORCRIHI(this.CIRHIRCHIRIIRHHOIOORCIOHOHRIOI);
      }
   }

   protected final OHHRIOHROOIHOROCIRHCHORIHRRRRI HHIHIIRROOCRIHHHICIHROHICCCCHR() {
      OHHRIOHROOIHOROCIRHCHORIHRRRRI var1 = this.IIOIRORORIIIRHCHHIOCIICOCIHICH;
      switch (this.RCRCCOCRRCOHIIRHHRHIICOOCIROHH) {
         case 3:
            return this.OIRHORHHOHOOCHCCHIHHCCROROCIII();
         case 4:
         case 5:
         case 6:
         case 7:
         case 8:
         case 9:
         case 10:
         case 11:
         case 13:
         case 14:
         case 15:
         case 20:
         case 21:
         case 22:
         case 23:
         case 27:
         case 28:
         case 29:
         case 33:
         case 34:
         case 35:
         case 36:
         case 37:
         case 38:
         case 39:
         case 40:
         case 41:
         case 42:
         case 43:
         case 44:
         case 45:
         case 46:
         case 47:
         case 48:
         case 49:
         case 51:
         default:
            this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
               ": was expecting rest of token (internal state: " + this.RCRCCOCRRCOHIIRHHRHIICOOCIROHH + ")", this.IIOIRORORIIIRHCHHIOCIICOCIHICH
            );
            return var1;
         case 12:
            return this.OIRHORHHOHOOCHCCHIHHCCROROCIII();
         case 16:
            return this.IRCIIHHICIHRCOCRROCOICRIHHCCHH("null", this.CIRHIRCHIRIIRHHOIOORCIOHOHRIOI, OHHRIOHROOIHOROCIRHCHORIHRRRRI.VALUE_NULL);
         case 17:
            return this.IRCIIHHICIHRCOCRROCOICRIHHCCHH("true", this.CIRHIRCHIRIIRHHOIOORCIOHOHRIOI, OHHRIOHROOIHOROCIRHCHORIHRRRRI.VALUE_TRUE);
         case 18:
            return this.IRCIIHHICIHRCOCRROCOICRIHHCCHH("false", this.CIRHIRCHIRIIRHHOIOORCIOHOHRIOI, OHHRIOHROOIHOROCIRHCHORIHRRRRI.VALUE_FALSE);
         case 19:
            return this.HROHCRIOCIHCORHOHIOCIHOHHCIIRH(this.RRHRCOCIIOCOHRHIORIIORROCCOCHI, this.CIRHIRCHIRIIRHHOIOORCIOHOHRIOI);
         case 24:
         case 25:
            return this.IHHCHHHCRIHOOCOIOOCRIIICIOROIR(0, "0");
         case 26:
            int var2 = this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.IIHIROCRHOIRCHRHHCHICHHOCIOOCC();
            if (this.OCHHOIRRHOHICRICOIIROOOIIRIHIC) {
               var2--;
            }

            this.OROHRRIROHHICIRCHCCRORICIIORRI = var2;
            return this.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(OHHRIOHROOIHOROCIRHCHORIHRRRRI.VALUE_NUMBER_INT);
         case 30:
            this.ROHHICIOROHHIOCHIIRHHHCCCHHRHR = 0;
         case 32:
            return this.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(OHHRIOHROOIHOROCIRHCHORIHRRRRI.VALUE_NUMBER_FLOAT);
         case 31:
            this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(": was expecting fraction after exponent marker", OHHRIOHROOIHOROCIRHCHORIHRRRRI.VALUE_NUMBER_FLOAT);
         case 52:
         case 53:
            this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(": was expecting closing '*/' for comment", OHHRIOHROOIHOROCIRHCHORIHRRRRI.NOT_AVAILABLE);
         case 54:
         case 55:
            return this.OIRHORHHOHOOCHCCHIHHCCROROCIII();
         case 50:
            return this.HORRHIRHHIHORROIICCICIICOHIORH();
      }
   }

   private final OHHRIOHROOIHOROCIRHCHORIHRRRRI HICRCCCICOCCRORIICHRCOIIHHIIRC(int var1) {
      var1 &= 255;
      if (var1 == 239 && this.RCRCCOCRRCOHIIRHHRHIICOOCIROHH != 1) {
         return this.IRHROHHCIOHHIOOIORRHIHCHHHCRCC(1);
      }

      while (var1 <= 32) {
         if (var1 != 32) {
            if (var1 == 10) {
               this.IOIRCCCCOCIRHRCIRIIOOCOCCRCOOC++;
               this.OIIOOIICOOROCHCIRIRRIICIIRCROO = this.OOCCRCRROCIOCHHIHHCORIOHORRCCH;
            } else if (var1 == 13) {
               this.RHOHHIIHHCRORROCHICHHORIHRIIHO++;
               this.OIIOOIICOOROCHCIRIRRIICIIRCROO = this.OOCCRCRROCIOCHHIHHCORIOHORRCCH;
            } else if (var1 != 9) {
               this.HROCROICOIHCCHOHCORORCIORCCOCC(var1);
            }
         }

         if (this.OOCCRCRROCIOCHHIHHCORIOHORRCCH >= this.HHOHOICCHOHCRCHIOOHHIRRCRCIIOC) {
            this.RCRCCOCRRCOHIIRHHRHIICOOCIROHH = 3;
            if (this.CRCOIIOHHROHHIHIHHOOIROIICICOI) {
               return null;
            }

            if (this.HORRORICHRHIOHICOHORIHRHRCIIIO) {
               return this.OIRHORHHOHOOCHCCHIHHCCROROCIII();
            }

            return OHHRIOHROOIHOROCIRHCHORIHRRRRI.NOT_AVAILABLE;
         }

         var1 = this.RICCCIIIROCROHORCIOCIRRROCICOR();
      }

      return this.OICHCCCIOCICCICCIROHOOCRCRHHCR(var1);
   }

   private final OHHRIOHROOIHOROCIRHCHORIHRRRRI IRHROHHCIOHHIOOIORRHIHCHHHCRCC(int var1) {
      while (this.OOCCRCRROCIOCHHIHHCORIOHORRCCH < this.HHOHOICCHOHCRCHIOOHHIRRCRCIIOC) {
         int var2 = this.RICCCIIIROCROHORCIOCIRRROCICOR();
         switch (var1) {
            case 1:
               if (var2 != 187) {
                  this.HHRIICOIOORCHCOIICOOIHIRHHICRI("Unexpected byte 0x%02x following 0xEF; should get 0xBB as second byte UTF-8 BOM", var2);
               }
               break;
            case 2:
               if (var2 != 191) {
                  this.HHRIICOIOORCHCOIICOOIHIRHHICRI("Unexpected byte 0x%02x following 0xEF 0xBB; should get 0xBF as third byte of UTF-8 BOM", var2);
               }
               break;
            case 3:
               this.IOCHIOORCHCICCOORORORRIICRHHCI -= 3L;
               return this.HICRCCCICOCCRORIICHRCOIIHHIIRC(var2);
         }

         var1++;
      }

      this.CIRHIRCHIRIIRHHOIOORCIOHOHRIOI = var1;
      this.RCRCCOCRRCOHIIRHHRHIICOOCIROHH = 1;
      return this.IIOIRORORIIIRHCHHIOCIICOCIHICH = OHHRIOHROOIHOROCIRHCHORIHRRRRI.NOT_AVAILABLE;
   }

   private final OHHRIOHROOIHOROCIRHCHORIHRRRRI RCCHICORROHRIRRIHOIHCOOORRIICH(int var1) {
      if (var1 <= 32) {
         var1 = this.COOIROCORRIHROOCCRCOIOCOHHRROO(var1);
         if (var1 <= 0) {
            this.RCRCCOCRRCOHIIRHHRHIICOOCIROHH = 4;
            return this.IIOIRORORIIIRHCHHIOCIICOCIHICH;
         }
      }

      this.IHOCHHRHHHOIICIOHCRHIHRRCOOICI();
      if (var1 != 34) {
         return var1 == 125 ? this.OIOOCCOIHIOHIIOHIIHCHICICCHICC() : this.HCCROIOHHIHOOHCCHRHHCHOOIIIOCO(var1);
      }

      if (this.OOCCRCRROCIOCHHIHHCORIOHORRCCH + 13 <= this.HHOHOICCHOHCRCHIOOHHIRRCRCIIOC) {
         String var2 = this.HCCHOOHHRIOHCCRRRRHRROHOOICIIO();
         if (var2 != null) {
            return this.HOHOCHHHOIHRRHOCRRRIRRRCOIHOCO(var2);
         }
      }

      return this.RRORCOIRRIICOOICOIOCORHORCHCOC(0, 0, 0);
   }

   private final OHHRIOHROOIHOROCIRHCHORIHRRRRI ICHIOROOHIICRORCCROHOROHCCORRI(int var1) {
      if (var1 <= 32) {
         var1 = this.COOIROCORRIHROOCCRCOIOCOHHRROO(var1);
         if (var1 <= 0) {
            this.RCRCCOCRRCOHIIRHHRHIICOOCIROHH = 5;
            return this.IIOIRORORIIIRHCHHIOCIICOCIHICH;
         }
      }

      if (var1 != 44) {
         if (var1 == 125) {
            return this.OIOOCCOIHIOHIIOHIIHCHICICCHICC();
         }

         if (var1 == 35) {
            return this.RHCORIHRIORRHIRRRRCICOOORCRIHI(5);
         }

         if (var1 == 47) {
            return this.ICHOCCCIHHOCRRIIICRHROIOHHROHO(5);
         }

         this.IIHRRHORCRCROCHHOHORCHCROCIHRO(
            var1, "was expecting comma to separate " + this.ORIRIHCOHHOCHICCHIOOOHCOIIRHCI.OHOIHIRHIIIOIOROCCOHOROIOCIRCI() + " entries"
         );
      }

      int var2 = this.OOCCRCRROCIOCHHIHHCORIOHORRCCH;
      if (var2 >= this.HHOHOICCHOHCRCHIOOHHIRRCRCIIOC) {
         this.RCRCCOCRRCOHIIRHHRHIICOOCIROHH = 4;
         return this.IIOIRORORIIIRHCHHIOCIICOCIHICH = OHHRIOHROOIHOROCIRHCHORIHRRRRI.NOT_AVAILABLE;
      }

      var1 = this.HOHHHOCOOCRHOIRHCHHCOHRRHIOOCI(var2);
      this.OOCCRCRROCIOCHHIHHCORIOHORRCCH = var2 + 1;
      if (var1 <= 32) {
         var1 = this.COOIROCORRIHROOCCRCOIOCOHHRROO(var1);
         if (var1 <= 0) {
            this.RCRCCOCRRCOHIIRHHRHIICOOCIROHH = 4;
            return this.IIOIRORORIIIRHCHHIOCIICOCIHICH;
         }
      }

      this.IHOCHHRHHHOIICIOHCRHIHRRCOOICI();
      if (var1 != 34) {
         return var1 == 125 && (this.CIIOIIOICHOHCOROOROHRORORCOHOH & RRRRCICOHCOCROCCOHRCORCICRHCOO) != 0
            ? this.OIOOCCOIHIOHIIOHIIHCHICICCHICC()
            : this.HCCROIOHHIHOOHCCHRHHCHOOIIIOCO(var1);
      }

      if (this.OOCCRCRROCIOCHHIHHCORIOHORRCCH + 13 <= this.HHOHOICCHOHCRCHIOOHHIRRCRCIIOC) {
         String var3 = this.HCCHOOHHRIOHCCRRRRHRROHOOICIIO();
         if (var3 != null) {
            return this.HOHOCHHHOIHRRHOCRRRIRRRCOIHOCO(var3);
         }
      }

      return this.RRORCOIRRIICOOICOIOCORHORCHCOC(0, 0, 0);
   }

   private final OHHRIOHROOIHOROCIRHCHORIHRRRRI OICHCCCIOCICCICCIROHOOCRCRHHCR(int var1) {
      if (var1 <= 32) {
         var1 = this.COOIROCORRIHROOCCRCOIOCOHHRROO(var1);
         if (var1 <= 0) {
            this.RCRCCOCRRCOHIIRHHRHIICOOCIROHH = 12;
            return this.IIOIRORORIIIRHCHHIOCIICOCIHICH;
         }
      }

      this.IHOCHHRHHHOIICIOHCRHIHRRCOOICI();
      this.ORIRIHCOHHOCHICCHIOOOHCOIIRHCI.IIRRHOORCIIOHROCIHCCICCCHIRIIO();
      if (var1 == 34) {
         return this.CHCCOIRIICHHOCCROHCRCOOHOIIOHH();
      }

      switch (var1) {
         case 35:
            return this.RHCORIHRIORRHIRRRRCICOOORCRIHI(12);
         case 43:
            return this.RICIOHROCHCHCHIHIHCCICCOCHRCIC();
         case 45:
            return this.CCOCHICCIOHCRROCIHRHORORRIIHHI();
         case 46:
            if (this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
               com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS
                  .mappedFeature()
            )) {
               return this.HHHOCIRCICHRICCOROIHCCHHCIOHIR();
            }
         case 36:
         case 37:
         case 38:
         case 39:
         case 40:
         case 41:
         case 42:
         case 44:
         case 58:
         case 59:
         case 60:
         case 61:
         case 62:
         case 63:
         case 64:
         case 65:
         case 66:
         case 67:
         case 68:
         case 69:
         case 70:
         case 71:
         case 72:
         case 73:
         case 74:
         case 75:
         case 76:
         case 77:
         case 78:
         case 79:
         case 80:
         case 81:
         case 82:
         case 83:
         case 84:
         case 85:
         case 86:
         case 87:
         case 88:
         case 89:
         case 90:
         case 92:
         case 94:
         case 95:
         case 96:
         case 97:
         case 98:
         case 99:
         case 100:
         case 101:
         case 103:
         case 104:
         case 105:
         case 106:
         case 107:
         case 108:
         case 109:
         case 111:
         case 112:
         case 113:
         case 114:
         case 115:
         case 117:
         case 118:
         case 119:
         case 120:
         case 121:
         case 122:
         case 124:
         default:
            return this.RRCRRCORICCHOHHIRCHIROOHIIOHCO(false, var1);
         case 47:
            return this.ICHOCCCIHHOCRRIIICRHROIOHHROHO(12);
         case 48:
            return this.RCIHIORHIORCRRIIRCIHICICRHRCHH();
         case 49:
         case 50:
         case 51:
         case 52:
         case 53:
         case 54:
         case 55:
         case 56:
         case 57:
            return this.HIRIHCROHHIHHHICRCHROHICCOHCHO(var1);
         case 91:
            return this.HOOOORCIRRCOORHOHOOORHOIHIOIIO();
         case 93:
            return this.OCHHHOCHOCROHOHHOOIOIHHRHCIHCI();
         case 102:
            return this.RRCIIIHCHICHHRIIOOCHRIIROROORH();
         case 110:
            return this.CORIROIROCHCCOHIHRHHHROCHOIORR();
         case 116:
            return this.IRICHIRIOIOCHHOCCCOHCOCOCHICRO();
         case 123:
            return this.CORRIIORIRORCOHIHIRIIRORRHOCII();
         case 125:
            return this.OIOOCCOIHIOHIIOHIIHCHICICCHICC();
      }
   }

   private final OHHRIOHROOIHOROCIRHCHORIHRRRRI CCRCCROHHIHRIIRHOROIOIRCRHHOHI(int var1) {
      if (var1 <= 32) {
         var1 = this.COOIROCORRIHROOCCRCOIOCOHHRROO(var1);
         if (var1 <= 0) {
            this.RCRCCOCRRCOHIIRHHRHIICOOCIROHH = 13;
            return this.IIOIRORORIIIRHCHHIOCIICOCIHICH;
         }
      }

      if (var1 != 44) {
         if (var1 == 93) {
            return this.OCHHHOCHOCROHOHHOOIOIHHRHCIHCI();
         }

         if (var1 == 125) {
            return this.OIOOCCOIHIOHIIOHIIHCHICICCHICC();
         }

         if (var1 == 47) {
            return this.ICHOCCCIHHOCRRIIICRHROIOHHROHO(13);
         }

         if (var1 == 35) {
            return this.RHCORIHRIORRHIRRRRCICOOORCRIHI(13);
         }

         this.IIHRRHORCRCROCHHOHORCHCROCIHRO(
            var1, "was expecting comma to separate " + this.ORIRIHCOHHOCHICCHIOOOHCOIIRHCI.OHOIHIRHIIIOIOROCCOHOROIOCIRCI() + " entries"
         );
      }

      this.ORIRIHCOHHOCHICCHIOOOHCOIIRHCI.IIRRHOORCIIOHROCIHCCICCCHIRIIO();
      int var2 = this.OOCCRCRROCIOCHHIHHCORIOHORRCCH;
      if (var2 >= this.HHOHOICCHOHCRCHIOOHHIRRCRCIIOC) {
         this.RCRCCOCRRCOHIIRHHRHIICOOCIROHH = 15;
         return this.IIOIRORORIIIRHCHHIOCIICOCIHICH = OHHRIOHROOIHOROCIRHCHORIHRRRRI.NOT_AVAILABLE;
      }

      var1 = this.HOHHHOCOOCRHOIRHCHHCOHRRHIOOCI(var2);
      this.OOCCRCRROCIOCHHIHHCORIOHORRCCH = var2 + 1;
      if (var1 <= 32) {
         var1 = this.COOIROCORRIHROOCCRCOIOCOHHRROO(var1);
         if (var1 <= 0) {
            this.RCRCCOCRRCOHIIRHHRHIICOOCIROHH = 15;
            return this.IIOIRORORIIIRHCHHIOCIICOCIHICH;
         }
      }

      this.IHOCHHRHHHOIICIOHCRHIHRRCOOICI();
      if (var1 == 34) {
         return this.CHCCOIRIICHHOCCROHCRCOOHOIIOHH();
      }

      switch (var1) {
         case 35:
            return this.RHCORIHRIORRHIRRRRCICOOORCRIHI(15);
         case 36:
         case 37:
         case 38:
         case 39:
         case 40:
         case 41:
         case 42:
         case 44:
         case 46:
         case 58:
         case 59:
         case 60:
         case 61:
         case 62:
         case 63:
         case 64:
         case 65:
         case 66:
         case 67:
         case 68:
         case 69:
         case 70:
         case 71:
         case 72:
         case 73:
         case 74:
         case 75:
         case 76:
         case 77:
         case 78:
         case 79:
         case 80:
         case 81:
         case 82:
         case 83:
         case 84:
         case 85:
         case 86:
         case 87:
         case 88:
         case 89:
         case 90:
         case 92:
         case 94:
         case 95:
         case 96:
         case 97:
         case 98:
         case 99:
         case 100:
         case 101:
         case 103:
         case 104:
         case 105:
         case 106:
         case 107:
         case 108:
         case 109:
         case 111:
         case 112:
         case 113:
         case 114:
         case 115:
         case 117:
         case 118:
         case 119:
         case 120:
         case 121:
         case 122:
         case 124:
         default:
            break;
         case 43:
            return this.RICIOHROCHCHCHIHIHCCICCOCHRCIC();
         case 45:
            return this.CCOCHICCIOHCRROCIHRHORORRIIHHI();
         case 47:
            return this.ICHOCCCIHHOCRRIIICRHROIOHHROHO(15);
         case 48:
            return this.RCIHIORHIORCRRIIRCIHICICRHRCHH();
         case 49:
         case 50:
         case 51:
         case 52:
         case 53:
         case 54:
         case 55:
         case 56:
         case 57:
            return this.HIRIHCROHHIHHHICRCHROHICCOHCHO(var1);
         case 91:
            return this.HOOOORCIRRCOORHOHOOORHOIHIOIIO();
         case 93:
            if ((this.CIIOIIOICHOHCOROOROHRORORCOHOH & RRRRCICOHCOCROCCOHRCORCICRHCOO) != 0) {
               return this.OCHHHOCHOCROHOHHOOIOIHHRHCIHCI();
            }
            break;
         case 102:
            return this.RRCIIIHCHICHHRIIOOCHRIIROROORH();
         case 110:
            return this.CORIROIROCHCCOHIHRHHHROCHOIORR();
         case 116:
            return this.IRICHIRIOIOCHHOCCCOHCOCOCHICRO();
         case 123:
            return this.CORRIIORIRORCOHIHIRIIRORRHOCII();
         case 125:
            if ((this.CIIOIIOICHOHCOROOROHRORORCOHOH & RRRRCICOHCOCROCCOHRCORCICRHCOO) != 0) {
               return this.OIOOCCOIHIOHIIOHIIHCHICICCHICC();
            }
      }

      return this.RRCRRCORICCHOHHIRCHIROOHIIOHCO(true, var1);
   }

   private final OHHRIOHROOIHOROCIRHCHORIHRRRRI RHRRRICCOOCRORCOIROOROCCOHRRHO(int var1) {
      if (var1 <= 32) {
         var1 = this.COOIROCORRIHROOCCRCOIOCOHHRROO(var1);
         if (var1 <= 0) {
            this.RCRCCOCRRCOHIIRHHRHIICOOCIROHH = 14;
            return this.IIOIRORORIIIRHCHHIOCIICOCIHICH;
         }
      }

      if (var1 != 58) {
         if (var1 == 47) {
            return this.ICHOCCCIHHOCRRIIICRHROIOHHROHO(14);
         }

         if (var1 == 35) {
            return this.RHCORIHRIORRHIRRRRCICOOORCRIHI(14);
         }

         this.IIHRRHORCRCROCHHOHORCHCROCIHRO(var1, "was expecting a colon to separate field name and value");
      }

      int var2 = this.OOCCRCRROCIOCHHIHHCORIOHORRCCH;
      if (var2 >= this.HHOHOICCHOHCRCHIOOHHIRRCRCIIOC) {
         this.RCRCCOCRRCOHIIRHHRHIICOOCIROHH = 12;
         return this.IIOIRORORIIIRHCHHIOCIICOCIHICH = OHHRIOHROOIHOROCIRHCHORIHRRRRI.NOT_AVAILABLE;
      }

      var1 = this.HOHHHOCOOCRHOIRHCHHCOHRRHIOOCI(var2);
      this.OOCCRCRROCIOCHHIHHCORIOHORRCCH = var2 + 1;
      if (var1 <= 32) {
         var1 = this.COOIROCORRIHROOCCRCOIOCOHHRROO(var1);
         if (var1 <= 0) {
            this.RCRCCOCRRCOHIIRHHRHIICOOCIROHH = 12;
            return this.IIOIRORORIIIRHCHHIOCIICOCIHICH;
         }
      }

      this.IHOCHHRHHHOIICIOHCRHIHRRCOOICI();
      if (var1 == 34) {
         return this.CHCCOIRIICHHOCCROHCRCOOHOIIOHH();
      }

      switch (var1) {
         case 35:
            return this.RHCORIHRIORRHIRRRRCICOOORCRIHI(12);
         case 43:
            return this.RICIOHROCHCHCHIHIHCCICCOCHRCIC();
         case 45:
            return this.CCOCHICCIOHCRROCIHRHORORRIIHHI();
         case 47:
            return this.ICHOCCCIHHOCRRIIICRHROIOHHROHO(12);
         case 48:
            return this.RCIHIORHIORCRRIIRCIHICICRHRCHH();
         case 49:
         case 50:
         case 51:
         case 52:
         case 53:
         case 54:
         case 55:
         case 56:
         case 57:
            return this.HIRIHCROHHIHHHICRCHROHICCOHCHO(var1);
         case 91:
            return this.HOOOORCIRRCOORHOHOOORHOIHIOIIO();
         case 102:
            return this.RRCIIIHCHICHHRIIOOCHRIIROROORH();
         case 110:
            return this.CORIROIROCHCCOHIHRHHHROCHOIORR();
         case 116:
            return this.IRICHIRIOIOCHHOCCCOHCOCOCHICRO();
         case 123:
            return this.CORRIIORIRORCOHIHIRIIRORRHOCII();
         default:
            return this.RRCRRCORICCHOHHIRCHIROOHIIOHCO(false, var1);
      }
   }

   private final OHHRIOHROOIHOROCIRHCHORIHRRRRI HIOIOHROHRCRIIRHIICRRHCHHHHIHH(int var1) {
      if (var1 <= 32) {
         var1 = this.COOIROCORRIHROOCCRCOIOCOHHRROO(var1);
         if (var1 <= 0) {
            this.RCRCCOCRRCOHIIRHHRHIICOOCIROHH = 15;
            return this.IIOIRORORIIIRHCHHIOCIICOCIHICH;
         }
      }

      this.IHOCHHRHHHOIICIOHCRHIHRRCOOICI();
      if (var1 == 34) {
         return this.CHCCOIRIICHHOCCROHCRCOOHOIIOHH();
      }

      switch (var1) {
         case 35:
            return this.RHCORIHRIORRHIRRRRCICOOORCRIHI(15);
         case 36:
         case 37:
         case 38:
         case 39:
         case 40:
         case 41:
         case 42:
         case 44:
         case 46:
         case 58:
         case 59:
         case 60:
         case 61:
         case 62:
         case 63:
         case 64:
         case 65:
         case 66:
         case 67:
         case 68:
         case 69:
         case 70:
         case 71:
         case 72:
         case 73:
         case 74:
         case 75:
         case 76:
         case 77:
         case 78:
         case 79:
         case 80:
         case 81:
         case 82:
         case 83:
         case 84:
         case 85:
         case 86:
         case 87:
         case 88:
         case 89:
         case 90:
         case 92:
         case 94:
         case 95:
         case 96:
         case 97:
         case 98:
         case 99:
         case 100:
         case 101:
         case 103:
         case 104:
         case 105:
         case 106:
         case 107:
         case 108:
         case 109:
         case 111:
         case 112:
         case 113:
         case 114:
         case 115:
         case 117:
         case 118:
         case 119:
         case 120:
         case 121:
         case 122:
         case 124:
         default:
            break;
         case 43:
            return this.RICIOHROCHCHCHIHIHCCICCOCHRCIC();
         case 45:
            return this.CCOCHICCIOHCRROCIHRHORORRIIHHI();
         case 47:
            return this.ICHOCCCIHHOCRRIIICRHROIOHHROHO(15);
         case 48:
            return this.RCIHIORHIORCRRIIRCIHICICRHRCHH();
         case 49:
         case 50:
         case 51:
         case 52:
         case 53:
         case 54:
         case 55:
         case 56:
         case 57:
            return this.HIRIHCROHHIHHHICRCHROHICCOHCHO(var1);
         case 91:
            return this.HOOOORCIRRCOORHOHOOORHOIHIOIIO();
         case 93:
            if ((this.CIIOIIOICHOHCOROOROHRORORCOHOH & RRRRCICOHCOCROCCOHRCORCICRHCOO) != 0) {
               return this.OCHHHOCHOCROHOHHOOIOIHHRHCIHCI();
            }
            break;
         case 102:
            return this.RRCIIIHCHICHHRIIOOCHRIIROROORH();
         case 110:
            return this.CORIROIROCHCCOHIHRHHHROCHOIORR();
         case 116:
            return this.IRICHIRIOIOCHHOCCCOHCOCOCHICRO();
         case 123:
            return this.CORRIIORIRORCOHIHIRIIRORRHOCII();
         case 125:
            if ((this.CIIOIIOICHOHCOROOROHRORORCOHOH & RRRRCICOHCOCROCCOHRCORCICRHCOO) != 0) {
               return this.OIOOCCOIHIOHIIOHIIHCHICICCHICC();
            }
      }

      return this.RRCRRCORICCHOHHIRCHIROOHIIOHCO(true, var1);
   }

   protected OHHRIOHROOIHOROCIRHCHORIHRRRRI RRCRRCORICCHOHHIRCHIROOHIIOHCO(boolean var1, int var2) {
      switch (var2) {
         case 39:
            if ((this.CIIOIIOICHOHCOROOROHRORORCOHOH & HHCIHHRCOOHORHOORRORHCRHRCRICI) != 0) {
               return this.IOIHIIIRICCHCCHIHHIHRORRCIRHIO();
            }
            break;
         case 43:
            return this.CCIHIROCOROHOHCHIOCOCRHCCIORCC(2, 1);
         case 73:
            return this.CCIHIROCOROHOHCHIOCOCRHCCIORCC(1, 1);
         case 78:
            return this.CCIHIROCOROHOHCHIOCOCRHCCIORCC(0, 1);
         case 93:
            if (!this.ORIRIHCOHHOCHICCHIOOOHCOIIRHCI.IICRICHRCOOHHCCOCIOOIIHROCRRRH()) {
               break;
            }
         case 44:
            if (!this.ORIRIHCOHHOCHICCHIOOOHCOIIRHCI.IHIOORIIHRCOOIHCOORICORRCOOOIO()
               && (this.CIIOIIOICHOHCOROOROHRORORCOHOH & CHICCIIHOCORHHCCOHRCIHHRHRHICI) != 0) {
               this.OOCCRCRROCIOCHHIHHCORIOHORRCCH--;
               return this.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(OHHRIOHROOIHOROCIRHCHORIHRRRRI.VALUE_NULL);
            }
         case 125:
      }

      this.IIHRRHORCRCROCHHOHORCHCROCIHRO(var2, "expected a valid value " + this.OOOOOOCOOIHHIIRHRROICHCRIIOCCH());
      return null;
   }

   private final int COOIROCORRIHROOCCRCOIOCOHHRROO(int var1) {
      do {
         if (var1 != 32) {
            if (var1 == 10) {
               this.IOIRCCCCOCIRHRCIRIIOOCOCCRCOOC++;
               this.OIIOOIICOOROCHCIRIRRIICIIRCROO = this.OOCCRCRROCIOCHHIHHCORIOHORRCCH;
            } else if (var1 == 13) {
               this.RHOHHIIHHCRORROCHICHHORIHRIIHO++;
               this.OIIOOIICOOROCHCIRIRRIICIIRCROO = this.OOCCRCRROCIOCHHIHHCORIOHORRCCH;
            } else if (var1 != 9) {
               this.HROCROICOIHCCHOHCORORCIORCCOCC(var1);
            }
         }

         if (this.OOCCRCRROCIOCHHIHHCORIOHORRCCH >= this.HHOHOICCHOHCRCHIOOHHIRRCRCIIOC) {
            this.IIOIRORORIIIRHCHHIOCIICOCIHICH = OHHRIOHROOIHOROCIRHCHORIHRRRRI.NOT_AVAILABLE;
            return 0;
         }

         var1 = this.RICCCIIIROCROHORCIOCIRRROCICOR();
      } while (var1 <= 32);

      return var1;
   }

   private final OHHRIOHROOIHOROCIRHCHORIHRRRRI ICHOCCCIHHOCRRIIICRHROIOHHROHO(int var1) {
      if ((this.CIIOIIOICHOHCOROOROHRORORCOHOH & CICOHHOICIRCCIRROHHIIRRCCIHIHH) == 0) {
         this.IIHRRHORCRCROCHHOHORCHCROCIHRO(
            47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)"
         );
      }

      if (this.OOCCRCRROCIOCHHIHHCORIOHORRCCH >= this.HHOHOICCHOHCRCHIOOHHIRRCRCIIOC) {
         this.CIRHIRCHIRIIRHHOIOORCIOHOHRIOI = var1;
         this.RCRCCOCRRCOHIIRHHRHIICOOCIROHH = 51;
         return this.IIOIRORORIIIRHCHHIOCIICOCIHICH = OHHRIOHROOIHOROCIRHCHORIHRRRRI.NOT_AVAILABLE;
      }

      byte var2 = this.RORICCORCIRHICROIORCRHRHIROHHI();
      if (var2 == 42) {
         return this.HICRRICCHCCROOHHCHOCOCCHOIHHOC(var1, false);
      }

      if (var2 == 47) {
         return this.RRROICIORROHIOIHORHRICHCOOORCC(var1);
      }

      this.IIHRRHORCRCROCHHOHORCHCROCIHRO(var2 & 255, "was expecting either '*' or '/' for a comment");
      return null;
   }

   private final OHHRIOHROOIHOROCIRHCHORIHRRRRI RHCORIHRIORRHIRRRRCICOOORCRIHI(int var1) {
      if ((this.CIIOIIOICHOHCOROOROHRORORCOHOH & RHIIHIIRRIRORCHCHOHROHHIRHCOHI) == 0) {
         this.IIHRRHORCRCROCHHOHORCHCROCIHRO(
            35, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_YAML_COMMENTS' not enabled for parser)"
         );
      }

      while (true) {
         if (this.OOCCRCRROCIOCHHIHHCORIOHORRCCH >= this.HHOHOICCHOHCRCHIOOHHIRRCRCIIOC) {
            this.RCRCCOCRRCOHIIRHHRHIICOOCIROHH = 55;
            this.CIRHIRCHIRIIRHHOIOORCIOHOHRIOI = var1;
            return this.IIOIRORORIIIRHCHHIOCIICOCIHICH = OHHRIOHROOIHOROCIRHCHORIHRRRRI.NOT_AVAILABLE;
         }

         int var2 = this.RICCCIIIROCROHORCIOCIRRROCICOR();
         if (var2 < 32) {
            if (var2 == 10) {
               this.IOIRCCCCOCIRHRCIRIIOOCOCCRCOOC++;
               this.OIIOOIICOOROCHCIRIRRIICIIRCROO = this.OOCCRCRROCIOCHHIHHCORIOHORRCCH;
               break;
            }

            if (var2 == 13) {
               this.RHOHHIIHHCRORROCHICHHORIHRIIHO++;
               this.OIIOOIICOOROCHCIRIRRIICIIRCROO = this.OOCCRCRROCIOCHHIHHCORIOHORRCCH;
               break;
            }

            if (var2 != 9) {
               this.HROCROICOIHCCHOHCORORCIORCCOCC(var2);
            }
         }
      }

      return this.RCHOHCHOICCORRROCRRRCOIHIROHOC(var1);
   }

   private final OHHRIOHROOIHOROCIRHCHORIHRRRRI RRROICIORROHIOIHORHRICHCOOORCC(int var1) {
      while (this.OOCCRCRROCIOCHHIHHCORIOHORRCCH < this.HHOHOICCHOHCRCHIOOHHIRRCRCIIOC) {
         int var2 = this.RICCCIIIROCROHORCIOCIRRROCICOR();
         if (var2 < 32) {
            if (var2 == 10) {
               this.IOIRCCCCOCIRHRCIRIIOOCOCCRCOOC++;
               this.OIIOOIICOOROCHCIRIRRIICIIRCROO = this.OOCCRCRROCIOCHHIHHCORIOHORRCCH;
            } else {
               if (var2 != 13) {
                  if (var2 != 9) {
                     this.HROCROICOIHCCHOHCORORCIORCCOCC(var2);
                  }
                  continue;
               }

               this.RHOHHIIHHCRORROCHICHHORIHRIIHO++;
               this.OIIOOIICOOROCHCIRIRRIICIIRCROO = this.OOCCRCRROCIOCHHIHHCORIOHORRCCH;
            }

            return this.RCHOHCHOICCORRROCRRRCOIHIROHOC(var1);
         }
      }

      this.RCRCCOCRRCOHIIRHHRHIICOOCIROHH = 54;
      this.CIRHIRCHIRIIRHHOIOORCIOHOHRIOI = var1;
      return this.IIOIRORORIIIRHCHHIOCIICOCIHICH = OHHRIOHROOIHOROCIRHCHORIHRRRRI.NOT_AVAILABLE;
   }

   private final OHHRIOHROOIHOROCIRHCHORIHRRRRI HICRRICCHCCROOHHCHOCOCCHOIHHOC(int var1, boolean var2) {
      while (this.OOCCRCRROCIOCHHIHHCORIOHORRCCH < this.HHOHOICCHOHCRCHIOOHHIRRCRCIIOC) {
         int var3 = this.RICCCIIIROCROHORCIOCIRRROCICOR();
         if (var3 < 32) {
            if (var3 == 10) {
               this.IOIRCCCCOCIRHRCIRIIOOCOCCRCOOC++;
               this.OIIOOIICOOROCHCIRIRRIICIIRCROO = this.OOCCRCRROCIOCHHIHHCORIOHORRCCH;
            } else if (var3 == 13) {
               this.RHOHHIIHHCRORROCHICHHORIHRIIHO++;
               this.OIIOOIICOOROCHCIRIRRIICIIRCROO = this.OOCCRCRROCIOCHHIHHCORIOHORRCCH;
            } else if (var3 != 9) {
               this.HROCROICOIHCCHOHCORORCIORCCOCC(var3);
            }
         } else {
            if (var3 == 42) {
               var2 = true;
               continue;
            }

            if (var3 == 47 && var2) {
               return this.RCHOHCHOICCORRROCRRRCOIHIROHOC(var1);
            }
         }

         var2 = false;
      }

      this.RCRCCOCRRCOHIIRHHRHIICOOCIROHH = var2 ? 52 : 53;
      this.CIRHIRCHIRIIRHHOIOORCIOHOHRIOI = var1;
      return this.IIOIRORORIIIRHCHHIOCIICOCIHICH = OHHRIOHROOIHOROCIRHCHORIHRRRRI.NOT_AVAILABLE;
   }

   private final OHHRIOHROOIHOROCIRHCHORIHRRRRI RCHOHCHOICCORRROCRRRCOIHIROHOC(int var1) {
      if (this.OOCCRCRROCIOCHHIHHCORIOHORRCCH >= this.HHOHOICCHOHCRCHIOOHHIRRCRCIIOC) {
         this.RCRCCOCRRCOHIIRHHRHIICOOCIROHH = var1;
         return this.IIOIRORORIIIRHCHHIOCIICOCIHICH = OHHRIOHROOIHOROCIRHCHORIHRRRRI.NOT_AVAILABLE;
      }

      int var2 = this.RICCCIIIROCROHORCIOCIRRROCICOR();
      switch (var1) {
         case 4:
            return this.RCCHICORROHRIRRIHOIHCOOORRIICH(var2);
         case 5:
            return this.ICHIOROOHIICRORCCROHOROHCCORRI(var2);
         case 6:
         case 7:
         case 8:
         case 9:
         case 10:
         case 11:
         default:
            IRRCCOICORICIHCHRHIHIHROIRHOCR.CRRRICCCHCIICICCCIOOIIOOOCCOCH();
            return null;
         case 12:
            return this.OICHCCCIOCICCICCIROHOOCRCRHHCR(var2);
         case 13:
            return this.CCRCCROHHIHRIIRHOROIOIRCRHHOHI(var2);
         case 14:
            return this.RHRRRICCOOCRORCOIROOROCCOHRRHO(var2);
         case 15:
            return this.HIOIOHROHRCRIIRHIICRRHCHHHHIHH(var2);
      }
   }

   protected OHHRIOHROOIHOROCIRHCHORIHRRRRI RRCIIIHCHICHHRIIOOCHRIIROROORH() {
      int var1 = this.OOCCRCRROCIOCHHIHHCORIOHORRCCH;
      if (var1 + 4 < this.HHOHOICCHOHCRCHIOOHHIRRCRCIIOC
         && this.HOHHHOCOOCRHOIRHCHHCOHRRHIOOCI(var1++) == 97
         && this.HOHHHOCOOCRHOIRHCHHCOHRRHIOOCI(var1++) == 108
         && this.HOHHHOCOOCRHOIRHCHHCOHRRHIOOCI(var1++) == 115
         && this.HOHHHOCOOCRHOIRHCHHCOHRRHIOOCI(var1++) == 101) {
         int var2 = this.HOHHHOCOOCRHOIRHCHHCOHRRHIOOCI(var1) & 255;
         if (var2 < 48 || var2 == 93 || var2 == 125) {
            this.OOCCRCRROCIOCHHIHHCORIOHORRCCH = var1;
            return this.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(OHHRIOHROOIHOROCIRHCHORIHRRRRI.VALUE_FALSE);
         }
      }

      this.RCRCCOCRRCOHIIRHHRHIICOOCIROHH = 18;
      return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("false", 1, OHHRIOHROOIHOROCIRHCHORIHRRRRI.VALUE_FALSE);
   }

   protected OHHRIOHROOIHOROCIRHCHORIHRRRRI IRICHIRIOIOCHHOCCCOHCOCOCHICRO() {
      int var1 = this.OOCCRCRROCIOCHHIHHCORIOHORRCCH;
      if (var1 + 3 < this.HHOHOICCHOHCRCHIOOHHIRRCRCIIOC
         && this.HOHHHOCOOCRHOIRHCHHCOHRRHIOOCI(var1++) == 114
         && this.HOHHHOCOOCRHOIRHCHHCOHRRHIOOCI(var1++) == 117
         && this.HOHHHOCOOCRHOIRHCHHCOHRRHIOOCI(var1++) == 101) {
         int var2 = this.HOHHHOCOOCRHOIRHCHHCOHRRHIOOCI(var1) & 255;
         if (var2 < 48 || var2 == 93 || var2 == 125) {
            this.OOCCRCRROCIOCHHIHHCORIOHORRCCH = var1;
            return this.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(OHHRIOHROOIHOROCIRHCHORIHRRRRI.VALUE_TRUE);
         }
      }

      this.RCRCCOCRRCOHIIRHHRHIICOOCIROHH = 17;
      return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("true", 1, OHHRIOHROOIHOROCIRHCHORIHRRRRI.VALUE_TRUE);
   }

   protected OHHRIOHROOIHOROCIRHCHORIHRRRRI CORIROIROCHCCOHIHRHHHROCHOIORR() {
      int var1 = this.OOCCRCRROCIOCHHIHHCORIOHORRCCH;
      if (var1 + 3 < this.HHOHOICCHOHCRCHIOOHHIRRCRCIIOC
         && this.HOHHHOCOOCRHOIRHCHHCOHRRHIOOCI(var1++) == 117
         && this.HOHHHOCOOCRHOIRHCHHCOHRRHIOOCI(var1++) == 108
         && this.HOHHHOCOOCRHOIRHCHHCOHRRHIOOCI(var1++) == 108) {
         int var2 = this.HOHHHOCOOCRHOIRHCHHCOHRRHIOOCI(var1) & 255;
         if (var2 < 48 || var2 == 93 || var2 == 125) {
            this.OOCCRCRROCIOCHHIHHCORIOHORRCCH = var1;
            return this.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(OHHRIOHROOIHOROCIRHCHORIHRRRRI.VALUE_NULL);
         }
      }

      this.RCRCCOCRRCOHIIRHHRHIICOOCIROHH = 16;
      return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("null", 1, OHHRIOHROOIHOROCIRHCHORIHRRRRI.VALUE_NULL);
   }

   protected OHHRIOHROOIHOROCIRHCHORIHRRRRI RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, int var2, OHHRIOHROOIHOROCIRHCHORIHRRRRI var3) {
      int var4 = var1.length();

      while (this.OOCCRCRROCIOCHHIHHCORIOHORRCCH < this.HHOHOICCHOHCRCHIOOHHIRRCRCIIOC) {
         byte var5 = this.HOHHHOCOOCRHOIRHCHHCOHRRHIOOCI(this.OOCCRCRROCIOCHHIHHCORIOHORRCCH);
         if (var2 == var4) {
            if (var5 < 48 || var5 == 93 || var5 == 125) {
               return this.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var3);
            }
         } else if (var5 == var1.charAt(var2)) {
            var2++;
            this.OOCCRCRROCIOCHHIHHCORIOHORRCCH++;
            continue;
         }

         this.RCRCCOCRRCOHIIRHHRHIICOOCIROHH = 50;
         this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.IIRHCHHOICHRICOOCRORCCIOOIHOIR(var1, 0, var2);
         return this.HICIOCORHHORRIORHCHOHIOOHOIIHH();
      }

      this.CIRHIRCHIRIIRHHOIOORCIOHOHRIOI = var2;
      return this.IIOIRORORIIIRHCHHIOCIICOCIHICH = OHHRIOHROOIHOROCIRHCHORIHRRRRI.NOT_AVAILABLE;
   }

   protected OHHRIOHROOIHOROCIRHCHORIHRRRRI IRCIIHHICIHRCOCRROCOICRIHHCCHH(String var1, int var2, OHHRIOHROOIHOROCIRHCHORIHRRRRI var3) {
      if (var2 == var1.length()) {
         return this.IIOIRORORIIIRHCHHIOCIICOCIHICH = var3;
      }

      this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.IIRHCHHOICHRICOOCRORCCIOOIHOIR(var1, 0, var2);
      return this.HORRHIRHHIHORROIICCICIICOHIORH();
   }

   protected OHHRIOHROOIHOROCIRHCHORIHRRRRI CCIHIROCOROHOHCHIOCOCRHCCIORCC(int var1, int var2) {
      String var3 = this.OHOOIIIHRRIOOIOIRRHCRROHRHOHRI(var1);
      int var4 = var3.length();

      while (this.OOCCRCRROCIOCHHIHHCORIOHORRCCH < this.HHOHOICCHOHCRCHIOOHHIRRCRCIIOC) {
         byte var5 = this.HOHHHOCOOCRHOIRHCHHCOHRRHIOOCI(this.OOCCRCRROCIOCHHIHHCORIOHORRCCH);
         if (var2 == var4) {
            if (var5 < 48 || var5 == 93 || var5 == 125) {
               return this.RIHIRCIOIHIRRICIHHROORCOOHRICC(var1);
            }
         } else if (var5 == var3.charAt(var2)) {
            var2++;
            this.OOCCRCRROCIOCHHIHHCORIOHORRCCH++;
            continue;
         }

         this.RCRCCOCRRCOHIIRHHRHIICOOCIROHH = 50;
         this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.IIRHCHHOICHRICOOCRORCCIOOIHOIR(var3, 0, var2);
         return this.HICIOCORHHORRIORHCHOHIOOHOIIHH();
      }

      this.RRHRCOCIIOCOHRHIORIIORROCCOCHI = var1;
      this.CIRHIRCHIRIIRHHOIOORCIOHOHRIOI = var2;
      this.RCRCCOCRRCOHIIRHHRHIICOOCIROHH = 19;
      return this.IIOIRORORIIIRHCHHIOCIICOCIHICH = OHHRIOHROOIHOROCIRHCHORIHRRRRI.NOT_AVAILABLE;
   }

   protected OHHRIOHROOIHOROCIRHCHORIHRRRRI HROHCRIOCIHCORHOHIOCIHOHHCIIRH(int var1, int var2) {
      String var3 = this.OHOOIIIHRRIOOIOIRRHCRROHRHOHRI(var1);
      if (var2 == var3.length()) {
         return this.RIHIRCIOIHIRRICIHHROORCOOHRICC(var1);
      }

      this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.IIRHCHHOICHRICOOCRORCCIOOIHOIR(var3, 0, var2);
      return this.HORRHIRHHIHORROIICCICIICOHIORH();
   }

   protected OHHRIOHROOIHOROCIRHCHORIHRRRRI HICIOCORHHORRIORHCHOHIOOHOIIHH() {
      while (this.OOCCRCRROCIOCHHIHHCORIOHORRCCH < this.HHOHOICCHOHCRCHIOOHHIRRCRCIIOC) {
         byte var1 = this.RORICCORCIRHICROIORCRHRHIROHHI();
         char var2 = (char)var1;
         if (Character.isJavaIdentifierPart(var2)) {
            this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.IOHIHIIHCCCCCIHRORIOIOORCIOHII(var2);
            if (this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.size() < 256) {
               continue;
            }
         }

         return this.OCOCIORRCHHHHHHHOOIHRRHOIHICRH(this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.ICHCCOIRHIIHRORHOIROIORCHIIICI());
      }

      return this.IIOIRORORIIIRHCHHIOCIICOCIHICH = OHHRIOHROOIHOROCIRHCHORIHRRRRI.NOT_AVAILABLE;
   }

   protected OHHRIOHROOIHOROCIRHCHORIHRRRRI HORRHIRHHIHORROIICCICIICOHIORH() {
      return this.OCOCIORRCHHHHHHHOOIHRRHOIHICRH(this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.ICHCCOIRHIIHRORHOIROIORCHIIICI());
   }

   protected OHHRIOHROOIHOROCIRHCHORIHRRRRI OCOCIORRCHHHHHHHOOIHRRHOIHICRH(String var1) {
      this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
         "Unrecognized token '%s': was expecting %s",
         this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.ICHCCOIRHIIHRORHOIROIORCHIIICI(),
         this.ICRHCOHOHIRROOHHIOHCHRRHCRCOII()
      );
      return OHHRIOHROOIHOROCIRHCHORIHRRRRI.NOT_AVAILABLE;
   }

   protected OHHRIOHROOIHOROCIRHCHORIHRRRRI HHHOCIRCICHRICCOROIHCCHHCIOHIR() {
      this.OCHHOIRRHOHICRICOIIROOOIIRIHIC = false;
      this.OROHRRIROHHICIRCHCCRORICIIORRI = 0;
      char[] var1 = this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.CICHCOHCHROHRCHORHRCHHROROIHIO();
      return this.IHIRRIIORRHORHRORIHOROIRCORCOO(var1, 0, 46);
   }

   protected OHHRIOHROOIHOROCIRHCHORIHRRRRI HIRIHCROHHIHHHICRCHROHICCOHCHO(int var1) {
      this.OCHHOIRRHOHICRICOIIROOOIIRIHIC = false;
      char[] var2 = this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.CICHCOHCHROHRCHORHRCHHROROIHIO();
      var2[0] = (char)var1;
      if (this.OOCCRCRROCIOCHHIHHCORIOHORRCCH >= this.HHOHOICCHOHCRCHIOOHHIRRCRCIIOC) {
         this.RCRCCOCRRCOHIIRHHRHIICOOCIROHH = 26;
         this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.ICOCCCOCHIHIOOCOORRRICIOCOICRR(1);
         return this.IIOIRORORIIIRHCHHIOCIICOCIHICH = OHHRIOHROOIHOROCIRHCHORIHRRRRI.NOT_AVAILABLE;
      }

      int var3 = 1;
      var1 = this.HOHHHOCOOCRHOIRHCHHCOHRRHIOOCI(this.OOCCRCRROCIOCHHIHHCORIOHORRCCH) & 255;

      while (true) {
         if (var1 < 48) {
            if (var1 == 46) {
               this.OROHRRIROHHICIRCHCCRORICIIORRI = var3;
               this.OOCCRCRROCIOCHHIHHCORIOHORRCCH++;
               return this.IHIRRIIORRHORHRORIHOROIRCORCOO(var2, var3, var1);
            }
         } else {
            if (var1 <= 57) {
               if (var3 >= var2.length) {
                  var2 = this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.OHCOIHOOHRIOCRIRHCIHOOROCCHCRC();
               }

               var2[var3++] = (char)var1;
               if (++this.OOCCRCRROCIOCHHIHHCORIOHORRCCH >= this.HHOHOICCHOHCRCHIOOHHIRRCRCIIOC) {
                  this.RCRCCOCRRCOHIIRHHRHIICOOCIROHH = 26;
                  this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.ICOCCCOCHIHIOOCOORRRICIOCOICRR(var3);
                  return this.IIOIRORORIIIRHCHHIOCIICOCIHICH = OHHRIOHROOIHOROCIRHCHORIHRRRRI.NOT_AVAILABLE;
               }

               var1 = this.HOHHHOCOOCRHOIRHCHHCOHRRHIOOCI(this.OOCCRCRROCIOCHHIHHCORIOHORRCCH) & 255;
               continue;
            }

            if (var1 == 101 || var1 == 69) {
               this.OROHRRIROHHICIRCHCCRORICIIORRI = var3;
               this.OOCCRCRROCIOCHHIHHCORIOHORRCCH++;
               return this.IHIRRIIORRHORHRORIHOROIRCORCOO(var2, var3, var1);
            }
         }

         this.OROHRRIROHHICIRCHCCRORICIIORRI = var3;
         this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.ICOCCCOCHIHIOOCOORRRICIOCOICRR(var3);
         return this.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(OHHRIOHROOIHOROCIRHCHORIHRRRRI.VALUE_NUMBER_INT);
      }
   }

   protected OHHRIOHROOIHOROCIRHCHORIHRRRRI CCOCHICCIOHCRROCIHRHORORRIIHHI() {
      this.OCHHOIRRHOHICRICOIIROOOIIRIHIC = true;
      if (this.OOCCRCRROCIOCHHIHHCORIOHORRCCH >= this.HHOHOICCHOHCRCHIOOHHIRRCRCIIOC) {
         this.RCRCCOCRRCOHIIRHHRHIICOOCIROHH = 23;
         return this.IIOIRORORIIIRHCHHIOCIICOCIHICH = OHHRIOHROOIHOROCIRHCHORIHRRRRI.NOT_AVAILABLE;
      }

      int var1 = this.RICCCIIIROCROHORCIOCIRRROCICOR();
      if (var1 <= 48) {
         if (var1 == 48) {
            return this.IRHOIROIROHHROCOHIOHOHIOCOIIIO();
         }

         this.CRICCOOHHHCHOORCICOCOHIHOIRHOO(var1, "expected digit (0-9) to follow minus sign, for valid numeric value");
      } else if (var1 > 57) {
         if (var1 == 73) {
            return this.CCIHIROCOROHOHCHIOCOCRHCCIORCC(3, 2);
         }

         this.CRICCOOHHHCHOORCICOCOHIHOIRHOO(var1, "expected digit (0-9) to follow minus sign, for valid numeric value");
      }

      char[] var2 = this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.CICHCOHCHROHRCHORHRCHHROROIHIO();
      var2[0] = '-';
      var2[1] = (char)var1;
      if (this.OOCCRCRROCIOCHHIHHCORIOHORRCCH >= this.HHOHOICCHOHCRCHIOOHHIRRCRCIIOC) {
         this.RCRCCOCRRCOHIIRHHRHIICOOCIROHH = 26;
         this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.ICOCCCOCHIHIOOCOORRRICIOCOICRR(2);
         this.OROHRRIROHHICIRCHCCRORICIIORRI = 1;
         return this.IIOIRORORIIIRHCHHIOCIICOCIHICH = OHHRIOHROOIHOROCIRHCHORIHRRRRI.NOT_AVAILABLE;
      }

      var1 = this.HOHHHOCOOCRHOIRHCHHCOHRRHIOOCI(this.OOCCRCRROCIOCHHIHHCORIOHORRCCH);
      int var3 = 2;

      while (true) {
         if (var1 < 48) {
            if (var1 == 46) {
               this.OROHRRIROHHICIRCHCCRORICIIORRI = var3 - 1;
               this.OOCCRCRROCIOCHHIHHCORIOHORRCCH++;
               return this.IHIRRIIORRHORHRORIHOROIRCORCOO(var2, var3, var1);
            }
         } else {
            if (var1 <= 57) {
               if (var3 >= var2.length) {
                  var2 = this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.OHCOIHOOHRIOCRIRHCIHOOROCCHCRC();
               }

               var2[var3++] = (char)var1;
               if (++this.OOCCRCRROCIOCHHIHHCORIOHORRCCH >= this.HHOHOICCHOHCRCHIOOHHIRRCRCIIOC) {
                  this.RCRCCOCRRCOHIIRHHRHIICOOCIROHH = 26;
                  this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.ICOCCCOCHIHIOOCOORRRICIOCOICRR(var3);
                  return this.IIOIRORORIIIRHCHHIOCIICOCIHICH = OHHRIOHROOIHOROCIRHCHORIHRRRRI.NOT_AVAILABLE;
               }

               var1 = this.HOHHHOCOOCRHOIRHCHHCOHRRHIOOCI(this.OOCCRCRROCIOCHHIHHCORIOHORRCCH) & 255;
               continue;
            }

            if (var1 == 101 || var1 == 69) {
               this.OROHRRIROHHICIRCHCCRORICIIORRI = var3 - 1;
               this.OOCCRCRROCIOCHHIHHCORIOHORRCCH++;
               return this.IHIRRIIORRHORHRORIHOROIRCORCOO(var2, var3, var1);
            }
         }

         this.OROHRRIROHHICIRCHCCRORICIIORRI = var3 - 1;
         this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.ICOCCCOCHIHIOOCOORRRICIOCOICRR(var3);
         return this.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(OHHRIOHROOIHOROCIRHCHORIHRRRRI.VALUE_NUMBER_INT);
      }
   }

   protected OHHRIOHROOIHOROCIRHCHORIHRRRRI RICIOHROCHCHCHIHIHCCICCOCHRCIC() {
      this.OCHHOIRRHOHICRICOIIROOOIIRIHIC = false;
      if (this.OOCCRCRROCIOCHHIHHCORIOHORRCCH >= this.HHOHOICCHOHCRCHIOOHHIRRCRCIIOC) {
         this.RCRCCOCRRCOHIIRHHRHIICOOCIROHH = 22;
         return this.IIOIRORORIIIRHCHHIOCIICOCIHICH = OHHRIOHROOIHOROCIRHCHORIHRRRRI.NOT_AVAILABLE;
      }

      int var1 = this.RICCCIIIROCROHORCIOCIRRROCICOR();
      if (var1 <= 48) {
         if (var1 == 48) {
            if (!this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
               com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS
                  .mappedFeature()
            )) {
               this.CRICCOOHHHCHOORCICOCOHIHOIRHOO(
                  43, "JSON spec does not allow numbers to have plus signs: enable `JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS` to allow"
               );
            }

            return this.RROHIHCCOOHRRRROHORCCOIOOOHCHI();
         }

         this.CRICCOOHHHCHOORCICOCOHIHOIRHOO(var1, "expected digit (0-9) to follow plus sign, for valid numeric value");
      } else if (var1 > 57) {
         if (var1 == 73) {
            return this.CCIHIROCOROHOHCHIOCOCRHCCIORCC(2, 2);
         }

         this.CRICCOOHHHCHOORCICOCOHIHOIRHOO(var1, "expected digit (0-9) to follow plus sign, for valid numeric value");
      }

      if (!this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS
            .mappedFeature()
      )) {
         this.CRICCOOHHHCHOORCICOCOHIHOIRHOO(
            43, "JSON spec does not allow numbers to have plus signs: enable `JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS` to allow"
         );
      }

      char[] var2 = this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.CICHCOHCHROHRCHORHRCHHROROIHIO();
      var2[0] = '+';
      var2[1] = (char)var1;
      if (this.OOCCRCRROCIOCHHIHHCORIOHORRCCH >= this.HHOHOICCHOHCRCHIOOHHIRRCRCIIOC) {
         this.RCRCCOCRRCOHIIRHHRHIICOOCIROHH = 26;
         this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.ICOCCCOCHIHIOOCOORRRICIOCOICRR(2);
         this.OROHRRIROHHICIRCHCCRORICIIORRI = 1;
         return this.IIOIRORORIIIRHCHHIOCIICOCIHICH = OHHRIOHROOIHOROCIRHCHORIHRRRRI.NOT_AVAILABLE;
      }

      var1 = this.HOHHHOCOOCRHOIRHCHHCOHRRHIOOCI(this.OOCCRCRROCIOCHHIHHCORIOHORRCCH);
      int var3 = 2;

      while (true) {
         if (var1 < 48) {
            if (var1 == 46) {
               this.OROHRRIROHHICIRCHCCRORICIIORRI = var3 - 1;
               this.OOCCRCRROCIOCHHIHHCORIOHORRCCH++;
               return this.IHIRRIIORRHORHRORIHOROIRCORCOO(var2, var3, var1);
            }
         } else {
            if (var1 <= 57) {
               if (var3 >= var2.length) {
                  var2 = this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.OHCOIHOOHRIOCRIRHCIHOOROCCHCRC();
               }

               var2[var3++] = (char)var1;
               if (++this.OOCCRCRROCIOCHHIHHCORIOHORRCCH >= this.HHOHOICCHOHCRCHIOOHHIRRCRCIIOC) {
                  this.RCRCCOCRRCOHIIRHHRHIICOOCIROHH = 26;
                  this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.ICOCCCOCHIHIOOCOORRRICIOCOICRR(var3);
                  return this.IIOIRORORIIIRHCHHIOCIICOCIHICH = OHHRIOHROOIHOROCIRHCHORIHRRRRI.NOT_AVAILABLE;
               }

               var1 = this.HOHHHOCOOCRHOIRHCHHCOHRRHIOOCI(this.OOCCRCRROCIOCHHIHHCORIOHORRCCH) & 255;
               continue;
            }

            if (var1 == 101 || var1 == 69) {
               this.OROHRRIROHHICIRCHCCRORICIIORRI = var3 - 1;
               this.OOCCRCRROCIOCHHIHHCORIOHORRCCH++;
               return this.IHIRRIIORRHORHRORIHOROIRCORCOO(var2, var3, var1);
            }
         }

         this.OROHRRIROHHICIRCHCCRORICIIORRI = var3 - 1;
         this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.ICOCCCOCHIHIOOCOORRRICIOCOICRR(var3);
         return this.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(OHHRIOHROOIHOROCIRHCHORIHRRRRI.VALUE_NUMBER_INT);
      }
   }

   protected OHHRIOHROOIHOROCIRHCHORIHRRRRI RCIHIORHIORCRRIIRCIHICICRHRCHH() {
      int var1 = this.OOCCRCRROCIOCHHIHHCORIOHORRCCH;
      if (var1 >= this.HHOHOICCHOHCRCHIOOHHIRRCRCIIOC) {
         this.RCRCCOCRRCOHIIRHHRHIICOOCIROHH = 24;
         return this.IIOIRORORIIIRHCHHIOCIICOCIHICH = OHHRIOHROOIHOROCIRHCHORIHRRRRI.NOT_AVAILABLE;
      }

      int var2 = this.HOHHHOCOOCRHOIRHCHHCOHRRHIOOCI(var1++) & 255;
      if (var2 < 48) {
         if (var2 == 46) {
            this.OOCCRCRROCIOCHHIHHCORIOHORRCCH = var1;
            this.OROHRRIROHHICIRCHCCRORICIIORRI = 1;
            char[] var3 = this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.CICHCOHCHROHRCHORHRCHHROROIHIO();
            var3[0] = '0';
            return this.IHIRRIIORRHORHRORIHOROIRCORCOO(var3, 1, var2);
         }
      } else {
         if (var2 <= 57) {
            return this.RIOIRHRIIICOCHRHOCOOCHOCICCRHO();
         }

         if (var2 == 101 || var2 == 69) {
            this.OOCCRCRROCIOCHHIHHCORIOHORRCCH = var1;
            this.OROHRRIROHHICIRCHCCRORICIIORRI = 1;
            char[] var5 = this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.CICHCOHCHROHRCHORHRCHHROROIHIO();
            var5[0] = '0';
            return this.IHIRRIIORRHORHRORIHOROIRCORCOO(var5, 1, var2);
         }

         if (var2 != 93 && var2 != 125) {
            this.CRICCOOHHHCHOORCICOCOHIHOIRHOO(var2, "expected digit (0-9), decimal point (.) or exponent indicator (e/E) to follow '0'");
         }
      }

      return this.IHHCHHHCRIHOOCOIOOCRIIICIOROIR(0, "0");
   }

   protected OHHRIOHROOIHOROCIRHCHORIHRRRRI IRIRIIRRCHORIHORHOHRHOICOIIICO(int var1) {
      return this.RIROICHCRROROHCCROOCCCCOCHCCRI(var1, true);
   }

   protected OHHRIOHROOIHOROCIRHCHORIHRRRRI HOHOHHOCOHIRRRICIRIRROIICORCCO(int var1) {
      return this.RIROICHCRROROHCCROOCCCCOCHCCRI(var1, false);
   }

   protected OHHRIOHROOIHOROCIRHCHORIHRRRRI RIROICHCRROROHCCROOCCCCOCHCCRI(int var1, boolean var2) {
      if (var1 <= 48) {
         if (var1 == 48) {
            if (var2) {
               return this.IRHOIROIROHHROCOHIOHOHIOCOIIIO();
            }

            if (!this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
               com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS
                  .mappedFeature()
            )) {
               this.CRICCOOHHHCHOORCICOCOHIHOIRHOO(
                  43, "JSON spec does not allow numbers to have plus signs: enable `JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS` to allow"
               );
            }

            return this.RROHIHCCOOHRRRROHORCCOIOOOHCHI();
         }

         if (var1 == 46
            && this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
               com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS
                  .mappedFeature()
            )) {
            if (var2) {
               this.OOCCRCRROCIOCHHIHHCORIOHORRCCH--;
               return this.IRHOIROIROHHROCOHIOHOHIOCOIIIO();
            }

            if (!this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
               com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS
                  .mappedFeature()
            )) {
               this.CRICCOOHHHCHOORCICOCOHIHOIRHOO(
                  43, "JSON spec does not allow numbers to have plus signs: enable `JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS` to allow"
               );
            }

            this.OOCCRCRROCIOCHHIHHCORIOHORRCCH--;
            return this.RROHIHCCOOHRRRROHORCCOIOOOHCHI();
         }

         String var3 = var2 ? "expected digit (0-9) to follow minus sign, for valid numeric value" : "expected digit (0-9) for valid numeric value";
         this.CRICCOOHHHCHOORCICOCOHIHOIRHOO(var1, var3);
      } else if (var1 > 57) {
         if (var1 == 73) {
            int var6 = var2 ? 3 : 2;
            return this.CCIHIROCOROHOHCHIOCOCRHCCIORCC(var6, 2);
         }

         String var4 = var2 ? "expected digit (0-9) to follow minus sign, for valid numeric value" : "expected digit (0-9) for valid numeric value";
         this.CRICCOOHHHCHOORCICOCOHIHOIRHOO(var1, var4);
      }

      if (!var2
         && !this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
            com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS
               .mappedFeature()
         )) {
         this.CRICCOOHHHCHOORCICOCOHIHOIRHOO(
            43, "JSON spec does not allow numbers to have plus signs: enable `JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS` to allow"
         );
      }

      char[] var5 = this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.CICHCOHCHROHRCHORHRCHHROROIHIO();
      var5[0] = (char)(var2 ? 45 : 43);
      var5[1] = (char)var1;
      this.OROHRRIROHHICIRCHCCRORICIIORRI = 1;
      return this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var5, 2);
   }

   protected OHHRIOHROOIHOROCIRHCHORIHRRRRI RIOIRHRIIICOCHRHOCOOCHOCICCRHO() {
      while (this.OOCCRCRROCIOCHHIHHCORIOHORRCCH < this.HHOHOICCHOHCRCHIOOHHIRRCRCIIOC) {
         int var1 = this.RICCCIIIROCROHORCIOCIRRROCICOR();
         if (var1 < 48) {
            if (var1 == 46) {
               char[] var2 = this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.CICHCOHCHROHRCHORHRCHHROROIHIO();
               var2[0] = '0';
               this.OROHRRIROHHICIRCHCCRORICIIORRI = 1;
               return this.IHIRRIIORRHORHRORIHOROIRCORCOO(var2, 1, var1);
            }
         } else {
            if (var1 <= 57) {
               if ((this.CIIOIIOICHOHCOROOROHRORORCOHOH & CORHOOHORHRHCOOCICCCOROHCCRCRI) == 0) {
                  this.OIRCOHHHOOCCRRRIORORIHIHHRIOIH("Leading zeroes not allowed");
               }

               if (var1 == 48) {
                  continue;
               }

               char[] var4 = this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.CICHCOHCHROHRCHORHRCHHROROIHIO();
               var4[0] = (char)var1;
               this.OROHRRIROHHICIRCHCCRORICIIORRI = 1;
               return this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var4, 1);
            }

            if (var1 == 101 || var1 == 69) {
               char[] var3 = this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.CICHCOHCHROHRCHORHRCHHROROIHIO();
               var3[0] = '0';
               this.OROHRRIROHHICIRCHCCRORICIIORRI = 1;
               return this.IHIRRIIORRHORHRORIHOROIRCORCOO(var3, 1, var1);
            }

            if (var1 != 93 && var1 != 125) {
               this.CRICCOOHHHCHOORCICOCOHIHOIRHOO(var1, "expected digit (0-9), decimal point (.) or exponent indicator (e/E) to follow '0'");
            }
         }

         this.OOCCRCRROCIOCHHIHHCORIOHORRCCH--;
         return this.IHHCHHHCRIHOOCOIOOCRIIICIOROIR(0, "0");
      }

      this.RCRCCOCRRCOHIIRHHRHIICOOCIROHH = 24;
      return this.IIOIRORORIIIRHCHHIOCIICOCIHICH = OHHRIOHROOIHOROCIRHCHORIHRRRRI.NOT_AVAILABLE;
   }

   protected OHHRIOHROOIHOROCIRHCHORIHRRRRI IRHOIROIROHHROCOHIOHOHIOCOIIIO() {
      return this.OHCCRIOOIICRHRIRROOOORROCRHIHR(true);
   }

   protected OHHRIOHROOIHOROCIRHCHORIHRRRRI RROHIHCCOOHRRRROHORCCOIOOOHCHI() {
      return this.OHCCRIOOIICRHRIRROOOORROCRHIHR(false);
   }

   protected OHHRIOHROOIHOROCIRHCHORIHRRRRI OHCCRIOOIICRHRIRROOOORROCRHIHR(boolean var1) {
      while (this.OOCCRCRROCIOCHHIHHCORIOHORRCCH < this.HHOHOICCHOHCRCHIOOHHIRRCRCIIOC) {
         int var2 = this.RICCCIIIROCROHORCIOCIRRROCICOR();
         if (var2 < 48) {
            if (var2 == 46) {
               char[] var5 = this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.CICHCOHCHROHRCHORHRCHHROROIHIO();
               var5[0] = (char)(var1 ? 45 : 43);
               var5[1] = '0';
               this.OROHRRIROHHICIRCHCCRORICIIORRI = 1;
               return this.IHIRRIIORRHORHRORIHOROIRCORCOO(var5, 2, var2);
            }
         } else {
            if (var2 <= 57) {
               if ((this.CIIOIIOICHOHCOROOROHRORORCOHOH & CORHOOHORHRHCOOCICCCOROHCCRCRI) == 0) {
                  this.OIRCOHHHOOCCRRRIORORIHIHHRIOIH("Leading zeroes not allowed");
               }

               if (var2 == 48) {
                  continue;
               }

               char[] var4 = this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.CICHCOHCHROHRCHORHRCHHROROIHIO();
               var4[0] = (char)(var1 ? 45 : 43);
               var4[1] = (char)var2;
               this.OROHRRIROHHICIRCHCCRORICIIORRI = 1;
               return this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var4, 2);
            }

            if (var2 == 101 || var2 == 69) {
               char[] var3 = this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.CICHCOHCHROHRCHORHRCHHROROIHIO();
               var3[0] = (char)(var1 ? 45 : 43);
               var3[1] = '0';
               this.OROHRRIROHHICIRCHCCRORICIIORRI = 1;
               return this.IHIRRIIORRHORHRORIHOROIRCORCOO(var3, 2, var2);
            }

            if (var2 != 93 && var2 != 125) {
               this.CRICCOOHHHCHOORCICOCOHIHOIRHOO(var2, "expected digit (0-9), decimal point (.) or exponent indicator (e/E) to follow '0'");
            }
         }

         this.OOCCRCRROCIOCHHIHHCORIOHORRCCH--;
         return this.IHHCHHHCRIHOOCOIOOCRIIICIOROIR(0, "0");
      }

      this.RCRCCOCRRCOHIIRHHRHIICOOCIROHH = var1 ? 25 : 24;
      return this.IIOIRORORIIIRHCHHIOCIICOCIHICH = OHHRIOHROOIHOROCIRHCHORIHRRRRI.NOT_AVAILABLE;
   }

   protected OHHRIOHROOIHOROCIRHCHORIHRRRRI RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(char[] var1, int var2) {
      int var3 = this.OCHHOIRRHOHICRICOIIROOOIIRIHIC ? -1 : 0;

      while (this.OOCCRCRROCIOCHHIHHCORIOHORRCCH < this.HHOHOICCHOHCRCHIOOHHIRRCRCIIOC) {
         int var4 = this.HOHHHOCOOCRHOIRHCHHCOHRRHIOOCI(this.OOCCRCRROCIOCHHIHHCORIOHORRCCH) & 255;
         if (var4 < 48) {
            if (var4 == 46) {
               this.OROHRRIROHHICIRCHCCRORICIIORRI = var2 + var3;
               this.OOCCRCRROCIOCHHIHHCORIOHORRCCH++;
               return this.IHIRRIIORRHORHRORIHOROIRCORCOO(var1, var2, var4);
            }
         } else {
            if (var4 <= 57) {
               this.OOCCRCRROCIOCHHIHHCORIOHORRCCH++;
               if (var2 >= var1.length) {
                  var1 = this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.OHCOIHOOHRIOCRIRHCIHOOROCCHCRC();
               }

               var1[var2++] = (char)var4;
               continue;
            }

            if (var4 == 101 || var4 == 69) {
               this.OROHRRIROHHICIRCHCCRORICIIORRI = var2 + var3;
               this.OOCCRCRROCIOCHHIHHCORIOHORRCCH++;
               return this.IHIRRIIORRHORHRORIHOROIRCORCOO(var1, var2, var4);
            }
         }

         this.OROHRRIROHHICIRCHCCRORICIIORRI = var2 + var3;
         this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.ICOCCCOCHIHIOOCOORRRICIOCOICRR(var2);
         return this.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(OHHRIOHROOIHOROCIRHCHORIHRRRRI.VALUE_NUMBER_INT);
      }

      this.RCRCCOCRRCOHIIRHHRHIICOOCIROHH = 26;
      this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.ICOCCCOCHIHIOOCOORRRICIOCOICRR(var2);
      return this.IIOIRORORIIIRHCHHIOCIICOCIHICH = OHHRIOHROOIHOROCIRHCHORIHRRRRI.NOT_AVAILABLE;
   }

   protected OHHRIOHROOIHOROCIRHCHORIHRRRRI IHIRRIIORRHORHRORIHOROIRCORCOO(char[] var1, int var2, int var3) {
      int var4 = 0;
      if (var3 == 46) {
         if (var2 >= var1.length) {
            var1 = this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.OHCOIHOOHRIOCRIRHCIHOOROCCHCRC();
         }

         var1[var2++] = '.';

         while (true) {
            if (this.OOCCRCRROCIOCHHIHHCORIOHORRCCH >= this.HHOHOICCHOHCRCHIOOHHIRRCRCIIOC) {
               this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.ICOCCCOCHIHIOOCOORRRICIOCOICRR(var2);
               this.RCRCCOCRRCOHIIRHHRHIICOOCIROHH = 30;
               this.RHCORICCICHCCICROHOCORHOCOHCIO = var4;
               return this.IIOIRORORIIIRHCHHIOCIICOCIHICH = OHHRIOHROOIHOROCIRHCHORIHRRRRI.NOT_AVAILABLE;
            }

            byte var6 = this.RORICCORCIRHICROIORCRHRHIROHHI();
            if (var6 < 48 || var6 > 57) {
               var3 = var6 & 255;
               if (var4 == 0
                  && !this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                     com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ALLOW_TRAILING_DECIMAL_POINT_FOR_NUMBERS
                        .mappedFeature()
                  )) {
                  this.CRICCOOHHHCHOORCICOCOHIHOIRHOO(var3, "Decimal point not followed by a digit");
               }
               break;
            }

            if (var2 >= var1.length) {
               var1 = this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.OHCOIHOOHRIOCRIRHCIHOOROCCHCRC();
            }

            var1[var2++] = (char)var6;
            var4++;
         }
      }

      this.RHCORICCICHCCICROHOCORHOCOHCIO = var4;
      int var5 = 0;
      if (var3 == 101 || var3 == 69) {
         if (var2 >= var1.length) {
            var1 = this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.OHCOIHOOHRIOCRIRHCIHOOROCCHCRC();
         }

         var1[var2++] = (char)var3;
         if (this.OOCCRCRROCIOCHHIHHCORIOHORRCCH >= this.HHOHOICCHOHCRCHIOOHHIRRCRCIIOC) {
            this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.ICOCCCOCHIHIOOCOORRRICIOCOICRR(var2);
            this.RCRCCOCRRCOHIIRHHRHIICOOCIROHH = 31;
            this.ROHHICIOROHHIOCHIIRHHHCCCHHRHR = 0;
            return this.IIOIRORORIIIRHCHHIOCIICOCIHICH = OHHRIOHROOIHOROCIRHCHORIHRRRRI.NOT_AVAILABLE;
         }

         int var7 = this.RORICCORCIRHICROIORCRHRHIROHHI();
         if (var7 == 45 || var7 == 43) {
            if (var2 >= var1.length) {
               var1 = this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.OHCOIHOOHRIOCRIRHCIHOOROCCHCRC();
            }

            var1[var2++] = (char)var7;
            if (this.OOCCRCRROCIOCHHIHHCORIOHORRCCH >= this.HHOHOICCHOHCRCHIOOHHIRRCRCIIOC) {
               this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.ICOCCCOCHIHIOOCOORRRICIOCOICRR(var2);
               this.RCRCCOCRRCOHIIRHHRHIICOOCIROHH = 32;
               this.ROHHICIOROHHIOCHIIRHHHCCCHHRHR = 0;
               return this.IIOIRORORIIIRHCHHIOCIICOCIHICH = OHHRIOHROOIHOROCIRHCHORIHRRRRI.NOT_AVAILABLE;
            }

            var7 = this.RORICCORCIRHICROIORCRHRHIROHHI();
         }

         while (var7 >= 48 && var7 <= 57) {
            var5++;
            if (var2 >= var1.length) {
               var1 = this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.OHCOIHOOHRIOCRIRHCIHOOROCCHCRC();
            }

            var1[var2++] = (char)var7;
            if (this.OOCCRCRROCIOCHHIHHCORIOHORRCCH >= this.HHOHOICCHOHCRCHIOOHHIRRCRCIIOC) {
               this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.ICOCCCOCHIHIOOCOORRRICIOCOICRR(var2);
               this.RCRCCOCRRCOHIIRHHRHIICOOCIROHH = 32;
               this.ROHHICIOROHHIOCHIIRHHHCCCHHRHR = var5;
               return this.IIOIRORORIIIRHCHHIOCIICOCIHICH = OHHRIOHROOIHOROCIRHCHORIHRRRRI.NOT_AVAILABLE;
            }

            var7 = this.RORICCORCIRHICROIORCRHRHIROHHI();
         }

         var7 &= 255;
         if (var5 == 0) {
            this.CRICCOOHHHCHOORCICOCOHIHOIRHOO(var7, "Exponent indicator not followed by a digit");
         }
      }

      this.OOCCRCRROCIOCHHIHHCORIOHORRCCH--;
      this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.ICOCCCOCHIHIOOCOORRRICIOCOICRR(var2);
      this.ROHHICIOROHHIOCHIIRHHHCCCHHRHR = var5;
      return this.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(OHHRIOHROOIHOROCIRHCHORIHRRRRI.VALUE_NUMBER_FLOAT);
   }

   protected OHHRIOHROOIHOROCIRHCHORIHRRRRI ICOORRHOOCCROHIHIHIROROCIOHCCO() {
      int var1 = this.RHCORICCICHCCICROHOCORHOCOHCIO;
      char[] var2 = this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.CRHIICIOOIOHCHIOCORCROCROOHIHH();
      int var3 = this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.IIHIROCRHOIRCHRHHCHICHHOCIOOCC();
      byte var4 = this.RORICCORCIRHICROIORCRHRHIROHHI();
      boolean var5 = true;

      while (var5) {
         if (var4 >= 48 && var4 <= 57) {
            var1++;
            if (var3 >= var2.length) {
               var2 = this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.OHCOIHOOHRIOCRIRHCIHOOROCCHCRC();
            }

            var2[var3++] = (char)var4;
            if (this.OOCCRCRROCIOCHHIHHCORIOHORRCCH >= this.HHOHOICCHOHCRCHIOOHHIRRCRCIIOC) {
               this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.ICOCCCOCHIHIOOCOORRRICIOCOICRR(var3);
               this.RHCORICCICHCCICROHOCORHOCOHCIO = var1;
               return OHHRIOHROOIHOROCIRHCHORIHRRRRI.NOT_AVAILABLE;
            }

            var4 = this.RORICCORCIRHICROIORCRHRHIROHHI();
         } else if (var4 == 102 || var4 == 100 || var4 == 70 || var4 == 68) {
            this.CRICCOOHHHCHOORCICOCOHIHOIRHOO(var4, "JSON does not support parsing numbers that have 'f' or 'd' suffixes");
         } else if (var4 == 46) {
            this.CRICCOOHHHCHOORCICOCOHIHOIRHOO(var4, "Cannot parse number with more than one decimal point");
         } else {
            var5 = false;
         }
      }

      if (var1 == 0
         && !this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
            com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ALLOW_TRAILING_DECIMAL_POINT_FOR_NUMBERS
               .mappedFeature()
         )) {
         this.CRICCOOHHHCHOORCICOCOHIHOIRHOO(var4, "Decimal point not followed by a digit");
      }

      this.RHCORICCICHCCICROHOCORHOCOHCIO = var1;
      this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.ICOCCCOCHIHIOOCOORRRICIOCOICRR(var3);
      if (var4 != 101 && var4 != 69) {
         this.OOCCRCRROCIOCHHIHHCORIOHORRCCH--;
         this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.ICOCCCOCHIHIOOCOORRRICIOCOICRR(var3);
         this.ROHHICIOROHHIOCHIIRHHHCCCHHRHR = 0;
         return this.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(OHHRIOHROOIHOROCIRHCHORIHRRRRI.VALUE_NUMBER_FLOAT);
      } else {
         this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.IOHIHIIHCCCCCIHRORIOIOORCIOHII((char)var4);
         this.ROHHICIOROHHIOCHIIRHHHCCCHHRHR = 0;
         if (this.OOCCRCRROCIOCHHIHHCORIOHORRCCH >= this.HHOHOICCHOHCRCHIOOHHIRRCRCIIOC) {
            this.RCRCCOCRRCOHIIRHHRHIICOOCIROHH = 31;
            return OHHRIOHROOIHOROCIRHCHORIHRRRRI.NOT_AVAILABLE;
         } else {
            this.RCRCCOCRRCOHIIRHHRHIICOOCIROHH = 32;
            return this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(true, this.RICCCIIIROCROHORCIOCIRRROCICOR());
         }
      }
   }

   protected OHHRIOHROOIHOROCIRHCHORIHRRRRI RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(boolean var1, int var2) {
      if (var1) {
         this.RCRCCOCRRCOHIIRHHRHIICOOCIROHH = 32;
         if (var2 == 45 || var2 == 43) {
            this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.IOHIHIIHCCCCCIHRORIOIOORCIOHII((char)var2);
            if (this.OOCCRCRROCIOCHHIHHCORIOHORRCCH >= this.HHOHOICCHOHCRCHIOOHHIRRCRCIIOC) {
               this.RCRCCOCRRCOHIIRHHRHIICOOCIROHH = 32;
               this.ROHHICIOROHHIOCHIIRHHHCCCHHRHR = 0;
               return OHHRIOHROOIHOROCIRHCHORIHRRRRI.NOT_AVAILABLE;
            }

            var2 = this.RORICCORCIRHICROIORCRHRHIROHHI();
         }
      }

      char[] var3 = this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.CRHIICIOOIOHCHIOCORCROCROOHIHH();
      int var4 = this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.IIHIROCRHOIRCHRHHCHICHHOCIOOCC();
      int var5 = this.ROHHICIOROHHIOCHIIRHHHCCCHHRHR;

      while (var2 >= 48 && var2 <= 57) {
         var5++;
         if (var4 >= var3.length) {
            var3 = this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.OHCOIHOOHRIOCRIRHCIHOOROCCHCRC();
         }

         var3[var4++] = (char)var2;
         if (this.OOCCRCRROCIOCHHIHHCORIOHORRCCH >= this.HHOHOICCHOHCRCHIOOHHIRRCRCIIOC) {
            this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.ICOCCCOCHIHIOOCOORRRICIOCOICRR(var4);
            this.ROHHICIOROHHIOCHIIRHHHCCCHHRHR = var5;
            return OHHRIOHROOIHOROCIRHCHORIHRRRRI.NOT_AVAILABLE;
         }

         var2 = this.RORICCORCIRHICROIORCRHRHIROHHI();
      }

      var2 &= 255;
      if (var5 == 0) {
         this.CRICCOOHHHCHOORCICOCOHIHOIRHOO(var2, "Exponent indicator not followed by a digit");
      }

      this.OOCCRCRROCIOCHHIHHCORIOHORRCCH--;
      this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.ICOCCCOCHIHIOOCOORRRICIOCOICRR(var4);
      this.ROHHICIOROHHIOCHIIRHHHCCCHHRHR = var5;
      return this.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(OHHRIOHROOIHOROCIRHCHORIHRRRRI.VALUE_NUMBER_FLOAT);
   }

   private final String HCCHOOHHRIOHCCRRRRHRROHOOICIIO() {
      int[] var1 = ORHCCIOHRRIRCRCHCCCHIHOCHRCOHR;
      int var2 = this.OOCCRCRROCIOCHHIHHCORIOHORRCCH;
      int var3 = this.HOHHHOCOOCRHOIRHCHHCOHRRHIOOCI(var2++) & 255;
      if (var1[var3] == 0) {
         int var4 = this.HOHHHOCOOCRHOIRHCHHCOHRRHIOOCI(var2++) & 255;
         if (var1[var4] == 0) {
            int var5 = var3 << 8 | var4;
            var4 = this.HOHHHOCOOCRHOIRHCHHCOHRRHIOOCI(var2++) & 255;
            if (var1[var4] == 0) {
               var5 = var5 << 8 | var4;
               var4 = this.HOHHHOCOOCRHOIRHCHHCOHRRHIOOCI(var2++) & 255;
               if (var1[var4] == 0) {
                  var5 = var5 << 8 | var4;
                  var4 = this.HOHHHOCOOCRHOIRHCHHCOHRRHIOOCI(var2++) & 255;
                  if (var1[var4] == 0) {
                     this.RRCCHCRCHROICRCOHHHCIROIHIIICR = var5;
                     return this.ROCIOHOCOCCOOOCHHHOHHHIIRIRHHH(var2, var4);
                  } else if (var4 == 34) {
                     this.OOCCRCRROCIOCHHIHHCORIOHORRCCH = var2;
                     return this.ORHIIROIHOHHHOROORIIROIOCRHHCR(var5, 4);
                  } else {
                     return null;
                  }
               } else if (var4 == 34) {
                  this.OOCCRCRROCIOCHHIHHCORIOHORRCCH = var2;
                  return this.ORHIIROIHOHHHOROORIIROIOCRHHCR(var5, 3);
               } else {
                  return null;
               }
            } else if (var4 == 34) {
               this.OOCCRCRROCIOCHHIHHCORIOHORRCCH = var2;
               return this.ORHIIROIHOHHHOROORIIROIOCRHHCR(var5, 2);
            } else {
               return null;
            }
         } else if (var4 == 34) {
            this.OOCCRCRROCIOCHHIHHCORIOHORRCCH = var2;
            return this.ORHIIROIHOHHHOROORIIROIOCRHHCR(var3, 1);
         } else {
            return null;
         }
      } else if (var3 == 34) {
         this.OOCCRCRROCIOCHHIHHCORIOHORRCCH = var2;
         return "";
      } else {
         return null;
      }
   }

   private final String ROCIOHOCOCCOOOCHHHOHHHIIRIRHHH(int var1, int var2) {
      int[] var3 = ORHCCIOHRRIRCRCHCCCHIHOCHRCOHR;
      int var4 = this.HOHHHOCOOCRHOIRHCHHCOHRRHIOOCI(var1++) & 255;
      if (var3[var4] == 0) {
         var2 = var2 << 8 | var4;
         var4 = this.HOHHHOCOOCRHOIRHCHHCOHRRHIOOCI(var1++) & 255;
         if (var3[var4] == 0) {
            var2 = var2 << 8 | var4;
            var4 = this.HOHHHOCOOCRHOIRHCHHCOHRRHIOOCI(var1++) & 255;
            if (var3[var4] == 0) {
               var2 = var2 << 8 | var4;
               var4 = this.HOHHHOCOOCRHOIRHCHHCOHRRHIOOCI(var1++) & 255;
               if (var3[var4] == 0) {
                  return this.OCCCRRHIIOCOIHRIIHOIRRCIORHHHI(var1, var4, var2);
               } else if (var4 == 34) {
                  this.OOCCRCRROCIOCHHIHHCORIOHORRCCH = var1;
                  return this.HOIHOROOIOOCOIHCRIRIRIRRICIIHC(this.RRCCHCRCHROICRCOHHHCIROIHIIICR, var2, 4);
               } else {
                  return null;
               }
            } else if (var4 == 34) {
               this.OOCCRCRROCIOCHHIHHCORIOHORRCCH = var1;
               return this.HOIHOROOIOOCOIHCRIRIRIRRICIIHC(this.RRCCHCRCHROICRCOHHHCIROIHIIICR, var2, 3);
            } else {
               return null;
            }
         } else if (var4 == 34) {
            this.OOCCRCRROCIOCHHIHHCORIOHORRCCH = var1;
            return this.HOIHOROOIOOCOIHCRIRIRIRRICIIHC(this.RRCCHCRCHROICRCOHHHCIROIHIIICR, var2, 2);
         } else {
            return null;
         }
      } else if (var4 == 34) {
         this.OOCCRCRROCIOCHHIHHCORIOHORRCCH = var1;
         return this.HOIHOROOIOOCOIHCRIRIRIRRICIIHC(this.RRCCHCRCHROICRCOHHHCIROIHIIICR, var2, 1);
      } else {
         return null;
      }
   }

   private final String OCCCRRHIIOCOIHRIIHOIRRCIORHHHI(int var1, int var2, int var3) {
      int[] var4 = ORHCCIOHRRIRCRCHCCCHIHOCHRCOHR;
      int var5 = this.HOHHHOCOOCRHOIRHCHHCOHRRHIOOCI(var1++) & 255;
      if (var4[var5] != 0) {
         if (var5 == 34) {
            this.OOCCRCRROCIOCHHIHHCORIOHORRCCH = var1;
            return this.RORCHCIIICOHIRROOORHOCCCCIOCCI(this.RRCCHCRCHROICRCOHHHCIROIHIIICR, var3, var2, 1);
         } else {
            return null;
         }
      } else {
         var2 = var2 << 8 | var5;
         var5 = this.HOHHHOCOOCRHOIRHCHHCOHRRHIOOCI(var1++) & 255;
         if (var4[var5] != 0) {
            if (var5 == 34) {
               this.OOCCRCRROCIOCHHIHHCORIOHORRCCH = var1;
               return this.RORCHCIIICOHIRROOORHOCCCCIOCCI(this.RRCCHCRCHROICRCOHHHCIROIHIIICR, var3, var2, 2);
            } else {
               return null;
            }
         } else {
            var2 = var2 << 8 | var5;
            var5 = this.HOHHHOCOOCRHOIRHCHHCOHRRHIOOCI(var1++) & 255;
            if (var4[var5] != 0) {
               if (var5 == 34) {
                  this.OOCCRCRROCIOCHHIHHCORIOHORRCCH = var1;
                  return this.RORCHCIIICOHIRROOORHOCCCCIOCCI(this.RRCCHCRCHROICRCOHHHCIROIHIIICR, var3, var2, 3);
               } else {
                  return null;
               }
            } else {
               var2 = var2 << 8 | var5;
               var5 = this.HOHHHOCOOCRHOIRHCHHCOHRRHIOOCI(var1++) & 255;
               if (var5 == 34) {
                  this.OOCCRCRROCIOCHHIHHCORIOHORRCCH = var1;
                  return this.RORCHCIIICOHIRROOORHOCCCCIOCCI(this.RRCCHCRCHROICRCOHHHCIROIHIIICR, var3, var2, 4);
               } else {
                  return null;
               }
            }
         }
      }
   }

   private final OHHRIOHROOIHOROCIRHCHORIHRRRRI RRORCOIRRIICOOICOIOCORHORCHCOC(int var1, int var2, int var3) {
      int[] var4 = this.COHOHRRIIICIROORCHRCCHIROHRCOC;
      int[] var5 = ORHCCIOHRRIRCRCHCCCHIHOCHRCOHR;

      while (this.OOCCRCRROCIOCHHIHHCORIOHORRCCH < this.HHOHOICCHOHCRCHIOOHHIRRCRCIIOC) {
         int var6 = this.RICCCIIIROCROHORCIOCIRRROCICOR();
         if (var5[var6] == 0) {
            if (var3 < 4) {
               var3++;
               var2 = var2 << 8 | var6;
            } else {
               if (var1 >= var4.length) {
                  this.COHOHRRIIICIROORCHRCCHIROHRCOC = var4 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4, var4.length);
               }

               var4[var1++] = var2;
               var2 = var6;
               var3 = 1;
            }
         } else {
            if (var6 == 34) {
               if (var3 > 0) {
                  if (var1 >= var4.length) {
                     this.COHOHRRIIICIROORCHRCCHIROHRCOC = var4 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4, var4.length);
                  }

                  var4[var1++] = CIIRCHOCCHCHOOHIIICOCIIRCCCCOH(var2, var3);
               } else if (var1 == 0) {
                  return this.HOHOCHHHOIHRRHOCRRRIRRRCOIHOCO("");
               }

               String var9 = this.RROCRRRORCOIROIROICIOCCOIOCRCI.CRRRICCRROCOHHOHIICIHORCOORRRH(var4, var1);
               if (var9 == null) {
                  var9 = this.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var4, var1, var3);
               }

               return this.HOHOCHHHOIHRRHOCRRRIRRRCOIHOCO(var9);
            }

            if (var6 != 92) {
               this.CORCOCICIRIOHROHROIIOOHICCHCRR(var6, "name");
            } else {
               var6 = this.IRIOICHCCRCRIOICHRCHHCCIIORCCO();
               if (var6 < 0) {
                  this.RCRCCOCRRCOHIIRHHRHIICOOCIROHH = 8;
                  this.RRHIORHCCOHCCHOCHICHOORHHRHIRI = 7;
                  this.CIROIRHRHHHROIOORICHIIRHRIOIHR = var1;
                  this.CIRHIRCHIRIIRHHOIOORCIOHOHRIOI = var2;
                  this.ICOHIROHIRIIHRICOHRIROCROOCHHH = var3;
                  return this.IIOIRORORIIIRHCHHIOCIICOCIHICH = OHHRIOHROOIHOROCIRHCHORIHRRRRI.NOT_AVAILABLE;
               }
            }

            if (var1 >= var4.length) {
               this.COHOHRRIIICIROORCHRCCHIROHRCOC = var4 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4, var4.length);
            }

            if (var6 > 127) {
               if (var3 >= 4) {
                  var4[var1++] = var2;
                  var2 = 0;
                  var3 = 0;
               }

               if (var6 < 2048) {
                  var2 = var2 << 8 | 192 | var6 >> 6;
                  var3++;
               } else {
                  var2 = var2 << 8 | 224 | var6 >> 12;
                  if (++var3 >= 4) {
                     var4[var1++] = var2;
                     var2 = 0;
                     var3 = 0;
                  }

                  var2 = var2 << 8 | 128 | var6 >> 6 & 63;
                  var3++;
               }

               var6 = 128 | var6 & 63;
            }

            if (var3 < 4) {
               var3++;
               var2 = var2 << 8 | var6;
            } else {
               var4[var1++] = var2;
               var2 = var6;
               var3 = 1;
            }
         }
      }

      this.CIROIRHRHHHROIOORICHIIRHRIOIHR = var1;
      this.CIRHIRCHIRIIRHHOIOORCIOHOHRIOI = var2;
      this.ICOHIROHIRIIHRICOHRIROCROOCHHH = var3;
      this.RCRCCOCRRCOHIIRHHRHIICOOCIROHH = 7;
      return this.IIOIRORORIIIRHCHHIOCIICOCIHICH = OHHRIOHROOIHOROCIRHCHORIHRRRRI.NOT_AVAILABLE;
   }

   private OHHRIOHROOIHOROCIRHCHORIHRRRRI HCCROIOHHIHOOHCCHRHHCHOOIIIOCO(int var1) {
      switch (var1) {
         case 35:
            if ((this.CIIOIIOICHOHCOROOROHRORORCOHOH & RHIIHIIRRIRORCHCHOHROHHIRHCOHI) != 0) {
               return this.RHCORIHRIORRHIRRRRCICOOORCRIHI(4);
            }
            break;
         case 39:
            if ((this.CIIOIIOICHOHCOROOROHRORORCOHOH & HHCIHHRCOOHORHOORRORHCRHRCRICI) != 0) {
               return this.RRHOOOORORHHOOIHRCCHIIHHIIIIOH(0, 0, 0);
            }
            break;
         case 47:
            return this.ICHOCCCIHHOCRRIIICRHROIOHHROHO(4);
         case 93:
            return this.OCHHHOCHOCROHOHHOOIOIHHRHCIHCI();
      }

      if ((this.CIIOIIOICHOHCOROOROHRORORCOHOH & CRIOOHROOOCCCCHOCRORIRRCOROCCH) == 0) {
         char var2 = (char)var1;
         this.IIHRRHORCRCROCHHOHORCHCROCIHRO(var2, "was expecting double-quote to start field name");
      }

      int[] var3 = com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIIRHHIOICCCIRIRCRRHIRIOCCRIO();
      if (var3[var1] != 0) {
         this.IIHRRHORCRCROCHHOHORCHCROCIHRO(
            var1, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name"
         );
      }

      return this.RHRIIOOOCRHIIOORCOCRCHRCCRRCIH(0, var1, 1);
   }

   private OHHRIOHROOIHOROCIRHCHORIHRRRRI RHRIIOOOCRHIIOORCOCRCHRCCRRCIH(int var1, int var2, int var3) {
      int[] var4 = this.COHOHRRIIICIROORCHRCCHIROHRCOC;
      int[] var5 = com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIIRHHIOICCCIRIRCRRHIRIOCCRIO();

      while (this.OOCCRCRROCIOCHHIHHCORIOHORRCCH < this.HHOHOICCHOHCRCHIOOHHIRRCRCIIOC) {
         int var6 = this.HOHHHOCOOCRHOIRHCHHCOHRRHIOOCI(this.OOCCRCRROCIOCHHIHHCORIOHORRCCH) & 255;
         if (var5[var6] != 0) {
            if (var3 > 0) {
               if (var1 >= var4.length) {
                  this.COHOHRRIIICIROORCHRCCHIROHRCOC = var4 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4, var4.length);
               }

               var4[var1++] = var2;
            }

            String var7 = this.RROCRRRORCOIROIROICIOCCOIOCRCI.CRRRICCRROCOHHOHIICIHORCOORRRH(var4, var1);
            if (var7 == null) {
               var7 = this.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var4, var1, var3);
            }

            return this.HOHOCHHHOIHRRHOCRRRIRRRCOIHOCO(var7);
         }

         this.OOCCRCRROCIOCHHIHHCORIOHORRCCH++;
         if (var3 < 4) {
            var3++;
            var2 = var2 << 8 | var6;
         } else {
            if (var1 >= var4.length) {
               this.COHOHRRIIICIROORCHRCCHIROHRCOC = var4 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4, var4.length);
            }

            var4[var1++] = var2;
            var2 = var6;
            var3 = 1;
         }
      }

      this.CIROIRHRHHHROIOORICHIIRHRIOIHR = var1;
      this.CIRHIRCHIRIIRHHOIOORCIOHOHRIOI = var2;
      this.ICOHIROHIRIIHRICOHRIROCROOCHHH = var3;
      this.RCRCCOCRRCOHIIRHHRHIICOOCIROHH = 10;
      return this.IIOIRORORIIIRHCHHIOCIICOCIHICH = OHHRIOHROOIHOROCIRHCHORIHRRRRI.NOT_AVAILABLE;
   }

   private OHHRIOHROOIHOROCIRHCHORIHRRRRI RRHOOOORORHHOOIHRCCHIIHHIIIIOH(int var1, int var2, int var3) {
      int[] var4 = this.COHOHRRIIICIROORCHRCCHIROHRCOC;
      int[] var5 = ORHCCIOHRRIRCRCHCCCHIHOCHRCOHR;

      while (this.OOCCRCRROCIOCHHIHHCORIOHORRCCH < this.HHOHOICCHOHCRCHIOOHHIRRCRCIIOC) {
         int var6 = this.RICCCIIIROCROHORCIOCIRRROCICOR();
         if (var6 == 39) {
            if (var3 > 0) {
               if (var1 >= var4.length) {
                  this.COHOHRRIIICIROORCHRCCHIROHRCOC = var4 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4, var4.length);
               }

               var4[var1++] = CIIRCHOCCHCHOOHIIICOCIIRCCCCOH(var2, var3);
            } else if (var1 == 0) {
               return this.HOHOCHHHOIHRRHOCRRRIRRRCOIHOCO("");
            }

            String var9 = this.RROCRRRORCOIROIROICIOCCOIOCRCI.CRRRICCRROCOHHOHIICIHORCOORRRH(var4, var1);
            if (var9 == null) {
               var9 = this.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var4, var1, var3);
            }

            return this.HOHOCHHHOIHRRHOCRRRIRRRCOIHOCO(var9);
         }

         if (var6 != 34 && var5[var6] != 0) {
            if (var6 != 92) {
               this.CORCOCICIRIOHROHROIIOOHICCHCRR(var6, "name");
            } else {
               var6 = this.IRIOICHCCRCRIOICHRCHHCCIIORCCO();
               if (var6 < 0) {
                  this.RCRCCOCRRCOHIIRHHRHIICOOCIROHH = 8;
                  this.RRHIORHCCOHCCHOCHICHOORHHRHIRI = 9;
                  this.CIROIRHRHHHROIOORICHIIRHRIOIHR = var1;
                  this.CIRHIRCHIRIIRHHOIOORCIOHOHRIOI = var2;
                  this.ICOHIROHIRIIHRICOHRIROCROOCHHH = var3;
                  return this.IIOIRORORIIIRHCHHIOCIICOCIHICH = OHHRIOHROOIHOROCIRHCHORIHRRRRI.NOT_AVAILABLE;
               }
            }

            if (var6 > 127) {
               if (var3 >= 4) {
                  if (var1 >= var4.length) {
                     this.COHOHRRIIICIROORCHRCCHIROHRCOC = var4 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4, var4.length);
                  }

                  var4[var1++] = var2;
                  var2 = 0;
                  var3 = 0;
               }

               if (var6 < 2048) {
                  var2 = var2 << 8 | 192 | var6 >> 6;
                  var3++;
               } else {
                  var2 = var2 << 8 | 224 | var6 >> 12;
                  if (++var3 >= 4) {
                     if (var1 >= var4.length) {
                        this.COHOHRRIIICIROORCHRCCHIROHRCOC = var4 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4, var4.length);
                     }

                     var4[var1++] = var2;
                     var2 = 0;
                     var3 = 0;
                  }

                  var2 = var2 << 8 | 128 | var6 >> 6 & 63;
                  var3++;
               }

               var6 = 128 | var6 & 63;
            }
         }

         if (var3 < 4) {
            var3++;
            var2 = var2 << 8 | var6;
         } else {
            if (var1 >= var4.length) {
               this.COHOHRRIIICIROORCHRCCHIROHRCOC = var4 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4, var4.length);
            }

            var4[var1++] = var2;
            var2 = var6;
            var3 = 1;
         }
      }

      this.CIROIRHRHHHROIOORICHIIRHRIOIHR = var1;
      this.CIRHIRCHIRIIRHHOIOORCIOHOHRIOI = var2;
      this.ICOHIROHIRIIHRICOHRIROCROOCHHH = var3;
      this.RCRCCOCRRCOHIIRHHRHIICOOCIROHH = 9;
      return this.IIOIRORORIIIRHCHHIOCIICOCIHICH = OHHRIOHROOIHOROCIRHCHORIHRRRRI.NOT_AVAILABLE;
   }

   protected final OHHRIOHROOIHOROCIRHCHORIHRRRRI RCRICROIRCICCOOCRRRRRHICCHOCIR() {
      int var1 = this.OHCIOCCCOHCCHHOCCHOIHRHOHCICOR(this.IHCCROIROIOICIIHOOOHRCRICOIIRO, this.RCORHICRICHRIOHRCIIHICORCCOOII);
      if (var1 < 0) {
         this.RCRCCOCRRCOHIIRHHRHIICOOCIROHH = 8;
         return OHHRIOHROOIHOROCIRHCHORIHRRRRI.NOT_AVAILABLE;
      }

      if (this.CIROIRHRHHHROIOORICHIIRHRIOIHR >= this.COHOHRRIIICIROORCHRCCHIROHRCOC.length) {
         this.COHOHRRIIICIROORCHRCCHIROHRCOC = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.COHOHRRIIICIROORCHRCCHIROHRCOC, 32);
      }

      int var2 = this.CIRHIRCHIRIIRHHOIOORCIOHOHRIOI;
      int var3 = this.ICOHIROHIRIIHRICOHRIROCROOCHHH;
      if (var1 > 127) {
         if (var3 >= 4) {
            this.COHOHRRIIICIROORCHRCCHIROHRCOC[this.CIROIRHRHHHROIOORICHIIRHRIOIHR++] = var2;
            var2 = 0;
            var3 = 0;
         }

         if (var1 < 2048) {
            var2 = var2 << 8 | 192 | var1 >> 6;
            var3++;
         } else {
            var2 = var2 << 8 | 224 | var1 >> 12;
            if (++var3 >= 4) {
               this.COHOHRRIIICIROORCHRCCHIROHRCOC[this.CIROIRHRHHHROIOORICHIIRHRIOIHR++] = var2;
               var2 = 0;
               var3 = 0;
            }

            var2 = var2 << 8 | 128 | var1 >> 6 & 63;
            var3++;
         }

         var1 = 128 | var1 & 63;
      }

      if (var3 < 4) {
         var3++;
         var2 = var2 << 8 | var1;
      } else {
         this.COHOHRRIIICIROORCHRCCHIROHRCOC[this.CIROIRHRHHHROIOORICHIIRHRIOIHR++] = var2;
         var2 = var1;
         var3 = 1;
      }

      return this.RRHIORHCCOHCCHOCHICHOORHHRHIRI == 9
         ? this.RRHOOOORORHHOOIHRCCHIIHHIIIIOH(this.CIROIRHRHHHROIOORICHIIRHRIOIHR, var2, var3)
         : this.RRORCOIRRIICOOICOIOCORHORCHCOC(this.CIROIRHRHHHROIOORICHIIRHRIOIHR, var2, var3);
   }

   private int OHCIOCCCOHCCHHOCCHOIHRHOHCICOR(int var1, int var2) {
      if (this.OOCCRCRROCIOCHHIHHCORIOHORRCCH >= this.HHOHOICCHOHCRCHIOOHHIRRCRCIIOC) {
         this.IHCCROIROIOICIIHOOOHRCRICOIIRO = var1;
         this.RCORHICRICHRIOHRCIIHICORCCOOII = var2;
         return -1;
      }

      int var3 = this.RORICCORCIRHICROIORCRHRHIROHHI();
      if (var2 == -1) {
         switch (var3) {
            case 34:
            case 47:
            case 92:
               return var3;
            case 98:
               return 8;
            case 102:
               return 12;
            case 110:
               return 10;
            case 114:
               return 13;
            case 116:
               return 9;
            case 117:
               if (this.OOCCRCRROCIOCHHIHHCORIOHORRCCH >= this.HHOHOICCHOHCRCHIOOHHIRRCRCIIOC) {
                  this.RCORHICRICHRIOHRCIIHICORCCOOII = 0;
                  this.IHCCROIROIOICIIHOOOHRCRICOIIRO = 0;
                  return -1;
               }

               var3 = this.RORICCORCIRHICROIORCRHRHIROHHI();
               var2 = 0;
               break;
            default:
               char var4 = (char)var3;
               return this.ICICIOCHHHIHOCHCOHORIHRCOHHOCR(var4);
         }
      }

      var3 &= 255;

      while (true) {
         int var6 = com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.COIRIHRCCIIHCCICRHHOHRIOICRRII(
            var3
         );
         if (var6 < 0) {
            this.IIHRRHORCRCROCHHOHORCHCROCIHRO(var3 & 0xFF, "expected a hex-digit for character escape sequence");
         }

         var1 = var1 << 4 | var6;
         if (++var2 == 4) {
            return var1;
         }

         if (this.OOCCRCRROCIOCHHIHHCORIOHORRCCH >= this.HHOHOICCHOHCRCHIOOHHIRRCRCIIOC) {
            this.RCORHICRICHRIOHRCIIHICORCCOOII = var2;
            this.IHCCROIROIOICIIHOOOHRCRICOIIRO = var1;
            return -1;
         }

         var3 = this.RICCCIIIROCROHORCIOCIRRROCICOR();
      }
   }

   protected OHHRIOHROOIHOROCIRHCHORIHRRRRI CHCCOIRIICHHOCCROHCRCOOHOIIOHH() {
      int var1 = this.OOCCRCRROCIOCHHIHHCORIOHORRCCH;
      int var2 = 0;
      char[] var3 = this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.CICHCOHCHROHRCHORHRCHHROROIHIO();
      int[] var4 = RRHCCIRRIOHRCIOICRIRRIROHCOCCO;
      int var5 = Math.min(this.HHOHOICCHOHCRCHIOOHHIRRCRCIIOC, var1 + var3.length);

      while (var1 < var5) {
         int var6 = this.HOHHHOCOOCRHOIRHCHHCOHRRHIOOCI(var1) & 255;
         if (var4[var6] != 0) {
            if (var6 == 34) {
               this.OOCCRCRROCIOCHHIHHCORIOHORRCCH = var1 + 1;
               this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.ICOCCCOCHIHIOOCOORRRICIOCOICRR(var2);
               return this.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(OHHRIOHROOIHOROCIRHCHORIHRRRRI.VALUE_STRING);
            }
            break;
         }

         var1++;
         var3[var2++] = (char)var6;
      }

      this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.ICOCCCOCHIHIOOCOORRRICIOCOICRR(var2);
      this.OOCCRCRROCIOCHHIHHCORIOHORRCCH = var1;
      return this.OOHIIHOHRCHOHIRHHOORHHIIIOCHOH();
   }

   private final OHHRIOHROOIHOROCIRHCHORIHRRRRI OOHIIHOHRCHOHIRHHOORHHIIIOCHOH() {
      int[] var2 = RRHCCIRRIOHRCIOICRIRRIROHCOCCO;
      char[] var3 = this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.CRHIICIOOIOHCHIOCORCROCROOHIHH();
      int var4 = this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.IIHIROCRHOIRCHRHHCHICHHOCIOOCC();
      int var5 = this.OOCCRCRROCIOCHHIHHCORIOHORRCCH;
      int var6 = this.HHOHOICCHOHCRCHIOOHHIRRCRCIIOC - 5;

      while (var5 < this.HHOHOICCHOHCRCHIOOHHIRRCRCIIOC) {
         if (var4 >= var3.length) {
            var3 = this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.CRROICHHIOIHORHRHROHRCCOROHICO();
            var4 = 0;
         }

         int var7 = Math.min(this.HHOHOICCHOHCRCHIOOHHIRRCRCIIOC, var5 + (var3.length - var4));

         while (var5 < var7) {
            int var1 = this.HOHHHOCOOCRHOIRHCHHCOHRRHIOOCI(var5++) & 255;
            if (var2[var1] != 0) {
               if (var1 == 34) {
                  this.OOCCRCRROCIOCHHIHHCORIOHORRCCH = var5;
                  this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.ICOCCCOCHIHIOOCOORRRICIOCOICRR(var4);
                  return this.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(OHHRIOHROOIHOROCIRHCHORIHRRRRI.VALUE_STRING);
               }

               if (var5 >= var6) {
                  this.OOCCRCRROCIOCHHIHHCORIOHORRCCH = var5;
                  this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.ICOCCCOCHIHIOOCOORRRICIOCOICRR(var4);
                  if (!this.CRICCOOHHHCHOORCICOCOHIHOIRHOO(var1, var2[var1], var5 < this.HHOHOICCHOHCRCHIOOHHIRRCRCIIOC)) {
                     this.RRHIORHCCOHCCHOCHICHOORHHRHIRI = 40;
                     return this.IIOIRORORIIIRHCHHIOCIICOCIHICH = OHHRIOHROOIHOROCIRHCHORIHRRRRI.NOT_AVAILABLE;
                  }

                  var3 = this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.CRHIICIOOIOHCHIOCORCROCROOHIHH();
                  var4 = this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.IIHIROCRHOIRCHRHHCHICHHOCIOOCC();
                  var5 = this.OOCCRCRROCIOCHHIHHCORIOHORRCCH;
               } else {
                  switch (var2[var1]) {
                     case 1:
                        this.OOCCRCRROCIOCHHIHHCORIOHORRCCH = var5;
                        var1 = this.RRHHHIRHOOHOOIORIHRIOOROIHIROO();
                        var5 = this.OOCCRCRROCIOCHHIHHCORIOHORRCCH;
                        break;
                     case 2:
                        var1 = this.HCCCIIHICHIROIHHIIHCIIICCORCCR(var1, this.HOHHHOCOOCRHOIRHCHHCOHRRHIOOCI(var5++));
                        break;
                     case 3:
                        var1 = this.OCIROOIHIHRHOCCHIIIROOCRIIOCRR(
                           var1, this.HOHHHOCOOCRHOIRHCHHCOHRRHIOOCI(var5++), this.HOHHHOCOOCRHOIRHCHHCOHRRHIOOCI(var5++)
                        );
                        break;
                     case 4:
                        var1 = this.IOHHOIIOCRHCHHCRORICCOHOHROOIH(
                           var1,
                           this.HOHHHOCOOCRHOIRHCHHCOHRRHIOOCI(var5++),
                           this.HOHHHOCOOCRHOIRHCHHCOHRRHIOOCI(var5++),
                           this.HOHHHOCOOCRHOIRHCHHCOHRRHIOOCI(var5++)
                        );
                        var3[var4++] = (char)(55296 | var1 >> 10);
                        if (var4 >= var3.length) {
                           var3 = this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.CRROICHHIOIHORHRHROHRCCOROHICO();
                           var4 = 0;
                        }

                        var1 = 56320 | var1 & 1023;
                        break;
                     default:
                        if (var1 < 32) {
                           this.CORCOCICIRIOHROHROIIOOHICCHCRR(var1, "string value");
                        } else {
                           this.RRHCHIHOCHROHCRRIIIIORIHRICIRC(var1);
                        }
                  }

                  if (var4 >= var3.length) {
                     var3 = this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.CRROICHHIOIHORHRHROHRCCOROHICO();
                     var4 = 0;
                  }

                  var3[var4++] = (char)var1;
               }
               break;
            }

            var3[var4++] = (char)var1;
         }
      }

      this.OOCCRCRROCIOCHHIHHCORIOHORRCCH = var5;
      this.RCRCCOCRRCOHIIRHHRHIICOOCIROHH = 40;
      this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.ICOCCCOCHIHIOOCOORRRICIOCOICRR(var4);
      return this.IIOIRORORIIIRHCHHIOCIICOCIHICH = OHHRIOHROOIHOROCIRHCHORIHRRRRI.NOT_AVAILABLE;
   }

   protected OHHRIOHROOIHOROCIRHCHORIHRRRRI IOIHIIIRICCHCCHIHHIHRORRCIRHIO() {
      int var1 = this.OOCCRCRROCIOCHHIHHCORIOHORRCCH;
      int var2 = 0;
      char[] var3 = this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.CICHCOHCHROHRCHORHRCHHROROIHIO();
      int[] var4 = RRHCCIRRIOHRCIOICRIRRIROHCOCCO;
      int var5 = Math.min(this.HHOHOICCHOHCRCHIOOHHIRRCRCIIOC, var1 + var3.length);

      while (var1 < var5) {
         int var6 = this.HOHHHOCOOCRHOIRHCHHCOHRRHIOOCI(var1) & 255;
         if (var6 == 39) {
            this.OOCCRCRROCIOCHHIHHCORIOHORRCCH = var1 + 1;
            this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.ICOCCCOCHIHIOOCOORRRICIOCOICRR(var2);
            return this.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(OHHRIOHROOIHOROCIRHCHORIHRRRRI.VALUE_STRING);
         }

         if (var4[var6] != 0) {
            break;
         }

         var1++;
         var3[var2++] = (char)var6;
      }

      this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.ICOCCCOCHIHIOOCOORRRICIOCOICRR(var2);
      this.OOCCRCRROCIOCHHIHHCORIOHORRCCH = var1;
      return this.OROCHHIIOICRCIIRIHCOROHHOIIHCI();
   }

   private final OHHRIOHROOIHOROCIRHCHORIHRRRRI OROCHHIIOICRCIIRIHCOROHHOIIHCI() {
      int[] var2 = RRHCCIRRIOHRCIOICRIRRIROHCOCCO;
      char[] var3 = this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.CRHIICIOOIOHCHIOCORCROCROOHIHH();
      int var4 = this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.IIHIROCRHOIRCHRHHCHICHHOCIOOCC();
      int var5 = this.OOCCRCRROCIOCHHIHHCORIOHORRCCH;
      int var6 = this.HHOHOICCHOHCRCHIOOHHIRRCRCIIOC - 5;

      while (var5 < this.HHOHOICCHOHCRCHIOOHHIRRCRCIIOC) {
         if (var4 >= var3.length) {
            var3 = this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.CRROICHHIOIHORHRHROHRCCOROHICO();
            var4 = 0;
         }

         int var7 = Math.min(this.HHOHOICCHOHCRCHIOOHHIRRCRCIIOC, var5 + (var3.length - var4));

         while (var5 < var7) {
            int var1 = this.HOHHHOCOOCRHOIRHCHHCOHRRHIOOCI(var5++) & 255;
            if (var2[var1] != 0 && var1 != 34) {
               if (var5 >= var6) {
                  this.OOCCRCRROCIOCHHIHHCORIOHORRCCH = var5;
                  this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.ICOCCCOCHIHIOOCOORRRICIOCOICRR(var4);
                  if (!this.CRICCOOHHHCHOORCICOCOHIHOIRHOO(var1, var2[var1], var5 < this.HHOHOICCHOHCRCHIOOHHIRRCRCIIOC)) {
                     this.RRHIORHCCOHCCHOCHICHOORHHRHIRI = 45;
                     return this.IIOIRORORIIIRHCHHIOCIICOCIHICH = OHHRIOHROOIHOROCIRHCHORIHRRRRI.NOT_AVAILABLE;
                  }

                  var3 = this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.CRHIICIOOIOHCHIOCORCROCROOHIHH();
                  var4 = this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.IIHIROCRHOIRCHRHHCHICHHOCIOOCC();
                  var5 = this.OOCCRCRROCIOCHHIHHCORIOHORRCCH;
               } else {
                  switch (var2[var1]) {
                     case 1:
                        this.OOCCRCRROCIOCHHIHHCORIOHORRCCH = var5;
                        var1 = this.RRHHHIRHOOHOOIORIHRIOOROIHIROO();
                        var5 = this.OOCCRCRROCIOCHHIHHCORIOHORRCCH;
                        break;
                     case 2:
                        var1 = this.HCCCIIHICHIROIHHIIHCIIICCORCCR(var1, this.HOHHHOCOOCRHOIRHCHHCOHRRHIOOCI(var5++));
                        break;
                     case 3:
                        var1 = this.OCIROOIHIHRHOCCHIIIROOCRIIOCRR(
                           var1, this.HOHHHOCOOCRHOIRHCHHCOHRRHIOOCI(var5++), this.HOHHHOCOOCRHOIRHCHHCOHRRHIOOCI(var5++)
                        );
                        break;
                     case 4:
                        var1 = this.IOHHOIIOCRHCHHCRORICCOHOHROOIH(
                           var1,
                           this.HOHHHOCOOCRHOIRHCHHCOHRRHIOOCI(var5++),
                           this.HOHHHOCOOCRHOIRHCHHCOHRRHIOOCI(var5++),
                           this.HOHHHOCOOCRHOIRHCHHCOHRRHIOOCI(var5++)
                        );
                        var3[var4++] = (char)(55296 | var1 >> 10);
                        if (var4 >= var3.length) {
                           var3 = this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.CRROICHHIOIHORHRHROHRCCOROHICO();
                           var4 = 0;
                        }

                        var1 = 56320 | var1 & 1023;
                        break;
                     default:
                        if (var1 < 32) {
                           this.CORCOCICIRIOHROHROIIOOHICCHCRR(var1, "string value");
                        } else {
                           this.RRHCHIHOCHROHCRRIIIIORIHRICIRC(var1);
                        }
                  }

                  if (var4 >= var3.length) {
                     var3 = this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.CRROICHHIOIHORHRHROHRCCOROHICO();
                     var4 = 0;
                  }

                  var3[var4++] = (char)var1;
               }
               break;
            }

            if (var1 == 39) {
               this.OOCCRCRROCIOCHHIHHCORIOHORRCCH = var5;
               this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.ICOCCCOCHIHIOOCOORRRICIOCOICRR(var4);
               return this.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(OHHRIOHROOIHOROCIRHCHORIHRRRRI.VALUE_STRING);
            }

            var3[var4++] = (char)var1;
         }
      }

      this.OOCCRCRROCIOCHHIHHCORIOHORRCCH = var5;
      this.RCRCCOCRRCOHIIRHHRHIICOOCIROHH = 45;
      this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.ICOCCCOCHIHIOOCOORRRICIOCOICRR(var4);
      return this.IIOIRORORIIIRHCHHIOCIICOCIHICH = OHHRIOHROOIHOROCIRHCHORIHRRRRI.NOT_AVAILABLE;
   }

   private final boolean CRICCOOHHHCHOORCICOCOHIHOIRHOO(int var1, int var2, boolean var3) {
      switch (var2) {
         case 1:
            var1 = this.OHCIOCCCOHCCHHOCCHOIHRHOHCICOR(0, -1);
            if (var1 < 0) {
               this.RCRCCOCRRCOHIIRHHRHIICOOCIROHH = 41;
               return false;
            }

            this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.IOHIHIIHCCCCCIHRORIOIOORCIOHII((char)var1);
            return true;
         case 2:
            if (var3) {
               var1 = this.HCCCIIHICHIROIHHIIHCIIICCORCCR(var1, this.RORICCORCIRHICROIORCRHRHIROHHI());
               this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.IOHIHIIHCCCCCIHRORIOIOORCIOHII((char)var1);
               return true;
            }

            this.RCRCCOCRRCOHIIRHHRHIICOOCIROHH = 42;
            this.CIRHIRCHIRIIRHHOIOORCIOHOHRIOI = var1;
            return false;
         case 3:
            var1 &= 15;
            if (var3) {
               return this.HIHHOCRHHRORRHHRORRRIIHHORIHOC(var1, 1, this.RORICCORCIRHICROIORCRHRHIROHHI());
            }

            this.RCRCCOCRRCOHIIRHHRHIICOOCIROHH = 43;
            this.CIRHIRCHIRIIRHHOIOORCIOHOHRIOI = var1;
            this.ICOHIROHIRIIHRICOHRIROCROOCHHH = 1;
            return false;
         case 4:
            var1 &= 7;
            if (var3) {
               return this.OOCHRIIIRIHRRCRIORHCROIIHCRRIC(var1, 1, this.RORICCORCIRHICROIORCRHRHIROHHI());
            }

            this.CIRHIRCHIRIIRHHOIOORCIOHOHRIOI = var1;
            this.ICOHIROHIRIIHRICOHRIROCROOCHHH = 1;
            this.RCRCCOCRRCOHIIRHHRHIICOOCIROHH = 44;
            return false;
         default:
            if (var1 < 32) {
               this.CORCOCICIRIOHROHROIIOOHICCHCRR(var1, "string value");
            } else {
               this.RRHCHIHOCHROHCRRIIIIORIHRICIRC(var1);
            }

            this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.IOHIHIIHCCCCCIHRORIOIOORCIOHII((char)var1);
            return true;
      }
   }

   private final boolean HIHHOCRHHRORRHHRORRRIIHHORIHOC(int var1, int var2, int var3) {
      if (var2 == 1) {
         if ((var3 & 192) != 128) {
            this.IHHOICIRHRHHRRCROIOROOCCCOROIR(var3 & 0xFF, this.OOCCRCRROCIOCHHIHHCORIOHORRCCH);
         }

         var1 = var1 << 6 | var3 & 63;
         if (this.OOCCRCRROCIOCHHIHHCORIOHORRCCH >= this.HHOHOICCHOHCRCHIOOHHIRRCRCIIOC) {
            this.RCRCCOCRRCOHIIRHHRHIICOOCIROHH = 43;
            this.CIRHIRCHIRIIRHHOIOORCIOHOHRIOI = var1;
            this.ICOHIROHIRIIHRICOHRIROCROOCHHH = 2;
            return false;
         }

         var3 = this.RORICCORCIRHICROIORCRHRHIROHHI();
      }

      if ((var3 & 192) != 128) {
         this.IHHOICIRHRHHRRCROIOROOCCCOROIR(var3 & 0xFF, this.OOCCRCRROCIOCHHIHHCORIOHORRCCH);
      }

      this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.IOHIHIIHCCCCCIHRORIOIOORCIOHII((char)(var1 << 6 | var3 & 63));
      return true;
   }

   private final boolean OOCHRIIIRIHRRCRIORHCROIIHCRRIC(int var1, int var2, int var3) {
      if (var2 == 1) {
         if ((var3 & 192) != 128) {
            this.IHHOICIRHRHHRRCROIOROOCCCOROIR(var3 & 0xFF, this.OOCCRCRROCIOCHHIHHCORIOHORRCCH);
         }

         var1 = var1 << 6 | var3 & 63;
         if (this.OOCCRCRROCIOCHHIHHCORIOHORRCCH >= this.HHOHOICCHOHCRCHIOOHHIRRCRCIIOC) {
            this.RCRCCOCRRCOHIIRHHRHIICOOCIROHH = 44;
            this.CIRHIRCHIRIIRHHOIOORCIOHOHRIOI = var1;
            this.ICOHIROHIRIIHRICOHRIROCROOCHHH = 2;
            return false;
         }

         var2 = 2;
         var3 = this.RORICCORCIRHICROIORCRHRHIROHHI();
      }

      if (var2 == 2) {
         if ((var3 & 192) != 128) {
            this.IHHOICIRHRHHRRCROIOROOCCCOROIR(var3 & 0xFF, this.OOCCRCRROCIOCHHIHHCORIOHORRCCH);
         }

         var1 = var1 << 6 | var3 & 63;
         if (this.OOCCRCRROCIOCHHIHHCORIOHORRCCH >= this.HHOHOICCHOHCRCHIOOHHIRRCRCIIOC) {
            this.RCRCCOCRRCOHIIRHHRHIICOOCIROHH = 44;
            this.CIRHIRCHIRIIRHHOIOORCIOHOHRIOI = var1;
            this.ICOHIROHIRIIHRICOHRIROCROOCHHH = 3;
            return false;
         }

         var3 = this.RORICCORCIRHICROIORCRHRHIROHHI();
      }

      if ((var3 & 192) != 128) {
         this.IHHOICIRHRHHRRCROIOROOCCCOROIR(var3 & 0xFF, this.OOCCRCRROCIOCHHIHHCORIOHORRCCH);
      }

      int var4 = (var1 << 6 | var3 & 63) - 65536;
      this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.IOHIHIIHCCCCCIHRORIOIOORCIOHII((char)(55296 | var4 >> 10));
      var4 = 56320 | var4 & 1023;
      this.ORORCCRCCOIIOIHRHCIIOICHHIHHCR.IOHIHIIHCCCCCIHRORIOIOORCIOHII((char)var4);
      return true;
   }

   private final int IRIOICHCCRCRIOICHRCHHCCIIORCCO() {
      int var1 = this.HHOHOICCHOHCRCHIOOHHIRRCRCIIOC - this.OOCCRCRROCIOCHHIHHCORIOHORRCCH;
      return var1 < 5 ? this.OHCIOCCCOHCCHHOCCHOIHRHOHCICOR(0, -1) : this.RRHHHIRHOOHOOIORIHRIOOROIHIROO();
   }

   private final int RRHHHIRHOOHOOIORIHRIOOROIHIROO() {
      byte var1 = this.RORICCORCIRHICROIORCRHRHIROHHI();
      switch (var1) {
         case 34:
         case 47:
         case 92:
            return (char)var1;
         case 98:
            return 8;
         case 102:
            return 12;
         case 110:
            return 10;
         case 114:
            return 13;
         case 116:
            return 9;
         case 117:
            byte var5 = this.RORICCORCIRHICROIORCRHRHIROHHI();
            int var3 = com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.COIRIHRCCIIHCCICRHHOHRIOICRRII(
               var5
            );
            int var4 = var3;
            if (var3 >= 0) {
               var5 = this.RORICCORCIRHICROIORCRHRHIROHHI();
               var3 = com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.COIRIHRCCIIHCCICRHHOHRIOICRRII(
                  var5
               );
               if (var3 >= 0) {
                  var4 = var4 << 4 | var3;
                  var5 = this.RORICCORCIRHICROIORCRHRHIROHHI();
                  var3 = com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.COIRIHRCCIIHCCICRHHOHRIOICRRII(
                     var5
                  );
                  if (var3 >= 0) {
                     var4 = var4 << 4 | var3;
                     var5 = this.RORICCORCIRHICROIORCRHRHIROHHI();
                     var3 = com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.COIRIHRCCIIHCCICRHHOHRIOICRRII(
                        var5
                     );
                     if (var3 >= 0) {
                        return var4 << 4 | var3;
                     }
                  }
               }
            }

            this.IIHRRHORCRCROCHHOHORCHCROCIHRO(var5 & 255, "expected a hex-digit for character escape sequence");
            return -1;
         default:
            char var2 = (char)var1;
            return this.ICICIOCHHHIHOCHCOHORIHRCOHHOCR(var2);
      }
   }

   private final int HCCCIIHICHIROIHHIIHCIIICCORCCR(int var1, int var2) {
      if ((var2 & 192) != 128) {
         this.IHHOICIRHRHHRRCROIOROOCCCOROIR(var2 & 0xFF, this.OOCCRCRROCIOCHHIHHCORIOHORRCCH);
      }

      return (var1 & 31) << 6 | var2 & 63;
   }

   private final int OCIROOIHIHRHOCCHIIIROOCRIIOCRR(int var1, int var2, int var3) {
      var1 &= 15;
      if ((var2 & 192) != 128) {
         this.IHHOICIRHRHHRRCROIOROOCCCOROIR(var2 & 0xFF, this.OOCCRCRROCIOCHHIHHCORIOHORRCCH);
      }

      var1 = var1 << 6 | var2 & 63;
      if ((var3 & 192) != 128) {
         this.IHHOICIRHRHHRRCROIOROOCCCOROIR(var3 & 0xFF, this.OOCCRCRROCIOCHHIHHCORIOHORRCCH);
      }

      return var1 << 6 | var3 & 63;
   }

   private final int IOHHOIIOCRHCHHCRORICCOHOHROOIH(int var1, int var2, int var3, int var4) {
      if ((var2 & 192) != 128) {
         this.IHHOICIRHRHHRRCROIOROOCCCOROIR(var2 & 0xFF, this.OOCCRCRROCIOCHHIHHCORIOHORRCCH);
      }

      var1 = (var1 & 7) << 6 | var2 & 63;
      if ((var3 & 192) != 128) {
         this.IHHOICIRHRHHRRCROIOROOCCCOROIR(var3 & 0xFF, this.OOCCRCRROCIOCHHIHHCORIOHORRCCH);
      }

      var1 = var1 << 6 | var3 & 63;
      if ((var4 & 192) != 128) {
         this.IHHOICIRHRHHRRCROIOROOCCCOROIR(var4 & 0xFF, this.OOCCRCRROCIOCHHIHHCORIOHORRCCH);
      }

      return (var1 << 6 | var4 & 63) - 65536;
   }
}
