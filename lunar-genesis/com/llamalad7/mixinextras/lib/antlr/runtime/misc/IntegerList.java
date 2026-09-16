package com.llamalad7.mixinextras.lib.antlr.runtime.misc;

import java.util.Arrays;

public class IntegerList {
   private static final int[] EMPTY_DATA = new int[0];
   private int[] _data = EMPTY_DATA;
   private int _size;

   public final void add(int var1) {
      if (this._data.length == this._size) {
         this.ensureCapacity(this._size + 1);
      }

      this._data[this._size] = var1;
      this._size++;
   }

   public final int get(int var1) {
      if (var1 >= 0 && var1 < this._size) {
         return this._data[var1];
      } else {
         throw new IndexOutOfBoundsException();
      }
   }

   public final int removeAt(int var1) {
      int var2 = this.get(var1);
      System.arraycopy(this._data, var1 + 1, this._data, var1, this._size - var1 - 1);
      this._data[this._size - 1] = 0;
      this._size--;
      return var2;
   }

   public final boolean isEmpty() {
      return this._size == 0;
   }

   public final int size() {
      return this._size;
   }

   public final void clear() {
      Arrays.fill(this._data, 0, this._size, 0);
      this._size = 0;
   }

   public final int[] toArray() {
      return this._size == 0 ? EMPTY_DATA : Arrays.copyOf(this._data, this._size);
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      }

      if (!(var1 instanceof IntegerList)) {
         return false;
      }

      IntegerList var2 = (IntegerList)var1;
      if (this._size != var2._size) {
         return false;
      }

      for (int var3 = 0; var3 < this._size; var3++) {
         if (this._data[var3] != var2._data[var3]) {
            return false;
         }
      }

      return true;
   }

   @Override
   public int hashCode() {
      int var1 = 1;

      for (int var2 = 0; var2 < this._size; var2++) {
         var1 = 31 * var1 + this._data[var2];
      }

      return var1;
   }

   @Override
   public String toString() {
      return Arrays.toString(this.toArray());
   }

   private void ensureCapacity(int var1) {
      if (var1 >= 0 && var1 <= 2147483639) {
         int var2;
         if (this._data.length == 0) {
            var2 = 4;
         } else {
            var2 = this._data.length;
         }

         while (var2 < var1) {
            var2 *= 2;
            if (var2 < 0 || var2 > 2147483639) {
               var2 = 2147483639;
            }
         }

         this._data = Arrays.copyOf(this._data, var2);
      } else {
         throw new OutOfMemoryError();
      }
   }
}
