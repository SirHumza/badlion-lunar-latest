package org.spongepowered.asm.mixin.injection.invoke;

import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.InsnNode;
import org.objectweb.asm.tree.JumpInsnNode;
import org.objectweb.asm.tree.LocalVariableNode;
import org.objectweb.asm.tree.TypeInsnNode;
import org.objectweb.asm.tree.VarInsnNode;
import org.spongepowered.asm.logging.Level;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.mixin.injection.code.Injector;
import org.spongepowered.asm.mixin.injection.invoke.util.InsnFinder;
import org.spongepowered.asm.mixin.injection.struct.InjectionInfo;
import org.spongepowered.asm.mixin.injection.struct.InjectionNodes;
import org.spongepowered.asm.mixin.injection.struct.Target;
import org.spongepowered.asm.mixin.injection.throwables.InvalidInjectionException;
import org.spongepowered.asm.util.Bytecode;
import org.spongepowered.asm.util.Locals;
import org.spongepowered.asm.util.SignaturePrinter;

public class ModifyConstantInjector extends RedirectInjector {
   public ModifyConstantInjector(InjectionInfo var1) {
      super(var1, "@ModifyConstant");
   }

   @Override
   protected void inject(Target var1, InjectionNodes.InjectionNode var2) {
      if (this.preInject(var2)) {
         if (var2.isReplaced()) {
            throw new UnsupportedOperationException("Target failure for " + this.info);
         }

         AbstractInsnNode var3 = var2.getCurrentTarget();
         if (var3 instanceof TypeInsnNode) {
            this.checkTargetModifiers(var1, false);
            this.injectTypeConstantModifier(var1, (TypeInsnNode)var3);
         } else if (var3 instanceof JumpInsnNode) {
            this.checkTargetModifiers(var1, false);
            this.injectExpandedConstantModifier(var1, (JumpInsnNode)var3);
         } else if (Bytecode.isConstant(var3)) {
            this.checkTargetModifiers(var1, false);
            this.injectConstantModifier(var1, var3);
         } else {
            throw new InvalidInjectionException(
               this.info, String.format("%s annotation is targetting an invalid insn in %s in %s", this.annotationType, var1, this)
            );
         }
      }
   }

   private void injectTypeConstantModifier(Target var1, TypeInsnNode var2) {
      int var3 = var2.getOpcode();
      if (var3 != 193) {
         throw new InvalidInjectionException(
            this.info, String.format("%s annotation does not support %s insn in %s in %s", this.annotationType, Bytecode.getOpcodeName(var3), var1, this)
         );
      }

      this.injectAtInstanceOf(var1, var2);
   }

   private void injectExpandedConstantModifier(Target var1, JumpInsnNode var2) {
      int var3 = var2.getOpcode();
      if (var3 >= 155 && var3 <= 158) {
         Target.Extension var4 = var1.extendStack();
         InsnList var5 = new InsnList();
         var5.add(new InsnNode(3));
         AbstractInsnNode var6 = this.invokeConstantHandler(Type.getType("I"), var1, var4, var5, var5);
         var5.add(new JumpInsnNode(var3 + 6, var2.label));
         var4.add(1).apply();
         var1.replaceNode(var2, var6, var5);
      } else {
         throw new InvalidInjectionException(
            this.info, String.format("%s annotation selected an invalid opcode %s in %s in %s", this.annotationType, Bytecode.getOpcodeName(var3), var1, this)
         );
      }
   }

   private void injectConstantModifier(Target var1, AbstractInsnNode var2) {
      Type var3 = Bytecode.getConstantType(var2);
      if (var3.getSort() <= 5 && this.info.getMixin().getOption(MixinEnvironment.Option.DEBUG_VERBOSE)) {
         this.checkNarrowing(var1, var2, var3);
      }

      Target.Extension var4 = var1.extendStack();
      InsnList var5 = new InsnList();
      InsnList var6 = new InsnList();
      AbstractInsnNode var7 = this.invokeConstantHandler(var3, var1, var4, var5, var6);
      var4.apply();
      var1.wrapNode(var2, var7, var5, var6);
   }

   private AbstractInsnNode invokeConstantHandler(Type var1, Target var2, Target.Extension var3, InsnList var4, InsnList var5) {
      Injector.InjectorData var6 = new Injector.InjectorData(var2, "constant modifier");
      this.validateParams(var6, var1, var1);
      if (!this.isStatic) {
         var4.insert(new VarInsnNode(25, 0));
         var3.add();
      }

      if (var6.captureTargetArgs > 0) {
         this.pushArgs(var2.arguments, var5, var2.getArgIndices(), 0, var6.captureTargetArgs, var3);
      }

      return this.invokeHandler(var5);
   }

   private void checkNarrowing(Target var1, AbstractInsnNode var2, Type var3) {
      AbstractInsnNode var4 = new InsnFinder().findPopInsn(var1, var2);
      if (var4 != null) {
         if (var4 instanceof FieldInsnNode) {
            FieldInsnNode var5 = (FieldInsnNode)var4;
            Type var6 = Type.getType(var5.desc);
            this.checkNarrowing(
               var1,
               var2,
               var3,
               var6,
               var1.indexOf(var4),
               String.format("%s %s %s.%s", Bytecode.getOpcodeName(var4), SignaturePrinter.getTypeName(var6, false), var5.owner.replace('/', '.'), var5.name)
            );
         } else if (var4.getOpcode() == 172) {
            this.checkNarrowing(var1, var2, var3, var1.returnType, var1.indexOf(var4), "RETURN " + SignaturePrinter.getTypeName(var1.returnType, false));
         } else if (var4.getOpcode() == 54) {
            int var9 = ((VarInsnNode)var4).var;
            LocalVariableNode var10 = Locals.getLocalVariableAt(var1.classNode, var1.method, var4, var9);
            if (var10 != null && var10.desc != null) {
               String var7 = var10.name != null ? var10.name : "unnamed";
               Type var8 = Type.getType(var10.desc);
               this.checkNarrowing(
                  var1, var2, var3, var8, var1.indexOf(var4), String.format("ISTORE[var=%d] %s %s", var9, SignaturePrinter.getTypeName(var8, false), var7)
               );
            }
         }
      }
   }

   private void checkNarrowing(Target var1, AbstractInsnNode var2, Type var3, Type var4, int var5, String var6) {
      int var7 = var3.getSort();
      int var8 = var4.getSort();
      if (var8 < var7) {
         String var9 = SignaturePrinter.getTypeName(var3, false);
         String var10 = SignaturePrinter.getTypeName(var4, false);
         String var11 = var8 == 1 ? ". Implicit conversion to <boolean> can cause nondeterministic (JVM-specific) behaviour!" : "";
         Level var12 = var8 == 1 ? Level.ERROR : Level.WARN;
         Injector.logger
            .log(var12, "Narrowing conversion of <{}> to <{}> in {} target {} at opcode {} ({}){}", var9, var10, this.info, var1, var5, var6, var11);
      }
   }
}
