package org.jheaps.monotone;

import java.lang.reflect.Array;

public class IntegerRadixAddressableHeap<V> extends AbstractRadixAddressableHeap<Integer, V> {
   private static final long serialVersionUID = 1L;

   public IntegerRadixAddressableHeap(int var1, int var2) {
      if (var1 < 0) {
         throw new IllegalArgumentException("Minimum key must be non-negative");
      }

      this.minKey = var1;
      this.lastDeletedKey = var1;
      if (var2 < var1) {
         throw new IllegalArgumentException("Maximum key cannot be less than the minimum");
      }

      this.maxKey = var2;
      int var3;
      if (var2 == var1) {
         var3 = 2;
      } else {
         var3 = 3 + (int)Math.floor(Math.log((double)var2 - var1) / Math.log(2.0));
      }

      this.buckets = (AbstractRadixAddressableHeap.Node[])Array.newInstance(AbstractRadixAddressableHeap.Node.class, var3);
      this.size = 0L;
      this.currentMin = null;
   }

   protected int compare(Integer var1, Integer var2) {
      if (var1 < var2) {
         return -1;
      } else {
         return var1 > var2 ? 1 : 0;
      }
   }

   protected int msd(Integer var1, Integer var2) {
      if (var1 == var2) {
         return -1;
      }

      float var3 = var1 ^ var2;
      return Math.getExponent(var3);
   }
}
