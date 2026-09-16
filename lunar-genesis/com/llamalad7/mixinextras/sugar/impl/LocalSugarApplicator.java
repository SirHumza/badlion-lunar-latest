package com.llamalad7.mixinextras.sugar.impl;

import com.llamalad7.mixinextras.injector.StackExtension;
import com.llamalad7.mixinextras.sugar.impl.ref.LocalRefClassGenerator;
import com.llamalad7.mixinextras.sugar.impl.ref.LocalRefUtils;
import com.llamalad7.mixinextras.utils.InjectorUtils;
import java.util.HashMap;
import java.util.Map;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.VarInsnNode;
import org.spongepowered.asm.mixin.injection.modify.InvalidImplicitDiscriminatorException;
import org.spongepowered.asm.mixin.injection.modify.LocalVariableDiscriminator;
import org.spongepowered.asm.mixin.injection.struct.InjectionInfo;
import org.spongepowered.asm.mixin.injection.struct.InjectionNodes;
import org.spongepowered.asm.mixin.injection.struct.Target;
import org.spongepowered.asm.util.Annotations;

class LocalSugarApplicator extends SugarApplicator {
   private final boolean isArgsOnly;
   private final Type targetLocalType = LocalRefUtils.getTargetType(this.paramType, this.paramGeneric);
   private final boolean isMutable = this.targetLocalType != this.paramType;

   LocalSugarApplicator(InjectionInfo var1, SugarParameter var2) {
      super(var1, var2);
      this.isArgsOnly = Annotations.getValue(this.sugar, "argsOnly", Boolean.valueOf(false));
   }

   @Override
   void validate(Target var1, InjectionNodes.InjectionNode var2) {
      LocalVariableDiscriminator var3 = LocalVariableDiscriminator.parse(this.sugar);
      LocalVariableDiscriminator.Context var4 = InjectorUtils.getOrCreateLocalContext(var1, var2, this.info, this.targetLocalType, this.isArgsOnly);
      if (var3.printLVT()) {
         InjectorUtils.printLocals(var1, var2.getCurrentTarget(), var4, var3, this.targetLocalType, this.isArgsOnly);
         this.info.addCallbackInvocation(this.info.getMethod());
         throw new SugarApplicationException("Application aborted because locals are being printed instead.");
      }

      try {
         if (var3.findLocal(var4) < 0) {
            throw new SugarApplicationException("Unable to find matching local!");
         }
      } catch (InvalidImplicitDiscriminatorException var6) {
         throw new SugarApplicationException("Invalid implicit variable discriminator: ", var6);
      }
   }

   @Override
   void prepare(Target var1, InjectionNodes.InjectionNode var2) {
      InjectorUtils.getOrCreateLocalContext(var1, var2, this.info, this.targetLocalType, this.isArgsOnly);
   }

   @Override
   void inject(Target var1, InjectionNodes.InjectionNode var2, StackExtension var3) {
      LocalVariableDiscriminator var4 = LocalVariableDiscriminator.parse(this.sugar);
      LocalVariableDiscriminator.Context var5 = InjectorUtils.getOrCreateLocalContext(var1, var2, this.info, this.targetLocalType, this.isArgsOnly);
      int var6 = var4.findLocal(var5);
      if (var6 < 0) {
         throw new SugarApplicationException("Failed to match a local, this should have been caught during validation.");
      }

      if (this.isMutable) {
         this.initAndLoadLocalRef(var1, var2, var6, var3);
      } else {
         var3.extra(this.targetLocalType.getSize());
         var1.insns.insertBefore(var2.getCurrentTarget(), new VarInsnNode(this.targetLocalType.getOpcode(21), var6));
      }
   }

   @Override
   int postProcessingPriority() {
      return 1000;
   }

   private void initAndLoadLocalRef(Target var1, InjectionNodes.InjectionNode var2, int var3, StackExtension var4) {
      String var5 = LocalRefClassGenerator.getForType(this.targetLocalType);
      int var6 = this.getOrCreateRef(var1, var2, var3, var5, var4);
      var4.extra(1);
      var1.insns.insertBefore(var2.getCurrentTarget(), new VarInsnNode(25, var6));
   }

   private int getOrCreateRef(Target var1, InjectionNodes.InjectionNode var2, int var3, String var4, StackExtension var5) {
      Map var6 = var2.getDecoration("mixinextras_localRefMap");
      if (var6 == null) {
         var6 = new HashMap();
         var2.decorate("mixinextras_localRefMap", var6);
      }

      if (var6.containsKey(var3)) {
         return (Integer)var6.get(var3);
      }

      int var7 = var1.allocateLocal();
      var1.addLocalVariable(var7, "ref" + var7, 'L' + var4 + ';');
      InsnList var8 = new InsnList();
      LocalRefUtils.generateNew(var8, this.targetLocalType);
      var8.add(new VarInsnNode(58, var7));
      var1.insertBefore(var2, var8);
      SugarPostProcessingExtension.enqueuePostProcessing(this, () -> {
         InsnList var5x = new InsnList();
         var5x.add(new VarInsnNode(25, var7));
         var5x.add(new VarInsnNode(this.targetLocalType.getOpcode(21), var3));
         LocalRefUtils.generateInitialization(var5x, this.targetLocalType);
         var1.insertBefore(var2, var5x);
         InsnList var6x = new InsnList();
         var6x.add(new VarInsnNode(25, var7));
         LocalRefUtils.generateDisposal(var6x, this.targetLocalType);
         var6x.add(new VarInsnNode(this.targetLocalType.getOpcode(54), var3));
         var1.insns.insert(var2.getCurrentTarget(), var6x);
      });
      var5.extra(this.targetLocalType.getSize() + 1);
      var6.put(var3, var7);
      return var7;
   }
}
