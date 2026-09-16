package org.jctools.queues.atomic;

import java.util.concurrent.atomic.AtomicReferenceArray;
import org.jctools.queues.MessagePassingQueue;

public class SpscAtomicArrayQueue<E> extends SpscAtomicArrayQueueL3Pad<E> {
   public SpscAtomicArrayQueue(int var1) {
      super(Math.max(var1, 4));
   }

   @Override
   public boolean offer(E var1) {
      if (null == var1) {
         throw new NullPointerException();
      }

      AtomicReferenceArray var2 = this.buffer;
      int var3 = this.mask;
      long var4 = this.lpProducerIndex();
      if (var4 >= this.producerLimit && !this.offerSlowPath(var2, var3, var4)) {
         return false;
      }

      int var6 = AtomicQueueUtil.calcCircularRefElementOffset(var4, var3);
      AtomicQueueUtil.soRefElement(var2, var6, var1);
      this.soProducerIndex(var4 + 1L);
      return true;
   }

   private boolean offerSlowPath(AtomicReferenceArray<E> var1, int var2, long var3) {
      int var5 = this.lookAheadStep;
      if (null == AtomicQueueUtil.lvRefElement(var1, AtomicQueueUtil.calcCircularRefElementOffset(var3 + var5, var2))) {
         this.producerLimit = var3 + var5;
      } else {
         int var6 = AtomicQueueUtil.calcCircularRefElementOffset(var3, var2);
         if (null != AtomicQueueUtil.lvRefElement(var1, var6)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public E poll() {
      long var1 = this.lpConsumerIndex();
      int var3 = AtomicQueueUtil.calcCircularRefElementOffset(var1, this.mask);
      AtomicReferenceArray var4 = this.buffer;
      Object var5 = AtomicQueueUtil.lvRefElement(var4, var3);
      if (null == var5) {
         return null;
      }

      AtomicQueueUtil.soRefElement(var4, var3, null);
      this.soConsumerIndex(var1 + 1L);
      return (E)var5;
   }

   @Override
   public E peek() {
      return AtomicQueueUtil.lvRefElement(this.buffer, AtomicQueueUtil.calcCircularRefElementOffset(this.lpConsumerIndex(), this.mask));
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
      return this.drain(var1, this.capacity());
   }

   @Override
   public int fill(MessagePassingQueue.Supplier<E> var1) {
      return this.fill(var1, this.capacity());
   }

   @Override
   public int drain(MessagePassingQueue.Consumer<E> var1, int var2) {
      if (null == var1) {
         throw new IllegalArgumentException("c is null");
      }

      if (var2 < 0) {
         throw new IllegalArgumentException("limit is negative: " + var2);
      }

      if (var2 == 0) {
         return 0;
      }

      AtomicReferenceArray var3 = this.buffer;
      int var4 = this.mask;
      long var5 = this.lpConsumerIndex();

      for (int var7 = 0; var7 < var2; var7++) {
         long var8 = var5 + var7;
         int var10 = AtomicQueueUtil.calcCircularRefElementOffset(var8, var4);
         Object var11 = AtomicQueueUtil.lvRefElement(var3, var10);
         if (null == var11) {
            return var7;
         }

         AtomicQueueUtil.soRefElement(var3, var10, null);
         this.soConsumerIndex(var8 + 1L);
         var1.accept(var11);
      }

      return var2;
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

      AtomicReferenceArray var3 = this.buffer;
      int var4 = this.mask;
      int var5 = this.lookAheadStep;
      long var6 = this.lpProducerIndex();

      for (int var8 = 0; var8 < var2; var8++) {
         long var9 = var6 + var8;
         int var11 = AtomicQueueUtil.calcCircularRefElementOffset(var9 + var5, var4);
         if (null != AtomicQueueUtil.lvRefElement(var3, var11)) {
            int var15 = AtomicQueueUtil.calcCircularRefElementOffset(var9, var4);
            if (null != AtomicQueueUtil.lvRefElement(var3, var15)) {
               return var8;
            }

            AtomicQueueUtil.soRefElement(var3, var15, var1.get());
            this.soProducerIndex(var9 + 1L);
         } else {
            int var12 = Math.min(var5, var2 - var8);

            for (int var13 = 0; var13 < var12; var13++) {
               int var14 = AtomicQueueUtil.calcCircularRefElementOffset(var9 + var13, var4);
               AtomicQueueUtil.soRefElement(var3, var14, var1.get());
               this.soProducerIndex(var9 + var13 + 1L);
            }

            var8 += var12 - 1;
         }
      }

      return var2;
   }

   @Override
   public void drain(MessagePassingQueue.Consumer<E> var1, MessagePassingQueue.WaitStrategy var2, MessagePassingQueue.ExitCondition var3) {
      if (null == var1) {
         throw new IllegalArgumentException("c is null");
      }

      if (null == var2) {
         throw new IllegalArgumentException("wait is null");
      }

      if (null == var3) {
         throw new IllegalArgumentException("exit condition is null");
      }

      AtomicReferenceArray var4 = this.buffer;
      int var5 = this.mask;
      long var6 = this.lpConsumerIndex();
      int var8 = 0;

      while (var3.keepRunning()) {
         for (int var9 = 0; var9 < 4096; var9++) {
            int var10 = AtomicQueueUtil.calcCircularRefElementOffset(var6, var5);
            Object var11 = AtomicQueueUtil.lvRefElement(var4, var10);
            if (null == var11) {
               var8 = var2.idle(var8);
            } else {
               var6++;
               var8 = 0;
               AtomicQueueUtil.soRefElement(var4, var10, null);
               this.soConsumerIndex(var6);
               var1.accept(var11);
            }
         }
      }
   }

   @Override
   public void fill(MessagePassingQueue.Supplier<E> var1, MessagePassingQueue.WaitStrategy var2, MessagePassingQueue.ExitCondition var3) {
      if (null == var2) {
         throw new IllegalArgumentException("waiter is null");
      }

      if (null == var3) {
         throw new IllegalArgumentException("exit condition is null");
      }

      if (null == var1) {
         throw new IllegalArgumentException("supplier is null");
      }

      AtomicReferenceArray var4 = this.buffer;
      int var5 = this.mask;
      int var6 = this.lookAheadStep;
      long var7 = this.lpProducerIndex();
      int var9 = 0;

      while (var3.keepRunning()) {
         int var10 = AtomicQueueUtil.calcCircularRefElementOffset(var7 + var6, var5);
         if (null == AtomicQueueUtil.lvRefElement(var4, var10)) {
            for (int var13 = 0; var13 < var6; var13++) {
               int var12 = AtomicQueueUtil.calcCircularRefElementOffset(var7, var5);
               var7++;
               AtomicQueueUtil.soRefElement(var4, var12, var1.get());
               this.soProducerIndex(var7);
            }
         } else {
            int var11 = AtomicQueueUtil.calcCircularRefElementOffset(var7, var5);
            if (null != AtomicQueueUtil.lvRefElement(var4, var11)) {
               var9 = var2.idle(var9);
            } else {
               var7++;
               var9 = 0;
               AtomicQueueUtil.soRefElement(var4, var11, var1.get());
               this.soProducerIndex(var7);
            }
         }
      }
   }
}
