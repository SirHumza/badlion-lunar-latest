package com.llamalad7.mixinextras.lib.apache.commons;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ClassUtils {
   public static final String PACKAGE_SEPARATOR = String.valueOf('.');
   public static final String INNER_CLASS_SEPARATOR = String.valueOf('$');
   private static final Map<Class<?>, Class<?>> primitiveWrapperMap = new HashMap<>();
   private static final Map<Class<?>, Class<?>> wrapperPrimitiveMap = new HashMap<>();
   private static final Map<String, String> abbreviationMap;
   private static final Map<String, String> reverseAbbreviationMap;

   public static List<Class<?>> getAllInterfaces(Class<?> var0) {
      if (var0 == null) {
         return null;
      }

      LinkedHashSet var1 = new LinkedHashSet();
      getAllInterfaces(var0, var1);
      return new ArrayList<>(var1);
   }

   private static void getAllInterfaces(Class<?> var0, HashSet<Class<?>> var1) {
      while (var0 != null) {
         Class[] var2 = var0.getInterfaces();

         for (Class var6 : var2) {
            if (var1.add(var6)) {
               getAllInterfaces(var6, var1);
            }
         }

         var0 = var0.getSuperclass();
      }
   }

   static {
      primitiveWrapperMap.put(boolean.class, Boolean.class);
      primitiveWrapperMap.put(byte.class, Byte.class);
      primitiveWrapperMap.put(char.class, Character.class);
      primitiveWrapperMap.put(short.class, Short.class);
      primitiveWrapperMap.put(int.class, Integer.class);
      primitiveWrapperMap.put(long.class, Long.class);
      primitiveWrapperMap.put(double.class, Double.class);
      primitiveWrapperMap.put(float.class, Float.class);
      primitiveWrapperMap.put(void.class, void.class);

      for (Class var1 : primitiveWrapperMap.keySet()) {
         Class var2 = primitiveWrapperMap.get(var1);
         if (!var1.equals(var2)) {
            wrapperPrimitiveMap.put(var2, var1);
         }
      }

      HashMap var4 = new HashMap();
      var4.put("int", "I");
      var4.put("boolean", "Z");
      var4.put("float", "F");
      var4.put("long", "J");
      var4.put("short", "S");
      var4.put("byte", "B");
      var4.put("double", "D");
      var4.put("char", "C");
      var4.put("void", "V");
      HashMap var5 = new HashMap();

      for (Entry var3 : var4.entrySet()) {
         var5.put(var3.getValue(), var3.getKey());
      }

      abbreviationMap = Collections.unmodifiableMap(var4);
      reverseAbbreviationMap = Collections.unmodifiableMap(var5);
   }
}
