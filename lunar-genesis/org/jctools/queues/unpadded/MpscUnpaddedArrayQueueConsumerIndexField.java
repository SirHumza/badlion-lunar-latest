package org.jctools.queues.unpadded;

import org.jctools.util.UnsafeAccess;

abstract class MpscUnpaddedArrayQueueConsumerIndexField<E> extends MpscUnpaddedArrayQueueL2Pad<E> {
   private static final long C_INDEX_OFFSET = UnsafeAccess.fieldOffset(MpscUnpaddedArrayQueueConsumerIndexField.class, "consumerIndex");
   private volatile long consumerIndex;

   MpscUnpaddedArrayQueueConsumerIndexField(int var1) {
      super(var1);
   }

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
