package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

public class IHICORCROOROHCIHIHCOIHRRHICICO
   extends com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   private static final long IROIHRCOCHORIOROCCICIIICHIORHR = 1L;
   protected static final String ROCICHIROROIIHRORIHRCIHRICIOCR = "message";
   protected static final String OOIRIIHOHROHHRCCIRROHHHIROROOR = "suppressed";
   protected static final String OIORORRCIOIHOHCIOHOIRICOCCCHHC = "localizedMessage";

   @Deprecated
   public IHICORCROOROHCIHIHCOIHRRHICICO(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1
   ) {
      super(var1);
      this.OIOOOICIHOORORIHCCRRHOHIIHIHII = false;
   }

   public static IHICORCROOROHCIHIHCOIHRRHICICO RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var0,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1
   ) {
      return new IHICORCROOROHCIHIHCOIHRRHICICO(var1);
   }

   protected IHICORCROOROHCIHIHCOIHRRHICICO(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.RIROICHCRROROHCCROOCCCCOCHCCRI var2
   ) {
      super(var1, var2);
   }

   @Override
   public com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CIOHHCORHRCCRICCCORIHCRHCCCRRR<Object> unwrappingDeserializer(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.RIROICHCRROROHCCROOCCCCOCHCCRI var1
   ) {
      return this.getClass() != IHICORCROOROHCIHIHCOIHRRHICICO.class ? this : new IHICORCROOROHCIHIHCOIHRRHICICO(this, var1);
   }

   @Override
   public Object IIRHCHHOICHRICOOCRORCCIOOIHOIR(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2
   ) {
      if (this.RHCHCROROHIICHICIOOOORICROIOCH != null) {
         return this.OHHRIOHROOIHOROCIRHCHORIHRRRRI(var1, var2);
      }

      if (this.ORORHHOOCCICCCRCIRIOOHCRCOIICC != null) {
         return this.RCRRRRHIOCIRCCORRHCCIOOIICHORC.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var2, this.ORORHHOOCCICCCRCIRIOOHCRCOIICC.deserialize(var1, var2));
      }

      if (this.IICHRIIOOCCIICHRRRIOIRCOICCRCC.isAbstract()) {
         return var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            this.handledType(), this.getValueInstantiator(), var1, "abstract type (need to add/enable type information?)"
         );
      }

      boolean var3 = this.RCRRRRHIOCIRCCORRHCCIOOIICHORC.IICCRIICCCRORRCRIHIHCICOROHIHH();
      boolean var4 = this.RCRRRRHIOCIRCCORRHCCIOOIICHORC.CIIOHRIOROOROOIIHOCHCRHCIRORCO();
      if (!var3 && !var4) {
         return var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            this.handledType(),
            this.getValueInstantiator(),
            var1,
            "Throwable needs a default constructor, a single-String-arg constructor; or explicit @JsonCreator"
         );
      }

      Throwable var5 = null;
      Object[] var6 = null;
      Throwable[] var7 = null;
      int var8 = 0;

      while (
         !var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI.END_OBJECT
         )
      ) {
         String var9 = var1.RRORHCRCCRHRICIIIICOHRCICCHRIC();
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RIROICHCRROROHCCROOCCCCOCHCCRI var10 = this.IRRCHOORIHIRHIHIOORIICIHCOCOII
            .OOHCOIRICORORHOHHORCICOOICIORO(var9);
         var1.OHHCRICRRCCHOHIRIRIHOIRHIROOIC();
         if (var10 != null) {
            if (var5 != null) {
               var10.CRRRICCRROCOHHOHIICIHORCOORRRH(var1, var2, var5);
            } else {
               if (var6 == null) {
                  int var11 = this.IRRCHOORIHIRHIHIOORIICIHCOCOII.size();
                  var6 = new Object[var11 + var11];
               }

               var6[var8++] = var10;
               var6[var8++] = var10.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR(var1, var2);
            }
         } else if ("message".equalsIgnoreCase(var9) && var3) {
            var5 = (Throwable)this.RCRRRRHIOCIRCCORRHCCIOOIICHORC.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var2, var1.getValueAsString());
         } else if (this.CCORIIOHCHRIIRIHIOHCHHICRHOHIC != null && this.CCORIIOHCHRIIRIHIOHCHHICRHOHIC.contains(var9)) {
            var1.CIHCRICOCCRRHOOCCCIROOOHHROORC();
         } else if ("suppressed".equalsIgnoreCase(var9)) {
            var7 = var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, Throwable[].class);
         } else if ("localizedMessage".equalsIgnoreCase(var9)) {
            var1.CIHCRICOCCRRHOOCCCIROOOHHROORC();
         } else if (this.COIOROCIRCHOIIOCHOCRCHHRIRICHR != null) {
            this.COIOROCIRCHOIIOCHOCRCHHRIRICHR.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1, var2, var5, var9);
         } else {
            this.handleUnknownProperty(var1, var2, var5, var9);
         }

         var1.OHHCRICRRCCHOHIRIRIHOIRHIROOIC();
      }

      if (var5 == null) {
         if (var3) {
            var5 = (Throwable)this.RCRRRRHIOCIRCCORRHCCIOOIICHORC.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var2, null);
         } else {
            var5 = (Throwable)this.RCRRRRHIOCIRCCORRHCCIOOIICHORC.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var2);
         }
      }

      if (var6 != null) {
         byte var14 = 0;

         for (int var16 = var8; var14 < var16; var14 += 2) {
            com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RIROICHCRROROHCCROOCCCCOCHCCRI var18 = (com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RIROICHCRROROHCCROOCCCCOCHCCRI)var6[var14];
            var18.set(var5, var6[var14 + 1]);
         }
      }

      if (var7 != null) {
         for (Throwable var12 : var7) {
            var5.addSuppressed(var12);
         }
      }

      return var5;
   }
}
