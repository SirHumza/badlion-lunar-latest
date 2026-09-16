package com.moonsworth.lunar.client.util.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<K, V> implements Map<K, V> {
   private final Map<K, V> OHCRRHRHOHOOHCICICOIHCOIIRRHOI = new HashMap<>();
   private Collection<V> values;

   @Override
   public int size() {
      return this.values == null ? this.OHCRRHRHOHOOHCICICOIHCOIIRRHOI.size() : this.values.size();
   }

   @Override
   public boolean isEmpty() {
      return this.values == null ? this.OHCRRHRHOHOOHCICICOIHCOIIRRHOI.isEmpty() : this.values.isEmpty();
   }

   @Override
   public boolean containsKey(Object var1) {
      return this.OHCRRHRHOHOOHCICICOIHCOIIRRHOI.containsKey(var1);
   }

   @Override
   public boolean containsValue(Object var1) {
      return this.values == null ? this.OHCRRHRHOHOOHCICICOIHCOIIRRHOI.containsValue(var1) : this.values.contains(var1);
   }

   @Override
   public V get(Object var1) {
      return this.OHCRRHRHOHOOHCICICOIHCOIIRRHOI.get(var1);
   }

   @Nullable
   @Override
   public V put(K var1, V var2) {
      this.values = null;
      return this.OHCRRHRHOHOOHCICICOIHCOIIRRHOI.put((K)var1, (V)var2);
   }

   @Override
   public V remove(Object var1) {
      this.values = null;
      return this.OHCRRHRHOHOOHCICICOIHCOIIRRHOI.remove(var1);
   }

   @Override
   public void putAll(@NotNull Map<? extends K, ? extends V> var1) {
      this.values = null;
      this.OHCRRHRHOHOOHCICICOIHCOIIRRHOI.putAll(var1);
   }

   @Override
   public void clear() {
      this.values = null;
      this.OHCRRHRHOHOOHCICICOIHCOIIRRHOI.clear();
   }

   @NotNull
   @Override
   public Set<K> keySet() {
      return this.OHCRRHRHOHOOHCICICOIHCOIIRRHOI.keySet();
   }

   @NotNull
   @Override
   public Collection<V> values() {
      if (this.values == null) {
         this.values = Collections.unmodifiableList(new ArrayList<>(this.OHCRRHRHOHOOHCICICOIHCOIIRRHOI.values()));
      }

      return this.values;
   }

   @NotNull
   @Override
   public Set<Entry<K, V>> entrySet() {
      return this.OHCRRHRHOHOOHCICICOIHCOIIRRHOI.entrySet();
   }
}
