package com.llamalad7.mixinextras.expression.impl.flow;

import com.llamalad7.mixinextras.expression.impl.utils.ExpressionASMUtils;
import java.util.HashSet;
import java.util.Set;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;

public class ComplexFlowValue extends FlowValue {
   private final int size;
   private final Set<FlowValue> sources;
   private final FlowContext context;

   public ComplexFlowValue(int var1, Set<FlowValue> var2, FlowContext var3) {
      super(null, null, (FlowValue[])null);
      this.size = var1;
      this.sources = var2;
      this.context = var3;
   }

   @Override
   public void addChild(FlowValue var1, int var2) {
   }

   @Override
   public void finish() {
   }

   @Override
   public AbstractInsnNode getInsn() {
      throw ComplexDataException.INSTANCE;
   }

   @Override
   public FlowValue getInput(int var1) {
      throw ComplexDataException.INSTANCE;
   }

   @Override
   public int inputCount() {
      return 0;
   }

   @Override
   public void mergeInputs(FlowValue[] var1, FlowContext var2) {
   }

   @Override
   public int getSize() {
      return this.size;
   }

   @Override
   public FlowValue mergeWith(FlowValue var1, FlowContext var2) {
      if (this == var1) {
         return this;
      }

      HashSet var3 = new HashSet<>(this.sources);
      if (var1 instanceof ComplexFlowValue) {
         var3.addAll(((ComplexFlowValue)var1).sources);
      } else {
         var3.add(var1);
      }

      return new ComplexFlowValue(this.size, var3, var2);
   }

   @Override
   public Type getType() {
      return this.sources.stream().map(FlowValue::getType).reduce((var1, var2) -> ExpressionASMUtils.getCommonSupertype(this.context, var1, var2)).get();
   }
}
