package com.llamalad7.mixinextras.versions;

import java.util.Collection;
import java.util.stream.Collectors;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.AnnotationNode;
import org.spongepowered.asm.mixin.extensibility.IMixinConfig;
import org.spongepowered.asm.mixin.injection.modify.LocalVariableDiscriminator;
import org.spongepowered.asm.mixin.injection.struct.InjectionInfo;
import org.spongepowered.asm.mixin.injection.struct.MemberInfo;
import org.spongepowered.asm.mixin.injection.struct.Target;
import org.spongepowered.asm.mixin.injection.throwables.InvalidInjectionException;
import org.spongepowered.asm.mixin.refmap.IMixinContext;

public class MixinVersionImpl_v0_8 extends MixinVersion {
   @Override
   public RuntimeException makeInvalidInjectionException(InjectionInfo var1, String var2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: Constructor org/spongepowered/asm/mixin/injection/throwables/InvalidInjectionException.<init>(Lorg/spongepowered/asm/mixin/injection/struct/InjectionInfo;Ljava/lang/String;)V not found
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.ExprUtil.getSyntheticParametersMask(ExprUtil.java:49)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.InvocationExprent.appendParamList(InvocationExprent.java:982)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.NewExprent.toJava(NewExprent.java:462)
      //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.getCastedExprent(ExprProcessor.java:1054)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.ExitExprent.toJava(ExitExprent.java:85)
      //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.listToJava(ExprProcessor.java:925)
      //   at org.jetbrains.java.decompiler.modules.decompiler.stats.BasicBlockStatement.toJava(BasicBlockStatement.java:87)
      //   at org.jetbrains.java.decompiler.modules.decompiler.stats.RootStatement.toJava(RootStatement.java:36)
      //   at org.jetbrains.java.decompiler.main.ClassWriter.writeMethod(ClassWriter.java:1351)
      //
      // Bytecode:
      // 0: new org/spongepowered/asm/mixin/injection/throwables/InvalidInjectionException
      // 3: dup
      // 4: aload 1
      // 5: aload 2
      // 6: invokespecial org/spongepowered/asm/mixin/injection/throwables/InvalidInjectionException.<init> (Lorg/spongepowered/asm/mixin/injection/struct/InjectionInfo;Ljava/lang/String;)V
      // 9: areturn
   }

   @Override
   public IMixinContext getMixin(InjectionInfo var1) {
      return var1.getContext();
   }

   @Override
   public LocalVariableDiscriminator.Context makeLvtContext(InjectionInfo var1, Type var2, boolean var3, Target var4, AbstractInsnNode var5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: Constructor org/spongepowered/asm/mixin/injection/modify/LocalVariableDiscriminator$Context.<init>(Lorg/objectweb/asm/Type;ZLorg/spongepowered/asm/mixin/injection/struct/Target;Lorg/objectweb/asm/tree/AbstractInsnNode;)V not found
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.ExprUtil.getSyntheticParametersMask(ExprUtil.java:49)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.InvocationExprent.appendParamList(InvocationExprent.java:982)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.NewExprent.toJava(NewExprent.java:462)
      //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.getCastedExprent(ExprProcessor.java:1054)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.ExitExprent.toJava(ExitExprent.java:85)
      //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.listToJava(ExprProcessor.java:925)
      //   at org.jetbrains.java.decompiler.modules.decompiler.stats.BasicBlockStatement.toJava(BasicBlockStatement.java:87)
      //   at org.jetbrains.java.decompiler.modules.decompiler.stats.RootStatement.toJava(RootStatement.java:36)
      //   at org.jetbrains.java.decompiler.main.ClassWriter.writeMethod(ClassWriter.java:1351)
      //
      // Bytecode:
      // 0: new org/spongepowered/asm/mixin/injection/modify/LocalVariableDiscriminator$Context
      // 3: dup
      // 4: aload 2
      // 5: iload 3
      // 6: aload 4
      // 8: aload 5
      // a: invokespecial org/spongepowered/asm/mixin/injection/modify/LocalVariableDiscriminator$Context.<init> (Lorg/objectweb/asm/Type;ZLorg/spongepowered/asm/mixin/injection/struct/Target;Lorg/objectweb/asm/tree/AbstractInsnNode;)V
      // d: areturn
   }

   @Override
   public void preInject(InjectionInfo var1) {
      throw new AssertionError("Cannot preInject until 0.8.3");
   }

   @Override
   public AnnotationNode getAnnotation(InjectionInfo var1) {
      return var1.getAnnotation();
   }

   @Override
   public int getOrder(InjectionInfo var1) {
      throw new AssertionError("Cannot getOrder until 0.8.7");
   }

   @Override
   public Collection<Target> getTargets(InjectionInfo var1) {
      IMixinContext var2 = MixinVersion.getInstance().getMixin(var1);
      return var1.getTargets().stream().<Target>map(var2::getTargetMethod).collect(Collectors.toList());
   }

   @Override
   public MemberInfo parseMemberInfo(String var1, InjectionInfo var2) {
      return MemberInfo.parse(var1, var2.getContext().getReferenceMapper(), var2.getContext().getClassRef());
   }

   @Override
   public <T> T getDecoration(IMixinConfig var1, String var2, T var3) {
      return (T)var3;
   }
}
