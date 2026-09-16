package com.llamalad7.mixinextras.versions;

import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.spongepowered.asm.mixin.extensibility.IMixinConfig;
import org.spongepowered.asm.mixin.injection.modify.LocalVariableDiscriminator;
import org.spongepowered.asm.mixin.injection.struct.InjectionInfo;
import org.spongepowered.asm.mixin.injection.struct.Target;
import org.spongepowered.asm.mixin.injection.throwables.InvalidInjectionException;

public class MixinVersionImpl_v0_8_4 extends MixinVersionImpl_v0_8_3 {
   @Override
   public RuntimeException makeInvalidInjectionException(InjectionInfo var1, String var2) {
      return new InvalidInjectionException(var1, var2);
   }

   @Override
   public LocalVariableDiscriminator.Context makeLvtContext(InjectionInfo var1, Type var2, boolean var3, Target var4, AbstractInsnNode var5) {
      return new LocalVariableDiscriminator.Context(var1, var2, var3, var4, var5);
   }

   @Override
   public <T> T getDecoration(IMixinConfig var1, String var2, T var3) {
      return (T)(var1.hasDecoration(var2) ? var1.getDecoration(var2) : var3);
   }
}
