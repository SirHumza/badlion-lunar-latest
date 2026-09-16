package org.jheaps.array;

import java.io.Serializable;
import java.util.Comparator;
import java.util.NoSuchElementException;
import org.jheaps.DoubleEndedHeap;
import org.jheaps.annotations.LinearTime;

public class MinMaxBinaryArrayDoubleEndedHeap<K> extends AbstractArrayHeap<K> implements Serializable, DoubleEndedHeap<K> {
   private static final long serialVersionUID = -8985374211686556917L;
   public static final int DEFAULT_HEAP_CAPACITY = 16;

   public MinMaxBinaryArrayDoubleEndedHeap() {
      super(null, 16);
   }

   public MinMaxBinaryArrayDoubleEndedHeap(int var1) {
      super(null, var1);
   }

   public MinMaxBinaryArrayDoubleEndedHeap(Comparator<? super K> var1) {
      super(var1, 16);
   }

   public MinMaxBinaryArrayDoubleEndedHeap(Comparator<? super K> var1, int var2) {
      super(var1, var2);
   }

   @LinearTime
   public static <K> MinMaxBinaryArrayDoubleEndedHeap<K> heapify(K[] var0) {
      if (var0 == null) {
         throw new IllegalArgumentException("Array cannot be null");
      }

      if (var0.length == 0) {
         return new MinMaxBinaryArrayDoubleEndedHeap<>();
      }

      MinMaxBinaryArrayDoubleEndedHeap var1 = new MinMaxBinaryArrayDoubleEndedHeap(var0.length);
      System.arraycopy(var0, 0, var1.array, 1, var0.length);
      var1.size = var0.length;

      for (int var2 = var0.length / 2; var2 > 0; var2--) {
         var1.fixdown(var2);
      }

      return var1;
   }

   @LinearTime
   public static <K> MinMaxBinaryArrayDoubleEndedHeap<K> heapify(K[] var0, Comparator<? super K> var1) {
      if (var0 == null) {
         throw new IllegalArgumentException("Array cannot be null");
      }

      if (var0.length == 0) {
         return new MinMaxBinaryArrayDoubleEndedHeap<>(var1);
      }

      MinMaxBinaryArrayDoubleEndedHeap var2 = new MinMaxBinaryArrayDoubleEndedHeap(var1, var0.length);
      System.arraycopy(var0, 0, var2.array, 1, var0.length);
      var2.size = var0.length;

      for (int var3 = var0.length / 2; var3 > 0; var3--) {
         var2.fixdownWithComparator(var3);
      }

      return var2;
   }

   @Override
   protected void ensureCapacity(int var1) {
      this.checkCapacity(var1);
      Object[] var2 = new Object[var1 + 1];
      System.arraycopy(this.array, 1, var2, 1, this.size);
      this.array = (K[])var2;
   }

   @Override
   public K findMax() {
      switch (this.size) {
         case 0:
            throw new NoSuchElementException();
         case 1:
            return this.array[1];
         case 2:
            return this.array[2];
         default:
            if (this.comparator == null) {
               return ((Comparable)this.array[3]).compareTo(this.array[2]) > 0 ? this.array[3] : this.array[2];
            } else {
               return this.comparator.compare(this.array[3], this.array[2]) > 0 ? this.array[3] : this.array[2];
            }
      }
   }

   @Override
   public K deleteMax() {
      Object var1;
      switch (this.size) {
         case 0:
            throw new NoSuchElementException();
         case 1:
            var1 = this.array[1];
            this.array[1] = null;
            this.size--;
            break;
         case 2:
            var1 = this.array[2];
            this.array[2] = null;
            this.size--;
            break;
         default:
            if (this.comparator == null) {
               if (((Comparable)this.array[3]).compareTo(this.array[2]) > 0) {
                  var1 = this.array[3];
                  this.array[3] = this.array[this.size];
                  this.array[this.size] = null;
                  this.size--;
                  if (this.size >= 3) {
                     this.fixdownMax(3);
                  }
               } else {
                  var1 = this.array[2];
                  this.array[2] = this.array[this.size];
                  this.array[this.size] = null;
                  this.size--;
                  this.fixdownMax(2);
               }
            } else if (this.comparator.compare(this.array[3], this.array[2]) > 0) {
               var1 = this.array[3];
               this.array[3] = this.array[this.size];
               this.array[this.size] = null;
               this.size--;
               if (this.size >= 3) {
                  this.fixdownMaxWithComparator(3);
               }
            } else {
               var1 = this.array[2];
               this.array[2] = this.array[this.size];
               this.array[this.size] = null;
               this.size--;
               this.fixdownMaxWithComparator(2);
            }
      }

      if (2 * this.minCapacity < this.array.length - 1 && 4 * this.size < this.array.length - 1) {
         this.ensureCapacity((this.array.length - 1) / 2);
      }

      return (K)var1;
   }

