package org.jctools.counters;

import org.jctools.util.UnsafeAccess;

class FixedSizeStripedLongCounterV8 extends FixedSizeStripedLongCounter {
   public FixedSizeStripedLongCounterV8(int var1) {
      super(var1);
   }

   @Override
   protected void inc(long[] var1, long var2, long var4) {
      UnsafeAccess.UNSAFE.getAndAddLong(var1, var2, var4);
   }

   @Override
   protected long getAndReset(long[] var1, long var2) {
      return UnsafeAccess.UNSAFE.getAndSetLong(var1, var2, 0L);
   }
}
