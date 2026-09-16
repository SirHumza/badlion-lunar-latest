package org.spongepowered.asm.mixin.injection.struct;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.spongepowered.asm.util.Bytecode;

public class InjectionNodes extends ArrayList<InjectionNodes.InjectionNode> {
   public InjectionNodes.InjectionNode add(AbstractInsnNode var1) {
      InjectionNodes.InjectionNode var2 = this.get(var1);
      if (var2 == null) {
         var2 = new InjectionNodes.InjectionNode(var1);
         this.add(var2);
      }

      return var2;
   }

   public InjectionNodes.InjectionNode get(AbstractInsnNode var1) {
      for (InjectionNodes.InjectionNode var3 : this) {
         if (var3.matches(var1)) {
            return var3;
         }
      }

      return null;
   }

   public boolean contains(AbstractInsnNode var1) {
      return this.get(var1) != null;
   }

   public InjectionNodes.InjectionNode replace(AbstractInsnNode var1, AbstractInsnNode var2) {
      InjectionNodes.InjectionNode var3 = this.get(var1);
      if (var3 != null) {
         var3.replace(var2);
      }

      return var3;
   }

   public InjectionNodes.InjectionNode remove(AbstractInsnNode var1) {
      InjectionNodes.InjectionNode var2 = this.get(var1);
      if (var2 != null) {
         var2.remove();
      }

      return var2;
   }

   public static class InjectionNode implements Comparable<InjectionNodes.InjectionNode> {
      private static int nextId = 0;
      private final int id;
      private final AbstractInsnNode originalTarget;
      private AbstractInsnNode currentTarget;
      private Map<String, Object> decorations;

      public InjectionNode(AbstractInsnNode var1) {
         this.currentTarget = this.originalTarget = var1;
         this.id = nextId++;
      }

      public int getId() {
         return this.id;
      }

      public AbstractInsnNode getOriginalTarget() {
         return this.originalTarget;
      }

      public AbstractInsnNode getCurrentTarget() {
         return this.currentTarget;
      }

      public InjectionNodes.InjectionNode replace(AbstractInsnNode var1) {
         this.currentTarget = var1;
         return this;
      }

      public InjectionNodes.InjectionNode remove() {
         this.currentTarget = null;
         return this;
      }

      public boolean matches(AbstractInsnNode var1) {
         return this.originalTarget == var1 || this.currentTarget == var1;
      }

      public boolean isReplaced() {
         return this.originalTarget != this.currentTarget;
      }

      public boolean isRemoved() {
         return this.currentTarget == null;
      }

      public <V> InjectionNodes.InjectionNode decorate(String var1, V var2) {
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

      public boolean hasDecoration(String var1) {
         return this.decorations != null && this.decorations.get(var1) != null;
      }

      public <V> V getDecoration(String var1) {
         return (V)(this.decorations == null ? null : this.decorations.get(var1));
      }

      public <V> V getDecoration(String var1, V var2) {
         Object var3 = this.decorations == null ? null : this.decorations.get(var1);
         return (V)(var3 != null ? var3 : var2);
      }

      public int compareTo(InjectionNodes.InjectionNode var1) {
         return var1 == null ? Integer.MAX_VALUE : Integer.compare(this.hashCode(), var1.hashCode());
      }

      @Override
      public String toString() {
         return String.format("InjectionNode[%s]", Bytecode.describeNode(this.currentTarget, false));
      }
   }
}
