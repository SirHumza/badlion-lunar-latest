package com.llamalad7.mixinextras.utils;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import org.spongepowered.asm.mixin.injection.struct.Target;

public class TargetDecorations {
   private static final Map<Target, Map<String, Object>> IMPL = new WeakHashMap<>();

   public static boolean has(Target var0, String var1) {
      return IMPL.containsKey(var0) && IMPL.get(var0).containsKey(var1);
   }

   public static <T> T get(Target var0, String var1) {
      return (T)(IMPL.containsKey(var0) ? IMPL.get(var0).get(var1) : null);
   }

   public static <T> T getOrPut(Target var0, String var1, Supplier<T> var2) {
      return (T)IMPL.computeIfAbsent(var0, var0x -> new HashMap<>()).computeIfAbsent(var1, var1x -> var2.get());
   }

   public static void put(Target var0, String var1, Object var2) {
      IMPL.computeIfAbsent(var0, var0x -> new HashMap<>()).put(var1, var2);
   }

   public static <T> void modify(Target var0, String var1, UnaryOperator<T> var2) {
      IMPL.computeIfAbsent(var0, var0x -> new HashMap<>()).put(var1, var2.apply(get(var0, var1)));
   }

   public static void remove(Target var0, String var1) {
      if (IMPL.containsKey(var0)) {
         IMPL.get(var0).remove(var1);
      }
   }
}
