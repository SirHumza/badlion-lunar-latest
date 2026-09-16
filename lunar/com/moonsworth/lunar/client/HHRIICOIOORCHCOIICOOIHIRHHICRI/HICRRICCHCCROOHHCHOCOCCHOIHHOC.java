package com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.lunarclient.dfu.serialization.Codec;
import com.moonsworth.lunar.client.util.HIHCCHCCOCOHRICOICHRCOIHIIRIHO;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Function;
import lombok.Generated;
import org.jetbrains.annotations.Contract;
import org.jspecify.annotations.Nullable;

public class HICRRICCHCCROOHHCHOCOCCHOIHHOC extends HRCHROOHRIHCRCRHRIIROCIRHOIRHH<String> {
   private final Callable<List<String>> CCOHCCRIHCRIOHHOHRIICHCRORRCRC;
   private final @Nullable Function<String, String> COHIHRCHHRCCIRROIOIORORHOROCHH;

   public HICRRICCHCCROOHHCHOCOCCHOIHHOC(
      @HIHCCHCCOCOHRICOICHRCOIHIIRIHO(CHHOHHOIRCCRRCRIHCCOHHRCIHRHII = HIHCCHCCOCOHRICOICHRCOIHIIRIHO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.SETTING) String var1,
      @Nullable Codec<String> var2,
      String var3,
      Callable<List<String>> var4,
      @Nullable Function<String, String> var5
   ) {
      super(var1, var2, var3);
      this.CCOHCCRIHCRIOHHOHRIICHCRORRCRC = var4;
      this.COHIHRCHHRCCIRROIOIORORHOROCHH = var5;
   }

   @Override
   protected com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ICICIOCHHHIHOCHCOHORIHRCOHHOCR<?> CIOHHCORHRCCRICCCORIHCRHCCCRRR(
      com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
   ) {
      return new com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI(
         this, null
      );
   }

   @Generated
   public Callable<List<String>> CCCIIICOHOOCCCHCHCOCROCOOHRIRR() {
      return this.CCOHCCRIHCRIOHHOHRIICHCRORRCRC;
   }

   @Generated
   public @Nullable Function<String, String> RROHIRHRIHOOHOHOICCROIOHOOOOIH() {
      return this.COHIHRCHHRCCIRROIOIORORHOROCHH;
   }

   public static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
      extends com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH<HICRRICCHCCROOHHCHOCOCCHOIHHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH, HICRRICCHCCROOHHCHOCOCCHOIHHOC, String> {
      private @Nullable Callable<List<String>> CCOHCCRIHCRIOHHOHRIICHCRORRCRC;
      private @Nullable Function<String, String> COHIHRCHHRCCIRROIOIORORHOROCHH;

      protected RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         @HIHCCHCCOCOHRICOICHRCOIHIIRIHO(CHHOHHOIRCCRRCRIHCCOHHRCIHRHII = HIHCCHCCOCOHRICOICHRCOIHIIRIHO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.SETTING) String var1
      ) {
         super(var1);
      }

      @Override
      protected com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRRRICCRROCOHHOHIICIHORCOORRRH ORCHRRHCCOIHHRROOHROROROOHOHIO() {
         return com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.DROPDOWN;
      }

      @Override
      protected @Nullable Codec<String> CIHHRHHHCCHCCCCCIRRORHICROCHHR() {
         return Codec.STRING;
      }

      @Override
      protected @Nullable Function<HICRRICCHCCROOHHCHOCOCCHOIHHOC, HHCCIRHCCCIIRHCROHIORHIRHHIORH> OOCCCOICCIHIIHRRRHHROIRIOROCCR() {
         return var1 -> new com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.CRRRICCRROCOHHOHIICIHORCOORRRH(var1) {
            @Override
            public JsonElement provide() {
               JsonObject var1x = super.provide().getAsJsonObject();
               HICRRICCHCCROOHHCHOCOCCHOIHHOC var2 = (HICRRICCHCCROOHHCHOCOCCHOIHHOC)this.option;
               var1x.addProperty("value", var2.get());
               JsonArray var3 = new JsonArray();

               try {
                  for (String var5 : var2.CCOHCCRIHCRIOHHOHRIICHCRORRCRC.call()) {
                     JsonObject var6 = new JsonObject();
                     var6.addProperty("id", var5);
                     var6.addProperty("name", var2.COHIHRCHHRCCIRROIOIORORHOROCHH != null ? var2.COHIHRCHHRCCIRROIOIORORHOROCHH.apply(var5) : var5);
                     var3.add(var6);
                  }
               } catch (Exception var7) {
                  throw new RuntimeException(var7);
               }

               var1x.add("choices", var3);
               return var1x;
            }
         };
      }

      @Contract("_->this")
      public HICRRICCHCCROOHHCHOCOCCHOIHHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Callable<List<String>> var1) {
         this.CCOHCCRIHCRIOHHOHRIICHCRORRCRC = var1;
         return this;
      }

      @Contract("_->this")
      public HICRRICCHCCROOHHCHOCOCCHOIHHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH IIHRRHORCRCROCHHOHORCHCROCIHRO(@Nullable Function<String, String> var1) {
         this.COHIHRCHHRCCIRROIOIORORHOROCHH = var1;
         return this;
      }

      protected HICRRICCHCCROOHHCHOCOCCHOIHHOC RHCRRHCCRICIHOIOOIICRRCRHHCCCI() {
         if (this.CCOHCCRIHCRIOHHOHRIICHCRORRCRC == null) {
            throw new com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
               this, "Provider must be set!"
            );
         } else {
            return new HICRRICCHCCROOHHCHOCOCCHOIHHOC(
               this.RROHIIOCCIOHRHHIIRIOIRHHIOCRRO, this.codec, this.defaultValue, this.CCOHCCRIHCRIOHHOHRIICHCRORRCRC, this.COHIHRCHHRCCIRROIOIORORHOROCHH
            );
         }
      }
   }
}
