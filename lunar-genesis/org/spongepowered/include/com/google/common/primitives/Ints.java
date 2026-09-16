package org.spongepowered.include.com.google.common.primitives;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;
import javax.annotation.Nullable;
import org.spongepowered.include.com.google.common.base.Preconditions;

public final class Ints {
   public static int hashCode(int var0) {
      return var0;
   }

   public static int compare(int var0, int var1) {
      return var0 < var1 ? -1 : (var0 > var1 ? 1 : 0);
   }

   public static boolean contains(int[] var0, int var1) {
      for (int var5 : var0) {
         if (var5 == var1) {
            return true;
         }
      }

      return false;
   }

   public static int indexOf(int[] var0, int var1) {
      return indexOf(var0, var1, 0, var0.length);
   }

   private static int indexOf(int[] var0, int var1, int var2, int var3) {
      for (int var4 = var2; var4 < var3; var4++) {
         if (var0[var4] == var1) {
            return var4;
         }
      }

      return -1;
   }

   private static int lastIndexOf(int[] var0, int var1, int var2, int var3) {
      for (int var4 = var3 - 1; var4 >= var2; var4--) {
         if (var0[var4] == var1) {
            return var4;
         }
      }

      return -1;
   }

   public static int[] concat(int[]... var0) {
      int var1 = 0;

      for (int[] var5 : var0) {
         var1 += var5.length;
      }

      int[] var8 = new int[var1];
      int var9 = 0;

      for (int[] var7 : var0) {
         System.arraycopy(var7, 0, var8, var9, var7.length);
         var9 += var7.length;
      }

      return var8;
   }

   public static int[] toArray(Collection<? extends Number> var0) {
      if (var0 instanceof Ints.IntArrayAsList) {
         return ((Ints.IntArrayAsList)var0).toIntArray();
      }

      Object[] var1 = var0.toArray();
      int var2 = var1.length;
      int[] var3 = new int[var2];

      for (int var4 = 0; var4 < var2; var4++) {
         var3[var4] = ((Number)Preconditions.checkNotNull(var1[var4])).intValue();
      }

      return var3;
   }

   @Nullable
   @CheckForNull
   public static Integer tryParse(String var0) {
      return tryParse(var0, 10);
   }

   @Nullable
   @CheckForNull
   public static Integer tryParse(String var0, int var1) {
      Long var2 = Longs.tryParse(var0, var1);
      return var2 != null && var2 == var2.intValue() ? var2.intValue() : null;
   }

   private static class IntArrayAsList extends AbstractList<Integer> implements Serializable, RandomAccess {
      final int[] array;
      final int start;
      final int end;

      IntArrayAsList(int[] var1, int var2, int var3) {
         this.array = var1;
         this.start = var2;
         this.end = var3;
      }

      @Override
      public int size() {
         return this.end - this.start;
      }

      @Override
      public boolean isEmpty() {
         return false;
      }

      public Integer get(int var1) {
         Preconditions.checkElementIndex(var1, this.size());
         return this.array[this.start + var1];
      }

      @Override
      public boolean contains(Object var1) {
         return var1 instanceof Integer && Ints.indexOf(this.array, (Integer)var1, this.start, this.end) != -1;
      }

      @Override
      public int indexOf(Object var1) {
         if (var1 instanceof Integer) {
            int var2 = Ints.indexOf(this.array, (Integer)var1, this.start, this.end);
            if (var2 >= 0) {
               return var2 - this.start;
            }
         }

         return -1;
      }

      @Override
      public int lastIndexOf(Object var1) {
         if (var1 instanceof Integer) {
            int var2 = Ints.lastIndexOf(this.array, (Integer)var1, this.start, this.end);
            if (var2 >= 0) {
               return var2 - this.start;
            }
         }

         return -1;
      }

      public Integer set(int var1, Integer var2) {
         Preconditions.checkElementIndex(var1, this.size());
         int var3 = this.array[this.start + var1];
         this.array[this.start + var1] = Preconditions.checkNotNull(var2);
         return var3;
      }

      @Override
      public List<Integer> subList(int var1, int var2) {
         int var3 = this.size();
         Preconditions.checkPositionIndexes(var1, var2, var3);
         return var1 == var2 ? Collections.emptyList() : new Ints.IntArrayAsList(this.array, this.start + var1, this.start + var2);
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         if (var1 == this) {
            return true;
         }

         if (var1 instanceof Ints.IntArrayAsList) {
            Ints.IntArrayAsList var2 = (Ints.IntArrayAsList)var1;
            int var3 = this.size();
            if (var2.size() != var3) {
               return false;
            }

            for (int var4 = 0; var4 < var3; var4++) {
               if (this.array[this.start + var4] != var2.array[var2.start + var4]) {
                  return false;
               }
            }

            return true;
         } else {
            return super.equals(var1);
         }
      }

      @Override
      public int hashCode() {
         int var1 = 1;

         for (int var2 = this.start; var2 < this.end; var2++) {
            var1 = 31 * var1 + Ints.hashCode(this.array[var2]);
         }

         return var1;
      }

      @Override
      public String toString() {
         StringBuilder var1 = new StringBuilder(this.size() * 5);
         var1.append('[').append(this.array[this.start]);

         for (int var2 = this.start + 1; var2 < this.end; var2++) {
            var1.append(", ").append(this.array[var2]);
         }

         return var1.append(']').toString();
      }

      int[] toIntArray() {
         return Arrays.copyOfRange(this.array, this.start, this.end);
      }
   }
}
