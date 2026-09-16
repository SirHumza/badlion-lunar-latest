package com.moonsworth.lunar.ichor.util;

public class FatalIchorError extends Error {
   public FatalIchorError(String var1) {
      this(var1, null);
   }

   public FatalIchorError(String var1, Throwable var2) {
      super(
         "["
            + (Thread.currentThread().getContextClassLoader() == null ? "UnknownClassLoader" : Thread.currentThread().getContextClassLoader().getName())
            + "] "
            + var1,
         var2
      );
   }
}
