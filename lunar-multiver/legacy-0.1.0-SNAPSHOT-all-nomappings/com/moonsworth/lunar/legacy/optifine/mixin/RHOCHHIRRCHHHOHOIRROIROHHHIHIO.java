package com.moonsworth.lunar.legacy.optifine.mixin;

import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = Minecraft.class, priority = 9999)
public class RHOCHHIRRCHHHOHOIRROIROHHHIHIO {
   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   @Inject(method = "init$v1_12", at = @At("HEAD"))
   public void impl$init(CallbackInfo var1) {
      try {
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            new com.moonsworth.lunar.legacy.optifine.wrapper.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI()
         );
         System.out.println("[Bridge] Using OptiFine wrapper");
      } catch (ClassNotFoundException var3) {
         System.out.println("[Bridge] Not using OptiFine wrapper");
      }
   }
}
