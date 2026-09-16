package com.github.benmanes.caffeine.cache;

import org.checkerframework.checker.index.qual.NonNegative;

final class FrequencySketch<E> {
   static final long RESET_MASK = 8608480567731124087L;
   static final long ONE_MASK = 1229782938247303441L;
   int sampleSize;
   int blockMask;
   long[] table;
   int size;

   public FrequencySketch() {
   }

   public void ensureCapacity(@NonNegative long var1) {
      Caffeine.requireArgument(var1 >= 0L);
      int var3 = (int)Math.min(var1, 1073741823L);
      if (this.table == null || this.table.length < var3) {
         this.table = new long[Math.max(Caffeine.ceilingPowerOfTwo(var3), 8)];
         this.sampleSize = var1 == 0L ? 10 : 10 * var3;
         this.blockMask = (this.table.length >>> 3) - 1;
         if (this.sampleSize <= 0) {
            this.sampleSize = Integer.MAX_VALUE;
         }

         this.size = 0;
      }
   }

   public boolean isNotInitialized() {
      return this.table == null;
   }

   public @NonNegative int frequency(E var1) {
      if (this.isNotInitialized()) {
         return 0;
      }

      int[] var2 = new int[4];
      int var3 = spread(var1.hashCode());
      int var4 = rehash(var3);
      int var5 = (var3 & this.blockMask) << 3;

      for (int var6 = 0; var6 < 4; var6++) {
         int var7 = var4 >>> (var6 << 3);
         int var8 = var7 >>> 1 & 15;
         int var9 = var7 & 1;
         var2[var6] = (int)(this.table[var5 + var9 + (var6 << 1)] >>> (var8 << 2) & 15L);
      }

      return Math.min(Math.min(var2[0], var2[1]), Math.min(var2[2], var2[3]));
   }

   public void increment(E var1) {
      if (!this.isNotInitialized()) {
         int[] var2 = new int[8];
         int var3 = spread(var1.hashCode());
         int var4 = rehash(var3);
         int var5 = (var3 & this.blockMask) << 3;

         for (int var6 = 0; var6 < 4; var6++) {
            int var7 = var4 >>> (var6 << 3);
            var2[var6] = var7 >>> 1 & 15;
            int var8 = var7 & 1;
            var2[var6 + 4] = var5 + var8 + (var6 << 1);
         }

         boolean var9 = this.incrementAt(var2[4], var2[0])
            | this.incrementAt(var2[5], var2[1])
            | this.incrementAt(var2[6], var2[2])
            | this.incrementAt(var2[7], var2[3]);
         if (var9 && ++this.size == this.sampleSize) {
            this.reset();
         }
      }
   }

   static int spread(int var0) {
      var0 ^= var0 >>> 17;
      var0 *= -312814405;
      var0 ^= var0 >>> 11;
      var0 *= -1404298415;
      return var0 ^ var0 >>> 15;
   }

   static int rehash(int var0) {
      var0 *= 830770091;
      return var0 ^ var0 >>> 14;
   }

   boolean incrementAt(int var1, int var2) {
      int var3 = var2 << 2;
      long var4 = 15L << var3;
      if ((this.table[var1] & var4) != var4) {
         this.table[var1] = this.table[var1] + (1L << var3);
         return true;
      } else {
         return false;
      }
   }

   void reset() {
      int var1 = 0;

      for (int var2 = 0; var2 < this.table.length; var2++) {
         var1 += Long.bitCount(this.table[var2] & 1229782938247303441L);
         this.table[var2] = this.table[var2] >>> 1 & 8608480567731124087L;
      }

      this.size = this.size - (var1 >>> 2) >>> 1;
   }
}
