package com.moonsworth.lunar.v1_7.optifine.mixin;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import net.minecraft.client.renderer.EntityRenderer;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(EntityRenderer.class)
public abstract class HRCHROOHRIHCRCRHRIIROCIRHOIRHH {
   @Redirect(
      method = "Lnet/minecraft/client/renderer/EntityRenderer;getFOVModifier(FZ)F",
      at = @At(value = "INVOKE", target = "Lorg/lwjgl/input/Keyboard;isKeyDown(I)Z")
   )
   public boolean impl$isKeyDown(int var1) {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HHCCIRORCRCHOIOHRRIRRRIORRCRRR().HOCHHHRHHIOOIHCRCRHRROIHCCRRHR().isEnabled()
         ? false
         : Keyboard.isKeyDown(var1);
   }

   @Redirect(
      method = "Lnet/minecraft/client/renderer/EntityRenderer;getFOVModifier(FZ)F",
      at = @At(value = "INVOKE", target = "Lorg/lwjgl/input/Mouse;isButtonDown(I)Z")
   )
   public boolean impl$isMouseDown(int var1) {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HHCCIRORCRCHOIOHRRIRRRIORRCRRR().HOCHHHRHHIOOIHCRCRHRROIHCCRRHR().isEnabled()
         ? false
         : Mouse.isButtonDown(var1);
   }

   @Inject(method = "showLagometer", at = @At("HEAD"), cancellable = true)
   private void lunar$showLagometer(long var1, long var3, CallbackInfo var5) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HHCCIRORCRCHOIOHRRIRRRIORRCRRR().RIRRCRRIRRHHIORCICCOHHRRHOCIIC().isEnabled()) {
         var5.cancel();
      }
   }
}
