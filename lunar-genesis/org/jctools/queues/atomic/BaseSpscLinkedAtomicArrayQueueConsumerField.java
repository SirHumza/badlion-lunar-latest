package org.jctools.queues.atomic;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

abstract class BaseSpscLinkedAtomicArrayQueueConsumerField<E> extends BaseSpscLinkedAtomicArrayQueueConsumerColdFields<E> {
   private static final AtomicLongFieldUpdater<BaseSpscLinkedAtomicArrayQueueConsumerField> C_INDEX_UPDATER = AtomicLongFieldUpdater.newUpdater(
      BaseSpscLinkedAtomicArrayQueueConsumerField.class, "consumerIndex"
   );
   private volatile long consumerIndex;

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
