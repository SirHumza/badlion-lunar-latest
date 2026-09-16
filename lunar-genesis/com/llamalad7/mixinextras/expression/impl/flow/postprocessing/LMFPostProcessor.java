package com.llamalad7.mixinextras.expression.impl.flow.postprocessing;

import com.llamalad7.mixinextras.expression.impl.flow.FlowValue;
import com.llamalad7.mixinextras.expression.impl.utils.ExpressionASMUtils;
import com.llamalad7.mixinextras.lib.apache.commons.tuple.Pair;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.InvokeDynamicInsnNode;
import org.objectweb.asm.tree.MethodInsnNode;

public class LMFPostProcessor implements FlowPostProcessor {
   private final Type currentType;

   public LMFPostProcessor(ClassNode var1) {
      this.currentType = Type.getObjectType(var1.name);
   }

   @Override
   public void process(FlowValue var1, FlowPostProcessor.OutputSink var2) {
      if (var1.getInsn().getOpcode() == 186) {
         InvokeDynamicInsnNode var3 = (InvokeDynamicInsnNode)var1.getInsn();
         if (var3.bsm.equals(ExpressionASMUtils.LMF_HANDLE) || var3.bsm.equals(ExpressionASMUtils.ALT_LMF_HANDLE)) {
            Handle var4 = (Handle)var3.bsmArgs[1];
            LMFInfo.Type var5 = this.getType(var1, var4);
            if (var5 != null) {
               var1.decorate("lmfInfo", new LMFInfo(var4, var5));
               if (var5 == LMFInfo.Type.BOUND_METHOD) {
                  this.transformReceiver(var1, var2);
               }
            }
         }
      }
   }

   private LMFInfo.Type getType(FlowValue var1, Handle var2) {
      boolean var3 = var1.inputCount() != 0;
      switch (var2.getTag()) {
         case 6:
            return LMFInfo.Type.FREE_METHOD;
         case 7:
            if (!var2.getOwner().equals(this.currentType.getInternalName())) {
               return null;
            }
         case 5:
         case 9:
            return var3 ? LMFInfo.Type.BOUND_METHOD : LMFInfo.Type.FREE_METHOD;
         case 8:
            return var3 ? null : LMFInfo.Type.INSTANTIATION;
         default:
            return null;
      }
   }

   private void transformReceiver(FlowValue var1, FlowPostProcessor.OutputSink var2) {
      FlowValue var3 = var1.getInput(0);

      for (Pair var5 : var3.getNext()) {
         FlowValue var6 = (FlowValue)var5.getLeft();
         if (var6 != var1 && (Integer)var5.getRight() == 0 && var6.inputCount() == 1 && var6.getNext().isEmpty() && var6.getInsn() instanceof MethodInsnNode) {
            MethodInsnNode var7 = (MethodInsnNode)var6.getInsn();
            if (this.isGetClass(var7) || this.isRequireNonNull(var7)) {
               var2.markAsSynthetic(var6);
            }
         }
      }
   }

   private boolean isGetClass(MethodInsnNode var1) {
      return var1.getOpcode() == 182 && var1.owner.equals("java/lang/Object") && var1.name.equals("getClass") && var1.desc.equals("()Ljava/lang/Class;");
   }

   private boolean isRequireNonNull(MethodInsnNode var1) {
      return var1.getOpcode() == 184
         && var1.owner.equals("java/util/Objects")
         && var1.name.equals("requireNonNull")
         && var1.desc.equals("(Ljava/lang/Object;)Ljava/lang/Object;");
   }
}
