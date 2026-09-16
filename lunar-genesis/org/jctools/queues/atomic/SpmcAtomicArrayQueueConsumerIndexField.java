package org.jctools.queues.atomic;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

abstract class SpmcAtomicArrayQueueConsumerIndexField<E> extends SpmcAtomicArrayQueueL2Pad<E> {
   private static final AtomicLongFieldUpdater<SpmcAtomicArrayQueueConsumerIndexField> C_INDEX_UPDATER = AtomicLongFieldUpdater.newUpdater(
      SpmcAtomicArrayQueueConsumerIndexField.class, "consumerIndex"
   );
   private volatile long consumerIndex;

   SpmcAtomicArrayQueueConsumerIndexField(int var1) {
      super(var1);
   }

   @Override
   public final long lvConsumerIndex() {
      return this.consumerIndex;
   }

   final boolean casConsumerIndex(long var1, long var3) {
      return C_INDEX_UPDATER.compareAndSet(this, var1, var3);
   }
}
