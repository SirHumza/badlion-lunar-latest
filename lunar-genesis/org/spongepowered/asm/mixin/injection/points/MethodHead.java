package org.spongepowered.asm.mixin.injection.points;

import java.util.Collection;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.InsnList;
import org.spongepowered.asm.mixin.injection.InjectionPoint;
import org.spongepowered.asm.mixin.injection.struct.InjectionPointData;

@InjectionPoint.AtCode("HEAD")
public class MethodHead extends InjectionPoint {
   public MethodHead(InjectionPointData var1) {
      super(var1);
   }

   @Override
   public boolean checkPriority(int var1, int var2) {
      return true;
   }

   @Override
   public boolean find(String var1, InsnList var2, Collection<AbstractInsnNode> var3) {
      var3.add(var2.getFirst());
      return true;
   }
}
