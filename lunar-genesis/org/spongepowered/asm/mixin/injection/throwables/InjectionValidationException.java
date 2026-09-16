package org.spongepowered.asm.mixin.injection.throwables;

import org.spongepowered.asm.mixin.injection.struct.InjectorGroupInfo;

public class InjectionValidationException extends Exception {
   private final InjectorGroupInfo group;

   public InjectionValidationException(InjectorGroupInfo var1, String var2) {
      super(var2);
      this.group = var1;
   }

   public InjectorGroupInfo getGroup() {
      return this.group;
   }
}
