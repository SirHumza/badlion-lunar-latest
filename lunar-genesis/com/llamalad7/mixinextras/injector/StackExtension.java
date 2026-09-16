package com.llamalad7.mixinextras.injector;

import org.objectweb.asm.Type;
import org.objectweb.asm.tree.MethodNode;
import org.spongepowered.asm.mixin.injection.struct.Target;

public class StackExtension {
   private final MethodNode target;

   public StackExtension(Target var1) {
      this.target = var1.method;
   }

   public void receiver(boolean var1) {
      if (!var1) {
         this.target.maxStack++;
      }
   }

   public void capturedArgs(Type[] var1, int var2) {
      for (int var3 = 0; var3 < var2; var3++) {
         this.target.maxStack = this.target.maxStack + var1[var3].getSize();
      }
   }

   public void extra(int var1) {
      this.target.maxStack += var1;
   }

   public void ensureAtLeast(int var1) {
      if (this.target.maxStack < var1) {
         this.target.maxStack = var1;
      }
   }
}
