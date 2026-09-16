package org.jctools.queues.unpadded;

import org.jctools.util.UnsafeAccess;

abstract class BaseMpscLinkedUnpaddedArrayQueueConsumerFields<E> extends BaseMpscLinkedUnpaddedArrayQueuePad2<E> {
   private static final long C_INDEX_OFFSET = UnsafeAccess.fieldOffset(BaseMpscLinkedUnpaddedArrayQueueConsumerFields.class, "consumerIndex");
   private volatile long consumerIndex;
   protected long consumerMask;
   protected E[] consumerBuffer;

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
