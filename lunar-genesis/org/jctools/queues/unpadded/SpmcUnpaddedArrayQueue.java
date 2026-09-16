package org.jctools.queues.unpadded;

import org.jctools.queues.MessagePassingQueue;
import org.jctools.queues.MessagePassingQueueUtil;
import org.jctools.util.UnsafeRefArrayAccess;

public class SpmcUnpaddedArrayQueue<E> extends SpmcUnpaddedArrayQueueL3Pad<E> {
   public SpmcUnpaddedArrayQueue(int var1) {
      super(var1);
   }

   @Override
   public boolean offer(E var1) {
      if (null == var1) {
         throw new NullPointerException();
      }

      Object[] var2 = this.buffer;
      long var3 = this.mask;
      long var5 = this.lvProducerIndex();
      long var7 = UnsafeRefArrayAccess.calcCircularRefElementOffset(var5, var3);
      if (null != UnsafeRefArrayAccess.lvRefElement(var2, var7)) {
         long var9 = var5 - this.lvConsumerIndex();
         if (var9 > var3) {
            return false;
         }

         while (null != UnsafeRefArrayAccess.lvRefElement(var2, var7)) {
         }
      }

      UnsafeRefArrayAccess.soRefElement(var2, var7, var1);
      this.soProducerIndex(var5 + 1L);
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

   private E removeElement(E[] var1, long var2, long var4) {
      long var6 = UnsafeRefArrayAccess.calcCircularRefElementOffset(var2, var4);
      Object var8 = UnsafeRefArrayAccess.lpRefElement(var1, var6);
      UnsafeRefArrayAccess.soRefElement(var1, var6, null);
      return (E)var8;
   }

   @Override
   public E peek() {
      Object[] var1 = this.buffer;
      long var2 = this.mask;
      long var4 = this.lvProducerIndexCache();
      long var8 = this.lvConsumerIndex();

      long var6;
      Object var10;
      do {
         var6 = var8;
         if (var6 >= var4) {
            long var11 = this.lvProducerIndex();
            if (var6 >= var11) {
               return null;
            }

            var4 = var11;
            this.svProducerIndexCache(var11);
         }

         var10 = UnsafeRefArrayAccess.lvRefElement(var1, UnsafeRefArrayAccess.calcCircularRefElementOffset(var6, var2));
         var8 = this.lvConsumerIndex();
      } while (null == var10 || var8 != var6);

      return (E)var10;
   }

   @Override
   public boolean relaxedOffer(E var1) {
      if (null == var1) {
         throw new NullPointerException("Null is not a valid element");
      }

      Object[] var2 = this.buffer;
      long var3 = this.mask;
      long var5 = this.lpProducerIndex();
      long var7 = UnsafeRefArrayAccess.calcCircularRefElementOffset(var5, var3);
      if (null != UnsafeRefArrayAccess.lvRefElement(var2, var7)) {
         return false;
      }

      UnsafeRefArrayAccess.soRefElement(var2, var7, var1);
      this.soProducerIndex(var5 + 1L);
      return true;
   }

   @Override
   public E relaxedPoll() {
      return this.poll();
   }

   @Override
   public E relaxedPeek() {
      Object[] var1 = this.buffer;
      long var2 = this.mask;
      long var6 = this.lvConsumerIndex();

      long var4;
      Object var8;
      do {
         var4 = var6;
         var8 = UnsafeRefArrayAccess.lvRefElement(var1, UnsafeRefArrayAccess.calcCircularRefElementOffset(var4, var2));
         var6 = this.lvConsumerIndex();
      } while (var6 != var4);

      return (E)var8;
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

      Object[] var3 = this.buffer;
      long var4 = this.mask;
      long var6 = this.lvProducerIndexCache();
      int var8 = 0;

      long var9;
      do {
         var9 = this.lvConsumerIndex();
         if (var9 >= var6) {
            long var11 = this.lvProducerIndex();
            if (var9 >= var11) {
               return 0;
            }

            var6 = var11;
            this.svProducerIndexCache(var11);
         }

         int var14 = (int)(var6 - var9);
         var8 = Math.min(var14, var2);
      } while (!this.casConsumerIndex(var9, var9 + var8));

      for (int var15 = 0; var15 < var8; var15++) {
         var1.accept(this.removeElement((E[])var3, var9 + var15, var4));
      }

      return var8;
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

      Object[] var3 = this.buffer;
      long var4 = this.mask;
      long var6 = this.lpProducerIndex();

      for (int var8 = 0; var8 < var2; var8++) {
         long var9 = UnsafeRefArrayAccess.calcCircularRefElementOffset(var6, var4);
         if (null != UnsafeRefArrayAccess.lvRefElement(var3, var9)) {
            return var8;
         }

         var6++;
         UnsafeRefArrayAccess.soRefElement(var3, var9, var1.get());
         this.soProducerIndex(var6);
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
