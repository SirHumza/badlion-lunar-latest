package com.llamalad7.mixinextras.injector.wrapmethod;

import com.llamalad7.mixinextras.lib.apache.commons.ArrayUtils;
import com.llamalad7.mixinextras.sugar.impl.ShareInfo;
import com.llamalad7.mixinextras.utils.ASMUtils;
import com.llamalad7.mixinextras.utils.OperationUtils;
import com.llamalad7.mixinextras.utils.UniquenessHelper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.function.IntUnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.objectweb.asm.Type;
import org.objectweb.asm.TypeReference;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.IincInsnNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.InsnNode;
import org.objectweb.asm.tree.LocalVariableNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.TypeAnnotationNode;
import org.objectweb.asm.tree.TypeInsnNode;
import org.objectweb.asm.tree.VarInsnNode;
import org.spongepowered.asm.util.Bytecode;

public abstract class WrapMethodStage {
   protected abstract MethodNode getVanillaMethod();

   public abstract MethodNode apply(ClassNode var1, LinkedHashSet<ShareInfo> var2);

   protected static MethodNode move(ClassNode var0, MethodNode var1) {
      MethodNode var2 = new MethodNode(var1.access, UniquenessHelper.getUniqueMethodName(var0, var1.name + "$mixinextras$wrapped"), var1.desc, null, null);
      Bytecode.setVisibility(var2, Bytecode.Visibility.PRIVATE);
      var2.instructions = var1.instructions;
      var2.instructions.resetLabels();
      var1.instructions = new InsnList();
      var2.tryCatchBlocks = var1.tryCatchBlocks;
      var1.tryCatchBlocks = null;
      var2.localVariables = var1.localVariables;
      var1.localVariables = null;
      stripLocalVariableReferences(var1.visibleTypeAnnotations);
      stripLocalVariableReferences(var1.invisibleTypeAnnotations);
      var1.visibleLocalVariableAnnotations = null;
      var1.invisibleLocalVariableAnnotations = null;
      var0.methods.add(var2);
      return var2;
   }

   private static void stripLocalVariableReferences(List<TypeAnnotationNode> var0) {
      if (var0 != null) {
         var0.removeIf(var0x -> new TypeReference(var0x.typeRef).getSort() == 64);
      }
   }

   public static class Vanilla extends WrapMethodStage {
      private final MethodNode original;

      public Vanilla(MethodNode var1) {
         this.original = var1;
      }

      @Override
      protected MethodNode getVanillaMethod() {
         return this.original;
      }

      @Override
      public MethodNode apply(ClassNode var1, LinkedHashSet<ShareInfo> var2) {
         this.stripShareInitializers(var2);
         int var3 = Bytecode.getFirstNonArgLocalIndex(this.original);
         this.changeDesc(var2);
         this.fixLocals(var3, new ArrayList<>(var2));
         return this.original;
      }

      private void stripShareInitializers(LinkedHashSet<ShareInfo> var1) {
         for (ShareInfo var3 : var1) {
            var3.stripInitializerFrom(this.original);
         }
      }

      private void changeDesc(LinkedHashSet<ShareInfo> var1) {
         Type[] var2 = var1.stream().map(var0 -> var0.getShareType().getImplType()).toArray(Type[]::new);
         Type[] var3 = ArrayUtils.addAll(Type.getArgumentTypes(this.original.desc), var2);
         Type var4 = Type.getReturnType(this.original.desc);
         this.original.desc = Type.getMethodDescriptor(var4, var3);
      }

