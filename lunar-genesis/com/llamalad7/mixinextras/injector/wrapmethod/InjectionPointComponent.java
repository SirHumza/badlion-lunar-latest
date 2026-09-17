package com.llamalad7.mixinextras.injector.wrapmethod;

import java.util.Collection;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.InsnList;
import org.spongepowered.asm.mixin.injection.InjectionPoint;

class WrapMethodInjectionPoint extends InjectionPoint {
   @Override
   public boolean checkPriority(int var1, int var2) {
      return true;
   }

   @Override
   public boolean find(String var1, InsnList var2, Collection<AbstractInsnNode> var3) {
      if (var2.size() == 0) {
         throw new UnsupportedOperationException("Cannot use @WrapMethod on an abstract method!");
      } else {
         return var3.add(var2.getFirst());
      }
   }
}
