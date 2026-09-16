package org.jctools.queues.unpadded;

import org.jctools.util.UnsafeAccess;

abstract class BaseMpscLinkedUnpaddedArrayQueueProducerFields<E> extends BaseMpscLinkedUnpaddedArrayQueuePad1<E> {
   private static final long P_INDEX_OFFSET = UnsafeAccess.fieldOffset(BaseMpscLinkedUnpaddedArrayQueueProducerFields.class, "producerIndex");
   private volatile long producerIndex;

   @Override
   public final long lvProducerIndex() {
      return this.producerIndex;
   }

   final void soProducerIndex(long var1) {
      UnsafeAccess.UNSAFE.putOrderedLong(this, P_INDEX_OFFSET, var1);
   }

   final boolean casProducerIndex(long var1, long var3) {
      return UnsafeAccess.UNSAFE.compareAndSwapLong(this, P_INDEX_OFFSET, var1, var3);
   }
}
