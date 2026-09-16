package com.moonsworth.lunar.v1_7.optifine.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import shadersmod.client.Shaders;

@Mixin(Shaders.class)
public interface OCOHORHCROHICRRIHCIHHRRCIHICRI {
   @Accessor("sfb")
   static int sfb() {
      return -1;
   }

   @Accessor("dfb")
   static int dfb() {
      return -1;
   }
}
