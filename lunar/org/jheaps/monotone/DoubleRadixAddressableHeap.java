package org.jheaps.monotone;

import java.lang.reflect.Array;
import java.math.BigInteger;

public class DoubleRadixAddressableHeap<V> extends AbstractRadixAddressableHeap<Double, V> {
   private static final long serialVersionUID = 1L;

   public DoubleRadixAddressableHeap(double var1, double var3) {
      if (Double.isFinite(var1) && !(var1 < 0.0)) {
         this.minKey = var1;
         this.lastDeletedKey = var1;
         if (Double.isFinite(var3) && !(var3 < var1)) {
            this.maxKey = var3;
            BigInteger var5 = UnsignedUtils.unsignedLongToBigInt(Double.doubleToLongBits(var1));
            BigInteger var6 = UnsignedUtils.unsignedLongToBigInt(Double.doubleToLongBits(var3));
            BigInteger var7 = var6.subtract(var5);
            int var8 = 3 + var7.bitLength();
            this.buckets = (AbstractRadixAddressableHeap.Node[])Array.newInstance(AbstractRadixAddressableHeap.Node.class, var8);
            this.size = 0L;
            this.currentMin = null;
         } else {
            throw new IllegalArgumentException("Maximum key must be finite and not less than the minimum");
         }
      } else {
         throw new IllegalArgumentException("Minimum key must be finite and non-negative");
      }
   }

   protected int compare(Double var1, Double var2) {
      long var3 = Double.doubleToLongBits(var1) ^ Long.MIN_VALUE;
      long var5 = Double.doubleToLongBits(var2) ^ Long.MIN_VALUE;
      if (var1 < var2) {
         assert var3 < var5;
      } else if (var1 == var2) {
         assert var3 == var5;
      } else {
         assert var3 > var5;
      }

      return var3 < var5 ? -1 : (var3 == var5 ? 0 : 1);
   }

   protected int msd(Double var1, Double var2) {
      long var3 = Double.doubleToLongBits(var1);
      long var5 = Double.doubleToLongBits(var2);
      if (var3 == var5) {
         return -1;
      }

      double var7 = UnsignedUtils.unsignedLongToDouble(var3 ^ var5);
      return Math.getExponent(var7);
   }
}
