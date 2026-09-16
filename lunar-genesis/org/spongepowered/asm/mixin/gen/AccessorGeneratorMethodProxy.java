package org.spongepowered.asm.mixin.gen;

import org.objectweb.asm.Type;
import org.objectweb.asm.tree.InsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.VarInsnNode;
import org.spongepowered.asm.util.Bytecode;

public class AccessorGeneratorMethodProxy extends AccessorGenerator {
   protected final MethodNode targetMethod;
   protected final Type[] argTypes;
   protected final Type returnType;

   public AccessorGeneratorMethodProxy(AccessorInfo var1) {
      super(var1, Bytecode.isStatic(var1.getTargetMethod()));
      this.targetMethod = var1.getTargetMethod();
      this.argTypes = var1.getArgTypes();
      this.returnType = var1.getReturnType();
      this.checkModifiers();
   }

   protected AccessorGeneratorMethodProxy(AccessorInfo var1, boolean var2) {
      super(var1, var2);
      this.targetMethod = var1.getTargetMethod();
      this.argTypes = var1.getArgTypes();
      this.returnType = var1.getReturnType();
   }

   @Override
   public MethodNode generate() {
      int var1 = Bytecode.getArgsSize(this.argTypes) + this.returnType.getSize() + (this.targetIsStatic ? 0 : 1);
      MethodNode var2 = this.createMethod(var1, var1);
      if (!this.targetIsStatic) {
         var2.instructions.add(new VarInsnNode(25, 0));
      }

      Bytecode.loadArgs(this.argTypes, var2.instructions, this.info.isStatic ? 0 : 1);
      var2.instructions.add(Bytecode.invokeMethod(this.info.getTargetClassNode(), this.targetMethod, this.info.getMixin()));
      var2.instructions.add(new InsnNode(this.returnType.getOpcode(172)));
      return var2;
   }
}
