package org.spongepowered.asm.mixin.injection.points;

import java.util.Arrays;
import java.util.Collection;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.VarInsnNode;
import org.spongepowered.asm.mixin.injection.InjectionPoint;
import org.spongepowered.asm.mixin.injection.struct.InjectionPointData;

@InjectionPoint.AtCode("INVOKE_ASSIGN")
public class AfterInvoke extends BeforeInvoke {
   public static final int[] DEFAULT_SKIP = new int[]{
      89,
      96,
      97,
      98,
      99,
      100,
      101,
      102,
      103,
      104,
      105,
      106,
      107,
      108,
      109,
      110,
      111,
      112,
      113,
      114,
      115,
      116,
      117,
      118,
      119,
      120,
      121,
      122,
      123,
      124,
      125,
      126,
      127,
      128,
      129,
      130,
      131,
      132,
      133,
      134,
      135,
      136,
      137,
      138,
      139,
      140,
      141,
      142,
      143,
      144,
      145,
      146,
      147,
      192,
      193
   };
   private int fuzz = 1;
   private int[] skip = null;

   public AfterInvoke(InjectionPointData var1) {
      super(var1);
      this.fuzz = Math.max(var1.get("fuzz", this.fuzz), 1);
      this.skip = var1.getOpcodeList("skip", DEFAULT_SKIP);
   }

   @Override
   protected boolean addInsn(InsnList var1, Collection<AbstractInsnNode> var2, AbstractInsnNode var3) {
      MethodInsnNode var4 = (MethodInsnNode)var3;
      if (Type.getReturnType(var4.desc) == Type.VOID_TYPE) {
         return false;
      }

      if (this.fuzz > 0) {
         int var5 = var1.indexOf(var3);
         int var6 = Math.min(var1.size(), var5 + this.fuzz + 1);

         for (int var7 = var5 + 1; var7 < var6; var7++) {
            AbstractInsnNode var8 = var1.get(var7);
            if (var8 instanceof VarInsnNode && var3.getOpcode() >= 54) {
               var3 = var8;
               break;
            }

            if (this.skip != null && this.skip.length > 0 && Arrays.binarySearch(this.skip, var8.getOpcode()) < 0) {
               break;
            }
         }
      }

      var3 = InjectionPoint.nextNode(var1, var3);
      var2.add(var3);
      return true;
   }
}
