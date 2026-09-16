package org.spongepowered.asm.mixin.gen;

import java.util.ArrayList;
import org.objectweb.asm.tree.MethodNode;
import org.spongepowered.asm.mixin.gen.throwables.InvalidAccessorException;
import org.spongepowered.asm.service.MixinService;
import org.spongepowered.asm.util.asm.ASM;

public abstract class AccessorGenerator {
   protected final AccessorInfo info;
   protected final boolean targetIsStatic;
   protected final boolean targetIsInterface;

   public AccessorGenerator(AccessorInfo var1, boolean var2) {
      this.info = var1;
      this.targetIsStatic = var2;
      this.targetIsInterface = var1.getTargetClassInfo().isInterface();
   }

   protected void checkModifiers() {
      if (this.info.isStatic() != this.targetIsStatic) {
         if (!this.targetIsStatic) {
            throw new InvalidAccessorException(this.info, String.format("%s is invalid. Accessor method is static but the target is not.", this.info));
         }

         MixinService.getService().getLogger("mixin").info("{} should be static as its target is", this.info);
      }
   }

   protected final MethodNode createMethod(int var1, int var2) {
      MethodNode var3 = this.info.getMethod();
      int var4 = var3.access & -1025;
      if (this.info.isStatic()) {
         var4 |= 4096;
      }

      MethodNode var5 = new MethodNode(ASM.API_VERSION, var4, var3.name, var3.desc, null, null);
      var5.visibleAnnotations = new ArrayList<>();
      var5.visibleAnnotations.add(this.info.getAnnotationNode());
      var5.maxLocals = var1;
      var5.maxStack = var2;
      return var5;
   }

   public void validate() {
   }

   public abstract MethodNode generate();
}
