package com.llamalad7.mixinextras.expression.impl.flow.utils;

import com.llamalad7.mixinextras.expression.impl.flow.FlowValue;
import com.llamalad7.mixinextras.expression.impl.flow.expansion.InsnExpander;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.spongepowered.asm.mixin.injection.struct.InjectionNodes;
import org.spongepowered.asm.mixin.injection.struct.Target;

public class InsnReference {
   private AbstractInsnNode insn;

   public InsnReference(FlowValue var1) {
      if (var1.isComplex()) {
         throw new IllegalArgumentException("Cannot create a reference to a complex flow");
      }

      if (InsnExpander.hasExpansion(var1)) {
         InsnExpander.addExpansionStep(var1, var1x -> this.insn = var1x.getCurrentTarget());
      } else {
         this.insn = var1.getInsn();
      }
   }

   public InjectionNodes.InjectionNode getNode(Target var1) {
      if (this.insn == null) {
         throw new UnsupportedOperationException("This flow value has not yet been expanded!");
      } else {
         InjectionNodes.InjectionNode var2 = var1.getInjectionNode(this.insn);
         if (var2 != null) {
            return var2;
         } else if (!var1.insns.contains(this.insn)) {
            throw new IllegalArgumentException("This insn is not present in " + var1);
         } else {
            return var1.addInjectionNode(this.insn);
         }
      }
   }
}
