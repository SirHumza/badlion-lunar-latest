package org.jctools.queues;

import java.util.Iterator;
import org.jctools.util.PortableJvmInfo;
import org.jctools.util.UnsafeRefArrayAccess;

abstract class BaseSpscLinkedArrayQueue<E> extends BaseSpscLinkedArrayQueueProducerColdFields<E> implements MessagePassingQueue<E>, QueueProgressIndicators {
   private static final Object JUMP = new Object();

   @Override
   public final Iterator<E> iterator() {
      throw new UnsupportedOperationException();
   }

   @Override
   public final int size() {
      return IndexedQueueSizeUtil.size(this, 1);
   }

   @Override
   public final boolean isEmpty() {
      return IndexedQueueSizeUtil.isEmpty(this);
   }

   @Override
   public String toString() {
      return this.getClass().getName();
   }

   @Override
   public long currentProducerIndex() {
      return this.lvProducerIndex();
   }

   @Override
   public long currentConsumerIndex() {
      return this.lvConsumerIndex();
   }

   protected final void soNext(E[] var1, E[] var2) {
      long var3 = LinkedArrayQueueUtil.nextArrayOffset(var1);
      UnsafeRefArrayAccess.soRefElement(var1, var3, var2);
   }

   protected final E[] lvNextArrayAndUnlink(E[] var1) {
      long var2 = LinkedArrayQueueUtil.nextArrayOffset(var1);
      Object[] var4 = UnsafeRefArrayAccess.lvRefElement(var1, var2);
      UnsafeRefArrayAccess.soRefElement(var1, var2, null);
      return (E[])var4;
   }

   @Override
   public boolean relaxedOffer(E var1) {
      return this.offer((E)var1);
   }

   @Override
   public E relaxedPoll() {
      return this.poll();
   }

   @Override
   public E relaxedPeek() {
      return this.peek();
   }

   @Override
   public int drain(MessagePassingQueue.Consumer<E> var1) {
      return MessagePassingQueueUtil.drain(this, var1);
   }

   @Override
   public int fill(MessagePassingQueue.Supplier<E> var1) {
      long var2 = 0L;
      int var4 = this.capacity();

      do {
         int var5 = this.fill(var1, PortableJvmInfo.RECOMENDED_OFFER_BATCH);
         if (var5 == 0) {
            return (int)var2;
         }

         var2 += var5;
      } while (var2 <= var4);

      return (int)var2;
   }

   @Override
   public int drain(MessagePassingQueue.Consumer<E> var1, int var2) {
      return MessagePassingQueueUtil.drain(this, var1, var2);
   }

   @Override
   public int fill(MessagePassingQueue.Supplier<E> var1, int var2) {
      if (null == var1) {
         throw new IllegalArgumentException("supplier is null");
      }

      if (var2 < 0) {
         throw new IllegalArgumentException("limit is negative:" + var2);
      }

      if (var2 == 0) {
         return 0;
      }

      for (int var3 = 0; var3 < var2; var3++) {
         Object[] var4 = this.producerBuffer;
         long var5 = this.lpProducerIndex();
         long var7 = this.producerMask;
         long var9 = UnsafeRefArrayAccess.calcCircularRefElementOffset(var5, var7);
         if (var5 < this.producerBufferLimit) {
            this.writeToQueue((E[])var4, (E)var1.get(), var5, var9);
         } else if (!this.offerColdPath((E[])var4, var7, var5, var9, null, var1)) {
            return var3;
         }
      }

      return var2;
   }

   @Override
   public void drain(MessagePassingQueue.Consumer<E> var1, MessagePassingQueue.WaitStrategy var2, MessagePassingQueue.ExitCondition var3) {
      MessagePassingQueueUtil.drain(this, var1, var2, var3);
   }

