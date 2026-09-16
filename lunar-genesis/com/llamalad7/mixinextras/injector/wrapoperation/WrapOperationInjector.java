package com.llamalad7.mixinextras.injector.wrapoperation;

import com.llamalad7.mixinextras.expression.impl.flow.expansion.InsnExpander;
import com.llamalad7.mixinextras.expression.impl.utils.ComparisonInfo;
import com.llamalad7.mixinextras.injector.IntLikeBehaviour;
import com.llamalad7.mixinextras.injector.StackExtension;
import com.llamalad7.mixinextras.lib.apache.commons.ArrayUtils;
import com.llamalad7.mixinextras.lib.apache.commons.StringUtils;
import com.llamalad7.mixinextras.service.MixinExtrasService;
import com.llamalad7.mixinextras.utils.ASMUtils;
import com.llamalad7.mixinextras.utils.CompatibilityHelper;
import com.llamalad7.mixinextras.utils.InjectorUtils;
import com.llamalad7.mixinextras.utils.OperationUtils;
import com.llamalad7.mixinextras.utils.PreviousInjectorInsns;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.function.Consumer;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.InsnNode;
import org.objectweb.asm.tree.JumpInsnNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.TypeInsnNode;
import org.objectweb.asm.tree.VarInsnNode;
import org.spongepowered.asm.mixin.injection.code.Injector;
import org.spongepowered.asm.mixin.injection.struct.InjectionInfo;
import org.spongepowered.asm.mixin.injection.struct.InjectionNodes;
import org.spongepowered.asm.mixin.injection.struct.Target;
import org.spongepowered.asm.util.Bytecode;

class WrapOperationInjector extends Injector {
   private final Type operationType = MixinExtrasService.getInstance()
      .changePackage(Operation.class, Type.getType(CompatibilityHelper.getAnnotation(this.info).desc), WrapOperation.class);
   private final List<WrapOperationInjector.OperationConstructor> operationTypes = Arrays.asList(
      (var1x, var2, var3) -> new WrapOperationInjector.DynamicInstanceofRedirectOperation(var1x, var2, var3),
      (var1x, var2, var3) -> new WrapOperationInjector.DupedFactoryRedirectOperation(var1x, var2, var3),
      this::newComparisonExpression,
      (var1x, var2, var3) -> new WrapOperationInjector.MethodCallOperation(var1x, var2, var3),
      WrapOperationInjector.FieldAccessOperation::new,
      WrapOperationInjector.InstanceofOperation::new,
      this::newInstantiationOperation,
      WrapOperationInjector.SimpleOperation::new
   );

   public WrapOperationInjector(InjectionInfo var1) {
      super(var1, "@WrapOperation");
   }

   @Override
   protected void inject(Target var1, InjectionNodes.InjectionNode var2) {
      InjectionNodes.InjectionNode var3 = InsnExpander.doExpansion(var2, var1, this.info);
      this.checkTargetModifiers(var1, false);
      StackExtension var4 = new StackExtension(var1);
      WrapOperationInjector.OperationType var5 = this.operationTypes
         .stream()
         .map(var3x -> var3x.make(var1, var3, var4))
         .filter(Objects::nonNull)
         .filter(WrapOperationInjector.OperationType::validate)
         .findFirst()
         .orElseThrow(
            () -> CompatibilityHelper.makeInvalidInjectionException(
               this.info, String.format("%s annotation is targeting an invalid insn in %s in %s", this.annotationType, var1, this)
            )
         );
      this.wrapOperation(var1, var5, var4);
   }

   private void wrapOperation(Target var1, WrapOperationInjector.OperationType var2, StackExtension var3) {
      InsnList var4 = new InsnList();
      InjectionNodes.InjectionNode var5 = var2.node;
      Type[] var6 = this.getCurrentArgTypes(var5);
      Type var7 = this.getReturnType(var5);
      AbstractInsnNode var8 = this.invokeHandler(var1, var2, var5, var6, var7, var4, var3);
      var2.afterHandlerCall(var4, var8);
      AbstractInsnNode var9 = var5.getCurrentTarget();
      var1.wrapNode(var9, var8, var4, new InsnList());
      var5.decorate("mixinextras_wrappedOperation", true);
      var1.insns.remove(var9);
   }

