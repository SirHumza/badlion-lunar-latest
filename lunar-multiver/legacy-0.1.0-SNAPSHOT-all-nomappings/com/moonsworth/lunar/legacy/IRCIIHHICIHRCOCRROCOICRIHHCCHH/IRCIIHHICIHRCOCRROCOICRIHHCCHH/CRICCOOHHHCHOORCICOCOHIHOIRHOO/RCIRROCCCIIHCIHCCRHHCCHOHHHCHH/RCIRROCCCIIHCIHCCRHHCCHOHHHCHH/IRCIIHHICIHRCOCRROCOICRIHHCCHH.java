package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import java.util.List;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.network.play.server.SPacketSpawnMob;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;

@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 1)
@Mixin(SPacketSpawnMob.class)
public class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   @Shadow
   public EntityDataManager dataManager;

   @WrapOperation(
      method = {"func_149027_c$v1_7", "func_149027_c$v1_8"},
      at = {
            @At(value = "INVOKE", target = "Lnet/minecraft/network/datasync/EntityDataManager;getAllWatched$v1_7()Ljava/util/List;"),
            @At(value = "INVOKE", target = "Lnet/minecraft/network/datasync/EntityDataManager;getAllWatched$v1_8()Ljava/util/List;")
      }
   )
   private List lunar$fixNPEWhenSpawningMobs(EntityDataManager var1, Operation<List> var2) {
      return this.dataManager == null ? null : (List)var2.call(new Object[]{var1});
   }
}
