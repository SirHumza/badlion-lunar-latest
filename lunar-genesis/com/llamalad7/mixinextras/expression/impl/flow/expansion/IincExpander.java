package com.llamalad7.mixinextras.expression.impl.flow.expansion;

import com.llamalad7.mixinextras.expression.impl.flow.FlowValue;
import com.llamalad7.mixinextras.expression.impl.flow.postprocessing.FlowPostProcessor;
import com.llamalad7.mixinextras.expression.impl.utils.ExpressionASMUtils;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.IincInsnNode;
import org.objectweb.asm.tree.InsnNode;
import org.objectweb.asm.tree.VarInsnNode;
import org.spongepowered.asm.mixin.injection.struct.InjectionNodes;
import org.spongepowered.asm.mixin.injection.struct.Target;

public class IincExpander extends InsnExpander {
   @Override
   public void process(FlowValue var1, FlowPostProcessor.OutputSink var2) {
      if (var1.getInsn().getOpcode() == 132) {
         IincInsnNode var3 = (IincInsnNode)var1.getInsn();
         FlowValue var4 = new FlowValue(Type.INT_TYPE, new VarInsnNode(21, var3.var));
         this.registerComponent(var4, IincExpander.Component.LOAD, var3);
         FlowValue var5 = new FlowValue(Type.INT_TYPE, ExpressionASMUtils.pushInt(var3.incr));
         this.registerComponent(var5, IincExpander.Component.CST, var3);
         FlowValue var6 = new FlowValue(Type.INT_TYPE, new InsnNode(96), var4, var5);
         this.registerComponent(var6, IincExpander.Component.ADD, var3);
         var1.setInsn(new VarInsnNode(54, var3.var));
         var1.setParents(var6);
         this.registerComponent(var1, IincExpander.Component.STORE, var3);
         var2.registerFlow(var4, var5, var6);
      }
   }

   @Override
   public void expand(Target var1, InjectionNodes.InjectionNode var2, InsnExpander.Expansion var3) {
      IincInsnNode var4 = (IincInsnNode)var2.getCurrentTarget();
      var1.method.maxStack += 2;
      this.expandInsn(
         var1,
         var2,
         var3.registerInsn(IincExpander.Component.LOAD, new VarInsnNode(21, var4.var)),
         var3.registerInsn(IincExpander.Component.CST, ExpressionASMUtils.pushInt(var4.incr)),
         var3.registerInsn(IincExpander.Component.ADD, new InsnNode(96)),
         var3.registerInsn(IincExpander.Component.STORE, new VarInsnNode(54, var4.var))
      );
   }

   private enum Component implements InsnExpander.InsnComponent {
      LOAD,
      CST,
      ADD,
      STORE;
   }
}
