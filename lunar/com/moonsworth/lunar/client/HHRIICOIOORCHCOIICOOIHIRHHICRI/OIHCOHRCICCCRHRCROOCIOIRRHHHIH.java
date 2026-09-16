package com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.lunarclient.dfu.serialization.Codec;
import com.moonsworth.lunar.client.util.HIHCCHCCOCOHRICOICHRCOIHIIRIHO;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import lombok.Generated;
import org.jetbrains.annotations.Contract;
import org.jspecify.annotations.Nullable;

public abstract class OIHCOHRCICCCRHRCROOCIOIRRHHHIH<T> extends HRCHROOHRIHCRCRHRIIROCIRHOIRHH<T> {
   private final Set<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IHIRRIIORRHORHRORIHOROIRCORCOO> IOIOHHROHCORCCOHIOCHRIRIHCICHR = new HashSet<>(
      0
   );
   private final boolean ORCOCOOCOCCCICIOIICORRRIHOCORI;
   private final boolean CCOCOICORHHHIHIOIOOIRIOHORRCRI;
   private long RHIRHCIOCHIRRICCIIICIHOROCHRCR;
   private boolean CRCOICCHOOIHHORCOCORHCCCCIIICC;
   private int CHCRIOIRHRCCHCOOHCOIOIIIOOHHCH = 200;
   private final List<Runnable> CORCIRCIOOIOHORHHOICOROIOCHHHI = new ArrayList<>();
   private final List<BooleanConsumer> IIHHROIHORORIIIOORROCIIRIRIHCO = new ArrayList<>();

