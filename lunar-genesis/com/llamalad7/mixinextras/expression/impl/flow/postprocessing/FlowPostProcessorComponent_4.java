package com.llamalad7.mixinextras.expression.impl.flow.postprocessing;

import com.llamalad7.mixinextras.expression.impl.flow.FlowValue;
import com.llamalad7.mixinextras.lib.apache.commons.tuple.Pair;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.MethodInsnNode;

public class StringConcatPostProcessor implements FlowPostProcessor {
   private static final String STRING_BUILDER = Type.getInternalName(StringBuilder.class);

   @Override
   public void process(FlowValue var1, FlowPostProcessor.OutputSink var2) {
      FlowValue var3 = this.getFirstAppend(var1);
      if (var3 != null) {
         ArrayList var4 = new ArrayList();
         FlowValue var5 = var3;

         while (true) {
            var4.add(var5);
            Collection var7 = var5.getNext();
            if (var7.size() != 1) {
               return;
            }

            Pair var8 = (Pair)var7.iterator().next();
            if (!this.isAppendCall(var8)) {
               if (this.isToStringCall(var8)) {
                  FlowValue var6 = (FlowValue)var8.getLeft();
                  if (var4.size() < 2) {
                     return;
                  }

                  this.decorateConcat(var4, var6);
                  return;
               }

               return;
            }

            var5 = (FlowValue)var8.getLeft();
         }
      }
   }

   private void decorateConcat(List<FlowValue> var1, FlowValue var2) {
      FlowValue var3 = ((FlowValue)var1.get(0)).getInput(1);

      for (int var4 = 1; var4 < var1.size() - 1; var4++) {
         ((FlowValue)var1.get(var4)).decorate("stringConcatInfo", new StringConcatInfo(var4 == 1, true, var3, var2));
      }

      var2.decorate("stringConcatInfo", new StringConcatInfo(var1.size() == 2, false, var3, var2));
   }

   private FlowValue getFirstAppend(FlowValue var1) {
      InstantiationInfo var2 = var1.getDecoration("instantiationInfo");
      if (var2 == null || !var2.type.getInternalName().equals(STRING_BUILDER)) {
         return null;
      }

      if (!this.isEmptyInit(var2.initCall)) {
         return null;
      }

      if (var1.getNext().size() != 1) {
         return null;
      }

      Pair var3 = var1.getNext().iterator().next();
      return this.isAppendCall(var3) ? (FlowValue)var3.getLeft() : null;
   }

   private boolean isEmptyInit(FlowValue var1) {
      return ((MethodInsnNode)var1.getInsn()).desc.equals("()V");
   }

   private boolean isAppendCall(Pair<FlowValue, Integer> var1) {
      if ((Integer)var1.getRight() != 0) {
         return false;
      }

      AbstractInsnNode var2 = ((FlowValue)var1.getLeft()).getInsn();
      if (var2.getOpcode() != 182) {
         return false;
      }

      MethodInsnNode var3 = (MethodInsnNode)var2;
      return var3.owner.equals(STRING_BUILDER) && var3.name.equals("append") && Type.getArgumentTypes(var3.desc).length == 1;
   }

   private boolean isToStringCall(Pair<FlowValue, Integer> var1) {
      if ((Integer)var1.getRight() != 0) {
         return false;
      }

      AbstractInsnNode var2 = ((FlowValue)var1.getLeft()).getInsn();
      if (var2.getOpcode() != 182) {
         return false;
      }

      MethodInsnNode var3 = (MethodInsnNode)var2;
      return var3.owner.equals(STRING_BUILDER) && var3.name.equals("toString");
   }
}
