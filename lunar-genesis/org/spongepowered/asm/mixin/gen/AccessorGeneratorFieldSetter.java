package org.spongepowered.asm.mixin.gen;

import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.InsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.VarInsnNode;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.mixin.gen.throwables.InvalidAccessorException;
import org.spongepowered.asm.mixin.transformer.ClassInfo;
import org.spongepowered.asm.service.MixinService;
import org.spongepowered.asm.util.Bytecode;

public class AccessorGeneratorFieldSetter extends AccessorGeneratorField {
   private boolean mutable;

   public AccessorGeneratorFieldSetter(AccessorInfo var1) {
      super(var1);
   }

   @Override
   public void validate() {
      if (Bytecode.hasFlag(this.info.getClassNode(), 512)) {
         throw new InvalidAccessorException(
            this.info, String.format("%s tried to change interface field %s::%s", this.info, this.info.getClassNode().name, this.targetField.name)
         );
      }

      super.validate();
      ClassInfo.Method var1 = this.info.getClassInfo().findMethod(this.info.getMethod());
      this.mutable = var1.isDecoratedMutable();
      if (!this.mutable && Bytecode.hasFlag(this.targetField, 16)) {
         if (this.info.getMixin().getOption(MixinEnvironment.Option.DEBUG_VERBOSE)) {
            MixinService.getService()
               .getLogger("mixin")
               .warn("{} for final field {}::{} is not @Mutable", this.info, this.info.getMixin().getTarget(), this.targetField.name);
         }
      }
   }

   @Override
   public MethodNode generate() {
      if (this.mutable) {
         this.targetField.access &= -17;
      }

      int var1 = this.targetIsStatic ? 0 : 1;
      int var2 = var1 + this.targetType.getSize();
      int var3 = var1 + this.targetType.getSize();
      MethodNode var4 = this.createMethod(var2, var3);
      if (!this.targetIsStatic) {
         var4.instructions.add(new VarInsnNode(25, 0));
      }

      var4.instructions.add(new VarInsnNode(this.targetType.getOpcode(21), var1));
      int var5 = this.targetIsStatic ? 179 : 181;
      var4.instructions.add(new FieldInsnNode(var5, this.info.getTargetClassNode().name, this.targetField.name, this.targetField.desc));
      var4.instructions.add(new InsnNode(177));
      return var4;
   }
}
