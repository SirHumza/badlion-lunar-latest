package com.llamalad7.mixinextras.expression.impl.pool;

import org.objectweb.asm.tree.AbstractInsnNode;

class ArrayLengthDef implements SimpleMemberDefinition {
   @Override
   public boolean matches(AbstractInsnNode var1) {
      return var1.getOpcode() == 190;
   }
}