   @Override
   public void fill(MessagePassingQueue.Supplier<E> var1, MessagePassingQueue.WaitStrategy var2, MessagePassingQueue.ExitCondition var3) {
      MessagePassingQueueUtil.fill(this, var1, var2, var3);
   }

   @Override
   public boolean offer(E var1) {
      if (null == var1) {
         throw new NullPointerException();
      } else {
         Object[] var2 = this.producerBuffer;
         long var3 = this.lpProducerIndex();
         long var5 = this.producerMask;
         long var7 = UnsafeRefArrayAccess.calcCircularRefElementOffset(var3, var5);
         if (var3 < this.producerBufferLimit) {
            this.writeToQueue((E[])var2, (E)var1, var3, var7);
            return true;
         } else {
            return this.offerColdPath((E[])var2, var5, var3, var7, (E)var1, null);
         }
      }
   }

   abstract boolean offerColdPath(E[] var1, long var2, long var4, long var6, E var8, MessagePassingQueue.Supplier<? extends E> var9);

   @Override
   public E poll() {
      Object[] var1 = this.consumerBuffer;
      long var2 = this.lpConsumerIndex();
      long var4 = this.consumerMask;
      long var6 = UnsafeRefArrayAccess.calcCircularRefElementOffset(var2, var4);
      Object var8 = UnsafeRefArrayAccess.lvRefElement(var1, var6);
      boolean var9 = var8 == JUMP;
      if (null != var8 && !var9) {
         this.soConsumerIndex(var2 + 1L);
         UnsafeRefArrayAccess.soRefElement(var1, var6, null);
         return (E)var8;
      } else {
         return var9 ? this.newBufferPoll((E[])var1, var2) : null;
      }
   }

   @Override
   public E peek() {
      Object[] var1 = this.consumerBuffer;
      long var2 = this.lpConsumerIndex();
      long var4 = this.consumerMask;
      long var6 = UnsafeRefArrayAccess.calcCircularRefElementOffset(var2, var4);
      Object var8 = UnsafeRefArrayAccess.lvRefElement(var1, var6);
      return (E)(var8 == JUMP ? this.newBufferPeek((E[])var1, var2) : var8);
   }

   final void linkOldToNew(long var1, E[] var3, long var4, E[] var6, long var7, E var9) {
      UnsafeRefArrayAccess.soRefElement(var6, var7, var9);
      this.soNext((E[])var3, (E[])var6);
      UnsafeRefArrayAccess.soRefElement(var3, var4, JUMP);
      this.soProducerIndex(var1 + 1L);
   }

   final void writeToQueue(E[] var1, E var2, long var3, long var5) {
      UnsafeRefArrayAccess.soRefElement(var1, var5, var2);
      this.soProducerIndex(var3 + 1L);
   }

   private E newBufferPeek(E[] var1, long var2) {
      Object[] var4 = this.lvNextArrayAndUnlink((E[])var1);
      this.consumerBuffer = (E[])var4;
      long var5 = LinkedArrayQueueUtil.length(var4) - 2;
      this.consumerMask = var5;
      long var7 = UnsafeRefArrayAccess.calcCircularRefElementOffset(var2, var5);
      return UnsafeRefArrayAccess.lvRefElement((E[])var4, var7);
   }

   private E newBufferPoll(E[] var1, long var2) {
      Object[] var4 = this.lvNextArrayAndUnlink((E[])var1);
      this.consumerBuffer = (E[])var4;
      long var5 = LinkedArrayQueueUtil.length(var4) - 2;
      this.consumerMask = var5;
      long var7 = UnsafeRefArrayAccess.calcCircularRefElementOffset(var2, var5);
      Object var9 = UnsafeRefArrayAccess.lvRefElement(var4, var7);
      if (null == var9) {
         throw new IllegalStateException("new buffer must have at least one element");
      }

      this.soConsumerIndex(var2 + 1L);
      UnsafeRefArrayAccess.soRefElement(var4, var7, null);
      return (E)var9;
   }
}
