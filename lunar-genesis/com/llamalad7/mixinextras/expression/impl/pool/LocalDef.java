package com.llamalad7.mixinextras.expression.impl.pool;

import com.llamalad7.mixinextras.expression.impl.flow.FlowValue;
import com.llamalad7.mixinextras.expression.impl.flow.expansion.InsnExpander;
import com.llamalad7.mixinextras.utils.InjectorUtils;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.VarInsnNode;
import org.spongepowered.asm.mixin.injection.modify.InvalidImplicitDiscriminatorException;
import org.spongepowered.asm.mixin.injection.modify.LocalVariableDiscriminator;
import org.spongepowered.asm.mixin.injection.struct.InjectionInfo;
import org.spongepowered.asm.mixin.injection.struct.Target;
import org.spongepowered.asm.util.Annotations;

public class LocalDef implements MemberDefinition {
   private final LocalVariableDiscriminator discriminator;
   private final InjectionInfo info;
   private final Type targetLocalType;
   private final boolean isArgsOnly;
   private final Target target;

   LocalDef(AnnotationNode var1, InjectionInfo var2, Target var3) {
      this.discriminator = LocalVariableDiscriminator.parse(var1);
      this.info = var2;
      this.targetLocalType = Annotations.getValue(var1, "type", Type.VOID_TYPE);
      this.isArgsOnly = Annotations.getValue(var1, "argsOnly", Boolean.valueOf(false));
      this.target = var3;
   }

   @Override
   public boolean matches(FlowValue var1) {
      AbstractInsnNode var2 = var1.getInsn();
      if (!(var2 instanceof VarInsnNode)) {
         return false;
      }

      VarInsnNode var3 = (VarInsnNode)var2;
      AbstractInsnNode var4 = InsnExpander.getRepresentative(var1);
      if (var3.getOpcode() >= 54 && var3.getOpcode() <= 58) {
         var4 = var4.getNext();
      }

      LocalVariableDiscriminator.Context var5 = InjectorUtils.getOrCreateLocalContext(
         this.target, this.target.addInjectionNode(var4), this.info, this.targetLocalType, this.isArgsOnly
      );
      if (this.discriminator.printLVT()) {
         InjectorUtils.printLocals(this.target, var4, var5, this.discriminator, this.targetLocalType, this.isArgsOnly);
         this.info.addCallbackInvocation(this.info.getMethod());
      }

      int var6;
      try {
         var6 = this.discriminator.findLocal(var5);
      } catch (InvalidImplicitDiscriminatorException var8) {
         return false;
      }

      return var3.var == var6;
   }
}
