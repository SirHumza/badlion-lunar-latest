package com.llamalad7.mixinextras.expression.impl.flow.postprocessing;

import com.llamalad7.mixinextras.expression.impl.flow.FlowValue;
import com.llamalad7.mixinextras.lib.apache.commons.tuple.Pair;
import java.util.stream.IntStream;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.TypeInsnNode;
import org.spongepowered.asm.util.Bytecode;

public class InstantiationPostProcessor implements FlowPostProcessor {
   @Override
   public void process(FlowValue var1, FlowPostProcessor.OutputSink var2) {
      AbstractInsnNode var3 = var1.getInsn();
      if (var3.getOpcode() == 187) {
         Type var4 = Type.getObjectType(((TypeInsnNode)var3).desc);
         FlowValue var5 = this.findInitCall(var1);
         var1.decorate("instantiationInfo", new InstantiationInfo(var4, var5));
         var2.markAsSynthetic(var5);
         var1.setParents(IntStream.range(1, var5.inputCount()).mapToObj(var5::getInput).toArray(FlowValue[]::new));
      }
   }

   private FlowValue findInitCall(FlowValue var1) {
      for (Pair var3 : var1.getNext()) {
         if ((Integer)var3.getRight() == 0) {
            FlowValue var4 = (FlowValue)var3.getLeft();
            AbstractInsnNode var5 = var4.getInsn();
            if (var5.getOpcode() == 183 && ((MethodInsnNode)var5).name.equals("<init>") && var4.getInput(0) == var1) {
               return var4;
            }
         }
      }

      throw new IllegalStateException("Could not find <init> call for " + Bytecode.describeNode(var1.getInsn()));
   }
}
