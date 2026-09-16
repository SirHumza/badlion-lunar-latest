package org.spongepowered.asm.mixin.injection.points;

import java.util.Collection;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.MethodNode;
import org.spongepowered.asm.logging.ILogger;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.mixin.injection.InjectionPoint;
import org.spongepowered.asm.mixin.injection.code.IInsnListEx;
import org.spongepowered.asm.mixin.injection.struct.InjectionPointData;
import org.spongepowered.asm.mixin.injection.throwables.InvalidInjectionPointException;
import org.spongepowered.asm.service.MixinService;

@InjectionPoint.AtCode("CTOR_HEAD")
public class ConstructorHead extends MethodHead {
   protected final ILogger logger = MixinService.getService().getLogger("mixin");
   private final ConstructorHead.Enforce enforce;
   private final boolean verbose;
   private final MethodNode method;

   public ConstructorHead(InjectionPointData var1) {
      super(var1);
      if (!var1.isUnsafe()) {
         throw new InvalidInjectionPointException(var1.getMixin(), "@At(\"CTOR_HEAD\") requires unsafe=true");
      }

      this.enforce = var1.get("enforce", ConstructorHead.Enforce.DEFAULT);
      this.verbose = var1.getMixin().getOption(MixinEnvironment.Option.DEBUG_VERBOSE);
      this.method = var1.getMethod();
   }

   @Override
   public boolean find(String var1, InsnList var2, Collection<AbstractInsnNode> var3) {
      if (!(var2 instanceof IInsnListEx)) {
         return false;
      }

      IInsnListEx var4 = (IInsnListEx)var2;
      if (!var4.isTargetConstructor()) {
         return super.find(var1, var2, var3);
      }

      AbstractInsnNode var5 = var4.getSpecialNode(IInsnListEx.SpecialNodeType.DELEGATE_CTOR);
      AbstractInsnNode var6 = var5 != null ? var5.getNext() : null;
      if (this.enforce == ConstructorHead.Enforce.POST_DELEGATE) {
         if (var6 == null) {
            if (this.verbose) {
               this.logger
                  .warn(
                     "@At(\"{}\") on {}{} targetting {} failed for enforce=POST_DELEGATE because no delegate was found",
                     this.getAtCode(),
                     this.method.name,
                     this.method.desc,
                     var4
                  );
            }

            return false;
         } else {
            var3.add(var6);
            return true;
         }
      } else {
         IInsnListEx.SpecialNodeType var7 = this.enforce == ConstructorHead.Enforce.PRE_BODY
            ? IInsnListEx.SpecialNodeType.CTOR_BODY
            : IInsnListEx.SpecialNodeType.INITIALISER_INJECTION_POINT;
         AbstractInsnNode var8 = var4.getSpecialNode(var7);
         if (var8 != null) {
            var3.add(var8);
            return true;
         } else if (var6 != null) {
            var3.add(var6);
            return true;
         } else {
            return super.find(var1, var2, var3);
         }
      }
   }

   enum Enforce {
      DEFAULT,
      POST_DELEGATE,
      POST_INIT,
      PRE_BODY;
   }
}
