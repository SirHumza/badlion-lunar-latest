package org.spongepowered.asm.mixin.injection.points;

import java.util.Collection;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.JumpInsnNode;
import org.spongepowered.asm.mixin.injection.InjectionPoint;
import org.spongepowered.asm.mixin.injection.struct.InjectionPointData;

@InjectionPoint.AtCode("JUMP")
public class JumpInsnPoint extends InjectionPoint {
   private final int opCode;
   private final int ordinal;

   public JumpInsnPoint(InjectionPointData var1) {
      this.opCode = var1.getOpcode(-1, 153, 154, 155, 156, 157, 158, 159, 160, 161, 162, 163, 164, 165, 166, 167, 168, 198, 199, -1);
      this.ordinal = var1.getOrdinal();
   }

   @Override
   public boolean find(String var1, InsnList var2, Collection<AbstractInsnNode> var3) {
      boolean var4 = false;
      int var5 = 0;

      for (AbstractInsnNode var7 : var2) {
         if (var7 instanceof JumpInsnNode && (this.opCode == -1 || var7.getOpcode() == this.opCode)) {
            if (this.ordinal == -1 || this.ordinal == var5) {
               var3.add(var7);
               var4 = true;
            }

            var5++;
         }
      }

      return var4;
   }
}
