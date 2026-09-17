package com.llamalad7.mixinextras.expression.impl.flow.postprocessing;

import com.llamalad7.mixinextras.expression.impl.flow.FlowValue;
import com.llamalad7.mixinextras.expression.impl.utils.ExpressionASMUtils;
import com.llamalad7.mixinextras.lib.apache.commons.tuple.Pair;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.MethodNode;

public class NewArrayPostProcessor implements FlowPostProcessor {
   private final Comparator<Pair<FlowValue, Integer>> insnIndexComparator;

   public NewArrayPostProcessor(MethodNode var1) {
      this.insnIndexComparator = Comparator.comparingInt(var1x -> var1.instructions.indexOf(var1x.getLeft().getInsn()));
   }

   @Override
   public void process(FlowValue var1, FlowPostProcessor.OutputSink var2) {
      AbstractInsnNode var3 = var1.getInsn();
      if (var3.getOpcode() == 189 || var3.getOpcode() == 188) {
         List var4 = this.getCreationStores(var1);
         if (var4 == null || var4.isEmpty()) {
            return;
         }

         var2.markAsSynthetic(var1.getInput(0));

         for (FlowValue var6 : var4) {
            var2.markAsSynthetic(var6);
            var2.markAsSynthetic(var6.getInput(1));
         }

         var1.decorate("mixinextras_persistent_arrayCreationInfo", new ArrayCreationInfo((FlowValue)var4.get(var4.size() - 1)));
         var1.setParents(var4.stream().map(var0 -> var0.getInput(2)).toArray(FlowValue[]::new));
      }
   }

   private List<FlowValue> getCreationStores(FlowValue var1) {
      Integer var2 = this.getIntConstant(var1.getInput(0));
      if (var2 == null) {
         return null;
      }

      List var3 = var1.getNext()
         .stream()
         .filter(var0 -> !var0.getLeft().isComplex())
         .sorted(this.insnIndexComparator)
         .map(Pair::getLeft)
         .collect(Collectors.toList());
      if (var3.size() < var2) {
         return null;
      }

      ArrayList var4 = new ArrayList(var2);

      for (int var5 = 0; var5 < var2; var5++) {
         FlowValue var6 = (FlowValue)var3.get(var5);
         if (!this.isStore(var1, var6, var5)) {
            return null;
         }

         var4.add(var6);
      }

      return var4;
   }

   private Integer getIntConstant(FlowValue var1) {
      if (var1.isComplex()) {
         return null;
      }

      Object var2 = ExpressionASMUtils.getConstant(var1.getInsn());
      return !(var2 instanceof Integer) ? null : (Integer)var2;
   }

   private boolean isStore(FlowValue var1, FlowValue var2, int var3) {
      int var4 = var2.getInsn().getOpcode();
      if (var4 >= 79 && var4 <= 86) {
         return var2.getInput(0) != var1 ? false : Objects.equals(var3, this.getIntConstant(var2.getInput(1)));
      } else {
         return false;
      }
   }
}
