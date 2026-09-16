package com.llamalad7.mixinextras.expression.impl.flow;

import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;

public class DummyFlowValue extends FlowValue {
   public static final FlowValue UNINITIALIZED = new DummyFlowValue(Type.VOID_TYPE);

   public DummyFlowValue(Type var1) {
      super(var1, null, (FlowValue[])null);
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
   public boolean equals(Object var1) {
      return this == var1 ? true : var1 instanceof DummyFlowValue && this.getType().equals(((DummyFlowValue)var1).getType());
   }

   @Override
   public int hashCode() {
      return this.getType().hashCode();
   }
}
