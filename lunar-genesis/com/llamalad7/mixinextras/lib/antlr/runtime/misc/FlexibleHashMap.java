package com.llamalad7.mixinextras.lib.antlr.runtime.misc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class FlexibleHashMap<K, V> implements Map<K, V> {
   protected final AbstractEqualityComparator<? super K> comparator;
   protected LinkedList<FlexibleHashMap.Entry<K, V>>[] buckets;
   protected int n = 0;
   protected int currentPrime = 1;
   protected int threshold;
   protected final int initialCapacity;
   protected final int initialBucketCapacity;

   public FlexibleHashMap(AbstractEqualityComparator<? super K> var1) {
      this(var1, 16, 8);
   }

   public FlexibleHashMap(AbstractEqualityComparator<? super K> var1, int var2, int var3) {
      if (var1 == null) {
         var1 = ObjectEqualityComparator.INSTANCE;
      }

      this.comparator = var1;
      this.initialCapacity = var2;
      this.initialBucketCapacity = var3;
      this.threshold = (int)Math.floor(var2 * 0.75);
      this.buckets = createEntryListArray(var3);
   }

   private static <K, V> LinkedList<FlexibleHashMap.Entry<K, V>>[] createEntryListArray(int var0) {
      return new LinkedList[var0];
   }

   protected int getBucket(K var1) {
      int var2 = this.comparator.hashCode((K)var1);
      return var2 & this.buckets.length - 1;
   }

   @Override
   public V get(Object var1) {
      Object var2 = var1;
      if (var1 == null) {
         return null;
      }

      int var3 = this.getBucket((K)var2);
      LinkedList var4 = this.buckets[var3];
      if (var4 == null) {
         return null;
      }

      for (FlexibleHashMap.Entry var6 : var4) {
         if (this.comparator.equals(var6.key, (K)var2)) {
            return var6.value;
         }
      }

      return null;
   }

   @Override
   public V put(K var1, V var2) {
      if (var1 == null) {
         return null;
      }

      if (this.n > this.threshold) {
         this.expand();
      }

      int var3 = this.getBucket((K)var1);
      LinkedList var4 = this.buckets[var3];
      if (var4 == null) {
         var4 = this.buckets[var3] = new LinkedList<>();
      }

      for (FlexibleHashMap.Entry var6 : var4) {
         if (this.comparator.equals(var6.key, (K)var1)) {
            Object var7 = var6.value;
            var6.value = (V)var2;
            this.n++;
            return (V)var7;
         }
      }

      var4.add(new FlexibleHashMap.Entry<>(var1, var2));
      this.n++;
      return null;
   }

   @Override
   public V remove(Object var1) {
      throw new UnsupportedOperationException();
   }

   @Override
   public void putAll(Map<? extends K, ? extends V> var1) {
      throw new UnsupportedOperationException();
   }

   @Override
   public Set<K> keySet() {
      throw new UnsupportedOperationException();
   }

   @Override
   public Collection<V> values() {
      ArrayList var1 = new ArrayList(this.size());

      for (LinkedList var5 : this.buckets) {
         if (var5 != null) {
            for (FlexibleHashMap.Entry var7 : var5) {
               var1.add(var7.value);
            }
         }
      }

      return var1;
   }

   @Override
   public Set<java.util.Map.Entry<K, V>> entrySet() {
      throw new UnsupportedOperationException();
   }

   @Override
   public boolean containsKey(Object var1) {
      return this.get(var1) != null;
   }

   @Override
   public boolean containsValue(Object var1) {
      throw new UnsupportedOperationException();
   }

   @Override
   public int hashCode() {
      int var1 = MurmurHash.initialize();

      for (LinkedList var5 : this.buckets) {
         if (var5 != null) {
            for (FlexibleHashMap.Entry var7 : var5) {
               if (var7 == null) {
                  break;
               }

               var1 = MurmurHash.update(var1, this.comparator.hashCode(var7.key));
            }
         }
      }

      return MurmurHash.finish(var1, this.size());
   }

   @Override
   public boolean equals(Object var1) {
      throw new UnsupportedOperationException();
   }

   protected void expand() {
      LinkedList[] var1 = this.buckets;
      this.currentPrime += 4;
      int var2 = this.buckets.length * 2;
      LinkedList[] var3 = createEntryListArray(var2);
      this.buckets = var3;
      this.threshold = (int)(var2 * 0.75);
      int var4 = this.size();

      for (LinkedList var8 : var1) {
         if (var8 != null) {
            for (FlexibleHashMap.Entry var10 : var8) {
               if (var10 == null) {
                  break;
               }

               this.put(var10.key, var10.value);
            }
         }
      }

      this.n = var4;
   }

   @Override
   public int size() {
      return this.n;
   }

   @Override
   public boolean isEmpty() {
      return this.n == 0;
   }

   @Override
   public void clear() {
      this.buckets = createEntryListArray(this.initialCapacity);
      this.n = 0;
      this.threshold = (int)Math.floor(this.initialCapacity * 0.75);
   }

   @Override
   public String toString() {
      if (this.size() == 0) {
         return "{}";
      }

      StringBuilder var1 = new StringBuilder();
      var1.append('{');
      boolean var2 = true;

      for (LinkedList var6 : this.buckets) {
         if (var6 != null) {
            for (FlexibleHashMap.Entry var8 : var6) {
               if (var8 == null) {
                  break;
               }

               if (var2) {
                  var2 = false;
               } else {
                  var1.append(", ");
               }

               var1.append(var8.toString());
            }
         }
      }

      var1.append('}');
      return var1.toString();
   }

   public static class Entry<K, V> {
      public final K key;
      public V value;

      public Entry(K var1, V var2) {
         this.key = (K)var1;
         this.value = (V)var2;
      }

      @Override
      public String toString() {
         return this.key.toString() + ":" + this.value.toString();
      }
   }
}
