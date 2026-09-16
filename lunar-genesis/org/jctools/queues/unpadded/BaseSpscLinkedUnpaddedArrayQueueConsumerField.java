package org.jctools.queues.unpadded;

import org.jctools.util.UnsafeAccess;

abstract class BaseSpscLinkedUnpaddedArrayQueueConsumerField<E> extends BaseSpscLinkedUnpaddedArrayQueueConsumerColdFields<E> {
   private static final long C_INDEX_OFFSET = UnsafeAccess.fieldOffset(BaseSpscLinkedUnpaddedArrayQueueConsumerField.class, "consumerIndex");
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
