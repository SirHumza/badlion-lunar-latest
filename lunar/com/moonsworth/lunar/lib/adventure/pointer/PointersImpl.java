package com.moonsworth.lunar.lib.adventure.pointer;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Supplier;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class PointersImpl implements Pointers {
   static final Pointers EMPTY = new Pointers() {
      @NotNull
      @Override
      public <T> Optional<T> get(@NotNull Pointer<T> var1) {
         return Optional.empty();
      }

      @Override
      public <T> boolean supports(@NotNull Pointer<T> var1) {
         return false;
      }

      public Pointers.@NotNull Builder toBuilder() {
         return new PointersImpl.BuilderImpl();
      }

      @Override
      public String toString() {
         return "EmptyPointers";
      }
   };
   private final Map<Pointer<?>, Supplier<?>> pointers;

   PointersImpl(@NotNull PointersImpl.BuilderImpl var1) {
      this.pointers = new HashMap<>(var1.pointers);
   }

   @NotNull
   @Override
   public <T> Optional<T> get(@NotNull Pointer<T> var1) {
      Objects.requireNonNull(var1, "pointer");
      Supplier var2 = this.pointers.get(var1);
      return var2 == null ? Optional.empty() : Optional.ofNullable((T)var2.get());
   }

   @Override
   public <T> boolean supports(@NotNull Pointer<T> var1) {
      Objects.requireNonNull(var1, "pointer");
      return this.pointers.containsKey(var1);
   }

   public Pointers.@NotNull Builder toBuilder() {
      return new PointersImpl.BuilderImpl(this);
   }

   static final class BuilderImpl implements Pointers.Builder {
      private final Map<Pointer<?>, Supplier<?>> pointers;

      BuilderImpl() {
         this.pointers = new HashMap<>();
      }

      BuilderImpl(@NotNull PointersImpl var1) {
         this.pointers = new HashMap<>(var1.pointers);
      }

      @NotNull
      @Override
      public <T> Pointers.Builder withDynamic(@NotNull Pointer<T> var1, @NotNull Supplier<@Nullable T> var2) {
         this.pointers.put(Objects.requireNonNull(var1, "pointer"), Objects.requireNonNull(var2, "value"));
         return this;
      }

      @NotNull
      public Pointers build() {
         return new PointersImpl(this);
      }
   }
}
