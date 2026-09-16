package com.llamalad7.mixinextras.injector.wrapoperation;

import java.util.Arrays;
import java.util.stream.Collectors;

public class WrapOperationRuntime {
   public static void checkArgumentCount(Object[] var0, int var1, String var2) {
      if (var0.length != var1) {
         throwIncorrectArgumentCount(var0, var1, var2);
      }
   }

   private static void throwIncorrectArgumentCount(Object[] var0, int var1, String var2) {
      String var3 = Arrays.stream(var0).map(var0x -> var0x == null ? "null" : var0x.getClass().getName()).collect(Collectors.joining(", ", "[", "]"));
      throw new IncorrectArgumentCountException(
         String.format(
            "Incorrect number of arguments passed to Operation::call! Expected %s but got %s. Expected types were %s, actual types were %s.",
            var1,
            var0.length,
            var2,
            var3
         )
      );
   }
}
