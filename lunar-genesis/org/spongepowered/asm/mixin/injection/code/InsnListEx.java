package org.spongepowered.asm.mixin.injection.code;

import java.util.HashMap;
import java.util.Map;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.spongepowered.asm.mixin.injection.struct.Constructor;
import org.spongepowered.asm.mixin.injection.struct.IChainedDecoration;
import org.spongepowered.asm.mixin.injection.struct.Target;
import org.spongepowered.asm.mixin.transformer.struct.Initialiser;
import org.spongepowered.asm.util.Bytecode;

public class InsnListEx extends InsnListReadOnly implements IInsnListEx {
   protected final Target target;
   private Map<String, Object> decorations;

   public InsnListEx(Target var1) {
      super(var1.insns);
      this.target = var1;
   }

   @Override
   public String toString() {
      return this.target.toString();
   }

   @Override
   public String getTargetName() {
      return this.target.getName();
   }

   @Override
   public String getTargetDesc() {
      return this.target.getDesc();
   }

   @Override
   public String getTargetSignature() {
      return this.target.getSignature();
   }

   @Override
   public int getTargetAccess() {
      return this.target.method.access;
   }

   @Override
   public boolean isTargetStatic() {
      return this.target.isStatic;
   }

   @Override
   public boolean isTargetConstructor() {
      return this.target instanceof Constructor;
   }

   @Override
   public boolean isTargetStaticInitialiser() {
      return "<clinit>".equals(this.target.getName());
   }

   @Override
   public AbstractInsnNode getSpecialNode(IInsnListEx.SpecialNodeType var1) {
      switch (var1) {
         case DELEGATE_CTOR:
            if (this.target instanceof Constructor) {
               Bytecode.DelegateInitialiser var5 = ((Constructor)this.target).findDelegateInitNode();
               if (var5.isPresent && this.contains(var5.insn)) {
                  return var5.insn;
               }
            }

            return null;
         case INITIALISER_INJECTION_POINT:
            if (this.target instanceof Constructor) {
               Initialiser.InjectionMode var4 = Initialiser.InjectionMode.DEFAULT;
               AbstractInsnNode var3 = ((Constructor)this.target).findInitialiserInjectionPoint(var4);
               if (this.contains(var3)) {
                  return var3;
               }
            }

            return null;
         case CTOR_BODY:
            if (this.target instanceof Constructor) {
               AbstractInsnNode var2 = ((Constructor)this.target).findFirstBodyInsn();
               if (this.contains(var2)) {
                  return var2;
               }
            }

            return null;
         default:
            return null;
      }
   }

   public <V> InsnListEx decorate(String var1, V var2) {
      if (this.decorations == null) {
         this.decorations = new HashMap<>();
      }

      if (var2 instanceof IChainedDecoration && this.decorations.containsKey(var1)) {
         Object var3 = this.decorations.get(var1);
         if (var3.getClass().equals(var2.getClass())) {
            ((IChainedDecoration)var2).replace(var3);
         }
      }

      this.decorations.put(var1, var2);
      return this;
   }

   public InsnListEx undecorate(String var1) {
      if (this.decorations != null) {
         this.decorations.remove(var1);
      }

      return this;
   }

   public InsnListEx undecorate() {
      this.decorations = null;
      return this;
   }

   @Override
   public boolean hasDecoration(String var1) {
      return this.decorations != null && this.decorations.get(var1) != null;
   }

   @Override
   public <V> V getDecoration(String var1) {
      return (V)(this.decorations == null ? null : this.decorations.get(var1));
   }

   @Override
   public <V> V getDecoration(String var1, V var2) {
      Object var3 = this.decorations == null ? null : this.decorations.get(var1);
      return (V)(var3 != null ? var3 : var2);
   }
}
