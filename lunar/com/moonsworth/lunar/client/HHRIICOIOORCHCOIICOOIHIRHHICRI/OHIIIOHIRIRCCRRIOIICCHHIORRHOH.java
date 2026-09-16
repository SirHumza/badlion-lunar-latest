package com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.lunarclient.dfu.serialization.Codec;
import com.lunarclient.dfu.serialization.JsonOps;
import com.moonsworth.lunar.client.util.HIHCCHCCOCOHRICOICHRCOIHIIRIHO;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import lombok.Generated;
import org.jetbrains.annotations.Contract;
import org.jspecify.annotations.Nullable;

public class OHIIIOHIRIRCCRRIOIICCHHIORRHOH<T> extends HRCHROOHRIHCRCRHRIIROCIRHOIRHH<List<T>> {
   protected final boolean COROOORHOCOCIIORICCHRIIHICRROH;
   protected final @Nullable Consumer<T> OOICCHOOIRICRCOOHIOROHORHOROCR;
   protected final @Nullable Function<T, String> OICRIIIORCCOHHIORHRHCIRIHICRRI;
   protected final @Nullable Codec<T> IIRIRRHRRRHCRIRCIHCHCICIOIROHI;

   public OHIIIOHIRIRCCRRIOIICCHHIORRHOH(
      @HIHCCHCCOCOHRICOICHRCOIHIIRIHO(CHHOHHOIRCCRRCRIHCCOHHRCIHRHII = HIHCCHCCOCOHRICOICHRCOIHIIRIHO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.SETTING) String var1,
      @Nullable Codec<List<T>> var2,
      List<T> var3,
      boolean var4,
      @Nullable Consumer<T> var5,
      @Nullable Function<T, String> var6,
      @Nullable Codec<T> var7
   ) {
      super(var1, var2, var3);
      this.COROOORHOCOCIIORICCHRIIHICRROH = var4;
      this.OOICCHOOIRICRCOOHIOROHORHOROCR = var5;
      this.OICRIIIORCCOHHIORHRHCIRIHICRRI = var6;
      this.IIRIRRHRRRHCRIRCIHCHCICIOIROHI = var7;
   }

   public void RROIIRROOOOHIORHRICHOCHIHCRRCH(List<T> var1) {
      super.RHRIIOOOCRHIIOORCOCRCHRCCRRCIH((T)(new ArrayList(var1)));
   }

