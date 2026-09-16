package com.moonsworth.lunar.lib.adventure.pointer;

import java.util.Optional;
import java.util.function.Supplier;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.UnknownNullability;

public interface Pointered {
   @NotNull
   default <T> Optional<T> get(@NotNull Pointer<T> var1) {
      return this.pointers().get(var1);
   }

   @Contract("_, null -> _; _, !null -> !null")
   @Nullable
   default <T> T getOrDefault(@NotNull Pointer<T> var1, @Nullable T var2) {
      return this.pointers().getOrDefault(var1, (T)var2);
   }

   default <T> @UnknownNullability T getOrDefaultFrom(@NotNull Pointer<T> var1, @NotNull Supplier<? extends T> var2) {
      return this.pointers().getOrDefaultFrom(var1, var2);
   }

   @NotNull
   default Pointers pointers() {
      return Pointers.empty();
   }
}
