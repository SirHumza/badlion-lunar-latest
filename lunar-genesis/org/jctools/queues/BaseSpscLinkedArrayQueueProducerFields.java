package org.jctools.queues;

import org.jctools.util.UnsafeAccess;

abstract class BaseSpscLinkedArrayQueueProducerFields<E> extends BaseSpscLinkedArrayQueueL2Pad<E> {
   private static final long P_INDEX_OFFSET = UnsafeAccess.fieldOffset(BaseSpscLinkedArrayQueueProducerFields.class, "producerIndex");
   private volatile long producerIndex;

   @Override
   public final long lvProducerIndex() {
      return this.producerIndex;
   }

   final void soProducerIndex(long var1) {
      UnsafeAccess.UNSAFE.putOrderedLong(this, P_INDEX_OFFSET, var1);
   }

   final long lpProducerIndex() {
      return UnsafeAccess.UNSAFE.getLong(this, P_INDEX_OFFSET);
   }
}
