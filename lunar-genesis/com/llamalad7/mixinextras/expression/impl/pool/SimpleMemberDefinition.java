package com.llamalad7.mixinextras.expression.impl.pool;

import com.llamalad7.mixinextras.expression.impl.flow.FlowValue;
import com.llamalad7.mixinextras.expression.impl.flow.postprocessing.LMFInfo;
import org.objectweb.asm.Handle;
import org.objectweb.asm.tree.AbstractInsnNode;

public interface SimpleMemberDefinition extends MemberDefinition {
   boolean matches(AbstractInsnNode var1);

   default boolean matches(Handle var1) {
      return false;
   }

   @Override
   default boolean matches(FlowValue var1) {
      LMFInfo var2 = var1.getDecoration("lmfInfo");
      return var2 != null ? this.matches(var2.impl) : this.matches(var1.getInsn());
   }
}
