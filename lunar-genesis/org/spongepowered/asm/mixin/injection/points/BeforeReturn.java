package org.spongepowered.asm.mixin.injection.points;

import java.util.Collection;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.InsnNode;
import org.spongepowered.asm.mixin.injection.IInjectionPointContext;
import org.spongepowered.asm.mixin.injection.InjectionPoint;
import org.spongepowered.asm.mixin.injection.struct.InjectionPointData;

@InjectionPoint.AtCode("RETURN")
public class BeforeReturn extends InjectionPoint {
   private final int ordinal;

   public BeforeReturn(InjectionPointData var1) {
      super(var1);
      this.ordinal = var1.getOrdinal();
   }

   @Override
   public boolean checkPriority(int var1, int var2) {
      return true;
   }

   @Override
   public InjectionPoint.RestrictTargetLevel getTargetRestriction(IInjectionPointContext var1) {
      return InjectionPoint.RestrictTargetLevel.ALLOW_ALL;
   }

   @Override
   public boolean find(String var1, InsnList var2, Collection<AbstractInsnNode> var3) {
      boolean var4 = false;
      int var5 = Type.getReturnType(var1).getOpcode(172);
      int var6 = 0;

      for (AbstractInsnNode var8 : var2) {
         if (var8 instanceof InsnNode && var8.getOpcode() == var5) {
            if (this.ordinal == -1 || this.ordinal == var6) {
               var3.add(var8);
               var4 = true;
            }

            var6++;
         }
      }

      return var4;
   }
}
