package org.jctools.queues;

public final class IndexedQueueSizeUtil {
   public static final int PLAIN_DIVISOR = 1;
   public static final int IGNORE_PARITY_DIVISOR = 2;

   public static int size(IndexedQueueSizeUtil.IndexedQueue var0, int var1) {
      long var2 = var0.lvConsumerIndex();

      long var6;
      long var8;
      do {
         var6 = var2;
         var8 = var0.lvProducerIndex();
         var2 = var0.lvConsumerIndex();
      } while (var6 != var2);

      long var4 = (var8 - var2) / var1;
      return sanitizedSize(var0.capacity(), var4);
   }

   public static int sanitizedSize(int var0, long var1) {
      if (var1 < 0L) {
         return 0;
      } else if (var0 != -1 && var1 > var0) {
         return var0;
      } else {
         return var1 > 2147483647L ? Integer.MAX_VALUE : (int)var1;
      }
   }

   public static boolean isEmpty(IndexedQueueSizeUtil.IndexedQueue var0) {
      return var0.lvConsumerIndex() >= var0.lvProducerIndex();
   }

   public interface IndexedQueue {
      long lvConsumerIndex();

      long lvProducerIndex();

      int capacity();
   }
}
