package com.llamalad7.mixinextras.lib.antlr.runtime.misc;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

public class Array2DHashSet<T> implements Set<T> {
   protected final AbstractEqualityComparator<? super T> comparator;
   protected T[][] buckets;
   protected int n = 0;
   protected int currentPrime = 1;
   protected int threshold;
   protected final int initialCapacity;
   protected final int initialBucketCapacity;

   public Array2DHashSet() {
      this(null, 16, 8);
   }

   public Array2DHashSet(AbstractEqualityComparator<? super T> var1, int var2, int var3) {
      if (var1 == null) {
         var1 = ObjectEqualityComparator.INSTANCE;
      }

      this.comparator = var1;
      this.initialCapacity = var2;
      this.initialBucketCapacity = var3;
      this.buckets = this.createBuckets(var2);
      this.threshold = (int)Math.floor(var2 * 0.75);
   }

   public final T getOrAdd(T var1) {
      if (this.n > this.threshold) {
         this.expand();
      }

      return this.getOrAddImpl((T)var1);
   }

   protected T getOrAddImpl(T var1) {
      int var2 = this.getBucket((T)var1);
      Object[] var3 = this.buckets[var2];
      if (var3 == null) {
         var3 = this.createBucket(this.initialBucketCapacity);
         var3[0] = var1;
         this.buckets[var2] = (T[])var3;
         this.n++;
         return (T)var1;
      }

      for (int var4 = 0; var4 < var3.length; var4++) {
         Object var5 = var3[var4];
         if (var5 == null) {
            var3[var4] = var1;
            this.n++;
            return (T)var1;
         }

         if (this.comparator.equals((T)var5, (T)var1)) {
            return (T)var5;
         }
      }

      int var8 = var3.length;
      var3 = Arrays.copyOf(var3, var3.length * 2);
      this.buckets[var2] = (T[])var3;
      var3[var8] = var1;
      this.n++;
      return (T)var1;
   }

   public T get(T var1) {
      if (var1 == null) {
         return (T)var1;
      }

      int var2 = this.getBucket((T)var1);
      Object[] var3 = this.buckets[var2];
      if (var3 == null) {
         return null;
      }

      for (Object var7 : var3) {
         if (var7 == null) {
            return null;
         }

         if (this.comparator.equals((T)var7, (T)var1)) {
            return (T)var7;
         }
      }

      return null;
   }

   protected final int getBucket(T var1) {
      int var2 = this.comparator.hashCode((T)var1);
      return var2 & this.buckets.length - 1;
   }

   @Override
   public int hashCode() {
      int var1 = MurmurHash.initialize();

      for (Object[] var5 : this.buckets) {
         if (var5 != null) {
            for (Object var9 : var5) {
               if (var9 == null) {
                  break;
               }

               var1 = MurmurHash.update(var1, this.comparator.hashCode((T)var9));
            }
         }
      }

      return MurmurHash.finish(var1, this.size());
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      }

      if (!(var1 instanceof Array2DHashSet)) {
         return false;
      }

