package com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.lunarclient.dfu.serialization.Codec;
import com.moonsworth.lunar.client.util.HIHCCHCCOCOHRICOICHRCOIHIIRIHO;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import org.jetbrains.annotations.Contract;
import org.jspecify.annotations.Nullable;

public class IHICORCROOROHCIHIHCOIHRRHICICO<T extends Number & Comparable<T>> extends HRCHROOHRIHCRCRHRIIROCIRHOIRHH<List<T>> {
   private final @Nullable List<String> RCRCIHOHICHHRICIOOHCIOHOHIHCCR;

   public IHICORCROOROHCIHIHCOIHRRHICICO(
      @HIHCCHCCOCOHRICOICHRCOIHIIRIHO(CHHOHHOIRCCRRCRIHCCOHHRCIHRHII = HIHCCHCCOCOHRICOICHRCOIHIIRIHO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.SETTING) String var1,
      @Nullable Codec<List<T>> var2,
      List<T> var3,
      @Nullable List<String> var4
   ) {
      super(var1, var2, var3);
      this.RCRCIHOHICHHRICIOOHCIOHOHIHCCR = var4;
   }

   public void HCCCCIHIOIHCHCCHOOHHCIHRCRRRHH(List<Double> var1) {
      ArrayList var2 = new ArrayList();

      for (Double var4 : var1) {
         var2.add(this.HICHRCOHCCRHOHCICOOCHOIHCCHIRI(var4));
      }

      this.RHRIIOOOCRHIIOORCOCRCHRCCRRCIH(var2);
   }

   public String RRICRRCHRHCCOOHCHHCRCCIRRICRHO(int var1) {
      Number var2 = this.get().get(var1);
      return String.format("%.2f", var2.floatValue());
   }

   private <K extends Number> K HICHRCOHCCRHOHCICOOCHOIHCCHIRI(Double var1) {
      Class var2 = this.HRHHHHIICCCIROOOHIIIHIHIHHHOHC().get(0).getClass();
      Number var3;
      if (var2 == Integer.class) {
         var3 = (int)Math.round(var1);
      } else if (var2 == Float.class) {
         var3 = var1.floatValue();
      } else if (var2 == Byte.class) {
         var3 = (byte)Math.round(var1);
      } else if (var2 == Long.class) {
         var3 = Math.round(var1);
      } else if (var2 == Short.class) {
         var3 = (short)Math.round(var1);
      } else {
         var3 = var1;
      }

      return (K)var3;
   }

   @Override
   protected com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ICICIOCHHHIHOCHCOHORIHRCOHHOCR<?> CIOHHCORHRCCRICCCORIHCRHCCCRRR(
      com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
   ) {
      return new com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHRIICOIOORCHCOIICOOIHIRHHICRI<>(
         this, var1
      );
   }

   public static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<T extends Number & Comparable<T>>
      extends com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH<IHICORCROOROHCIHIHCOIHRRHICICO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<T>, IHICORCROOROHCIHIHCOIHRRHICICO<T>, List<T>> {
      private @Nullable List<String> RCRCIHOHICHHRICIOOHCIOHOHIHCCR;

      protected RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         @HIHCCHCCOCOHRICOICHRCOIHIIRIHO(CHHOHHOIRCCRRCRIHCCOHHRCIHRHII = HIHCCHCCOCOHRICOICHRCOIHIIRIHO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.SETTING) String var1
      ) {
         super(var1);
      }

      @Override
      protected com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRRRICCRROCOHHOHIICIHORCOORRRH ORCHRRHCCOIHHRROOHROROROOHOHIO() {
         return com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.MULTI_NUMBER;
      }

      @Override
      protected @Nullable Codec<List<T>> CIHHRHHHCCHCCCCCIRRORHICROCHHR() {
         return null;
      }

      @Override
      protected @Nullable Function<IHICORCROOROHCIHIHCOIHRRHICICO<T>, HHCCIRHCCCIIRHCROHIORHIRHHIORH> OOCCCOICCIHIIHRRRHHROIRIOROCCR() {
         return var1 -> new com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.CRRRICCRROCOHHOHIICIHORCOORRRH(var1) {
            @Override
            public JsonElement provide() {
               JsonObject var1x = super.provide().getAsJsonObject();
               IHICORCROOROHCIHIHCOIHRRHICICO var2 = (IHICORCROOROHCIHIHCOIHRRHICICO)this.option;
               List var3 = var2.RCRCIHOHICHHRICIOOHCIOHOHIHCCR;
               if (var3 != null) {
                  JsonArray var4 = new JsonArray();

                  for (String var6 : var3) {
                     var4.add(var6);
                  }

                  var1x.add("names", var4);
               }

               List var7 = (List)var2.HRHHHHIICCCIROOOHIIIHIHIHHHOHC();
               var1x.addProperty("integer", !var7.isEmpty() && var7.get(0) instanceof Integer);
               return var1x;
            }
         };
      }

      @Contract("_->this")
      public IHICORCROOROHCIHIHCOIHRRHICICO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<T> HHOIOCRIRIOCOIHHOOHICIOIIOHCOR(@Nullable List<String> var1) {
         this.RCRCIHOHICHHRICIOOHCIOHOHIHCCR = var1;
         return this;
      }

      @Contract("_->this")
      public IHICORCROOROHCIHIHCOIHRRHICICO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<T> ICICIOCHHHIHOCHCOHORIHRCOHHOCR(String... var1) {
         return this.HHOIOCRIRIOCOIHHOOHICIOIIOHCOR(List.of(var1));
      }

      protected IHICORCROOROHCIHIHCOIHRRHICICO<T> HOORHOIHCHHRCCIRHHOIROOHIHOHOC() {
         if (this.defaultValue == null) {
            throw new com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
               this, "Value must be set!"
            );
         } else {
            return new IHICORCROOROHCIHIHCOIHRRHICICO<>(this.RROHIIOCCIOHRHHIIRIOIRHHIOCRRO, this.codec, this.defaultValue, this.RCRCIHOHICHHRICIOOHCIOHOHIHCCR);
         }
      }
   }
}
