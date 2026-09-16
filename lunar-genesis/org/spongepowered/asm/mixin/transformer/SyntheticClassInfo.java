package org.spongepowered.asm.mixin.transformer;

import org.spongepowered.asm.mixin.extensibility.IMixinInfo;
import org.spongepowered.asm.service.ISyntheticClassInfo;
import org.spongepowered.include.com.google.common.base.Preconditions;

public abstract class SyntheticClassInfo implements ISyntheticClassInfo {
   protected final IMixinInfo mixin;
   protected final String name;

   protected SyntheticClassInfo(IMixinInfo var1, String var2) {
      Preconditions.checkNotNull(var1, "parent");
      Preconditions.checkNotNull(var2, "name");
      this.mixin = var1;
      this.name = var2.replace('.', '/');
   }

   @Override
   public final IMixinInfo getMixin() {
      return this.mixin;
   }

   @Override
   public String getName() {
      return this.name;
   }

   @Override
   public String getClassName() {
      return this.name.replace('/', '.');
   }
}
