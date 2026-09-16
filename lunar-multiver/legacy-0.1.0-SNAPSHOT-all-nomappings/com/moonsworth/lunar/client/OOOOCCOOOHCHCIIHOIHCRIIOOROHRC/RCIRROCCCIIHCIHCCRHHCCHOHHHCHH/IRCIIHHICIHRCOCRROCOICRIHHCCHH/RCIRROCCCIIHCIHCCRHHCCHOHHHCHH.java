package com.moonsworth.lunar.client.OOOOCCOOOHCHCIIHOIHCRIIOOROHRC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.moonsworth.lunar.client.util.RHRRHOHCRCHCCRRHOHHIRCCHOCICHC;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.Map;
import net.minecraft.entity.DataWatcher;
import net.minecraft.entity.Entity;
import net.minecraft.entity.DataWatcher.WatchableObject;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(DataWatcher.class)
public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   @Mutable
   @Final
   @Shadow
   public Map<Integer, WatchableObject> watchedObjects;

   @Inject(method = "<init>(Lnet/minecraft/entity/Entity;)V", at = @At("TAIL"))
   private void lunar$injectFastMap(Entity var1, CallbackInfo var2) {
      this.watchedObjects = new RHRRHOHCRCHCCRRHOHHIRCCHOCICHC(32, var1x -> {
         Int2ObjectOpenHashMap var2x = new Int2ObjectOpenHashMap();
         var1x.accept(var2x);
         this.watchedObjects = var2x;
      });
   }
}
