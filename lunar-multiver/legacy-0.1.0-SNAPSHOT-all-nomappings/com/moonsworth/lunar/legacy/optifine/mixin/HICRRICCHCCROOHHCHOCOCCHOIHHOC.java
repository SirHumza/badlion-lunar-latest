package com.moonsworth.lunar.legacy.optifine.mixin;

import java.util.Map;
import net.minecraft.entity.EntityLivingBase;
import net.optifine.player.PlayerItemsLayer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
@Mixin(PlayerItemsLayer.class)
public abstract class HICRRICCHCCROOHHCHOCOCCHOIHHOC {
   @Overwrite
   public void renderEquippedItems(EntityLivingBase var1, float var2, float var3) {
   }

   @Overwrite
   public static void register(Map var0) {
   }
}
