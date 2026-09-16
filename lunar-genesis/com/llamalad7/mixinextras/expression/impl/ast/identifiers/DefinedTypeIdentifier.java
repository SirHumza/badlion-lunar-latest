package com.llamalad7.mixinextras.expression.impl.ast.identifiers;

import com.llamalad7.mixinextras.expression.impl.pool.IdentifierPool;
import org.objectweb.asm.Type;

public class DefinedTypeIdentifier implements TypeIdentifier {
   public final String name;

   public DefinedTypeIdentifier(String var1) {
      this.name = var1;
   }

   @Override
   public boolean matches(IdentifierPool var1, Type var2) {
      return var1.matchesType(this.name, var2);
   }
}
