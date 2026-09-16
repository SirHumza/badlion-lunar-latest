package com.moonsworth.lunar.lib.adventure.util;

import com.moonsworth.lunar.lib.adventure.builder.AbstractBuilder;
import org.jetbrains.annotations.CheckReturnValue;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface InheritanceAwareMap<C, V> {
   @NotNull
   static <K, E> InheritanceAwareMap<K, E> empty() {
      return InheritanceAwareMapImpl.EMPTY;
   }

   static <K, E> InheritanceAwareMap.@NotNull Builder<K, E> builder() {
      return new InheritanceAwareMapImpl.BuilderImpl();
   }

   static <K, E> InheritanceAwareMap.@NotNull Builder<K, E> builder(InheritanceAwareMap<? extends K, ? extends E> var0) {
      return new InheritanceAwareMapImpl.BuilderImpl().putAll(var0);
   }

   boolean containsKey(@NotNull Class<? extends C> var1);

   @Nullable
   V get(@NotNull Class<? extends C> var1);

   @CheckReturnValue
   @NotNull
   InheritanceAwareMap<C, V> with(@NotNull Class<? extends C> var1, @NotNull V var2);

   @CheckReturnValue
   @NotNull
   InheritanceAwareMap<C, V> without(@NotNull Class<? extends C> var1);

   interface Builder<C, V> extends AbstractBuilder<InheritanceAwareMap<C, V>> {
      @NotNull
      InheritanceAwareMap.Builder<C, V> strict(boolean var1);

      @NotNull
      InheritanceAwareMap.Builder<C, V> put(@NotNull Class<? extends C> var1, @NotNull V var2);

      @NotNull
      InheritanceAwareMap.Builder<C, V> remove(@NotNull Class<? extends C> var1);

      @NotNull
      InheritanceAwareMap.Builder<C, V> putAll(@NotNull InheritanceAwareMap<? extends C, ? extends V> var1);
   }
}
