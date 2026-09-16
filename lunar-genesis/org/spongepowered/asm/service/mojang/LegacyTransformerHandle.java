package org.spongepowered.asm.service.mojang;

import net.minecraft.launchwrapper.IClassTransformer;
import org.spongepowered.asm.service.IClassProvider;
import org.spongepowered.asm.service.ILegacyClassTransformer;
import org.spongepowered.asm.service.MixinService;

class LegacyTransformerHandle implements ILegacyClassTransformer {
   private final IClassTransformer transformer;

   LegacyTransformerHandle(IClassTransformer var1) {
      this.transformer = var1;
   }

   @Override
   public String getName() {
      return this.transformer.getClass().getName();
   }

   @Override
   public boolean isDelegationExcluded() {
      try {
         IClassProvider var1 = MixinService.getService().getClassProvider();
         Class var2 = var1.findClass("javax.annotation.Resource");
         return this.transformer.getClass().getAnnotation(var2) != null;
      } catch (ClassNotFoundException var3) {
         return false;
      }
   }

   @Override
   public byte[] transformClassBytes(String var1, String var2, byte[] var3) {
      return this.transformer.transform(var1, var2, var3);
   }
}
