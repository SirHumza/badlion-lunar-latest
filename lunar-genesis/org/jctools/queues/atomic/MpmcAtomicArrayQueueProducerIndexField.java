package org.jctools.queues.atomic;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

abstract class MpmcAtomicArrayQueueProducerIndexField<E> extends MpmcAtomicArrayQueueL1Pad<E> {
   private static final AtomicLongFieldUpdater<MpmcAtomicArrayQueueProducerIndexField> P_INDEX_UPDATER = AtomicLongFieldUpdater.newUpdater(
      MpmcAtomicArrayQueueProducerIndexField.class, "producerIndex"
   );
   private volatile long producerIndex;

   MpmcAtomicArrayQueueProducerIndexField(int var1) {
      super(var1);
   }

   @Override
   public final long lvProducerIndex() {
      return this.producerIndex;
   }

   final boolean casProducerIndex(long var1, long var3) {
      return P_INDEX_UPDATER.compareAndSet(this, var1, var3);
   }
}
