package com.llamalad7.mixinextras.utils;

import java.lang.reflect.Field;

interface InternalField<O, T> {
   T get(O var1);

   void set(O var1, T var2);

   static <O, T> InternalField<O, T> of(final Class<?> var0, final String var1) {
      final Field var2;
      try {
         var2 = var0.getDeclaredField(var1);
      } catch (NoSuchFieldException var4) {
         throw new RuntimeException(String.format("Failed to find field %s::%s! Please report to LlamaLad7!", var0, var1), var4);
      }

      var2.setAccessible(true);
      return new InternalField<O, T>() {
         @Override
         public T get(O var1x) {
            try {
               return (T)var2.get(var1x);
            } catch (IllegalAccessException var3) {
               throw new RuntimeException(String.format("Failed to get %s::%s on %s! Please report to LlamaLad7!", var0, var1, var1x), var3);
            }
         }

         @Override
         public void set(O var1x, T var2x) {
            try {
               var2.set(var1x, var2x);
            } catch (IllegalAccessException var4) {
               throw new RuntimeException(String.format("Failed to set %s::%s to %s on %s! Please report to LlamaLad7!", var0, var1, var2x, var1x), var4);
            }
         }
      };
   }

   static <O, T> InternalField<O, T> of(String var0, String var1) {
      try {
         return of(Class.forName(var0), var1);
      } catch (ClassNotFoundException var3) {
         throw new RuntimeException(String.format("Failed to find class %s! Please report to LlamaLad7!", var0), var3);
      }
   }
}
