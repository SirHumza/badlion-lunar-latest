package io.sentry.util;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ClassLoaderUtils {
   @NotNull
   public static ClassLoader classLoaderOrDefault(@Nullable ClassLoader var0) {
      return var0 == null ? ClassLoader.getSystemClassLoader() : var0;
   }
}
