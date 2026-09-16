package org.jctools.queues.unpadded;

import org.jctools.util.UnsafeAccess;

abstract class BaseSpscLinkedUnpaddedArrayQueueProducerFields<E> extends BaseSpscLinkedUnpaddedArrayQueueL2Pad<E> {
   private static final long P_INDEX_OFFSET = UnsafeAccess.fieldOffset(BaseSpscLinkedUnpaddedArrayQueueProducerFields.class, "producerIndex");
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
