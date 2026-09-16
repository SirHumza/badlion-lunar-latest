package com.llamalad7.mixinextras.expression.impl.ast.identifiers;

import com.llamalad7.mixinextras.expression.impl.flow.FlowValue;
import com.llamalad7.mixinextras.expression.impl.pool.IdentifierPool;

public class DefinedMemberIdentifier implements MemberIdentifier {
   public final String name;

   public DefinedMemberIdentifier(String var1) {
      this.name = var1;
   }

   @Override
   public boolean matches(IdentifierPool var1, FlowValue var2) {
      return var1.matchesMember(this.name, var2);
   }
}