   @Override
   protected void fixup(int var1) {
      if (this.onMinLevel(var1)) {
         int var2 = var1 / 2;
         Object var3 = this.array[var1];
         if (var2 > 0 && ((Comparable)this.array[var2]).compareTo(var3) < 0) {
            this.array[var1] = this.array[var2];
            this.array[var2] = (K)var3;
            this.fixupMax(var2);
         } else {
            this.fixupMin(var1);
         }
      } else {
         int var4 = var1 / 2;
         Object var5 = this.array[var1];
         if (var4 > 0 && ((Comparable)var5).compareTo(this.array[var4]) < 0) {
            this.array[var1] = this.array[var4];
            this.array[var4] = (K)var5;
            this.fixupMin(var4);
         } else {
            this.fixupMax(var1);
         }
      }
   }

   @Override
   protected void fixupWithComparator(int var1) {
      if (this.onMinLevel(var1)) {
         int var2 = var1 / 2;
         Object var3 = this.array[var1];
         if (var2 > 0 && this.comparator.compare(this.array[var2], (K)var3) < 0) {
            this.array[var1] = this.array[var2];
            this.array[var2] = (K)var3;
            this.fixupMaxWithComparator(var2);
         } else {
            this.fixupMinWithComparator(var1);
         }
      } else {
         int var4 = var1 / 2;
         Object var5 = this.array[var1];
         if (var4 > 0 && this.comparator.compare((K)var5, this.array[var4]) < 0) {
            this.array[var1] = this.array[var4];
            this.array[var4] = (K)var5;
            this.fixupMinWithComparator(var4);
         } else {
            this.fixupMaxWithComparator(var1);
         }
      }
   }

   private void fixupMin(int var1) {
      Object var2 = this.array[var1];

      for (int var3 = var1 / 4; var3 > 0 && ((Comparable)this.array[var3]).compareTo(var2) > 0; var3 = var1 / 4) {
         this.array[var1] = this.array[var3];
         var1 = var3;
      }

      this.array[var1] = (K)var2;
   }

   private void fixupMinWithComparator(int var1) {
      Object var2 = this.array[var1];

      for (int var3 = var1 / 4; var3 > 0 && this.comparator.compare(this.array[var3], (K)var2) > 0; var3 = var1 / 4) {
         this.array[var1] = this.array[var3];
         var1 = var3;
      }

      this.array[var1] = (K)var2;
   }

   private void fixupMax(int var1) {
      Object var2 = this.array[var1];

      for (int var3 = var1 / 4; var3 > 0 && ((Comparable)this.array[var3]).compareTo(var2) < 0; var3 = var1 / 4) {
         this.array[var1] = this.array[var3];
         var1 = var3;
      }

      this.array[var1] = (K)var2;
   }

   private void fixupMaxWithComparator(int var1) {
      Object var2 = this.array[var1];

      for (int var3 = var1 / 4; var3 > 0 && this.comparator.compare(this.array[var3], (K)var2) < 0; var3 = var1 / 4) {
         this.array[var1] = this.array[var3];
         var1 = var3;
      }

      this.array[var1] = (K)var2;
   }

   @Override
   protected void fixdown(int var1) {
      if (this.onMinLevel(var1)) {
         this.fixdownMin(var1);
      } else {
         this.fixdownMax(var1);
      }
   }

