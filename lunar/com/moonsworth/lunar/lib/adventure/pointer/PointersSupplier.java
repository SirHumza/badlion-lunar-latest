package com.moonsworth.lunar.lib.adventure.pointer;

import com.moonsworth.lunar.lib.adventure.builder.AbstractBuilder;
import java.util.function.Function;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface PointersSupplier<T> {
   @NotNull
   static <T> PointersSupplier.Builder<T> builder() {
      return new PointersSupplierImpl.BuilderImpl<>();
   }

   @NotNull
   Pointers view(@NotNull T var1);

   <P> boolean supports(@NotNull Pointer<P> var1);

   @Nullable
   <P> Function<? super T, P> resolver(@NotNull Pointer<P> var1);

   interface Builder<T> extends AbstractBuilder<PointersSupplier<T>> {
      @Contract("_ -> this")
      @NotNull
      PointersSupplier.Builder<T> parent(@Nullable PointersSupplier<? super T> var1);

      @Contract("_, _ -> this")
      @NotNull
      <P> PointersSupplier.Builder<T> resolving(@NotNull Pointer<P> var1, @NotNull Function<T, P> var2);
   }
}
