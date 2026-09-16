package org.jctools.queues.atomic;

import org.jctools.queues.MessagePassingQueue;
import org.jctools.queues.MessagePassingQueueUtil;

public class MpscLinkedAtomicQueue<E> extends BaseLinkedAtomicQueue<E> {
   public MpscLinkedAtomicQueue() {
      LinkedQueueAtomicNode var1 = this.newNode();
      this.spConsumerNode(var1);
      this.xchgProducerNode(var1);
   }

   @Override
   public boolean offer(E var1) {
      if (null == var1) {
         throw new NullPointerException();
      }

      LinkedQueueAtomicNode var2 = this.newNode((E)var1);
      LinkedQueueAtomicNode var3 = this.xchgProducerNode(var2);
      var3.soNext(var2);
      return true;
   }

   @Override
   public boolean remove(Object var1) {
      if (null == var1) {
         return false;
      }

      LinkedQueueAtomicNode var2 = this.lpConsumerNode();
      LinkedQueueAtomicNode var3 = var2;

      for (LinkedQueueAtomicNode var4 = this.getNextConsumerNode(var2); var4 != null; var4 = this.getNextConsumerNode(var4)) {
         if (var1.equals(var4.lpValue())) {
            LinkedQueueAtomicNode var5 = this.getNextConsumerNode(var4);
            if (var5 != null) {
               var3.soNext(var5);
            } else {
               var3.soNext(null);
               if (!this.casProducerNode(var4, var3)) {
                  var5 = this.spinWaitForNextNode(var4);
                  var3.soNext(var5);
               }
            }

            var4.soNext(null);
            var4.spValue(null);
            return true;
         }

         var3 = var4;
      }

      return false;
   }

   @Override
   public int fill(MessagePassingQueue.Supplier<E> var1) {
      return MessagePassingQueueUtil.fillUnbounded(this, var1);
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

      LinkedQueueAtomicNode var3 = this.newNode((E)var1.get());
      LinkedQueueAtomicNode var4 = var3;

      for (int var5 = 1; var5 < var2; var5++) {
         LinkedQueueAtomicNode var6 = this.newNode((E)var1.get());
         var3.spNext(var6);
         var3 = var6;
      }

      LinkedQueueAtomicNode var7 = this.xchgProducerNode(var3);
      var7.soNext(var4);
      return var2;
   }

   @Override
   public void fill(MessagePassingQueue.Supplier<E> var1, MessagePassingQueue.WaitStrategy var2, MessagePassingQueue.ExitCondition var3) {
      MessagePassingQueueUtil.fill(this, var1, var2, var3);
   }

   private LinkedQueueAtomicNode<E> getNextConsumerNode(LinkedQueueAtomicNode<E> var1) {
      LinkedQueueAtomicNode var2 = var1.lvNext();
      if (var2 == null && var1 != this.lvProducerNode()) {
         var2 = this.spinWaitForNextNode(var1);
      }

      return var2;
   }
}
