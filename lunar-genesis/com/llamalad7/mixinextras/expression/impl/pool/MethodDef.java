package com.llamalad7.mixinextras.expression.impl.pool;

import com.llamalad7.mixinextras.utils.CompatibilityHelper;
import org.objectweb.asm.Handle;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.spongepowered.asm.mixin.injection.selectors.MatchResult;
import org.spongepowered.asm.mixin.injection.struct.InjectionInfo;
import org.spongepowered.asm.mixin.injection.struct.MemberInfo;

class MethodDef implements SimpleMemberDefinition {
   private final MemberInfo memberInfo;

   public MethodDef(String var1, InjectionInfo var2) {
      this.memberInfo = CompatibilityHelper.parseMemberInfo(var1, var2);
   }

   @Override
   public boolean matches(AbstractInsnNode var1) {
      if (!(var1 instanceof MethodInsnNode)) {
         return false;
      }

      MethodInsnNode var2 = (MethodInsnNode)var1;
      return this.memberInfo.matches(var2.owner, var2.name, var2.desc) == MatchResult.EXACT_MATCH;
   }

   @Override
   public boolean matches(Handle var1) {
      switch (var1.getTag()) {
         case 5:
         case 6:
         case 7:
         case 9:
            return this.memberInfo.matches(var1.getOwner(), var1.getName(), var1.getDesc()) == MatchResult.EXACT_MATCH;
         case 8:
         default:
            return false;
      }
   }
}
