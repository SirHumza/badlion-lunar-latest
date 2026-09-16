package org.spongepowered.asm.service;

import org.spongepowered.asm.mixin.extensibility.IMixinInfo;
import org.spongepowered.asm.mixin.transformer.ClassInfo;

public interface IFeatureValidator {
   IFeatureValidator ALLOW_ALL = new IFeatureValidator() {
      @Override
      public void validateEnumExtension(IMixinInfo var1, ClassInfo var2) {
      }
   };

   void validateEnumExtension(IMixinInfo var1, ClassInfo var2);
}
