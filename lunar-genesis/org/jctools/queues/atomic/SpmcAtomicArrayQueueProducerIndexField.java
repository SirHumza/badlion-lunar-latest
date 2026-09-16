package org.jctools.queues.atomic;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

abstract class SpmcAtomicArrayQueueProducerIndexField<E> extends SpmcAtomicArrayQueueL1Pad<E> {
   private static final AtomicLongFieldUpdater<SpmcAtomicArrayQueueProducerIndexField> P_INDEX_UPDATER = AtomicLongFieldUpdater.newUpdater(
      SpmcAtomicArrayQueueProducerIndexField.class, "producerIndex"
   );
   private volatile long producerIndex;

   SpmcAtomicArrayQueueProducerIndexField(int var1) {
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
