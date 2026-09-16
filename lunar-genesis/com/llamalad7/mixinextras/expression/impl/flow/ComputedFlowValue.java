package com.llamalad7.mixinextras.expression.impl.flow;

import java.util.function.Function;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;

public class ComputedFlowValue extends FlowValue {
   private final int size;
   private final Function<FlowValue[], Type> computer;

   public ComputedFlowValue(int var1, Function<FlowValue[], Type> var2, AbstractInsnNode var3, FlowValue... var4) {
      super(null, var3, var4);
      this.size = var1;
      this.computer = var2;
   }

   @Override
   public int getSize() {
      return this.size;
   }

   @Override
   public Type getType() {
      return this.computer.apply(this.parents);
   }
}