   @Override
   public void OOCCCHRCIRHCRCIRHRHHCRIOHICRRC(String var1) {
      JsonElement var2 = CIOICHOCCRHORIRHHOOHHOROCCCIOR(var1);
      if (this.IIRIRRHRRRHCRIRCIHCHCICIOIROHI != null && !var2.isJsonArray()) {
         this.IIRIRRHRRRHCRIRCIHCHCICIOIROHI
            .parse(JsonOps.INSTANCE, var2)
            .ifError(
               var1x -> com.moonsworth.lunar.client.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  new IOException("Error parsing element of option " + this + ": " + var1x), "Option Parse"
               )
            )
            .result()
            .ifPresent(this::IIHHICHCCCOHCHROIRIHICCHHOROCR);
      } else {
         super.OOCCCHRCIRHCRCIRHRHHCRIOHICRRC(var1);
      }
   }

   public void IIHHICHCCCOHCHROIRIHICCHHOROCR(T var1) {
      if (this.contains((T)var1)) {
         this.remove((T)var1);
      } else {
         this.add((T)var1);
      }
   }

   public boolean add(T var1) {
      try {
         ArrayList var2 = new ArrayList<>(this.get());
         boolean var3;
         if (this.COROOORHOCOCIIORICCHRIIHICRROH) {
            var2.add(0, var1);
            var3 = true;
         } else {
            var3 = var2.add(var1);
         }

         if (this.OOICCHOOIRICRCOOHIOROHORHOROCR != null) {
            this.OOICCHOOIRICRCOOHIOROHORHOROCR.accept((T)var1);
         }

         super.RHRIIOOOCRHIIOORCOCRCHRCCRRCIH((T)var2);
         return var3;
      } catch (Exception var4) {
         var4.printStackTrace();
         return false;
      }
   }

   public boolean remove(T var1) {
      try {
         ArrayList var2 = new ArrayList<>(this.get());
         boolean var3 = var2.remove(var1);
         if (this.OOICCHOOIRICRCOOHIOROHORHOROCR != null) {
            this.OOICCHOOIRICRCOOHIOROHORHOROCR.accept((T)var1);
         }

         super.RHRIIOOOCRHIIOORCOCRCHRCCRRCIH((T)var2);
         return var3;
      } catch (Exception var4) {
         var4.printStackTrace();
         return false;
      }
   }

   public boolean contains(T var1) {
      try {
         return this.get().contains(var1);
      } catch (Exception var3) {
         var3.printStackTrace();
         return false;
      }
   }

   @Override
   protected com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ICICIOCHHHIHOCHCOHORIHRCOHHOCR<?> CIOHHCORHRCCRICCCORIHCRHCCCRRR(
      com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
   ) {
      return new com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         this, var1
      );
   }

   @Override
   public HCHRIROHHHCORIOCROOCHRCIOROOCI<List<T>> OROOOIIIIOCROOOHOIORCIHHCIHOIR() {
      HCHRIROHHHCORIOCROOCHRCIOROOCI var1 = super.OROOOIIIIOCROOOHOIORCIHHCIHOIR();
      var1.RHRIIOOOCRHIIOORCOCRCHRCCRRCIH(this.get());
      return var1;
   }

   @Generated
   public @Nullable Function<T, String> RHCROOCCRHHHRIOIROOCOIOHORRRCH() {
      return this.OICRIIIORCCOHHIORHRHCIRIHICRRI;
   }

   public static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<B extends OHIIIOHIRIRCCRRIOIICCHHIORRHOH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<B, T>, T>
      extends com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH<OHIIIOHIRIRCCRRIOIICCHHIORRHOH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<B, T>, OHIIIOHIRIRCCRRIOIICCHHIORRHOH<T>, List<T>> {
      private boolean COROOORHOCOCIIORICCHRIIHICRROH = false;
      private @Nullable Consumer<T> OROOHIRIRCIRCOIROROHCCCHHCIOCI;
      private @Nullable Function<T, String> OICRIIIORCCOHHIORHRHCIRIHICRRI;
      private @Nullable Codec<T> elementCodec;

      protected RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         @HIHCCHCCOCOHRICOICHRCOIHIIRIHO(CHHOHHOIRCCRRCRIHCCOHHRCIHRHII = HIHCCHCCOCOHRICOICHRCOIHIIRIHO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.SETTING) String var1
      ) {
         super(var1);
      }

      @Override
      protected com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRRRICCRROCOHHOHIICIHORCOORRRH ORCHRRHCCOIHHRROOHROROROOHOHIO() {
         return com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.MODIFIABLE_LIST;
      }

      @Override
      protected @Nullable Codec<List<T>> CIHHRHHHCCHCCCCCIRRORHICROCHHR() {
         return null;
      }

      @Override
      protected @Nullable Function<OHIIIOHIRIRCCRRIOIICCHHIORRHOH<T>, HHCCIRHCCCIIRHCROHIORHIRHHIORH> OOCCCOICCIHIIHRRRHHROIRIOROCCR() {
         return var1 -> new com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.CRRRICCRROCOHHOHIICIHORCOORRRH(var1) {
            @Override
            public JsonElement provide() {
               OHIIIOHIRIRCCRRIOIICCHHIORRHOH var1x = (OHIIIOHIRIRCCRRIOIICCHHIORRHOH)this.option;
               JsonObject var2 = super.provide().getAsJsonObject();
               var2.add("value", this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1x));
               return var2;
            }

            private JsonArray HHCCIRHCCCIIRHCROHIORHIRHHIORH(OHIIIOHIRIRCCRRIOIICCHHIORRHOH<T> var1) {
               JsonArray var2 = new JsonArray();

               for (Object var4 : (List)var1.HRHHHHIICCCIROOOHIIIHIHIHHHOHC()) {
                  JsonObject var5 = new JsonObject();
                  var5.addProperty("name", this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, (T)var4));
                  var5.addProperty("value", var4.toString());
                  var2.add(var5);
               }

               return var2;
            }

            private String RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(OHIIIOHIRIRCCRRIOIICCHHIORRHOH<T> var1, T var2) {
               return var1.OICRIIIORCCOHHIORHRHCIRIHICRRI != null ? var1.OICRIIIORCCOHHIORHRHCIRIHICRRI.apply((T)var2) : var2.toString();
            }
         };
      }

      @Contract("->this")
      public B COIORIRICHOOHOOHCHCRCOICIOOROO() {
         this.COROOORHOCOCIIORICCHRIIHICRROH = true;
         return (B)this;
      }

      @Contract("_->this")
      public B OHCIIOCHHOHOHCOHHCRRHHCRHOIICC(@Nullable Consumer<T> var1) {
         this.OROOHIRIRCIRCOIROROHCCCHHCIOCI = var1;
         return (B)this;
      }

      @Contract("_->this")
      public B CIOHHCORHRCCRICCCORIHCRHCCCRRR(@Nullable Function<T, String> var1) {
         this.OICRIIIORCCOHHIORHRHCIRIHICRRI = var1;
         return (B)this;
      }

      @Contract("_->this")
      public B RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(@Nullable Codec<T> var1) {
         this.elementCodec = var1;
         return (B)this;
      }

      protected OHIIIOHIRIRCCRRIOIICCHHIORRHOH<T> COOHOICRIIIIIROHRIIHHCRIRRIIHI() {
         return new OHIIIOHIRIRCCRRIOIICCHHIORRHOH<>(
            this.RROHIIOCCIOHRHHIIRIOIRHHIOCRRO,
            this.codec,
            this.defaultValue == null ? new ArrayList<>() : this.defaultValue,
            this.COROOORHOCOCIIORICCHRIIHICRROH,
            this.OROOHIRIRCIRCOIROROHCCCHHCIOCI,
            this.OICRIIIORCCOHHIORHRHCIRIHICRRI,
            this.elementCodec
         );
      }
   }
}
