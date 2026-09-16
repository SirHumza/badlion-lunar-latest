package org.objectweb.asm.tree.analysis;

import java.util.Set;
import org.objectweb.asm.tree.AbstractInsnNode;

public class SourceValue implements Value {
   public final int size;
   public final Set<AbstractInsnNode> insns;

   public SourceValue(int var1) {
      this(var1, new SmallSet<>());
   }

   public SourceValue(int var1, AbstractInsnNode var2) {
      this.size = var1;
      this.insns = new SmallSet<>(var2);
   }

   public SourceValue(int var1, Set<AbstractInsnNode> var2) {
      this.size = var1;
      this.insns = var2;
   }

   @Override
   public int getSize() {
      return this.size;
   }

   @Override
   public boolean equals(Object var1) {
      if (!(var1 instanceof SourceValue)) {
         return false;
      }

      SourceValue var2 = (SourceValue)var1;
      return this.size == var2.size && this.insns.equals(var2.insns);
   }

   @Override
   public int hashCode() {
      return this.insns.hashCode();
   }
}
