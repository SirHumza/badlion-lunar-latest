package org.jctools.counters;

import org.jctools.util.UnsafeAccess;

public final class CountersFactory {
   private CountersFactory() {
   }

   public static FixedSizeStripedLongCounter createFixedSizeStripedCounter(int var0) {
      return UnsafeAccess.SUPPORTS_GET_AND_ADD_LONG ? new FixedSizeStripedLongCounterV8(var0) : new FixedSizeStripedLongCounterV6(var0);
   }

   public static FixedSizeStripedLongCounter createFixedSizeStripedCounterV6(int var0) {
      return new FixedSizeStripedLongCounterV6(var0);
   }

   public static FixedSizeStripedLongCounter createFixedSizeStripedCounterV8(int var0) {
      return new FixedSizeStripedLongCounterV8(var0);
   }
}
