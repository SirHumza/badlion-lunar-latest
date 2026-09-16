package org.jctools.queues;

import java.util.Iterator;
import org.jctools.util.PortableJvmInfo;

public class MpscCompoundQueue<E> extends MpscCompoundQueueConsumerQueueIndex<E> {
   byte b000;
   byte b001;
   byte b002;
   byte b003;
   byte b004;
   byte b005;
   byte b006;
   byte b007;
   byte b010;
   byte b011;
   byte b012;
   byte b013;
   byte b014;
   byte b015;
   byte b016;
   byte b017;
   byte b020;
   byte b021;
   byte b022;
   byte b023;
   byte b024;
   byte b025;
   byte b026;
   byte b027;
   byte b030;
   byte b031;
   byte b032;
   byte b033;
   byte b034;
   byte b035;
   byte b036;
   byte b037;
   byte b040;
   byte b041;
   byte b042;
   byte b043;
   byte b044;
   byte b045;
   byte b046;
   byte b047;
   byte b050;
   byte b051;
   byte b052;
   byte b053;
   byte b054;
   byte b055;
   byte b056;
   byte b057;
   byte b060;
   byte b061;
   byte b062;
   byte b063;
   byte b064;
   byte b065;
   byte b066;
   byte b067;
   byte b070;
   byte b071;
   byte b072;
   byte b073;
   byte b074;
   byte b075;
   byte b076;
   byte b077;
   byte b100;
   byte b101;
   byte b102;
   byte b103;
   byte b104;
   byte b105;
   byte b106;
   byte b107;
   byte b110;
   byte b111;
   byte b112;
   byte b113;
   byte b114;
   byte b115;
   byte b116;
   byte b117;
   byte b120;
   byte b121;
   byte b122;
   byte b123;
   byte b124;
   byte b125;
   byte b126;
   byte b127;
   byte b130;
   byte b131;
   byte b132;
   byte b133;
   byte b134;
   byte b135;
   byte b136;
   byte b137;
   byte b140;
   byte b141;
   byte b142;
   byte b143;
   byte b144;
   byte b145;
   byte b146;
   byte b147;
   byte b150;
   byte b151;
   byte b152;
   byte b153;
   byte b154;
   byte b155;
   byte b156;
   byte b157;
   byte b160;
   byte b161;
   byte b162;
   byte b163;
   byte b164;
   byte b165;
   byte b166;
   byte b167;
   byte b170;
   byte b171;
   byte b172;
   byte b173;
   byte b174;
   byte b175;
   byte b176;
   byte b177;

   public MpscCompoundQueue(int var1) {
      this(var1, PortableJvmInfo.CPUs);
   }

   public MpscCompoundQueue(int var1, int var2) {
      super(var1, var2);
   }

   @Override
   public boolean offer(E var1) {
      if (null == var1) {
         throw new NullPointerException();
      }

      int var2 = this.parallelQueuesMask;
      int var3 = (int)(Thread.currentThread().getId() & var2);
      MpscArrayQueue[] var4 = this.queues;
      return var4[var3].offer(var1) ? true : this.slowOffer(var4, var2, var3 + 1, (E)var1);
   }

   private boolean slowOffer(MpscArrayQueue<E>[] var1, int var2, int var3, E var4) {
      int var5 = var2 + 1;
      int var6 = var3 + var5;

      int var7;
      do {
         var7 = 0;

         for (int var8 = var3; var8 < var6; var8++) {
            int var9 = var1[var8 & var2].failFastOffer(var4);
            if (var9 == 0) {
               return true;
            }

            var7 += var9;
         }
      } while (var7 != var5);

      return false;
   }

   @Override
   public E poll() {
      int var1 = this.consumerQueueIndex & this.parallelQueuesMask;
      int var2 = var1 + this.parallelQueues;
      Object var3 = null;

      while (var1 < var2) {
         var3 = this.queues[var1 & this.parallelQueuesMask].poll();
         if (var3 != null) {
            break;
         }

         var1++;
      }

      this.consumerQueueIndex = var1;
      return (E)var3;
   }

   @Override
   public E peek() {
      int var1 = this.consumerQueueIndex & this.parallelQueuesMask;
      int var2 = var1 + this.parallelQueues;
      Object var3 = null;

      while (var1 < var2) {
         var3 = this.queues[var1 & this.parallelQueuesMask].peek();
         if (var3 != null) {
            break;
         }

         var1++;
      }

      this.consumerQueueIndex = var1;
      return (E)var3;
   }

   @Override
   public int size() {
      int var1 = 0;

      for (MpscArrayQueue var5 : this.queues) {
         var1 += var5.size();
      }

      return var1;
   }

   @Override
   public Iterator<E> iterator() {
      throw new UnsupportedOperationException();
   }

   @Override
   public String toString() {
      return this.getClass().getName();
   }

   @Override
   public boolean relaxedOffer(E var1) {
      if (null == var1) {
         throw new NullPointerException();
      }

      int var2 = this.parallelQueuesMask;
      int var3 = (int)(Thread.currentThread().getId() & var2);
      MpscArrayQueue[] var4 = this.queues;
      if (var4[var3].failFastOffer(var1) == 0) {
         return true;
      }

      for (int var5 = var3 + 1; var5 < var3 + var2 + 1; var5++) {
         if (var4[var5 & var2].failFastOffer(var1) == 0) {
            return true;
         }
      }

      return false;
   }

   @Override
   public E relaxedPoll() {
      int var1 = this.consumerQueueIndex & this.parallelQueuesMask;
      int var2 = var1 + this.parallelQueues;
      Object var3 = null;

      while (var1 < var2) {
         var3 = this.queues[var1 & this.parallelQueuesMask].relaxedPoll();
         if (var3 != null) {
            break;
         }

         var1++;
      }

      this.consumerQueueIndex = var1;
      return (E)var3;
   }

   @Override
   public E relaxedPeek() {
      int var1 = this.consumerQueueIndex & this.parallelQueuesMask;
      int var2 = var1 + this.parallelQueues;
      Object var3 = null;

      while (var1 < var2) {
         var3 = this.queues[var1 & this.parallelQueuesMask].relaxedPeek();
         if (var3 != null) {
            break;
         }

         var1++;
      }

      this.consumerQueueIndex = var1;
      return (E)var3;
   }

   @Override
   public int capacity() {
      return this.queues.length * this.queues[0].capacity();
   }

   @Override
   public int drain(MessagePassingQueue.Consumer<E> var1) {
      int var2 = this.capacity();
      return this.drain(var1, var2);
   }

   @Override
   public int fill(MessagePassingQueue.Supplier<E> var1) {
      return MessagePassingQueueUtil.fillBounded(this, var1);
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

      int var3 = this.parallelQueuesMask;
      int var4 = (int)(Thread.currentThread().getId() & var3);
      MpscArrayQueue[] var5 = this.queues;
      int var6 = var5[var4].fill(var1, var2);
      if (var6 == var2) {
         return var2;
      }

      for (int var7 = var4 + 1; var7 < var4 + var3 + 1; var7++) {
         var6 += var5[var7 & var3].fill(var1, var2 - var6);
         if (var6 == var2) {
            return var2;
         }
      }

      return var6;
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
