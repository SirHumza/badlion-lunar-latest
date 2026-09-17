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

public class IOIICIRIICICIIOORHCIIIIRRIHRHI<T> extends HRCHROOHRIHCRCRHRIIROCIRHOIRHH<T> {
   private final List<T> OHHIHROCORHRIOOIHRIHHRRCOOCIOC;
   private final @Nullable Function<T, String> RHORIHCOCHRICHHRIRICCOOIORRCOI;

   public IOIICIRIICICIIOORHCIIIIRRIHRHI(
      @HIHCCHCCOCOHRICOICHRCOIHIIRIHO(CHHOHHOIRCCRRCRIHCCOHHRCIHRHII = HIHCCHCCOCOHRICOICHRCOIHIIRIHO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.SETTING) String var1,
      @Nullable Codec<T> var2,
      T var3,
      List<T> var4,
      @Nullable Function<T, String> var5
   ) {
      super(var1, var2, (T)var3);
      this.OHHIHROCORHRIOOIHRIHHRRCOOCIOC = var4;
      this.RHORIHCOCHRICHHRIRICCOOIORRCOI = var5;
   }

   @Override
   protected com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ICICIOCHHHIHOCHCOHORIHRCOHHOCR<?> CIOHHCORHRCCRICCCORIHCRHCCCRRR(
      com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
   ) {
      return new com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CIOHHCORHRCCRICCCORIHCRHCCCRRR<>(
         this, var1, this.RHORIHCOCHRICHHRIRICCOOIORRCOI
      );
   }

   @Generated
   public List<T> RCRIOCCCOOIRICRHHCCIRCIOHRRRIO() {
      return this.OHHIHROCORHRIOOIHRIHHRRCOOCIOC;
   }

   @Generated
   public @Nullable Function<T, String> HOHIOOCHHOHCIHCIIHIHRIICCICROC() {
      return this.RHORIHCOCHRICHHRIRICCOOIORRCOI;
   }

   public static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<T>
      extends com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH<IOIICIRIICICIIOORHCIIIIRRIHRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<T>, IOIICIRIICICIIOORHCIIIIRRIHRHI<T>, T> {
      protected @Nullable List<T> options;
      protected Function<T, String> OCCCOHHOICCICOOIRCCCHRCHHCHHOI;

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
      protected @Nullable Function<IOIICIRIICICIIOORHCIIIIRRIHRHI<T>, HHCCIRHCCCIIRHCROHIORHIRHHIORH> OOCCCOICCIHIIHRRRHHROIRIOROCCR() {
         return var1 -> new com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.CRRRICCRROCOHHOHIICIHORCOORRRH(var1) {
            @Override
            public JsonElement provide() {
               JsonObject var1x = super.provide().getAsJsonObject();
               IOIICIRIICICIIOORHCIIIIRRIHRHI var2 = (IOIICIRIICICIIOORHCIIIIRRIHRHI)this.option;
               if (var2.HRHHHHIICCCIROOOHIIIHIHIHHHOHC() != null) {
                  JsonArray var3 = new JsonArray();

                  for (Object var5 : var2.RCRIOCCCOOIRICRHHCCIRCIOHRRRIO()) {
                     JsonObject var6 = new JsonObject();
                     var6.addProperty("id", var5.toString());
                     var6.addProperty(
                        "name", var2.RHORIHCOCHRICHHRIRICCOOIORRCOI != null ? var2.RHORIHCOCHRICHHRIRICCOOIORRCOI.apply((T)var5) : var5.toString()
                     );
                     var6.addProperty("description", "");
                     var3.add(var6);
                  }

                  var1x.add("choices", var3);
               }

               return var1x;
            }
         };
      }

      @Contract("_->this")
      public IOIICIRIICICIIOORHCIIIIRRIHRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<T> OCOHORHCROHICRRIHCIHHRRCIHICRI(Function<T, String> var1) {
         this.OCCCOHHOICCICOOIRCCCHRCHHCHHOI = var1;
         return this;
      }

      @Contract("_->this")
      public IOIICIRIICICIIOORHCIIIIRRIHRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<T> CIOORRCRICOIICROHRHRHHOHRCCRII(List<T> var1) {
         this.options = var1;
         return this;
      }

      @SafeVarargs
      @Contract("_->this")
      public final IOIICIRIICICIIOORHCIIIIRRIHRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<T> HRCHROOHRIHCRCRHRIIROCIRHOIRHH(T... var1) {
         return this.CIOORRCRICOIICROHRHRHHOHRCCRII(Lists.newArrayList(var1));
      }

      protected IOIICIRIICICIIOORHCIIIIRRIHRHI<T> CCOHIRORRHOHOIIOOOCRRRIHIIHCIC() {
         if (this.options == null) {
            throw new com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
               this, "Options must be set!"
            );
         } else {
            return new IOIICIRIICICIIOORHCIIIIRRIHRHI<>(
               this.RROHIIOCCIOHRHHIIRIOIRHHIOCRRO, this.codec, this.defaultValue, this.options, this.OCCCOHHOICCICOOIRCCCHRCHHCHHOI
            );
         }
      }
   }
}
