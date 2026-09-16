package com.moonsworth.lunar.OCOHORHCROHICRRIHCIHHRRCIHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import net.minecraft.client.renderer.OpenGlHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(OpenGlHelper.class)
public abstract class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   @Inject(method = "glBlendFunc", at = @At("HEAD"), cancellable = true)
   private static void impl$blendFuncSeparate(int var0, int var1, int var2, int var3, CallbackInfo var4) {
      if (com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CHORCRHOORCIOHHIOCORCCCCCIRCCR() && var3 != 771) {
         OpenGlHelper.glBlendFunc(var0, var1, 1, 771);
         var4.cancel();
      }
   }
}
