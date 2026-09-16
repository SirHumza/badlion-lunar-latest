package org.objectweb.asm.tree.analysis;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.objectweb.asm.ConstantDynamic;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.InvokeDynamicInsnNode;
import org.objectweb.asm.tree.LdcInsnNode;
import org.objectweb.asm.tree.MethodInsnNode;

public class SourceInterpreter extends Interpreter<SourceValue> implements Opcodes {
   public SourceInterpreter() {
      super(589824);
      if (this.getClass() != SourceInterpreter.class) {
         throw new IllegalStateException();
      }
   }

   protected SourceInterpreter(int var1) {
      super(var1);
   }

   public SourceValue newValue(Type var1) {
      return var1 == Type.VOID_TYPE ? null : new SourceValue(var1 == null ? 1 : var1.getSize());
   }

   public SourceValue newOperation(AbstractInsnNode var1) {
      int var2;
      switch (var1.getOpcode()) {
         case 9:
         case 10:
         case 14:
         case 15:
            var2 = 2;
            break;
         case 18:
            Object var3 = ((LdcInsnNode)var1).cst;
            if (var3 instanceof Long || var3 instanceof Double) {
               var2 = 2;
            } else if (var3 instanceof ConstantDynamic) {
               var2 = ((ConstantDynamic)var3).getSize();
            } else {
               var2 = 1;
            }
            break;
         case 178:
            var2 = Type.getType(((FieldInsnNode)var1).desc).getSize();
            break;
         default:
            var2 = 1;
      }

      return new SourceValue(var2, var1);
   }

   public SourceValue copyOperation(AbstractInsnNode var1, SourceValue var2) {
      return new SourceValue(var2.getSize(), var1);
   }

   public SourceValue unaryOperation(AbstractInsnNode var1, SourceValue var2) {
      int var3;
      switch (var1.getOpcode()) {
         case 117:
         case 119:
         case 133:
         case 135:
         case 138:
         case 140:
         case 141:
         case 143:
            var3 = 2;
            break;
         case 180:
            var3 = Type.getType(((FieldInsnNode)var1).desc).getSize();
            break;
         default:
            var3 = 1;
      }

      return new SourceValue(var3, var1);
   }

   public SourceValue binaryOperation(AbstractInsnNode var1, SourceValue var2, SourceValue var3) {
      byte var4;
      switch (var1.getOpcode()) {
         case 47:
         case 49:
         case 97:
         case 99:
         case 101:
         case 103:
         case 105:
         case 107:
         case 109:
         case 111:
         case 113:
         case 115:
         case 121:
         case 123:
         case 125:
         case 127:
         case 129:
         case 131:
            var4 = 2;
            break;
         default:
            var4 = 1;
      }

      return new SourceValue(var4, var1);
   }

   public SourceValue ternaryOperation(AbstractInsnNode var1, SourceValue var2, SourceValue var3, SourceValue var4) {
      return new SourceValue(1, var1);
   }

   public SourceValue naryOperation(AbstractInsnNode var1, List<? extends SourceValue> var2) {
      int var4 = var1.getOpcode();
      int var3;
      if (var4 == 197) {
         var3 = 1;
      } else if (var4 == 186) {
         var3 = Type.getReturnType(((InvokeDynamicInsnNode)var1).desc).getSize();
      } else {
         var3 = Type.getReturnType(((MethodInsnNode)var1).desc).getSize();
      }

      return new SourceValue(var3, var1);
   }

   public void returnOperation(AbstractInsnNode var1, SourceValue var2, SourceValue var3) {
   }

   public SourceValue merge(SourceValue var1, SourceValue var2) {
      if (var1.insns instanceof SmallSet && var2.insns instanceof SmallSet) {
         Set var4 = ((SmallSet)var1.insns).union((SmallSet<AbstractInsnNode>)var2.insns);
         return var4 == var1.insns && var1.size == var2.size ? var1 : new SourceValue(Math.min(var1.size, var2.size), var4);
      }

      if (var1.size == var2.size && containsAll(var1.insns, var2.insns)) {
         return var1;
      }

      HashSet var3 = new HashSet();
      var3.addAll(var1.insns);
      var3.addAll(var2.insns);
      return new SourceValue(Math.min(var1.size, var2.size), var3);
   }

   private static <E> boolean containsAll(Set<E> var0, Set<E> var1) {
      return var0.size() < var1.size() ? false : var0.containsAll(var1);
   }
}
