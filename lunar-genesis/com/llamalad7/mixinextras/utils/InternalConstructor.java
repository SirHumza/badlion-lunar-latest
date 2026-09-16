package com.llamalad7.mixinextras.utils;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.stream.Collectors;

interface InternalConstructor<T> {
   T newInstance(Object... var1);

   static <T> InternalConstructor<T> of(Class<?> var0, Class<?>... var1) {
      Constructor var2;
      try {
         var2 = var0.getDeclaredConstructor(var1);
      } catch (NoSuchMethodException var4) {
         throw new RuntimeException(
            String.format(
               "Failed to find constructor %s(%s)! Please report to LlamaLad7!",
               var0,
               Arrays.stream(var1).map(Class::getName).collect(Collectors.joining(", "))
            ),
            var4
         );
      }

      var2.setAccessible(true);
      return var3 -> {
         try {
            return (T)var2.newInstance(var3);
         } catch (IllegalAccessException | InvocationTargetException | InstantiationException var5) {
            throw new RuntimeException(
               String.format(
                  "Failed to construct %s(%s) with args [%s]! Please report to LlamaLad7!",
                  var0,
                  Arrays.stream(var1).map(Class::getName).collect(Collectors.joining(", ")),
                  Arrays.stream(var3).map(Object::toString).collect(Collectors.joining(", "))
               ),
               var5
            );
         }
      };
   }

   static <T> InternalConstructor<T> of(String var0, Class<?>... var1) {
      try {
         return of(Class.forName(var0), var1);
      } catch (ClassNotFoundException var3) {
         throw new RuntimeException(String.format("Failed to find class %s! Please report to LlamaLad7!", var0), var3);
      }
   }
}
