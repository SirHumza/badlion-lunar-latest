package com.moonsworth.lunar.lib.adventure.util;

import org.jetbrains.annotations.NotNull;

public abstract class Nag extends RuntimeException {
   private static final long serialVersionUID = -695562541413409498L;

   public static void print(@NotNull Nag var0) {
      var0.printStackTrace();
   }

   protected Nag(String var1) {
      super(var1);
   }
}
