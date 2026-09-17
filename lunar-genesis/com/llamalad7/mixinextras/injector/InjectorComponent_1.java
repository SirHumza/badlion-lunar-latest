package com.llamalad7.mixinextras.injector;

import com.llamalad7.mixinextras.expression.impl.flow.expansion.InsnExpander;
import com.llamalad7.mixinextras.expression.impl.flow.postprocessing.ArrayCreationInfo;
import com.llamalad7.mixinextras.expression.impl.utils.ComparisonInfo;
import com.llamalad7.mixinextras.utils.ASMUtils;
import com.llamalad7.mixinextras.utils.CompatibilityHelper;
import com.llamalad7.mixinextras.utils.InjectorUtils;
import com.llamalad7.mixinextras.utils.PreviousInjectorInsns;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.InsnNode;
import org.objectweb.asm.tree.JumpInsnNode;
import org.objectweb.asm.tree.LabelNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.TypeInsnNode;
import org.objectweb.asm.tree.VarInsnNode;
import org.spongepowered.asm.mixin.injection.code.Injector;
import org.spongepowered.asm.mixin.injection.struct.InjectionInfo;
import org.spongepowered.asm.mixin.injection.struct.InjectionNodes;
import org.spongepowered.asm.mixin.injection.struct.Target;
import org.spongepowered.asm.util.Bytecode;

public class ModifyExpressionValueInjector extends Injector {
   public ModifyExpressionValueInjector(InjectionInfo var1) {
      super(var1, "@ModifyExpressionValue");
   }

   @Override
   protected void inject(Target var1, InjectionNodes.InjectionNode var2) {
      var2 = InsnExpander.doExpansion(var2, var1, this.info);
      this.checkTargetReturnsAValue(var1, var2);
      this.checkTargetModifiers(var1, false);
      StackExtension var3 = new StackExtension(var1);
      Type var4 = this.getReturnType(var2);
      var4 = this.cleanIntLikeType(var4);
      AbstractInsnNode var5 = this.getValueNode(var2, var4);
      boolean var6 = false;
      if (var5 instanceof TypeInsnNode && var5.getOpcode() == 187) {
         if (!InjectorUtils.isDupedNew(var2)) {
            var1.insns.insert(var5, new InsnNode(89));
            var3.extra(1);
            var2.decorate("mixinextras_newIsDuped", true);
            var6 = true;
         }

         var5 = ASMUtils.findInitNodeFor(var1, (TypeInsnNode)var5);
      }

      ModifyExpressionValueInjector.TargetInfo var7 = new ModifyExpressionValueInjector.TargetInfo(var1, var2);
      this.injectValueModifier(var1, var5, var4, var7, var6, var3);
   }

   private void checkTargetReturnsAValue(Target var1, InjectionNodes.InjectionNode var2) {
      Type var3 = this.getReturnType(var2);
      if (var3 == Type.VOID_TYPE) {
         throw CompatibilityHelper.makeInvalidInjectionException(
            this.info, String.format("%s annotation is targeting an instruction with a return type of 'void' in %s in %s", this.annotationType, var1, this)
         );
      }

      if (var3 == null) {
         throw CompatibilityHelper.makeInvalidInjectionException(
            this.info, String.format("%s annotation is targeting an invalid insn in %s in %s", this.annotationType, var1, this)
         );
      }
   }

   private Type cleanIntLikeType(Type var1) {
      Type var2 = IntLikeBehaviour.MatchReturnType.INSTANCE
         .transform(this.info, Type.getMethodType(var1, var1), Type.getMethodType(this.returnType, this.methodArgs));
      return var2.getReturnType();
   }

   private AbstractInsnNode getValueNode(InjectionNodes.InjectionNode var1, Type var2) {
      AbstractInsnNode var3 = InjectorUtils.findCoerce(var1, var2);
      return var3 != null ? var3 : var1.getCurrentTarget();
   }

   private void injectValueModifier(
      Target var1, AbstractInsnNode var2, Type var3, ModifyExpressionValueInjector.TargetInfo var4, boolean var5, StackExtension var6
   ) {
      InsnList var7 = new InsnList();
      var4.invokeHandler(var3, var7, var6);
      if (var5) {
         var7.add(new InsnNode(87));
      }

      var1.insns.insert(var4.getInsertionPoint(var2), var7);
   }

   private void invokeHandler(Type var1, Target var2, InsnList var3, StackExtension var4) {
      Injector.InjectorData var5 = new Injector.InjectorData(var2, "expression value modifier");
      this.validateParams(var5, var1, var1);
      if (!this.isStatic) {
         var3.add(new VarInsnNode(25, 0));
         if (var1.getSize() == 2) {
            var4.extra(1);
            var3.add(new InsnNode(91));
            var3.add(new InsnNode(87));
         } else {
            var3.add(new InsnNode(95));
         }
      }

      if (var5.captureTargetArgs > 0) {
         this.pushArgs(var2.arguments, var3, var2.getArgIndices(), 0, var5.captureTargetArgs);
      }

      var4.receiver(this.isStatic);
      var4.capturedArgs(var2.arguments, var5.captureTargetArgs);
      this.invokeHandler(var3);
      InjectorUtils.coerceReturnType(var5, var3, var1);
   }

