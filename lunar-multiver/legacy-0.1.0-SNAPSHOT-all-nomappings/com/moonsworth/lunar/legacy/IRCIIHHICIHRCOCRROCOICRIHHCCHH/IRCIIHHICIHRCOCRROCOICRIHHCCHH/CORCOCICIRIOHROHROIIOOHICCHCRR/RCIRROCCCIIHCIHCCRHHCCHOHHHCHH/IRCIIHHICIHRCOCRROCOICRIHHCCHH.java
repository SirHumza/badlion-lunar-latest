package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.legacy.wrapper.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;
import org.lwjgl.opengl.GL13;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(GL13.class)
public class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   @Inject(method = "glActiveTexture", at = @At("HEAD"))
   private static void lunar$activeTexture(int var0, CallbackInfo var1) {
      RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIRHCOCHCRIHRRRCOCOOHOOHRORHHH.OIIOORIROIROCCCHIHHOCICIRRROCR = var0 - 33984;
   }
}
