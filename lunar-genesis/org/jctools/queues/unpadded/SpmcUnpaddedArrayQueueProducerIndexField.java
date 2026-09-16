package org.jctools.queues.unpadded;

import org.jctools.util.UnsafeAccess;

abstract class SpmcUnpaddedArrayQueueProducerIndexField<E> extends SpmcUnpaddedArrayQueueL1Pad<E> {
   protected static final long P_INDEX_OFFSET = UnsafeAccess.fieldOffset(SpmcUnpaddedArrayQueueProducerIndexField.class, "producerIndex");
   private volatile long producerIndex;

   SpmcUnpaddedArrayQueueProducerIndexField(int var1) {
      super(var1);
   }

   @Override
   public final long lvProducerIndex() {
      return this.producerIndex;
   }

   final long lpProducerIndex() {
      return UnsafeAccess.UNSAFE.getLong(this, P_INDEX_OFFSET);
   }

   final void soProducerIndex(long var1) {
      UnsafeAccess.UNSAFE.putOrderedLong(this, P_INDEX_OFFSET, var1);
   }
}
