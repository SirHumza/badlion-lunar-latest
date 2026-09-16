package org.jctools.queues.atomic;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

abstract class SpscAtomicArrayQueueConsumerIndexField<E> extends SpscAtomicArrayQueueL2Pad<E> {
   private static final AtomicLongFieldUpdater<SpscAtomicArrayQueueConsumerIndexField> C_INDEX_UPDATER = AtomicLongFieldUpdater.newUpdater(
      SpscAtomicArrayQueueConsumerIndexField.class, "consumerIndex"
   );
   private volatile long consumerIndex;

   SpscAtomicArrayQueueConsumerIndexField(int var1) {
      super(var1);
   }

   @Override
   public final long lvConsumerIndex() {
      return this.consumerIndex;
   }

   final long lpConsumerIndex() {
      return this.consumerIndex;
   }

   final void soConsumerIndex(long var1) {
      C_INDEX_UPDATER.lazySet(this, var1);
   }
}
