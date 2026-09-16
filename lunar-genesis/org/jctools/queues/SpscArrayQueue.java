package org.jctools.queues;

import org.jctools.util.UnsafeRefArrayAccess;

public class SpscArrayQueue<E> extends SpscArrayQueueL3Pad<E> {
   public SpscArrayQueue(int var1) {
      super(Math.max(var1, 4));
   }

   @Override
   public boolean offer(E var1) {
      if (null == var1) {
         throw new NullPointerException();
      }

      Object[] var2 = this.buffer;
      long var3 = this.mask;
      long var5 = this.lpProducerIndex();
      if (var5 >= this.producerLimit && !this.offerSlowPath((E[])var2, var3, var5)) {
         return false;
      }

      long var7 = UnsafeRefArrayAccess.calcCircularRefElementOffset(var5, var3);
      UnsafeRefArrayAccess.soRefElement(var2, var7, var1);
      this.soProducerIndex(var5 + 1L);
      return true;
   }

   private boolean offerSlowPath(E[] var1, long var2, long var4) {
      int var6 = this.lookAheadStep;
      if (null == UnsafeRefArrayAccess.lvRefElement(var1, UnsafeRefArrayAccess.calcCircularRefElementOffset(var4 + var6, var2))) {
         this.producerLimit = var4 + var6;
      } else {
         long var7 = UnsafeRefArrayAccess.calcCircularRefElementOffset(var4, var2);
         if (null != UnsafeRefArrayAccess.lvRefElement(var1, var7)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public E poll() {
      long var1 = this.lpConsumerIndex();
      long var3 = UnsafeRefArrayAccess.calcCircularRefElementOffset(var1, this.mask);
      Object[] var5 = this.buffer;
      Object var6 = UnsafeRefArrayAccess.lvRefElement(var5, var3);
      if (null == var6) {
         return null;
      }

      UnsafeRefArrayAccess.soRefElement(var5, var3, null);
      this.soConsumerIndex(var1 + 1L);
      return (E)var6;
   }

   @Override
   public E peek() {
      return UnsafeRefArrayAccess.lvRefElement(this.buffer, UnsafeRefArrayAccess.calcCircularRefElementOffset(this.lpConsumerIndex(), this.mask));
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

      Object[] var3 = this.buffer;
      long var4 = this.mask;
      long var6 = this.lpConsumerIndex();

      for (int var8 = 0; var8 < var2; var8++) {
         long var9 = var6 + var8;
         long var11 = UnsafeRefArrayAccess.calcCircularRefElementOffset(var9, var4);
         Object var13 = UnsafeRefArrayAccess.lvRefElement(var3, var11);
         if (null == var13) {
            return var8;
         }

         UnsafeRefArrayAccess.soRefElement(var3, var11, null);
         this.soConsumerIndex(var9 + 1L);
         var1.accept(var13);
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

      Object[] var3 = this.buffer;
      long var4 = this.mask;
      int var6 = this.lookAheadStep;
      long var7 = this.lpProducerIndex();

      for (int var9 = 0; var9 < var2; var9++) {
         long var10 = var7 + var9;
         long var12 = UnsafeRefArrayAccess.calcCircularRefElementOffset(var10 + var6, var4);
         if (null != UnsafeRefArrayAccess.lvRefElement(var3, var12)) {
            long var18 = UnsafeRefArrayAccess.calcCircularRefElementOffset(var10, var4);
            if (null != UnsafeRefArrayAccess.lvRefElement(var3, var18)) {
               return var9;
            }

            UnsafeRefArrayAccess.soRefElement(var3, var18, var1.get());
            this.soProducerIndex(var10 + 1L);
         } else {
            int var14 = Math.min(var6, var2 - var9);

            for (int var15 = 0; var15 < var14; var15++) {
               long var16 = UnsafeRefArrayAccess.calcCircularRefElementOffset(var10 + var15, var4);
               UnsafeRefArrayAccess.soRefElement(var3, var16, var1.get());
               this.soProducerIndex(var10 + var15 + 1L);
            }

            var9 += var14 - 1;
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

      Object[] var4 = this.buffer;
      long var5 = this.mask;
      long var7 = this.lpConsumerIndex();
      int var9 = 0;

      while (var3.keepRunning()) {
         for (int var10 = 0; var10 < 4096; var10++) {
            long var11 = UnsafeRefArrayAccess.calcCircularRefElementOffset(var7, var5);
            Object var13 = UnsafeRefArrayAccess.lvRefElement(var4, var11);
            if (null == var13) {
               var9 = var2.idle(var9);
            } else {
               var7++;
               var9 = 0;
               UnsafeRefArrayAccess.soRefElement(var4, var11, null);
               this.soConsumerIndex(var7);
               var1.accept(var13);
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

      Object[] var4 = this.buffer;
      long var5 = this.mask;
      int var7 = this.lookAheadStep;
      long var8 = this.lpProducerIndex();
      int var10 = 0;

      while (var3.keepRunning()) {
         long var11 = UnsafeRefArrayAccess.calcCircularRefElementOffset(var8 + var7, var5);
         if (null == UnsafeRefArrayAccess.lvRefElement(var4, var11)) {
            for (int var16 = 0; var16 < var7; var16++) {
               long var14 = UnsafeRefArrayAccess.calcCircularRefElementOffset(var8, var5);
               var8++;
               UnsafeRefArrayAccess.soRefElement(var4, var14, var1.get());
               this.soProducerIndex(var8);
            }
         } else {
            long var13 = UnsafeRefArrayAccess.calcCircularRefElementOffset(var8, var5);
            if (null != UnsafeRefArrayAccess.lvRefElement(var4, var13)) {
               var10 = var2.idle(var10);
            } else {
               var8++;
               var10 = 0;
               UnsafeRefArrayAccess.soRefElement(var4, var13, var1.get());
               this.soProducerIndex(var8);
            }
         }
      }
   }
}
