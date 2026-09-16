package org.spongepowered.tools.obfuscation.mirror;

import org.objectweb.asm.tree.MethodNode;
import org.spongepowered.asm.util.Bytecode;

public class MethodHandleASM extends MethodHandle {
   private final MethodNode method;

   public MethodHandleASM(TypeHandle var1, MethodNode var2) {
      super(var1, var2.name, var2.desc);
      this.method = var2;
   }

   @Override
   public String getJavaSignature() {
      return TypeUtils.getJavaSignature(this.method.desc);
   }

   @Override
   public Bytecode.Visibility getVisibility() {
      return Bytecode.getVisibility(this.method);
   }
}
