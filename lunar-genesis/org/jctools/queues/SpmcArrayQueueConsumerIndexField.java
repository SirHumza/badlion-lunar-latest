package org.jctools.queues;

import org.jctools.util.UnsafeAccess;

abstract class SpmcArrayQueueConsumerIndexField<E> extends SpmcArrayQueueL2Pad<E> {
   protected static final long C_INDEX_OFFSET = UnsafeAccess.fieldOffset(SpmcArrayQueueConsumerIndexField.class, "consumerIndex");
   private volatile long consumerIndex;

   SpmcArrayQueueConsumerIndexField(int var1) {
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