   @Override
   protected void fixdownWithComparator(int var1) {
      if (this.onMinLevel(var1)) {
         this.fixdownMinWithComparator(var1);
      } else {
         this.fixdownMaxWithComparator(var1);
      }
   }

   private void fixdownMin(int var1) {
      for (int var2 = 2 * var1; var2 <= this.size; var2 = 2 * var1) {
         int var3 = this.minChildOrGrandchild(var1);
         if (var3 <= var2 + 1) {
            if (((Comparable)this.array[var3]).compareTo(this.array[var1]) < 0) {
               Object var6 = this.array[var1];
               this.array[var1] = this.array[var3];
               this.array[var3] = (K)var6;
            }
            break;
         }

         if (((Comparable)this.array[var3]).compareTo(this.array[var1]) >= 0) {
            break;
         }

         Object var4 = this.array[var1];
         this.array[var1] = this.array[var3];
         this.array[var3] = (K)var4;
         if (((Comparable)this.array[var3]).compareTo(this.array[var3 / 2]) > 0) {
            var4 = this.array[var3];
            this.array[var3] = this.array[var3 / 2];
            this.array[var3 / 2] = (K)var4;
         }

         var1 = var3;
      }
   }

   private void fixdownMinWithComparator(int var1) {
      for (int var2 = 2 * var1; var2 <= this.size; var2 = 2 * var1) {
         int var3 = this.minChildOrGrandchildWithComparator(var1);
         if (var3 <= var2 + 1) {
            if (this.comparator.compare(this.array[var3], this.array[var1]) < 0) {
               Object var6 = this.array[var1];
               this.array[var1] = this.array[var3];
               this.array[var3] = (K)var6;
            }
            break;
         }

         if (this.comparator.compare(this.array[var3], this.array[var1]) >= 0) {
            break;
         }

         Object var4 = this.array[var1];
         this.array[var1] = this.array[var3];
         this.array[var3] = (K)var4;
         if (this.comparator.compare(this.array[var3], this.array[var3 / 2]) > 0) {
            var4 = this.array[var3];
            this.array[var3] = this.array[var3 / 2];
            this.array[var3 / 2] = (K)var4;
         }

         var1 = var3;
      }
   }

   private void fixdownMax(int var1) {
      for (int var2 = 2 * var1; var2 <= this.size; var2 = 2 * var1) {
         int var3 = this.maxChildOrGrandchild(var1);
         if (var3 <= var2 + 1) {
            if (((Comparable)this.array[var3]).compareTo(this.array[var1]) > 0) {
               Object var6 = this.array[var1];
               this.array[var1] = this.array[var3];
               this.array[var3] = (K)var6;
            }
            break;
         }

         if (((Comparable)this.array[var3]).compareTo(this.array[var1]) <= 0) {
            break;
         }

         Object var4 = this.array[var1];
         this.array[var1] = this.array[var3];
         this.array[var3] = (K)var4;
         if (((Comparable)this.array[var3]).compareTo(this.array[var3 / 2]) < 0) {
            var4 = this.array[var3];
            this.array[var3] = this.array[var3 / 2];
            this.array[var3 / 2] = (K)var4;
         }

         var1 = var3;
      }
   }

   private void fixdownMaxWithComparator(int var1) {
      for (int var2 = 2 * var1; var2 <= this.size; var2 = 2 * var1) {
         int var3 = this.maxChildOrGrandchildWithComparator(var1);
         if (var3 <= var2 + 1) {
            if (this.comparator.compare(this.array[var3], this.array[var1]) > 0) {
               Object var6 = this.array[var1];
               this.array[var1] = this.array[var3];
               this.array[var3] = (K)var6;
            }
            break;
         }

         if (this.comparator.compare(this.array[var3], this.array[var1]) <= 0) {
            break;
         }

         Object var4 = this.array[var1];
         this.array[var1] = this.array[var3];
         this.array[var3] = (K)var4;
         if (this.comparator.compare(this.array[var3], this.array[var3 / 2]) < 0) {
            var4 = this.array[var3];
            this.array[var3] = this.array[var3 / 2];
            this.array[var3 / 2] = (K)var4;
         }

         var1 = var3;
      }
   }

