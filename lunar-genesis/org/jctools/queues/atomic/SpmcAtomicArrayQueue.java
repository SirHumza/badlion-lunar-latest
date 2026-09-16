package org.jctools.queues.atomic;

import java.util.concurrent.atomic.AtomicReferenceArray;
import org.jctools.queues.MessagePassingQueue;
import org.jctools.queues.MessagePassingQueueUtil;

public class SpmcAtomicArrayQueue<E> extends SpmcAtomicArrayQueueL3Pad<E> {
   public SpmcAtomicArrayQueue(int var1) {
      super(var1);
   }

   @Override
   public boolean offer(E var1) {
      if (null == var1) {
         throw new NullPointerException();
      }

      AtomicReferenceArray var2 = this.buffer;
      int var3 = this.mask;
      long var4 = this.lvProducerIndex();
      int var6 = AtomicQueueUtil.calcCircularRefElementOffset(var4, var3);
      if (null != AtomicQueueUtil.lvRefElement(var2, var6)) {
         long var7 = var4 - this.lvConsumerIndex();
         if (var7 > var3) {
            return false;
         }

         while (null != AtomicQueueUtil.lvRefElement(var2, var6)) {
         }
      }

      AtomicQueueUtil.soRefElement(var2, var6, var1);
      this.soProducerIndex(var4 + 1L);
      return true;
   }

   @Override
   public E poll() {
      long var3 = this.lvProducerIndexCache();

      long var1;
      do {
         var1 = this.lvConsumerIndex();
         if (var1 >= var3) {
            long var5 = this.lvProducerIndex();
            if (var1 >= var5) {
               return null;
            }

            var3 = var5;
            this.svProducerIndexCache(var5);
         }
      } while (!this.casConsumerIndex(var1, var1 + 1L));

      return this.removeElement(this.buffer, var1, this.mask);
   }

   private E removeElement(AtomicReferenceArray<E> var1, long var2, int var4) {
      int var5 = AtomicQueueUtil.calcCircularRefElementOffset(var2, var4);
      Object var6 = AtomicQueueUtil.lpRefElement(var1, var5);
      AtomicQueueUtil.soRefElement(var1, var5, null);
      return (E)var6;
   }

   @Override
   public E peek() {
      AtomicReferenceArray var1 = this.buffer;
      int var2 = this.mask;
      long var3 = this.lvProducerIndexCache();
      long var7 = this.lvConsumerIndex();

      long var5;
      Object var9;
      do {
         var5 = var7;
         if (var5 >= var3) {
            long var10 = this.lvProducerIndex();
            if (var5 >= var10) {
               return null;
            }

            var3 = var10;
            this.svProducerIndexCache(var10);
         }

         var9 = AtomicQueueUtil.lvRefElement(var1, AtomicQueueUtil.calcCircularRefElementOffset(var5, var2));
         var7 = this.lvConsumerIndex();
      } while (null == var9 || var7 != var5);

      return (E)var9;
   }

   @Override
   public boolean relaxedOffer(E var1) {
      if (null == var1) {
         throw new NullPointerException("Null is not a valid element");
      }

      AtomicReferenceArray var2 = this.buffer;
      int var3 = this.mask;
      long var4 = this.lpProducerIndex();
      int var6 = AtomicQueueUtil.calcCircularRefElementOffset(var4, var3);
      if (null != AtomicQueueUtil.lvRefElement(var2, var6)) {
         return false;
      }

      AtomicQueueUtil.soRefElement(var2, var6, var1);
      this.soProducerIndex(var4 + 1L);
      return true;
   }

   @Override
   public E relaxedPoll() {
      return this.poll();
   }

   @Override
   public E relaxedPeek() {
      AtomicReferenceArray var1 = this.buffer;
      int var2 = this.mask;
      long var5 = this.lvConsumerIndex();

      long var3;
      Object var7;
      do {
         var3 = var5;
         var7 = AtomicQueueUtil.lvRefElement(var1, AtomicQueueUtil.calcCircularRefElementOffset(var3, var2));
         var5 = this.lvConsumerIndex();
      } while (var5 != var3);

      return (E)var7;
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
      long var5 = this.lvProducerIndexCache();
      int var7 = 0;

      long var8;
      do {
         var8 = this.lvConsumerIndex();
         if (var8 >= var5) {
            long var10 = this.lvProducerIndex();
            if (var8 >= var10) {
               return 0;
            }

            var5 = var10;
            this.svProducerIndexCache(var10);
         }

         int var13 = (int)(var5 - var8);
         var7 = Math.min(var13, var2);
      } while (!this.casConsumerIndex(var8, var8 + var7));

      for (int var14 = 0; var14 < var7; var14++) {
         var1.accept(this.removeElement(var3, var8 + var14, var4));
      }

      return var7;
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
      long var5 = this.lpProducerIndex();

      for (int var7 = 0; var7 < var2; var7++) {
         int var8 = AtomicQueueUtil.calcCircularRefElementOffset(var5, var4);
         if (null != AtomicQueueUtil.lvRefElement(var3, var8)) {
            return var7;
         }

         var5++;
         AtomicQueueUtil.soRefElement(var3, var8, var1.get());
         this.soProducerIndex(var5);
      }

      return var2;
   }

   @Override
   public int drain(MessagePassingQueue.Consumer<E> var1) {
      return MessagePassingQueueUtil.drain(this, var1);
   }

   @Override
   public int fill(MessagePassingQueue.Supplier<E> var1) {
      return this.fill(var1, this.capacity());
   }

   @Override
   public void drain(MessagePassingQueue.Consumer<E> var1, MessagePassingQueue.WaitStrategy var2, MessagePassingQueue.ExitCondition var3) {
      MessagePassingQueueUtil.drain(this, var1, var2, var3);
   }

   @Override
   public void fill(MessagePassingQueue.Supplier<E> var1, MessagePassingQueue.WaitStrategy var2, MessagePassingQueue.ExitCondition var3) {
      MessagePassingQueueUtil.fill(this, var1, var2, var3);
   }
}
