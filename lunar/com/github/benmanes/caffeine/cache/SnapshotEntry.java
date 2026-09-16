package com.github.benmanes.caffeine.cache;

import com.google.errorprone.annotations.Immutable;
import java.util.Objects;
import java.util.Map.Entry;

@Immutable(containerOf = {"K", "V"})
class SnapshotEntry<K, V> implements Policy.CacheEntry<K, V> {
   private final long snapshot;
   private final V value;
   private final K key;

   SnapshotEntry(K var1, V var2, long var3) {
      this.snapshot = var3;
      this.key = Objects.requireNonNull((K)var1);
      this.value = Objects.requireNonNull((V)var2);
   }

   @Override
   public K getKey() {
      return this.key;
   }

   @Override
   public V getValue() {
      return this.value;
   }

   @Override
   public V setValue(V var1) {
      throw new UnsupportedOperationException();
   }

   @Override
   public int weight() {
      return 1;
   }

   @Override
   public long expiresAt() {
      return this.snapshot + Long.MAX_VALUE;
   }

   @Override
   public long refreshableAt() {
      return this.snapshot + Long.MAX_VALUE;
   }

   @Override
   public long snapshotAt() {
      return this.snapshot;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      }

      if (!(var1 instanceof Entry)) {
         return false;
      }

      Entry var2 = (Entry)var1;
      return this.key.equals(var2.getKey()) && this.value.equals(var2.getValue());
   }

   @Override
   public int hashCode() {
      return this.key.hashCode() ^ this.value.hashCode();
   }

   @Override
   public String toString() {
      return this.key + "=" + this.value;
   }

   public static <K, V> SnapshotEntry<K, V> forEntry(K var0, V var1) {
      return new SnapshotEntry<>((K)var0, (V)var1, 0L);
   }

   public static <K, V> SnapshotEntry<K, V> forEntry(K var0, V var1, long var2, int var4, long var5, long var7) {
      long var9 = var2 + Long.MAX_VALUE;
      boolean var11 = var7 != var9;
      boolean var12 = var5 != var9;
      boolean var13 = var4 != 1;
      int var14 = (var13 ? 1 : 0) | (var12 ? 2 : 0) | (var11 ? 4 : 0);
      switch (var14) {
         case 0:
            return new SnapshotEntry<>((K)var0, (V)var1, var2);
         case 1:
            return new SnapshotEntry.WeightedEntry<>((K)var0, (V)var1, var2, var4);
         case 2:
            return new SnapshotEntry.ExpirableEntry<>((K)var0, (V)var1, var2, var5);
         case 3:
            return new SnapshotEntry.ExpirableWeightedEntry<>((K)var0, (V)var1, var2, var4, var5);
         case 4:
         case 5:
         default:
            return new SnapshotEntry.CompleteEntry<>((K)var0, (V)var1, var2, var4, var5, var7);
         case 6:
            return new SnapshotEntry.RefreshableExpirableEntry<>((K)var0, (V)var1, var2, var5, var7);
      }
   }

   static final class CompleteEntry<K, V> extends SnapshotEntry.ExpirableWeightedEntry<K, V> {
      final long refreshableAt;

      CompleteEntry(K var1, V var2, long var3, int var5, long var6, long var8) {
         super((K)var1, (V)var2, var3, var5, var6);
         this.refreshableAt = var8;
      }

      @Override
      public long refreshableAt() {
         return this.refreshableAt;
      }
   }

   static class ExpirableEntry<K, V> extends SnapshotEntry<K, V> {
      final long expiresAt;

      ExpirableEntry(K var1, V var2, long var3, long var5) {
         super((K)var1, (V)var2, var3);
         this.expiresAt = var5;
      }

      @Override
      public long expiresAt() {
         return this.expiresAt;
      }
   }

   static class ExpirableWeightedEntry<K, V> extends SnapshotEntry.WeightedEntry<K, V> {
      final long expiresAt;

      ExpirableWeightedEntry(K var1, V var2, long var3, int var5, long var6) {
         super((K)var1, (V)var2, var3, var5);
         this.expiresAt = var6;
      }

      @Override
      public long expiresAt() {
         return this.expiresAt;
      }
   }

   static class RefreshableExpirableEntry<K, V> extends SnapshotEntry.ExpirableEntry<K, V> {
      final long refreshableAt;

      RefreshableExpirableEntry(K var1, V var2, long var3, long var5, long var7) {
         super((K)var1, (V)var2, var3, var5);
         this.refreshableAt = var7;
      }

      @Override
      public long refreshableAt() {
         return this.refreshableAt;
      }
   }

   static class WeightedEntry<K, V> extends SnapshotEntry<K, V> {
      final int weight;

      WeightedEntry(K var1, V var2, long var3, int var5) {
         super((K)var1, (V)var2, var3);
         this.weight = var5;
      }

      @Override
      public int weight() {
         return this.weight;
      }
   }
}
