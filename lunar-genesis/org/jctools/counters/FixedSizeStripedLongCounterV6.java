package org.jctools.counters;

import org.jctools.util.UnsafeAccess;

class FixedSizeStripedLongCounterV6 extends FixedSizeStripedLongCounter {
   public FixedSizeStripedLongCounterV6(int var1) {
      super(var1);
   }

   @Override
   protected void inc(long[] var1, long var2, long var4) {
      long var6;
      do {
         var6 = UnsafeAccess.UNSAFE.getLongVolatile(var1, var2);
      } while (!UnsafeAccess.UNSAFE.compareAndSwapLong(var1, var2, var6, var6 + var4));
   }

   @Override
   protected long getAndReset(long[] var1, long var2) {
      long var4;
      do {
         var4 = UnsafeAccess.UNSAFE.getLongVolatile(var1, var2);
      } while (!UnsafeAccess.UNSAFE.compareAndSwapLong(var1, var2, var4, 0L));

      return var4;
   }
}
