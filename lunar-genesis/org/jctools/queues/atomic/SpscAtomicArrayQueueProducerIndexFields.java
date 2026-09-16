package org.jctools.queues.atomic;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

abstract class SpscAtomicArrayQueueProducerIndexFields<E> extends SpscAtomicArrayQueueL1Pad<E> {
   private static final AtomicLongFieldUpdater<SpscAtomicArrayQueueProducerIndexFields> P_INDEX_UPDATER = AtomicLongFieldUpdater.newUpdater(
      SpscAtomicArrayQueueProducerIndexFields.class, "producerIndex"
   );
   private volatile long producerIndex;
   protected long producerLimit;

   SpscAtomicArrayQueueProducerIndexFields(int var1) {
      super(var1);
   }

   @Override
   public final long lvProducerIndex() {
      return this.producerIndex;
   }

   final long lpProducerIndex() {
      return this.producerIndex;
   }

   final void soProducerIndex(long var1) {
      P_INDEX_UPDATER.lazySet(this, var1);
   }
}
