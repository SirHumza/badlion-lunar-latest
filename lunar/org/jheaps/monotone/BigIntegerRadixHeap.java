package org.jheaps.monotone;

import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class BigIntegerRadixHeap extends AbstractRadixHeap<BigInteger> {
   private static final long serialVersionUID = 1L;

   public BigIntegerRadixHeap(BigInteger var1, BigInteger var2) {
      if (var1 == null) {
         throw new IllegalArgumentException("Minimum key cannot be null");
      }

      if (var1.compareTo(BigInteger.ZERO) < 0) {
         throw new IllegalArgumentException("Minimum key must be non-negative");
      }

      this.minKey = var1;
      this.lastDeletedKey = var1;
      if (var2 == null) {
         throw new IllegalArgumentException("Maximum key cannot be null");
      }

      if (var2.compareTo(var1) < 0) {
         throw new IllegalArgumentException("Maximum key cannot be less than the minimum");
      }

      this.maxKey = var2;
      BigInteger var3 = var2.subtract(var1);
      int var4 = 3 + var3.bitLength();
      this.buckets = (List<BigInteger>[])Array.newInstance(List.class, var4);

      for (int var5 = 0; var5 < this.buckets.length; var5++) {
         this.buckets[var5] = new ArrayList<>();
      }

      this.size = 0L;
      this.currentMin = null;
   }

   protected int compare(BigInteger var1, BigInteger var2) {
      return var1.compareTo(var2);
   }

   protected int msd(BigInteger var1, BigInteger var2) {
      return var1.equals(var2) ? -1 : var1.xor(var2).bitLength() - 1;
   }
}
