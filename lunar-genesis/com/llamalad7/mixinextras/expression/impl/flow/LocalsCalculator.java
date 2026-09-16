package com.llamalad7.mixinextras.expression.impl.flow;

import com.llamalad7.mixinextras.expression.impl.utils.ExpressionASMUtils;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.LocalVariableNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.VarInsnNode;
import org.objectweb.asm.tree.analysis.Analyzer;
import org.objectweb.asm.tree.analysis.AnalyzerException;
import org.objectweb.asm.tree.analysis.BasicValue;
import org.objectweb.asm.tree.analysis.Interpreter;
import org.spongepowered.asm.util.asm.ASM;

class LocalsCalculator extends Interpreter<BasicValue> {
   private final Map<VarInsnNode, Object> results = new IdentityHashMap<>();
   private final MethodNode methodNode;
   private final FlowContext context;

   public static Map<VarInsnNode, Type> getLocalTypes(ClassNode var0, MethodNode var1, FlowContext var2) {
      LocalsCalculator var3 = new LocalsCalculator(var1, var2);

      try {
         new Analyzer<>(var3).analyze(var0.name, var1);
      } catch (AnalyzerException var6) {
         throw new RuntimeException(String.format("Failed to calculate locals for %s::%s%s: ", var0.name, var1.name, var1.desc), var6);
      }

      for (Entry var5 : var3.results.entrySet()) {
         if (var5.getValue() instanceof Set) {
            var5.setValue(((Set)var5.getValue()).stream().reduce((var1x, var2x) -> ExpressionASMUtils.getCommonSupertype(var2, var1x, var2x)).get());
         }
      }

      return var3.results;
   }

   private LocalsCalculator(MethodNode var1, FlowContext var2) {
      super(ASM.API_VERSION);
      this.methodNode = var1;
      this.context = var2;
   }

   public BasicValue newValue(Type var1) {
      if (var1 == Type.VOID_TYPE) {
         return null;
      }

      if (var1 == null) {
         var1 = ExpressionASMUtils.BOTTOM_TYPE;
      }

      return new BasicValue(var1);
   }

   public BasicValue newOperation(AbstractInsnNode var1) {
      return new BasicValue(ExpressionASMUtils.getNewType(var1));
   }

   public BasicValue copyOperation(AbstractInsnNode var1, BasicValue var2) {
      if (var1.getOpcode() >= 21 && var1.getOpcode() <= 25) {
         VarInsnNode var3 = (VarInsnNode)var1;
         this.recordType(var3, var2.getType());
      }

      return var2;
   }

   public BasicValue unaryOperation(AbstractInsnNode var1, BasicValue var2) {
      return new BasicValue(ExpressionASMUtils.getUnaryType(var1));
   }

   public BasicValue binaryOperation(AbstractInsnNode var1, BasicValue var2, BasicValue var3) {
      return new BasicValue(ExpressionASMUtils.getBinaryType(var1, var2.getType()));
   }

   public BasicValue ternaryOperation(AbstractInsnNode var1, BasicValue var2, BasicValue var3, BasicValue var4) {
      return null;
   }

   public BasicValue naryOperation(AbstractInsnNode var1, List<? extends BasicValue> var2) {
      return new BasicValue(ExpressionASMUtils.getNaryType(var1));
   }

   public void returnOperation(AbstractInsnNode var1, BasicValue var2, BasicValue var3) {
   }

   public BasicValue merge(BasicValue var1, BasicValue var2) {
      return var1.equals(var2) ? var1 : new BasicValue(ExpressionASMUtils.getCommonSupertype(this.context, var1.getType(), var2.getType()));
   }

   private void recordType(VarInsnNode var1, Type var2) {
      Object var3 = this.results.get(var1);
      if (!(var3 instanceof Type)) {
         if (var3 instanceof Set) {
            ((Set)var3).add(var2);
         }

         LocalVariableNode var4 = this.getLocalVariableAt(var1);
         this.results.put(var1, var4 != null ? Type.getType(var4.desc) : new HashSet<>(Collections.singleton(var2)));
      }
   }

   private LocalVariableNode getLocalVariableAt(VarInsnNode var1) {
      int var2 = this.methodNode.instructions.indexOf(var1);
      int var3 = var1.var;
      if (this.methodNode.localVariables != null && !this.methodNode.localVariables.isEmpty()) {
         LocalVariableNode var4 = null;

         for (LocalVariableNode var6 : this.methodNode.localVariables) {
            if (var6.index == var3 && var6.desc != null && this.isOpcodeInRange(this.methodNode.instructions, var6, var2)) {
               var4 = var6;
            }
         }

         return var4;
      } else {
         return null;
      }
   }

   private boolean isOpcodeInRange(InsnList var1, LocalVariableNode var2, int var3) {
      return var1.indexOf(var2.start) <= var3 && var1.indexOf(var2.end) > var3;
   }
}
