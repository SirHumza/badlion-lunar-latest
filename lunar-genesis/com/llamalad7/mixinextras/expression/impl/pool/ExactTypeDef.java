package com.llamalad7.mixinextras.expression.impl.pool;

import org.objectweb.asm.Type;

class ExactTypeDef implements TypeDefinition {
   private final Type type;

   ExactTypeDef(Type var1) {
      this.type = var1;
   }

   @Override
   public boolean matches(Type var1) {
      return this.type.equals(var1);
   }
}
