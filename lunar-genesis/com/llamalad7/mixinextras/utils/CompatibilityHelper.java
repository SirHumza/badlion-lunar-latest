package com.llamalad7.mixinextras.utils;

import com.llamalad7.mixinextras.versions.MixinVersion;
import com.llamalad7.mixinextras.wrapper.WrapperInjectionInfo;
import java.util.ArrayList;
import java.util.List;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.AnnotationNode;
import org.spongepowered.asm.mixin.extensibility.IMixinConfig;
import org.spongepowered.asm.mixin.injection.modify.LocalVariableDiscriminator;
import org.spongepowered.asm.mixin.injection.struct.InjectionInfo;
import org.spongepowered.asm.mixin.injection.struct.MemberInfo;
import org.spongepowered.asm.mixin.injection.struct.Target;
import org.spongepowered.asm.mixin.refmap.IMixinContext;

public class CompatibilityHelper {
   public static RuntimeException makeInvalidInjectionException(InjectionInfo var0, String var1) {
      return MixinVersion.getInstance().makeInvalidInjectionException(var0, var1);
   }

   public static IMixinContext getMixin(InjectionInfo var0) {
      return MixinVersion.getInstance().getMixin(var0);
   }

   public static LocalVariableDiscriminator.Context makeLvtContext(InjectionInfo var0, Type var1, boolean var2, Target var3, AbstractInsnNode var4) {
      return MixinVersion.getInstance().makeLvtContext(var0, var1, var2, var3, var4);
   }

   public static void preInject(InjectionInfo var0) {
      MixinVersion.getInstance().preInject(var0);
   }

   public static AnnotationNode getAnnotation(InjectionInfo var0) {
      return MixinVersion.getInstance().getAnnotation(var0);
   }

   public static int getOrder(InjectionInfo var0) {
      return MixinVersion.getInstance().getOrder(var0);
   }

   public static List<Target> getTargets(InjectionInfo var0) {
      return var0 instanceof WrapperInjectionInfo
         ? ((WrapperInjectionInfo)var0).getSelectedTargets()
         : new ArrayList<>(MixinVersion.getInstance().getTargets(var0));
   }

   public static MemberInfo parseMemberInfo(String var0, InjectionInfo var1) {
      return MixinVersion.getInstance().parseMemberInfo(var0, var1);
   }

   public static <T> T getDecoration(IMixinConfig var0, String var1, T var2) {
      return MixinVersion.getInstance().getDecoration(var0, var1, (T)var2);
   }
}
