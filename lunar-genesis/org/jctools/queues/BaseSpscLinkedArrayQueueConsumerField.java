package org.jctools.queues;

import org.jctools.util.UnsafeAccess;

abstract class BaseSpscLinkedArrayQueueConsumerField<E> extends BaseSpscLinkedArrayQueueConsumerColdFields<E> {
   private static final long C_INDEX_OFFSET = UnsafeAccess.fieldOffset(BaseSpscLinkedArrayQueueConsumerField.class, "consumerIndex");
   private volatile long consumerIndex;

   @Override
   public final long lvConsumerIndex() {
      return this.consumerIndex;
   }

   final long lpConsumerIndex() {
      return UnsafeAccess.UNSAFE.getLong(this, C_INDEX_OFFSET);
   }

   final void soConsumerIndex(long var1) {
      UnsafeAccess.UNSAFE.putOrderedLong(this, C_INDEX_OFFSET, var1);
   }
}
