package org.spongepowered.asm.mixin.injection.invoke;

import org.objectweb.asm.Type;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.InsnNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.VarInsnNode;
import org.spongepowered.asm.mixin.injection.InjectionPoint;
import org.spongepowered.asm.mixin.injection.invoke.arg.ArgsClassGenerator;
import org.spongepowered.asm.mixin.injection.struct.ArgOffsets;
import org.spongepowered.asm.mixin.injection.struct.InjectionInfo;
import org.spongepowered.asm.mixin.injection.struct.InjectionNodes;
import org.spongepowered.asm.mixin.injection.struct.Target;
import org.spongepowered.asm.mixin.injection.throwables.InvalidInjectionException;
import org.spongepowered.asm.util.Bytecode;

public class ModifyArgsInjector extends InvokeInjector {
   private final ArgsClassGenerator argsClassGenerator;

   public ModifyArgsInjector(InjectionInfo var1) {
      super(var1, "@ModifyArgs");
      this.argsClassGenerator = var1.getMixin().getExtensions().getGenerator(ArgsClassGenerator.class);
   }

   @Override
   protected void checkTarget(Target var1) {
      this.checkTargetModifiers(var1, false);
   }

   @Override
   protected void inject(Target var1, InjectionNodes.InjectionNode var2) {
      this.checkTargetForNode(var1, var2, InjectionPoint.RestrictTargetLevel.ALLOW_ALL);
      super.inject(var1, var2);
   }

   @Override
   protected void injectAtInvoke(Target var1, InjectionNodes.InjectionNode var2) {
      MethodInsnNode var3 = (MethodInsnNode)var2.getCurrentTarget();
      Type[] var4 = Type.getArgumentTypes(var3.desc);
      ArgOffsets var5 = var2.getDecoration("argOffsets", ArgOffsets.DEFAULT);
      Type[] var6 = var5.apply(var4);
      int var7 = var5.getArgIndex(var6.length);
      String var8 = Type.getMethodDescriptor(Type.getReturnType(var3.desc), var6);
      if (var6.length == 0) {
         throw new InvalidInjectionException(
            this.info,
            "@ModifyArgs injector " + this + " targets a method invocation " + ((MethodInsnNode)var2.getOriginalTarget()).name + var8 + " with no arguments!"
         );
      }

      String var9 = this.argsClassGenerator.getArgsClass(var8, this.info.getMixin().getMixin()).getName();
      boolean var10 = this.verifyTarget(var1);
      InsnList var11 = new InsnList();
      Target.Extension var12 = var1.extendStack().add(1);
      int[] var13 = this.storeArgs(var1, var4, var11, var7);
      this.packArgs(var11, var9, var8);
      if (var10) {
         var12.add(var1.arguments);
         Bytecode.loadArgs(var1.arguments, var11, var1.isStatic ? 0 : 1);
      }

      this.invokeHandler(var11);
      this.unpackArgs(var11, var9, var6);
      this.pushArgs(var4, var11, var13, var7, var4.length);
      var12.apply();
      var1.insns.insertBefore(var3, var11);
   }

   private boolean verifyTarget(Target var1) {
      String var2 = String.format("(L%s;)V", ArgsClassGenerator.ARGS_REF);
      if (!this.methodNode.desc.equals(var2)) {
         String var3 = Bytecode.changeDescriptorReturnType(var1.getDesc(), "V");
         String var4 = String.format("(L%s;%s", ArgsClassGenerator.ARGS_REF, var3.substring(1));
         if (this.methodNode.desc.equals(var4)) {
            return true;
         } else {
            throw new InvalidInjectionException(
               this.info, "@ModifyArgs injector " + this + " has an invalid signature " + this.methodNode.desc + ", expected " + var2 + " or " + var4
            );
         }
      } else {
         return false;
      }
   }

   private void packArgs(InsnList var1, String var2, String var3) {
      String var4 = Bytecode.changeDescriptorReturnType(var3, "L" + var2 + ";");
      var1.add(new MethodInsnNode(184, var2, "of", var4, false));
      var1.add(new InsnNode(89));
      if (!this.isStatic) {
         var1.add(new VarInsnNode(25, 0));
         var1.add(new InsnNode(95));
      }
   }

   private void unpackArgs(InsnList var1, String var2, Type[] var3) {
      for (int var4 = 0; var4 < var3.length; var4++) {
         if (var4 < var3.length - 1) {
            var1.add(new InsnNode(89));
         }

         var1.add(new MethodInsnNode(182, var2, "$" + var4, "()" + var3[var4].getDescriptor(), false));
         if (var4 < var3.length - 1) {
            if (var3[var4].getSize() == 1) {
               var1.add(new InsnNode(95));
            } else {
               var1.add(new InsnNode(93));
               var1.add(new InsnNode(88));
            }
         }
      }
   }
}
