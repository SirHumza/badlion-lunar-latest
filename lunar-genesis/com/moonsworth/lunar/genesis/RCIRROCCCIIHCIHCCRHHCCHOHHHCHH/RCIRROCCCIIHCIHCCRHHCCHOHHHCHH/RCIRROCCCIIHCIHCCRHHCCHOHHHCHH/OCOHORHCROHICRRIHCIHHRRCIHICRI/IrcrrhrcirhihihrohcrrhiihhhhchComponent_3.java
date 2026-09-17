package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI;

import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
public final class IIRHCHHOICHRICOOCRORCCIOOIHOIR {
   private static final Map<Class<?>, Class<?>> IICHHIRCCOHOCIRICRCIHIOCOCOCCH;
   private static final Map<Class<?>, Class<?>> CHCORHROIIORCHHCCROHHCROOCHOCH;

   private IIRHCHHOICHRICOOCRORCCIOOIHOIR() {
   }

   private static void add(Map<Class<?>, Class<?>> var0, Map<Class<?>, Class<?>> var1, Class<?> var2, Class<?> var3) {
      var0.put(var2, var3);
      var1.put(var3, var2);
   }

   public static Set<Class<?>> allPrimitiveTypes() {
      return IICHHIRCCOHOCIRICRCIHIOCOCOCCH.keySet();
   }

   public static Set<Class<?>> allWrapperTypes() {
      return CHCORHROIIORCHHCCROHHCROOCHOCH.keySet();
   }

   public static boolean isWrapperType(Class<?> var0) {
      return CHCORHROIIORCHHCCROHHCROOCHOCH.containsKey(IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var0));
   }

   public static <T> Class<T> wrap(Class<T> var0) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var0);
      Class var1 = IICHHIRCCOHOCIRICRCIHIOCOCOCCH.get(var0);
      return var1 == null ? var0 : var1;
   }

   public static <T> Class<T> unwrap(Class<T> var0) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var0);
      Class var1 = CHCORHROIIORCHHCCROHHCROOCHOCH.get(var0);
      return var1 == null ? var0 : var1;
   }

   static {
      LinkedHashMap var0 = new LinkedHashMap(16);
      LinkedHashMap var1 = new LinkedHashMap(16);
      add(var0, var1, boolean.class, Boolean.class);
      add(var0, var1, byte.class, Byte.class);
      add(var0, var1, char.class, Character.class);
      add(var0, var1, double.class, Double.class);
      add(var0, var1, float.class, Float.class);
      add(var0, var1, int.class, Integer.class);
      add(var0, var1, long.class, Long.class);
      add(var0, var1, short.class, Short.class);
      add(var0, var1, void.class, Void.class);
      IICHHIRCCOHOCIRICRCIHIOCOCOCCH = Collections.unmodifiableMap(var0);
      CHCORHROIIORCHHCCROHHCROOCHOCH = Collections.unmodifiableMap(var1);
   }
}
