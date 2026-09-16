package org.spongepowered.asm.mixin.injection.points;

import java.util.Collection;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.InsnNode;
import org.spongepowered.asm.mixin.injection.IInjectionPointContext;
import org.spongepowered.asm.mixin.injection.InjectionPoint;
import org.spongepowered.asm.mixin.injection.struct.InjectionPointData;
import org.spongepowered.asm.mixin.injection.throwables.InvalidInjectionException;
import org.spongepowered.asm.mixin.refmap.IMixinContext;

@InjectionPoint.AtCode("TAIL")
public class BeforeFinalReturn extends InjectionPoint {
   private final IMixinContext context;

   public BeforeFinalReturn(InjectionPointData var1) {
      super(var1);
      this.context = var1.getMixin();
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
      AbstractInsnNode var4 = null;
      int var5 = Type.getReturnType(var1).getOpcode(172);

      for (AbstractInsnNode var7 : var2) {
         if (var7 instanceof InsnNode && var7.getOpcode() == var5) {
            var4 = var7;
         }
      }

      if (var4 == null) {
         throw new InvalidInjectionException(this.context, "TAIL could not locate a valid RETURN in the target method!");
      }

      var3.add(var4);
      return true;
   }
}
