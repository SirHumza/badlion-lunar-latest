package com.lunarclient;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.AbstractMap.SimpleEntry;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class SafeMap<T> implements Map<String, T> {
   private final Map<String, BetterJson> innerMap;
   private final Map<String, T> valueCache;
   private final Function<BetterJson, T> mapper;

   public SafeMap(Map<String, BetterJson> var1, Function<BetterJson, T> var2) {
      this.innerMap = var1;
      this.valueCache = new HashMap<>();
      this.mapper = var2;
   }

   @Override
   public int size() {
      return this.innerMap.size();
   }

   @Override
   public boolean isEmpty() {
      return this.innerMap.isEmpty();
   }

   @Override
   public boolean containsKey(Object var1) {
      return this.innerMap.containsKey(var1);
   }

   @Override
   public boolean containsValue(Object var1) {
      return this.valueCache.containsValue(var1);
   }

   @Override
   public T get(Object var1) {
      return this.valueCache.computeIfAbsent((String)var1, var1x -> this.mapper.apply(this.innerMap.getOrDefault(var1x, new BetterJson(null))));
   }

   @Nullable
   public T put(String var1, T var2) {
      throw new UnsupportedOperationException("Map is immutable!");
   }

   @Override
   public T remove(Object var1) {
      throw new UnsupportedOperationException("Map is immutable!");
   }

   @Override
   public void putAll(@NotNull Map<? extends String, ? extends T> var1) {
      throw new UnsupportedOperationException("Map is immutable!");
   }

   @Override
   public void clear() {
      throw new UnsupportedOperationException("Map is immutable!");
   }

   @NotNull
   @Override
   public Set<String> keySet() {
      return new ImmutableSet<>(this.innerMap.keySet());
   }

   @NotNull
   @Override
   public Collection<T> values() {
      return new ImmutableCollection<>(this.keySet().stream().map(this::get).toList());
   }

   @NotNull
   @Override
   public Set<Entry<String, T>> entrySet() {
      return new ImmutableSet<>(this.keySet().stream().map(var1 -> new SimpleEntry<>(var1, this.get(var1))).collect(Collectors.toSet()));
   }
}
