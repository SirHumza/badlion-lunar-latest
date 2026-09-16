package org.spongepowered.include.com.google.common.collect;

import java.util.Map.Entry;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.spongepowered.include.com.google.common.base.Preconditions;
import org.spongepowered.include.com.google.j2objc.annotations.Weak;

final class RegularImmutableMap<K, V> extends ImmutableMap<K, V> {
   private final transient Entry<K, V>[] entries;
   private final transient ImmutableMapEntry<K, V>[] table;
   private final transient int mask;

   static <K, V> RegularImmutableMap<K, V> fromEntryArray(int var0, Entry<K, V>[] var1) {
      Preconditions.checkPositionIndex(var0, var1.length);
      Entry[] var2;
      if (var0 == var1.length) {
         var2 = var1;
      } else {
         var2 = ImmutableMapEntry.createEntryArray(var0);
      }

      int var3 = Hashing.closedTableSize(var0, 1.2);
      ImmutableMapEntry[] var4 = ImmutableMapEntry.createEntryArray(var3);
      int var5 = var3 - 1;

      for (int var6 = 0; var6 < var0; var6++) {
         Entry var7 = var1[var6];
         Object var8 = var7.getKey();
         Object var9 = var7.getValue();
         CollectPreconditions.checkEntryNotNull(var8, var9);
         int var10 = Hashing.smear(var8.hashCode()) & var5;
         ImmutableMapEntry var11 = var4[var10];
         ImmutableMapEntry var12;
         if (var11 == null) {
            boolean var13 = var7 instanceof ImmutableMapEntry && ((ImmutableMapEntry)var7).isReusable();
            var12 = var13 ? (ImmutableMapEntry)var7 : new ImmutableMapEntry<>(var8, var9);
         } else {
            var12 = new ImmutableMapEntry.NonTerminalImmutableMapEntry<>(var8, var9, var11);
         }

         var4[var10] = var12;
         var2[var6] = var12;
         checkNoConflictInKeyBucket(var8, var12, var11);
      }

      return new RegularImmutableMap<>(var2, var4, var5);
   }

   private RegularImmutableMap(Entry<K, V>[] var1, ImmutableMapEntry<K, V>[] var2, int var3) {
      this.entries = var1;
      this.table = var2;
      this.mask = var3;
   }

   static void checkNoConflictInKeyBucket(Object var0, Entry<?, ?> var1, @Nullable ImmutableMapEntry<?, ?> var2) {
      while (var2 != null) {
         checkNoConflict(!var0.equals(var2.getKey()), "key", var1, var2);
         var2 = var2.getNextInKeyBucket();
      }
   }

   @Override
   public V get(@Nullable Object var1) {
      return get(var1, this.table, this.mask);
   }

   @Nullable
   static <V> V get(@Nullable Object var0, ImmutableMapEntry<?, V>[] var1, int var2) {
      if (var0 == null) {
         return null;
      }

      int var3 = Hashing.smear(var0.hashCode()) & var2;

      for (ImmutableMapEntry var4 = var1[var3]; var4 != null; var4 = var4.getNextInKeyBucket()) {
         Object var5 = var4.getKey();
         if (var0.equals(var5)) {
            return (V)var4.getValue();
         }
      }

      return null;
   }

   @Override
   public void forEach(BiConsumer<? super K, ? super V> var1) {
      Preconditions.checkNotNull(var1);

      for (Entry var5 : this.entries) {
         var1.accept(var5.getKey(), var5.getValue());
      }
   }

   @Override
   public int size() {
      return this.entries.length;
   }

   @Override
   ImmutableSet<Entry<K, V>> createEntrySet() {
      return new ImmutableMapEntrySet.RegularEntrySet<>(this, this.entries);
   }

   @Override
   ImmutableSet<K> createKeySet() {
      return new RegularImmutableMap.KeySet<>(this);
   }

   @Override
   ImmutableCollection<V> createValues() {
      return new RegularImmutableMap.Values<>(this);
   }

   private static final class KeySet<K, V> extends ImmutableSet.Indexed<K> {
      @Weak
      private final RegularImmutableMap<K, V> map;

      KeySet(RegularImmutableMap<K, V> var1) {
         this.map = var1;
      }

      @Override
      K get(int var1) {
         return this.map.entries[var1].getKey();
      }

      @Override
      public boolean contains(Object var1) {
         return this.map.containsKey(var1);
      }

      @Override
      public int size() {
         return this.map.size();
      }
   }

   private static final class Values<K, V> extends ImmutableList<V> {
      @Weak
      final RegularImmutableMap<K, V> map;

      Values(RegularImmutableMap<K, V> var1) {
         this.map = var1;
      }

      @Override
      public V get(int var1) {
         return this.map.entries[var1].getValue();
      }

      @Override
      public int size() {
         return this.map.size();
      }
   }
}
