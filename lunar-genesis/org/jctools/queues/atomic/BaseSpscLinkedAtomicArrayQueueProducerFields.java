package org.jctools.queues.atomic;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

abstract class BaseSpscLinkedAtomicArrayQueueProducerFields<E> extends BaseSpscLinkedAtomicArrayQueueL2Pad<E> {
   private static final AtomicLongFieldUpdater<BaseSpscLinkedAtomicArrayQueueProducerFields> P_INDEX_UPDATER = AtomicLongFieldUpdater.newUpdater(
      BaseSpscLinkedAtomicArrayQueueProducerFields.class, "producerIndex"
   );
   private volatile long producerIndex;

   @Override
   public final long lvProducerIndex() {
      return this.producerIndex;
   }

   final void soProducerIndex(long var1) {
      P_INDEX_UPDATER.lazySet(this, var1);
   }

   final long lpProducerIndex() {
      return this.producerIndex;
   }
}
