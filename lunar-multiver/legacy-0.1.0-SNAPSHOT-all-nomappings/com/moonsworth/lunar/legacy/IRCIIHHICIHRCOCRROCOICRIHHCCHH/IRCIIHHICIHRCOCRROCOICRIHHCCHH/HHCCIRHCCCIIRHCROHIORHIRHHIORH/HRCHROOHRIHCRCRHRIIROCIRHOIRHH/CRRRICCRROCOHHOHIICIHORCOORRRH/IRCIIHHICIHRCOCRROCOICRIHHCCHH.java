package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import net.minecraft.client.model.ModelPlayer;
import net.minecraft.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
@Mixin(ModelPlayer.class)
public class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   @Inject(method = "<init>(FZ)V", at = @At("TAIL"))
   private void lunar$constructor(float var1, boolean var2, CallbackInfo var3) {
      ModelPlayer var4 = (ModelPlayer)this;
      if (var4.bipedBody instanceof com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var5
         )
       {
         var5.lunar$attach(var4.bipedBodyWear);
      }

      if (var4.bipedLeftArm instanceof com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var7
         )
       {
         var7.lunar$attach(var4.bipedLeftArmwear);
      }

      if (var4.bipedRightArm instanceof com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var8
         )
       {
         var8.lunar$attach(var4.bipedRightArmwear);
      }

      if (var4.bipedLeftLeg instanceof com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var9
         )
       {
         var9.lunar$attach(var4.bipedLeftLegwear);
      }

      if (var4.bipedRightLeg instanceof com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var10
         )
       {
         var10.lunar$attach(var4.bipedRightLegwear);
      }
   }

   @Inject(method = "render", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/GlStateManager;pushMatrix()V"), cancellable = true)
   private void lunar$render(Entity var1, float var2, float var3, float var4, float var5, float var6, float var7, CallbackInfo var8) {
      var8.cancel();
   }
}
