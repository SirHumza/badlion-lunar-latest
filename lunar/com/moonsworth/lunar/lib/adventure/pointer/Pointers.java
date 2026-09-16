package com.moonsworth.lunar.lib.adventure.pointer;

import com.moonsworth.lunar.lib.adventure.builder.AbstractBuilder;
import com.moonsworth.lunar.lib.adventure.util.Buildable;
import java.util.Optional;
import java.util.function.Supplier;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.UnknownNullability;

public interface Pointers extends Buildable<Pointers, Pointers.Builder> {
   @Contract(pure = true)
   @NotNull
   static Pointers empty() {
      return PointersImpl.EMPTY;
   }

   @Contract(pure = true)
   @NotNull
   static Pointers.Builder builder() {
      return new PointersImpl.BuilderImpl();
   }

   @NotNull
   <T> Optional<T> get(@NotNull Pointer<T> var1);

   @Contract("_, null -> _; _, !null -> !null")
   @Nullable
   default <T> T getOrDefault(@NotNull Pointer<T> var1, @Nullable T var2) {
      return this.<T>get(var1).orElse((T)var2);
   }

   default <T> @UnknownNullability T getOrDefaultFrom(@NotNull Pointer<T> var1, @NotNull Supplier<? extends T> var2) {
      return this.<T>get(var1).orElseGet(var2);
   }

   <T> boolean supports(@NotNull Pointer<T> var1);

   interface Builder extends AbstractBuilder<Pointers>, Buildable.Builder<Pointers> {
      @Contract("_, _ -> this")
      @NotNull
      default <T> Pointers.Builder withStatic(@NotNull Pointer<T> var1, @Nullable T var2) {
         return this.withDynamic(var1, () -> (T)var2);
      }

      @Contract("_, _ -> this")
      @NotNull
      <T> Pointers.Builder withDynamic(@NotNull Pointer<T> var1, @NotNull Supplier<@Nullable T> var2);
   }
}
