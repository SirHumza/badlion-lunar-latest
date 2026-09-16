package org.spongepowered.asm.mixin.injection.invoke;

import java.util.List;
import org.objectweb.asm.tree.MethodInsnNode;
import org.spongepowered.asm.mixin.injection.InjectionPoint;
import org.spongepowered.asm.mixin.injection.code.Injector;
import org.spongepowered.asm.mixin.injection.struct.InjectionInfo;
import org.spongepowered.asm.mixin.injection.struct.InjectionNodes;
import org.spongepowered.asm.mixin.injection.struct.Target;
import org.spongepowered.asm.mixin.injection.throwables.InvalidInjectionException;

public abstract class InvokeInjector extends Injector {
   public InvokeInjector(InjectionInfo var1, String var2) {
      super(var1, var2);
   }

   @Override
   protected void sanityCheck(Target var1, List<InjectionPoint> var2) {
      super.sanityCheck(var1, var2);
      this.checkTarget(var1);
   }

   protected void checkTarget(Target var1) {
      this.checkTargetModifiers(var1, true);
   }

   @Override
   protected void inject(Target var1, InjectionNodes.InjectionNode var2) {
      if (!(var2.getCurrentTarget() instanceof MethodInsnNode)) {
         throw new InvalidInjectionException(
            this.info, String.format("%s annotation on is targetting a non-method insn in %s in %s", this.annotationType, var1, this)
         );
      }

      this.injectAtInvoke(var1, var2);
   }

   protected abstract void injectAtInvoke(Target var1, InjectionNodes.InjectionNode var2);
}
