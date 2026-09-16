package org.jctools.queues.unpadded;

abstract class SpmcUnpaddedArrayQueueProducerIndexCacheField<E> extends SpmcUnpaddedArrayQueueMidPad<E> {
   private volatile long producerIndexCache;

   SpmcUnpaddedArrayQueueProducerIndexCacheField(int var1) {
      super(var1);
   }

   protected final long lvProducerIndexCache() {
      return this.producerIndexCache;
   }

   protected final void svProducerIndexCache(long var1) {
      this.producerIndexCache = var1;
   }
}
