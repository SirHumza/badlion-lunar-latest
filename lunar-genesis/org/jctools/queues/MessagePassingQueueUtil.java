package org.jctools.queues;

import org.jctools.util.PortableJvmInfo;

public final class MessagePassingQueueUtil {
   public static <E> int drain(MessagePassingQueue<E> var0, MessagePassingQueue.Consumer<E> var1, int var2) {
      if (null == var1) {
         throw new IllegalArgumentException("c is null");
      }

      if (var2 < 0) {
         throw new IllegalArgumentException("limit is negative: " + var2);
      }

      if (var2 == 0) {
         return 0;
      }

      Object var3;
      int var4;
      for (var4 = 0; var4 < var2 && (var3 = var0.relaxedPoll()) != null; var4++) {
         var1.accept(var3);
      }

      return var4;
   }

   public static <E> int drain(MessagePassingQueue<E> var0, MessagePassingQueue.Consumer<E> var1) {
      if (null == var1) {
         throw new IllegalArgumentException("c is null");
      }

      int var3 = 0;

      Object var2;
      while ((var2 = var0.relaxedPoll()) != null) {
         var3++;
         var1.accept(var2);
      }

      return var3;
   }

   public static <E> void drain(
      MessagePassingQueue<E> var0, MessagePassingQueue.Consumer<E> var1, MessagePassingQueue.WaitStrategy var2, MessagePassingQueue.ExitCondition var3
   ) {
      if (null == var1) {
         throw new IllegalArgumentException("c is null");
      }

      if (null == var2) {
         throw new IllegalArgumentException("wait is null");
      }

      if (null == var3) {
         throw new IllegalArgumentException("exit condition is null");
      }

      int var4 = 0;

      while (var3.keepRunning()) {
         Object var5 = var0.relaxedPoll();
         if (var5 == null) {
            var4 = var2.idle(var4);
         } else {
            var4 = 0;
            var1.accept(var5);
         }
      }
   }

   public static <E> void fill(
      MessagePassingQueue<E> var0, MessagePassingQueue.Supplier<E> var1, MessagePassingQueue.WaitStrategy var2, MessagePassingQueue.ExitCondition var3
   ) {
      if (null == var2) {
         throw new IllegalArgumentException("waiter is null");
      }

      if (null == var3) {
         throw new IllegalArgumentException("exit condition is null");
      }

      int var4 = 0;

      while (var3.keepRunning()) {
         if (var0.fill(var1, PortableJvmInfo.RECOMENDED_OFFER_BATCH) == 0) {
            var4 = var2.idle(var4);
         } else {
            var4 = 0;
         }
      }
   }

   public static <E> int fillBounded(MessagePassingQueue<E> var0, MessagePassingQueue.Supplier<E> var1) {
      return fillInBatchesToLimit(var0, var1, PortableJvmInfo.RECOMENDED_OFFER_BATCH, var0.capacity());
   }

   public static <E> int fillInBatchesToLimit(MessagePassingQueue<E> var0, MessagePassingQueue.Supplier<E> var1, int var2, int var3) {
      long var4 = 0L;

      do {
         int var6 = var0.fill(var1, var2);
         if (var6 == 0) {
            return (int)var4;
         }

         var4 += var6;
      } while (var4 <= var3);

      return (int)var4;
   }

   public static <E> int fillUnbounded(MessagePassingQueue<E> var0, MessagePassingQueue.Supplier<E> var1) {
      return fillInBatchesToLimit(var0, var1, PortableJvmInfo.RECOMENDED_OFFER_BATCH, 4096);
   }
}
