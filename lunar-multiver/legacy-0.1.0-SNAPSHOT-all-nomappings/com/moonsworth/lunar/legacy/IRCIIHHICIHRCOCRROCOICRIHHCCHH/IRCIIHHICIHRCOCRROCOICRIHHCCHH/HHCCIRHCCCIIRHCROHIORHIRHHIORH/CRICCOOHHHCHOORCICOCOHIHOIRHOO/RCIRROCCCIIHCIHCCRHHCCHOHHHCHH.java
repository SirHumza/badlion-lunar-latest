package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRICCOOHHHCHOORCICOCOHIHOIRHOO;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.client.Minecraft;
import net.minecraft.client.shader.Framebuffer;
import net.minecraft.client.shader.ShaderGroup;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(ShaderGroup.class)
public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   @WrapOperation(
      method = {"createBindFramebuffers", "resetProjectionMatrix"},
      at = @At(value = "FIELD", target = "Lnet/minecraft/client/shader/ShaderGroup;mainFramebuffer:Lnet/minecraft/client/shader/Framebuffer;")
   )
   private Framebuffer lunar$rewindDimensions(ShaderGroup var1, Operation<Framebuffer> var2) {
      Framebuffer var3 = (Framebuffer)var2.call(new Object[]{var1});
      return var3 == Minecraft.getMinecraft().framebuffer ? Minecraft.getMinecraft().getFramebuffer() : var3;
   }
}