   private Type getReturnType(InjectionNodes.InjectionNode var1) {
      if (InjectorUtils.hasInjectorSpecificDecoration(var1, this.info, "mixinextras_isStringConcatExpression")) {
         return Type.getType(String.class);
      }

      if (var1.hasDecoration("mixinextras_simpleExpressionType")) {
         return var1.getDecoration("mixinextras_simpleExpressionType");
      }

      AbstractInsnNode var2 = var1.getOriginalTarget();
      if (var2 instanceof MethodInsnNode) {
         MethodInsnNode var6 = (MethodInsnNode)var2;
         return Type.getReturnType(var6.desc);
      }

      if (var2 instanceof FieldInsnNode) {
         FieldInsnNode var5 = (FieldInsnNode)var2;
         return var5.getOpcode() != 180 && var5.getOpcode() != 178 ? Type.VOID_TYPE : Type.getType(var5.desc);
      }

      if (var2.getOpcode() == 187 || var2.getOpcode() == 192) {
         TypeInsnNode var4 = (TypeInsnNode)var2;
         return Type.getObjectType(var4.desc);
      }

      if (var2.getOpcode() == 193) {
         return Type.BOOLEAN_TYPE;
      }

      Type var3 = ASMUtils.getConstantType(var2);
      return var3 != null ? var3 : null;
   }

   private class TargetInfo {
      private final Target target;
      private final boolean isDupedFactoryRedirect;
      private final boolean isDynamicInstanceofRedirect;
      private final ArrayCreationInfo arrayCreationInfo;
      private final boolean isStringConcat;
      private final ComparisonInfo comparison;

      public TargetInfo(Target var2, InjectionNodes.InjectionNode var3) {
         this.target = var2;
         this.isDupedFactoryRedirect = InjectorUtils.isDupedFactoryRedirect(var3);
         this.isDynamicInstanceofRedirect = InjectorUtils.isDynamicInstanceofRedirect(var3);
         this.arrayCreationInfo = var3.getDecoration("mixinextras_persistent_arrayCreationInfo");
         this.isStringConcat = InjectorUtils.hasInjectorSpecificDecoration(
            var3, ModifyExpressionValueInjector.this.info, "mixinextras_isStringConcatExpression"
         );
         this.comparison = InjectorUtils.getInjectorSpecificDecoration(var3, ModifyExpressionValueInjector.this.info, "mixinextras_comparisonInfo");
      }

      public AbstractInsnNode getInsertionPoint(AbstractInsnNode var1) {
         if (this.isDupedFactoryRedirect) {
            return PreviousInjectorInsns.DUPED_FACTORY_REDIRECT.getLast(var1);
         } else if (this.isDynamicInstanceofRedirect) {
            return PreviousInjectorInsns.DYNAMIC_INSTANCEOF_REDIRECT.getLast(var1);
         } else if (this.arrayCreationInfo != null) {
            return this.arrayCreationInfo.initialized.getNode(this.target).getCurrentTarget();
         } else {
            return this.comparison != null ? this.comparison.getJumpInsn(this.target) : var1;
         }
      }

      public void invokeHandler(Type var1, InsnList var2, StackExtension var3) {
         LabelNode var4 = null;
         if (this.isStringConcat) {
            var2.add(new InsnNode(89));
            var3.extra(1);
            var2.add(new MethodInsnNode(182, Type.getInternalName(StringBuilder.class), "toString", Bytecode.generateDescriptor(String.class), false));
         } else if (this.comparison != null) {
            var4 = this.comparison.getJumpTarget(this.target);
            ASMUtils.ifElse(
               var2,
               var1x -> this.comparison.getJumpInsn(this.target).label = var1x,
               () -> var2.add(new InsnNode(this.comparison.jumpOnTrue ? 3 : 4)),
               () -> var2.add(new InsnNode(this.comparison.jumpOnTrue ? 4 : 3))
            );
         }

         ModifyExpressionValueInjector.this.invokeHandler(var1, this.target, var2, var3);
         if (this.isStringConcat) {
            var2.add(
               new MethodInsnNode(
                  184,
                  Type.getInternalName(MixinExtrasHooks.class),
                  "replaceContents",
                  Bytecode.generateDescriptor(StringBuilder.class, StringBuilder.class, String.class),
                  false
               )
            );
         } else if (this.comparison != null) {
            var2.add(new JumpInsnNode(this.comparison.jumpOnTrue ? 154 : 153, var4));
         }
      }
   }
}
