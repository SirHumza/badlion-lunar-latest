package org.spongepowered.asm.util.asm;

import org.objectweb.asm.MethodVisitor;
import org.spongepowered.asm.util.Bytecode;

public class MethodVisitorEx extends MethodVisitor {
   public MethodVisitorEx(MethodVisitor var1) {
      super(ASM.API_VERSION, var1);
   }

   public void visitConstant(byte var1) {
      if (var1 > -2 && var1 < 6) {
         this.visitInsn(Bytecode.CONSTANTS_INT[var1 + 1]);
      } else {
         this.visitIntInsn(16, var1);
      }
   }
}
