package org.jctools.queues;

import org.jctools.util.UnsafeAccess;

abstract class MpscBlockingConsumerArrayQueueConsumerFields<E> extends MpscBlockingConsumerArrayQueuePad3<E> {
   private static final long C_INDEX_OFFSET = UnsafeAccess.fieldOffset(MpscBlockingConsumerArrayQueueConsumerFields.class, "consumerIndex");
   private static final long BLOCKED_OFFSET = UnsafeAccess.fieldOffset(MpscBlockingConsumerArrayQueueConsumerFields.class, "blocked");
   private volatile long consumerIndex;
   protected final long consumerMask;
   private volatile Thread blocked;
   protected final E[] consumerBuffer;

   MpscBlockingConsumerArrayQueueConsumerFields(long var1, E[] var3) {
      super(var1, (E[])var3);
      this.consumerMask = var1;
      this.consumerBuffer = (E[])var3;
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

   final Thread lvBlocked() {
      return this.blocked;
   }

   final void soBlocked(Thread var1) {
      UnsafeAccess.UNSAFE.putOrderedObject(this, BLOCKED_OFFSET, var1);
   }
}
