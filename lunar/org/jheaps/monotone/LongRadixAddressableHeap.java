package org.jheaps.monotone;

import java.lang.reflect.Array;

public class LongRadixAddressableHeap<V> extends AbstractRadixAddressableHeap<Long, V> {
   private static final long serialVersionUID = 1L;

   public LongRadixAddressableHeap(long var1, long var3) {
      if (var1 < 0L) {
         throw new IllegalArgumentException("Minimum key must be non-negative");
      }

      this.minKey = var1;
      this.lastDeletedKey = var1;
      if (var3 < var1) {
         throw new IllegalArgumentException("Maximum key cannot be less than the minimum");
      }

      this.maxKey = var3;
      int var5;
      if (var3 == var1) {
         var5 = 2;
      } else {
         var5 = 3 + (int)Math.floor(Math.log((double)var3 - var1) / Math.log(2.0));
      }

      this.buckets = (AbstractRadixAddressableHeap.Node[])Array.newInstance(AbstractRadixAddressableHeap.Node.class, var5);
      this.size = 0L;
      this.currentMin = null;
   }

   protected int compare(Long var1, Long var2) {
      if (var1 < var2) {
         return -1;
      } else {
         return var1 > var2 ? 1 : 0;
      }
   }

   protected int msd(Long var1, Long var2) {
      if (var1 == var2) {
         return -1;
      }

      double var3 = var1 ^ var2;
      return Math.getExponent(var3);
   }
}
