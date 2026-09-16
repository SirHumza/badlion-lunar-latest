package com.moonsworth.lunar.lib.adventure.util;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Function;
import java.util.function.IntFunction;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class Index<K, V> {
   private final Map<K, V> keyToValue;
   private final Map<V, K> valueToKey;

   private Index(Map<K, V> var1, Map<V, K> var2) {
      this.keyToValue = var1;
      this.valueToKey = var2;
   }

   @NotNull
   public static <K, V extends Enum<V>> Index<K, V> create(Class<V> var0, @NotNull Function<? super V, ? extends K> var1) {
      return create(var0, var1, (V[])var0.getEnumConstants());
   }

   @SafeVarargs
   @NotNull
   public static <K, V extends Enum<V>> Index<K, V> create(Class<V> var0, @NotNull Function<? super V, ? extends K> var1, @NotNull V... var2) {
      return create((V[])var2, var1x -> new EnumMap<>(var0), var1);
   }

   @SafeVarargs
   @NotNull
   public static <K, V> Index<K, V> create(@NotNull Function<? super V, ? extends K> var0, @NotNull V... var1) {
      return create((V[])var1, (IntFunction<Map<V, K>>)(HashMap::new), var0);
   }

   @NotNull
   public static <K, V> Index<K, V> create(@NotNull Function<? super V, ? extends K> var0, @NotNull List<V> var1) {
      return create(var1, (IntFunction<Map<V, K>>)(HashMap::new), var0);
   }

   @NotNull
   private static <K, V> Index<K, V> create(V[] var0, IntFunction<Map<V, K>> var1, @NotNull Function<? super V, ? extends K> var2) {
      return create(Arrays.asList((V[])var0), var1, var2);
   }

   @NotNull
   private static <K, V> Index<K, V> create(List<V> var0, IntFunction<Map<V, K>> var1, @NotNull Function<? super V, ? extends K> var2) {
      int var3 = var0.size();
      HashMap var4 = new HashMap(var3);
      Map var5 = (Map)var1.apply(var3);

      for (int var6 = 0; var6 < var3; var6++) {
         Object var7 = var0.get(var6);
         Object var8 = var2.apply(var7);
         if (var4.putIfAbsent(var8, var7) != null) {
            throw new IllegalStateException(String.format("Key %s already mapped to value %s", var8, var4.get(var8)));
         }

         if (var5.putIfAbsent(var7, var8) != null) {
            throw new IllegalStateException(String.format("Value %s already mapped to key %s", var7, var5.get(var7)));
         }
      }

      return new Index<>(Collections.unmodifiableMap(var4), Collections.unmodifiableMap(var5));
   }

   @NotNull
   public Set<K> keys() {
      return Collections.unmodifiableSet(this.keyToValue.keySet());
   }

   @Nullable
   public K key(@NotNull V var1) {
      return this.valueToKey.get(var1);
   }

   @NotNull
   public K keyOrThrow(@NotNull V var1) {
      Object var2 = this.key((V)var1);
      if (var2 == null) {
         throw new NoSuchElementException("There is no key for value " + var1);
      } else {
         return (K)var2;
      }
   }

   @Contract("_, null -> null; _, !null -> !null")
   public K keyOr(@NotNull V var1, @Nullable K var2) {
      Object var3 = this.key((V)var1);
      return (K)(var3 == null ? var2 : var3);
   }

   @NotNull
   public Set<V> values() {
      return Collections.unmodifiableSet(this.valueToKey.keySet());
   }

   @Nullable
   public V value(@NotNull K var1) {
      return this.keyToValue.get(var1);
   }

   @NotNull
   public V valueOrThrow(@NotNull K var1) {
      Object var2 = this.value((K)var1);
      if (var2 == null) {
         throw new NoSuchElementException("There is no value for key " + var1);
      } else {
         return (V)var2;
      }
   }

   @Contract("_, null -> null; _, !null -> !null")
   public V valueOr(@NotNull K var1, @Nullable V var2) {
      Object var3 = this.value((K)var1);
      return (V)(var3 == null ? var2 : var3);
   }

   @NotNull
   public Map<K, V> keyToValue() {
      return Collections.unmodifiableMap(this.keyToValue);
   }

   @NotNull
   public Map<V, K> valueToKey() {
      return Collections.unmodifiableMap(this.valueToKey);
   }
}
