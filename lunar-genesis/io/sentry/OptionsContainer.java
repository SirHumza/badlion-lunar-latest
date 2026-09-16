package io.sentry;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

@ApiStatus.Internal
public final class OptionsContainer<T> {
   @NotNull
   private final Class<T> clazz;

   @NotNull
   public static <T> OptionsContainer<T> create(@NotNull Class<T> var0) {
      return new OptionsContainer<>(var0);
   }

   private OptionsContainer(@NotNull Class<T> var1) {
      this.clazz = var1;
   }

   @NotNull
   public T createInstance() {
      return this.clazz.getDeclaredConstructor().newInstance();
   }
}