      private void fixLocals(int var1, List<ShareInfo> var2) {
         if (!var2.isEmpty()) {
            Map var3 = IntStream.range(0, var2.size())
               .boxed()
               .collect(Collectors.toMap(var1x -> ((ShareInfo)var2.get(var1x)).getLvtIndex(), var1x -> var1 + var1x));

            for (ShareInfo var5 : var2) {
               var5.setLvtIndex((Integer)var3.get(var5.getLvtIndex()));
            }

            IntUnaryOperator var10 = var3x -> {
               Integer var4 = (Integer)var3.get(var3x);
               if (var4 != null) {
                  return var4;
               } else {
                  return var3x < var1 ? var3x : var3x + var2.size();
               }
            };

            for (AbstractInsnNode var8 : this.original.instructions.toArray()) {
               if (var8 instanceof VarInsnNode) {
                  VarInsnNode var9 = (VarInsnNode)var8;
                  var9.var = var10.applyAsInt(var9.var);
               } else if (var8 instanceof IincInsnNode) {
                  IincInsnNode var14 = (IincInsnNode)var8;
                  var14.var = var10.applyAsInt(var14.var);
               }
            }

            if (this.original.localVariables != null) {
               for (LocalVariableNode var13 : this.original.localVariables) {
                  var13.index = var10.applyAsInt(var13.index);
               }
            }
         }
      }
   }

   public static class Wrapper extends WrapMethodStage {
      private final WrapMethodStage inner;
      private final MethodNode handler;
      private final Type operationType;
      private final List<ShareInfo> shares;
      private final boolean isStatic;

      public Wrapper(WrapMethodStage var1, MethodNode var2, Type var3, List<ShareInfo> var4) {
         this.inner = var1;
         this.handler = var2;
         this.operationType = var3;
         this.shares = var4;
         this.isStatic = Bytecode.isStatic(var2);
      }

      @Override
      protected MethodNode getVanillaMethod() {
         return this.inner.getVanillaMethod();
      }

      @Override
      public MethodNode apply(ClassNode var1, LinkedHashSet<ShareInfo> var2) {
         LinkedHashSet var3 = new LinkedHashSet(var2);
         ArrayList var4 = new ArrayList();

         for (ShareInfo var6 : this.shares) {
            if (var3.add(var6)) {
               var4.add(var6);
            }
         }

         MethodNode var12 = this.getVanillaMethod();
         Type[] var13 = Type.getArgumentTypes(var12.desc);
         Type var7 = Type.getReturnType(var12.desc);
         MethodNode var8 = this.inner.apply(var1, var3);
         MethodNode var9 = move(var1, var8);
         fixDesc(var8, var4.size());
         InsnList var10 = new InsnList();
         allocateShares(var4, var10);
         if (!this.isStatic) {
            var10.add(new VarInsnNode(25, 0));
         }

         Bytecode.loadArgs(var13, var10, this.isStatic ? 0 : 1);
         if (!this.isStatic) {
            var10.add(new VarInsnNode(25, 0));
         }

         loadShares(var3, var10);
         Type[] var11 = var3.stream().map(var0 -> var0.getShareType().getImplType()).toArray(Type[]::new);
         OperationUtils.makeOperation(var13, var7, var10, !this.isStatic, var11, var1, this.operationType, var9.name, (var2x, var3x) -> {
            InsnList var4x = new InsnList();
            var3x.accept(var4x);
            var4x.add(ASMUtils.getInvokeInstruction(var1, var9));
            return var4x;
         });
         loadShares(this.shares, var10);
         var10.add(ASMUtils.getInvokeInstruction(var1, this.handler));
         this.coerceReturnType(var10, var7);
         var10.add(new InsnNode(var7.getOpcode(172)));
         var8.instructions.add(var10);
         return var8;
      }

      private static void fixDesc(MethodNode var0, int var1) {
         Type[] var2 = Type.getArgumentTypes(var0.desc);
         var2 = ArrayUtils.subarray(var2, 0, var2.length - var1);
         var0.desc = Type.getMethodDescriptor(Type.getReturnType(var0.desc), var2);
      }

      private static void allocateShares(List<ShareInfo> var0, InsnList var1) {
         for (ShareInfo var3 : var0) {
            var1.add(var3.initialize());
         }
      }

      private static void loadShares(Collection<ShareInfo> var0, InsnList var1) {
         for (ShareInfo var3 : var0) {
            var1.add(var3.load());
         }
      }

      private void coerceReturnType(InsnList var1, Type var2) {
         Type var3 = Type.getReturnType(this.handler.desc);
         if (var2.getSort() >= 9 && !var2.equals(var3)) {
            var1.add(new TypeInsnNode(192, var2.getInternalName()));
         }
      }
   }
}
