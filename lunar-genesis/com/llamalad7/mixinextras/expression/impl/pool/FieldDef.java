package com.llamalad7.mixinextras.expression.impl.pool;

import com.llamalad7.mixinextras.utils.CompatibilityHelper;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.FieldInsnNode;
import org.spongepowered.asm.mixin.injection.selectors.MatchResult;
import org.spongepowered.asm.mixin.injection.struct.InjectionInfo;
import org.spongepowered.asm.mixin.injection.struct.MemberInfo;

class FieldDef implements SimpleMemberDefinition {
   private final MemberInfo memberInfo;

   public FieldDef(String var1, InjectionInfo var2) {
      this.memberInfo = CompatibilityHelper.parseMemberInfo(var1, var2);
   }

   @Override
   public boolean matches(AbstractInsnNode var1) {
      if (!(var1 instanceof FieldInsnNode)) {
         return false;
      }

      FieldInsnNode var2 = (FieldInsnNode)var1;
      return this.memberInfo.matches(var2.owner, var2.name, var2.desc) == MatchResult.EXACT_MATCH;
   }
}
