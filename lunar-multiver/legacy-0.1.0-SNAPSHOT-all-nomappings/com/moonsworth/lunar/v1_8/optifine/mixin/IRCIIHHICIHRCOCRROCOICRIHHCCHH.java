package com.moonsworth.lunar.v1_8.optifine.mixin;

import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Minecraft.class)
public class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   @Inject(method = "startGame", at = @At("HEAD"))
   public void impl$startGame(CallbackInfo var1) {
      try {
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            new com.moonsworth.lunar.v1_8.optifine.wrapper.RRCRRCORICCHOHHIRCHIROOHIIOHCO()
         );
         System.out.println("[Bridge] Using OptiFine wrapper");
      } catch (ClassNotFoundException var3) {
         System.out.println("[Bridge] Not using OptiFine wrapper");
      }
   }
}
