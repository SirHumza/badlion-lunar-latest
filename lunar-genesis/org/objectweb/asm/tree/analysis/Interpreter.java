package org.objectweb.asm.tree.analysis;

import java.util.List;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.TryCatchBlockNode;

public abstract class Interpreter<V extends Value> {
   protected final int api;

   protected Interpreter(int var1) {
      this.api = var1;
   }

   public abstract V newValue(Type var1);

   public V newParameterValue(boolean var1, int var2, Type var3) {
      return this.newValue(var3);
   }

   public V newReturnTypeValue(Type var1) {
      return this.newValue(var1);
   }

   public V newEmptyValue(int var1) {
      return this.newValue(null);
   }

   public V newExceptionValue(TryCatchBlockNode var1, Frame<V> var2, Type var3) {
      return this.newValue(var3);
   }

   public abstract V newOperation(AbstractInsnNode var1);

   public abstract V copyOperation(AbstractInsnNode var1, V var2);

   public abstract V unaryOperation(AbstractInsnNode var1, V var2);

   public abstract V binaryOperation(AbstractInsnNode var1, V var2, V var3);

   public abstract V ternaryOperation(AbstractInsnNode var1, V var2, V var3, V var4);

   public abstract V naryOperation(AbstractInsnNode var1, List<? extends V> var2);

   public abstract void returnOperation(AbstractInsnNode var1, V var2, V var3);

   public abstract V merge(V var1, V var2);
}
