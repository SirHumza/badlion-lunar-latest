package com.moonsworth.lunar.lib.adventure.util;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class InheritanceAwareMapImpl<C, V> implements InheritanceAwareMap<C, V> {
   private static final Object NONE = new Object();
   static final InheritanceAwareMapImpl EMPTY = new InheritanceAwareMapImpl(false, Collections.emptyMap());
   private final Map<Class<? extends C>, V> declaredValues;
   private final boolean strict;
   private final transient ConcurrentMap<Class<? extends C>, Object> cache = new ConcurrentHashMap<>();

   InheritanceAwareMapImpl(boolean var1, Map<Class<? extends C>, V> var2) {
      this.strict = var1;
      this.declaredValues = var2;
   }

   @Override
   public boolean containsKey(@NotNull Class<? extends C> var1) {
      return this.get(var1) != null;
   }

   @Nullable
   @Override
   public V get(@NotNull Class<? extends C> var1) {
      Object var2 = this.cache.computeIfAbsent(var1, var1x -> {
         Object var2x = this.declaredValues.get(var1x);
         if (var2x != null) {
            return var2x;
         }

         for (Entry var4 : this.declaredValues.entrySet()) {
            if (((Class)var4.getKey()).isAssignableFrom((Class<?>)var1x)) {
               return var4.getValue();
            }
         }

         return NONE;
      });
      return (V)(var2 == NONE ? null : var2);
   }

   @NotNull
   @Override
   public InheritanceAwareMap<C, V> with(@NotNull Class<? extends C> var1, @NotNull V var2) {
      if (Objects.equals(this.declaredValues.get(var1), var2)) {
         return this;
      }

      if (this.strict) {
         validateNoneInHierarchy(var1, this.declaredValues);
      }

      LinkedHashMap var3 = new LinkedHashMap<>(this.declaredValues);
      var3.put(var1, var2);
      return new InheritanceAwareMapImpl<>(this.strict, Collections.unmodifiableMap(var3));
   }

   @NotNull
   @Override
   public InheritanceAwareMap<C, V> without(@NotNull Class<? extends C> var1) {
      if (!this.declaredValues.containsKey(var1)) {
         return this;
      }

      LinkedHashMap var2 = new LinkedHashMap<>(this.declaredValues);
      var2.remove(var1);
      return new InheritanceAwareMapImpl<>(this.strict, Collections.unmodifiableMap(var2));
   }

   private static void validateNoneInHierarchy(Class<?> var0, Map<? extends Class<?>, ?> var1) {
      for (Class var3 : var1.keySet()) {
         testHierarchy(var3, var0);
      }
   }

   private static void testHierarchy(Class<?> var0, Class<?> var1) {
      if (!var0.equals(var1) && (var0.isAssignableFrom(var1) || var1.isAssignableFrom(var0))) {
         throw new IllegalArgumentException(
            "Conflict detected between already registered type "
               + var0
               + " and newly registered type "
               + var1
               + "! Types in a strict inheritance-aware map must not share a common hierarchy!"
         );
      }
   }

   static final class BuilderImpl<C, V> implements InheritanceAwareMap.Builder<C, V> {
      private boolean strict;
      private final Map<Class<? extends C>, V> values = new LinkedHashMap<>();

      @NotNull
      public InheritanceAwareMap<C, V> build() {
         return new InheritanceAwareMapImpl<>(this.strict, Collections.unmodifiableMap(new LinkedHashMap<>(this.values)));
      }

      @NotNull
      @Override
      public InheritanceAwareMap.Builder<C, V> strict(boolean var1) {
         if (var1 && !this.strict) {
            for (Class var3 : this.values.keySet()) {
               InheritanceAwareMapImpl.validateNoneInHierarchy(var3, this.values);
            }
         }

         this.strict = var1;
         return this;
      }

      @NotNull
      @Override
      public InheritanceAwareMap.Builder<C, V> put(@NotNull Class<? extends C> var1, @NotNull V var2) {
         if (this.strict) {
            InheritanceAwareMapImpl.validateNoneInHierarchy(var1, this.values);
         }

         this.values.put(Objects.requireNonNull(var1, "clazz"), Objects.requireNonNull((V)var2, "value"));
         return this;
      }

      @NotNull
      @Override
      public InheritanceAwareMap.Builder<C, V> remove(@NotNull Class<? extends C> var1) {
         this.values.remove(Objects.requireNonNull(var1, "clazz"));
         return this;
      }

      @NotNull
      @Override
      public InheritanceAwareMap.Builder<C, V> putAll(@NotNull InheritanceAwareMap<? extends C, ? extends V> var1) {
         InheritanceAwareMapImpl var2 = (InheritanceAwareMapImpl)var1;
         if (this.strict && (!this.values.isEmpty() || !var2.strict)) {
            for (Entry var4 : var2.declaredValues.entrySet()) {
               InheritanceAwareMapImpl.validateNoneInHierarchy((Class<?>)var4.getKey(), this.values);
               this.values.put((Class<? extends C>)var4.getKey(), (V)var4.getValue());
            }

            return this;
         } else {
            this.values.putAll(var2.declaredValues);
            return this;
         }
      }
   }
}