   private AbstractInsnNode invokeHandler(
      Target var1, WrapOperationInjector.OperationType var2, InjectionNodes.InjectionNode var3, Type[] var4, Type var5, InsnList var6, StackExtension var7
   ) {
      Injector.InjectorData var8 = new Injector.InjectorData(var1, "operation wrapper");
      boolean var9 = var3.isReplaced() && var3.getCurrentTarget().getOpcode() != 184;
      if (var9) {
         var4 = ArrayUtils.remove(var4, 0);
      }

      Type[] var10 = this.getOriginalArgTypes(var3);
      this.validateParams(var8, var5, ArrayUtils.add(var10, this.operationType));
      int[] var11 = this.storeArgs(var1, var4, var6, 0);
      if (var9) {
         var6.add(new InsnNode(87));
      }

      if (!this.isStatic) {
         var6.add(new VarInsnNode(25, 0));
      }

      this.pushArgs(this.methodArgs, var6, var11, 0, var10.length);
      if (var9) {
         var6.add(new VarInsnNode(25, 0));
      }

      this.pushArgs(var4, var6, var11, var10.length, var11.length);
      this.makeOperation(var2, var10, var5, var6, var9, ArrayUtils.subarray(var4, var10.length, var4.length));
      if (var8.captureTargetArgs > 0) {
         this.pushArgs(var1.arguments, var6, var1.getArgIndices(), 0, var8.captureTargetArgs);
      }

      var7.receiver(this.isStatic);
      var7.extra(1);
      var7.capturedArgs(var1.arguments, var8.captureTargetArgs);
      AbstractInsnNode var12 = super.invokeHandler(var6);
      InjectorUtils.coerceReturnType(var8, var6, var5);
      return var12;
   }

   private void makeOperation(WrapOperationInjector.OperationType var1, Type[] var2, Type var3, InsnList var4, boolean var5, Type[] var6) {
      OperationUtils.makeOperation(var2, var3, var4, var5, var6, this.classNode, this.operationType, var1.getName(), (var2x, var3x) -> {
         InsnList var4x = new InsnList();
         var1.copyNode(var4x, var2x, var3x, var3);
         return var4x;
      });
   }

   private Type getReturnType(InjectionNodes.InjectionNode var1) {
      AbstractInsnNode var2 = var1.getOriginalTarget();
      if (var1.hasDecoration("mixinextras_simpleOperationReturnType")) {
         return var1.getDecoration("mixinextras_simpleOperationReturnType");
      } else if (var2.getOpcode() == 193) {
         return Type.BOOLEAN_TYPE;
      } else if (var2 instanceof MethodInsnNode) {
         MethodInsnNode var5 = (MethodInsnNode)var2;
         return var5.name.equals("<init>") ? Type.getObjectType(var5.owner) : Type.getReturnType(var5.desc);
      } else if (var2 instanceof FieldInsnNode) {
         FieldInsnNode var4 = (FieldInsnNode)var2;
         return var4.getOpcode() != 180 && var4.getOpcode() != 178 ? Type.VOID_TYPE : Type.getType(var4.desc);
      } else if (var2.getOpcode() == 187) {
         TypeInsnNode var3 = (TypeInsnNode)var2;
         return Type.getObjectType(var3.desc);
      } else {
         throw new UnsupportedOperationException();
      }
   }

   private Type[] getOriginalArgTypes(InjectionNodes.InjectionNode var1) {
      if (var1.hasDecoration("mixinextras_newArgTypes")) {
         return var1.getDecoration("mixinextras_newArgTypes");
      } else {
         return var1.hasDecoration("mixinextras_simpleOperationArgs")
            ? this.cleanIntLikeArgs(var1.getDecoration("mixinextras_simpleOperationArgs"))
            : this.getEffectiveArgTypes(var1.getOriginalTarget());
      }
   }

