package org.spongepowered.asm.mixin.injection.points;

import java.util.Collection;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.LdcInsnNode;
import org.spongepowered.asm.mixin.injection.InjectionPoint;
import org.spongepowered.asm.mixin.injection.selectors.ITargetSelectorByName;
import org.spongepowered.asm.mixin.injection.struct.InjectionPointData;

@InjectionPoint.AtCode("INVOKE_STRING")
public class BeforeStringInvoke extends BeforeInvoke {
   private final String ldcValue;
   private boolean foundLdc;

   public BeforeStringInvoke(InjectionPointData var1) {
      super(var1);
      this.ldcValue = var1.get("ldc", (String)null);
      if (this.ldcValue == null) {
         throw new IllegalArgumentException(this.getClass().getSimpleName() + " requires named argument \"ldc\" to specify the desired target");
      } else if (!(this.target instanceof ITargetSelectorByName) || !"(Ljava/lang/String;)V".equals(((ITargetSelectorByName)this.target).getDesc())) {
         throw new IllegalArgumentException(this.getClass().getSimpleName() + " requires target method with with signature " + "(Ljava/lang/String;)V");
      }
   }

   @Override
   public boolean find(String var1, InsnList var2, Collection<AbstractInsnNode> var3) {
      this.foundLdc = false;
      return super.find(var1, var2, var3);
   }

   @Override
   protected void inspectInsn(String var1, InsnList var2, AbstractInsnNode var3) {
      if (var3 instanceof LdcInsnNode) {
         LdcInsnNode var4 = (LdcInsnNode)var3;
         if (var4.cst instanceof String && this.ldcValue.equals(var4.cst)) {
            this.log("{}->{} > found a matching LDC with value {}", this.context, this.className, var4.cst);
            this.foundLdc = true;
            return;
         }
      }

      this.foundLdc = false;
   }

   @Override
   protected boolean matchesOrdinal(int var1) {
      this.log("{}->{} > > found LDC \"{}\" = {}", this.context, this.className, this.ldcValue, this.foundLdc);
      return this.foundLdc && super.matchesOrdinal(var1);
   }
}
