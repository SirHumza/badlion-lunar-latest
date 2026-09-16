package org.spongepowered.asm.mixin.gen;

import org.objectweb.asm.tree.InsnNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.TypeInsnNode;
import org.spongepowered.asm.mixin.injection.throwables.InvalidInjectionException;
import org.spongepowered.asm.util.Bytecode;

public class AccessorGeneratorObjectFactory extends AccessorGeneratorMethodProxy {
   public AccessorGeneratorObjectFactory(AccessorInfo var1) {
      super(var1, true);
      if (!var1.isStatic()) {
         throw new InvalidInjectionException(var1.getMixin(), String.format("%s is invalid. Factory method must be static.", this.info));
      }
   }

   @Override
   public MethodNode generate() {
      int var1 = this.returnType.getSize();
      int var2 = Bytecode.getArgsSize(this.argTypes) + var1 * 2;
      MethodNode var3 = this.createMethod(var2, var2);
      String var4 = this.info.getTargetClassNode().name;
      var3.instructions.add(new TypeInsnNode(187, var4));
      var3.instructions.add(new InsnNode(var1 == 1 ? 89 : 92));
      Bytecode.loadArgs(this.argTypes, var3.instructions, 0);
      var3.instructions.add(new MethodInsnNode(183, var4, "<init>", this.targetMethod.desc, false));
      var3.instructions.add(new InsnNode(176));
      return var3;
   }
}