   private Type[] getCurrentArgTypes(InjectionNodes.InjectionNode var1) {
      return !var1.isReplaced() && var1.hasDecoration("mixinextras_simpleOperationArgs")
         ? this.cleanIntLikeArgs(var1.getDecoration("mixinextras_simpleOperationArgs"))
         : this.getEffectiveArgTypes(var1.getCurrentTarget());
   }

   private Type[] cleanIntLikeArgs(Type[] var1) {
      return new IntLikeBehaviour.MatchArgType(0)
         .transform(this.info, Type.getMethodType(this.returnType, var1), Type.getMethodType(this.returnType, this.methodArgs))
         .getArgumentTypes();
   }

   private Type[] getEffectiveArgTypes(AbstractInsnNode var1) {
      if (var1 instanceof MethodInsnNode) {
         MethodInsnNode var4 = (MethodInsnNode)var1;
         Type[] var3 = Type.getArgumentTypes(var4.desc);
         if (var4.name.equals("<init>")) {
            return var3;
         }

         switch (var4.getOpcode()) {
            case 183:
               var3 = ArrayUtils.add(var3, 0, Type.getObjectType(this.classNode.name));
            case 184:
               break;
            default:
               var3 = ArrayUtils.add(var3, 0, Type.getObjectType(var4.owner));
         }

         return var3;
      } else {
         if (var1 instanceof FieldInsnNode) {
            FieldInsnNode var2 = (FieldInsnNode)var1;
            switch (var2.getOpcode()) {
               case 178:
                  return new Type[0];
               case 179:
                  return new Type[]{Type.getType(var2.desc)};
               case 180:
                  return new Type[]{Type.getObjectType(var2.owner)};
               case 181:
                  return new Type[]{Type.getObjectType(var2.owner), Type.getType(var2.desc)};
            }
         }

         if (var1.getOpcode() == 193) {
            return new Type[]{ASMUtils.OBJECT_TYPE};
         } else {
            throw new UnsupportedOperationException();
         }
      }
   }

   private WrapOperationInjector.OperationType newInstantiationOperation(Target var1, InjectionNodes.InjectionNode var2, StackExtension var3) {
      AbstractInsnNode var4 = var2.getCurrentTarget();
      if (var4.getOpcode() != 187) {
         return null;
      }

      var2.decorate("mixinextras_wrappedOperation", true);
      return new WrapOperationInjector.InstantiationOperation(var1, var1.addInjectionNode(ASMUtils.findInitNodeFor(var1, (TypeInsnNode)var4)), var3, var2);
   }

   private WrapOperationInjector.OperationType newComparisonExpression(Target var1, InjectionNodes.InjectionNode var2, StackExtension var3) {
      ComparisonInfo var4 = InjectorUtils.getInjectorSpecificDecoration(var2, this.info, "mixinextras_comparisonInfo");
      if (var4 == null) {
         return null;
      }

      boolean var5 = var2.hasDecoration("mixinextras_wrappedOperation");
      return new WrapOperationInjector.ComparisonOperation(var1, var2, var3, var5, var4);
   }

   private class ComparisonOperation extends WrapOperationInjector.MethodCallOperation {
      private final boolean isWrapped;
      private final ComparisonInfo comparison;

      ComparisonOperation(Target var2, InjectionNodes.InjectionNode var3, StackExtension var4, boolean var5, ComparisonInfo var6) {
         super(var2, var3, var4);
         this.isWrapped = var5;
         this.comparison = var6;
      }

      @Override
      boolean validate() {
         super.validate();
         return this.comparison != null;
      }

      @Override
      String getName() {
         return this.isWrapped ? super.getName() : "comparison";
      }

      @Override
      void copyNode(InsnList var1, int var2, Consumer<InsnList> var3, Type var4) {
         if (this.isWrapped) {
            super.copyNode(var1, var2, var3, var4);
            PreviousInjectorInsns.COMPARISON_WRAPPER.moveNodes(this.target.insns, var1, this.currentTarget);
            if (!this.comparison.jumpOnTrue) {
               ASMUtils.ifElse(var1, 154, () -> var1.add(new InsnNode(4)), () -> var1.add(new InsnNode(3)));
            }
         } else {
            var3.accept(var1);
            ASMUtils.ifElse(
               var1,
               this.comparison.copyJump(var1),
               () -> var1.add(new InsnNode(this.comparison.jumpOnTrue ? 3 : 4)),
               () -> var1.add(new InsnNode(this.comparison.jumpOnTrue ? 4 : 3))
            );
         }
      }

