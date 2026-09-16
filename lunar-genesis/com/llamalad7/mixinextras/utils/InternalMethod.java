package com.llamalad7.mixinextras.utils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.stream.Collectors;

interface InternalMethod<O, R> {
   R call(O var1, Object... var2);

   static <O, R> InternalMethod<O, R> of(Class<?> var0, String var1, Class<?>... var2) {
      Method var3;
      try {
         var3 = var0.getDeclaredMethod(var1, var2);
      } catch (NoSuchMethodException var5) {
         throw new RuntimeException(
            String.format(
               "Failed to find method %s::%s(%s)! Please report to LlamaLad7!",
               var0,
               var1,
               Arrays.stream(var2).map(Class::getName).collect(Collectors.joining(", "))
            ),
            var5
         );
      }

      var3.setAccessible(true);
      return (var4, var5x) -> {
         try {
            return (R)var3.invoke(var4, var5x);
         } catch (IllegalAccessException | InvocationTargetException var7) {
            throw new RuntimeException(
               String.format(
                  "Failed to call %s::%s(%s) with args [%s]! Please report to LlamaLad7!",
                  var0,
                  var1,
                  Arrays.stream(var2).map(Class::getName).collect(Collectors.joining(", ")),
                  Arrays.stream(var5x).map(Object::toString).collect(Collectors.joining(", "))
               ),
               var7
            );
         }
      };
   }

   static <O, R> InternalMethod<O, R> of(String var0, String var1, Class<?>... var2) {
      try {
         return of(Class.forName(var0), var1, var2);
      } catch (ClassNotFoundException var4) {
         throw new RuntimeException(String.format("Failed to find class %s! Please report to LlamaLad7!", var0), var4);
      }
   }
}
