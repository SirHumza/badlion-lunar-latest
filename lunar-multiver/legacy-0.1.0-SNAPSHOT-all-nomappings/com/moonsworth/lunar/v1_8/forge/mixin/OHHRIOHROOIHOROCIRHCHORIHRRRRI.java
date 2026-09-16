package com.moonsworth.lunar.v1_8.forge.mixin;

import net.minecraft.client.renderer.texture.IIconCreator;
import net.minecraft.client.renderer.texture.TextureMap;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TextureMap.class)
public class OHHRIOHROOIHOROCIRHCHORIHRRRRI {
   @Inject(method = "<init>(Ljava/lang/String;Lnet/minecraft/client/renderer/texture/IIconCreator;Z)V", at = @At("TAIL"))
   private void ichor$init(String var1, IIconCreator var2, boolean var3, CallbackInfo var4) {
      ((TextureMap)this).skipFirst = false;
   }
}
