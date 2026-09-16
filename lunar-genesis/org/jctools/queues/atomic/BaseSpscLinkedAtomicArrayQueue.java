package org.jctools.queues.atomic;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.jctools.queues.IndexedQueueSizeUtil;
import org.jctools.queues.MessagePassingQueue;
import org.jctools.queues.MessagePassingQueueUtil;
import org.jctools.queues.QueueProgressIndicators;
import org.jctools.util.PortableJvmInfo;

abstract class BaseSpscLinkedAtomicArrayQueue<E>
   extends BaseSpscLinkedAtomicArrayQueueProducerColdFields<E>
   implements MessagePassingQueue<E>,
   QueueProgressIndicators {
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

   protected final void soNext(AtomicReferenceArray<E> var1, AtomicReferenceArray<E> var2) {
      int var3 = AtomicQueueUtil.nextArrayOffset(var1);
      AtomicQueueUtil.soRefElement(var1, var3, var2);
   }

   protected final AtomicReferenceArray<E> lvNextArrayAndUnlink(AtomicReferenceArray<E> var1) {
      int var2 = AtomicQueueUtil.nextArrayOffset(var1);
      AtomicReferenceArray var3 = AtomicQueueUtil.lvRefElement(var1, var2);
      AtomicQueueUtil.soRefElement(var1, var2, null);
      return var3;
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
         AtomicReferenceArray var4 = this.producerBuffer;
         long var5 = this.lpProducerIndex();
         long var7 = this.producerMask;
         int var9 = AtomicQueueUtil.calcCircularRefElementOffset(var5, var7);
         if (var5 < this.producerBufferLimit) {
            this.writeToQueue(var4, (E)var1.get(), var5, var9);
         } else if (!this.offerColdPath(var4, var7, var5, var9, null, var1)) {
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
         AtomicReferenceArray var2 = this.producerBuffer;
         long var3 = this.lpProducerIndex();
         long var5 = this.producerMask;
         int var7 = AtomicQueueUtil.calcCircularRefElementOffset(var3, var5);
         if (var3 < this.producerBufferLimit) {
            this.writeToQueue(var2, (E)var1, var3, var7);
            return true;
         } else {
            return this.offerColdPath(var2, var5, var3, var7, (E)var1, null);
         }
      }
   }

   abstract boolean offerColdPath(AtomicReferenceArray<E> var1, long var2, long var4, int var6, E var7, MessagePassingQueue.Supplier<? extends E> var8);

   @Override
   public E poll() {
      AtomicReferenceArray var1 = this.consumerBuffer;
      long var2 = this.lpConsumerIndex();
      long var4 = this.consumerMask;
      int var6 = AtomicQueueUtil.calcCircularRefElementOffset(var2, var4);
      Object var7 = AtomicQueueUtil.lvRefElement(var1, var6);
      boolean var8 = var7 == JUMP;
      if (null != var7 && !var8) {
         this.soConsumerIndex(var2 + 1L);
         AtomicQueueUtil.soRefElement(var1, var6, null);
         return (E)var7;
      } else {
         return var8 ? this.newBufferPoll(var1, var2) : null;
      }
   }

   @Override
   public E peek() {
      AtomicReferenceArray var1 = this.consumerBuffer;
      long var2 = this.lpConsumerIndex();
      long var4 = this.consumerMask;
      int var6 = AtomicQueueUtil.calcCircularRefElementOffset(var2, var4);
      Object var7 = AtomicQueueUtil.lvRefElement(var1, var6);
      return (E)(var7 == JUMP ? this.newBufferPeek(var1, var2) : var7);
   }

   final void linkOldToNew(long var1, AtomicReferenceArray<E> var3, int var4, AtomicReferenceArray<E> var5, int var6, E var7) {
      AtomicQueueUtil.soRefElement(var5, var6, var7);
      this.soNext(var3, var5);
      AtomicQueueUtil.soRefElement(var3, var4, JUMP);
      this.soProducerIndex(var1 + 1L);
   }

   final void writeToQueue(AtomicReferenceArray<E> var1, E var2, long var3, int var5) {
      AtomicQueueUtil.soRefElement(var1, var5, var2);
      this.soProducerIndex(var3 + 1L);
   }

   private E newBufferPeek(AtomicReferenceArray<E> var1, long var2) {
      AtomicReferenceArray var4 = this.lvNextArrayAndUnlink(var1);
      this.consumerBuffer = var4;
      long var5 = AtomicQueueUtil.length(var4) - 2;
      this.consumerMask = var5;
      int var7 = AtomicQueueUtil.calcCircularRefElementOffset(var2, var5);
      return AtomicQueueUtil.lvRefElement(var4, var7);
   }

   private E newBufferPoll(AtomicReferenceArray<E> var1, long var2) {
      AtomicReferenceArray var4 = this.lvNextArrayAndUnlink(var1);
      this.consumerBuffer = var4;
      long var5 = AtomicQueueUtil.length(var4) - 2;
      this.consumerMask = var5;
      int var7 = AtomicQueueUtil.calcCircularRefElementOffset(var2, var5);
      Object var8 = AtomicQueueUtil.lvRefElement(var4, var7);
      if (null == var8) {
         throw new IllegalStateException("new buffer must have at least one element");
      }

      this.soConsumerIndex(var2 + 1L);
      AtomicQueueUtil.soRefElement(var4, var7, null);
      return (E)var8;
   }
}