      Array2DHashSet var2 = (Array2DHashSet)var1;
      return var2.size() != this.size() ? false : this.containsAll(var2);
   }

   protected void expand() {
      Object[][] var1 = this.buckets;
      this.currentPrime += 4;
      int var2 = this.buckets.length * 2;
      Object[][] var3 = this.createBuckets(var2);
      int[] var4 = new int[var3.length];
      this.buckets = (T[][])var3;
      this.threshold = (int)(var2 * 0.75);
      int var5 = this.size();

      for (Object[] var9 : var1) {
         if (var9 != null) {
            for (Object var13 : var9) {
               if (var13 == null) {
                  break;
               }

               int var14 = this.getBucket((T)var13);
               int var15 = var4[var14];
               Object[] var16;
               if (var15 == 0) {
                  var16 = this.createBucket(this.initialBucketCapacity);
                  var3[var14] = var16;
               } else {
                  var16 = var3[var14];
                  if (var15 == var16.length) {
                     var16 = Arrays.copyOf(var16, var16.length * 2);
                     var3[var14] = var16;
                  }
               }

               var16[var15] = var13;
               var4[var14]++;
            }
         }
      }

      assert this.n == var5;
   }

   @Override
   public final boolean add(T var1) {
      Object var2 = this.getOrAdd((T)var1);
      return var2 == var1;
   }

   @Override
   public final int size() {
      return this.n;
   }

   @Override
   public final boolean isEmpty() {
      return this.n == 0;
   }

   @Override
   public final boolean contains(Object var1) {
      return this.containsFast(this.asElementType(var1));
   }

   public boolean containsFast(T var1) {
      return var1 == null ? false : this.get((T)var1) != null;
   }

   @Override
   public Iterator<T> iterator() {
      return new Array2DHashSet.SetIterator(this.toArray());
   }

   @Override
   public T[] toArray() {
      Object[] var1 = this.createBucket(this.size());
      int var2 = 0;

      for (Object[] var6 : this.buckets) {
         if (var6 != null) {
            for (Object var10 : var6) {
               if (var10 == null) {
                  break;
               }

               var1[var2++] = var10;
            }
         }
      }

      return (T[])var1;
   }

   @Override
   public <U> U[] toArray(U[] var1) {
      if (var1.length < this.size()) {
         var1 = Arrays.copyOf(var1, this.size());
      }

      int var2 = 0;

      for (Object[] var6 : this.buckets) {
         if (var6 != null) {
            for (Object var10 : var6) {
               if (var10 == null) {
                  break;
               }

               Object var11 = var10;
               var1[var2++] = var11;
            }
         }
      }

      return (U[])var1;
   }

   @Override
   public final boolean remove(Object var1) {
      return this.removeFast(this.asElementType(var1));
   }

   public boolean removeFast(T var1) {
      if (var1 == null) {
         return false;
      }

      int var2 = this.getBucket((T)var1);
      Object[] var3 = this.buckets[var2];
      if (var3 == null) {
         return false;
      }

      for (int var4 = 0; var4 < var3.length; var4++) {
         Object var5 = var3[var4];
         if (var5 == null) {
            return false;
         }

         if (this.comparator.equals((T)var5, (T)var1)) {
            System.arraycopy(var3, var4 + 1, var3, var4, var3.length - var4 - 1);
            var3[var3.length - 1] = null;
            this.n--;
            return true;
         }
      }

      return false;
   }

   @Override
   public boolean containsAll(Collection<?> var1) {
      if (var1 instanceof Array2DHashSet) {
         Array2DHashSet var2 = (Array2DHashSet)var1;

         for (Object[] var6 : var2.buckets) {
            if (var6 != null) {
               for (Object var10 : var6) {
                  if (var10 == null) {
                     break;
                  }

                  if (!this.containsFast(this.asElementType(var10))) {
                     return false;
                  }
               }
            }
         }
      } else {
         for (Object var12 : var1) {
            if (!this.containsFast(this.asElementType(var12))) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   public boolean addAll(Collection<? extends T> var1) {
      boolean var2 = false;

      for (Object var4 : var1) {
         Object var5 = this.getOrAdd((T)var4);
         if (var5 != var4) {
            var2 = true;
         }
      }

      return var2;
   }

   @Override
   public boolean retainAll(Collection<?> var1) {
      int var2 = 0;

      for (Object[] var6 : this.buckets) {
         if (var6 != null) {
            int var7 = 0;
            int var8 = 0;

            while (var7 < var6.length && var6[var7] != null) {
               if (var1.contains(var6[var7])) {
                  if (var7 != var8) {
                     var6[var8] = var6[var7];
                  }

                  var8++;
                  var2++;
               }

               var7++;
            }

            var2 += var8;

            while (var8 < var7) {
               var6[var8] = null;
               var8++;
            }
         }
      }

      boolean var9 = var2 != this.n;
      this.n = var2;
      return var9;
   }

   @Override
   public boolean removeAll(Collection<?> var1) {
      boolean var2 = false;

      for (Object var4 : var1) {
         var2 |= this.removeFast(this.asElementType(var4));
      }

      return var2;
   }

   @Override
   public void clear() {
      this.n = 0;
      this.buckets = this.createBuckets(this.initialCapacity);
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

      for (Object[] var6 : this.buckets) {
         if (var6 != null) {
            for (Object var10 : var6) {
               if (var10 == null) {
                  break;
               }

               if (var2) {
                  var2 = false;
               } else {
                  var1.append(", ");
               }

               var1.append(var10.toString());
            }
         }
      }

      var1.append('}');
      return var1.toString();
   }

   protected T asElementType(Object var1) {
      return (T)var1;
   }

   protected T[][] createBuckets(int var1) {
      return (T[][])(new Object[var1][]);
   }

   protected T[] createBucket(int var1) {
      return (T[])(new Object[var1]);
   }

   protected class SetIterator implements Iterator<T> {
      final Object[] data;
      int nextIndex = 0;
      boolean removed = true;

      public SetIterator(T[] var2) {
         this.data = var2;
      }

      @Override
      public boolean hasNext() {
         return this.nextIndex < this.data.length;
      }

      @Override
      public T next() {
         if (!this.hasNext()) {
            throw new NoSuchElementException();
         }

         this.removed = false;
         return (T)this.data[this.nextIndex++];
      }

      @Override
      public void remove() {
         if (this.removed) {
            throw new IllegalStateException();
         }

         Array2DHashSet.this.remove(this.data[this.nextIndex - 1]);
         this.removed = true;
      }
   }
}
