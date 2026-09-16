package org.jctools.queues.atomic;

abstract class SpmcAtomicArrayQueueProducerIndexCacheField<E> extends SpmcAtomicArrayQueueMidPad<E> {
   private volatile long producerIndexCache;

   SpmcAtomicArrayQueueProducerIndexCacheField(int var1) {
      super(var1);
   }

   protected final long lvProducerIndexCache() {
      return this.producerIndexCache;
   }

   protected final void svProducerIndexCache(long var1) {
      this.producerIndexCache = var1;
   }
}
