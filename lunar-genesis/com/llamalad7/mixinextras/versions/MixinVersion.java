package com.llamalad7.mixinextras.versions;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.AnnotationNode;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.mixin.extensibility.IMixinConfig;
import org.spongepowered.asm.mixin.injection.modify.LocalVariableDiscriminator;
import org.spongepowered.asm.mixin.injection.struct.InjectionInfo;
import org.spongepowered.asm.mixin.injection.struct.MemberInfo;
import org.spongepowered.asm.mixin.injection.struct.Target;
import org.spongepowered.asm.mixin.refmap.IMixinContext;
import org.spongepowered.asm.util.VersionNumber;

public abstract class MixinVersion {
   private static final List<String> VERSIONS = Arrays.asList("0.8.7", "0.8.6", "0.8.4", "0.8.3", "0.8");
   private static final MixinVersion INSTANCE;

   public static MixinVersion getInstance() {
      return INSTANCE;
   }

   public abstract RuntimeException makeInvalidInjectionException(InjectionInfo var1, String var2);

   public abstract IMixinContext getMixin(InjectionInfo var1);

   public abstract LocalVariableDiscriminator.Context makeLvtContext(InjectionInfo var1, Type var2, boolean var3, Target var4, AbstractInsnNode var5);

   public abstract void preInject(InjectionInfo var1);

   public abstract AnnotationNode getAnnotation(InjectionInfo var1);

   public abstract int getOrder(InjectionInfo var1);

   public abstract Collection<Target> getTargets(InjectionInfo var1);

   public abstract MemberInfo parseMemberInfo(String var1, InjectionInfo var2);

   public abstract <T> T getDecoration(IMixinConfig var1, String var2, T var3);

   static {
      VersionNumber var0 = VersionNumber.parse(MixinEnvironment.getCurrentEnvironment().getVersion());
      MixinVersion var1 = null;

      for (String var3 : VERSIONS) {
         if (VersionNumber.parse(var3).compareTo(var0) <= 0) {
            try {
               Class var4 = Class.forName(MixinVersion.class.getPackage().getName() + ".MixinVersionImpl_v" + var3.replace('.', '_'));
               var1 = (MixinVersion)var4.getConstructor().newInstance();
               break;
            } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException | ClassNotFoundException var5) {
               throw new RuntimeException(var5);
            }
         }
      }

      INSTANCE = var1;
   }
}
