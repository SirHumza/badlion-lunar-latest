package com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI;

import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.lunarclient.dfu.serialization.Codec;
import com.moonsworth.lunar.client.util.HIHCCHCCOCOHRICOICHRCOIHIIRIHO;
import java.util.List;
import java.util.function.Function;
import lombok.Generated;
import org.jetbrains.annotations.Contract;
import org.jspecify.annotations.Nullable;

public class IOHIHIIHCCCCCIHRORIOIOORCIOHII<T> extends HRCHROOHRIHCRCRHRIIROCIRHOIRHH<T> {
   private final List<T> CRIHRHOCRHIICROOORICIICCCRHOHI;

   public IOHIHIIHCCCCCIHRORIOIOORCIOHII(
      @HIHCCHCCOCOHRICOICHRCOIHIIRIHO(CHHOHHOIRCCRRCRIHCCOHHRCIHRHII = HIHCCHCCOCOHRICOICHRCOIHIIRIHO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.SETTING) String var1,
      @Nullable Codec<T> var2,
      @Nullable T var3,
      List<T> var4
   ) {
      super(var1, var2, (T)var3);
      this.CRIHRHOCRHIICROOORICIICCCRHOHI = var4;
   }

   @Override
   protected com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ICICIOCHHHIHOCHCOHORIHRCOHHOCR<?> CIOHHCORHRCCRICCCORIHCRHCCCRRR(
      com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
   ) {
      return new com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RHCHRCOCCOIIIHCHRHIRCORHRHRICR<>(
         this, var1
      );
   }

   @Generated
   public List<T> RCRIOCCCOOIRICRHHCCIRCIOHRRRIO() {
      return this.CRIHRHOCRHIICROOORICIICCCRHOHI;
   }

   public static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<T>
      extends com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH<IOHIHIIHCCCCCIHRORIOIOORCIOHII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<T>, IOHIHIIHCCCCCIHRORIOIOORCIOHII<T>, T> {
      private @Nullable List<T> options;

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
      protected @Nullable Codec<T> CIHHRHHHCCHCCCCCIRRORHICROCHHR() {
         return null;
      }

      @Override
      protected @Nullable Function<IOHIHIIHCCCCCIHRORIOIOORCIOHII<T>, HHCCIRHCCCIIRHCROHIORHIRHHIORH> OOCCCOICCIHIIHRRRHHROIRIOROCCR() {
         return var1 -> new com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.CRRRICCRROCOHHOHIICIHORCOORRRH(var1) {
            @Override
            public JsonElement provide() {
               JsonObject var1x = super.provide().getAsJsonObject();
               JsonArray var2 = new JsonArray();

               for (Object var4 : ((IOHIHIIHCCCCCIHRORIOIOORCIOHII)this.option).CRIHRHOCRHIICROOORICIICCCRHOHI) {
                  var2.add(var4.toString());
               }

               var1x.add("choices", var2);
               return var1x;
            }
         };
      }

      @Contract("_->this")
      public IOHIHIIHCCCCCIHRORIOIOORCIOHII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<T> CRHRHRIOIHRCHRIORHRRCHHIHCOCCC(List<T> var1) {
         this.options = var1;
         return this;
      }

      @SafeVarargs
      @Contract("_->this")
      public final IOHIHIIHCCCCCIHRORIOIOORCIOHII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<T> OOROOCCIRCCRHOIOIORIHCHHOOCCOR(T... var1) {
         return this.CRHRHRIOIHRCHRIORHRRCHHIHCOCCC(Lists.newArrayList(var1));
      }

      protected IOHIHIIHCCCCCIHRORIOIOORCIOHII<T> RHIICRORHHRCRRHOOICHOOHCCCOIRC() {
         if (this.options == null) {
            throw new com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
               this, "Options must be set!"
            );
         } else {
            return new IOHIHIIHCCCCCIHRORIOIOORCIOHII<>(this.RROHIIOCCIOHRHHIIRIOIRHHIOCRRO, this.codec, this.defaultValue, this.options);
         }
      }
   }
}
