package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.CORCOCICIRIOHROHROIIOOHICCHCRR;

import java.nio.FloatBuffer;
import net.minecraft.client.renderer.GlStateManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
@Mixin(GlStateManager.class)
public class CRRRICCRROCOHHOHIICIHORCOORRRH {
   @Unique
   private static boolean bridge$modelView = true;

   @Inject(method = "matrixMode", at = @At("HEAD"))
   private static void bridge$matrixMode(int var0, CallbackInfo var1) {
      bridge$modelView = var0 == 5888;
   }

   @Inject(method = "loadIdentity", at = @At("HEAD"))
   private static void bridge$loadIdentity(CallbackInfo var0) {
      if (bridge$modelView
         && com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ICCOIHIOHCIRRCIIRCCHIHROHCHOOH
            != null) {
         com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ICCOIHIOHCIRRCIIRCCHIHROHCHOOH
            .HIHROCOCCHRHHRROHCRCCHOIRCHIHI();
      }
   }

   @Inject(method = "pushMatrix", at = @At("HEAD"))
   private static void bridge$pushMatrix(CallbackInfo var0) {
      if (bridge$modelView
         && com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ICCOIHIOHCIRRCIIRCCHIHROHCHOOH
            != null) {
         com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ICCOIHIOHCIRRCIIRCCHIHROHCHOOH
            .CCICHRCORROHIOCIOIRHOICHRRIRHO();
      }
   }

   @Inject(method = "popMatrix", at = @At("HEAD"))
   private static void bridge$popMatrix(CallbackInfo var0) {
      if (bridge$modelView
         && com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ICCOIHIOHCIRRCIIRCCHIHROHCHOOH
            != null) {
         com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ICCOIHIOHCIRRCIIRCCHIHROHCHOOH
            .ORHHRHCOIOCOHIIHIROCIRCOIRIHHI();
      }
   }

   @Inject(method = "ortho", at = @At("HEAD"))
   private static void bridge$ortho(double var0, double var2, double var4, double var6, double var8, double var10, CallbackInfo var12) {
      if (bridge$modelView
         && com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ICCOIHIOHCIRRCIIRCCHIHROHCHOOH
            != null) {
         com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ICCOIHIOHCIRRCIIRCCHIHROHCHOOH
            .HHCCIRHCCCIIRHCROHIORHIRHHIORH(var0, var2, var4, var6, var8, var10);
      }
   }

   @Inject(method = "rotate", at = @At("HEAD"))
   private static void bridge$rotate(float var0, float var1, float var2, float var3, CallbackInfo var4) {
      if (bridge$modelView
         && com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ICCOIHIOHCIRRCIIRCCHIHROHCHOOH
            != null) {
         com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ICCOIHIOHCIRRCIIRCCHIHROHCHOOH
            .RRCRRCORICCHOHHIRCHIROOHIIOHCO(var0, var1, var2, var3);
      }
   }

   @Inject(method = "scale(FFF)V", at = @At("HEAD"))
   private static void bridge$scale(float var0, float var1, float var2, CallbackInfo var3) {
      if (bridge$modelView
         && com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ICCOIHIOHCIRRCIIRCCHIHROHCHOOH
            != null) {
         com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ICCOIHIOHCIRRCIIRCCHIHROHCHOOH
            .scale(var0, var1, var2);
      }
   }

   @Inject(method = "scale(DDD)V", at = @At("HEAD"))
   private static void bridge$scale(double var0, double var2, double var4, CallbackInfo var6) {
      if (bridge$modelView
         && com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ICCOIHIOHCIRRCIIRCCHIHROHCHOOH
            != null) {
         com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ICCOIHIOHCIRRCIIRCCHIHROHCHOOH
            .scale((float)var0, (float)var2, (float)var4);
      }
   }

   @Inject(method = "translate(FFF)V", at = @At("HEAD"))
   private static void bridge$translate(float var0, float var1, float var2, CallbackInfo var3) {
      if (bridge$modelView
         && com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ICCOIHIOHCIRRCIIRCCHIHROHCHOOH
            != null) {
         com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ICCOIHIOHCIRRCIIRCCHIHROHCHOOH
            .CRICCOOHHHCHOORCICOCOHIHOIRHOO(var0, var1, var2);
      }
   }

   @Inject(method = "translate(DDD)V", at = @At("HEAD"))
   private static void bridge$translate(double var0, double var2, double var4, CallbackInfo var6) {
      if (bridge$modelView
         && com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ICCOIHIOHCIRRCIIRCCHIHROHCHOOH
            != null) {
         com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ICCOIHIOHCIRRCIIRCCHIHROHCHOOH
            .CRICCOOHHHCHOORCICOCOHIHOIRHOO((float)var0, (float)var2, (float)var4);
      }
   }

   @Inject(method = "multMatrix", at = @At("HEAD"))
   private static void bridge$multMatrix(FloatBuffer var0, CallbackInfo var1) {
      if (bridge$modelView
         && com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ICCOIHIOHCIRRCIIRCCHIHROHCHOOH
            != null) {
         com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ICCOIHIOHCIRRCIIRCCHIHROHCHOOH
            .IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0);
      }
   }

   @Inject(method = "blendFunc(II)V", at = @At("HEAD"), cancellable = true)
   private static void bridge$blendFunc(int var0, int var1, CallbackInfo var2) {
      if (com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CHORCRHOORCIOHHIOCORCCCCCIRCCR()) {
         GlStateManager.tryBlendFuncSeparate(var0, var1, 1, 771);
         var2.cancel();
      }
   }

   @Inject(method = "tryBlendFuncSeparate(IIII)V", at = @At("HEAD"), cancellable = true)
   private static void bridge$blendFuncSeparate(int var0, int var1, int var2, int var3, CallbackInfo var4) {
      if (var0 != 0 || var1 != 0 || var2 != 0 || var3 != 0) {
         if (com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CHORCRHOORCIOHHIOCORCCCCCIRCCR() && var3 != 771) {
            GlStateManager.tryBlendFuncSeparate(var0, var1, 1, 771);
            var4.cancel();
         }
      }
   }
}