      @Override
      void afterHandlerCall(InsnList var1, AbstractInsnNode var2) {
         ASMUtils.ifElse(
            var1, 154, () -> var1.add(new InsnNode(this.comparison.jumpOnTrue ? 3 : 4)), () -> var1.add(new InsnNode(this.comparison.jumpOnTrue ? 4 : 3))
         );
         if (!this.isWrapped) {
            var1.add(new JumpInsnNode(154, this.comparison.getJumpTarget(this.target)));
            this.comparison.cleanup(this.target);
         }
      }
   }

   private class DupedFactoryRedirectOperation extends WrapOperationInjector.MethodCallOperation {
      DupedFactoryRedirectOperation(Target var2, InjectionNodes.InjectionNode var3, StackExtension var4) {
         super(var2, var3, var4);
      }

      @Override
      boolean validate() {
         return super.validate() && InjectorUtils.isDupedFactoryRedirect(this.node);
      }

      @Override
      void copyNode(InsnList var1, int var2, Consumer<InsnList> var3, Type var4) {
         super.copyNode(var1, var2, var3, var4);
         PreviousInjectorInsns.DUPED_FACTORY_REDIRECT.moveNodes(this.target.insns, var1, this.currentTarget);
      }
   }

   private class DynamicInstanceofRedirectOperation extends WrapOperationInjector.MethodCallOperation {
      DynamicInstanceofRedirectOperation(Target var2, InjectionNodes.InjectionNode var3, StackExtension var4) {
         super(var2, var3, var4);
      }

      @Override
      boolean validate() {
         return super.validate() && InjectorUtils.isDynamicInstanceofRedirect(this.node);
      }

      @Override
      void copyNode(InsnList var1, int var2, Consumer<InsnList> var3, Type var4) {
         super.copyNode(var1, var2, var3, var4);
         var1.add(new VarInsnNode(25, var2));
         var1.add(new InsnNode(3));
         var1.add(new InsnNode(50));
         var1.add(new InsnNode(95));
         PreviousInjectorInsns.DYNAMIC_INSTANCEOF_REDIRECT.moveNodes(this.target.insns, var1, this.currentTarget);
      }

      @Override
      void afterHandlerCall(InsnList var1, AbstractInsnNode var2) {
         var1.add(new InsnNode(95));
         var1.add(new InsnNode(87));
      }
   }

   private static class FieldAccessOperation extends WrapOperationInjector.OperationType {
      FieldAccessOperation(Target var1, InjectionNodes.InjectionNode var2, StackExtension var3) {
         super(var1, var2, var3);
      }

      @Override
      boolean validate() {
         return this.currentTarget instanceof FieldInsnNode;
      }

      @Override
      String getName() {
         return ((FieldInsnNode)this.currentTarget).name;
      }
   }

   private static class InstanceofOperation extends WrapOperationInjector.OperationType {
      InstanceofOperation(Target var1, InjectionNodes.InjectionNode var2, StackExtension var3) {
         super(var1, var2, var3);
      }

      @Override
      boolean validate() {
         return this.currentTarget.getOpcode() == 193;
      }

      @Override
      String getName() {
         return "instanceof" + StringUtils.substringAfterLast(((TypeInsnNode)this.currentTarget).desc, "/");
      }
   }

   private static class InstantiationOperation extends WrapOperationInjector.OperationType {
      private final InjectionNodes.InjectionNode newNode;
      private final AbstractInsnNode newInsn;
      private final boolean isDuped;

      InstantiationOperation(Target var1, InjectionNodes.InjectionNode var2, StackExtension var3, InjectionNodes.InjectionNode var4) {
         super(var1, var2, var3);
         this.newNode = var4;
         this.newInsn = var4.getCurrentTarget();
         this.isDuped = InjectorUtils.isDupedNew(var4);
      }

