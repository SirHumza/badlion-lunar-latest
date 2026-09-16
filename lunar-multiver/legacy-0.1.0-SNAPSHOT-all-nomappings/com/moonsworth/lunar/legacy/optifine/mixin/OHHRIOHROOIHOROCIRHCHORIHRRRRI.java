package com.moonsworth.lunar.legacy.optifine.mixin;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import net.minecraft.client.gui.ScaledResolution;
import net.optifine.Lagometer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Pseudo
@Mixin(Lagometer.class)
public class OHHRIOHROOIHOROCIRHCHORIHRRRRI {
   @Inject(method = "showLagometer", at = @At("HEAD"), cancellable = true)
   private static void lunar$showLagometer(ScaledResolution var0, CallbackInfo var1) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HHCCIRORCRCHOIOHRRIRRRIORRCRRR().RIRRCRRIRRHHIORCICCOHHRRHOCIIC().isEnabled()) {
         var1.cancel();
      }
   }
}
