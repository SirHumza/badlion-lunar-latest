package com.llamalad7.mixinextras.expression.impl.ast.identifiers;

import com.llamalad7.mixinextras.expression.impl.pool.IdentifierPool;
import org.objectweb.asm.Type;

public class ArrayTypeIdentifier implements TypeIdentifier {
   public final int dims;
   public final TypeIdentifier elementType;

   public ArrayTypeIdentifier(int var1, TypeIdentifier var2) {
      this.dims = var1;
      this.elementType = var2;
   }

   @Override
   public boolean matches(IdentifierPool var1, Type var2) {
      return var2.getSort() == 9
         && var2.getDimensions() >= this.dims
         && this.elementType.matches(var1, Type.getType(var2.getDescriptor().substring(this.dims)));
   }
}
