package com.moonsworth.lunar.legacy.optifine.mixin;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import net.minecraft.world.World;
import net.optifine.CustomColors;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
@Mixin(CustomColors.class)
public abstract class HRCHROOHRIHCRCRHRIIROCIRHOIRHH {
   @Inject(method = "updateLightmap", at = @At("HEAD"), cancellable = true)
   private static void impl$updateLightMap(World var0, float var1, int[] var2, boolean var3, float var4, CallbackInfoReturnable<Boolean> var5) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .HHCRORCOROHHHRRIICHHROOOCHHIIH()
         .RCHCOORHCOOIIRRCRCRHHCIIICIOCC()) {
         var5.setReturnValue(false);
      }
   }
}
