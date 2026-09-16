package org.jctools.queues;

import org.jctools.util.UnsafeAccess;

abstract class SpmcArrayQueueProducerIndexField<E> extends SpmcArrayQueueL1Pad<E> {
   protected static final long P_INDEX_OFFSET = UnsafeAccess.fieldOffset(SpmcArrayQueueProducerIndexField.class, "producerIndex");
   private volatile long producerIndex;

   SpmcArrayQueueProducerIndexField(int var1) {
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
