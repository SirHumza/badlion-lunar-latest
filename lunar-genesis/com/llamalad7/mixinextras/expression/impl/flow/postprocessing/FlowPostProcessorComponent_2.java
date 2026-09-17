package com.llamalad7.mixinextras.expression.impl.flow.postprocessing;

import com.llamalad7.mixinextras.expression.impl.flow.FlowValue;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.VarInsnNode;
import org.spongepowered.asm.util.Bytecode;

public class CallTaggingPostProcessor implements FlowPostProcessor {
   private final Type currentType;
   private final boolean isStatic;

   public CallTaggingPostProcessor(ClassNode var1, MethodNode var2) {
      this.currentType = Type.getObjectType(var1.name);
      this.isStatic = Bytecode.isStatic(var2);
   }

   @Override
   public void process(FlowValue var1, FlowPostProcessor.OutputSink var2) {
      MethodCallType var3 = this.getType(var1);
      if (var3 != null) {
         var1.decorate("methodCallType", var3);
         if (var3 == MethodCallType.SUPER) {
            var2.markAsSynthetic(var1.getInput(0));
            var1.removeParent(0);
         }
      }
   }

   private MethodCallType getType(FlowValue var1) {
      if (!(var1.getInsn() instanceof MethodInsnNode)) {
         return null;
      }

      MethodInsnNode var2 = (MethodInsnNode)var1.getInsn();
      switch (var2.getOpcode()) {
         case 182:
         case 185:
            return MethodCallType.NORMAL;
         case 183:
            if (var2.name.equals("<init>")) {
               return null;
            } else if (var2.owner.equals(this.currentType.getInternalName())) {
               return MethodCallType.NORMAL;
            } else if (this.isLoadThis(var1.getInput(0))) {
               return MethodCallType.SUPER;
            }
         default:
            return null;
         case 184:
            return MethodCallType.STATIC;
      }
   }

   private boolean isLoadThis(FlowValue var1) {
      if (!this.isStatic && !var1.isComplex() && var1.getInsn().getOpcode() == 25) {
         VarInsnNode var2 = (VarInsnNode)var1.getInsn();
         return var2.var == 0;
      } else {
         return false;
      }
   }
}
