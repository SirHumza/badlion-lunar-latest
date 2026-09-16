package org.spongepowered.asm.mixin.injection.invoke;

import java.util.Arrays;
import java.util.List;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.MethodInsnNode;
import org.spongepowered.asm.mixin.injection.InjectionPoint;
import org.spongepowered.asm.mixin.injection.struct.ArgOffsets;
import org.spongepowered.asm.mixin.injection.struct.InjectionInfo;
import org.spongepowered.asm.mixin.injection.struct.InjectionNodes;
import org.spongepowered.asm.mixin.injection.struct.Target;
import org.spongepowered.asm.mixin.injection.throwables.InvalidInjectionException;
import org.spongepowered.asm.util.Bytecode;

public class ModifyArgInjector extends InvokeInjector {
   private final int index;
   private final boolean singleArgMode;

   public ModifyArgInjector(InjectionInfo var1, int var2) {
      super(var1, "@ModifyArg");
      this.index = var2;
      this.singleArgMode = this.methodArgs.length == 1;
   }

   @Override
   protected void sanityCheck(Target var1, List<InjectionPoint> var2) {
      super.sanityCheck(var1, var2);
      if (this.singleArgMode && !this.methodArgs[0].equals(this.returnType)) {
         throw new InvalidInjectionException(
            this.info, "@ModifyArg return type on " + this + " must match the parameter type. ARG=" + this.methodArgs[0] + " RETURN=" + this.returnType
         );
      }
   }

   @Override
   protected void checkTarget(Target var1) {
      if (!this.isStatic && var1.isStatic) {
         throw new InvalidInjectionException(this.info, "non-static callback method " + this + " targets a static method which is not supported");
      }
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
      boolean var6 = var2.hasDecoration("argOffsets");
      Type[] var7 = var5.apply(var4);
      if (var7.length == 0) {
         throw new InvalidInjectionException(
            this.info,
            "@ModifyArg injector "
               + this
               + " targets a method invocation "
               + ((MethodInsnNode)var2.getOriginalTarget()).name
               + "()"
               + Type.getReturnType(var3.desc)
               + " with no arguments!"
         );
      }

      int var8 = var5.getArgIndex(this.findArgIndex(var1, var7));
      int var9 = var5.getStartIndex();
      InsnList var10 = new InsnList();
      Target.Extension var11 = var1.extendLocals();
      if (this.singleArgMode) {
         this.injectSingleArgHandler(var1, var11, var4, var8, var10, var6);
      } else {
         if (!Arrays.equals(var7, this.methodArgs)) {
            throw new InvalidInjectionException(
               this.info,
               "@ModifyArg injector "
                  + this
                  + " targets a method with an invalid signature "
                  + Bytecode.getDescriptor(var7)
                  + ", expected "
                  + Bytecode.getDescriptor(this.methodArgs)
            );
         }

         this.injectMultiArgHandler(var1, var11, var4, var9, var8, var10, var6);
      }

      var1.insns.insertBefore(var3, var10);
      Target.Extension var12 = var1.extendStack();
      if (!this.isStatic) {
         var12.add();
      }

      var12.add(this.methodArgs);
      var12.apply();
      var11.apply();
   }

   private void injectSingleArgHandler(Target var1, Target.Extension var2, Type[] var3, int var4, InsnList var5, boolean var6) {
      int[] var7 = var1.generateArgMap(var3, var4, var6);
      this.storeArgs(var1, var3, var5, var7, var4, var3.length, null, null);
      this.invokeHandlerWithArgs(var3, var5, var7, var4, var4 + 1);
      this.pushArgs(var3, var5, var7, var4 + 1, var3.length);
      var2.add(var7[var7.length - 1] - var1.getMaxLocals() + var3[var3.length - 1].getSize());
   }

   private void injectMultiArgHandler(Target var1, Target.Extension var2, Type[] var3, int var4, int var5, InsnList var6, boolean var7) {
      int[] var8 = var1.generateArgMap(var3, var4, var7);
      int[] var9 = var4 == 0 ? var8 : Arrays.copyOfRange(var8, var4, var4 + this.methodArgs.length);
      this.storeArgs(var1, var3, var6, var8, var4, var3.length, null, null);
      this.pushArgs(var3, var6, var8, var4, var5);
      this.invokeHandlerWithArgs(this.methodArgs, var6, var9, 0, this.methodArgs.length);
      this.pushArgs(var3, var6, var8, var5 + 1, var3.length);
      var2.add(var8[var8.length - 1] - var1.getMaxLocals() + var3[var3.length - 1].getSize());
   }

   protected int findArgIndex(Target var1, Type[] var2) {
      if (this.index > -1) {
         if (this.index < var2.length && var2[this.index].equals(this.returnType)) {
            return this.index;
         } else {
            throw new InvalidInjectionException(
               this.info,
               "Specified index "
                  + this.index
                  + " for @ModifyArg is invalid for args "
                  + Bytecode.getDescriptor(var2)
                  + ", expected "
                  + this.returnType
                  + " on "
                  + this
            );
         }
      } else {
         int var3 = -1;

         for (int var4 = 0; var4 < var2.length; var4++) {
            if (var2[var4].equals(this.returnType)) {
               if (var3 != -1) {
                  throw new InvalidInjectionException(
                     this.info,
                     "Found duplicate args with index ["
                        + var3
                        + ", "
                        + var4
                        + "] matching type "
                        + this.returnType
                        + " for @ModifyArg target "
                        + var1
                        + " in "
                        + this
                        + ". Please specify index of desired arg."
                  );
               }

               var3 = var4;
            }
         }

         if (var3 == -1) {
            throw new InvalidInjectionException(
               this.info, "Could not find arg matching type " + this.returnType + " for @ModifyArg target " + var1 + " in " + this
            );
         } else {
            return var3;
         }
      }
   }
}