   boolean onMinLevel(int var1) {
      float var2 = var1;
      int var3 = Math.getExponent(var2);
      return var3 % 2 == 0;
   }

   private int maxChildOrGrandchild(int var1) {
      int var2 = 4 * var1;
      if (var2 + 3 <= this.size) {
         Object var18 = this.array[var2];
         int var14 = var2++;
         if (((Comparable)this.array[var2]).compareTo(var18) > 0) {
            var18 = this.array[var2];
            var14 = var2;
         }

         if (((Comparable)this.array[++var2]).compareTo(var18) > 0) {
            var18 = this.array[var2];
            var14 = var2;
         }

         if (((Comparable)this.array[++var2]).compareTo(var18) > 0) {
            var14 = var2;
         }

         return var14;
      } else {
         switch (this.size - var2) {
            case 0:
               Object var17 = this.array[var2];
               int var13 = var2;
               if (2 * var1 + 1 <= this.size && ((Comparable)this.array[2 * var1 + 1]).compareTo(var17) > 0) {
                  var13 = 2 * var1 + 1;
               }

               return var13;
            case 1:
               Object var16 = this.array[var2];
               int var12 = var2++;
               if (((Comparable)this.array[var2]).compareTo(var16) > 0) {
                  var16 = this.array[var2];
                  var12 = var2;
               }

               if (2 * var1 + 1 <= this.size && ((Comparable)this.array[2 * var1 + 1]).compareTo(var16) > 0) {
                  var12 = 2 * var1 + 1;
               }

               return var12;
            case 2:
               Object var15 = this.array[var2];
               int var11 = var2++;
               if (((Comparable)this.array[var2]).compareTo(var15) > 0) {
                  var15 = this.array[var2];
                  var11 = var2;
               }

               if (((Comparable)this.array[++var2]).compareTo(var15) > 0) {
                  var11 = var2;
               }

               return var11;
            default:
               int var3 = 2 * var1;
               Object var4 = this.array[var3];
               if (2 * var1 + 1 <= this.size && ((Comparable)this.array[2 * var1 + 1]).compareTo(var4) > 0) {
                  var3 = 2 * var1 + 1;
               }

               return var3;
         }
      }
   }

   private int maxChildOrGrandchildWithComparator(int var1) {
      int var2 = 4 * var1;
      if (var2 + 3 <= this.size) {
         Object var18 = this.array[var2];
         int var14 = var2++;
         if (this.comparator.compare(this.array[var2], (K)var18) > 0) {
            var18 = this.array[var2];
            var14 = var2;
         }

         if (this.comparator.compare(this.array[++var2], (K)var18) > 0) {
            var18 = this.array[var2];
            var14 = var2;
         }

         if (this.comparator.compare(this.array[++var2], (K)var18) > 0) {
            var14 = var2;
         }

         return var14;
      } else {
         switch (this.size - var2) {
            case 0:
               Object var17 = this.array[var2];
               int var13 = var2;
               if (2 * var1 + 1 <= this.size && this.comparator.compare(this.array[2 * var1 + 1], (K)var17) > 0) {
                  var13 = 2 * var1 + 1;
               }

               return var13;
            case 1:
               Object var16 = this.array[var2];
               int var12 = var2++;
               if (this.comparator.compare(this.array[var2], (K)var16) > 0) {
                  var16 = this.array[var2];
                  var12 = var2;
               }

               if (2 * var1 + 1 <= this.size && this.comparator.compare(this.array[2 * var1 + 1], (K)var16) > 0) {
                  var12 = 2 * var1 + 1;
               }

               return var12;
            case 2:
               Object var15 = this.array[var2];
               int var11 = var2++;
               if (this.comparator.compare(this.array[var2], (K)var15) > 0) {
                  var15 = this.array[var2];
                  var11 = var2;
               }

               if (this.comparator.compare(this.array[++var2], (K)var15) > 0) {
                  var11 = var2;
               }

               return var11;
            default:
               int var3 = 2 * var1;
               Object var4 = this.array[var3];
               if (2 * var1 + 1 <= this.size && this.comparator.compare(this.array[2 * var1 + 1], (K)var4) > 0) {
                  var3 = 2 * var1 + 1;
               }

               return var3;
         }
      }
   }

