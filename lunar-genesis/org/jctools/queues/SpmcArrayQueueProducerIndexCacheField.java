package org.jctools.queues;

abstract class SpmcArrayQueueProducerIndexCacheField<E> extends SpmcArrayQueueMidPad<E> {
   private volatile long producerIndexCache;

   SpmcArrayQueueProducerIndexCacheField(int var1) {
      super(var1);
   }

   protected final long lvProducerIndexCache() {
      return this.producerIndexCache;
   }

   protected final void svProducerIndexCache(long var1) {
      this.producerIndexCache = var1;
   }
}
