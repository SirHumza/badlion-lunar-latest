package org.jctools.counters;

import java.util.concurrent.ThreadLocalRandom;
import org.jctools.util.UnsafeAccess;

public abstract class FixedSizeStripedLongCounter extends FixedSizeStripedLongCounterFields implements Counter {
   byte b000;
   byte b001;
   byte b002;
   byte b003;
   byte b004;
   byte b005;
   byte b006;
   byte b007;
   byte b010;
   byte b011;
   byte b012;
   byte b013;
   byte b014;
   byte b015;
   byte b016;
   byte b017;
   byte b020;
   byte b021;
   byte b022;
   byte b023;
   byte b024;
   byte b025;
   byte b026;
   byte b027;
   byte b030;
   byte b031;
   byte b032;
   byte b033;
   byte b034;
   byte b035;
   byte b036;
   byte b037;
   byte b040;
   byte b041;
   byte b042;
   byte b043;
   byte b044;
   byte b045;
   byte b046;
   byte b047;
   byte b050;
   byte b051;
   byte b052;
   byte b053;
   byte b054;
   byte b055;
   byte b056;
   byte b057;
   byte b060;
   byte b061;
   byte b062;
   byte b063;
   byte b064;
   byte b065;
   byte b066;
   byte b067;
   byte b070;
   byte b071;
   byte b072;
   byte b073;
   byte b074;
   byte b075;
   byte b076;
   byte b077;
   byte b100;
   byte b101;
   byte b102;
   byte b103;
   byte b104;
   byte b105;
   byte b106;
   byte b107;
   byte b110;
   byte b111;
   byte b112;
   byte b113;
   byte b114;
   byte b115;
   byte b116;
   byte b117;
   byte b120;
   byte b121;
   byte b122;
   byte b123;
   byte b124;
   byte b125;
   byte b126;
   byte b127;
   byte b130;
   byte b131;
   byte b132;
   byte b133;
   byte b134;
   byte b135;
   byte b136;
   byte b137;
   byte b140;
   byte b141;
   byte b142;
   byte b143;
   byte b144;
   byte b145;
   byte b146;
   byte b147;
   byte b150;
   byte b151;
   byte b152;
   byte b153;
   byte b154;
   byte b155;
   byte b156;
   byte b157;
   byte b160;
   byte b161;
   byte b162;
   byte b163;
   byte b164;
   byte b165;
   byte b166;
   byte b167;
   private static final long PROBE = getProbeOffset();

   private static long getProbeOffset() {
      try {
         return UnsafeAccess.UNSAFE.objectFieldOffset(Thread.class.getDeclaredField("threadLocalRandomProbe"));
      } catch (NoSuchFieldException var1) {
         return -1L;
      }
   }

   public FixedSizeStripedLongCounter(int var1) {
      super(var1);
   }

   @Override
   public void inc() {
      this.inc(1L);
   }

   @Override
   public void inc(long var1) {
      this.inc(this.cells, this.counterOffset(this.index()), var1);
   }

   @Override
   public long get() {
      long var1 = 0L;
      long[] var3 = this.cells;
      int var4 = this.mask + 1;

      for (int var5 = 0; var5 < var4; var5++) {
         var1 += UnsafeAccess.UNSAFE.getLongVolatile(var3, this.counterOffset(var5));
      }

      return var1;
   }

   private long counterOffset(long var1) {
      return COUNTER_ARRAY_BASE + (var1 << (int)ELEMENT_SHIFT);
   }

   @Override
   public long getAndReset() {
      long var1 = 0L;
      long[] var3 = this.cells;
      int var4 = this.mask + 1;

      for (int var5 = 0; var5 < var4; var5++) {
         var1 += this.getAndReset(var3, this.counterOffset(var5));
      }

      return var1;
   }

   protected abstract void inc(long[] var1, long var2, long var4);

   protected abstract long getAndReset(long[] var1, long var2);

   private int index() {
      return this.probe() & this.mask;
   }

   private int probe() {
      if (PROBE != -1L) {
         int var4;
         if ((var4 = UnsafeAccess.UNSAFE.getInt(Thread.currentThread(), PROBE)) == 0) {
            ThreadLocalRandom.current();
            var4 = UnsafeAccess.UNSAFE.getInt(Thread.currentThread(), PROBE);
         }

         return var4;
      } else {
         int var1 = (int)(Thread.currentThread().getId() * -1640531527L & 2147483647L);
         var1 ^= var1 << 13;
         var1 ^= var1 >>> 17;
         return var1 ^ var1 << 5;
      }
   }
}
