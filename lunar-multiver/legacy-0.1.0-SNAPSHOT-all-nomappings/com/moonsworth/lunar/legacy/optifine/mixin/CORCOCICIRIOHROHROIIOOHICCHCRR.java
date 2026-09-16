package com.moonsworth.lunar.legacy.optifine.mixin;

import net.minecraft.client.renderer.EntityRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
@Mixin(EntityRenderer.class)
public abstract class CORCOCICIRIOHROHROIIOOHICCHCRR {
   @ModifyConstant(method = "loadAllVisibleChunks$v1_8", constant = @Constant(intValue = 100))
   private int lunar$flawless$fasterLoading(int var1) {
      return 1;
   }
}
