package com.moonsworth.lunar.lib.adventure.pointer;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Function;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class PointersSupplierImpl<T> implements PointersSupplier<T> {
   @Nullable
   private final PointersSupplier<? super T> parent;
   private final Map<Pointer<?>, Function<T, ?>> resolvers;

   PointersSupplierImpl(@NotNull PointersSupplierImpl.BuilderImpl<T> var1) {
      this.parent = var1.parent;
      this.resolvers = new HashMap<>(var1.resolvers);
   }

   @NotNull
   @Override
   public Pointers view(@NotNull T var1) {
      return new PointersSupplierImpl.ForwardingPointers<>(var1, this);
   }

   @Override
   public <P> boolean supports(@NotNull Pointer<P> var1) {
      if (this.resolvers.containsKey(Objects.requireNonNull(var1, "pointer"))) {
         return true;
      } else {
         return this.parent == null ? false : this.parent.supports(var1);
      }
   }

   @Nullable
   @Override
   public <P> Function<? super T, P> resolver(@NotNull Pointer<P> var1) {
      Function var2 = this.resolvers.get(Objects.requireNonNull(var1, "pointer"));
      if (var2 != null) {
         return var2;
      } else {
         return this.parent == null ? null : this.parent.resolver(var1);
      }
   }

   static final class BuilderImpl<T> implements PointersSupplier.Builder<T> {
      @Nullable
      private PointersSupplier<? super T> parent = null;
      private final Map<Pointer<?>, Function<T, ?>> resolvers = new HashMap<>();

      @NotNull
      @Override
      public PointersSupplier.Builder<T> parent(@Nullable PointersSupplier<? super T> var1) {
         this.parent = var1;
         return this;
      }

      @NotNull
      @Override
      public <P> PointersSupplier.Builder<T> resolving(@NotNull Pointer<P> var1, @NotNull Function<T, P> var2) {
         this.resolvers.put(var1, var2);
         return this;
      }

      @NotNull
      public PointersSupplier<T> build() {
         return new PointersSupplierImpl<>(this);
      }
   }

   static final class ForwardingPointers<U> implements Pointers {
      private final U instance;
      private final PointersSupplierImpl<U> supplier;

      ForwardingPointers(@NotNull U var1, @NotNull PointersSupplierImpl<U> var2) {
         this.instance = (U)var1;
         this.supplier = var2;
      }

      @NotNull
      @Override
      public <T> Optional<T> get(@NotNull Pointer<T> var1) {
         Function var2 = this.supplier.resolvers.get(Objects.requireNonNull(var1, "pointer"));
         if (var2 == null) {
            PointersSupplier var3 = this.supplier.parent;
            if (var3 != null) {
               var2 = var3.resolver(var1);
            }
         }

         return var2 == null ? Optional.empty() : Optional.ofNullable((T)var2.apply(this.instance));
      }

      @Override
      public <T> boolean supports(@NotNull Pointer<T> var1) {
         return this.supplier.supports(var1);
      }

      public Pointers.@NotNull Builder toBuilder() {
         Pointers.Builder var1 = this.supplier.parent == null ? Pointers.builder() : this.supplier.parent.view(this.instance).toBuilder();

         for (Entry var3 : this.supplier.resolvers.entrySet()) {
            var1.withDynamic((Pointer<T>)var3.getKey(), () -> (T)((Function)var3.getValue()).apply(this.instance));
         }

         return var1;
      }
   }
}
