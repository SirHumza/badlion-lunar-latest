package io.sentry.util;

import java.util.Arrays;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ApiStatus.Internal
public final class Objects {
   private Objects() {
   }

   public static <T> T requireNonNull(@Nullable T var0, @NotNull String var1) {
      if (var0 == null) {
         throw new IllegalArgumentException(var1);
      } else {
         return (T)var0;
      }
   }

   public static boolean equals(@Nullable Object var0, @Nullable Object var1) {
      return var0 == var1 || var0 != null && var0.equals(var1);
   }

   public static int hash(@Nullable Object... var0) {
      return Arrays.hashCode(var0);
   }
}
