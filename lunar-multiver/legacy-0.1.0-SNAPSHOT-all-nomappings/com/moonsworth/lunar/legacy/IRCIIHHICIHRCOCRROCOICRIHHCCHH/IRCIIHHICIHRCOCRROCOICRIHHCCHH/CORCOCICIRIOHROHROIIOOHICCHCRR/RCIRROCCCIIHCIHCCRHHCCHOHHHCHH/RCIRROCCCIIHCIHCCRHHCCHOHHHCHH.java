package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.legacy.wrapper.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;
import com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HICHRCOHCCRHOHCICOOCHOIHCCHIRI;
import org.lwjgl.opengl.GL11;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(GL11.class)
public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   @Inject(method = "glShadeModel", at = @At("HEAD"))
   private static void lunar$shadeModel(int var0, CallbackInfo var1) {
      RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIRHCOCHCRIHRRRCOCOOHOOHRORHHH.RHHROCHOICIHHIRHRHCIROCRIIOICR = var0;
   }

   @Inject(method = "glAlphaFunc", at = @At("HEAD"))
   private static void lunar$alphaFunc(int var0, float var1, CallbackInfo var2) {
      RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIRHCOCHCRIHRRRCOCOOHOOHRORHHH.HCCICHHORIHRHCHIIOICIIHICROCOH = var0;
      RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIRHCOCHCRIHRRRCOCOOHOOHRORHHH.ORHHRCOHCOCOOHIOIIOIHROROCOIIC = var1;
   }

   @Inject(method = "glEnable", at = @At("HEAD"))
   private static void lunar$enable(int var0, CallbackInfo var1) {
      lunar$setCapability(var0, true);
   }

   @Inject(method = "glDisable", at = @At("HEAD"))
   private static void lunar$disable(int var0, CallbackInfo var1) {
      lunar$setCapability(var0, false);
   }

   @Unique
   private static void lunar$setCapability(int var0, boolean var1) {
      HICHRCOHCCRHOHCICOOCHOIHCCHIRI var2 = RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIRHCOCHCRIHRRRCOCOOHOOHRORHHH;
      switch (var0) {
         case 2884:
            var2.OIHOHRIRIHRIIIIHICRRIIRORCOIRI = var1;
            break;
         case 2896:
            var2.lighting = var1;
            break;
         case 2929:
            var2.RRCIOHROHIHCRORRIHIHOOOHHRCIOR = var1;
            break;
         case 3008:
            var2.CHIIRROIHRICHCOROCOOCOIIHRRROR = var1;
            break;
         case 3042:
            var2.ROROCROHRIRHOIHHIOOHRCOCIHOIIR = var1;
            break;
         case 3553:
            var2.IHORRHCCCIROIRCIRIRCIORHRRRHRR(var1);
            break;
         case 32826:
            var2.HOCCOIRICCOIOCIRROCCIRIRCHCORO = var1;
      }
   }

   @Inject(method = "glColorMask", at = @At("HEAD"))
   private static void lunar$colorMask(boolean var0, boolean var1, boolean var2, boolean var3, CallbackInfo var4) {
      HICHRCOHCCRHOHCICOOCHOIHCCHIRI var5 = RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIRHCOCHCRIHRRRCOCOOHOOHRORHHH;
      var5.IOOIOORICOHOCCIOCHHHHHRRIRRCHI = var0;
      var5.HHRRIHCOIRHOIOCIHCCIORIROHHICI = var1;
      var5.HOCHCCRHCRHRHOHHORORHRROIOORRC = var2;
      var5.ICHHRIOCHIHRIRRIRIHOOCICIIIHIH = var3;
   }

   @Inject(method = "glDepthMask", at = @At("HEAD"))
   private static void lunar$depthMask(boolean var0, CallbackInfo var1) {
      RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIRHCOCHCRIHRRRCOCOOHOOHRORHHH.CRHIHIOIHCCCCOOIHRICCIOHHCHRRC = var0;
   }

   @Inject(method = "glDepthFunc", at = @At("HEAD"))
   private static void lunar$depthFunc(int var0, CallbackInfo var1) {
      RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIRHCOCHCRIHRRRCOCOOHOOHRORHHH.OICIHRCORRIORRRRCOIOICCCOOOOOI = var0;
   }

   @Inject(method = "glLineWidth", at = @At("HEAD"))
   private static void lunar$lineWidth(float var0, CallbackInfo var1) {
      RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIRHCOCHCRIHRRRCOCOOHOOHRORHHH.lineWidth = var0;
   }

   @Inject(method = "glBlendFunc", at = @At("HEAD"))
   private static void lunar$blendFunc(int var0, int var1, CallbackInfo var2) {
      HICHRCOHCCRHOHCICOOCHOIHCCHIRI var3 = RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIRHCOCHCRIHRRRCOCOOHOOHRORHHH;
      var3.OCOOORIHHCIRCICRIIORIIRRRHHHOH = var0;
      var3.IORROIRCOCRICCRCCOORHOIIHRRHIO = var0;
      var3.IOHCHICCOIOHHCHICIHICCCRIHRIRR = var1;
      var3.CIOIICCRCICRRROORCIIIIRHRCIIRC = var1;
   }
}
