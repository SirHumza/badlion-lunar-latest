package com.moonsworth.lunar.lib.adventure.key;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class InvalidKeyException extends RuntimeException {
   private static final long serialVersionUID = -5413304087321449434L;
   private final String keyNamespace;
   private final String keyValue;

   InvalidKeyException(@NotNull String var1, @NotNull String var2, @Nullable String var3) {
      super(var3);
      this.keyNamespace = var1;
      this.keyValue = var2;
   }

   @NotNull
   public final String keyNamespace() {
      return this.keyNamespace;
   }

   @NotNull
   public final String keyValue() {
      return this.keyValue;
   }
}