   public OIHCOHRCICCCRHRCROOCIOIRRHHHIH(
      @HIHCCHCCOCOHRICOICHRCOIHIIRIHO(CHHOHHOIRCCRRCRIHCCOHHRCIHRHII = HIHCCHCCOCOHRICOICHRCOIHIIRIHO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.SETTING) String var1,
      @Nullable Codec<T> var2,
      T var3,
      boolean var4,
      boolean var5
   ) {
      super(var1, var2, (T)var3);
      this.ORCOCOOCOCCCICIOIICORRRIHOCORI = var4;
      this.CCOCOICORHHHIHIOIOOIRIOHORRCRI = var5;
      com.moonsworth.lunar.client.IRRCCOICORICIHCHRHIHIHROIRHOCR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         this
      );
   }

   public OIHCOHRCICCCRHRCROOCIOIRRHHHIH<T> OOCCRCRCOHIIORCCORCRCIRRROIOOR(Runnable var1) {
      this.CORCIRCIOOIOHORHHOICOROIOCHHHI.add(var1);
      return this;
   }

   public OIHCOHRCICCCRHRCROOCIOIRRHHHIH<T> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(BooleanConsumer var1) {
      this.IIHHROIHORORIIIOORROCIIRIRIHCO.add(var1);
      return this;
   }

   public abstract boolean isKeyDown();

   public abstract boolean ROOCCRIHOICIHCCRRRROHICCROHCCO();

   public abstract com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH CCICCIOCIHOOIHCIRCHHHRROHIHHIH();

   public boolean isUnique() {
      return this.IOIOHHROHCORCCOHIOCHRIRIHCICHR == null || this.IOIOHHROHCORCCOHIOCHRIRIHCICHR.size() <= 1;
   }

   public Set<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IHIRRIIORRHORHRORIHOROIRCORCOO> RHCOIHCIIROIHIIRIIIHCRROICROHH() {
      return this.IOIOHHROHCORCCOHIOCHRIRIHCICHR != null && !this.isUnique() ? this.IOIOHHROHCORCCOHIOCHRIRIHCICHR : Collections.emptySet();
   }

   public boolean HHRIICOIOORCHCOIICOOIHIRHHICRI(
      Set<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IHIRRIIORRHORHRORIHOROIRCORCOO> var1
   ) {
      if (this.IOIOHHROHCORCCOHIOCHRIRIHCICHR.equals(var1)) {
         return false;
      }

      this.IOIOHHROHCORCCOHIOCHRIRIHCICHR.clear();
      this.IOIOHHROHCORCCOHIOCHRIRIHCICHR.addAll(var1);
      return true;
   }

   public void RRRRIHRIIRHRCCCOCOIRCRCHOCROHO() {
      if (this.isUnique()) {
         Set var1 = this.IHCRORHRORIICHRHRCHRRIRRHHOCOO(
            com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RHOOIRCROCOHHRHORHOHHCRHRIIHCC
         );
         if (var1 != null) {
            var1.remove(CRICCOOHHHCHOORCICOCOHIHOIRHOO.DUPLICATE_KEY);
            if (var1.isEmpty()) {
               this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RHOOIRCROCOHHRHORHOHHCRHRIIHCC
               );
            }
         }
      } else {
         this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
               com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RHOOIRCROCOHHRHORHOHHCRHRIIHCC,
               var0 -> new HashSet<>(2)
            )
            .add(CRICCOOHHHCHOORCICOCOHIHOIRHOO.DUPLICATE_KEY);
      }

      com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var2 = this.IHCRORHRORIICHRHRCHRRIRRHHOCOO(
         com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.CRHRCRCCHCICIRIRCIRHRCIHCIRHIO
      );
      if (var2 != null && var2.OHOOICOOIHRHIRHCRORRHHRRIIIHIO()) {
         var2.OCCHOHICOOHCHIOCRRCCOCRCROHHHO();
      }
   }

   @Generated
   public boolean OIROCCCHRIOHOHIIIICRCRCHIHOCRI() {
      return this.ORCOCOOCOCCCICIOIICORRRIHOCORI;
   }

   @Generated
   public boolean RIHOOHHICRCCIHCOIRHIHIIIROIICH() {
      return this.CCOCOICORHHHIHIOIOOIRIOHORRCRI;
   }

   @Generated
   public long OIRHHHIRRRHRHRICRCHCRCRCRHHHHH() {
      return this.RHIRHCIOCHIRRICCIIICIHOROCHRCR;
   }

   @Generated
   public void COOCCHICCCIIICRHIOCOCIOOORCOCC(long var1) {
      this.RHIRHCIOCHIRRICCIIICIHOROCHRCR = var1;
   }

   @Generated
   public boolean isDown() {
      return this.CRCOICCHOOIHHORCOCORHCCCCIIICC;
   }

   @Generated
   public void OICIOHIRRIIOIHOOHOCHIIOHHIRCCO(boolean var1) {
      this.CRCOICCHOOIHHORCOCORHCCCCIIICC = var1;
   }

   @Generated
   public int RRRCHCOORIRHHORORHOIOOICRHCCHC() {
      return this.CHCRIOIRHRCCHCOOHCOIOIIIOOHHCH;
   }

   @Generated
   public void OIRRROORIIRHHROOCCRIIIRRIOCCCO(int var1) {
      this.CHCRIOIRHRCCHCOOHCOIOIIIOOHHCH = var1;
   }

   @Generated
   public List<Runnable> OCOICRICIHOCOHCHRHCHIRCRROOOHH() {
      return this.CORCIRCIOOIOHORHHOICOROIOCHHHI;
   }

   @Generated
   public List<BooleanConsumer> HOIOIRCRHCCHCHICOIOHHCICOIOCRR() {
      return this.IIHHROIHORORIIIOORROCIIRIRIHCO;
   }

   public static class IRCIIHHICIHRCOCRROCOICRIHHCCHH
      extends com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.CRRRICCRROCOHHOHIICIHORCOORRRH {
      public IRCIIHHICIHRCOCRROCOICRIHHCCHH(HCHRIROHHHCORIOCROOCHRCIOROOCI<?> var1) {
         super(var1);
      }

      @Override
      public JsonElement provide() {
         JsonObject var1 = super.provide().getAsJsonObject();
         var1.add("clashesWith", this.OCOOCIHOOCRIHCRHIRHIHCCIIIORRC());
         return var1;
      }

      private JsonArray OCOOCIHOOCRIHCRHIRHIHCCIIIORRC() {
         JsonArray var1 = new JsonArray();

         for (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IHIRRIIORRHORHRORIHOROIRCORCOO var3 : ((OIHCOHRCICCCRHRCROOCIOIRRHHHIH)this.option)
            .RHCOIHCIIROIHIIRIIIHCRROICROHH()) {
            JsonObject var4 = new JsonObject();
            String var5 = var3.id();
            var4.addProperty("id", IICCOOCHCHROORHHIIHROHCCRHRCOR.HICHORIRCCHROCRROIRRICCHOCRCRO().getOrDefault(var5, var5));
            var4.addProperty("source", var3.RIHHCCIRROHCHRIROIHHOCCRCIRCHI().name());
            var1.add(var4);
         }

         return var1;
      }
   }

   public abstract static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<B extends OIHCOHRCICCCRHRCROOCIOIRRHHHIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<B, O, T>, O extends OIHCOHRCICCCRHRCROOCIOIRRHHHIH<T>, T>
      extends com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH<B, O, T> {
      protected boolean ORCOCOOCOCCCICIOIICORRRIHOCORI = true;
      protected boolean CCOCOICORHHHIHIOIOOIRIOHORRCRI = false;

      protected RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         @HIHCCHCCOCOHRICOICHRCOIHIIRIHO(CHHOHHOIRCCRRCRIHCCOHHRCIHRHII = HIHCCHCCOCOHRICOICHRCOIHIIRIHO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.SETTING) String var1
      ) {
         super(var1);
      }

      @Override
      protected com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRRRICCRROCOHHOHIICIHORCOORRRH ORCHRRHCCOIHHRROOHROROROOHOHIO() {
         return com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.KEYBIND;
      }

      @Override
      protected @Nullable Codec<T> CIHHRHHHCCHCCCCCIRRORHICROCHHR() {
         return null;
      }

      @Override
      protected @Nullable Function<O, HHCCIRHCCCIIRHCROHIORHIRHHIORH> OOCCCOICCIHIIHRRRHHROIRIOROCCR() {
         return OIHCOHRCICCCRHRCROOCIOIRRHHHIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH::new;
      }

      @Contract("_->this")
      public B IHHOOOHOIIOHRROCHCOOIIHHCOIHII(boolean var1) {
         this.ORCOCOOCOCCCICIOIICORRRIHOCORI = var1;
         return (B)this;
      }

      @Contract("_->this")
      public B IHCOIHIICIIHOOIICCHHCRORHORHCI(boolean var1) {
         this.CCOCOICORHHHIHIOIOOIRIOHORRCRI = var1;
         return (B)this;
      }

      @Contract("->this")
      public B CRHRHHOOCIRIICHHHHRHROICCCHRCI() {
         return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.ORCHCCHICIRHCRHOHIRORCOCHOHRIO
         );
      }
   }
}
