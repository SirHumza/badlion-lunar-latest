package com.llamalad7.mixinextras.expression.impl.ast.identifiers;

import com.llamalad7.mixinextras.expression.impl.flow.FlowValue;
import com.llamalad7.mixinextras.expression.impl.pool.IdentifierPool;
import org.objectweb.asm.Type;

public class WildcardIdentifier implements MemberIdentifier, TypeIdentifier {
   @Override
   public boolean matches(IdentifierPool var1, FlowValue var2) {
      return true;
   }

   @Override
   public boolean matches(IdentifierPool var1, Type var2) {
      return true;
   }
}