      @Override
      boolean validate() {
         return true;
      }

      @Override
      String getName() {
         return "new" + StringUtils.substringAfterLast(((MethodInsnNode)this.currentTarget).owner, "/");
      }

      @Override
      void copyNode(InsnList var1, int var2, Consumer<InsnList> var3, Type var4) {
         var1.add(new TypeInsnNode(187, ((MethodInsnNode)this.currentTarget).owner));
         var1.add(new InsnNode(89));
         super.copyNode(var1, var2, var3, var4);
      }

      @Override
      void afterHandlerCall(InsnList var1, AbstractInsnNode var2) {
         InsnNode var3;
         if (this.isDuped) {
            var3 = new InsnNode(1);
            this.stack.extra(1);
            var1.add(new InsnNode(91));
            var1.add(new InsnNode(87));
            var1.add(new InsnNode(87));
            var1.add(new InsnNode(87));
         } else {
            var3 = new InsnNode(0);
            var1.add(new InsnNode(87));
         }

         this.newNode.replace(var2);
         this.target.insns.set(this.newInsn, var3);
      }
   }

   private class MethodCallOperation extends WrapOperationInjector.OperationType {
      MethodCallOperation(Target var2, InjectionNodes.InjectionNode var3, StackExtension var4) {
         super(var2, var3, var4);
      }

      @Override
      boolean validate() {
         if (this.currentTarget instanceof MethodInsnNode) {
            MethodInsnNode var1 = (MethodInsnNode)this.currentTarget;
            if (var1.name.equals("<init>")) {
               throw CompatibilityHelper.makeInvalidInjectionException(
                  WrapOperationInjector.this.info,
                  String.format(
                     "%s annotation is trying to target an <init> call in %s in %s! If this is an instantiation, target the NEW instead.",
                     WrapOperationInjector.this.annotationType,
                     this.target,
                     WrapOperationInjector.this
                  )
               );
            } else {
               return true;
            }
         } else {
            return false;
         }
      }

      @Override
      String getName() {
         return ((MethodInsnNode)this.currentTarget).name;
      }
   }

   @FunctionalInterface
   private interface OperationConstructor {
      WrapOperationInjector.OperationType make(Target var1, InjectionNodes.InjectionNode var2, StackExtension var3);
   }

   private abstract static class OperationType {
      protected final Target target;
      protected final InjectionNodes.InjectionNode node;
      protected final AbstractInsnNode originalTarget;
      protected final AbstractInsnNode currentTarget;
      protected final StackExtension stack;

      OperationType(Target var1, InjectionNodes.InjectionNode var2, StackExtension var3) {
         this.target = var1;
         this.node = var2;
         this.originalTarget = var2.getOriginalTarget();
         this.currentTarget = var2.getCurrentTarget();
         this.stack = var3;
      }

      abstract boolean validate();

      abstract String getName();

      void copyNode(InsnList var1, int var2, Consumer<InsnList> var3, Type var4) {
         var3.accept(var1);
         var1.add(this.currentTarget.clone(Collections.emptyMap()));
         AbstractInsnNode var5 = InjectorUtils.findCoerce(this.node, var4);
         if (var5 != null) {
            this.target.insns.remove(var5);
            var1.add(var5);
         }
      }

      void afterHandlerCall(InsnList var1, AbstractInsnNode var2) {
      }
   }

   private static class SimpleOperation extends WrapOperationInjector.OperationType {
      SimpleOperation(Target var1, InjectionNodes.InjectionNode var2, StackExtension var3) {
         super(var1, var2, var3);
      }

      @Override
      boolean validate() {
         return !this.node.isReplaced()
            && this.node.hasDecoration("mixinextras_simpleOperationArgs")
            && this.node.hasDecoration("mixinextras_simpleOperationReturnType");
      }

      @Override
      String getName() {
         return Bytecode.getOpcodeName(this.currentTarget).toLowerCase(Locale.ROOT);
      }
   }
}
