package com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.lunarclient.dfu.serialization.Codec;
import com.moonsworth.lunar.client.util.HIHCCHCCOCOHRICOICHRCOIHIIRIHO;
import java.util.function.Function;
import java.util.function.Supplier;
import org.jetbrains.annotations.Contract;
import org.jspecify.annotations.Nullable;

public class RIROICHCRROROHCCROOCCCCOCHCCRI<T extends Enum<T> & ORHIOICIOCRRHOOCOHRORIHICHRCRR> extends HRCHROOHRIHCRCRHRIIROCIRHOIRHH<T> {
   private final Enum<T>[] ROICIIHHIRCHRIIIRIIHIIRRCOIORR;
   private final boolean HCIOOCROHRRIRIROCOHRRORHHIROIC;

   public RIROICHCRROROHCCROOCCCCOCHCCRI(
      @HIHCCHCCOCOHRICOICHRCOIHIIRIHO(CHHOHHOIRCCRRCRIHCCOHHRCIHRHII = HIHCCHCCOCOHRICOICHRCOIHIIRIHO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.SETTING) String var1,
      @Nullable Codec<T> var2,
      T var3,
      Enum<T>[] var4,
      boolean var5
   ) {
      super(var1, var2, (T)var3);
      this.ROICIIHHIRCHRIIIRIIHIIRRCOIORR = var4;
      this.HCIOOCROHRRIRIROCOHRRORHHIROIC = var5;
   }

   @Override
   protected com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ICICIOCHHHIHOCHCOHORIHRCOHHOCR<?> CIOHHCORHRCCRICCCORIHCRHCCCRRR(
      com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
   ) {
      return new com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IIHRRHORCRCROCHHOHORCHCROCIHRO<>(
         this, var1, this.ROICIIHHIRCHRIIIRIIHIIRRCOIORR
      );
   }

   public static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<T extends Enum<T> & ORHIOICIOCRRHOOCOHRORIHICHRCRR>
      extends com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH<RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<T>, RIROICHCRROROHCCROOCCCCOCHCCRI<T>, T> {
      private @Nullable Enum<T>[] ROICIIHHIRCHRIIIRIIHIIRRCOIORR;
      private boolean HCIOOCROHRRIRIROCOHRRORHHIROIC = false;

      protected RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         @HIHCCHCCOCOHRICOICHRCOIHIIRIHO(CHHOHHOIRCCRRCRIHCCOHHRCIHRHII = HIHCCHCCOCOHRICOICHRCOIHIIRIHO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.SETTING) String var1
      ) {
         super(var1);
      }

      @Override
      protected com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRRRICCRROCOHHOHIICIHORCOORRRH ORCHRRHCCOIHHRROOHROROROOHOHIO() {
         return com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RADIO;
      }

      @Override
      protected Codec<T> CIHHRHHHCCHCCCCCIRRORHICROCHHR() {
         return null;
      }

      @Override
      protected @Nullable Function<RIROICHCRROROHCCROOCCCCOCHCCRI<T>, HHCCIRHCCCIIRHCROHIORHIRHHIORH> OOCCCOICCIHIIHRRRHHROIRIOROCCR() {
         return var1 -> new com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.CRRRICCRROCOHHOHIICIHORCOORRRH(var1) {
            @Override
            public JsonElement provide() {
               JsonObject var1x = super.provide().getAsJsonObject();
               RIROICHCRROROHCCROOCCCCOCHCCRI var2 = (RIROICHCRROROHCCROOCCCCOCHCCRI)this.option;
               var1x.addProperty("value", var2.get() == null ? "" : ((ORHIOICIOCRRHOOCOHRORIHICHRCRR)((Enum)var2.get())).id());
               var1x.addProperty("hideRecommended", var2.HCIOOCROHRRIRIROCOHRRORHHIROIC);
               if (var2.HRHHHHIICCCIROOOHIIIHIHIHHHOHC() != null) {
                  JsonArray var3 = new JsonArray();

                  for (Enum var7 : (Enum[])((Enum)var2.HRHHHHIICCCIROOOHIIIHIHIHHHOHC()).getClass().getEnumConstants()) {
                     var3.add(((ORHIOICIOCRRHOOCOHRORIHICHRCRR)var7).provide());
                  }

                  var1x.add("choices", var3);
               }

               return var1x;
            }
         };
      }

      @SafeVarargs
      @Contract("_->this")
      public final RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<T> IRCIIHHICIHRCOCRROCOICRIHHCCHH(Enum<T>... var1) {
         this.ROICIIHHIRCHRIIIRIIHIIRRCOIORR = var1;
         return this;
      }

      @Contract("->this")
      public RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<T> OCIHOOCIICOORRCRHRIRHORHIIICRI() {
         this.HCIOOCROHRRIRIROCOHRRORHHIROIC = true;
         return this;
      }

      @Contract("_->this")
      public RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<T> HROROOHRCIHHOIOHIOOHCORHHRCCIH(boolean var1) {
         this.HCIOOCROHRRIRIROCOHRRORHHIROIC = var1;
         return this;
      }

      protected RIROICHCRROROHCCROOCCCCOCHCCRI<T> ORRHIIICIIOHHCRHOCOIIHRIOIHROI() {
         if (this.defaultValue == null) {
            throw new com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
               this, "Value must be set!"
            );
         }

         if (this.ROICIIHHIRCHRIIIRIIHIIRRCOIORR == null) {
            this.ROICIIHHIRCHRIIIRIIHIIRRCOIORR = (Enum<T>[])this.defaultValue.getClass().getEnumConstants();
         }

         if (this.codec == null) {
            this.codec = ORHIOICIOCRRHOOCOHRORIHICHRCRR.HHIRHRHHRHIHRHOHCHRHIORRHIIHOR(
               (Supplier<T[]>)(() -> (Enum[])this.defaultValue.getClass().getEnumConstants())
            );
         }

         return new RIROICHCRROROHCCROOCCCCOCHCCRI<>(
            this.RROHIIOCCIOHRHHIIRIOIRHHIOCRRO, this.codec, this.defaultValue, this.ROICIIHHIRCHRIIIRIIHIIRRCOIORR, this.HCIOOCROHRRIRIROCOHRRORHHIROIC
         );
      }
   }
}
