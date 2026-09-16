package com.llamalad7.mixinextras.sugar.impl.handlers;

import com.llamalad7.mixinextras.sugar.impl.SugarParameter;
import com.llamalad7.mixinextras.utils.ASMUtils;
import com.llamalad7.mixinextras.utils.UniquenessHelper;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.InsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.VarInsnNode;
import org.spongepowered.asm.util.Bytecode;

public class HandlerInfo {
   private final Map<Integer, HandlerInfo.ParameterWrapper> wrappers = new LinkedHashMap<>();

   public void wrapParameter(SugarParameter var1, Type var2, Type var3, BiConsumer<InsnList, Runnable> var4) {
      this.wrappers.put(var1.paramIndex, new HandlerInfo.ParameterWrapper(var2, var3, var4));
   }

   public void transformHandler(ClassNode var1, MethodNode var2) {
      Type[] var3 = Type.getArgumentTypes(var2.desc);
      InsnList var4 = new InsnList();
      if (!Bytecode.isStatic(var2)) {
         var4.add(new VarInsnNode(25, 0));
      }

      int var5 = Bytecode.isStatic(var2) ? 0 : 1;

      for (int var6 = 0; var6 < var3.length; var6++) {
         VarInsnNode var7 = new VarInsnNode(var3[var6].getOpcode(21), var5);
         HandlerInfo.ParameterWrapper var8 = this.wrappers.get(var6);
         if (var8 != null) {
            var3[var6] = var8.type;
            var7.setOpcode(var8.type.getOpcode(21));
            var8.unwrap.accept(var4, () -> var4.add(var7));
         } else {
            var4.add(var7);
         }

         var5 += var3[var6].getSize();
      }

      var4.add(ASMUtils.getInvokeInstruction(var1, var2));
      var4.add(new InsnNode(Type.getReturnType(var2.desc).getOpcode(172)));
      var2.instructions = var4;
      var2.localVariables = null;
      var2.name = UniquenessHelper.getUniqueMethodName(var1, var2.name + "$mixinextras$bridge");
      var2.desc = Type.getMethodDescriptor(Type.getReturnType(var2.desc), var3);
   }

   public void transformGenerics(ArrayList<Type> var1) {
      for (Entry var3 : this.wrappers.entrySet()) {
         Type var4 = ((HandlerInfo.ParameterWrapper)var3.getValue()).generic;
         var1.set((Integer)var3.getKey(), var4);
      }
   }

   private static class ParameterWrapper {
      private final Type type;
      private final Type generic;
      private final BiConsumer<InsnList, Runnable> unwrap;

      private ParameterWrapper(Type var1, Type var2, BiConsumer<InsnList, Runnable> var3) {
         this.type = var1;
         this.generic = var2;
         this.unwrap = var3;
      }
   }
}
