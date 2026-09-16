package com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC;

import com.google.common.collect.Sets;
import com.google.errorprone.annotations.OverridingMethodsMustInvokeSuper;
import com.google.gson.JsonObject;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.CIOHHCORHRCCRICCCORIHCRHCCCRRR;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.CORCOCICIRIOHROHROIIOOHICCHCRR;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.CRICCOOHHHCHOORCICOCOHIHOIRHOO;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HICRRICCHCCROOHHCHOCOCCHOIHHOC;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public abstract class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<F extends com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH>
   extends IRCIIHHICIHRCOCRROCOICRIHHCCHH<F>
   implements HRCHROOHRIHCRCRHRIIROCIRHOIRHH {
   protected abstract Set<F> ICIHIOHHOCHRCIOIHCICIIOHOHHRIO();

   @Override
   protected final Set<F> ORRHHOHHRICCROHHICIOOHOOCRRRCC() {
      Set var1 = this.ICIHIOHHOCHRCIOIHCICIIOHOHHRIO();
      var1.removeIf(
         var0 -> var0.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH(HICRRICCHCCROOHHCHOCOCCHOIHHOC.IHHOCHOCHOCCHIIICRHRRROICHHIIC)
            .map(var0x -> !var0x.RROCRHIIHORCOCIRICHOCCICORCCCO())
            .orElse(false)
      );
      var1.forEach(this::RORCHCIIICOHIRROOORHOCCCCIOCCI);
      this.CIOHHCORHRCCRICCCORIHCRHCCCRRR(var1);
      return var1;
   }

   @SafeVarargs
   protected final LinkedHashSet<F> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(F... var1) {
      LinkedHashSet var2 = Sets.newLinkedHashSet();
      var2.addAll(Arrays.asList(var1));
      return var2;
   }

   @OverridingMethodsMustInvokeSuper
   protected void RORCHCIIICOHIRROOORHOCCCCIOCCI(F var1) {
      var1.ORHHROIRHRHOHCOCORCHROHRICCHOO();
   }

   protected void CIOHHCORHRCCRICCCORIHCRHCCCRRR(Set<F> var1) {
   }

   @OverridingMethodsMustInvokeSuper
   @Override
   public void init() {
      super.init();
      this.OHRRCRHHCOHOHHCORRROHROOCOCCHH();
   }

   @Override
   public boolean OHRRCRHHCOHOHHCORRROHROOCOCCHH() {
      for (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2 : this.OHHRCRIOOCIORORHIOHRICRHHORCIH()) {
         var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HICRRICCHCCROOHHCHOCOCCHOIHHOC.IIRHHICCCOCCRRCOCOCCCOIROOIOOR, CIOHHCORHRCCRICCCORIHCRHCCCRRR.LOADING_CONFIG);
      }

      boolean var4 = HRCHROOHRIHCRCRHRIIROCIRHOIRHH.super.OHRRCRHHCOHOHHCORRROHROOCOCCHH();

      for (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 : this.OHHRCRIOOCIORORHIOHRICRHHORCIH()) {
         IOHHOIIOCRHCHHCRORICCOHOHROOIH(var3);
         var3.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH(HICRRICCHCCROOHHCHOCOCCHOIHHOC.IICCRHIHRIHOHICHCRIROICOICROOR)
            .ifPresent(var0 -> var0.OOCCRCRCOHIIORCCORCRCIRRROIOOR(RCIRROCCCIIHCIHCCRHHCCHOHHHCHH::IOHHOIIOCRHCHHCRORICCOHOHROOIH));
      }

      return var4;
   }

   public static void IOHHOIIOCRHCHHCRORICCOHOHROOIH(com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var0) {
      CORCOCICIRIOHROHROIIOOHICCHCRR var1 = var0.IHCRORHRORIICHRHRCHRRIRRHHOCOO(HICRRICCHCCROOHHCHOCOCCHOIHHOC.IRIIIRORRHRROOOIRHROOOIIHIHIRH);
      if (var1 != null && var1.OCIOICIOHHHIRIOCIHCHHCCHRRRIHI().isPresent()) {
         if (var0.IRCIIHHICIHRCOCRROCOICRIHHCCHH(HICRRICCHCCROOHHCHOCOCCHOIHHOC.OOHIRROOHIRRIHOHHHICCOCRCRCROI, false)) {
            var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1.isEnabled());
         } else {
            var0.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HICRRICCHCCROOHHCHOCOCCHOIHHOC.OOHIRROOHIRRIHOHHHICCOCRCRCROI, true);
            var1.OCIOICIOHHHIRIOCIHCHHCCHRRRIHI().get().IOIOHIORIROHRRCOOOHCROHORCOIIH(var2x -> var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var2x));
         }
      } else {
         CRICCOOHHHCHOORCICOCOHIHOIRHOO var2 = var0.IHCRORHRORIICHRHRCHRRIRRHHOCOO(HICRRICCHCCROOHHCHOCOCCHOIHHOC.CHOCIHRHOOCRCRRORCRRIHHCRIHHRI);
         if (var2 != null) {
            var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, true, false);
         }

         var0.COIHORRCHRRCHOCIRHHRRIOIHRIHCC(true);
         var0.updateEnabled();
      }

      var0.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HICRRICCHCCROOHHCHOCOCCHOIHHOC.IIRHHICCCOCCRRCOCOCCCOIROOIOOR, CIOHHCORHRCCRICCCORIHCRHCCCRRR.COMPLETE);
   }

   @Override
   public boolean RROCHHOICHHIRRHICHORHRCOHCROHI() {
      return true;
   }

   @Override
   public void load(JsonObject var1) {
      boolean var2 = com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            this, var1
         )
         && this.RROCHHOICHHIRRHICHORHRCOHCROHI();
      int var3 = var1.has("version") ? var1.get("version").getAsInt() : 0;

      for (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var5 : this.OHHRCRIOOCIORORHIOHRICRHHORCIH()) {
         try {
            String var6 = var5.getId();
            JsonObject var7;
            if (var1.has(var6) && !var1.get(var6).isJsonNull()) {
               var7 = var1.getAsJsonObject(var6);
               var7.addProperty("version", var3);
            } else {
               var7 = new JsonObject();
            }

            var5.load(var7);
         } catch (Exception var8) {
            var8.printStackTrace();
         }

         var5.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HICRRICCHCCROOHHCHOCOCCHOIHHOC.IIRHHICCCOCCRRCOCOCCCOIROOIOOR, CIOHHCORHRCCRICCCORIHCRHCCCRRR.LOADED_CONFIG);
      }

      if (var2) {
         this.RHHIIRORCOIORHIOHRHCIHRHHIRCRH(true);
      }
   }

   @Override
   public void HHCCIRHCCCIIRHCROHIORHIRHHIORH(JsonObject var1) {
      var1.addProperty(
         "version",
         com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OCCRIIOROHCIIOROCCCHOCIHHOOCIH
      );

      for (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 : this.OHHRCRIOOCIORORHIOHRICRHHORCIH()) {
         try {
            JsonObject var4 = new JsonObject();
            var3.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var4);
            if (!var4.entrySet().isEmpty()) {
               var1.add(var3.getId(), var4);
            }
         } catch (Exception var5) {
            var5.printStackTrace();
         }
      }
   }

   @Override
   public void close() {
      this.HRIIIOIIRHOHORIRICIOIORRIRCHHO();
   }
}
