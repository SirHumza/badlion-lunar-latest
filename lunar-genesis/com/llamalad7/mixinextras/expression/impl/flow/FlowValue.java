package com.llamalad7.mixinextras.expression.impl.flow;

import com.llamalad7.mixinextras.expression.impl.utils.ExpressionASMUtils;
import com.llamalad7.mixinextras.lib.apache.commons.ArrayUtils;
import com.llamalad7.mixinextras.lib.apache.commons.tuple.Pair;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.analysis.Value;

public class FlowValue implements Value {
   private final Type type;
   private AbstractInsnNode insn;
   protected FlowValue[] parents;
   private final Set<Pair<FlowValue, Integer>> next = new HashSet<>(1);
   private boolean nextIsReady;
   private Map<String, Object> decorations = null;

   public FlowValue(Type var1, AbstractInsnNode var2, FlowValue... var3) {
      this.type = var1;
      this.insn = var2;
      this.parents = var3;
   }

   public void addChild(FlowValue var1, int var2) {
      if (!this.nextIsReady) {
         this.next.add(Pair.of(var1, var2));
      }
   }

   public void finish() {
      for (int var1 = 0; var1 < this.parents.length; var1++) {
         this.parents[var1].addChild(this, var1);
      }
   }

   public void onFinished() {
      this.nextIsReady = true;
   }

   private void markNextDirty() {
      this.nextIsReady = false;
      this.next.clear();
   }

   @Override
   public int getSize() {
      return this.type.getSize();
   }

   public Type getType() {
      return this.type;
   }

   public AbstractInsnNode getInsn() {
      return this.insn;
   }

   public Collection<Pair<FlowValue, Integer>> getNext() {
      return this.next;
   }

   public FlowValue getInput(int var1) {
      return this.parents[var1];
   }

   public int inputCount() {
      return this.parents.length;
   }

   public void setInsn(AbstractInsnNode var1) {
      this.insn = var1;
   }

   public void setParents(FlowValue... var1) {
      for (FlowValue var5 : this.parents) {
         var5.markNextDirty();
      }

      this.parents = var1;
   }

   public void setParent(int var1, FlowValue var2) {
      this.parents[var1].markNextDirty();
      this.parents[var1] = var2;
   }

   public void removeParent(int var1) {
      this.setParents(ArrayUtils.remove(this.parents, var1));
   }

   public FlowValue mergeWith(FlowValue var1, FlowContext var2) {
      if (this.equals(var1)) {
         return this;
      } else if (var1 instanceof ComplexFlowValue) {
         return var1.mergeWith(this, var2);
      } else {
         return this.isTypeKnown() && var1.isTypeKnown()
            ? new DummyFlowValue(ExpressionASMUtils.getCommonSupertype(var2, this.getType(), var1.getType()))
            : new ComplexFlowValue(this.getSize(), new HashSet<>(Arrays.asList(this, var1)), var2);
      }
   }

   public void mergeInputs(FlowValue[] var1, FlowContext var2) {
      for (int var3 = 0; var3 < this.parents.length; var3++) {
         this.parents[var3] = this.parents[var3].mergeWith(var1[var3], var2);
      }
   }

   private boolean isTypeKnown() {
      return this.type != null;
   }

   public boolean isComplex() {
      return this.insn == null;
   }

   public <V> void decorate(String var1, V var2) {
      if (this.decorations == null) {
         this.decorations = new HashMap<>();
      }

      this.decorations.put(var1, var2);
   }

   public boolean hasDecoration(String var1) {
      return this.decorations != null && this.decorations.get(var1) != null;
   }

   public <V> V getDecoration(String var1) {
      return (V)(this.decorations == null ? null : this.decorations.get(var1));
   }

   public Map<String, Object> getDecorations() {
      return this.decorations == null ? Collections.emptyMap() : this.decorations;
   }

   public boolean typeMatches(Type var1) {
      return ExpressionASMUtils.isIntLike(var1) && this.getType().equals(ExpressionASMUtils.INTLIKE_TYPE) ? true : this.getType().equals(var1);
   }
}
