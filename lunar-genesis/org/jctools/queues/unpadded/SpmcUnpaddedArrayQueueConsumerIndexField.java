package org.jctools.queues.unpadded;

import org.jctools.util.UnsafeAccess;

abstract class SpmcUnpaddedArrayQueueConsumerIndexField<E> extends SpmcUnpaddedArrayQueueL2Pad<E> {
   protected static final long C_INDEX_OFFSET = UnsafeAccess.fieldOffset(SpmcUnpaddedArrayQueueConsumerIndexField.class, "consumerIndex");
   private volatile long consumerIndex;

   SpmcUnpaddedArrayQueueConsumerIndexField(int var1) {
      super(var1);
   }

   @Override
   public final long lvConsumerIndex() {
      return this.consumerIndex;
   }

   final boolean casConsumerIndex(long var1, long var3) {
      return UnsafeAccess.UNSAFE.compareAndSwapLong(this, C_INDEX_OFFSET, var1, var3);
   }
}
