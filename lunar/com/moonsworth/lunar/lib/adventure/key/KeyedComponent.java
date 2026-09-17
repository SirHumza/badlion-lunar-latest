package com.moonsworth.lunar.lib.adventure.key;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

public interface KeyedValue<T> extends Keyed {
   @NotNull
   static <T> KeyedValue<T> keyedValue(@NotNull Key var0, @NotNull T var1) {
      return new KeyedValueImpl<>(var0, Objects.requireNonNull((T)var1, "value"));
   }

   @Deprecated
   @ApiStatus.ScheduledForRemoval(inVersion = "5.0.0")
   @NotNull
   static <T> KeyedValue<T> of(@NotNull Key var0, @NotNull T var1) {
      return new KeyedValueImpl<>(var0, Objects.requireNonNull((T)var1, "value"));
   }

   @NotNull
   T value();
}
