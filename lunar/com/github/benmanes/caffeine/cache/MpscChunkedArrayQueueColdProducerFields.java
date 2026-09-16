package com.github.benmanes.caffeine.cache;

abstract class MpscChunkedArrayQueueColdProducerFields<E> extends BaseMpscLinkedArrayQueue<E> {
   protected final long maxQueueCapacity;

   MpscChunkedArrayQueueColdProducerFields(int var1, int var2) {
      super(var1);
      if (var2 < 4) {
         throw new IllegalArgumentException("Max capacity must be 4 or more");
      }

      if (Caffeine.ceilingPowerOfTwo(var1) >= Caffeine.ceilingPowerOfTwo(var2)) {
         throw new IllegalArgumentException("Initial capacity cannot exceed maximum capacity(both rounded up to a power of 2)");
      }

      this.maxQueueCapacity = (long)Caffeine.ceilingPowerOfTwo(var2) << 1;
   }
}
