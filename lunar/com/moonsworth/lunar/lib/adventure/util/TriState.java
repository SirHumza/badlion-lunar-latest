package com.moonsworth.lunar.lib.adventure.util;

import java.util.function.BooleanSupplier;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public enum TriState {
   NOT_SET,
   FALSE,
   TRUE;

   @Nullable
   public Boolean toBoolean() {
      switch (this) {
         case TRUE:
            return Boolean.TRUE;
         case FALSE:
            return Boolean.FALSE;
         default:
            return null;
      }
   }

   public boolean toBooleanOrElse(boolean var1) {
      switch (this) {
         case TRUE:
            return true;
         case FALSE:
            return false;
         default:
            return var1;
      }
   }

   public boolean toBooleanOrElseGet(@NotNull BooleanSupplier var1) {
      switch (this) {
         case TRUE:
            return true;
         case FALSE:
            return false;
         default:
            return var1.getAsBoolean();
      }
   }

   @NotNull
   public static TriState byBoolean(boolean var0) {
      return var0 ? TRUE : FALSE;
   }

   @NotNull
   public static TriState byBoolean(@Nullable Boolean var0) {
      return var0 == null ? NOT_SET : byBoolean(var0.booleanValue());
   }
}