   private int minChildOrGrandchild(int var1) {
      int var2 = 4 * var1;
      if (var2 + 3 <= this.size) {
         Object var18 = this.array[var2];
         int var14 = var2++;
         if (((Comparable)this.array[var2]).compareTo(var18) < 0) {
            var18 = this.array[var2];
            var14 = var2;
         }

         if (((Comparable)this.array[++var2]).compareTo(var18) < 0) {
            var18 = this.array[var2];
            var14 = var2;
         }

         if (((Comparable)this.array[++var2]).compareTo(var18) < 0) {
            var14 = var2;
         }

         return var14;
      } else {
         switch (this.size - var2) {
            case 0:
               Object var17 = this.array[var2];
               int var13 = var2;
               if (2 * var1 + 1 <= this.size && ((Comparable)this.array[2 * var1 + 1]).compareTo(var17) < 0) {
                  var13 = 2 * var1 + 1;
               }

               return var13;
            case 1:
               Object var16 = this.array[var2];
               int var12 = var2++;
               if (((Comparable)this.array[var2]).compareTo(var16) < 0) {
                  var16 = this.array[var2];
                  var12 = var2;
               }

               if (2 * var1 + 1 <= this.size && ((Comparable)this.array[2 * var1 + 1]).compareTo(var16) < 0) {
                  var12 = 2 * var1 + 1;
               }

               return var12;
            case 2:
               Object var15 = this.array[var2];
               int var11 = var2++;
               if (((Comparable)this.array[var2]).compareTo(var15) < 0) {
                  var15 = this.array[var2];
                  var11 = var2;
               }

               if (((Comparable)this.array[++var2]).compareTo(var15) < 0) {
                  var11 = var2;
               }

               return var11;
            default:
               int var3 = 2 * var1;
               Object var4 = this.array[var3];
               if (2 * var1 + 1 <= this.size && ((Comparable)this.array[2 * var1 + 1]).compareTo(var4) < 0) {
                  var3 = 2 * var1 + 1;
               }

               return var3;
         }
      }
   }

   private int minChildOrGrandchildWithComparator(int var1) {
      int var2 = 4 * var1;
      if (var2 + 3 <= this.size) {
         Object var18 = this.array[var2];
         int var14 = var2++;
         if (this.comparator.compare(this.array[var2], (K)var18) < 0) {
            var18 = this.array[var2];
            var14 = var2;
         }

         if (this.comparator.compare(this.array[++var2], (K)var18) < 0) {
            var18 = this.array[var2];
            var14 = var2;
         }

         if (this.comparator.compare(this.array[++var2], (K)var18) < 0) {
            var14 = var2;
         }

         return var14;
      } else {
         switch (this.size - var2) {
            case 0:
               Object var17 = this.array[var2];
               int var13 = var2;
               if (2 * var1 + 1 <= this.size && this.comparator.compare(this.array[2 * var1 + 1], (K)var17) < 0) {
                  var13 = 2 * var1 + 1;
               }

               return var13;
            case 1:
               Object var16 = this.array[var2];
               int var12 = var2++;
               if (this.comparator.compare(this.array[var2], (K)var16) < 0) {
                  var16 = this.array[var2];
                  var12 = var2;
               }

               if (2 * var1 + 1 <= this.size && this.comparator.compare(this.array[2 * var1 + 1], (K)var16) < 0) {
                  var12 = 2 * var1 + 1;
               }

               return var12;
            case 2:
               Object var15 = this.array[var2];
               int var11 = var2++;
               if (this.comparator.compare(this.array[var2], (K)var15) < 0) {
                  var15 = this.array[var2];
                  var11 = var2;
               }

               if (this.comparator.compare(this.array[++var2], (K)var15) < 0) {
                  var11 = var2;
               }

               return var11;
            default:
               int var3 = 2 * var1;
               Object var4 = this.array[var3];
               if (2 * var1 + 1 <= this.size && this.comparator.compare(this.array[2 * var1 + 1], (K)var4) < 0) {
                  var3 = 2 * var1 + 1;
               }

               return var3;
         }
      }
   }
}
