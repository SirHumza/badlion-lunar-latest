package com.llamalad7.mixinextras.utils;

import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.ProtectionDomain;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.mixin.MixinEnvironment;
import sun.misc.Unsafe;

public class ClassGenUtils {
   private static final ClassGenUtils.Definer DEFINER;
   private static final Map<String, byte[]> DEFINITIONS = new HashMap<>();

   public static void defineClass(ClassNode var0, Lookup var1) {
      ClassWriter var2 = new ClassWriter(2);
      var0.accept(var2);
      byte[] var3 = var2.toByteArray();
      String var4 = var0.name.replace('/', '.');

      try {
         DEFINER.define(var4, var3, var1);
      } catch (Throwable var6) {
         throw new RuntimeException(String.format("Failed to define class %s from %s! Please report to LlamaLad7!", var0.name, var1), var6);
      }

      DEFINITIONS.put(var4, var3);
      MixinInternals.registerClassInfo(var0);
      MixinInternals.getExtensions().export(MixinEnvironment.getCurrentEnvironment(), var0.name, false, var0);
   }

   public static Map<String, byte[]> getDefinitions() {
      return Collections.unmodifiableMap(DEFINITIONS);
   }

   static {
      ClassGenUtils.Definer var0;
      try {
         Method var1 = Unsafe.class.getMethod("defineClass", String.class, byte[].class, int.class, int.class, ClassLoader.class, ProtectionDomain.class);
         Field var6 = Unsafe.class.getDeclaredField("theUnsafe");
         var6.setAccessible(true);
         Unsafe var7 = (Unsafe)var6.get(null);
         var0 = (var2x, var3x, var4x) -> var1.invoke(
            var7, var2x, var3x, 0, var3x.length, var4x.lookupClass().getClassLoader(), var4x.lookupClass().getProtectionDomain()
         );
      } catch (IllegalAccessException | NoSuchFieldException | NoSuchMethodException var5) {
         try {
            Method var2 = Lookup.class.getMethod("defineClass", byte[].class);
            var0 = (var1x, var2x, var3x) -> var2.invoke(var3x, var2x);
         } catch (NoSuchMethodException var4) {
            RuntimeException var3 = new RuntimeException("Could not resolve class definer! Please report to LlamaLad7.");
            var3.addSuppressed(var5);
            var3.addSuppressed(var4);
            throw var3;
         }
      }

      DEFINER = var0;
   }

   @FunctionalInterface
   private interface Definer {
      void define(String var1, byte[] var2, Lookup var3);
   }
}
