package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import net.minecraft.entity.Entity;
import net.minecraft.network.play.server.SPacketEntity;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(SPacketEntity.class)
public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   @Inject(method = {"func_149065_a$v1_7", "getEntity$v1_8"}, at = @At("HEAD"), cancellable = true)
   private void lunar$fixNullPointer(World var1, CallbackInfoReturnable<Entity> var2) {
      if (var1 == null) {
         var2.setReturnValue(null);
      }
   }
}
