package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import java.io.Closeable;
import java.io.Flushable;
import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public abstract class CRICCOOHHHCHOORCICOCOHIHOIRHOO implements ROOCOCCCIRHHHIRIOIHHHHRHIICHHR, Closeable, Flushable {
   protected static final com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.CORCOCICIRIOHROHROIIOOHICCHCRR<ORHIOICIOCRRHOOCOHRORIHICHRCRR> CRRCIOIOIOHCICHROOHOHHORCIICCC = com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      ORHIOICIOCRRHOOCOHRORIHICHRCRR.values()
   );
   protected static final com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.CORCOCICIRIOHROHROIIOOHICCHCRR<ORHIOICIOCRRHOOCOHRORIHICHRCRR> OHCHRRRHCHRIRORHHRHICIROHRRRIC = CRRCIOIOIOHCICHROOHOHHORCIICCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      ORHIOICIOCRRHOOCOHRORIHICHRCRR.CAN_WRITE_FORMATTED_NUMBERS
   );
   protected static final com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.CORCOCICIRIOHROHROIIOOHICCHCRR<ORHIOICIOCRRHOOCOHRORIHICHRCRR> RRCICORRORIRIHHRHRROHOICOCCCCO = CRRCIOIOIOHCICHROOHOHHORCIICCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      ORHIOICIOCRRHOOCOHRORIHICHRCRR.CAN_WRITE_BINARY_NATIVELY
   );
   protected HICRRICCHCCROOHHCHOCOCCHOIHHOC OOORCORCIHCCRRICIIIOOCORRORCOR;

   protected CRICCOOHHHCHOORCICOCOHIHOIRHOO() {
   }

   public abstract CRICCOOHHHCHOORCICOCOHIHOIRHOO IRCIIHHICIHRCOCRROCOICRIHHCCHH(RICRIRRCOHRCOCRRHHCRHRROOIOHHR var1);

   public abstract RICRIRRCOHRCOCRRHHCRHRROOIOHHR IRRIHOORCIHROCIHRIIRRHOCORIIRO();

   @Override
   public abstract OIHCOHRCICCCRHRCROOCIOIRRHHHIH version();

   public abstract IIRHCHHOICHRICOOCRORCCIOOIHOIR OHICCORHIOHRHOHCHHOHCRIOOOOHIR();

   public Object HCRORCHIIOIRRIHHCCCCCOROCOCCHC() {
      return null;
   }

   public Object ICRRHOCIRCCHHROCHIOOIOHOHRHORC() {
      return this.ICOCOHRRRORIIHIRRICICCHCHIIOHI();
   }

   public void HRICIORORHCRHCCCIIIHRRHCICOHOR(Object var1) {
      this.IHHCHIIHOOHRROCRRRHHHCOOHCOORC(var1);
   }

   public Object ICOCOHRRRORIIHIRRICICCHCHIIOHI() {
      IIRHCHHOICHRICOOCRORCCIOOIHOIR var1 = this.OHICCORHIOHRHOHCHHOHCRIOOOOHIR();
      return var1 == null ? null : var1.ICOCOHRRRORIIHIRRICICCHCHIIOHI();
   }

   public void IHHCHIIHOOHRROCRRRHHHCOOHCOORC(Object var1) {
      IIRHCHHOICHRICOOCRORCCIOOIHOIR var2 = this.OHICCORHIOHRHOHCHHOHCRIOOOOHIR();
      if (var2 != null) {
         var2.IHHCHIIHOOHRROCRRRHHHCOOHCOORC(var1);
      }
   }

   public abstract CRICCOOHHHCHOORCICOCOHIHOIRHOO CRRRICCRROCOHHOHIICIHORCOORRRH(CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1);

   public abstract CRICCOOHHHCHOORCICOCOHIHOIRHOO RRCRRCORICCHOHHIRCHIROOHIIOHCO(CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1);

   public final CRICCOOHHHCHOORCICOCOHIHOIRHOO IRCIIHHICIHRCOCRROCOICRIHHCCHH(CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1, boolean var2) {
      if (var2) {
         this.CRRRICCRROCOHHOHIICIHORCOORRRH(var1);
      } else {
         this.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var1);
      }

      return this;
   }

   public abstract boolean HHCCIRHCCCIIRHCROHIORHIRHHIORH(CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1);

   public boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO var1) {
      return this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1.mappedFeature());
   }

   public abstract int ICRIIIROOCRRHOCIIOORRROHICOOHO();

   @Deprecated
   public abstract CRICCOOHHHCHOORCICOCOHIHOIRHOO IHRRCOCOIIIIICRHRRICIOCRCIRHCO(int var1);

   public CRICCOOHHHCHOORCICOCOHIHOIRHOO RORRCRCHIRCHHOOIHCCHRCHORHCICI(int var1, int var2) {
      int var3 = this.ICRIIIROOCRRHOCIIOORRROHICOOHO();
      int var4 = var3 & ~var2 | var1 & var2;
      return this.IHRRCOCOIIIIICRHRRICIOCRCIRHCO(var4);
   }

   public int IRORHRRHHIIOOHCIRIICCIORHROOOC() {
      return 0;
   }

   public CRICCOOHHHCHOORCICOCOHIHOIRHOO ROCHRRCORRCOOOOOCOICOCROIIHIHH(int var1, int var2) {
      return this;
   }

   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(CRRRICCRROCOHHOHIICIHORCOORRRH var1) {
      throw new UnsupportedOperationException(
         String.format("Generator of type %s does not support schema of type '%s'", this.getClass().getName(), var1.IIIIRHIHROIRCROHHROIHIIHRCRRHO())
      );
   }

   public CRRRICCRROCOHHOHIICIHORCOORRRH HCHHOOORIICCROCICCOIRRHHHOIHRC() {
      return null;
   }

   public CRICCOOHHHCHOORCICOCOHIHOIRHOO RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HICRRICCHCCROOHHCHOCOCCHOIHHOC var1) {
      this.OOORCORCIHCCRRICIIIOOCORRORCOR = var1;
      return this;
   }

   public HICRRICCHCCROOHHCHOCOCCHOIHHOC HIROICHIIOIOORCICCICOHCCCIHOHC() {
      return this.OOORCORCIHCCRRICIIIOOCORRORCOR;
   }

   public abstract CRICCOOHHHCHOORCICOCOHIHOIRHOO IHIORIIRHOIICIROCRHCRCRHOOIIIC();

   public CRICCOOHHHCHOORCICOCOHIHOIRHOO IRORRCRORIHIIROORHIIRHROOIIHOO(int var1) {
      return this;
   }

   public int IORCIRHIIROHRICOCIRIRCRCROICRI() {
      return 0;
   }

   public com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CRRRICCRROCOHHOHIICIHORCOORRRH CHHRICHHIOOOHOHRROOROIHCCOHIHR() {
      return null;
   }

   public CRICCOOHHHCHOORCICOCOHIHOIRHOO HHCCIRHCCCIIRHCROHIORHIRHHIORH(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CRRRICCRROCOHHOHIICIHORCOORRRH var1
   ) {
      return this;
   }

   public CRICCOOHHHCHOORCICOCOHIHOIRHOO IRCIIHHICIHRCOCRROCOICRIHHCCHH(RIROICHCRROROHCCROOCCCCOCHCCRI var1) {
      throw new UnsupportedOperationException();
   }

   public int IOORRCHHIICIHRRCHRICRIIIRHIROI() {
      return -1;
   }

   public boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CRRRICCRROCOHHOHIICIHORCOORRRH var1) {
      return false;
   }

   public boolean HRHHRRHIRIOHIRIIRIHCRCRIRHCIRI() {
      return false;
   }

   public boolean IHICRRORCHICCIHRRRHCOOIHOIICII() {
      return false;
   }

   public boolean RIIRIRIOIOCOHIOHHROHRIRCIRCIOC() {
      return false;
   }

   public boolean CCOHCICRHHORCOHCCCCCHOCCCOCIHO() {
      return true;
   }

   public boolean HCHCHOHICOOCCOHRIOROCORHHHCHRR() {
      return false;
   }

   public com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.CORCOCICIRIOHROHROIIOOHICCHCRR<ORHIOICIOCRRHOOCOHRORIHICHRCRR> CCCIOCRHOIIOHOOCIOHIHRHIHIROHH() {
      return CRRCIOIOIOHCICHROOHOHHORCIICCC;
   }

   public abstract void CRHOOIRCIORIHCHOHCIIIHIROROHRR();

   @Deprecated
   public void CHHOOCORICIHCOHRRCOIRRCIOORRIC(int var1) {
      this.CRHOOIRCIORIHCHOHCIIIHIROROHRR();
   }

   public void CICOOHICHIROHIRCRRIOIIRRIHCCHC(Object var1) {
      this.CRHOOIRCIORIHCHOHCIIIHIROROHRR();
      this.IHHCHIIHOOHRROCRRRHHHCOOHCOORC(var1);
   }

   public void OHHRIOHROOIHOROCIRHCHORIHRRRRI(Object var1, int var2) {
      this.CHHOOCORICIHCOHRRCOIRRCIOORRIC(var2);
      this.IHHCHIIHOOHRROCRRRHHHCOOHCOORC(var1);
   }

   public abstract void CCROCOHIICIIRIOIRRHHORRCHOIIRC();

   public abstract void HHRRHIHIRCIHORIHHCORCCHRHHRCOH();

   public void IRRIHROCORIOOCHHCHCHOHCIOHHRRI(Object var1) {
      this.HHRRHIHIRCIHORIHHCORCCHRHHRCOH();
      this.IHHCHIIHOOHRROCRRRHHHCOOHCOORC(var1);
   }

   public void RHOCHHIRRCHHHOHOIRROIROHHHIHIO(Object var1, int var2) {
      this.IRRIHROCORIOOCHHCHCHOHCIOHHRRI(var1);
   }

   public abstract void RORCROIROCHHOOICHRICCCRHROHROC();

   public abstract void OICHRIIHIORHOOOIOCHHOCRORIHIOH(String var1);

   public abstract void HHCCIRHCCCIIRHCROHIORHIRHHIORH(RIROICHCRROROHCCROOCCCCOCHCCRI var1);

   public void ROCHRRCORRCOOOOOCOICOCROIIHIHH(long var1) {
      this.OICHRIIHIORHOOOIOCHHOCRORIHIOH(Long.toString(var1));
   }

   public void CRRRICCRROCOHHOHIICIHORCOORRRH(int[] var1, int var2, int var3) {
      if (var1 == null) {
         throw new IllegalArgumentException("null array");
      }

      this.CCHHCIRHICHHHHRRIHIORCCORCCIHR(var1.length, var2, var3);
      this.OHHRIOHROOIHOROCIRHCHORIHRRRRI(var1, var3);
      int var4 = var2;

      for (int var5 = var2 + var3; var4 < var5; var4++) {
         this.CORHHROICCOCRHRCCOOHCRCRHICHOI(var1[var4]);
      }

      this.CCROCOHIICIIRIOIRRHHORRCHOIIRC();
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(long[] var1, int var2, int var3) {
      if (var1 == null) {
         throw new IllegalArgumentException("null array");
      }

      this.CCHHCIRHICHHHHRRIHIORCCORCCIHR(var1.length, var2, var3);
      this.OHHRIOHROOIHOROCIRHCHORIHRRRRI(var1, var3);
      int var4 = var2;

      for (int var5 = var2 + var3; var4 < var5; var4++) {
         this.IOHCRRIIHCIHORROOCHCCORIHRHCII(var1[var4]);
      }

      this.CCROCOHIICIIRIOIRRHHORRCHOIIRC();
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(double[] var1, int var2, int var3) {
      if (var1 == null) {
         throw new IllegalArgumentException("null array");
      }

      this.CCHHCIRHICHHHHRRIHIORCCORCCIHR(var1.length, var2, var3);
      this.OHHRIOHROOIHOROCIRHCHORIHRRRRI(var1, var3);
      int var4 = var2;

      for (int var5 = var2 + var3; var4 < var5; var4++) {
         this.OCIOROHIHRROROOIRRHRRCCHHRRRHI(var1[var4]);
      }

      this.CCROCOHIICIIRIOIRRHHORRCHOIIRC();
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String[] var1, int var2, int var3) {
      if (var1 == null) {
         throw new IllegalArgumentException("null array");
      }

      this.CCHHCIRHICHHHHRRIHIORCCORCCIHR(var1.length, var2, var3);
      this.OHHRIOHROOIHOROCIRHCHORIHRRRRI(var1, var3);
      int var4 = var2;

      for (int var5 = var2 + var3; var4 < var5; var4++) {
         this.writeString(var1[var4]);
      }

      this.CCROCOHIICIIRIOIRRHHORRCHOIIRC();
   }

   public abstract void writeString(String var1);

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Reader var1, int var2) {
      this.CIIOHCOCCOCHCHOOOCORCORHIHHCRH();
   }

   public abstract void IRCIIHHICIHRCOCRROCOICRIHHCCHH(char[] var1, int var2, int var3);

   public abstract void CRRRICCRROCOHHOHIICIHORCOORRRH(RIROICHCRROROHCCROOCCCCOCHCCRI var1);

   public abstract void IOHIHIIHCCCCCIHRORIOIOORCIOHII(byte[] var1, int var2, int var3);

   public abstract void RCIROOOOICRHCCRRCIORHHIRCOIIIC(byte[] var1, int var2, int var3);

   public abstract void RCHHCIORHROICHORIROHHOOHHCRIHO(String var1);

   public abstract void CRRRICCRROCOHHOHIICIHORCOORRRH(String var1, int var2, int var3);

   public abstract void HHCCIRHCCCIIRHCROHIORHIRHHIORH(char[] var1, int var2, int var3);

   public abstract void IHCRORHRORIICHRHRCHRRIRRHHOCOO(char var1);

   public void RRCRRCORICCHOHHIRCHIROOHIIOHCO(RIROICHCRROROHCCROOCCCCOCHCCRI var1) {
      this.RCHHCIORHROICHORIROHHOOHHCRIHO(var1.getValue());
   }

   public abstract void HRIOHCCIOOIORHRHCIRCRRIIOHCHHI(String var1);

   public abstract void RRCRRCORICCHOHHIRCHIROOHIIOHCO(String var1, int var2, int var3);

   public abstract void CRRRICCRROCOHHOHIICIHORCOORRRH(char[] var1, int var2, int var3);

   public void RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(RIROICHCRROROHCCROOCCCCOCHCCRI var1) {
      this.HRIOHCCIOOIORHRHCIRCRRIIOHCHHI(var1.getValue());
   }

   public abstract void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1,
      byte[] var2,
      int var3,
      int var4
   );

   public void OOCCRCRCOHIIORCCORCRCIRRROIOOR(byte[] var1, int var2, int var3) {
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IRCIIHHICIHRCOCRROCOICRIHHCCHH.HCIIRCCOCICRIOOHOOORHRCRRIIIOR(), var1, var2, var3);
   }

   public void OHRRHHOCROROCCIRROIHOCCHCIHCIR(byte[] var1) {
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IRCIIHHICIHRCOCRROCOICRIHHCCHH.HCIIRCCOCICRIOOHOOORHRCRRIIIOR(), var1, 0, var1.length);
   }

   public int CORCOCICIRIOHROHROIIOOHICCHCRR(InputStream var1, int var2) {
      return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IRCIIHHICIHRCOCRROCOICRIHHCCHH.HCIIRCCOCICRIOOHOOORHRCRRIIIOR(), var1, var2);
   }

   public abstract int RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1, InputStream var2, int var3
   );

   public void RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(short var1) {
      this.CORHHROICCOCRHRCCOOHCRCRHICHOI(var1);
   }

   public abstract void CORHHROICCOCRHRCCOOHCRCRHICHOI(int var1);

   public abstract void IOHCRRIIHCIHORROOCHCCORIHRHCII(long var1);

   public abstract void HHCCIRHCCCIIRHCROHIORHIRHHIORH(BigInteger var1);

   public abstract void OCIOROHIHRROROOIRRHRRCCHHRRRHI(double var1);

   public abstract void IRIRICIHHCOICHHCHCOCCHHOROOCHH(float var1);

   public abstract void OHHRIOHROOIHOROCIRHCHORIHRRRRI(BigDecimal var1);

   public abstract void HIRHRCRHCHCIICCIOOCROHOOIOIRHH(String var1);

   public void RRCRRCORICCHOHHIRCHIROOHIIOHCO(char[] var1, int var2, int var3) {
      this.HIRHRCRHCHCIICCIOOCROHOOIOIRHH(new String(var1, var2, var3));
   }

   public abstract void writeBoolean(boolean var1);

   public abstract void RORIRIIORRCIIOHCHCHOOCIHOOHCIC();

   public void IHRCROHROHOCCHIHOHRROHOCOIRHIO(Object var1) {
      if (var1 == null) {
         this.RORIRIIORRCIIOHCHCHOOCIHOOHCIC();
      } else if (var1 instanceof byte[]) {
         this.OHRRHHOCROROCCIRROIHOCCHCIHCIR((byte[])var1);
      } else {
         throw new CORCOCICIRIOHROHROIIOOHICCHCRR("No native support for writing embedded objects of type " + var1.getClass().getName(), this);
      }
   }

   public void ORCORCRRIRIROIORRCCCCHRHRCOHOH(Object var1) {
      throw new CORCOCICIRIOHROHROIIOOHICCHCRR("No native support for writing Object Ids", this);
   }

   public void COOOIIOHIRCRCHIHRHHICOOHIOORRR(Object var1) {
      throw new CORCOCICIRIOHROHROIIOOHICCHCRR("No native support for writing Object Ids", this);
   }

   public void ROIHROCROORRCCOIRRIHHORCROOORO(Object var1) {
      throw new CORCOCICIRIOHROHROIIOOHICCHCRR("No native support for writing Type Ids", this);
   }

   public com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1
   ) {
      Object var2 = var1.COCIHCORCIRICHRHHCCCIHIIHCCIRC;
      OHHRIOHROOIHOROCIRHCHORIHRRRRI var3 = var1.IRIOCCOHIHOOOCCRCROHIOOORHOOIO;
      if (this.IHICRRORCHICCIHRRRHCOOIHOIICII()) {
         var1.OCHIRHOCIHICRIHCIRHOOIRRCCRCCI = false;
         this.ROIHROCROORRCCOIRRIHHORCROOORO(var2);
      } else {
         String var4 = var2 instanceof String ? (String)var2 : String.valueOf(var2);
         var1.OCHIRHOCIHICRIHCIRHOOIRRCCRCCI = true;
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var5 = var1.CHORHCCCICRIIHICIOCIIROHCHHHOI;
         if (var3 != OHHRIOHROOIHOROCIRHCHORIHRRRRI.START_OBJECT && var5.requiresObjectContext()) {
            var5 = com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.WRAPPER_ARRAY;
            var1.CHORHCCCICRIIHICIOCIIROHCHHHOI = com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.WRAPPER_ARRAY;
         }

         switch (var5) {
            case PARENT_PROPERTY:
            case PAYLOAD_PROPERTY:
               break;
            case METADATA_PROPERTY:
               this.IRRIHROCORIOOCHHCHCHOHCIOHHRRI(var1.CHRIICCOCCCRHROHCIIRRRHIRCRIHR);
               this.RROIIRROOOOHIORHRICHOCHIHCRRCH(var1.HIIRIHCICROOIRIHCOHRIRCHHOHCOI, var4);
               return var1;
            case WRAPPER_OBJECT:
               this.HHRRHIHIRCIHORIHHCORCCHRHHRCOH();
               this.OICHRIIHIORHOOOIOCHHOCRORIHIOH(var4);
               break;
            case WRAPPER_ARRAY:
            default:
               this.CRHOOIRCIORIHCHOHCIIIHIROROHRR();
               this.writeString(var4);
         }
      }

      if (var3 == OHHRIOHROOIHOROCIRHCHORIHRRRRI.START_OBJECT) {
         this.IRRIHROCORIOOCHHCHCHOHCIOHHRRI(var1.CHRIICCOCCCRHROHCIIRRRHIRCRIHR);
      } else if (var3 == OHHRIOHROOIHOROCIRHCHORIHRRRRI.START_ARRAY) {
         this.CRHOOIRCIORIHCHOHCIIIHIROROHRR();
      }

      return var1;
   }

   public com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1
   ) {
      OHHRIOHROOIHOROCIRHCHORIHRRRRI var2 = var1.IRIOCCOHIHOOOCCRCROHIOOORHOOIO;
      if (var2 == OHHRIOHROOIHOROCIRHCHORIHRRRRI.START_OBJECT) {
         this.RORCROIROCHHOOICHRICCCRHROHROC();
      } else if (var2 == OHHRIOHROOIHOROCIRHCHORIHRRRRI.START_ARRAY) {
         this.CCROCOHIICIIRIOIRRHHORRCHOIIRC();
      }

      if (var1.OCHIRHOCIHICRIHCIRHOOIRRCCRCCI) {
         switch (var1.CHORHCCCICRIIHICIOCIIROHCHHHOI) {
            case PARENT_PROPERTY:
               Object var3 = var1.COCIHCORCIRICHRHHCCCIHIIHCCIRC;
               String var4 = var3 instanceof String ? (String)var3 : String.valueOf(var3);
               this.RROIIRROOOOHIORHRICHOCHIHCRRCH(var1.HIIRIHCICROOIRIHCOHRIRCHHOHCOI, var4);
            case PAYLOAD_PROPERTY:
            case METADATA_PROPERTY:
               break;
            case WRAPPER_OBJECT:
            default:
               this.RORCROIROCHHOOICHRICCCRHROHROC();
               break;
            case WRAPPER_ARRAY:
               this.CCROCOHIICIIRIOIRRHHORRCHOIIRC();
         }
      }

      return var1;
   }

   public void OHHHIRCIIIRRCORHHRICIRCOORORCH(Object var1) {
      this.RHCICHRICRIIIHRRCICHOOOIOOOICH(var1);
   }

   public abstract void RHCICHRICRIIIHRRCICHOOOIOOOICH(Object var1);

   public abstract void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RIRHOCHIORCCIIOIIRHOCCCRHHCHHH var1);

   public void RRCRRCORICCHOHHIRCHIROOHIIOHCO(String var1, byte[] var2) {
      this.OICHRIIHIORHOOOIOCHHOCRORIHIOH(var1);
      this.OHRRHHOCROROCCIRROIHOCCHCIHCIR(var2);
   }

   public void RORCHCIIICOHIRROOORHOCCCCIOCCI(String var1, boolean var2) {
      this.OICHRIIHIORHOOOIOCHHOCRORIHIOH(var1);
      this.writeBoolean(var2);
   }

   public void IIRORHHOIHCICOROIIIRRIHHRHIHOC(String var1) {
      this.OICHRIIHIORHOOOIOCHHOCRORIHIOH(var1);
      this.RORIRIIORRCIIOHCHCHOOCIHOOHCIC();
   }

   public void RROIIRROOOOHIORHRICHOCHIHCRRCH(String var1, String var2) {
      this.OICHRIIHIORHOOOIOCHHOCRORIHIOH(var1);
      this.writeString(var2);
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, short var2) {
      this.OICHRIIHIORHOOOIOCHHOCRORIHIOH(var1);
      this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var2);
   }

   public void IOHIHIIHCCCCCIHRORIOIOORCIOHII(String var1, int var2) {
      this.OICHRIIHIORHOOOIOCHHOCRORIHIOH(var1);
      this.CORHHROICCOCRHRCCOOHCRCRHICHOI(var2);
   }

   public void HHCCIRHCCCIIRHCROHIORHIRHHIORH(String var1, long var2) {
      this.OICHRIIHIORHOOOIOCHHOCRORIHIOH(var1);
      this.IOHCRRIIHCIHORROOCHCCORIHRHCII(var2);
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, BigInteger var2) {
      this.OICHRIIHIORHOOOIOCHHOCRORIHIOH(var1);
      this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var2);
   }

   public void RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(String var1, float var2) {
      this.OICHRIIHIORHOOOIOCHHOCRORIHIOH(var1);
      this.IRIRICIHHCOICHHCHCOCCHHOROOCHH(var2);
   }

   public void OOROOCCIRCCRHOIOIORIHCHHOOCCOR(String var1, double var2) {
      this.OICHRIIHIORHOOOIOCHHOCRORIHIOH(var1);
      this.OCIOROHIHRROROOIRRHRRCCHHRRRHI(var2);
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, BigDecimal var2) {
      this.OICHRIIHIORHOOOIOCHHOCRORIHIOH(var1);
      this.OHHRIOHROOIHOROCIRHCHORIHRRRRI(var2);
   }

   public void CIHCCOCICROCOOCOCCOCRHOCIHRCRO(String var1) {
      this.OICHRIIHIORHOOOIOCHHOCRORIHIOH(var1);
      this.CRHOOIRCIORIHCHOHCIIIHIROROHRR();
   }

   public void RROOHCOHROIIROCRCRICHOHHCCOOCR(String var1) {
      this.OICHRIIHIORHOOOIOCHHOCRORIHIOH(var1);
      this.HHRRHIHIRCIHORIHHCORCCHRHHRCOH();
   }

   public void RIROICHCRROROHCCROOCCCCOCHCCRI(String var1, Object var2) {
      this.IHIRRIIORRHORHRORIHOROIRCORCOO(var1, var2);
   }

   public void IHIRRIIORRHORHRORIHOROIRCORCOO(String var1, Object var2) {
      this.OICHRIIHIORHOOOIOCHHOCRORIHIOH(var1);
      this.RHCICHRICRIIIHRRCICHOOOIOOOICH(var2);
   }

   public void HOOOHCROCOIRIIRCIIICOCOHRRCOCR(String var1) {
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(OCOHORHCROHICRRIHCIHHRRCIHICRI var1) {
      OHHRIOHROOIHOROCIRHCHORIHRRRRI var2 = var1.COCHOCOHRICCHIIIHIOORCIIRROOHI();
      int var3 = var2 == null ? -1 : var2.id();
      switch (var3) {
         case -1:
            this.COCOCCIORORHIIROHIOIOHIHCRIOOO("No current event to copy");
            break;
         case 0:
         default:
            throw new IllegalStateException("Internal error: unknown current token, " + var2);
         case 1:
            this.HHRRHIHIRCIHORIHHCORCCHRHHRCOH();
            break;
         case 2:
            this.RORCROIROCHHOOICHRICCCRHROHROC();
            break;
         case 3:
            this.CRHOOIRCIORIHCHOHCIIIHIROROHRR();
            break;
         case 4:
            this.CCROCOHIICIIRIOIRRHHORRCHOIIRC();
            break;
         case 5:
            this.OICHRIIHIORHOOOIOCHHOCRORIHIOH(var1.CIOOORCHHCOOOOIIOOCIOICCRRORCH());
            break;
         case 6:
            this.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var1);
            break;
         case 7:
            this.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var1);
            break;
         case 8:
            this.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var1);
            break;
         case 9:
            this.writeBoolean(true);
            break;
         case 10:
            this.writeBoolean(false);
            break;
         case 11:
            this.RORIRIIORRCIIOHCHCHOOCIHOOHCIC();
            break;
         case 12:
            this.RHCICHRICRIIIHRRCICHOOOIOOOICH(var1.RRIHRHCOCCRROCCHIRHHHIIICHCRRR());
      }
   }

   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(OCOHORHCROHICRRIHCIHHRRCIHICRI var1) {
      OHHRIOHROOIHOROCIRHCHORIHRRRRI var2 = var1.COCHOCOHRICCHIIIHIOORCIIRROOHI();
      int var3 = var2 == null ? -1 : var2.id();
      switch (var3) {
         case -1:
            this.COCOCCIORORHIIROHIOIOHIHCRIOOO("No current event to copy");
            break;
         case 0:
         default:
            throw new IllegalStateException("Internal error: unknown current token, " + var2);
         case 1:
            this.HHRRHIHIRCIHORIHHCORCCHRHHRCOH();
            break;
         case 2:
            this.RORCROIROCHHOOICHRICCCRHROHROC();
            break;
         case 3:
            this.CRHOOIRCIORIHCHOHCIIIHIROROHRR();
            break;
         case 4:
            this.CCROCOHIICIIRIOIRRHHORRCHOIIRC();
            break;
         case 5:
            this.OICHRIIHIORHOOOIOCHHOCRORIHIOH(var1.CIOOORCHHCOOOOIIOOCIOICCRRORCH());
            break;
         case 6:
            this.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var1);
            break;
         case 7:
            this.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var1);
            break;
         case 8:
            this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var1);
            break;
         case 9:
            this.writeBoolean(true);
            break;
         case 10:
            this.writeBoolean(false);
            break;
         case 11:
            this.RORIRIIORRCIIOHCHCHOOCIHOOHCIC();
            break;
         case 12:
            this.RHCICHRICRIIIHRRCICHOOOIOOOICH(var1.RRIHRHCOCCRROCCHIRHHHIIICHCRRR());
      }
   }

   public void HHCCIRHCCCIIRHCROHIORHIRHHIORH(OCOHORHCROHICRRIHCIHHRRCIHICRI var1) {
      OHHRIOHROOIHOROCIRHCHORIHRRRRI var2 = var1.COCHOCOHRICCHIIIHIOORCIIRROOHI();
      int var3 = var2 == null ? -1 : var2.id();
      if (var3 == 5) {
         this.OICHRIIHIORHOOOIOCHHOCRORIHIOH(var1.CIOOORCHHCOOOOIIOOCIOICCRRORCH());
         var2 = var1.OHHCRICRRCCHOHIRIRIHOIRHIROOIC();
         var3 = var2 == null ? -1 : var2.id();
      }

      switch (var3) {
         case 1:
            this.HHRRHIHIRCIHORIHHCORCCHRHHRCOH();
            this.CRRRICCRROCOHHOHIICIHORCOORRRH(var1);
            return;
         case 3:
            this.CRHOOIRCIORIHCHOHCIIIHIROROHRR();
            this.CRRRICCRROCOHHOHIICIHORCOORRRH(var1);
            return;
         default:
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1);
      }
   }

   protected void CRRRICCRROCOHHOHIICIHORCOORRRH(OCOHORHCROHICRRIHCIHHRRCIHICRI var1) {
      int var2 = 1;

      OHHRIOHROOIHOROCIRHCHORIHRRRRI var3;
      while ((var3 = var1.OHHCRICRRCCHOHIRIRIHOIRHIROOIC()) != null) {
         switch (var3.id()) {
            case 1:
               this.HHRRHIHIRCIHORIHHCORCCHRHHRCOH();
               var2++;
               break;
            case 2:
               this.RORCROIROCHHOOICHRICCCRHROHROC();
               if (--var2 == 0) {
                  return;
               }
               break;
            case 3:
               this.CRHOOIRCIORIHCHOHCIIIHIROROHRR();
               var2++;
               break;
            case 4:
               this.CCROCOHIICIIRIOIRRHHORRCHOIIRC();
               if (--var2 == 0) {
                  return;
               }
               break;
            case 5:
               this.OICHRIIHIORHOOOIOCHHOCRORIHIOH(var1.CIOOORCHHCOOOOIIOOCIOICCRRORCH());
               break;
            case 6:
               this.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var1);
               break;
            case 7:
               this.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var1);
               break;
            case 8:
               this.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var1);
               break;
            case 9:
               this.writeBoolean(true);
               break;
            case 10:
               this.writeBoolean(false);
               break;
            case 11:
               this.RORIRIIORRCIIOHCHCHOOCIHOOHCIC();
               break;
            case 12:
               this.RHCICHRICRIIIHRRCICHOOOIOOOICH(var1.RRIHRHCOCCRROCCHIRHHHIIICHCRRR());
               break;
            default:
               throw new IllegalStateException("Internal error: unknown current token, " + var3);
         }
      }
   }

   protected void RRCRRCORICCHOHHIRCHIROOHIIOHCO(OCOHORHCROHICRRIHCIHHRRCIHICRI var1) {
      OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2 = var1.RHOHOCOOROCIOOHHCCRCIIRRRRHCHR();
      if (var2 == OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.BIG_DECIMAL) {
         this.OHHRIOHROOIHOROCIRHCHORIHRRRRI(var1.ICRHCOHOHIRRROHOCICOOCCIIHOOHI());
      } else if (var2 == OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.FLOAT) {
         this.IRIRICIHHCOICHHCHCOCCHHOROOCHH(var1.getFloatValue());
      } else {
         this.OCIOROHIHRROROOIRRHRRCCHHRRRHI(var1.getDoubleValue());
      }
   }

   protected void RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(OCOHORHCROHICRRIHCIHHRRCIHICRI var1) {
      Number var2 = var1.ROHHRIHOCHHOCRCORRHHRIOROHIIOR();
      if (var2 instanceof BigDecimal) {
         this.OHHRIOHROOIHOROCIRHCHORIHRRRRI((BigDecimal)var2);
      } else if (var2 instanceof Double) {
         this.OCIOROHIHRROROOIRRHRRCCHHRRRHI(var2.doubleValue());
      } else {
         this.IRIRICIHHCOICHHCHCOCCHHOROOCHH(var2.floatValue());
      }
   }

   protected void HRCHROOHRIHCRCRHRIIROCIRHOIRHH(OCOHORHCROHICRRIHCIHHRRCIHICRI var1) {
      OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2 = var1.RHOHOCOOROCIOOHHCCRCIIRRRRHCHR();
      if (var2 == OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.INT) {
         this.CORHHROICCOCRHRCCOOHCRCRHICHOI(var1.HHHRCIIIIHOCHICIORORCCOCHOIHIO());
      } else if (var2 == OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.LONG) {
         this.IOHCRRIIHCIHORROOCHCCORIHRHCII(var1.getLongValue());
      } else {
         this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1.ORHIIIOHCCCCRROHORHIICRHROIORH());
      }
   }

   protected void OOROOCCIRCCRHOIOIORIHCHHOOCCOR(OCOHORHCROHICRRIHCIHHRRCIHICRI var1) {
      if (var1.RROICOIOIIIHRHRCIIOOCIRICOIHHO()) {
         this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            var1.IOOHRCCROHHOICCCCOOOICRIIHOROO(), var1.RCIOOOIHROIRCROOIICOHHCORROHHR(), var1.IIOOCRIHICIIHIHICHCCHIICIORRIH()
         );
      } else {
         this.writeString(var1.getText());
      }
   }

   @Override
   public abstract void flush();

   public abstract boolean isClosed();

   @Override
   public abstract void close();

   protected void COCOCCIORORHIIROHIOIOHIHCRIOOO(String var1) {
      throw new CORCOCICIRIOHROHROIIOOHICCHCRR(var1, this);
   }

   protected final void RHHIOOCCOHHHHIOCHHIOOHRCOCCCOH() {
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRRCCOICORICIHCHRHIHIHROIRHOCR.CRRRICCCHCIICICCCIOOIIOOOCCOCH();
   }

   protected void CIIOHCOCCOCHCHOOOCORCORHIHHCRH() {
      throw new UnsupportedOperationException("Operation not supported by generator of type " + this.getClass().getName());
   }

   protected final void CCHHCIRHICHHHHRRIHIORCCORCCIHR(int var1, int var2, int var3) {
      if (var2 < 0 || var2 + var3 > var1) {
         throw new IllegalArgumentException(String.format("invalid argument(s) (offset=%d, length=%d) for input array of %d element", var2, var3, var1));
      }
   }

   protected void HIORIIIIOCCCRCHCOROROCCOIOOIIR(Object var1) {
      if (var1 == null) {
         this.RORIRIIORRCIIOHCHCHOOCIHOOHCIC();
      } else if (var1 instanceof String) {
         this.writeString((String)var1);
      } else {
         if (var1 instanceof Number) {
            Number var2 = (Number)var1;
            if (var2 instanceof Integer) {
               this.CORHHROICCOCRHRCCOOHCRCRHICHOI(var2.intValue());
               return;
            }

            if (var2 instanceof Long) {
               this.IOHCRRIIHCIHORROOCHCCORIHRHCII(var2.longValue());
               return;
            }

            if (var2 instanceof Double) {
               this.OCIOROHIHRROROOIRRHRRCCHHRRRHI(var2.doubleValue());
               return;
            }

            if (var2 instanceof Float) {
               this.IRIRICIHHCOICHHCHCOCCHHOROOCHH(var2.floatValue());
               return;
            }

            if (var2 instanceof Short) {
               this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var2.shortValue());
               return;
            }

            if (var2 instanceof Byte) {
               this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var2.byteValue());
               return;
            }

            if (var2 instanceof BigInteger) {
               this.HHCCIRHCCCIIRHCROHIORHIRHHIORH((BigInteger)var2);
               return;
            }

            if (var2 instanceof BigDecimal) {
               this.OHHRIOHROOIHOROCIRHCHORIHRRRRI((BigDecimal)var2);
               return;
            }

            if (var2 instanceof AtomicInteger) {
               this.CORHHROICCOCRHRCCOOHCRCRHICHOI(((AtomicInteger)var2).get());
               return;
            }

            if (var2 instanceof AtomicLong) {
               this.IOHCRRIIHCIHORROOCHCCORIHRHCII(((AtomicLong)var2).get());
               return;
            }
         } else {
            if (var1 instanceof byte[]) {
               this.OHRRHHOCROROCCIRROIHOCCHCIHCIR((byte[])var1);
               return;
            }

            if (var1 instanceof Boolean) {
               this.writeBoolean((Boolean)var1);
               return;
            }

            if (var1 instanceof AtomicBoolean) {
               this.writeBoolean(((AtomicBoolean)var1).get());
               return;
            }
         }

         throw new IllegalStateException(
            "No ObjectCodec defined for the generator, can only serialize simple wrapper types (type passed " + var1.getClass().getName() + ")"
         );
      }
   }

   public enum RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      AUTO_CLOSE_TARGET(true),
      AUTO_CLOSE_JSON_CONTENT(true),
      FLUSH_PASSED_TO_STREAM(true),
      @Deprecated
      QUOTE_FIELD_NAMES(true),
      @Deprecated
      QUOTE_NON_NUMERIC_NUMBERS(true),
      @Deprecated
      ESCAPE_NON_ASCII(false),
      @Deprecated
      WRITE_NUMBERS_AS_STRINGS(false),
      WRITE_BIGDECIMAL_AS_PLAIN(false),
      STRICT_DUPLICATE_DETECTION(false),
      IGNORE_UNKNOWN(false),
      @Deprecated
      USE_FAST_DOUBLE_WRITER(false),
      @Deprecated
      WRITE_HEX_UPPER_CASE(true);

      private final boolean _defaultState;
      private final int _mask;

      public static int collectDefaults() {
         int var0 = 0;

         for (CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 : values()) {
            if (var4.enabledByDefault()) {
               var0 |= var4.getMask();
            }
         }

         return var0;
      }

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(boolean var3) {
         this._defaultState = var3;
         this._mask = 1 << this.ordinal();
      }

      public boolean enabledByDefault() {
         return this._defaultState;
      }

      public boolean enabledIn(int var1) {
         return (var1 & this._mask) != 0;
      }

      public int getMask() {
         return this._mask;
      }
   }
}
